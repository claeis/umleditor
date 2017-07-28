/* This file is part of the UML/INTERLIS-Editor.
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


// -beg- preserve=no 3C2C47C102EE package "PresentationNode"
package ch.ehi.umleditor.umlpresentation;
// -end- 3C2C47C102EE package "PresentationNode"

// -beg- preserve=no 3C2C47C102EE autoimport "PresentationNode"
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.umleditor.umlpresentation.PresentationEdge;
import ch.ehi.basics.types.NlsString;
// -end- 3C2C47C102EE autoimport "PresentationNode"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3C2C47C102EE import "PresentationNode"
import ch.ehi.uml1_4.foundation.core.*;
// -end- 3C2C47C102EE import "PresentationNode"

/** The root of symbol-style presentations
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:25 $
 */
public abstract class PresentationNode extends AbstractEditorElement implements PresentationElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C2C47C102EE detail_begin "PresentationNode"

// -end- 3C2C47C102EE detail_begin "PresentationNode"

// -beg- preserve=no 3D4659B6037E head3C2C47C102EE "isMoveable"
public boolean isMoveable()
// -end- 3D4659B6037E head3C2C47C102EE "isMoveable"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4659B6037E throws3C2C47C102EE "isMoveable"

// -end- 3D4659B6037E throws3C2C47C102EE "isMoveable"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3D4659B6037E body3C2C47C102EE "isMoveable"
        return true;
        // -end- 3D4659B6037E body3C2C47C102EE "isMoveable"
}

// -beg- preserve=no 3D4FA2170151 head3C2C47C102EE "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2170151 head3C2C47C102EE "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170151 throws3C2C47C102EE "unlinkAll"

// -end- 3D4FA2170151 throws3C2C47C102EE "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170151 body3C2C47C102EE "unlinkAll"

        // Role NodeFigure: NodeFigure object(s) may point to this
        setForeground(null);
        setBackground(null);
        clearSubject();
        detachDiagram();
        // Role PresentationComposite: PresentationComposite object(s) may point to this
        clearPresentationEdge();
        setMetaAttrb(null);
        setDocumentation(null);
        super.unlinkAll();
        // -end- 3D4FA2170151 body3C2C47C102EE "unlinkAll"
}

// -beg- preserve=no 3D4FA2170183 head3C2C47C102EE "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2170183 head3C2C47C102EE "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170183 throws3C2C47C102EE "enumerateChildren"

// -end- 3D4FA2170183 throws3C2C47C102EE "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170183 body3C2C47C102EE "enumerateChildren"
        java.util.Iterator it=null;
        visitor.visit(getForeground());
        visitor.visit(getBackground());
        visitor.visit(getMetaAttrb());
        visitor.visit(getDocumentation());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2170183 body3C2C47C102EE "enumerateChildren"
}

// -beg- preserve=no 3C2C4927039D var3C2C47C102EE "east"
private int east;
// -end- 3C2C4927039D var3C2C47C102EE "east"

/** get current value of east
 *  @see #setEast
 */
// -beg- preserve=no 3C2C4927039D get_head3C2C47C102EE "east"
public int getEast()
// -end- 3C2C4927039D get_head3C2C47C102EE "east"
{
        // -beg- preserve=no 3C2C4927039D get_body3C2C47C102EE "east"
        return east;
        // -end- 3C2C4927039D get_body3C2C47C102EE "east"
}

/** set current value of east
 *  @see #getEast
 */
// -beg- preserve=no 3C2C4927039D set_head3C2C47C102EE "east"
public void setEast(int value1)
// -end- 3C2C4927039D set_head3C2C47C102EE "east"
{
        // -beg- preserve=no 3C2C4927039D set_body3C2C47C102EE "east"
        if(east != value1) {
                east = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setEast"));
        }
        // -end- 3C2C4927039D set_body3C2C47C102EE "east"
}

// -beg- preserve=no 3C2C492D0369 var3C2C47C102EE "south"
private int south;
// -end- 3C2C492D0369 var3C2C47C102EE "south"

/** get current value of south
 *  @see #setSouth
 */
// -beg- preserve=no 3C2C492D0369 get_head3C2C47C102EE "south"
public int getSouth()
// -end- 3C2C492D0369 get_head3C2C47C102EE "south"
{
        // -beg- preserve=no 3C2C492D0369 get_body3C2C47C102EE "south"
        return south;
        // -end- 3C2C492D0369 get_body3C2C47C102EE "south"
}

