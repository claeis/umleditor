package ch.ehi.umleditor.application;

/* 
 *This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
import ch.ehi.uml1_4.foundation.datatypes.*;
import ch.ehi.uml1_4.implementation.*;
import ch.softenvironment.util.*;
/**
 * Convert Multiplicity into Strings and vice versa.
 * Manage different Cardinality's.
 *
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:39 $
 */
public abstract class MultiplicityConverter {
	// acc. ti UML Specification V1.4
	private final static String RANGE_SEPARATOR = "..";
	private final static String EMPTY_RANGE = "";
	private final static String RANGE_ZERO = "0";
	private final static String RANGE_ONE = "1";
	private final static String INFINITE_RANGE = "*";
	private final static String MULTIPLE_RANGES_SEPARATOR = ",";
/**
 * Convert String-Cardinality into long-Cardinality.
 */
private static long convertString(String rangeValue) {
	if (rangeValue.indexOf(INFINITE_RANGE) >= 0) {
		// contains "*"
		return Long.MAX_VALUE;
	} else {
		return ((new Long(rangeValue.trim())).longValue());
	}
}
/**
 * Convert char-Cardinality into int-Cardinality.
 * Assumes from-literal with length <= 1 Character.
 */
private static String convertValue(long value) {
	if (value == Long.MAX_VALUE) {
		return INFINITE_RANGE;
	} else {
		return (new Long(value)).toString();
	}
}
/**
 * Create a mulitplicity instance.
 * @see getCardinalities()
 * @param range String (for e.g. "1..*" or "0" or "0,1,5..*")
 */
public static Multiplicity createMultiplicity(String range) {
	if ((range == null) || (range.trim().length() == 0)) {
		// no range
		return null;
	} else {
		try {
			Multiplicity multiplicity = new UmlMultiplicity();
			int index = 0;
			while (index < range.length()) {
				int endOfRange = range.indexOf(MULTIPLE_RANGES_SEPARATOR, index);
				String subRange = null;
				if (endOfRange > 0) {
					// comma separated multi-range
					subRange = range.substring(index, endOfRange);
					index = endOfRange + 1;
				} else {
					// single range
					subRange = range.substring(index, range.length());
					index = range.length();
				}

				multiplicity.addRange(parseRange(subRange));
			}		
			return multiplicity;
		} catch(NumberFormatException e) {
			throw new DeveloperException(MultiplicityConverter.class, "getRange(Multiplicity)", "Gültige Formatbeispiele:\n- 0\n- 4..*\n- 1,5..9,27..*", "Eingabefehler");
		}
	}
}
/**
 * Return a set of Cardinality-Ranges.
 */
public static Multiplicity get0toN() {
	MultiplicityRange multiplicityRange = new UmlMultiplicityRange();
	multiplicityRange.setLower(0);
	multiplicityRange.setUpper(Long.MAX_VALUE);
	Multiplicity multiplicity = new UmlMultiplicity();
	multiplicity.addRange(multiplicityRange);
	return multiplicity;
}
/**
 * Return a set of Cardinality-Ranges.
 */
public static java.util.Vector getDefaultCardinalities() {
	java.util.Vector cardinalities = new java.util.Vector(7);

	cardinalities.add(EMPTY_RANGE);
	cardinalities.add(RANGE_ZERO);
	cardinalities.add(RANGE_ONE);
	cardinalities.add(RANGE_ZERO + RANGE_SEPARATOR + INFINITE_RANGE);
	cardinalities.add(RANGE_ONE + RANGE_SEPARATOR + INFINITE_RANGE);
	cardinalities.add(RANGE_ZERO + RANGE_SEPARATOR + RANGE_ONE);
	cardinalities.add(INFINITE_RANGE);

	return cardinalities;
}
/**
 * Return multiplicity Range as String.
 */
public static String getRange(Multiplicity multiplicity) {
	if (multiplicity == null) {
		// empty Range
		return EMPTY_RANGE;
	} else {
		java.util.Iterator iterator = multiplicity.iteratorRange();
		String range = EMPTY_RANGE;
		while (iterator.hasNext()) {
			MultiplicityRange multiplicityRange = (UmlMultiplicityRange)iterator.next();
			long from = multiplicityRange.getLower();
			long to = multiplicityRange.getUpper();
			if (range.length() > 0) {
				// create multi range "1..3, 7..8"
				range = range + MULTIPLE_RANGES_SEPARATOR;
			}
			if (from == to) {
				range = range + convertValue(from);
			} else {
				range = range + convertValue(from) + RANGE_SEPARATOR + convertValue(to);
			}
		}
		return range;
	}
}
/**
 * @return whether Cardinality is 1 or greater than 1 is given.
 */
public static boolean isMandatory(Multiplicity m) {
	String range = getRange(m);
	return ((range.indexOf(RANGE_ZERO) < 0) && 
		(!range.equals(EMPTY_RANGE)) &&
		(!range.equals(INFINITE_RANGE)));
}
/**
 * @return comparison of two Multiplicities.
 */
public static boolean isSame(Multiplicity m1, Multiplicity m2) {
	if ((m1 == null) && (m2 == null)) {
		return true;
	}
	return getRange(m1).equals(getRange(m2));
}
/**
 * Parse a single Range.
 * @param range (for e.g. "0" or "1..*" or "0,3..5,19..*")
 */
private static MultiplicityRange parseRange(String range) {
	// create Range	
	MultiplicityRange multiplicityRange = new UmlMultiplicityRange();

	int separatorIndex = range.indexOf(RANGE_SEPARATOR);
	if (separatorIndex < 0) {
		// no range => lower == to
		multiplicityRange.setLower(convertString(range));
		multiplicityRange.setUpper(multiplicityRange.getLower());
	} else {
		// range lower..upper
		long lower = convertString(range.substring(0, separatorIndex));
		long upper = convertString(range.substring(range.lastIndexOf(RANGE_SEPARATOR) + RANGE_SEPARATOR.length(), range.length()));
		if (upper < lower) {
			multiplicityRange.setLower(upper);
			multiplicityRange.setUpper(lower);
		} else {
			multiplicityRange.setLower(lower);
			multiplicityRange.setUpper(upper);
		}
	}

	return multiplicityRange;
}
}
