// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:12 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3C8F927A014D package "UmlMultiplicity"
package ch.ehi.uml1_4.implementation;
// -end- 3C8F927A014D package "UmlMultiplicity"

// -beg- preserve=no 3C8F927A014D autoimport "UmlMultiplicity"
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange;
// -end- 3C8F927A014D autoimport "UmlMultiplicity"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C8F927A014D import "UmlMultiplicity"

// -end- 3C8F927A014D import "UmlMultiplicity"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:12 $
 */
public class UmlMultiplicity extends AbstractEditorElement implements Multiplicity, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C8F927A014D detail_begin "UmlMultiplicity"

// -end- 3C8F927A014D detail_begin "UmlMultiplicity"

// -beg- preserve=no 3D4FA218004E head3C8F927A014D "unlinkAll"
public void unlinkAll()
// -end- 3D4FA218004E head3C8F927A014D "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA218004E throws3C8F927A014D "unlinkAll"

// -end- 3D4FA218004E throws3C8F927A014D "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA218004E body3C8F927A014D "unlinkAll"

        clearRange();
        super.unlinkAll();
        // -end- 3D4FA218004E body3C8F927A014D "unlinkAll"
}

// -beg- preserve=no 3D4FA2180058 head3C8F927A014D "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2180058 head3C8F927A014D "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2180058 throws3C8F927A014D "enumerateChildren"

// -end- 3D4FA2180058 throws3C8F927A014D "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180058 body3C8F927A014D "enumerateChildren"
        java.util.Iterator it=null;
        it=iteratorRange(); while(it.hasNext()) visitor.visit(it.next());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2180058 body3C8F927A014D "enumerateChildren"
}

// -beg- preserve=no 33FF95B90300 code3C8F927A014D "range"
private java.util.Set range = new java.util.HashSet();
// -end- 33FF95B90300 code3C8F927A014D "range"

/** add a Range.
 *
 *  @see #removeRange
 *  @see #containsRange
 *  @see #iteratorRange
 *  @see #clearRange
 *  @see #sizeRange
 */
// -beg- preserve=no 33FF95B90300 add_head3C8F927A014D "Multiplicity::addRange"
public void addRange(MultiplicityRange range1)
// -end- 33FF95B90300 add_head3C8F927A014D "Multiplicity::addRange"
{
        // -beg- preserve=no 33FF95B90300 add_body3C8F927A014D "Multiplicity::addRange"
        range.add(range1);
        range1._linkMultiplicity(this);

        return;
        // -end- 33FF95B90300 add_body3C8F927A014D "Multiplicity::addRange"
}

/** disconnect a Range.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 remove_head3C8F927A014D "Multiplicity::removeRange"
public MultiplicityRange removeRange(MultiplicityRange range1)
// -end- 33FF95B90300 remove_head3C8F927A014D "Multiplicity::removeRange"
{
        // -beg- preserve=no 33FF95B90300 remove_body3C8F927A014D "Multiplicity::removeRange"
        MultiplicityRange ret=null;
        if(range1==null || !range.contains(range1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = range1;
        range.remove(range1);
        range1._unlinkMultiplicity(this);

        return ret;
        // -end- 33FF95B90300 remove_body3C8F927A014D "Multiplicity::removeRange"
}

/** tests if a given Range is connected.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 test_head3C8F927A014D "Multiplicity::containsRange"
public boolean containsRange(MultiplicityRange range1)
// -end- 33FF95B90300 test_head3C8F927A014D "Multiplicity::containsRange"
{
        // -beg- preserve=no 33FF95B90300 test_body3C8F927A014D "Multiplicity::containsRange"
        return range.contains(range1);
        // -end- 33FF95B90300 test_body3C8F927A014D "Multiplicity::containsRange"
}

/** used to enumerate all connected Ranges.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 get_all_head3C8F927A014D "Multiplicity::iteratorRange"
public java.util.Iterator iteratorRange()
// -end- 33FF95B90300 get_all_head3C8F927A014D "Multiplicity::iteratorRange"
{
        // -beg- preserve=no 33FF95B90300 get_all_body3C8F927A014D "Multiplicity::iteratorRange"
        return range.iterator();
        // -end- 33FF95B90300 get_all_body3C8F927A014D "Multiplicity::iteratorRange"
}

/** disconnect all Ranges.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 remove_all_head3C8F927A014D "Multiplicity::clearRange"
public void clearRange()
// -end- 33FF95B90300 remove_all_head3C8F927A014D "Multiplicity::clearRange"
{
        // -beg- preserve=no 33FF95B90300 remove_all_body3C8F927A014D "Multiplicity::clearRange"
        if(sizeRange()>0) {
                for(java.util.Iterator p = range.iterator(); p.hasNext(); ) {
                        ((MultiplicityRange)p.next())._unlinkMultiplicity(this);
                }
                range.clear();

        }
        // -end- 33FF95B90300 remove_all_body3C8F927A014D "Multiplicity::clearRange"
}

/** returns the number of Ranges.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 size_head3C8F927A014D "Multiplicity::sizeRange"
public int sizeRange()
// -end- 33FF95B90300 size_head3C8F927A014D "Multiplicity::sizeRange"
{
        // -beg- preserve=no 33FF95B90300 size_body3C8F927A014D "Multiplicity::sizeRange"
        return range.size();
        // -end- 33FF95B90300 size_body3C8F927A014D "Multiplicity::sizeRange"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF95B90300 _link_body3C8F927A014D "Multiplicity::_linkRange"
public void _linkRange(MultiplicityRange range1)
{
        range.add(range1);

        return;
}
// -end- 33FF95B90300 _link_body3C8F927A014D "Multiplicity::_linkRange"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF95B90300 _unlink_body3C8F927A014D "Multiplicity::_unlinkRange"
public void _unlinkRange(MultiplicityRange range1)
{
        range.remove(range1);

        return;
}
// -end- 33FF95B90300 _unlink_body3C8F927A014D "Multiplicity::_unlinkRange"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C8F927A014D detail_end "UmlMultiplicity"

// -end- 3C8F927A014D detail_end "UmlMultiplicity"

}
