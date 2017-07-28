// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:43 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3384B14F035C package "AssociationEndRole"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 3384B14F035C package "AssociationEndRole"

// -beg- preserve=no 3384B14F035C autoimport "AssociationEndRole"
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.behaviour.collaborations.AssociationRole;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.foundation.core.Attribute;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 3384B14F035C autoimport "AssociationEndRole"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3384B14F035C import "AssociationEndRole"

// -end- 3384B14F035C import "AssociationEndRole"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:43 $
 */
public interface AssociationEndRole extends AssociationEnd, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3384B14F035C detail_begin "AssociationEndRole"

// -end- 3384B14F035C detail_begin "AssociationEndRole"

/** attaches a AssociationRole.
 *
 *  @see #detachAssociationRole
 *  @see #getAssociationRole
 *  @see #containsAssociationRole
 */
// -beg- preserve=no 3388E27703B6 attach_head3384B14F035C "AssociationEndRole::attachAssociationRole"
public void attachAssociationRole(AssociationRole associationRole1)
// -end- 3388E27703B6 attach_head3384B14F035C "AssociationEndRole::attachAssociationRole"
;     // empty

/** disconnect the currently attached AssociationRole.
 *  @see #attachAssociationRole
 */
// -beg- preserve=no 3388E27703B6 detach_head3384B14F035C "AssociationEndRole::detachAssociationRole"
public AssociationRole detachAssociationRole()
// -end- 3388E27703B6 detach_head3384B14F035C "AssociationEndRole::detachAssociationRole"
;     // empty

/** get the currently attached AssociationRole.
 *  @see #attachAssociationRole
 */
// -beg- preserve=no 3388E27703B6 get_head3384B14F035C "AssociationEndRole::getAssociationRole"
public AssociationRole getAssociationRole()
// -end- 3388E27703B6 get_head3384B14F035C "AssociationEndRole::getAssociationRole"
;     // empty

/** tests if there is a AssociationRole attached.
 *  @see #attachAssociationRole
 */
// -beg- preserve=no 3388E27703B6 test_head3384B14F035C "AssociationEndRole::containsAssociationRole"
public boolean containsAssociationRole()
// -end- 3388E27703B6 test_head3384B14F035C "AssociationEndRole::containsAssociationRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3388E27703B6 _link_body3384B14F035C "AssociationEndRole::_linkAssociationRole"
public void _linkAssociationRole(AssociationRole associationRole1);
// -end- 3388E27703B6 _link_body3384B14F035C "AssociationEndRole::_linkAssociationRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3388E27703B6 _unlink_body3384B14F035C "AssociationEndRole::_unlinkAssociationRole"
public void _unlinkAssociationRole(AssociationRole associationRole1);
// -end- 3388E27703B6 _unlink_body3384B14F035C "AssociationEndRole::_unlinkAssociationRole"

/** attaches a Type.
 *
 *  @see #detachType
 *  @see #getType
 *  @see #containsType
 */
// -beg- preserve=no 33CD4F7101B8 attach_head3384B14F035C "AssociationEndRole::attachType"
public void attachType(ClassifierRole type1)
// -end- 33CD4F7101B8 attach_head3384B14F035C "AssociationEndRole::attachType"
;     // empty

/** disconnect the currently attached Type.
 *  @see #attachType
 */
// -beg- preserve=no 33CD4F7101B8 detach_head3384B14F035C "AssociationEndRole::detachType"
public ClassifierRole detachType()
// -end- 33CD4F7101B8 detach_head3384B14F035C "AssociationEndRole::detachType"
;     // empty

/** get the currently attached Type.
 *  @see #attachType
 */
// -beg- preserve=no 33CD4F7101B8 get_head3384B14F035C "AssociationEndRole::getType"
public ClassifierRole getType()
// -end- 33CD4F7101B8 get_head3384B14F035C "AssociationEndRole::getType"
;     // empty

/** tests if there is a Type attached.
 *  @see #attachType
 */
// -beg- preserve=no 33CD4F7101B8 test_head3384B14F035C "AssociationEndRole::containsType"
public boolean containsType()
// -end- 33CD4F7101B8 test_head3384B14F035C "AssociationEndRole::containsType"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD4F7101B8 _link_body3384B14F035C "AssociationEndRole::_linkType"
public void _linkType(ClassifierRole type1);
// -end- 33CD4F7101B8 _link_body3384B14F035C "AssociationEndRole::_linkType"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD4F7101B8 _unlink_body3384B14F035C "AssociationEndRole::_unlinkType"
public void _unlinkType(ClassifierRole type1);
// -end- 33CD4F7101B8 _unlink_body3384B14F035C "AssociationEndRole::_unlinkType"

/** attaches a Base.
 *
 *  @see #detachBase
 *  @see #getBase
 *  @see #containsBase
 */
// -beg- preserve=no 33CD50FB001E attach_head3384B14F035C "AssociationEndRole::attachBase"
public void attachBase(AssociationEnd base1)
// -end- 33CD50FB001E attach_head3384B14F035C "AssociationEndRole::attachBase"
;     // empty

/** disconnect the currently attached Base.
 *  @see #attachBase
 */
// -beg- preserve=no 33CD50FB001E detach_head3384B14F035C "AssociationEndRole::detachBase"
public AssociationEnd detachBase()
// -end- 33CD50FB001E detach_head3384B14F035C "AssociationEndRole::detachBase"
;     // empty

