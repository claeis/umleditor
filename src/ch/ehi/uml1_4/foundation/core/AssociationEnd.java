// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:20 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3340359400BD package "AssociationEnd"
package ch.ehi.uml1_4.foundation.core;
// -end- 3340359400BD package "AssociationEnd"

<<<<<<< HEAD
// -beg- preserve=no 3340359400BD autoimport "AssociationEnd"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.AssociationEndRole;
import ch.ehi.uml1_4.behaviour.commonbehavior.LinkEnd;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.foundation.core.Attribute;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.datatypes.OrderingKind;
import ch.ehi.uml1_4.foundation.datatypes.AggregationKind;
import ch.ehi.uml1_4.foundation.datatypes.ScopeKind;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
import ch.ehi.uml1_4.foundation.datatypes.ChangeableKind;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
// -end- 3340359400BD autoimport "AssociationEnd"
=======
import java.util.Iterator;

import ch.ehi.uml1_4.behaviour.collaborations.AssociationEndRole;
import ch.ehi.uml1_4.behaviour.commonbehavior.LinkEnd;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3340359400BD import "AssociationEnd"

// -end- 3340359400BD import "AssociationEnd"

/** An association end is an endpoint of an association, which connects the association to aclassifier.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:20 $
 */
<<<<<<< HEAD
public interface AssociationEnd extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3340359400BD detail_begin "AssociationEnd"

  // -end- 3340359400BD detail_begin "AssociationEnd"

  /** add a AssociationEndRole.
   *  
   *  @see #removeAssociationEndRole
   *  @see #containsAssociationEndRole
   *  @see #iteratorAssociationEndRole
   *  @see #clearAssociationEndRole
   *  @see #sizeAssociationEndRole
   */
  // -beg- preserve=no 33CD50F90302 add_head3340359400BD "AssociationEnd::addAssociationEndRole"
  public void addAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 33CD50F90302 add_head3340359400BD "AssociationEnd::addAssociationEndRole"
    ; // empty

  /** disconnect a AssociationEndRole.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD50F90302 remove_head3340359400BD "AssociationEnd::removeAssociationEndRole"
  public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 33CD50F90302 remove_head3340359400BD "AssociationEnd::removeAssociationEndRole"
    ; // empty

  /** tests if a given AssociationEndRole is connected.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD50F90302 test_head3340359400BD "AssociationEnd::containsAssociationEndRole"
  public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 33CD50F90302 test_head3340359400BD "AssociationEnd::containsAssociationEndRole"
    ; // empty

  /** used to enumerate all connected AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD50F90302 get_all_head3340359400BD "AssociationEnd::iteratorAssociationEndRole"
  public java.util.Iterator iteratorAssociationEndRole()
  // -end- 33CD50F90302 get_all_head3340359400BD "AssociationEnd::iteratorAssociationEndRole"
    ; // empty

  /** disconnect all AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD50F90302 remove_all_head3340359400BD "AssociationEnd::clearAssociationEndRole"
  public void clearAssociationEndRole()
  // -end- 33CD50F90302 remove_all_head3340359400BD "AssociationEnd::clearAssociationEndRole"
    ; // empty

  /** returns the number of AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD50F90302 size_head3340359400BD "AssociationEnd::sizeAssociationEndRole"
  public int sizeAssociationEndRole()
  // -end- 33CD50F90302 size_head3340359400BD "AssociationEnd::sizeAssociationEndRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD50F90302 _link_body3340359400BD "AssociationEnd::_linkAssociationEndRole"
  public void _linkAssociationEndRole(AssociationEndRole associationEndRole1);
  // -end- 33CD50F90302 _link_body3340359400BD "AssociationEnd::_linkAssociationEndRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD50F90302 _unlink_body3340359400BD "AssociationEnd::_unlinkAssociationEndRole"
  public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1);
  // -end- 33CD50F90302 _unlink_body3340359400BD "AssociationEnd::_unlinkAssociationEndRole"

  /** add a LinkEnd.
   *  
   *  @see #removeLinkEnd
   *  @see #containsLinkEnd
   *  @see #iteratorLinkEnd
   *  @see #clearLinkEnd
   *  @see #sizeLinkEnd
   */
  // -beg- preserve=no 328A5C1F029E add_head3340359400BD "AssociationEnd::addLinkEnd"
  public void addLinkEnd(LinkEnd linkEnd1)
  // -end- 328A5C1F029E add_head3340359400BD "AssociationEnd::addLinkEnd"
    ; // empty

  /** disconnect a LinkEnd.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 328A5C1F029E remove_head3340359400BD "AssociationEnd::removeLinkEnd"
  public LinkEnd removeLinkEnd(LinkEnd linkEnd1)
  // -end- 328A5C1F029E remove_head3340359400BD "AssociationEnd::removeLinkEnd"
    ; // empty

  /** tests if a given LinkEnd is connected.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 328A5C1F029E test_head3340359400BD "AssociationEnd::containsLinkEnd"
  public boolean containsLinkEnd(LinkEnd linkEnd1)
  // -end- 328A5C1F029E test_head3340359400BD "AssociationEnd::containsLinkEnd"
    ; // empty

  /** used to enumerate all connected LinkEnds.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 328A5C1F029E get_all_head3340359400BD "AssociationEnd::iteratorLinkEnd"
  public java.util.Iterator iteratorLinkEnd()
  // -end- 328A5C1F029E get_all_head3340359400BD "AssociationEnd::iteratorLinkEnd"
    ; // empty

  /** disconnect all LinkEnds.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 328A5C1F029E remove_all_head3340359400BD "AssociationEnd::clearLinkEnd"
  public void clearLinkEnd()
  // -end- 328A5C1F029E remove_all_head3340359400BD "AssociationEnd::clearLinkEnd"
    ; // empty

  /** returns the number of LinkEnds.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 328A5C1F029E size_head3340359400BD "AssociationEnd::sizeLinkEnd"
  public int sizeLinkEnd()
  // -end- 328A5C1F029E size_head3340359400BD "AssociationEnd::sizeLinkEnd"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5C1F029E _link_body3340359400BD "AssociationEnd::_linkLinkEnd"
  public void _linkLinkEnd(LinkEnd linkEnd1);
  // -end- 328A5C1F029E _link_body3340359400BD "AssociationEnd::_linkLinkEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5C1F029E _unlink_body3340359400BD "AssociationEnd::_unlinkLinkEnd"
  public void _unlinkLinkEnd(LinkEnd linkEnd1);
  // -end- 328A5C1F029E _unlink_body3340359400BD "AssociationEnd::_unlinkLinkEnd"

  /** attaches a Association.
   *  
   *  @see #detachAssociation
   *  @see #getAssociation
   *  @see #containsAssociation
   */
  // -beg- preserve=no 32A2A510017B attach_head3340359400BD "AssociationEnd::attachAssociation"
  public void attachAssociation(Association association1)
  // -end- 32A2A510017B attach_head3340359400BD "AssociationEnd::attachAssociation"
    ; // empty

  /** disconnect the currently attached Association.
   *  @see #attachAssociation
   */
  // -beg- preserve=no 32A2A510017B detach_head3340359400BD "AssociationEnd::detachAssociation"
  public Association detachAssociation()
  // -end- 32A2A510017B detach_head3340359400BD "AssociationEnd::detachAssociation"
    ; // empty

  /** get the currently attached Association.
   *  @see #attachAssociation
   */
  // -beg- preserve=no 32A2A510017B get_head3340359400BD "AssociationEnd::getAssociation"
  public Association getAssociation()
  // -end- 32A2A510017B get_head3340359400BD "AssociationEnd::getAssociation"
    ; // empty

  /** tests if there is a Association attached.
   *  @see #attachAssociation
   */
  // -beg- preserve=no 32A2A510017B test_head3340359400BD "AssociationEnd::containsAssociation"
  public boolean containsAssociation()
  // -end- 32A2A510017B test_head3340359400BD "AssociationEnd::containsAssociation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32A2A510017B _link_body3340359400BD "AssociationEnd::_linkAssociation"
  public void _linkAssociation(Association association1);
  // -end- 32A2A510017B _link_body3340359400BD "AssociationEnd::_linkAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32A2A510017B _unlink_body3340359400BD "AssociationEnd::_unlinkAssociation"
  public void _unlinkAssociation(Association association1);
  // -end- 32A2A510017B _unlink_body3340359400BD "AssociationEnd::_unlinkAssociation"

  /** add a Qualifier.
   *  
   *  @see #removeQualifier
   *  @see #containsQualifier
   *  @see #iteratorQualifier
   *  @see #clearQualifier
   *  @see #sizeQualifier
   */
  // -beg- preserve=no 33DBE50B001F add_head3340359400BD "AssociationEnd::addQualifier"
  public void addQualifier(Attribute qualifier1)
  // -end- 33DBE50B001F add_head3340359400BD "AssociationEnd::addQualifier"
    ; // empty

  // -beg- preserve=no 33DBE50B001F add2_head3340359400BD "AssociationEnd::add2Qualifier"
  public void addQualifier(int index,Attribute qualifier1)
  // -end- 33DBE50B001F add2_head3340359400BD "AssociationEnd::add2Qualifier"
    ; // empty

  /** disconnect a Qualifier.
   *  @see #addQualifier
   */
  // -beg- preserve=no 33DBE50B001F remove_head3340359400BD "AssociationEnd::removeQualifier"
  public Attribute removeQualifier(Attribute qualifier1)
  // -end- 33DBE50B001F remove_head3340359400BD "AssociationEnd::removeQualifier"
    ; // empty

  /** disconnect a Qualifier.
   *  @see #addQualifier
   */
  // -beg- preserve=no 33DBE50B001F remove2_head3340359400BD "AssociationEnd::remove2Qualifier"
  public Attribute removeQualifier(int index)
  // -end- 33DBE50B001F remove2_head3340359400BD "AssociationEnd::remove2Qualifier"
    ; // empty

  /** change a Qualifier.
   *  @see #addQualifier
   */
  // -beg- preserve=no 33DBE50B001F set_head3340359400BD "AssociationEnd::setQualifier"
  public Attribute setQualifier(int index,Attribute qualifier1)
  // -end- 33DBE50B001F set_head3340359400BD "AssociationEnd::setQualifier"
    ; // empty

  /** tests if a given Qualifier is connected.
   *  @see #addQualifier
   */
  // -beg- preserve=no 33DBE50B001F test_head3340359400BD "AssociationEnd::containsQualifier"
  public boolean containsQualifier(Attribute qualifier1)
  // -end- 33DBE50B001F test_head3340359400BD "AssociationEnd::containsQualifier"
    ; // empty

  /** used to enumerate all connected Qualifiers.
   *  @see #addQualifier
   */
  // -beg- preserve=no 33DBE50B001F get_all_head3340359400BD "AssociationEnd::iteratorQualifier"
  public java.util.Iterator iteratorQualifier()
  // -end- 33DBE50B001F get_all_head3340359400BD "AssociationEnd::iteratorQualifier"
    ; // empty

  /** disconnect all Qualifiers.
   *  @see #addQualifier
   */
  // -beg- preserve=no 33DBE50B001F remove_all_head3340359400BD "AssociationEnd::clearQualifier"
  public void clearQualifier()
  // -end- 33DBE50B001F remove_all_head3340359400BD "AssociationEnd::clearQualifier"
    ; // empty

  /** returns the number of Qualifiers.
   *  @see #addQualifier
   */
  // -beg- preserve=no 33DBE50B001F size_head3340359400BD "AssociationEnd::sizeQualifier"
  public int sizeQualifier()
  // -end- 33DBE50B001F size_head3340359400BD "AssociationEnd::sizeQualifier"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBE50B001F _link_body3340359400BD "AssociationEnd::_linkQualifier"
  public void _linkQualifier(Attribute qualifier1);
  // -end- 33DBE50B001F _link_body3340359400BD "AssociationEnd::_linkQualifier"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBE50B001F _unlink_body3340359400BD "AssociationEnd::_unlinkQualifier"
  public void _unlinkQualifier(Attribute qualifier1);
  // -end- 33DBE50B001F _unlink_body3340359400BD "AssociationEnd::_unlinkQualifier"

  /** attaches a Participant.
   *  
   *  @see #detachParticipant
   *  @see #getParticipant
   *  @see #containsParticipant
   */
  // -beg- preserve=no 33E265070354 attach_head3340359400BD "AssociationEnd::attachParticipant"
  public void attachParticipant(Classifier participant1)
  // -end- 33E265070354 attach_head3340359400BD "AssociationEnd::attachParticipant"
    ; // empty

  /** disconnect the currently attached Participant.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 33E265070354 detach_head3340359400BD "AssociationEnd::detachParticipant"
  public Classifier detachParticipant()
  // -end- 33E265070354 detach_head3340359400BD "AssociationEnd::detachParticipant"
    ; // empty

  /** get the currently attached Participant.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 33E265070354 get_head3340359400BD "AssociationEnd::getParticipant"
  public Classifier getParticipant()
  // -end- 33E265070354 get_head3340359400BD "AssociationEnd::getParticipant"
    ; // empty

  /** tests if there is a Participant attached.
   *  @see #attachParticipant
   */
  // -beg- preserve=no 33E265070354 test_head3340359400BD "AssociationEnd::containsParticipant"
  public boolean containsParticipant()
  // -end- 33E265070354 test_head3340359400BD "AssociationEnd::containsParticipant"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070354 _link_body3340359400BD "AssociationEnd::_linkParticipant"
  public void _linkParticipant(Classifier participant1);
  // -end- 33E265070354 _link_body3340359400BD "AssociationEnd::_linkParticipant"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070354 _unlink_body3340359400BD "AssociationEnd::_unlinkParticipant"
  public void _unlinkParticipant(Classifier participant1);
  // -end- 33E265070354 _unlink_body3340359400BD "AssociationEnd::_unlinkParticipant"

  /** add a Specification.
   *  
   *  @see #removeSpecification
   *  @see #containsSpecification
   *  @see #iteratorSpecification
   *  @see #clearSpecification
   *  @see #sizeSpecification
   */
  // -beg- preserve=no 33F0EFAD00AA add_head3340359400BD "AssociationEnd::addSpecification"
  public void addSpecification(Classifier specification1)
  // -end- 33F0EFAD00AA add_head3340359400BD "AssociationEnd::addSpecification"
    ; // empty

  /** disconnect a Specification.
   *  @see #addSpecification
   */
  // -beg- preserve=no 33F0EFAD00AA remove_head3340359400BD "AssociationEnd::removeSpecification"
  public Classifier removeSpecification(Classifier specification1)
  // -end- 33F0EFAD00AA remove_head3340359400BD "AssociationEnd::removeSpecification"
    ; // empty

  /** tests if a given Specification is connected.
   *  @see #addSpecification
   */
  // -beg- preserve=no 33F0EFAD00AA test_head3340359400BD "AssociationEnd::containsSpecification"
  public boolean containsSpecification(Classifier specification1)
  // -end- 33F0EFAD00AA test_head3340359400BD "AssociationEnd::containsSpecification"
    ; // empty

  /** used to enumerate all connected Specifications.
   *  @see #addSpecification
   */
  // -beg- preserve=no 33F0EFAD00AA get_all_head3340359400BD "AssociationEnd::iteratorSpecification"
  public java.util.Iterator iteratorSpecification()
  // -end- 33F0EFAD00AA get_all_head3340359400BD "AssociationEnd::iteratorSpecification"
    ; // empty

  /** disconnect all Specifications.
   *  @see #addSpecification
   */
  // -beg- preserve=no 33F0EFAD00AA remove_all_head3340359400BD "AssociationEnd::clearSpecification"
  public void clearSpecification()
  // -end- 33F0EFAD00AA remove_all_head3340359400BD "AssociationEnd::clearSpecification"
    ; // empty

  /** returns the number of Specifications.
   *  @see #addSpecification
   */
  // -beg- preserve=no 33F0EFAD00AA size_head3340359400BD "AssociationEnd::sizeSpecification"
  public int sizeSpecification()
  // -end- 33F0EFAD00AA size_head3340359400BD "AssociationEnd::sizeSpecification"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AA _link_body3340359400BD "AssociationEnd::_linkSpecification"
  public void _linkSpecification(Classifier specification1);
  // -end- 33F0EFAD00AA _link_body3340359400BD "AssociationEnd::_linkSpecification"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AA _unlink_body3340359400BD "AssociationEnd::_unlinkSpecification"
  public void _unlinkSpecification(Classifier specification1);
  // -end- 33F0EFAD00AA _unlink_body3340359400BD "AssociationEnd::_unlinkSpecification"

  /** add a Presentation.
   *  
   *  @see #removePresentation
   *  @see #containsPresentation
   *  @see #iteratorPresentation
   *  @see #clearPresentation
   *  @see #sizePresentation
   */
  // -beg- preserve=no 362409A9000A add_head3340359400BD "ModelElement::addPresentation"
  public void addPresentation(PresentationElement presentation1)
  // -end- 362409A9000A add_head3340359400BD "ModelElement::addPresentation"
    ; // empty

  /** disconnect a Presentation.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_head3340359400BD "ModelElement::removePresentation"
  public PresentationElement removePresentation(PresentationElement presentation1)
  // -end- 362409A9000A remove_head3340359400BD "ModelElement::removePresentation"
    ; // empty

  /** tests if a given Presentation is connected.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A test_head3340359400BD "ModelElement::containsPresentation"
  public boolean containsPresentation(PresentationElement presentation1)
  // -end- 362409A9000A test_head3340359400BD "ModelElement::containsPresentation"
    ; // empty

  /** used to enumerate all connected Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A get_all_head3340359400BD "ModelElement::iteratorPresentation"
  public java.util.Iterator iteratorPresentation()
  // -end- 362409A9000A get_all_head3340359400BD "ModelElement::iteratorPresentation"
    ; // empty

  /** disconnect all Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_all_head3340359400BD "ModelElement::clearPresentation"
  public void clearPresentation()
  // -end- 362409A9000A remove_all_head3340359400BD "ModelElement::clearPresentation"
    ; // empty

  /** returns the number of Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A size_head3340359400BD "ModelElement::sizePresentation"
  public int sizePresentation()
  // -end- 362409A9000A size_head3340359400BD "ModelElement::sizePresentation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _link_body3340359400BD "ModelElement::_linkPresentation"
  public void _linkPresentation(PresentationElement presentation1);
  // -end- 362409A9000A _link_body3340359400BD "ModelElement::_linkPresentation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _unlink_body3340359400BD "ModelElement::_unlinkPresentation"
  public void _unlinkPresentation(PresentationElement presentation1);
  // -end- 362409A9000A _unlink_body3340359400BD "ModelElement::_unlinkPresentation"

  /** get current value of isNavigable
   *  @see #setNavigable
   */
  // -beg- preserve=no 3163E041030C get_head3340359400BD "isNavigable"
   boolean isNavigable()
  // -end- 3163E041030C get_head3340359400BD "isNavigable"
    ; // empty
  /** set current value of isNavigable
   *  @see #isNavigable
   */
  // -beg- preserve=no 3163E041030C set_head3340359400BD "isNavigable"
   void setNavigable(boolean value1)
  // -end- 3163E041030C set_head3340359400BD "isNavigable"
    ; // empty
  /** get current value of ordering
   *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
   *  @see #setOrdering
   */
  // -beg- preserve=no 3351AAC001A4 get_head3340359400BD "ordering"
   int getOrdering()
  // -end- 3351AAC001A4 get_head3340359400BD "ordering"
    ; // empty
  /** set current value of ordering
   *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
   *  @see #getOrdering
   */
  // -beg- preserve=no 3351AAC001A4 set_head3340359400BD "ordering"
   void setOrdering(int value1)
  // -end- 3351AAC001A4 set_head3340359400BD "ordering"
    ; // empty
  /** get current value of aggregation
   *  @see ch.ehi.uml1_4.foundation.datatypes.AggregationKind
   *  @see #setAggregation
   */
  // -beg- preserve=no 3351AAFE0226 get_head3340359400BD "aggregation"
   int getAggregation()
  // -end- 3351AAFE0226 get_head3340359400BD "aggregation"
    ; // empty
  /** set current value of aggregation
   *  @see ch.ehi.uml1_4.foundation.datatypes.AggregationKind
   *  @see #getAggregation
   */
  // -beg- preserve=no 3351AAFE0226 set_head3340359400BD "aggregation"
   void setAggregation(int value1)
  // -end- 3351AAFE0226 set_head3340359400BD "aggregation"
    ; // empty
  /** get current value of targetScope
   *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
   *  @see #setTargetScope
   */
  // -beg- preserve=no 33577C86023A get_head3340359400BD "targetScope"
   int getTargetScope()
  // -end- 33577C86023A get_head3340359400BD "targetScope"
    ; // empty
  /** set current value of targetScope
   *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
   *  @see #getTargetScope
   */
  // -beg- preserve=no 33577C86023A set_head3340359400BD "targetScope"
   void setTargetScope(int value1)
  // -end- 33577C86023A set_head3340359400BD "targetScope"
    ; // empty
  /** get current value of multiplicity
   *  @see #setMultiplicity
   */
  // -beg- preserve=no 33577DB30046 get_head3340359400BD "multiplicity"
   Multiplicity getMultiplicity()
  // -end- 33577DB30046 get_head3340359400BD "multiplicity"
    ; // empty
  /** set current value of multiplicity
   *  @see #getMultiplicity
   */
  // -beg- preserve=no 33577DB30046 set_head3340359400BD "multiplicity"
   void setMultiplicity(Multiplicity value1)
  // -end- 33577DB30046 set_head3340359400BD "multiplicity"
    ; // empty
  /** get current value of changeability
   *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
   *  @see #setChangeability
   */
  // -beg- preserve=no 33577DBA00D2 get_head3340359400BD "changeability"
   int getChangeability()
  // -end- 33577DBA00D2 get_head3340359400BD "changeability"
    ; // empty
  /** set current value of changeability
   *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
   *  @see #getChangeability
   */
  // -beg- preserve=no 33577DBA00D2 set_head3340359400BD "changeability"
   void setChangeability(int value1)
  // -end- 33577DBA00D2 set_head3340359400BD "changeability"
    ; // empty
  /** get current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #setVisibility
   */
  // -beg- preserve=no 3611BCE602DA get_head3340359400BD "visibility"
   int getVisibility()
  // -end- 3611BCE602DA get_head3340359400BD "visibility"
    ; // empty
  /** set current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #getVisibility
   */
  // -beg- preserve=no 3611BCE602DA set_head3340359400BD "visibility"
   void setVisibility(int value1)
  // -end- 3611BCE602DA set_head3340359400BD "visibility"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3340359400BD detail_end "AssociationEnd"

  // -end- 3340359400BD detail_end "AssociationEnd"

}

