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


// -beg- preserve=no 4EF997C80202 package "StructAttrType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 4EF997C80202 package "StructAttrType"

// -beg- preserve=no 4EF997C80202 autoimport "StructAttrType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 4EF997C80202 autoimport "StructAttrType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4EF997C80202 import "StructAttrType"

// -end- 4EF997C80202 import "StructAttrType"

/** @author Claude Eisenhut
 *  @version $Revision: 1.19 $ $Date: 2003/12/21 16:25:30 $
 */
public class StructAttrType extends BaseType
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4EF997C80202 detail_begin "StructAttrType"

  // -end- 4EF997C80202 detail_begin "StructAttrType"

  // -beg- preserve=no 4EF999970066 head4EF997C80202 "unlinkAll"
  public void unlinkAll()
  // -end- 4EF999970066 head4EF997C80202 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4EF999970066 throws4EF997C80202 "unlinkAll"

    // -end- 4EF999970066 throws4EF997C80202 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4EF999970066 body4EF997C80202 "unlinkAll"
    
    clearRestrictedTo();
    detachParticipant();
    super.unlinkAll();
    // -end- 4EF999970066 body4EF997C80202 "unlinkAll"
    }

  // -beg- preserve=no 4EF9999D0084 head4EF997C80202 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 4EF9999D0084 head4EF997C80202 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4EF9999D0084 throws4EF997C80202 "enumerateChildren"

    // -end- 4EF9999D0084 throws4EF997C80202 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4EF9999D0084 body4EF997C80202 "enumerateChildren"
    java.util.Iterator it=null;
    super.enumerateChildren(visitor);
    // -end- 4EF9999D0084 body4EF997C80202 "enumerateChildren"
    }

  // -beg- preserve=no 4EF99B6B02F8 code4EF997C80202 "restrictedTo"
  private java.util.Set restrictedTo = new java.util.HashSet();
  // -end- 4EF99B6B02F8 code4EF997C80202 "restrictedTo"

  /** add a RestrictedTo.
   *  
   *  @see #removeRestrictedTo
   *  @see #containsRestrictedTo
   *  @see #iteratorRestrictedTo
   *  @see #clearRestrictedTo
   *  @see #sizeRestrictedTo
   */
  // -beg- preserve=no 4EF99B6B02F8 add_head4EF997C80202 "StructAttrType::addRestrictedTo"
  public void addRestrictedTo(ClassDef restrictedTo1)
  // -end- 4EF99B6B02F8 add_head4EF997C80202 "StructAttrType::addRestrictedTo"
  {
    // -beg- preserve=no 4EF99B6B02F8 add_body4EF997C80202 "StructAttrType::addRestrictedTo"
    restrictedTo.add(restrictedTo1);
    restrictedTo1._linkRestrictedStructAttrType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addRestrictedTo"));
    return;
    // -end- 4EF99B6B02F8 add_body4EF997C80202 "StructAttrType::addRestrictedTo"
  }

  /** disconnect a RestrictedTo.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99B6B02F8 remove_head4EF997C80202 "StructAttrType::removeRestrictedTo"
  public ClassDef removeRestrictedTo(ClassDef restrictedTo1)
  // -end- 4EF99B6B02F8 remove_head4EF997C80202 "StructAttrType::removeRestrictedTo"
  {
    // -beg- preserve=no 4EF99B6B02F8 remove_body4EF997C80202 "StructAttrType::removeRestrictedTo"
    ClassDef ret=null;
    if(restrictedTo1==null || !restrictedTo.contains(restrictedTo1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = restrictedTo1;
    restrictedTo.remove(restrictedTo1);
    restrictedTo1._unlinkRestrictedStructAttrType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeRestrictedTo"));
    return ret;
    // -end- 4EF99B6B02F8 remove_body4EF997C80202 "StructAttrType::removeRestrictedTo"
  }

  /** tests if a given RestrictedTo is connected.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99B6B02F8 test_head4EF997C80202 "StructAttrType::containsRestrictedTo"
  public boolean containsRestrictedTo(ClassDef restrictedTo1)
  // -end- 4EF99B6B02F8 test_head4EF997C80202 "StructAttrType::containsRestrictedTo"
  {
    // -beg- preserve=no 4EF99B6B02F8 test_body4EF997C80202 "StructAttrType::containsRestrictedTo"
    return restrictedTo.contains(restrictedTo1);
    // -end- 4EF99B6B02F8 test_body4EF997C80202 "StructAttrType::containsRestrictedTo"
  }

  /** used to enumerate all connected RestrictedTos.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99B6B02F8 get_all_head4EF997C80202 "StructAttrType::iteratorRestrictedTo"
  public java.util.Iterator iteratorRestrictedTo()
  // -end- 4EF99B6B02F8 get_all_head4EF997C80202 "StructAttrType::iteratorRestrictedTo"
  {
    // -beg- preserve=no 4EF99B6B02F8 get_all_body4EF997C80202 "StructAttrType::iteratorRestrictedTo"
    return restrictedTo.iterator();
    // -end- 4EF99B6B02F8 get_all_body4EF997C80202 "StructAttrType::iteratorRestrictedTo"
  }

  /** disconnect all RestrictedTos.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99B6B02F8 remove_all_head4EF997C80202 "StructAttrType::clearRestrictedTo"
  public void clearRestrictedTo()
  // -end- 4EF99B6B02F8 remove_all_head4EF997C80202 "StructAttrType::clearRestrictedTo"
  {
    // -beg- preserve=no 4EF99B6B02F8 remove_all_body4EF997C80202 "StructAttrType::clearRestrictedTo"
    if(sizeRestrictedTo()>0){
      for(java.util.Iterator p = restrictedTo.iterator(); p.hasNext();){
        ((ClassDef)p.next())._unlinkRestrictedStructAttrType(this);
      }
      restrictedTo.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearRestrictedTo"));
    }
    // -end- 4EF99B6B02F8 remove_all_body4EF997C80202 "StructAttrType::clearRestrictedTo"
  }

  /** returns the number of RestrictedTos.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99B6B02F8 size_head4EF997C80202 "StructAttrType::sizeRestrictedTo"
  public int sizeRestrictedTo()
  // -end- 4EF99B6B02F8 size_head4EF997C80202 "StructAttrType::sizeRestrictedTo"
  {
    // -beg- preserve=no 4EF99B6B02F8 size_body4EF997C80202 "StructAttrType::sizeRestrictedTo"
    return restrictedTo.size();
    // -end- 4EF99B6B02F8 size_body4EF997C80202 "StructAttrType::sizeRestrictedTo"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99B6B02F8 _link_body4EF997C80202 "StructAttrType::_linkRestrictedTo"
  public void _linkRestrictedTo(ClassDef restrictedTo1)
  {
    restrictedTo.add(restrictedTo1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkRestrictedTo"));
    return;
  }
  // -end- 4EF99B6B02F8 _link_body4EF997C80202 "StructAttrType::_linkRestrictedTo"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99B6B02F8 _unlink_body4EF997C80202 "StructAttrType::_unlinkRestrictedTo"
  public void _unlinkRestrictedTo(ClassDef restrictedTo1)
  {
    restrictedTo.remove(restrictedTo1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkRestrictedTo"));
    return;
  }
  // -end- 4EF99B6B02F8 _unlink_body4EF997C80202 "StructAttrType::_unlinkRestrictedTo"

  // -beg- preserve=no 4EF99B7901DC code4EF997C80202 "participant"
  private ClassDef participant;
  // -end- 4EF99B7901DC code4EF997C80202 "participant"

  /** attaches a Participant.
   *  
   *  @see #detachParticipant
   *  @see #getParticipant
   *  @see #containsParticipant
   */
  // -beg- preserve=no 4EF99B7901DC attach_head4EF997C80202 "StructAttrType::attachParticipant"
  public void attachParticipant(ClassDef participant1)
  // -end- 4EF99B7901DC attach_head4EF997C80202 "StructAttrType::attachParticipant"
  {
    // -beg- preserve=no 4EF99B7901DC attach_body4EF997C80202 "StructAttrType::attachParticipant"
    if(participant!=null) {throw new java.lang.IllegalStateException("already a participant attached");}
    if(participant1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as participant");}
    participant = participant1;
    participant1._linkStructAttrType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachParticipant"));
    return;
    // -end- 4EF99B7901DC attach_body4EF997C80202 "StructAttrType::attachParticipant"
  }

  /** disconnect the currently attached Participant.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 4EF99B7901DC detach_head4EF997C80202 "StructAttrType::detachParticipant"
  public ClassDef detachParticipant()
  // -end- 4EF99B7901DC detach_head4EF997C80202 "StructAttrType::detachParticipant"
  {
    // -beg- preserve=no 4EF99B7901DC detach_body4EF997C80202 "StructAttrType::detachParticipant"
    ClassDef ret = null;
    if(participant!=null){
      participant._unlinkStructAttrType(this);
      ret = participant;
      participant = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachParticipant"));
    return ret;
    // -end- 4EF99B7901DC detach_body4EF997C80202 "StructAttrType::detachParticipant"
  }

  /** get the currently attached Participant.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 4EF99B7901DC get_head4EF997C80202 "StructAttrType::getParticipant"
  public ClassDef getParticipant()
  // -end- 4EF99B7901DC get_head4EF997C80202 "StructAttrType::getParticipant"
  {
    // -beg- preserve=no 4EF99B7901DC get_body4EF997C80202 "StructAttrType::getParticipant"
    if(participant==null) {throw new java.lang.IllegalStateException("no participant attached");}
    return participant;
    // -end- 4EF99B7901DC get_body4EF997C80202 "StructAttrType::getParticipant"
  }

  /** tests if there is a Participant attached.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 4EF99B7901DC test_head4EF997C80202 "StructAttrType::containsParticipant"
  public boolean containsParticipant()
  // -end- 4EF99B7901DC test_head4EF997C80202 "StructAttrType::containsParticipant"
  {
    // -beg- preserve=no 4EF99B7901DC test_body4EF997C80202 "StructAttrType::containsParticipant"
    return participant!=null;
    // -end- 4EF99B7901DC test_body4EF997C80202 "StructAttrType::containsParticipant"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99B7901DC _link_body4EF997C80202 "StructAttrType::_linkParticipant"
  public void _linkParticipant(ClassDef participant1)
  {
    participant = participant1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkParticipant"));
    return;
  }
  // -end- 4EF99B7901DC _link_body4EF997C80202 "StructAttrType::_linkParticipant"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99B7901DC _unlink_body4EF997C80202 "StructAttrType::_unlinkParticipant"
  public void _unlinkParticipant(ClassDef participant1)
  {
    participant = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkParticipant"));
    return;
  }
  // -end- 4EF99B7901DC _unlink_body4EF997C80202 "StructAttrType::_unlinkParticipant"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4EF997C80202 detail_end "StructAttrType"

  // -end- 4EF997C80202 detail_end "StructAttrType"

}