/** set current value of south
 *  @see #getSouth
 */
// -beg- preserve=no 3C2C492D0369 set_head3C2C47C102EE "south"
public void setSouth(int value1)
// -end- 3C2C492D0369 set_head3C2C47C102EE "south"
{
        // -beg- preserve=no 3C2C492D0369 set_body3C2C47C102EE "south"
        if(south != value1) {
                south = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSouth"));
        }
        // -end- 3C2C492D0369 set_body3C2C47C102EE "south"
}

// -beg- preserve=no 3C2C493003C8 var3C2C47C102EE "width"
private int width;
// -end- 3C2C493003C8 var3C2C47C102EE "width"

/** get current value of width
 *  @see #setWidth
 */
// -beg- preserve=no 3C2C493003C8 get_head3C2C47C102EE "width"
public int getWidth()
// -end- 3C2C493003C8 get_head3C2C47C102EE "width"
{
        // -beg- preserve=no 3C2C493003C8 get_body3C2C47C102EE "width"
        return width;
        // -end- 3C2C493003C8 get_body3C2C47C102EE "width"
}

/** set current value of width
 *  @see #getWidth
 */
// -beg- preserve=no 3C2C493003C8 set_head3C2C47C102EE "width"
public void setWidth(int value1)
// -end- 3C2C493003C8 set_head3C2C47C102EE "width"
{
        // -beg- preserve=no 3C2C493003C8 set_body3C2C47C102EE "width"
        if(width != value1) {
                width = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setWidth"));
        }
        // -end- 3C2C493003C8 set_body3C2C47C102EE "width"
}

// -beg- preserve=no 3C2C493303D6 var3C2C47C102EE "height"
private int height;
// -end- 3C2C493303D6 var3C2C47C102EE "height"

/** get current value of height
 *  @see #setHeight
 */
// -beg- preserve=no 3C2C493303D6 get_head3C2C47C102EE "height"
public int getHeight()
// -end- 3C2C493303D6 get_head3C2C47C102EE "height"
{
        // -beg- preserve=no 3C2C493303D6 get_body3C2C47C102EE "height"
        return height;
        // -end- 3C2C493303D6 get_body3C2C47C102EE "height"
}

/** set current value of height
 *  @see #getHeight
 */
// -beg- preserve=no 3C2C493303D6 set_head3C2C47C102EE "height"
public void setHeight(int value1)
// -end- 3C2C493303D6 set_head3C2C47C102EE "height"
{
        // -beg- preserve=no 3C2C493303D6 set_body3C2C47C102EE "height"
        if(height != value1) {
                height = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setHeight"));
        }
        // -end- 3C2C493303D6 set_body3C2C47C102EE "height"
}

// -beg- preserve=no 3C34382C00AA var3C2C47C102EE "foreground"
private Color foreground = null;
// -end- 3C34382C00AA var3C2C47C102EE "foreground"

/** get current value of foreground
 *  @see #setForeground
 */
// -beg- preserve=no 3C34382C00AA get_head3C2C47C102EE "foreground"
public Color getForeground()
// -end- 3C34382C00AA get_head3C2C47C102EE "foreground"
{
        // -beg- preserve=no 3C34382C00AA get_body3C2C47C102EE "foreground"
        return foreground;
        // -end- 3C34382C00AA get_body3C2C47C102EE "foreground"
}

/** set current value of foreground
 *  @see #getForeground
 */
// -beg- preserve=no 3C34382C00AA set_head3C2C47C102EE "foreground"
public void setForeground(Color value1)
// -end- 3C34382C00AA set_head3C2C47C102EE "foreground"
{
        // -beg- preserve=no 3C34382C00AA set_body3C2C47C102EE "foreground"
        if(foreground!=value1 && (foreground==null || !foreground.equals(value1))) {
                foreground = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setForeground"));
        }
        // -end- 3C34382C00AA set_body3C2C47C102EE "foreground"
}

// -beg- preserve=no 3C34383A0385 var3C2C47C102EE "background"
private Color background = null;
// -end- 3C34383A0385 var3C2C47C102EE "background"

/** get current value of background
 *  @see #setBackground
 */
// -beg- preserve=no 3C34383A0385 get_head3C2C47C102EE "background"
public Color getBackground()
// -end- 3C34383A0385 get_head3C2C47C102EE "background"
{
        // -beg- preserve=no 3C34383A0385 get_body3C2C47C102EE "background"
        return background;
        // -end- 3C34383A0385 get_body3C2C47C102EE "background"
}