=======
public interface AssociationEnd extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3340359400BD detail_begin "AssociationEnd"

// -end- 3340359400BD detail_begin "AssociationEnd"

/** add a AssociationEndRole.
 *
 *  @see #removeAssociationEndRole
 *  @see #containsAssociationEndRole
 *  @see #iteratorAssociationEndRole
 *  @see #clearAssociationEndRole
 *  @see #sizeAssociationEndRole
 */
// -beg- preserve=no 33CD50F90302 add_head3340359400BD "AssociationEnd::addAssociationEndRole"
public void addAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 33CD50F90302 add_head3340359400BD "AssociationEnd::addAssociationEndRole"
;     // empty

/** disconnect a AssociationEndRole.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD50F90302 remove_head3340359400BD "AssociationEnd::removeAssociationEndRole"
public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 33CD50F90302 remove_head3340359400BD "AssociationEnd::removeAssociationEndRole"
;     // empty

/** tests if a given AssociationEndRole is connected.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD50F90302 test_head3340359400BD "AssociationEnd::containsAssociationEndRole"
public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 33CD50F90302 test_head3340359400BD "AssociationEnd::containsAssociationEndRole"
;     // empty

/** used to enumerate all connected AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD50F90302 get_all_head3340359400BD "AssociationEnd::iteratorAssociationEndRole"
public Iterator<?> iteratorAssociationEndRole()
// -end- 33CD50F90302 get_all_head3340359400BD "AssociationEnd::iteratorAssociationEndRole"
;     // empty

/** disconnect all AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD50F90302 remove_all_head3340359400BD "AssociationEnd::clearAssociationEndRole"
public void clearAssociationEndRole()
// -end- 33CD50F90302 remove_all_head3340359400BD "AssociationEnd::clearAssociationEndRole"
;     // empty

/** returns the number of AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD50F90302 size_head3340359400BD "AssociationEnd::sizeAssociationEndRole"
public int sizeAssociationEndRole()
// -end- 33CD50F90302 size_head3340359400BD "AssociationEnd::sizeAssociationEndRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD50F90302 _link_body3340359400BD "AssociationEnd::_linkAssociationEndRole"
public void _linkAssociationEndRole(AssociationEndRole associationEndRole1);
// -end- 33CD50F90302 _link_body3340359400BD "AssociationEnd::_linkAssociationEndRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD50F90302 _unlink_body3340359400BD "AssociationEnd::_unlinkAssociationEndRole"
public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1);
// -end- 33CD50F90302 _unlink_body3340359400BD "AssociationEnd::_unlinkAssociationEndRole"

/** add a LinkEnd.
 *
 *  @see #removeLinkEnd
 *  @see #containsLinkEnd
 *  @see #iteratorLinkEnd
 *  @see #clearLinkEnd
 *  @see #sizeLinkEnd
 */
