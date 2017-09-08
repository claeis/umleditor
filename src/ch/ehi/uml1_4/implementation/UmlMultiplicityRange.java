// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:12 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3C8F9377022E package "UmlMultiplicityRange"
package ch.ehi.uml1_4.implementation;
// -end- 3C8F9377022E package "UmlMultiplicityRange"

// -beg- preserve=no 3C8F9377022E autoimport "UmlMultiplicityRange"
import ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 3C8F9377022E autoimport "UmlMultiplicityRange"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C8F9377022E import "UmlMultiplicityRange"

// -end- 3C8F9377022E import "UmlMultiplicityRange"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:12 $
 */
public class UmlMultiplicityRange extends AbstractEditorElement implements MultiplicityRange, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C8F9377022E detail_begin "UmlMultiplicityRange"

	// -end- 3C8F9377022E detail_begin "UmlMultiplicityRange"

	private static final long serialVersionUID = 3780463231493381560L;

	// -beg- preserve=no 3D4FA218005A head3C8F9377022E "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA218005A head3C8F9377022E "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA218005A throws3C8F9377022E "unlinkAll"

	// -end- 3D4FA218005A throws3C8F9377022E "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA218005A body3C8F9377022E "unlinkAll"

		detachMultiplicity();
		super.unlinkAll();
		// -end- 3D4FA218005A body3C8F9377022E "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180062 head3C8F9377022E "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180062 head3C8F9377022E "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180062 throws3C8F9377022E "enumerateChildren"

	// -end- 3D4FA2180062 throws3C8F9377022E "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180062 body3C8F9377022E "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180062 body3C8F9377022E "enumerateChildren"
	}

	// -beg- preserve=no 33FF95B90378 code3C8F9377022E "multiplicity"
	private Multiplicity multiplicity;
	// -end- 33FF95B90378 code3C8F9377022E "multiplicity"

	/**
	 * attaches a Multiplicity.
	 *
	 * @see #detachMultiplicity
	 * @see #getMultiplicity
	 * @see #containsMultiplicity
	 */
	// -beg- preserve=no 33FF95B90378 attach_head3C8F9377022E
	// "MultiplicityRange::attachMultiplicity"
	public void attachMultiplicity(Multiplicity multiplicity1)
	// -end- 33FF95B90378 attach_head3C8F9377022E
	// "MultiplicityRange::attachMultiplicity"
	{
		// -beg- preserve=no 33FF95B90378 attach_body3C8F9377022E
		// "MultiplicityRange::attachMultiplicity"
		if (multiplicity != null) {
			throw new java.lang.IllegalStateException("already a multiplicity attached");
		}
		if (multiplicity1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as multiplicity");
		}
		multiplicity = multiplicity1;
		multiplicity1._linkRange(this);

		return;
		// -end- 33FF95B90378 attach_body3C8F9377022E
		// "MultiplicityRange::attachMultiplicity"
	}

	/**
	 * disconnect the currently attached Multiplicity.
	 * 
	 * @see #attachMultiplicity
	 */
	// -beg- preserve=no 33FF95B90378 detach_head3C8F9377022E
	// "MultiplicityRange::detachMultiplicity"
	public Multiplicity detachMultiplicity()
	// -end- 33FF95B90378 detach_head3C8F9377022E
	// "MultiplicityRange::detachMultiplicity"
	{
		// -beg- preserve=no 33FF95B90378 detach_body3C8F9377022E
		// "MultiplicityRange::detachMultiplicity"
		Multiplicity ret = null;
		if (multiplicity != null) {
			multiplicity._unlinkRange(this);
			ret = multiplicity;
			multiplicity = null;
		}

		return ret;
		// -end- 33FF95B90378 detach_body3C8F9377022E
		// "MultiplicityRange::detachMultiplicity"
	}

	/**
	 * get the currently attached Multiplicity.
	 * 
	 * @see #attachMultiplicity
	 */
	// -beg- preserve=no 33FF95B90378 get_head3C8F9377022E
	// "MultiplicityRange::getMultiplicity"
	public Multiplicity getMultiplicity()
	// -end- 33FF95B90378 get_head3C8F9377022E
	// "MultiplicityRange::getMultiplicity"
	{
		// -beg- preserve=no 33FF95B90378 get_body3C8F9377022E
		// "MultiplicityRange::getMultiplicity"
		if (multiplicity == null) {
			throw new java.lang.IllegalStateException("no multiplicity attached");
		}
		return multiplicity;
		// -end- 33FF95B90378 get_body3C8F9377022E
		// "MultiplicityRange::getMultiplicity"
	}

	/**
	 * tests if there is a Multiplicity attached.
	 * 
	 * @see #attachMultiplicity
	 */
	// -beg- preserve=no 33FF95B90378 test_head3C8F9377022E
	// "MultiplicityRange::containsMultiplicity"
	public boolean containsMultiplicity()
	// -end- 33FF95B90378 test_head3C8F9377022E
	// "MultiplicityRange::containsMultiplicity"
	{
		// -beg- preserve=no 33FF95B90378 test_body3C8F9377022E
		// "MultiplicityRange::containsMultiplicity"
		return multiplicity != null;
		// -end- 33FF95B90378 test_body3C8F9377022E
		// "MultiplicityRange::containsMultiplicity"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FF95B90378 _link_body3C8F9377022E
	// "MultiplicityRange::_linkMultiplicity"
	public void _linkMultiplicity(Multiplicity multiplicity1) {
		multiplicity = multiplicity1;

		return;
	}
	// -end- 33FF95B90378 _link_body3C8F9377022E
	// "MultiplicityRange::_linkMultiplicity"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FF95B90378 _unlink_body3C8F9377022E
	// "MultiplicityRange::_unlinkMultiplicity"
	public void _unlinkMultiplicity(Multiplicity multiplicity1) {
		multiplicity = null;

		return;
	}
	// -end- 33FF95B90378 _unlink_body3C8F9377022E
	// "MultiplicityRange::_unlinkMultiplicity"

	// -beg- preserve=no 33E93BE902E8 var3C8F9377022E "lower"
	private long lower;
	// -end- 33E93BE902E8 var3C8F9377022E "lower"

	/**
	 * get current value of lower
	 * 
	 * @see #setLower
	 */
	// -beg- preserve=no 33E93BE902E8 get_head3C8F9377022E "lower"
	public long getLower()
	// -end- 33E93BE902E8 get_head3C8F9377022E "lower"
	{
		// -beg- preserve=no 33E93BE902E8 get_body3C8F9377022E "lower"
		return lower;
		// -end- 33E93BE902E8 get_body3C8F9377022E "lower"
	}

	/**
	 * set current value of lower
	 * 
	 * @see #getLower
	 */
	// -beg- preserve=no 33E93BE902E8 set_head3C8F9377022E "lower"
	public void setLower(long value1)
	// -end- 33E93BE902E8 set_head3C8F9377022E "lower"
	{
		// -beg- preserve=no 33E93BE902E8 set_body3C8F9377022E "lower"
		if (lower != value1) {
			lower = value1;

		}
		// -end- 33E93BE902E8 set_body3C8F9377022E "lower"
	}

	// -beg- preserve=no 33E93BFA0329 var3C8F9377022E "upper"
	private long upper;
	// -end- 33E93BFA0329 var3C8F9377022E "upper"

	/**
	 * get current value of upper
	 * 
	 * @see #setUpper
	 */
	// -beg- preserve=no 33E93BFA0329 get_head3C8F9377022E "upper"
	public long getUpper()
	// -end- 33E93BFA0329 get_head3C8F9377022E "upper"
	{
		// -beg- preserve=no 33E93BFA0329 get_body3C8F9377022E "upper"
		return upper;
		// -end- 33E93BFA0329 get_body3C8F9377022E "upper"
	}

	/**
	 * set current value of upper
	 * 
	 * @see #getUpper
	 */
	// -beg- preserve=no 33E93BFA0329 set_head3C8F9377022E "upper"
	public void setUpper(long value1)
	// -end- 33E93BFA0329 set_head3C8F9377022E "upper"
	{
		// -beg- preserve=no 33E93BFA0329 set_body3C8F9377022E "upper"
		if (upper != value1) {
			upper = value1;

		}
		// -end- 33E93BFA0329 set_body3C8F9377022E "upper"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C8F9377022E detail_end "UmlMultiplicityRange"

	// -end- 3C8F9377022E detail_end "UmlMultiplicityRange"

}