/** set current value of background
 *  @see #getBackground
 */
// -beg- preserve=no 3C34383A0385 set_head3C2C47C102EE "background"
public void setBackground(Color value1)
// -end- 3C34383A0385 set_head3C2C47C102EE "background"
{
        // -beg- preserve=no 3C34383A0385 set_body3C2C47C102EE "background"
        if(background!=value1 && (background==null || !background.equals(value1))) {
                background = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBackground"));
        }
        // -end- 3C34383A0385 set_body3C2C47C102EE "background"
}

// -beg- preserve=no 3C34389101F0 var3C2C47C102EE "font"
private String font;
// -end- 3C34389101F0 var3C2C47C102EE "font"

/** get current value of font
 *  @see #setFont
 */
// -beg- preserve=no 3C34389101F0 get_head3C2C47C102EE "font"
public String getFont()
// -end- 3C34389101F0 get_head3C2C47C102EE "font"
{
        // -beg- preserve=no 3C34389101F0 get_body3C2C47C102EE "font"
        return font;
        // -end- 3C34389101F0 get_body3C2C47C102EE "font"
}

/** set current value of font
 *  @see #getFont
 */
// -beg- preserve=no 3C34389101F0 set_head3C2C47C102EE "font"
public void setFont(String value1)
// -end- 3C34389101F0 set_head3C2C47C102EE "font"
{
        // -beg- preserve=no 3C34389101F0 set_body3C2C47C102EE "font"
        if(font != value1) {
                font = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFont"));
        }
        // -end- 3C34389101F0 set_body3C2C47C102EE "font"
}

// -beg- preserve=no 362409A803C0 code3C2C47C102EE "subject"
private java.util.Set subject = new java.util.HashSet();
// -end- 362409A803C0 code3C2C47C102EE "subject"

/** add a Subject.
 *
 *  @see #removeSubject
 *  @see #containsSubject
 *  @see #iteratorSubject
 *  @see #clearSubject
 *  @see #sizeSubject
 */