// -beg- preserve=no 328A5C1F029E add_head3340359400BD "AssociationEnd::addLinkEnd"
public void addLinkEnd(LinkEnd linkEnd1)
// -end- 328A5C1F029E add_head3340359400BD "AssociationEnd::addLinkEnd"
;     // empty

/** disconnect a LinkEnd.
 *  @see #addLinkEnd
 */
// -beg- preserve=no 328A5C1F029E remove_head3340359400BD "AssociationEnd::removeLinkEnd"
public LinkEnd removeLinkEnd(LinkEnd linkEnd1)
// -end- 328A5C1F029E remove_head3340359400BD "AssociationEnd::removeLinkEnd"
;     // empty

/** tests if a given LinkEnd is connected.
 *  @see #addLinkEnd
 */
// -beg- preserve=no 328A5C1F029E test_head3340359400BD "AssociationEnd::containsLinkEnd"
public boolean containsLinkEnd(LinkEnd linkEnd1)
// -end- 328A5C1F029E test_head3340359400BD "AssociationEnd::containsLinkEnd"
;     // empty

/** used to enumerate all connected LinkEnds.
 *  @see #addLinkEnd
 */
// -beg- preserve=no 328A5C1F029E get_all_head3340359400BD "AssociationEnd::iteratorLinkEnd"
public Iterator<?> iteratorLinkEnd()
// -end- 328A5C1F029E get_all_head3340359400BD "AssociationEnd::iteratorLinkEnd"
;     // empty

