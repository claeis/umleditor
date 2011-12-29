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


// -beg- preserve=no 4EF997E40008 package "RefAttrType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 4EF997E40008 package "RefAttrType"

// -beg- preserve=no 4EF997E40008 autoimport "RefAttrType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 4EF997E40008 autoimport "RefAttrType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4EF997E40008 import "RefAttrType"

// -end- 4EF997E40008 import "RefAttrType"

/** @author Claude Eisenhut
 *  @version $Revision: 1.19 $ $Date: 2003/12/21 16:25:30 $
 */
public class RefAttrType extends BaseType
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4EF997E40008 detail_begin "RefAttrType"

  // -end- 4EF997E40008 detail_begin "RefAttrType"

  // -beg- preserve=no 4EF999F2009D head4EF997E40008 "unlinkAll"
  public void unlinkAll()
  // -end- 4EF999F2009D head4EF997E40008 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4EF999F2009D throws4EF997E40008 "unlinkAll"

    // -end- 4EF999F2009D throws4EF997E40008 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4EF999F2009D body4EF997E40008 "unlinkAll"
    
    clearRestrictedTo();
    detachParticipant();
    super.unlinkAll();
    // -end- 4EF999F2009D body4EF997E40008 "unlinkAll"
    }

  // -beg- preserve=no 4EF999F7005E head4EF997E40008 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 4EF999F7005E head4EF997E40008 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4EF999F7005E throws4EF997E40008 "enumerateChildren"

    // -end- 4EF999F7005E throws4EF997E40008 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4EF999F7005E body4EF997E40008 "enumerateChildren"
    java.util.Iterator it=null;
    super.enumerateChildren(visitor);
    // -end- 4EF999F7005E body4EF997E40008 "enumerateChildren"
    }

  // -beg- preserve=no 4EF99D22005C code4EF997E40008 "restrictedTo"
  private java.util.Set restrictedTo = new java.util.HashSet();
  // -end- 4EF99D22005C code4EF997E40008 "restrictedTo"

  /** add a RestrictedTo.
   *  
   *  @see #removeRestrictedTo
   *  @see #containsRestrictedTo
   *  @see #iteratorRestrictedTo
   *  @see #clearRestrictedTo
   *  @see #sizeRestrictedTo
   */
  // -beg- preserve=no 4EF99D22005C add_head4EF997E40008 "RefAttrType::addRestrictedTo"
  public void addRestrictedTo(AbstractClassDef restrictedTo1)
  // -end- 4EF99D22005C add_head4EF997E40008 "RefAttrType::addRestrictedTo"
  {
    // -beg- preserve=no 4EF99D22005C add_body4EF997E40008 "RefAttrType::addRestrictedTo"
    restrictedTo.add(restrictedTo1);
    restrictedTo1._linkRestrictedRefAttrType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addRestrictedTo"));
    return;
    // -end- 4EF99D22005C add_body4EF997E40008 "RefAttrType::addRestrictedTo"
  }

  /** disconnect a RestrictedTo.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99D22005C remove_head4EF997E40008 "RefAttrType::removeRestrictedTo"
  public AbstractClassDef removeRestrictedTo(AbstractClassDef restrictedTo1)
  // -end- 4EF99D22005C remove_head4EF997E40008 "RefAttrType::removeRestrictedTo"
  {
    // -beg- preserve=no 4EF99D22005C remove_body4EF997E40008 "RefAttrType::removeRestrictedTo"
    AbstractClassDef ret=null;
    if(restrictedTo1==null || !restrictedTo.contains(restrictedTo1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = restrictedTo1;
    restrictedTo.remove(restrictedTo1);
    restrictedTo1._unlinkRestrictedRefAttrType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeRestrictedTo"));
    return ret;
    // -end- 4EF99D22005C remove_body4EF997E40008 "RefAttrType::removeRestrictedTo"
  }

  /** tests if a given RestrictedTo is connected.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99D22005C test_head4EF997E40008 "RefAttrType::containsRestrictedTo"
  public boolean containsRestrictedTo(AbstractClassDef restrictedTo1)
  // -end- 4EF99D22005C test_head4EF997E40008 "RefAttrType::containsRestrictedTo"
  {
    // -beg- preserve=no 4EF99D22005C test_body4EF997E40008 "RefAttrType::containsRestrictedTo"
    return restrictedTo.contains(restrictedTo1);
    // -end- 4EF99D22005C test_body4EF997E40008 "RefAttrType::containsRestrictedTo"
  }

  /** used to enumerate all connected RestrictedTos.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99D22005C get_all_head4EF997E40008 "RefAttrType::iteratorRestrictedTo"
  public java.util.Iterator iteratorRestrictedTo()
  // -end- 4EF99D22005C get_all_head4EF997E40008 "RefAttrType::iteratorRestrictedTo"
  {
    // -beg- preserve=no 4EF99D22005C get_all_body4EF997E40008 "RefAttrType::iteratorRestrictedTo"
    return restrictedTo.iterator();
    // -end- 4EF99D22005C get_all_body4EF997E40008 "RefAttrType::iteratorRestrictedTo"
  }

  /** disconnect all RestrictedTos.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99D22005C remove_all_head4EF997E40008 "RefAttrType::clearRestrictedTo"
  public void clearRestrictedTo()
  // -end- 4EF99D22005C remove_all_head4EF997E40008 "RefAttrType::clearRestrictedTo"
  {
    // -beg- preserve=no 4EF99D22005C remove_all_body4EF997E40008 "RefAttrType::clearRestrictedTo"
    if(sizeRestrictedTo()>0){
      for(java.util.Iterator p = restrictedTo.iterator(); p.hasNext();){
        ((AbstractClassDef)p.next())._unlinkRestrictedRefAttrType(this);
      }
      restrictedTo.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearRestrictedTo"));
    }
    // -end- 4EF99D22005C remove_all_body4EF997E40008 "RefAttrType::clearRestrictedTo"
  }

  /** returns the number of RestrictedTos.
   *  @see #addRestrictedTo
   */
  // -beg- preserve=no 4EF99D22005C size_head4EF997E40008 "RefAttrType::sizeRestrictedTo"
  public int sizeRestrictedTo()
  // -end- 4EF99D22005C size_head4EF997E40008 "RefAttrType::sizeRestrictedTo"
  {
    // -beg- preserve=no 4EF99D22005C size_body4EF997E40008 "RefAttrType::sizeRestrictedTo"
    return restrictedTo.size();
    // -end- 4EF99D22005C size_body4EF997E40008 "RefAttrType::sizeRestrictedTo"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99D22005C _link_body4EF997E40008 "RefAttrType::_linkRestrictedTo"
  public void _linkRestrictedTo(AbstractClassDef restrictedTo1)
  {
    restrictedTo.add(restrictedTo1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkRestrictedTo"));
    return;
  }
  // -end- 4EF99D22005C _link_body4EF997E40008 "RefAttrType::_linkRestrictedTo"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99D22005C _unlink_body4EF997E40008 "RefAttrType::_unlinkRestrictedTo"
  public void _unlinkRestrictedTo(AbstractClassDef restrictedTo1)
  {
    restrictedTo.remove(restrictedTo1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkRestrictedTo"));
    return;
  }
  // -end- 4EF99D22005C _unlink_body4EF997E40008 "RefAttrType::_unlinkRestrictedTo"

  // -beg- preserve=no 4EF99D2B0099 code4EF997E40008 "participant"
  private AbstractClassDef participant;
  // -end- 4EF99D2B0099 code4EF997E40008 "participant"

  /** attaches a Participant.
   *  
   *  @see #detachParticipant
   *  @see #getParticipant
   *  @see #containsParticipant
   */
  // -beg- preserve=no 4EF99D2B0099 attach_head4EF997E40008 "RefAttrType::attachParticipant"
  public void attachParticipant(AbstractClassDef participant1)
  // -end- 4EF99D2B0099 attach_head4EF997E40008 "RefAttrType::attachParticipant"
  {
    // -beg- preserve=no 4EF99D2B0099 attach_body4EF997E40008 "RefAttrType::attachParticipant"
    if(participant!=null) {throw new java.lang.IllegalStateException("already a participant attached");}
    if(participant1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as participant");}
    participant = participant1;
    participant1._linkRefAttrType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachParticipant"));
    return;
    // -end- 4EF99D2B0099 attach_body4EF997E40008 "RefAttrType::attachParticipant"
  }

  /** disconnect the currently attached Participant.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 4EF99D2B0099 detach_head4EF997E40008 "RefAttrType::detachParticipant"
  public AbstractClassDef detachParticipant()
  // -end- 4EF99D2B0099 detach_head4EF997E40008 "RefAttrType::detachParticipant"
  {
    // -beg- preserve=no 4EF99D2B0099 detach_body4EF997E40008 "RefAttrType::detachParticipant"
    AbstractClassDef ret = null;
    if(participant!=null){
      participant._unlinkRefAttrType(this);
      ret = participant;
      participant = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachParticipant"));
    return ret;
    // -end- 4EF99D2B0099 detach_body4EF997E40008 "RefAttrType::detachParticipant"
  }

  /** get the currently attached Participant.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 4EF99D2B0099 get_head4EF997E40008 "RefAttrType::getParticipant"
  public AbstractClassDef getParticipant()
  // -end- 4EF99D2B0099 get_head4EF997E40008 "RefAttrType::getParticipant"
  {
    // -beg- preserve=no 4EF99D2B0099 get_body4EF997E40008 "RefAttrType::getParticipant"
    if(participant==null) {throw new java.lang.IllegalStateException("no participant attached");}
    return participant;
    // -end- 4EF99D2B0099 get_body4EF997E40008 "RefAttrType::getParticipant"
  }

  /** tests if there is a Participant attached.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 4EF99D2B0099 test_head4EF997E40008 "RefAttrType::containsParticipant"
  public boolean containsParticipant()
  // -end- 4EF99D2B0099 test_head4EF997E40008 "RefAttrType::containsParticipant"
  {
    // -beg- preserve=no 4EF99D2B0099 test_body4EF997E40008 "RefAttrType::containsParticipant"
    return participant!=null;
    // -end- 4EF99D2B0099 test_body4EF997E40008 "RefAttrType::containsParticipant"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99D2B0099 _link_body4EF997E40008 "RefAttrType::_linkParticipant"
  public void _linkParticipant(AbstractClassDef participant1)
  {
    participant = participant1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkParticipant"));
    return;
  }
  // -end- 4EF99D2B0099 _link_body4EF997E40008 "RefAttrType::_linkParticipant"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4EF99D2B0099 _unlink_body4EF997E40008 "RefAttrType::_unlinkParticipant"
  public void _unlinkParticipant(AbstractClassDef participant1)
  {
    participant = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkParticipant"));
    return;
  }
  // -end- 4EF99D2B0099 _unlink_body4EF997E40008 "RefAttrType::_unlinkParticipant"

  // -beg- preserve=no 4EF99AE70219 var4EF997E40008 "propExternal"
  private boolean propExternal = false;
  // -end- 4EF99AE70219 var4EF997E40008 "propExternal"

  /** get current value of propExternal
   *  @see #setPropExternal
   */
  // -beg- preserve=no 4EF99AE70219 get_head4EF997E40008 "propExternal"
  public  boolean isPropExternal()
  // -end- 4EF99AE70219 get_head4EF997E40008 "propExternal"
  {
    // -beg- preserve=no 4EF99AE70219 get_body4EF997E40008 "propExternal"
    return propExternal;
    // -end- 4EF99AE70219 get_body4EF997E40008 "propExternal"
  }

  /** set current value of propExternal
   *  @see #isPropExternal
   */
  // -beg- preserve=no 4EF99AE70219 set_head4EF997E40008 "propExternal"
  public  void setPropExternal(boolean value1)
  // -end- 4EF99AE70219 set_head4EF997E40008 "propExternal"
  {
    // -beg- preserve=no 4EF99AE70219 set_body4EF997E40008 "propExternal"
    if(propExternal != value1){
      propExternal = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPropExternal"));
    }
    // -end- 4EF99AE70219 set_body4EF997E40008 "propExternal"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4EF997E40008 detail_end "RefAttrType"

  // -end- 4EF997E40008 detail_end "RefAttrType"

}

