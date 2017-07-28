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


// -beg- preserve=no 3C2C43470264 package "Association"
package ch.ehi.umleditor.umlpresentation;
// -end- 3C2C43470264 package "Association"

// -beg- preserve=no 3C2C43470264 autoimport "Association"
import ch.ehi.umleditor.umlpresentation.PresentationComposite;
import ch.ehi.umleditor.umlpresentation.PresentationRole;
import ch.ehi.umleditor.umlpresentation.PresentationAssocClass;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C2C43470264 autoimport "Association"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3C2C43470264 import "Association"
import ch.ehi.uml1_4.foundation.core.AssociationClass;
// -end- 3C2C43470264 import "Association"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:07 $
 */
public class Association extends PresentationComposite implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C2C43470264 detail_begin "Association"

// -end- 3C2C43470264 detail_begin "Association"

/** The visiblility and moveablity of the node representing the link of the association is case dependendent.
 */
// -beg- preserve=no 3D465C070006 head3C2C43470264 "isLinkMoveable"
public boolean isLinkMoveable()
// -end- 3D465C070006 head3C2C43470264 "isLinkMoveable"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D465C070006 throws3C2C43470264 "isLinkMoveable"

// -end- 3D465C070006 throws3C2C43470264 "isLinkMoveable"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3D465C070006 body3C2C43470264 "isLinkMoveable"
        java.util.Iterator subji=iteratorSubject();
        if(!subji.hasNext()) return false;
        ch.ehi.uml1_4.foundation.core.Association subject
                =(ch.ehi.uml1_4.foundation.core.Association)subji.next();
        if(!(subject instanceof AssociationClass)) {
                return false;
        }
        AssociationClass assoc=(AssociationClass)subject;
        if(assoc.sizeConnection()>2) return true;
        return false;
        // -end- 3D465C070006 body3C2C43470264 "isLinkMoveable"
}

// -beg- preserve=no 3D4FA2170024 head3C2C43470264 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2170024 head3C2C43470264 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170024 throws3C2C43470264 "unlinkAll"

// -end- 3D4FA2170024 throws3C2C43470264 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170024 body3C2C43470264 "unlinkAll"

        clearRolePresentation();
        detachLinkPresentation();
        clearSubject();
        super.unlinkAll();
        // -end- 3D4FA2170024 body3C2C43470264 "unlinkAll"
}

// -beg- preserve=no 3D4FA2170025 head3C2C43470264 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2170025 head3C2C43470264 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170025 throws3C2C43470264 "enumerateChildren"

// -end- 3D4FA2170025 throws3C2C43470264 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170025 body3C2C43470264 "enumerateChildren"
        java.util.Iterator it=null;
        it=iteratorRolePresentation(); while(it.hasNext()) visitor.visit(it.next());
        if(containsLinkPresentation()) visitor.visit(getLinkPresentation());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2170025 body3C2C43470264 "enumerateChildren"
}

// -beg- preserve=no 3D46531B03CD code3C2C43470264 "rolePresentation"
private java.util.Set rolePresentation = new java.util.HashSet();
// -end- 3D46531B03CD code3C2C43470264 "rolePresentation"

/** add a RolePresentation.
 *
 *  @see #removeRolePresentation
 *  @see #containsRolePresentation
 *  @see #iteratorRolePresentation
 *  @see #clearRolePresentation
 *  @see #sizeRolePresentation
 */