/** disconnect all LinkEnds.
 *  @see #addLinkEnd
 */
// -beg- preserve=no 328A5C1F029E remove_all_head3340359400BD "AssociationEnd::clearLinkEnd"
public void clearLinkEnd()
// -end- 328A5C1F029E remove_all_head3340359400BD "AssociationEnd::clearLinkEnd"
;     // empty

/** returns the number of LinkEnds.
 *  @see #addLinkEnd
 */
// -beg- preserve=no 328A5C1F029E size_head3340359400BD "AssociationEnd::sizeLinkEnd"
public int sizeLinkEnd()
// -end- 328A5C1F029E size_head3340359400BD "AssociationEnd::sizeLinkEnd"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5C1F029E _link_body3340359400BD "AssociationEnd::_linkLinkEnd"
public void _linkLinkEnd(LinkEnd linkEnd1);
// -end- 328A5C1F029E _link_body3340359400BD "AssociationEnd::_linkLinkEnd"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5C1F029E _unlink_body3340359400BD "AssociationEnd::_unlinkLinkEnd"
public void _unlinkLinkEnd(LinkEnd linkEnd1);
// -end- 328A5C1F029E _unlink_body3340359400BD "AssociationEnd::_unlinkLinkEnd"

/** attaches a Association.
 *
 *  @see #detachAssociation
 *  @see #getAssociation
 *  @see #containsAssociation
 */