/** get the currently attached Base.
 *  @see #attachBase
 */
// -beg- preserve=no 33CD50FB001E get_head3384B14F035C "AssociationEndRole::getBase"
public AssociationEnd getBase()
// -end- 33CD50FB001E get_head3384B14F035C "AssociationEndRole::getBase"
;     // empty

/** tests if there is a Base attached.
 *  @see #attachBase
 */
// -beg- preserve=no 33CD50FB001E test_head3384B14F035C "AssociationEndRole::containsBase"
public boolean containsBase()
// -end- 33CD50FB001E test_head3384B14F035C "AssociationEndRole::containsBase"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD50FB001E _link_body3384B14F035C "AssociationEndRole::_linkBase"
public void _linkBase(AssociationEnd base1);
// -end- 33CD50FB001E _link_body3384B14F035C "AssociationEndRole::_linkBase"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD50FB001E _unlink_body3384B14F035C "AssociationEndRole::_unlinkBase"
public void _unlinkBase(AssociationEnd base1);
// -end- 33CD50FB001E _unlink_body3384B14F035C "AssociationEndRole::_unlinkBase"

/** add a AvailableQualifier.
 *
 *  @see #removeAvailableQualifier
 *  @see #containsAvailableQualifier
 *  @see #iteratorAvailableQualifier
 *  @see #clearAvailableQualifier
 *  @see #sizeAvailableQualifier
 */
// -beg- preserve=no 3650E6BE005A add_head3384B14F035C "AssociationEndRole::addAvailableQualifier"
public void addAvailableQualifier(Attribute availableQualifier1)
// -end- 3650E6BE005A add_head3384B14F035C "AssociationEndRole::addAvailableQualifier"
;     // empty

/** disconnect a AvailableQualifier.
 *  @see #addAvailableQualifier
 */
// -beg- preserve=no 3650E6BE005A remove_head3384B14F035C "AssociationEndRole::removeAvailableQualifier"
public Attribute removeAvailableQualifier(Attribute availableQualifier1)
// -end- 3650E6BE005A remove_head3384B14F035C "AssociationEndRole::removeAvailableQualifier"
;     // empty

/** tests if a given AvailableQualifier is connected.
 *  @see #addAvailableQualifier
 */
// -beg- preserve=no 3650E6BE005A test_head3384B14F035C "AssociationEndRole::containsAvailableQualifier"
public boolean containsAvailableQualifier(Attribute availableQualifier1)
// -end- 3650E6BE005A test_head3384B14F035C "AssociationEndRole::containsAvailableQualifier"
;     // empty

/** used to enumerate all connected AvailableQualifiers.
 *  @see #addAvailableQualifier
 */
// -beg- preserve=no 3650E6BE005A get_all_head3384B14F035C "AssociationEndRole::iteratorAvailableQualifier"
public java.util.Iterator iteratorAvailableQualifier()
// -end- 3650E6BE005A get_all_head3384B14F035C "AssociationEndRole::iteratorAvailableQualifier"
;     // empty

/** disconnect all AvailableQualifiers.
 *  @see #addAvailableQualifier
 */
// -beg- preserve=no 3650E6BE005A remove_all_head3384B14F035C "AssociationEndRole::clearAvailableQualifier"
public void clearAvailableQualifier()
// -end- 3650E6BE005A remove_all_head3384B14F035C "AssociationEndRole::clearAvailableQualifier"
;     // empty

/** returns the number of AvailableQualifiers.
 *  @see #addAvailableQualifier
 */
// -beg- preserve=no 3650E6BE005A size_head3384B14F035C "AssociationEndRole::sizeAvailableQualifier"
public int sizeAvailableQualifier()
// -end- 3650E6BE005A size_head3384B14F035C "AssociationEndRole::sizeAvailableQualifier"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650E6BE005A _link_body3384B14F035C "AssociationEndRole::_linkAvailableQualifier"
public void _linkAvailableQualifier(Attribute availableQualifier1);
// -end- 3650E6BE005A _link_body3384B14F035C "AssociationEndRole::_linkAvailableQualifier"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650E6BE005A _unlink_body3384B14F035C "AssociationEndRole::_unlinkAvailableQualifier"
public void _unlinkAvailableQualifier(Attribute availableQualifier1);
// -end- 3650E6BE005A _unlink_body3384B14F035C "AssociationEndRole::_unlinkAvailableQualifier"

/** get current value of collaborationMultiplicity
 *  @see #setCollaborationMultiplicity
 */
// -beg- preserve=no 374B943D00DA get_head3384B14F035C "collaborationMultiplicity"
Multiplicity getCollaborationMultiplicity()
// -end- 374B943D00DA get_head3384B14F035C "collaborationMultiplicity"
;     // empty
/** set current value of collaborationMultiplicity
 *  @see #getCollaborationMultiplicity
 */
// -beg- preserve=no 374B943D00DA set_head3384B14F035C "collaborationMultiplicity"
void setCollaborationMultiplicity(Multiplicity value1)
// -end- 374B943D00DA set_head3384B14F035C "collaborationMultiplicity"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3384B14F035C detail_end "AssociationEndRole"

// -end- 3384B14F035C detail_end "AssociationEndRole"

}
