package ch.ehi.umleditor.test;

import ch.ehi.uml1_4.implementation.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

import ch.ehi.uml1_4.foundation.datatypes.*;
import ch.ehi.umleditor.application.*;
/**
 * Test Class CardinalityKind
 * @author Peter Hirzel
 */

public class MultiplicityConverterTestCase {

//prueft, ob der Range: 0..1 ohne Fehler definiert werden kann.
@Test
public void testCardinality0To1() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity("0..1");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("0..1", (range.getLower() == (long)0) && (range.getUpper() == (long)1));
}

//prueft, ob der Range: 0..* ohne Fehler definiert werden kann.
@Test
public void testCardinality0ToN() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity("0..*");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("0..*", (range.getLower() == (long)0) && (range.getUpper() == Long.MAX_VALUE));
}

//prueft, ob der Range: 1..* ohne Fehler definiert werden kann.
@Test
public void testCardinality1ToN() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity("1..*");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("1..*", (range.getLower() == (long)1) && (range.getUpper() == Long.MAX_VALUE));
}

//prueft, ob der Range: 34.. 101 ohne Fehler definiert werden kann.
@Test
public void testCardinality34To101() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity("34..101");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("0..*", (range.getLower() == (long)34) && (range.getUpper() == (long)101));
}

//prueft, ob der Range: 34..13 ohne Fehler definiert werden kann.
@Test
public void testCardinality34To13() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity("  34.. 13");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("34..13", (range.getLower() == (long)13) && (range.getUpper() == (long)34));
}

//prueft, ob der Range: 0 ohne Fehler definiert werden kann.
@Test
public void testCardinalityExactly0() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity(" 0  ");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("0", (range.getLower() == (long)0) && (range.getUpper() == (long)0));
}

//prueft, ob der Range: 1 ohne Fehler definiert werden kann.
@Test
public void testCardinalityExactly1() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity(" 1  ");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("1", (range.getLower() == (long)1) && (range.getUpper() == (long)1));
}

//prueft, ob der Range: * ohne Fehler definiert werden kann.
@Test
public void testCardinalityExactlyN() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity(" *  ");
	MultiplicityRange range = (MultiplicityRange)multiplicity.iteratorRange().next();
	
	assertTrue("*", (range.getLower() == Long.MAX_VALUE) && (range.getUpper() == Long.MAX_VALUE));
}

//prueft, ob der Range: 0,1..5,80..* ohne Fehler definiert werden kann.
@Ignore("")
private void fixmeGetRanges() {
	String input = "0,1..5,80..*";
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity(input);
	
	// WARNING: range Order may differ because of internal HashSet
	assertTrue(input, MultiplicityConverter.getRange(multiplicity).equals(input));
}

//prueft, ob der Range: 80..*, 1..5 und 0 ohne Fehler definiert werden kann.
@Ignore("")
public void fixmeMultipleRanges() {
	Multiplicity multiplicity = MultiplicityConverter.createMultiplicity("0,1..5,80..*");
	java.util.Iterator iterator = multiplicity.iteratorRange();

	// WARNING: range Order may differ becuase of internal HashSet
	MultiplicityRange range = (MultiplicityRange)iterator.next();
	assertTrue("0", (range.getLower() == (long)0) && (range.getUpper() == (long)0));
	range = (MultiplicityRange)iterator.next();
	assertTrue("1..5", (range.getLower() == (long)1) && (range.getUpper() == (long)5));
	range = (MultiplicityRange)iterator.next();
	assertTrue("80..*", (range.getLower() == (long)80) && (range.getUpper() == Long.MAX_VALUE));
}

// prueft, ob der Range: 0..1 ohne Fehler definiert werden kann.
@Test
public void testRange0To1() {
	Multiplicity multiplicity = new UmlMultiplicity();
	MultiplicityRange range = new UmlMultiplicityRange();
	range.setLower((long)0);
	range.setUpper((long)1);
	multiplicity.addRange(range);

	assertEquals("0..1", MultiplicityConverter.getRange(multiplicity));
}

//prueft, ob der Range: 0..* ohne Fehler definiert werden kann.
@Test
public void testRange0ToN() {
	Multiplicity multiplicity = new UmlMultiplicity();
	MultiplicityRange range = new UmlMultiplicityRange();
	range.setLower((long)0);
	range.setUpper(Long.MAX_VALUE);
	multiplicity.addRange(range);

	assertEquals("0..*", MultiplicityConverter.getRange(multiplicity));
}

//prueft, ob der Range: 1..* ohne Fehler definiert werden kann.
@Test
public void testRange1ToN() {
	Multiplicity multiplicity = new UmlMultiplicity();
	MultiplicityRange range = new UmlMultiplicityRange();
	range.setLower((long)1);
	range.setUpper(Long.MAX_VALUE);
	multiplicity.addRange(range);

	assertEquals("1..*", MultiplicityConverter.getRange(multiplicity));
}

//prueft, ob der Range: 0 ohne Fehler definiert werden kann.
@Test
public void testRangeExactly0() {
	Multiplicity multiplicity = new UmlMultiplicity();
	MultiplicityRange range = new UmlMultiplicityRange();
	range.setLower((long)0);
	range.setUpper((long)0);
	multiplicity.addRange(range);

	assertEquals("0", MultiplicityConverter.getRange(multiplicity));
}

//prueft, ob der Range: 1 ohne Fehler definiert werden kann.
@Test
public void testRangeExactly1() {
	Multiplicity multiplicity = new UmlMultiplicity();
	MultiplicityRange range = new UmlMultiplicityRange();
	range.setLower((long)1);
	range.setUpper((long)1);
	multiplicity.addRange(range);

	assertEquals("1", MultiplicityConverter.getRange(multiplicity));
}

//prueft, ob der Range: * ohne Fehler definiert werden kann.
@Test
public void testRangeExactlyN() {
	Multiplicity multiplicity = new UmlMultiplicity();
	MultiplicityRange range = new UmlMultiplicityRange();
	range.setLower(Long.MAX_VALUE);
	range.setUpper(Long.MAX_VALUE);
	multiplicity.addRange(range);

	assertEquals("*", MultiplicityConverter.getRange(multiplicity));
}
}