// -beg- preserve=no 32A2A510017B attach_head3340359400BD "AssociationEnd::attachAssociation"
public void attachAssociation(Association association1)
// -end- 32A2A510017B attach_head3340359400BD "AssociationEnd::attachAssociation"
;     // empty

/** disconnect the currently attached Association.
 *  @see #attachAssociation
 */
// -beg- preserve=no 32A2A510017B detach_head3340359400BD "AssociationEnd::detachAssociation"
public Association detachAssociation()
// -end- 32A2A510017B detach_head3340359400BD "AssociationEnd::detachAssociation"
;     // empty

/** get the currently attached Association.
 *  @see #attachAssociation
 */
// -beg- preserve=no 32A2A510017B get_head3340359400BD "AssociationEnd::getAssociation"
public Association getAssociation()
// -end- 32A2A510017B get_head3340359400BD "AssociationEnd::getAssociation"
;     // empty

/** tests if there is a Association attached.
 *  @see #attachAssociation
 */
// -beg- preserve=no 32A2A510017B test_head3340359400BD "AssociationEnd::containsAssociation"
public boolean containsAssociation()
// -end- 32A2A510017B test_head3340359400BD "AssociationEnd::containsAssociation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32A2A510017B _link_body3340359400BD "AssociationEnd::_linkAssociation"
public void _linkAssociation(Association association1);
// -end- 32A2A510017B _link_body3340359400BD "AssociationEnd::_linkAssociation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32A2A510017B _unlink_body3340359400BD "AssociationEnd::_unlinkAssociation"
public void _unlinkAssociation(Association association1);
// -end- 32A2A510017B _unlink_body3340359400BD "AssociationEnd::_unlinkAssociation"