// -beg- preserve=no 362409A803C0 add_head3C2C47C102EE "PresentationElement::addSubject"
public void addSubject(ModelElement subject1)
// -end- 362409A803C0 add_head3C2C47C102EE "PresentationElement::addSubject"
{
        // -beg- preserve=no 362409A803C0 add_body3C2C47C102EE "PresentationElement::addSubject"
        subject.add(subject1);
        subject1._linkPresentation(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSubject"));
        return;
        // -end- 362409A803C0 add_body3C2C47C102EE "PresentationElement::addSubject"
}

/** disconnect a Subject.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 remove_head3C2C47C102EE "PresentationElement::removeSubject"
public ModelElement removeSubject(ModelElement subject1)
// -end- 362409A803C0 remove_head3C2C47C102EE "PresentationElement::removeSubject"
{
        // -beg- preserve=no 362409A803C0 remove_body3C2C47C102EE "PresentationElement::removeSubject"
        ModelElement ret=null;
        if(subject1==null || !subject.contains(subject1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = subject1;
        subject.remove(subject1);
        subject1._unlinkPresentation(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSubject"));
        return ret;
        // -end- 362409A803C0 remove_body3C2C47C102EE "PresentationElement::removeSubject"
}

/** tests if a given Subject is connected.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 test_head3C2C47C102EE "PresentationElement::containsSubject"
public boolean containsSubject(ModelElement subject1)
// -end- 362409A803C0 test_head3C2C47C102EE "PresentationElement::containsSubject"
{
        // -beg- preserve=no 362409A803C0 test_body3C2C47C102EE "PresentationElement::containsSubject"
        return subject.contains(subject1);
        // -end- 362409A803C0 test_body3C2C47C102EE "PresentationElement::containsSubject"
}

/** used to enumerate all connected Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 get_all_head3C2C47C102EE "PresentationElement::iteratorSubject"
public java.util.Iterator iteratorSubject()
// -end- 362409A803C0 get_all_head3C2C47C102EE "PresentationElement::iteratorSubject"
{
        // -beg- preserve=no 362409A803C0 get_all_body3C2C47C102EE "PresentationElement::iteratorSubject"
        return subject.iterator();
        // -end- 362409A803C0 get_all_body3C2C47C102EE "PresentationElement::iteratorSubject"
}

/** disconnect all Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 remove_all_head3C2C47C102EE "PresentationElement::clearSubject"
public void clearSubject()
// -end- 362409A803C0 remove_all_head3C2C47C102EE "PresentationElement::clearSubject"
{
        // -beg- preserve=no 362409A803C0 remove_all_body3C2C47C102EE "PresentationElement::clearSubject"
        if(sizeSubject()>0) {
                for(java.util.Iterator p = subject.iterator(); p.hasNext(); ) {
                        ((ModelElement)p.next())._unlinkPresentation(this);
                }
                subject.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSubject"));
        }
        // -end- 362409A803C0 remove_all_body3C2C47C102EE "PresentationElement::clearSubject"
}

/** returns the number of Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 size_head3C2C47C102EE "PresentationElement::sizeSubject"
public int sizeSubject()
// -end- 362409A803C0 size_head3C2C47C102EE "PresentationElement::sizeSubject"
{
        // -beg- preserve=no 362409A803C0 size_body3C2C47C102EE "PresentationElement::sizeSubject"
        return subject.size();
        // -end- 362409A803C0 size_body3C2C47C102EE "PresentationElement::sizeSubject"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A803C0 _link_body3C2C47C102EE "PresentationElement::_linkSubject"
public void _linkSubject(ModelElement subject1)
{
        subject.add(subject1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSubject"));
        return;
}
// -end- 362409A803C0 _link_body3C2C47C102EE "PresentationElement::_linkSubject"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A803C0 _unlink_body3C2C47C102EE "PresentationElement::_unlinkSubject"
public void _unlinkSubject(ModelElement subject1)
{
        subject.remove(subject1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSubject"));
        return;
}
// -end- 362409A803C0 _unlink_body3C2C47C102EE "PresentationElement::_unlinkSubject"

// -beg- preserve=no 3C2C4C9F0169 code3C2C47C102EE "diagram"
private Diagram diagram;
// -end- 3C2C4C9F0169 code3C2C47C102EE "diagram"

/** attaches a Diagram.
 *
 *  @see #detachDiagram
 *  @see #getDiagram
 *  @see #containsDiagram
 */
// -beg- preserve=no 3C2C4C9F0169 attach_head3C2C47C102EE "PresentationElement::attachDiagram"
public void attachDiagram(Diagram diagram1)
// -end- 3C2C4C9F0169 attach_head3C2C47C102EE "PresentationElement::attachDiagram"
{
        // -beg- preserve=no 3C2C4C9F0169 attach_body3C2C47C102EE "PresentationElement::attachDiagram"
        if(diagram!=null) {throw new java.lang.IllegalStateException("already a diagram attached");}
        if(diagram1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as diagram");}
        diagram = diagram1;
        diagram1._linkPresentationElement(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDiagram"));
        return;
        // -end- 3C2C4C9F0169 attach_body3C2C47C102EE "PresentationElement::attachDiagram"
}

/** disconnect the currently attached Diagram.
 *  @see #attachDiagram
 */
// -beg- preserve=no 3C2C4C9F0169 detach_head3C2C47C102EE "PresentationElement::detachDiagram"
public Diagram detachDiagram()
// -end- 3C2C4C9F0169 detach_head3C2C47C102EE "PresentationElement::detachDiagram"
{
        // -beg- preserve=no 3C2C4C9F0169 detach_body3C2C47C102EE "PresentationElement::detachDiagram"
        Diagram ret = null;
        if(diagram!=null) {
                diagram._unlinkPresentationElement(this);
                ret = diagram;
                diagram = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDiagram"));
        return ret;
        // -end- 3C2C4C9F0169 detach_body3C2C47C102EE "PresentationElement::detachDiagram"
}

/** get the currently attached Diagram.
 *  @see #attachDiagram
 */
// -beg- preserve=no 3C2C4C9F0169 get_head3C2C47C102EE "PresentationElement::getDiagram"
public Diagram getDiagram()
// -end- 3C2C4C9F0169 get_head3C2C47C102EE "PresentationElement::getDiagram"
{
        // -beg- preserve=no 3C2C4C9F0169 get_body3C2C47C102EE "PresentationElement::getDiagram"
        if(diagram==null) {throw new java.lang.IllegalStateException("no diagram attached");}
        return diagram;
        // -end- 3C2C4C9F0169 get_body3C2C47C102EE "PresentationElement::getDiagram"
}

/** tests if there is a Diagram attached.
 *  @see #attachDiagram
 */
// -beg- preserve=no 3C2C4C9F0169 test_head3C2C47C102EE "PresentationElement::containsDiagram"
public boolean containsDiagram()
// -end- 3C2C4C9F0169 test_head3C2C47C102EE "PresentationElement::containsDiagram"
{
        // -beg- preserve=no 3C2C4C9F0169 test_body3C2C47C102EE "PresentationElement::containsDiagram"
        return diagram!=null;
        // -end- 3C2C4C9F0169 test_body3C2C47C102EE "PresentationElement::containsDiagram"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3C2C4C9F0169 _link_body3C2C47C102EE "PresentationElement::_linkDiagram"
public void _linkDiagram(Diagram diagram1)
{
        diagram = diagram1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDiagram"));
        return;
}
// -end- 3C2C4C9F0169 _link_body3C2C47C102EE "PresentationElement::_linkDiagram"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3C2C4C9F0169 _unlink_body3C2C47C102EE "PresentationElement::_unlinkDiagram"
public void _unlinkDiagram(Diagram diagram1)
{
        diagram = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDiagram"));
        return;
}
// -end- 3C2C4C9F0169 _unlink_body3C2C47C102EE "PresentationElement::_unlinkDiagram"

// -beg- preserve=no 3C2C49E3019E code3C2C47C102EE "presentationEdge"
private java.util.Set presentationEdge = new java.util.HashSet();
// -end- 3C2C49E3019E code3C2C47C102EE "presentationEdge"

/** add a PresentationEdge.
 *
 *  @see #removePresentationEdge
 *  @see #containsPresentationEdge
 *  @see #iteratorPresentationEdge
 *  @see #clearPresentationEdge
 *  @see #sizePresentationEdge
 */
// -beg- preserve=no 3C2C49E3019E add_head3C2C47C102EE "PresentationElement::addPresentationEdge"
public void addPresentationEdge(PresentationEdge presentationEdge1)
// -end- 3C2C49E3019E add_head3C2C47C102EE "PresentationElement::addPresentationEdge"
{
        // -beg- preserve=no 3C2C49E3019E add_body3C2C47C102EE "PresentationElement::addPresentationEdge"
        presentationEdge.add(presentationEdge1);
        presentationEdge1._linkEndpoint(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentationEdge"));
        return;
        // -end- 3C2C49E3019E add_body3C2C47C102EE "PresentationElement::addPresentationEdge"
}

/** disconnect a PresentationEdge.
 *  @see #addPresentationEdge
 */
// -beg- preserve=no 3C2C49E3019E remove_head3C2C47C102EE "PresentationElement::removePresentationEdge"
public PresentationEdge removePresentationEdge(PresentationEdge presentationEdge1)
// -end- 3C2C49E3019E remove_head3C2C47C102EE "PresentationElement::removePresentationEdge"
{
        // -beg- preserve=no 3C2C49E3019E remove_body3C2C47C102EE "PresentationElement::removePresentationEdge"
        PresentationEdge ret=null;
        if(presentationEdge1==null || !presentationEdge.contains(presentationEdge1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = presentationEdge1;
        presentationEdge.remove(presentationEdge1);
        presentationEdge1._unlinkEndpoint(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentationEdge"));
        return ret;
        // -end- 3C2C49E3019E remove_body3C2C47C102EE "PresentationElement::removePresentationEdge"
}

/** tests if a given PresentationEdge is connected.
 *  @see #addPresentationEdge
 */
// -beg- preserve=no 3C2C49E3019E test_head3C2C47C102EE "PresentationElement::containsPresentationEdge"
public boolean containsPresentationEdge(PresentationEdge presentationEdge1)
// -end- 3C2C49E3019E test_head3C2C47C102EE "PresentationElement::containsPresentationEdge"
{
        // -beg- preserve=no 3C2C49E3019E test_body3C2C47C102EE "PresentationElement::containsPresentationEdge"
        return presentationEdge.contains(presentationEdge1);
        // -end- 3C2C49E3019E test_body3C2C47C102EE "PresentationElement::containsPresentationEdge"
}

/** used to enumerate all connected PresentationEdges.
 *  @see #addPresentationEdge
 */
// -beg- preserve=no 3C2C49E3019E get_all_head3C2C47C102EE "PresentationElement::iteratorPresentationEdge"
public java.util.Iterator iteratorPresentationEdge()
// -end- 3C2C49E3019E get_all_head3C2C47C102EE "PresentationElement::iteratorPresentationEdge"
{
        // -beg- preserve=no 3C2C49E3019E get_all_body3C2C47C102EE "PresentationElement::iteratorPresentationEdge"
        return presentationEdge.iterator();
        // -end- 3C2C49E3019E get_all_body3C2C47C102EE "PresentationElement::iteratorPresentationEdge"
}

/** disconnect all PresentationEdges.
 *  @see #addPresentationEdge
 */
// -beg- preserve=no 3C2C49E3019E remove_all_head3C2C47C102EE "PresentationElement::clearPresentationEdge"
public void clearPresentationEdge()
// -end- 3C2C49E3019E remove_all_head3C2C47C102EE "PresentationElement::clearPresentationEdge"
{
        // -beg- preserve=no 3C2C49E3019E remove_all_body3C2C47C102EE "PresentationElement::clearPresentationEdge"
        if(sizePresentationEdge()>0) {
                for(java.util.Iterator p = presentationEdge.iterator(); p.hasNext(); ) {
                        ((PresentationEdge)p.next())._unlinkEndpoint(this);
                }
                presentationEdge.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentationEdge"));
        }
        // -end- 3C2C49E3019E remove_all_body3C2C47C102EE "PresentationElement::clearPresentationEdge"
}

/** returns the number of PresentationEdges.
 *  @see #addPresentationEdge
 */
// -beg- preserve=no 3C2C49E3019E size_head3C2C47C102EE "PresentationElement::sizePresentationEdge"
public int sizePresentationEdge()
// -end- 3C2C49E3019E size_head3C2C47C102EE "PresentationElement::sizePresentationEdge"
{
        // -beg- preserve=no 3C2C49E3019E size_body3C2C47C102EE "PresentationElement::sizePresentationEdge"
        return presentationEdge.size();
        // -end- 3C2C49E3019E size_body3C2C47C102EE "PresentationElement::sizePresentationEdge"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3C2C49E3019E _link_body3C2C47C102EE "PresentationElement::_linkPresentationEdge"
public void _linkPresentationEdge(PresentationEdge presentationEdge1)
{
        presentationEdge.add(presentationEdge1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentationEdge"));
        return;
}
// -end- 3C2C49E3019E _link_body3C2C47C102EE "PresentationElement::_linkPresentationEdge"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3C2C49E3019E _unlink_body3C2C47C102EE "PresentationElement::_unlinkPresentationEdge"
public void _unlinkPresentationEdge(PresentationEdge presentationEdge1)
{
        presentationEdge.remove(presentationEdge1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentationEdge"));
        return;
}
// -end- 3C2C49E3019E _unlink_body3C2C47C102EE "PresentationElement::_unlinkPresentationEdge"

// -beg- preserve=no 3C1DF92B0234 var3C2C47C102EE "documentation"
private NlsString documentation = null;
// -end- 3C1DF92B0234 var3C2C47C102EE "documentation"

/** get current value of documentation
 *  @see #setDocumentation
 */
// -beg- preserve=no 3C1DF92B0234 get_head3C2C47C102EE "documentation"
public NlsString getDocumentation()
// -end- 3C1DF92B0234 get_head3C2C47C102EE "documentation"
{
        // -beg- preserve=no 3C1DF92B0234 get_body3C2C47C102EE "documentation"
        return documentation;
        // -end- 3C1DF92B0234 get_body3C2C47C102EE "documentation"
}

/** set current value of documentation
 *  @see #getDocumentation
 */
// -beg- preserve=no 3C1DF92B0234 set_head3C2C47C102EE "documentation"
public void setDocumentation(NlsString value1)
// -end- 3C1DF92B0234 set_head3C2C47C102EE "documentation"
{
        // -beg- preserve=no 3C1DF92B0234 set_body3C2C47C102EE "documentation"
        if(documentation!=value1 && (documentation==null || !documentation.equals(value1))) {
                documentation = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
        }
        // -end- 3C1DF92B0234 set_body3C2C47C102EE "documentation"
}

private NlsString metaAttrb = null;
public NlsString getMetaAttrb(){
        return metaAttrb;
}
public void setMetaAttrb(NlsString value){
        if(metaAttrb!=value && (metaAttrb==null || !metaAttrb.equals(value))) {
                metaAttrb = value;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMetaAttrb"));
        }
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C2C47C102EE detail_end "PresentationNode"

// -end- 3C2C47C102EE detail_end "PresentationNode"

}