// -beg- preserve=no 3D46531B03CD add_head3C2C43470264 "Association::addRolePresentation"
public void addRolePresentation(PresentationRole rolePresentation1)
// -end- 3D46531B03CD add_head3C2C43470264 "Association::addRolePresentation"
{
        // -beg- preserve=no 3D46531B03CD add_body3C2C43470264 "Association::addRolePresentation"
        rolePresentation.add(rolePresentation1);
        rolePresentation1._linkAssociation(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addRolePresentation"));
        return;
        // -end- 3D46531B03CD add_body3C2C43470264 "Association::addRolePresentation"
}

/** disconnect a RolePresentation.
 *  @see #addRolePresentation
 */
// -beg- preserve=no 3D46531B03CD remove_head3C2C43470264 "Association::removeRolePresentation"
public PresentationRole removeRolePresentation(PresentationRole rolePresentation1)
// -end- 3D46531B03CD remove_head3C2C43470264 "Association::removeRolePresentation"
{
        // -beg- preserve=no 3D46531B03CD remove_body3C2C43470264 "Association::removeRolePresentation"
        PresentationRole ret=null;
        if(rolePresentation1==null || !rolePresentation.contains(rolePresentation1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = rolePresentation1;
        rolePresentation.remove(rolePresentation1);
        rolePresentation1._unlinkAssociation(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeRolePresentation"));
        return ret;
        // -end- 3D46531B03CD remove_body3C2C43470264 "Association::removeRolePresentation"
}

/** tests if a given RolePresentation is connected.
 *  @see #addRolePresentation
 */
// -beg- preserve=no 3D46531B03CD test_head3C2C43470264 "Association::containsRolePresentation"
public boolean containsRolePresentation(PresentationRole rolePresentation1)
// -end- 3D46531B03CD test_head3C2C43470264 "Association::containsRolePresentation"
{
        // -beg- preserve=no 3D46531B03CD test_body3C2C43470264 "Association::containsRolePresentation"
        return rolePresentation.contains(rolePresentation1);
        // -end- 3D46531B03CD test_body3C2C43470264 "Association::containsRolePresentation"
}

/** used to enumerate all connected RolePresentations.
 *  @see #addRolePresentation
 */
// -beg- preserve=no 3D46531B03CD get_all_head3C2C43470264 "Association::iteratorRolePresentation"
public java.util.Iterator iteratorRolePresentation()
// -end- 3D46531B03CD get_all_head3C2C43470264 "Association::iteratorRolePresentation"
{
        // -beg- preserve=no 3D46531B03CD get_all_body3C2C43470264 "Association::iteratorRolePresentation"
        return rolePresentation.iterator();
        // -end- 3D46531B03CD get_all_body3C2C43470264 "Association::iteratorRolePresentation"
}

/** disconnect all RolePresentations.
 *  @see #addRolePresentation
 */
// -beg- preserve=no 3D46531B03CD remove_all_head3C2C43470264 "Association::clearRolePresentation"
public void clearRolePresentation()
// -end- 3D46531B03CD remove_all_head3C2C43470264 "Association::clearRolePresentation"
{
        // -beg- preserve=no 3D46531B03CD remove_all_body3C2C43470264 "Association::clearRolePresentation"
        if(sizeRolePresentation()>0) {
                for(java.util.Iterator p = rolePresentation.iterator(); p.hasNext(); ) {
                        ((PresentationRole)p.next())._unlinkAssociation(this);
                }
                rolePresentation.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearRolePresentation"));
        }
        // -end- 3D46531B03CD remove_all_body3C2C43470264 "Association::clearRolePresentation"
}

/** returns the number of RolePresentations.
 *  @see #addRolePresentation
 */
// -beg- preserve=no 3D46531B03CD size_head3C2C43470264 "Association::sizeRolePresentation"
public int sizeRolePresentation()
// -end- 3D46531B03CD size_head3C2C43470264 "Association::sizeRolePresentation"
{
        // -beg- preserve=no 3D46531B03CD size_body3C2C43470264 "Association::sizeRolePresentation"
        return rolePresentation.size();
        // -end- 3D46531B03CD size_body3C2C43470264 "Association::sizeRolePresentation"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3D46531B03CD _link_body3C2C43470264 "Association::_linkRolePresentation"
public void _linkRolePresentation(PresentationRole rolePresentation1)
{
        rolePresentation.add(rolePresentation1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkRolePresentation"));
        return;
}
// -end- 3D46531B03CD _link_body3C2C43470264 "Association::_linkRolePresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3D46531B03CD _unlink_body3C2C43470264 "Association::_unlinkRolePresentation"
public void _unlinkRolePresentation(PresentationRole rolePresentation1)
{
        rolePresentation.remove(rolePresentation1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkRolePresentation"));
        return;
}
// -end- 3D46531B03CD _unlink_body3C2C43470264 "Association::_unlinkRolePresentation"

// -beg- preserve=no 3D465850037A code3C2C43470264 "linkPresentation"
private PresentationAssocClass linkPresentation;
// -end- 3D465850037A code3C2C43470264 "linkPresentation"

/** attaches a LinkPresentation.
 *
 *  @see #detachLinkPresentation
 *  @see #getLinkPresentation
 *  @see #containsLinkPresentation
 */
// -beg- preserve=no 3D465850037A attach_head3C2C43470264 "Association::attachLinkPresentation"
public void attachLinkPresentation(PresentationAssocClass linkPresentation1)
// -end- 3D465850037A attach_head3C2C43470264 "Association::attachLinkPresentation"
{
        // -beg- preserve=no 3D465850037A attach_body3C2C43470264 "Association::attachLinkPresentation"
        if(linkPresentation!=null) {throw new java.lang.IllegalStateException("already a linkPresentation attached");}
        if(linkPresentation1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as linkPresentation");}
        linkPresentation = linkPresentation1;
        linkPresentation1._linkAssociation(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachLinkPresentation"));
        return;
        // -end- 3D465850037A attach_body3C2C43470264 "Association::attachLinkPresentation"
}

/** disconnect the currently attached LinkPresentation.
 *  @see #attachLinkPresentation
 */
// -beg- preserve=no 3D465850037A detach_head3C2C43470264 "Association::detachLinkPresentation"
public PresentationAssocClass detachLinkPresentation()
// -end- 3D465850037A detach_head3C2C43470264 "Association::detachLinkPresentation"
{
        // -beg- preserve=no 3D465850037A detach_body3C2C43470264 "Association::detachLinkPresentation"
        PresentationAssocClass ret = null;
        if(linkPresentation!=null) {
                linkPresentation._unlinkAssociation(this);
                ret = linkPresentation;
                linkPresentation = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachLinkPresentation"));
        return ret;
        // -end- 3D465850037A detach_body3C2C43470264 "Association::detachLinkPresentation"
}

/** get the currently attached LinkPresentation.
 *  @see #attachLinkPresentation
 */
// -beg- preserve=no 3D465850037A get_head3C2C43470264 "Association::getLinkPresentation"
public PresentationAssocClass getLinkPresentation()
// -end- 3D465850037A get_head3C2C43470264 "Association::getLinkPresentation"
{
        // -beg- preserve=no 3D465850037A get_body3C2C43470264 "Association::getLinkPresentation"
        if(linkPresentation==null) {throw new java.lang.IllegalStateException("no linkPresentation attached");}
        return linkPresentation;
        // -end- 3D465850037A get_body3C2C43470264 "Association::getLinkPresentation"
}

/** tests if there is a LinkPresentation attached.
 *  @see #attachLinkPresentation
 */
// -beg- preserve=no 3D465850037A test_head3C2C43470264 "Association::containsLinkPresentation"
public boolean containsLinkPresentation()
// -end- 3D465850037A test_head3C2C43470264 "Association::containsLinkPresentation"
{
        // -beg- preserve=no 3D465850037A test_body3C2C43470264 "Association::containsLinkPresentation"
        return linkPresentation!=null;
        // -end- 3D465850037A test_body3C2C43470264 "Association::containsLinkPresentation"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3D465850037A _link_body3C2C43470264 "Association::_linkLinkPresentation"
public void _linkLinkPresentation(PresentationAssocClass linkPresentation1)
{
        linkPresentation = linkPresentation1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLinkPresentation"));
        return;
}
// -end- 3D465850037A _link_body3C2C43470264 "Association::_linkLinkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3D465850037A _unlink_body3C2C43470264 "Association::_unlinkLinkPresentation"
public void _unlinkLinkPresentation(PresentationAssocClass linkPresentation1)
{
        linkPresentation = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLinkPresentation"));
        return;
}
// -end- 3D465850037A _unlink_body3C2C43470264 "Association::_unlinkLinkPresentation"

// -beg- preserve=no 362409A803C0 code3C2C43470264 "subject"

// -end- 362409A803C0 code3C2C43470264 "subject"

/** add a Subject.
 *
 *  @see #removeSubject
 *  @see #containsSubject
 *  @see #iteratorSubject
 *  @see #clearSubject
 *  @see #sizeSubject
 */
// -beg- preserve=no 362409A803C0 add_head3C2C43470264 "PresentationElement::addSubject"
public void addSubject(ModelElement subject1)
// -end- 362409A803C0 add_head3C2C43470264 "PresentationElement::addSubject"
{
        // -beg- preserve=no 362409A803C0 add_body3C2C43470264 "PresentationElement::addSubject"
        super.addSubject(subject1);
        // -end- 362409A803C0 add_body3C2C43470264 "PresentationElement::addSubject"
}

/** disconnect a Subject.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 remove_head3C2C43470264 "PresentationElement::removeSubject"
public ModelElement removeSubject(ModelElement subject1)
// -end- 362409A803C0 remove_head3C2C43470264 "PresentationElement::removeSubject"
{
        // -beg- preserve=no 362409A803C0 remove_body3C2C43470264 "PresentationElement::removeSubject"
        return super.removeSubject(subject1);
        // -end- 362409A803C0 remove_body3C2C43470264 "PresentationElement::removeSubject"
}

/** tests if a given Subject is connected.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 test_head3C2C43470264 "PresentationElement::containsSubject"
public boolean containsSubject(ModelElement subject1)
// -end- 362409A803C0 test_head3C2C43470264 "PresentationElement::containsSubject"
{
        // -beg- preserve=no 362409A803C0 test_body3C2C43470264 "PresentationElement::containsSubject"
        return super.containsSubject(subject1);
        // -end- 362409A803C0 test_body3C2C43470264 "PresentationElement::containsSubject"
}

/** used to enumerate all connected Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 get_all_head3C2C43470264 "PresentationElement::iteratorSubject"
public java.util.Iterator iteratorSubject()
// -end- 362409A803C0 get_all_head3C2C43470264 "PresentationElement::iteratorSubject"
{
        // -beg- preserve=no 362409A803C0 get_all_body3C2C43470264 "PresentationElement::iteratorSubject"
        return super.iteratorSubject();
        // -end- 362409A803C0 get_all_body3C2C43470264 "PresentationElement::iteratorSubject"
}

/** disconnect all Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 remove_all_head3C2C43470264 "PresentationElement::clearSubject"
public void clearSubject()
// -end- 362409A803C0 remove_all_head3C2C43470264 "PresentationElement::clearSubject"
{
        // -beg- preserve=no 362409A803C0 remove_all_body3C2C43470264 "PresentationElement::clearSubject"
        super.clearSubject();
        // -end- 362409A803C0 remove_all_body3C2C43470264 "PresentationElement::clearSubject"
}

/** returns the number of Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 size_head3C2C43470264 "PresentationElement::sizeSubject"
public int sizeSubject()
// -end- 362409A803C0 size_head3C2C43470264 "PresentationElement::sizeSubject"
{
        // -beg- preserve=no 362409A803C0 size_body3C2C43470264 "PresentationElement::sizeSubject"
        return super.sizeSubject();
        // -end- 362409A803C0 size_body3C2C43470264 "PresentationElement::sizeSubject"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A803C0 _link_body3C2C43470264 "PresentationElement::_linkSubject"
public void _linkSubject(ModelElement subject1)
{
        super._linkSubject(subject1);
}
// -end- 362409A803C0 _link_body3C2C43470264 "PresentationElement::_linkSubject"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A803C0 _unlink_body3C2C43470264 "PresentationElement::_unlinkSubject"
public void _unlinkSubject(ModelElement subject1)
{
        super._unlinkSubject(subject1);
}
// -end- 362409A803C0 _unlink_body3C2C43470264 "PresentationElement::_unlinkSubject"

// -beg- preserve=no 3E410253002A var3C2C43470264 "showName"
private boolean showName = false;
// -end- 3E410253002A var3C2C43470264 "showName"

/** get current value of showName
 *  @see #setShowName
 */
// -beg- preserve=no 3E410253002A get_head3C2C43470264 "showName"
public boolean isShowName()
// -end- 3E410253002A get_head3C2C43470264 "showName"
{
        // -beg- preserve=no 3E410253002A get_body3C2C43470264 "showName"
        return showName;
        // -end- 3E410253002A get_body3C2C43470264 "showName"
}

/** set current value of showName
 *  @see #isShowName
 */
// -beg- preserve=no 3E410253002A set_head3C2C43470264 "showName"
public void setShowName(boolean value1)
// -end- 3E410253002A set_head3C2C43470264 "showName"
{
        // -beg- preserve=no 3E410253002A set_body3C2C43470264 "showName"
        if(showName != value1) {
                showName = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowName"));
        }
        // -end- 3E410253002A set_body3C2C43470264 "showName"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=yes 3C2C43470264 detail_end "Association"

/** Tests if the assocciation class is visible.
 */
public boolean isAssocClassVisible()
{
        java.util.Iterator subji=iteratorSubject();
        if(!subji.hasNext()) return false;
        ch.ehi.uml1_4.foundation.core.Association subject
                =(ch.ehi.uml1_4.foundation.core.Association)subji.next();
        if(!(subject instanceof AssociationClass)) {
                return false;
        }
        AssociationClass assoc=(AssociationClass)subject;
        if(assoc.sizeGeneralization()>0) return true;
        if(assoc.sizeSpecialization()>0) return true;
        if(assoc.sizeFeature()>0) return true;
        return false;
}

// -end- 3C2C43470264 detail_end "Association"

}