/** add a Qualifier.
 *
 *  @see #removeQualifier
 *  @see #containsQualifier
 *  @see #iteratorQualifier
 *  @see #clearQualifier
 *  @see #sizeQualifier
 */
// -beg- preserve=no 33DBE50B001F add_head3340359400BD "AssociationEnd::addQualifier"
public void addQualifier(Attribute qualifier1)
// -end- 33DBE50B001F add_head3340359400BD "AssociationEnd::addQualifier"
;     // empty

// -beg- preserve=no 33DBE50B001F add2_head3340359400BD "AssociationEnd::add2Qualifier"
public void addQualifier(int index,Attribute qualifier1)
// -end- 33DBE50B001F add2_head3340359400BD "AssociationEnd::add2Qualifier"
;     // empty

/** disconnect a Qualifier.
 *  @see #addQualifier
 */
// -beg- preserve=no 33DBE50B001F remove_head3340359400BD "AssociationEnd::removeQualifier"
public Attribute removeQualifier(Attribute qualifier1)
// -end- 33DBE50B001F remove_head3340359400BD "AssociationEnd::removeQualifier"
;     // empty

/** disconnect a Qualifier.
 *  @see #addQualifier
 */
// -beg- preserve=no 33DBE50B001F remove2_head3340359400BD "AssociationEnd::remove2Qualifier"
public Attribute removeQualifier(int index)
// -end- 33DBE50B001F remove2_head3340359400BD "AssociationEnd::remove2Qualifier"
;     // empty

/** change a Qualifier.
 *  @see #addQualifier
 */
// -beg- preserve=no 33DBE50B001F set_head3340359400BD "AssociationEnd::setQualifier"
public Attribute setQualifier(int index,Attribute qualifier1)
// -end- 33DBE50B001F set_head3340359400BD "AssociationEnd::setQualifier"
;     // empty

/** tests if a given Qualifier is connected.
 *  @see #addQualifier
 */
// -beg- preserve=no 33DBE50B001F test_head3340359400BD "AssociationEnd::containsQualifier"
public boolean containsQualifier(Attribute qualifier1)
// -end- 33DBE50B001F test_head3340359400BD "AssociationEnd::containsQualifier"
;     // empty

/** used to enumerate all connected Qualifiers.
 *  @see #addQualifier
 */
// -beg- preserve=no 33DBE50B001F get_all_head3340359400BD "AssociationEnd::iteratorQualifier"
public Iterator<?> iteratorQualifier()
// -end- 33DBE50B001F get_all_head3340359400BD "AssociationEnd::iteratorQualifier"
;     // empty

/** disconnect all Qualifiers.
 *  @see #addQualifier
 */
// -beg- preserve=no 33DBE50B001F remove_all_head3340359400BD "AssociationEnd::clearQualifier"
public void clearQualifier()
// -end- 33DBE50B001F remove_all_head3340359400BD "AssociationEnd::clearQualifier"
;     // empty

/** returns the number of Qualifiers.
 *  @see #addQualifier
 */
// -beg- preserve=no 33DBE50B001F size_head3340359400BD "AssociationEnd::sizeQualifier"
public int sizeQualifier()
// -end- 33DBE50B001F size_head3340359400BD "AssociationEnd::sizeQualifier"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBE50B001F _link_body3340359400BD "AssociationEnd::_linkQualifier"
public void _linkQualifier(Attribute qualifier1);
// -end- 33DBE50B001F _link_body3340359400BD "AssociationEnd::_linkQualifier"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBE50B001F _unlink_body3340359400BD "AssociationEnd::_unlinkQualifier"
public void _unlinkQualifier(Attribute qualifier1);
// -end- 33DBE50B001F _unlink_body3340359400BD "AssociationEnd::_unlinkQualifier"

/** attaches a Participant.
 *
 *  @see #detachParticipant
 *  @see #getParticipant
 *  @see #containsParticipant
 */
// -beg- preserve=no 33E265070354 attach_head3340359400BD "AssociationEnd::attachParticipant"
public void attachParticipant(Classifier participant1)
// -end- 33E265070354 attach_head3340359400BD "AssociationEnd::attachParticipant"
;     // empty

/** disconnect the currently attached Participant.
 *  @see #attachParticipant
 */
// -beg- preserve=no 33E265070354 detach_head3340359400BD "AssociationEnd::detachParticipant"
public Classifier detachParticipant()
// -end- 33E265070354 detach_head3340359400BD "AssociationEnd::detachParticipant"
;     // empty

/** get the currently attached Participant.
 *  @see #attachParticipant
 */
// -beg- preserve=no 33E265070354 get_head3340359400BD "AssociationEnd::getParticipant"
public Classifier getParticipant()
// -end- 33E265070354 get_head3340359400BD "AssociationEnd::getParticipant"
;     // empty

/** tests if there is a Participant attached.
 *  @see #attachParticipant
 */
// -beg- preserve=no 33E265070354 test_head3340359400BD "AssociationEnd::containsParticipant"
public boolean containsParticipant()
// -end- 33E265070354 test_head3340359400BD "AssociationEnd::containsParticipant"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E265070354 _link_body3340359400BD "AssociationEnd::_linkParticipant"
public void _linkParticipant(Classifier participant1);
// -end- 33E265070354 _link_body3340359400BD "AssociationEnd::_linkParticipant"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E265070354 _unlink_body3340359400BD "AssociationEnd::_unlinkParticipant"
public void _unlinkParticipant(Classifier participant1);
// -end- 33E265070354 _unlink_body3340359400BD "AssociationEnd::_unlinkParticipant"

/** add a Specification.
 *
 *  @see #removeSpecification
 *  @see #containsSpecification
 *  @see #iteratorSpecification
 *  @see #clearSpecification
 *  @see #sizeSpecification
 */
// -beg- preserve=no 33F0EFAD00AA add_head3340359400BD "AssociationEnd::addSpecification"
public void addSpecification(Classifier specification1)
// -end- 33F0EFAD00AA add_head3340359400BD "AssociationEnd::addSpecification"
;     // empty

/** disconnect a Specification.
 *  @see #addSpecification
 */
// -beg- preserve=no 33F0EFAD00AA remove_head3340359400BD "AssociationEnd::removeSpecification"
public Classifier removeSpecification(Classifier specification1)
// -end- 33F0EFAD00AA remove_head3340359400BD "AssociationEnd::removeSpecification"
;     // empty

/** tests if a given Specification is connected.
 *  @see #addSpecification
 */
// -beg- preserve=no 33F0EFAD00AA test_head3340359400BD "AssociationEnd::containsSpecification"
public boolean containsSpecification(Classifier specification1)
// -end- 33F0EFAD00AA test_head3340359400BD "AssociationEnd::containsSpecification"
;     // empty

/** used to enumerate all connected Specifications.
 *  @see #addSpecification
 */
// -beg- preserve=no 33F0EFAD00AA get_all_head3340359400BD "AssociationEnd::iteratorSpecification"
public Iterator<?> iteratorSpecification()
// -end- 33F0EFAD00AA get_all_head3340359400BD "AssociationEnd::iteratorSpecification"
;     // empty

/** disconnect all Specifications.
 *  @see #addSpecification
 */
// -beg- preserve=no 33F0EFAD00AA remove_all_head3340359400BD "AssociationEnd::clearSpecification"
public void clearSpecification()
// -end- 33F0EFAD00AA remove_all_head3340359400BD "AssociationEnd::clearSpecification"
;     // empty

/** returns the number of Specifications.
 *  @see #addSpecification
 */
// -beg- preserve=no 33F0EFAD00AA size_head3340359400BD "AssociationEnd::sizeSpecification"
public int sizeSpecification()
// -end- 33F0EFAD00AA size_head3340359400BD "AssociationEnd::sizeSpecification"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33F0EFAD00AA _link_body3340359400BD "AssociationEnd::_linkSpecification"
public void _linkSpecification(Classifier specification1);
// -end- 33F0EFAD00AA _link_body3340359400BD "AssociationEnd::_linkSpecification"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33F0EFAD00AA _unlink_body3340359400BD "AssociationEnd::_unlinkSpecification"
public void _unlinkSpecification(Classifier specification1);
// -end- 33F0EFAD00AA _unlink_body3340359400BD "AssociationEnd::_unlinkSpecification"

/** add a Presentation.
 *
 *  @see #removePresentation
 *  @see #containsPresentation
 *  @see #iteratorPresentation
 *  @see #clearPresentation
 *  @see #sizePresentation
 */
// -beg- preserve=no 362409A9000A add_head3340359400BD "ModelElement::addPresentation"
public void addPresentation(PresentationElement presentation1)
// -end- 362409A9000A add_head3340359400BD "ModelElement::addPresentation"
;     // empty

/** disconnect a Presentation.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_head3340359400BD "ModelElement::removePresentation"
public PresentationElement removePresentation(PresentationElement presentation1)
// -end- 362409A9000A remove_head3340359400BD "ModelElement::removePresentation"
;     // empty

/** tests if a given Presentation is connected.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A test_head3340359400BD "ModelElement::containsPresentation"
public boolean containsPresentation(PresentationElement presentation1)
// -end- 362409A9000A test_head3340359400BD "ModelElement::containsPresentation"
;     // empty

/** used to enumerate all connected Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A get_all_head3340359400BD "ModelElement::iteratorPresentation"
public Iterator<?> iteratorPresentation()
// -end- 362409A9000A get_all_head3340359400BD "ModelElement::iteratorPresentation"
;     // empty

/** disconnect all Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_all_head3340359400BD "ModelElement::clearPresentation"
public void clearPresentation()
// -end- 362409A9000A remove_all_head3340359400BD "ModelElement::clearPresentation"
;     // empty

/** returns the number of Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A size_head3340359400BD "ModelElement::sizePresentation"
public int sizePresentation()
// -end- 362409A9000A size_head3340359400BD "ModelElement::sizePresentation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _link_body3340359400BD "ModelElement::_linkPresentation"
public void _linkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _link_body3340359400BD "ModelElement::_linkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _unlink_body3340359400BD "ModelElement::_unlinkPresentation"
public void _unlinkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _unlink_body3340359400BD "ModelElement::_unlinkPresentation"

/** get current value of isNavigable
 *  @see #setNavigable
 */
// -beg- preserve=no 3163E041030C get_head3340359400BD "isNavigable"
boolean isNavigable()
// -end- 3163E041030C get_head3340359400BD "isNavigable"
;     // empty
/** set current value of isNavigable
 *  @see #isNavigable
 */
// -beg- preserve=no 3163E041030C set_head3340359400BD "isNavigable"
void setNavigable(boolean value1)
// -end- 3163E041030C set_head3340359400BD "isNavigable"
;     // empty
/** get current value of ordering
 *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
 *  @see #setOrdering
 */
// -beg- preserve=no 3351AAC001A4 get_head3340359400BD "ordering"
int getOrdering()
// -end- 3351AAC001A4 get_head3340359400BD "ordering"
;     // empty
/** set current value of ordering
 *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
 *  @see #getOrdering
 */
// -beg- preserve=no 3351AAC001A4 set_head3340359400BD "ordering"
void setOrdering(int value1)
// -end- 3351AAC001A4 set_head3340359400BD "ordering"
;     // empty
/** get current value of aggregation
 *  @see ch.ehi.uml1_4.foundation.datatypes.AggregationKind
 *  @see #setAggregation
 */
// -beg- preserve=no 3351AAFE0226 get_head3340359400BD "aggregation"
int getAggregation()
// -end- 3351AAFE0226 get_head3340359400BD "aggregation"
;     // empty
/** set current value of aggregation
 *  @see ch.ehi.uml1_4.foundation.datatypes.AggregationKind
 *  @see #getAggregation
 */
// -beg- preserve=no 3351AAFE0226 set_head3340359400BD "aggregation"
void setAggregation(int value1)
// -end- 3351AAFE0226 set_head3340359400BD "aggregation"
;     // empty
/** get current value of targetScope
 *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
 *  @see #setTargetScope
 */
// -beg- preserve=no 33577C86023A get_head3340359400BD "targetScope"
int getTargetScope()
// -end- 33577C86023A get_head3340359400BD "targetScope"
;     // empty
/** set current value of targetScope
 *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
 *  @see #getTargetScope
 */
// -beg- preserve=no 33577C86023A set_head3340359400BD "targetScope"
void setTargetScope(int value1)
// -end- 33577C86023A set_head3340359400BD "targetScope"
;     // empty
/** get current value of multiplicity
 *  @see #setMultiplicity
 */
// -beg- preserve=no 33577DB30046 get_head3340359400BD "multiplicity"
Multiplicity getMultiplicity()
// -end- 33577DB30046 get_head3340359400BD "multiplicity"
;     // empty
/** set current value of multiplicity
 *  @see #getMultiplicity
 */
// -beg- preserve=no 33577DB30046 set_head3340359400BD "multiplicity"
void setMultiplicity(Multiplicity value1)
// -end- 33577DB30046 set_head3340359400BD "multiplicity"
;     // empty
/** get current value of changeability
 *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
 *  @see #setChangeability
 */
// -beg- preserve=no 33577DBA00D2 get_head3340359400BD "changeability"
int getChangeability()
// -end- 33577DBA00D2 get_head3340359400BD "changeability"
;     // empty
/** set current value of changeability
 *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
 *  @see #getChangeability
 */
// -beg- preserve=no 33577DBA00D2 set_head3340359400BD "changeability"
void setChangeability(int value1)
// -end- 33577DBA00D2 set_head3340359400BD "changeability"
;     // empty
/** get current value of visibility
 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
 *  @see #setVisibility
 */
// -beg- preserve=no 3611BCE602DA get_head3340359400BD "visibility"
int getVisibility()
// -end- 3611BCE602DA get_head3340359400BD "visibility"
;     // empty
/** set current value of visibility
 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
 *  @see #getVisibility
 */
// -beg- preserve=no 3611BCE602DA set_head3340359400BD "visibility"
void setVisibility(int value1)
// -end- 3611BCE602DA set_head3340359400BD "visibility"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3340359400BD detail_end "AssociationEnd"

// -end- 3340359400BD detail_end "AssociationEnd"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
