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

<<<<<<< HEAD

=======
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 448D24D90367 package "UmlStereotype"
package ch.ehi.uml1_4.implementation;
// -end- 448D24D90367 package "UmlStereotype"

<<<<<<< HEAD
// -beg- preserve=no 448D24D90367 autoimport "UmlStereotype"
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TagDefinition;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.datatypes.Geometry;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.basics.types.NlsString;
// -end- 448D24D90367 autoimport "UmlStereotype"
=======
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 448D24D90367 autoimport "UmlStereotype"
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.datatypes.Geometry;
// -beg- preserve=no 448D24D90367 autoimport "UmlStereotype"
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TagDefinition;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.uml1_4.modelmanagement.Package;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448D24D90367 import "UmlStereotype"

// -end- 448D24D90367 import "UmlStereotype"

<<<<<<< HEAD
/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-06-13 14:36:24 $
 */
public class UmlStereotype implements Stereotype
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448D24D90367 detail_begin "UmlStereotype"

  // -end- 448D24D90367 detail_begin "UmlStereotype"

  // -beg- preserve=no 448D3645021F head448D24D90367 "unlinkAll"
  public void unlinkAll()
  // -end- 448D3645021F head448D24D90367 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 448D3645021F throws448D24D90367 "unlinkAll"

    // -end- 448D3645021F throws448D24D90367 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 448D3645021F body448D24D90367 "unlinkAll"
    
    clearDefinedTag();
    clearExtendedElement();
    clearStereotypeConstraint();
    setIcon(null);
    clearGeneralization();
    clearSpecialization();
    clearBehavior();
    clearPartition();
    clearCollaboration();
    clearClassifierRole();
    clearCollaborationInstanceSet();
    detachNamespace();
    clearClientDependency();
    clearTaggedValue();
    clearConstraint();
    clearSupplierDependency();
    clearPresentation();
    clearContainer();
    clearTemplateParameter();
    clearTargetFlow();
    clearSourceFlow();
    clearDefaultParameter();
    clearComment();
    // Role TemplateArgument: TemplateArgument object(s) may point to this
    // Role ParameterDefinition: TemplateParameter object(s) may point to this
    clearStereotype();
    clearReferenceTag();
    clearImportedBy();
    // Role EditorTreeElement: EditorTreeElement object(s) may point to this
    setName(null);
    setDocumentation(null);
    
    // -end- 448D3645021F body448D24D90367 "unlinkAll"
    }

  // -beg- preserve=no 448D364A028B head448D24D90367 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 448D364A028B head448D24D90367 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 448D364A028B throws448D24D90367 "enumerateChildren"

    // -end- 448D364A028B throws448D24D90367 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 448D364A028B body448D24D90367 "enumerateChildren"
    java.util.Iterator it=null;
    it=iteratorDefinedTag();while(it.hasNext())visitor.visit(it.next());
    it=iteratorStereotypeConstraint();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getIcon());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getDocumentation());
    
    // -end- 448D364A028B body448D24D90367 "enumerateChildren"
    }

  // -beg- preserve=no 3386129C0040 code448D24D90367 "definedTag"
  private java.util.Set definedTag = new java.util.HashSet();
  // -end- 3386129C0040 code448D24D90367 "definedTag"

  /** add a DefinedTag.
   *  
   *  @see #removeDefinedTag
   *  @see #containsDefinedTag
   *  @see #iteratorDefinedTag
   *  @see #clearDefinedTag
   *  @see #sizeDefinedTag
   */
  // -beg- preserve=no 3386129C0040 add_head448D24D90367 "Stereotype::addDefinedTag"
  public void addDefinedTag(TagDefinition definedTag1)
  // -end- 3386129C0040 add_head448D24D90367 "Stereotype::addDefinedTag"
  {
    // -beg- preserve=no 3386129C0040 add_body448D24D90367 "Stereotype::addDefinedTag"
    definedTag.add(definedTag1);
    definedTag1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDefinedTag"));
    return;
    // -end- 3386129C0040 add_body448D24D90367 "Stereotype::addDefinedTag"
  }

  /** disconnect a DefinedTag.
   *  @see #addDefinedTag
   */
  // -beg- preserve=no 3386129C0040 remove_head448D24D90367 "Stereotype::removeDefinedTag"
  public TagDefinition removeDefinedTag(TagDefinition definedTag1)
  // -end- 3386129C0040 remove_head448D24D90367 "Stereotype::removeDefinedTag"
  {
    // -beg- preserve=no 3386129C0040 remove_body448D24D90367 "Stereotype::removeDefinedTag"
    TagDefinition ret=null;
    if(definedTag1==null || !definedTag.contains(definedTag1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = definedTag1;
    definedTag.remove(definedTag1);
    definedTag1._unlinkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDefinedTag"));
    return ret;
    // -end- 3386129C0040 remove_body448D24D90367 "Stereotype::removeDefinedTag"
  }

  /** tests if a given DefinedTag is connected.
   *  @see #addDefinedTag
   */
  // -beg- preserve=no 3386129C0040 test_head448D24D90367 "Stereotype::containsDefinedTag"
  public boolean containsDefinedTag(TagDefinition definedTag1)
  // -end- 3386129C0040 test_head448D24D90367 "Stereotype::containsDefinedTag"
  {
    // -beg- preserve=no 3386129C0040 test_body448D24D90367 "Stereotype::containsDefinedTag"
    return definedTag.contains(definedTag1);
    // -end- 3386129C0040 test_body448D24D90367 "Stereotype::containsDefinedTag"
  }

  /** used to enumerate all connected DefinedTags.
   *  @see #addDefinedTag
   */
  // -beg- preserve=no 3386129C0040 get_all_head448D24D90367 "Stereotype::iteratorDefinedTag"
  public java.util.Iterator iteratorDefinedTag()
  // -end- 3386129C0040 get_all_head448D24D90367 "Stereotype::iteratorDefinedTag"
  {
    // -beg- preserve=no 3386129C0040 get_all_body448D24D90367 "Stereotype::iteratorDefinedTag"
    return definedTag.iterator();
    // -end- 3386129C0040 get_all_body448D24D90367 "Stereotype::iteratorDefinedTag"
  }

  /** disconnect all DefinedTags.
   *  @see #addDefinedTag
   */
  // -beg- preserve=no 3386129C0040 remove_all_head448D24D90367 "Stereotype::clearDefinedTag"
  public void clearDefinedTag()
  // -end- 3386129C0040 remove_all_head448D24D90367 "Stereotype::clearDefinedTag"
  {
    // -beg- preserve=no 3386129C0040 remove_all_body448D24D90367 "Stereotype::clearDefinedTag"
    if(sizeDefinedTag()>0){
      for(java.util.Iterator p = definedTag.iterator(); p.hasNext();){
        ((TagDefinition)p.next())._unlinkOwner(this);
      }
      definedTag.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDefinedTag"));
    }
    // -end- 3386129C0040 remove_all_body448D24D90367 "Stereotype::clearDefinedTag"
  }

  /** returns the number of DefinedTags.
   *  @see #addDefinedTag
   */
  // -beg- preserve=no 3386129C0040 size_head448D24D90367 "Stereotype::sizeDefinedTag"
  public int sizeDefinedTag()
  // -end- 3386129C0040 size_head448D24D90367 "Stereotype::sizeDefinedTag"
  {
    // -beg- preserve=no 3386129C0040 size_body448D24D90367 "Stereotype::sizeDefinedTag"
    return definedTag.size();
    // -end- 3386129C0040 size_body448D24D90367 "Stereotype::sizeDefinedTag"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3386129C0040 _link_body448D24D90367 "Stereotype::_linkDefinedTag"
  public void _linkDefinedTag(TagDefinition definedTag1)
  {
    definedTag.add(definedTag1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDefinedTag"));
    return;
  }
  // -end- 3386129C0040 _link_body448D24D90367 "Stereotype::_linkDefinedTag"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3386129C0040 _unlink_body448D24D90367 "Stereotype::_unlinkDefinedTag"
  public void _unlinkDefinedTag(TagDefinition definedTag1)
  {
    definedTag.remove(definedTag1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDefinedTag"));
    return;
  }
  // -end- 3386129C0040 _unlink_body448D24D90367 "Stereotype::_unlinkDefinedTag"

  // -beg- preserve=no 338613A4007A code448D24D90367 "extendedElement"
  private java.util.Set extendedElement = new java.util.HashSet();
  // -end- 338613A4007A code448D24D90367 "extendedElement"

  /** add a ExtendedElement.
   *  
   *  @see #removeExtendedElement
   *  @see #containsExtendedElement
   *  @see #iteratorExtendedElement
   *  @see #clearExtendedElement
   *  @see #sizeExtendedElement
   */
  // -beg- preserve=no 338613A4007A add_head448D24D90367 "Stereotype::addExtendedElement"
  public void addExtendedElement(ModelElement extendedElement1)
  // -end- 338613A4007A add_head448D24D90367 "Stereotype::addExtendedElement"
  {
    // -beg- preserve=no 338613A4007A add_body448D24D90367 "Stereotype::addExtendedElement"
    extendedElement.add(extendedElement1);
    extendedElement1._linkStereotype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addExtendedElement"));
    return;
    // -end- 338613A4007A add_body448D24D90367 "Stereotype::addExtendedElement"
  }

  /** disconnect a ExtendedElement.
   *  @see #addExtendedElement
   */
  // -beg- preserve=no 338613A4007A remove_head448D24D90367 "Stereotype::removeExtendedElement"
  public ModelElement removeExtendedElement(ModelElement extendedElement1)
  // -end- 338613A4007A remove_head448D24D90367 "Stereotype::removeExtendedElement"
  {
    // -beg- preserve=no 338613A4007A remove_body448D24D90367 "Stereotype::removeExtendedElement"
    ModelElement ret=null;
    if(extendedElement1==null || !extendedElement.contains(extendedElement1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = extendedElement1;
    extendedElement.remove(extendedElement1);
    extendedElement1._unlinkStereotype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeExtendedElement"));
    return ret;
    // -end- 338613A4007A remove_body448D24D90367 "Stereotype::removeExtendedElement"
  }

  /** tests if a given ExtendedElement is connected.
   *  @see #addExtendedElement
   */
  // -beg- preserve=no 338613A4007A test_head448D24D90367 "Stereotype::containsExtendedElement"
  public boolean containsExtendedElement(ModelElement extendedElement1)
  // -end- 338613A4007A test_head448D24D90367 "Stereotype::containsExtendedElement"
  {
    // -beg- preserve=no 338613A4007A test_body448D24D90367 "Stereotype::containsExtendedElement"
    return extendedElement.contains(extendedElement1);
    // -end- 338613A4007A test_body448D24D90367 "Stereotype::containsExtendedElement"
  }

  /** used to enumerate all connected ExtendedElements.
   *  @see #addExtendedElement
   */
  // -beg- preserve=no 338613A4007A get_all_head448D24D90367 "Stereotype::iteratorExtendedElement"
  public java.util.Iterator iteratorExtendedElement()
  // -end- 338613A4007A get_all_head448D24D90367 "Stereotype::iteratorExtendedElement"
  {
    // -beg- preserve=no 338613A4007A get_all_body448D24D90367 "Stereotype::iteratorExtendedElement"
    return extendedElement.iterator();
    // -end- 338613A4007A get_all_body448D24D90367 "Stereotype::iteratorExtendedElement"
  }

  /** disconnect all ExtendedElements.
   *  @see #addExtendedElement
   */
  // -beg- preserve=no 338613A4007A remove_all_head448D24D90367 "Stereotype::clearExtendedElement"
  public void clearExtendedElement()
  // -end- 338613A4007A remove_all_head448D24D90367 "Stereotype::clearExtendedElement"
  {
    // -beg- preserve=no 338613A4007A remove_all_body448D24D90367 "Stereotype::clearExtendedElement"
    if(sizeExtendedElement()>0){
      for(java.util.Iterator p = extendedElement.iterator(); p.hasNext();){
        ((ModelElement)p.next())._unlinkStereotype(this);
      }
      extendedElement.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearExtendedElement"));
    }
    // -end- 338613A4007A remove_all_body448D24D90367 "Stereotype::clearExtendedElement"
  }

  /** returns the number of ExtendedElements.
   *  @see #addExtendedElement
   */
  // -beg- preserve=no 338613A4007A size_head448D24D90367 "Stereotype::sizeExtendedElement"
  public int sizeExtendedElement()
  // -end- 338613A4007A size_head448D24D90367 "Stereotype::sizeExtendedElement"
  {
    // -beg- preserve=no 338613A4007A size_body448D24D90367 "Stereotype::sizeExtendedElement"
    return extendedElement.size();
    // -end- 338613A4007A size_body448D24D90367 "Stereotype::sizeExtendedElement"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 338613A4007A _link_body448D24D90367 "Stereotype::_linkExtendedElement"
  public void _linkExtendedElement(ModelElement extendedElement1)
  {
    extendedElement.add(extendedElement1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkExtendedElement"));
    return;
  }
  // -end- 338613A4007A _link_body448D24D90367 "Stereotype::_linkExtendedElement"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 338613A4007A _unlink_body448D24D90367 "Stereotype::_unlinkExtendedElement"
  public void _unlinkExtendedElement(ModelElement extendedElement1)
  {
    extendedElement.remove(extendedElement1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkExtendedElement"));
    return;
  }
  // -end- 338613A4007A _unlink_body448D24D90367 "Stereotype::_unlinkExtendedElement"

  // -beg- preserve=no 364B66900258 code448D24D90367 "stereotypeConstraint"
  private java.util.Set stereotypeConstraint = new java.util.HashSet();
  // -end- 364B66900258 code448D24D90367 "stereotypeConstraint"

  /** add a StereotypeConstraint.
   *  
   *  @see #removeStereotypeConstraint
   *  @see #containsStereotypeConstraint
   *  @see #iteratorStereotypeConstraint
   *  @see #clearStereotypeConstraint
   *  @see #sizeStereotypeConstraint
   */
  // -beg- preserve=no 364B66900258 add_head448D24D90367 "Stereotype::addStereotypeConstraint"
  public void addStereotypeConstraint(Constraint stereotypeConstraint1)
  // -end- 364B66900258 add_head448D24D90367 "Stereotype::addStereotypeConstraint"
  {
    // -beg- preserve=no 364B66900258 add_body448D24D90367 "Stereotype::addStereotypeConstraint"
    stereotypeConstraint.add(stereotypeConstraint1);
    stereotypeConstraint1._linkConstrainedStereotype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addStereotypeConstraint"));
    return;
    // -end- 364B66900258 add_body448D24D90367 "Stereotype::addStereotypeConstraint"
  }

  /** disconnect a StereotypeConstraint.
   *  @see #addStereotypeConstraint
   */
  // -beg- preserve=no 364B66900258 remove_head448D24D90367 "Stereotype::removeStereotypeConstraint"
  public Constraint removeStereotypeConstraint(Constraint stereotypeConstraint1)
  // -end- 364B66900258 remove_head448D24D90367 "Stereotype::removeStereotypeConstraint"
  {
    // -beg- preserve=no 364B66900258 remove_body448D24D90367 "Stereotype::removeStereotypeConstraint"
    Constraint ret=null;
    if(stereotypeConstraint1==null || !stereotypeConstraint.contains(stereotypeConstraint1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = stereotypeConstraint1;
    stereotypeConstraint.remove(stereotypeConstraint1);
    stereotypeConstraint1._unlinkConstrainedStereotype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeStereotypeConstraint"));
    return ret;
    // -end- 364B66900258 remove_body448D24D90367 "Stereotype::removeStereotypeConstraint"
  }

  /** tests if a given StereotypeConstraint is connected.
   *  @see #addStereotypeConstraint
   */
  // -beg- preserve=no 364B66900258 test_head448D24D90367 "Stereotype::containsStereotypeConstraint"
  public boolean containsStereotypeConstraint(Constraint stereotypeConstraint1)
  // -end- 364B66900258 test_head448D24D90367 "Stereotype::containsStereotypeConstraint"
  {
    // -beg- preserve=no 364B66900258 test_body448D24D90367 "Stereotype::containsStereotypeConstraint"
    return stereotypeConstraint.contains(stereotypeConstraint1);
    // -end- 364B66900258 test_body448D24D90367 "Stereotype::containsStereotypeConstraint"
  }

  /** used to enumerate all connected StereotypeConstraints.
   *  @see #addStereotypeConstraint
   */
  // -beg- preserve=no 364B66900258 get_all_head448D24D90367 "Stereotype::iteratorStereotypeConstraint"
  public java.util.Iterator iteratorStereotypeConstraint()
  // -end- 364B66900258 get_all_head448D24D90367 "Stereotype::iteratorStereotypeConstraint"
  {
    // -beg- preserve=no 364B66900258 get_all_body448D24D90367 "Stereotype::iteratorStereotypeConstraint"
    return stereotypeConstraint.iterator();
    // -end- 364B66900258 get_all_body448D24D90367 "Stereotype::iteratorStereotypeConstraint"
  }

  /** disconnect all StereotypeConstraints.
   *  @see #addStereotypeConstraint
   */
  // -beg- preserve=no 364B66900258 remove_all_head448D24D90367 "Stereotype::clearStereotypeConstraint"
  public void clearStereotypeConstraint()
  // -end- 364B66900258 remove_all_head448D24D90367 "Stereotype::clearStereotypeConstraint"
  {
    // -beg- preserve=no 364B66900258 remove_all_body448D24D90367 "Stereotype::clearStereotypeConstraint"
    if(sizeStereotypeConstraint()>0){
      for(java.util.Iterator p = stereotypeConstraint.iterator(); p.hasNext();){
        ((Constraint)p.next())._unlinkConstrainedStereotype(this);
      }
      stereotypeConstraint.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearStereotypeConstraint"));
    }
    // -end- 364B66900258 remove_all_body448D24D90367 "Stereotype::clearStereotypeConstraint"
  }

  /** returns the number of StereotypeConstraints.
   *  @see #addStereotypeConstraint
   */
  // -beg- preserve=no 364B66900258 size_head448D24D90367 "Stereotype::sizeStereotypeConstraint"
  public int sizeStereotypeConstraint()
  // -end- 364B66900258 size_head448D24D90367 "Stereotype::sizeStereotypeConstraint"
  {
    // -beg- preserve=no 364B66900258 size_body448D24D90367 "Stereotype::sizeStereotypeConstraint"
    return stereotypeConstraint.size();
    // -end- 364B66900258 size_body448D24D90367 "Stereotype::sizeStereotypeConstraint"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B66900258 _link_body448D24D90367 "Stereotype::_linkStereotypeConstraint"
  public void _linkStereotypeConstraint(Constraint stereotypeConstraint1)
  {
    stereotypeConstraint.add(stereotypeConstraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkStereotypeConstraint"));
    return;
  }
  // -end- 364B66900258 _link_body448D24D90367 "Stereotype::_linkStereotypeConstraint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B66900258 _unlink_body448D24D90367 "Stereotype::_unlinkStereotypeConstraint"
  public void _unlinkStereotypeConstraint(Constraint stereotypeConstraint1)
  {
    stereotypeConstraint.remove(stereotypeConstraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkStereotypeConstraint"));
    return;
  }
  // -end- 364B66900258 _unlink_body448D24D90367 "Stereotype::_unlinkStereotypeConstraint"

  // -beg- preserve=no 338614B602CD var448D24D90367 "icon"
  private Geometry icon = null;
  // -end- 338614B602CD var448D24D90367 "icon"

  /** get current value of icon
   *  The geometrical description for an icon to be used to present animage of a model element branded by the stereotype.
   *  @see #setIcon
   */
  // -beg- preserve=no 338614B602CD get_head448D24D90367 "icon"
  public  Geometry getIcon()
  // -end- 338614B602CD get_head448D24D90367 "icon"
  {
    // -beg- preserve=no 338614B602CD get_body448D24D90367 "icon"
    return icon;
    // -end- 338614B602CD get_body448D24D90367 "icon"
  }

  /** set current value of icon
   *  @see #getIcon
   */
  // -beg- preserve=no 338614B602CD set_head448D24D90367 "icon"
  public  void setIcon(Geometry value1)
  // -end- 338614B602CD set_head448D24D90367 "icon"
  {
    // -beg- preserve=no 338614B602CD set_body448D24D90367 "icon"
    if(icon!=value1 && (icon==null || !icon.equals(value1))){
      icon = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setIcon"));
    }
    // -end- 338614B602CD set_body448D24D90367 "icon"
  }

  // -beg- preserve=no 340389C403C0 var448D24D90367 "baseClass"
  private String baseClass;
  // -end- 340389C403C0 var448D24D90367 "baseClass"

  /** get current value of baseClass
   *  Specifies the names of one or more UML modeling elements towhich the stereotype applies, such as Class, Association,Refinement, Constraint, etc.
   *  @see #setBaseClass
   */
  // -beg- preserve=no 340389C403C0 get_head448D24D90367 "baseClass"
  public  String getBaseClass()
  // -end- 340389C403C0 get_head448D24D90367 "baseClass"
  {
    // -beg- preserve=no 340389C403C0 get_body448D24D90367 "baseClass"
    return baseClass;
    // -end- 340389C403C0 get_body448D24D90367 "baseClass"
  }

  /** set current value of baseClass
   *  @see #getBaseClass
   */
  // -beg- preserve=no 340389C403C0 set_head448D24D90367 "baseClass"
  public  void setBaseClass(String value1)
  // -end- 340389C403C0 set_head448D24D90367 "baseClass"
  {
    // -beg- preserve=no 340389C403C0 set_body448D24D90367 "baseClass"
    if(baseClass != value1){
      baseClass = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBaseClass"));
    }
    // -end- 340389C403C0 set_body448D24D90367 "baseClass"
  }

  // -beg- preserve=no 335C14A5019A code448D24D90367 "generalization"
  private java.util.Set generalization = new java.util.HashSet();
  // -end- 335C14A5019A code448D24D90367 "generalization"

  /** add a Generalization.
   *  
   *  @see #removeGeneralization
   *  @see #containsGeneralization
   *  @see #iteratorGeneralization
   *  @see #clearGeneralization
   *  @see #sizeGeneralization
   */
  // -beg- preserve=no 335C14A5019A add_head448D24D90367 "GeneralizableElement::addGeneralization"
  public void addGeneralization(Generalization generalization1)
  // -end- 335C14A5019A add_head448D24D90367 "GeneralizableElement::addGeneralization"
  {
    // -beg- preserve=no 335C14A5019A add_body448D24D90367 "GeneralizableElement::addGeneralization"
    generalization.add(generalization1);
    generalization1._linkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addGeneralization"));
    return;
    // -end- 335C14A5019A add_body448D24D90367 "GeneralizableElement::addGeneralization"
  }

  /** disconnect a Generalization.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_head448D24D90367 "GeneralizableElement::removeGeneralization"
  public Generalization removeGeneralization(Generalization generalization1)
  // -end- 335C14A5019A remove_head448D24D90367 "GeneralizableElement::removeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_body448D24D90367 "GeneralizableElement::removeGeneralization"
    Generalization ret=null;
    if(generalization1==null || !generalization.contains(generalization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = generalization1;
    generalization.remove(generalization1);
    generalization1._unlinkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeGeneralization"));
    return ret;
    // -end- 335C14A5019A remove_body448D24D90367 "GeneralizableElement::removeGeneralization"
  }

  /** tests if a given Generalization is connected.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A test_head448D24D90367 "GeneralizableElement::containsGeneralization"
  public boolean containsGeneralization(Generalization generalization1)
  // -end- 335C14A5019A test_head448D24D90367 "GeneralizableElement::containsGeneralization"
  {
    // -beg- preserve=no 335C14A5019A test_body448D24D90367 "GeneralizableElement::containsGeneralization"
    return generalization.contains(generalization1);
    // -end- 335C14A5019A test_body448D24D90367 "GeneralizableElement::containsGeneralization"
  }

  /** used to enumerate all connected Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A get_all_head448D24D90367 "GeneralizableElement::iteratorGeneralization"
  public java.util.Iterator iteratorGeneralization()
  // -end- 335C14A5019A get_all_head448D24D90367 "GeneralizableElement::iteratorGeneralization"
  {
    // -beg- preserve=no 335C14A5019A get_all_body448D24D90367 "GeneralizableElement::iteratorGeneralization"
    return generalization.iterator();
    // -end- 335C14A5019A get_all_body448D24D90367 "GeneralizableElement::iteratorGeneralization"
  }

  /** disconnect all Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_all_head448D24D90367 "GeneralizableElement::clearGeneralization"
  public void clearGeneralization()
  // -end- 335C14A5019A remove_all_head448D24D90367 "GeneralizableElement::clearGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_all_body448D24D90367 "GeneralizableElement::clearGeneralization"
    if(sizeGeneralization()>0){
      for(java.util.Iterator p = generalization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkChild(this);
      }
      generalization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearGeneralization"));
    }
    // -end- 335C14A5019A remove_all_body448D24D90367 "GeneralizableElement::clearGeneralization"
  }

  /** returns the number of Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A size_head448D24D90367 "GeneralizableElement::sizeGeneralization"
  public int sizeGeneralization()
  // -end- 335C14A5019A size_head448D24D90367 "GeneralizableElement::sizeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A size_body448D24D90367 "GeneralizableElement::sizeGeneralization"
    return generalization.size();
    // -end- 335C14A5019A size_body448D24D90367 "GeneralizableElement::sizeGeneralization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _link_body448D24D90367 "GeneralizableElement::_linkGeneralization"
  public void _linkGeneralization(Generalization generalization1)
  {
    generalization.add(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _link_body448D24D90367 "GeneralizableElement::_linkGeneralization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _unlink_body448D24D90367 "GeneralizableElement::_unlinkGeneralization"
  public void _unlinkGeneralization(Generalization generalization1)
  {
    generalization.remove(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _unlink_body448D24D90367 "GeneralizableElement::_unlinkGeneralization"

  // -beg- preserve=no 335C146B01D6 code448D24D90367 "specialization"
  private java.util.Set specialization = new java.util.HashSet();
  // -end- 335C146B01D6 code448D24D90367 "specialization"

  /** add a Specialization.
   *  
   *  @see #removeSpecialization
   *  @see #containsSpecialization
   *  @see #iteratorSpecialization
   *  @see #clearSpecialization
   *  @see #sizeSpecialization
   */
  // -beg- preserve=no 335C146B01D6 add_head448D24D90367 "GeneralizableElement::addSpecialization"
  public void addSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 add_head448D24D90367 "GeneralizableElement::addSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 add_body448D24D90367 "GeneralizableElement::addSpecialization"
    specialization.add(specialization1);
    specialization1._linkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecialization"));
    return;
    // -end- 335C146B01D6 add_body448D24D90367 "GeneralizableElement::addSpecialization"
  }

  /** disconnect a Specialization.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_head448D24D90367 "GeneralizableElement::removeSpecialization"
  public Generalization removeSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 remove_head448D24D90367 "GeneralizableElement::removeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_body448D24D90367 "GeneralizableElement::removeSpecialization"
    Generalization ret=null;
    if(specialization1==null || !specialization.contains(specialization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = specialization1;
    specialization.remove(specialization1);
    specialization1._unlinkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecialization"));
    return ret;
    // -end- 335C146B01D6 remove_body448D24D90367 "GeneralizableElement::removeSpecialization"
  }

  /** tests if a given Specialization is connected.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 test_head448D24D90367 "GeneralizableElement::containsSpecialization"
  public boolean containsSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 test_head448D24D90367 "GeneralizableElement::containsSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 test_body448D24D90367 "GeneralizableElement::containsSpecialization"
    return specialization.contains(specialization1);
    // -end- 335C146B01D6 test_body448D24D90367 "GeneralizableElement::containsSpecialization"
  }

  /** used to enumerate all connected Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 get_all_head448D24D90367 "GeneralizableElement::iteratorSpecialization"
  public java.util.Iterator iteratorSpecialization()
  // -end- 335C146B01D6 get_all_head448D24D90367 "GeneralizableElement::iteratorSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 get_all_body448D24D90367 "GeneralizableElement::iteratorSpecialization"
    return specialization.iterator();
    // -end- 335C146B01D6 get_all_body448D24D90367 "GeneralizableElement::iteratorSpecialization"
  }

  /** disconnect all Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_all_head448D24D90367 "GeneralizableElement::clearSpecialization"
  public void clearSpecialization()
  // -end- 335C146B01D6 remove_all_head448D24D90367 "GeneralizableElement::clearSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_all_body448D24D90367 "GeneralizableElement::clearSpecialization"
    if(sizeSpecialization()>0){
      for(java.util.Iterator p = specialization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkParent(this);
      }
      specialization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecialization"));
    }
    // -end- 335C146B01D6 remove_all_body448D24D90367 "GeneralizableElement::clearSpecialization"
  }

  /** returns the number of Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 size_head448D24D90367 "GeneralizableElement::sizeSpecialization"
  public int sizeSpecialization()
  // -end- 335C146B01D6 size_head448D24D90367 "GeneralizableElement::sizeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 size_body448D24D90367 "GeneralizableElement::sizeSpecialization"
    return specialization.size();
    // -end- 335C146B01D6 size_body448D24D90367 "GeneralizableElement::sizeSpecialization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _link_body448D24D90367 "GeneralizableElement::_linkSpecialization"
  public void _linkSpecialization(Generalization specialization1)
  {
    specialization.add(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _link_body448D24D90367 "GeneralizableElement::_linkSpecialization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _unlink_body448D24D90367 "GeneralizableElement::_unlinkSpecialization"
  public void _unlinkSpecialization(Generalization specialization1)
  {
    specialization.remove(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _unlink_body448D24D90367 "GeneralizableElement::_unlinkSpecialization"

  // -beg- preserve=no 327A877801CC var448D24D90367 "isRoot"
  private boolean isRoot;
  // -end- 327A877801CC var448D24D90367 "isRoot"

  /** get current value of isRoot
   *  @see #setRoot
   */
  // -beg- preserve=no 327A877801CC get_head448D24D90367 "isRoot"
  public  boolean isRoot()
  // -end- 327A877801CC get_head448D24D90367 "isRoot"
  {
    // -beg- preserve=no 327A877801CC get_body448D24D90367 "isRoot"
    return isRoot;
    // -end- 327A877801CC get_body448D24D90367 "isRoot"
  }

  /** set current value of isRoot
   *  @see #isRoot
   */
  // -beg- preserve=no 327A877801CC set_head448D24D90367 "isRoot"
  public  void setRoot(boolean value1)
  // -end- 327A877801CC set_head448D24D90367 "isRoot"
  {
    // -beg- preserve=no 327A877801CC set_body448D24D90367 "isRoot"
    if(isRoot != value1){
      isRoot = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
    }
    // -end- 327A877801CC set_body448D24D90367 "isRoot"
  }

  // -beg- preserve=no 327A877E006E var448D24D90367 "isLeaf"
  private boolean isLeaf;
  // -end- 327A877E006E var448D24D90367 "isLeaf"

  /** get current value of isLeaf
   *  @see #setLeaf
   */
  // -beg- preserve=no 327A877E006E get_head448D24D90367 "isLeaf"
  public  boolean isLeaf()
  // -end- 327A877E006E get_head448D24D90367 "isLeaf"
  {
    // -beg- preserve=no 327A877E006E get_body448D24D90367 "isLeaf"
    return isLeaf;
    // -end- 327A877E006E get_body448D24D90367 "isLeaf"
  }

  /** set current value of isLeaf
   *  @see #isLeaf
   */
  // -beg- preserve=no 327A877E006E set_head448D24D90367 "isLeaf"
  public  void setLeaf(boolean value1)
  // -end- 327A877E006E set_head448D24D90367 "isLeaf"
  {
    // -beg- preserve=no 327A877E006E set_body448D24D90367 "isLeaf"
    if(isLeaf != value1){
      isLeaf = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
    }
    // -end- 327A877E006E set_body448D24D90367 "isLeaf"
  }

  // -beg- preserve=no 327A878400D2 var448D24D90367 "isAbstract"
  private boolean isAbstract;
  // -end- 327A878400D2 var448D24D90367 "isAbstract"

  /** get current value of isAbstract
   *  @see #setAbstract
   */
  // -beg- preserve=no 327A878400D2 get_head448D24D90367 "isAbstract"
  public  boolean isAbstract()
  // -end- 327A878400D2 get_head448D24D90367 "isAbstract"
  {
    // -beg- preserve=no 327A878400D2 get_body448D24D90367 "isAbstract"
    return isAbstract;
    // -end- 327A878400D2 get_body448D24D90367 "isAbstract"
  }

  /** set current value of isAbstract
   *  @see #isAbstract
   */
  // -beg- preserve=no 327A878400D2 set_head448D24D90367 "isAbstract"
  public  void setAbstract(boolean value1)
  // -end- 327A878400D2 set_head448D24D90367 "isAbstract"
  {
    // -beg- preserve=no 327A878400D2 set_body448D24D90367 "isAbstract"
    if(isAbstract != value1){
      isAbstract = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
    }
    // -end- 327A878400D2 set_body448D24D90367 "isAbstract"
  }

  // -beg- preserve=no 3CE2221702C6 head448D24D90367 "getDefLangName"
  public String getDefLangName()
  // -end- 3CE2221702C6 head448D24D90367 "getDefLangName"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE2221702C6 throws448D24D90367 "getDefLangName"

    // -end- 3CE2221702C6 throws448D24D90367 "getDefLangName"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3CE2221702C6 body448D24D90367 "getDefLangName"
    return null;
    // -end- 3CE2221702C6 body448D24D90367 "getDefLangName"
    }

  // -beg- preserve=no 3CE222250149 head448D24D90367 "setDefLangName"
  public void setDefLangName(String name)
  // -end- 3CE222250149 head448D24D90367 "setDefLangName"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE222250149 throws448D24D90367 "setDefLangName"

    // -end- 3CE222250149 throws448D24D90367 "setDefLangName"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3CE222250149 body448D24D90367 "setDefLangName"
    return;
    // -end- 3CE222250149 body448D24D90367 "setDefLangName"
    }

  // -beg- preserve=no 33CF8BD500F1 code448D24D90367 "behavior"
  private java.util.Set behavior = new java.util.HashSet();
  // -end- 33CF8BD500F1 code448D24D90367 "behavior"

  /** add a Behavior.
   *  
   *  @see #removeBehavior
   *  @see #containsBehavior
   *  @see #iteratorBehavior
   *  @see #clearBehavior
   *  @see #sizeBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 add_head448D24D90367 "ModelElement::addBehavior"
  public void addBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 add_head448D24D90367 "ModelElement::addBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 add_body448D24D90367 "ModelElement::addBehavior"
    behavior.add(behavior1);
    behavior1._linkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addBehavior"));
    return;
    // -end- 33CF8BD500F1 add_body448D24D90367 "ModelElement::addBehavior"
  }

  /** disconnect a Behavior.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 remove_head448D24D90367 "ModelElement::removeBehavior"
  public StateMachine removeBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 remove_head448D24D90367 "ModelElement::removeBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 remove_body448D24D90367 "ModelElement::removeBehavior"
    StateMachine ret=null;
    if(behavior1==null || !behavior.contains(behavior1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = behavior1;
    behavior.remove(behavior1);
    behavior1._unlinkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeBehavior"));
    return ret;
    // -end- 33CF8BD500F1 remove_body448D24D90367 "ModelElement::removeBehavior"
  }

  /** tests if a given Behavior is connected.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 test_head448D24D90367 "ModelElement::containsBehavior"
  public boolean containsBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 test_head448D24D90367 "ModelElement::containsBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 test_body448D24D90367 "ModelElement::containsBehavior"
    return behavior.contains(behavior1);
    // -end- 33CF8BD500F1 test_body448D24D90367 "ModelElement::containsBehavior"
  }

  /** used to enumerate all connected Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 get_all_head448D24D90367 "ModelElement::iteratorBehavior"
  public java.util.Iterator iteratorBehavior()
  // -end- 33CF8BD500F1 get_all_head448D24D90367 "ModelElement::iteratorBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 get_all_body448D24D90367 "ModelElement::iteratorBehavior"
    return behavior.iterator();
    // -end- 33CF8BD500F1 get_all_body448D24D90367 "ModelElement::iteratorBehavior"
  }

  /** disconnect all Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 remove_all_head448D24D90367 "ModelElement::clearBehavior"
  public void clearBehavior()
  // -end- 33CF8BD500F1 remove_all_head448D24D90367 "ModelElement::clearBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 remove_all_body448D24D90367 "ModelElement::clearBehavior"
    if(sizeBehavior()>0){
      for(java.util.Iterator p = behavior.iterator(); p.hasNext();){
        ((StateMachine)p.next())._unlinkContext(this);
      }
      behavior.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearBehavior"));
    }
    // -end- 33CF8BD500F1 remove_all_body448D24D90367 "ModelElement::clearBehavior"
  }

  /** returns the number of Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 size_head448D24D90367 "ModelElement::sizeBehavior"
  public int sizeBehavior()
  // -end- 33CF8BD500F1 size_head448D24D90367 "ModelElement::sizeBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 size_body448D24D90367 "ModelElement::sizeBehavior"
    return behavior.size();
    // -end- 33CF8BD500F1 size_body448D24D90367 "ModelElement::sizeBehavior"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F1 _link_body448D24D90367 "ModelElement::_linkBehavior"
  public void _linkBehavior(StateMachine behavior1)
  {
    behavior.add(behavior1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBehavior"));
    return;
  }
  // -end- 33CF8BD500F1 _link_body448D24D90367 "ModelElement::_linkBehavior"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F1 _unlink_body448D24D90367 "ModelElement::_unlinkBehavior"
  public void _unlinkBehavior(StateMachine behavior1)
  {
    behavior.remove(behavior1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBehavior"));
    return;
  }
  // -end- 33CF8BD500F1 _unlink_body448D24D90367 "ModelElement::_unlinkBehavior"

  // -beg- preserve=no 33CF9A030140 code448D24D90367 "partition"
  private java.util.Set partition = new java.util.HashSet();
  // -end- 33CF9A030140 code448D24D90367 "partition"

  /** add a Partition.
   *  
   *  @see #removePartition
   *  @see #containsPartition
   *  @see #iteratorPartition
   *  @see #clearPartition
   *  @see #sizePartition
   */
  // -beg- preserve=no 33CF9A030140 add_head448D24D90367 "ModelElement::addPartition"
  public void addPartition(Partition partition1)
  // -end- 33CF9A030140 add_head448D24D90367 "ModelElement::addPartition"
  {
    // -beg- preserve=no 33CF9A030140 add_body448D24D90367 "ModelElement::addPartition"
    partition.add(partition1);
    partition1._linkContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPartition"));
    return;
    // -end- 33CF9A030140 add_body448D24D90367 "ModelElement::addPartition"
  }

  /** disconnect a Partition.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 remove_head448D24D90367 "ModelElement::removePartition"
  public Partition removePartition(Partition partition1)
  // -end- 33CF9A030140 remove_head448D24D90367 "ModelElement::removePartition"
  {
    // -beg- preserve=no 33CF9A030140 remove_body448D24D90367 "ModelElement::removePartition"
    Partition ret=null;
    if(partition1==null || !partition.contains(partition1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = partition1;
    partition.remove(partition1);
    partition1._unlinkContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePartition"));
    return ret;
    // -end- 33CF9A030140 remove_body448D24D90367 "ModelElement::removePartition"
  }

  /** tests if a given Partition is connected.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 test_head448D24D90367 "ModelElement::containsPartition"
  public boolean containsPartition(Partition partition1)
  // -end- 33CF9A030140 test_head448D24D90367 "ModelElement::containsPartition"
  {
    // -beg- preserve=no 33CF9A030140 test_body448D24D90367 "ModelElement::containsPartition"
    return partition.contains(partition1);
    // -end- 33CF9A030140 test_body448D24D90367 "ModelElement::containsPartition"
  }

  /** used to enumerate all connected Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 get_all_head448D24D90367 "ModelElement::iteratorPartition"
  public java.util.Iterator iteratorPartition()
  // -end- 33CF9A030140 get_all_head448D24D90367 "ModelElement::iteratorPartition"
  {
    // -beg- preserve=no 33CF9A030140 get_all_body448D24D90367 "ModelElement::iteratorPartition"
    return partition.iterator();
    // -end- 33CF9A030140 get_all_body448D24D90367 "ModelElement::iteratorPartition"
  }

  /** disconnect all Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 remove_all_head448D24D90367 "ModelElement::clearPartition"
  public void clearPartition()
  // -end- 33CF9A030140 remove_all_head448D24D90367 "ModelElement::clearPartition"
  {
    // -beg- preserve=no 33CF9A030140 remove_all_body448D24D90367 "ModelElement::clearPartition"
    if(sizePartition()>0){
      for(java.util.Iterator p = partition.iterator(); p.hasNext();){
        ((Partition)p.next())._unlinkContents(this);
      }
      partition.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPartition"));
    }
    // -end- 33CF9A030140 remove_all_body448D24D90367 "ModelElement::clearPartition"
  }

  /** returns the number of Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 size_head448D24D90367 "ModelElement::sizePartition"
  public int sizePartition()
  // -end- 33CF9A030140 size_head448D24D90367 "ModelElement::sizePartition"
  {
    // -beg- preserve=no 33CF9A030140 size_body448D24D90367 "ModelElement::sizePartition"
    return partition.size();
    // -end- 33CF9A030140 size_body448D24D90367 "ModelElement::sizePartition"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030140 _link_body448D24D90367 "ModelElement::_linkPartition"
  public void _linkPartition(Partition partition1)
  {
    partition.add(partition1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPartition"));
    return;
  }
  // -end- 33CF9A030140 _link_body448D24D90367 "ModelElement::_linkPartition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030140 _unlink_body448D24D90367 "ModelElement::_unlinkPartition"
  public void _unlinkPartition(Partition partition1)
  {
    partition.remove(partition1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPartition"));
    return;
  }
  // -end- 33CF9A030140 _unlink_body448D24D90367 "ModelElement::_unlinkPartition"

  // -beg- preserve=no 33D1394E029F code448D24D90367 "collaboration"
  private java.util.Set collaboration = new java.util.HashSet();
  // -end- 33D1394E029F code448D24D90367 "collaboration"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head448D24D90367 "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head448D24D90367 "ModelElement::addCollaboration"
  {
    // -beg- preserve=no 33D1394E029F add_body448D24D90367 "ModelElement::addCollaboration"
    collaboration.add(collaboration1);
    collaboration1._linkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaboration"));
    return;
    // -end- 33D1394E029F add_body448D24D90367 "ModelElement::addCollaboration"
  }

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head448D24D90367 "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head448D24D90367 "ModelElement::removeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_body448D24D90367 "ModelElement::removeCollaboration"
    Collaboration ret=null;
    if(collaboration1==null || !collaboration.contains(collaboration1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = collaboration1;
    collaboration.remove(collaboration1);
    collaboration1._unlinkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaboration"));
    return ret;
    // -end- 33D1394E029F remove_body448D24D90367 "ModelElement::removeCollaboration"
  }

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head448D24D90367 "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head448D24D90367 "ModelElement::containsCollaboration"
  {
    // -beg- preserve=no 33D1394E029F test_body448D24D90367 "ModelElement::containsCollaboration"
    return collaboration.contains(collaboration1);
    // -end- 33D1394E029F test_body448D24D90367 "ModelElement::containsCollaboration"
  }

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head448D24D90367 "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head448D24D90367 "ModelElement::iteratorCollaboration"
  {
    // -beg- preserve=no 33D1394E029F get_all_body448D24D90367 "ModelElement::iteratorCollaboration"
    return collaboration.iterator();
    // -end- 33D1394E029F get_all_body448D24D90367 "ModelElement::iteratorCollaboration"
  }

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head448D24D90367 "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head448D24D90367 "ModelElement::clearCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_all_body448D24D90367 "ModelElement::clearCollaboration"
    if(sizeCollaboration()>0){
      for(java.util.Iterator p = collaboration.iterator(); p.hasNext();){
        ((Collaboration)p.next())._unlinkConstrainingElement(this);
      }
      collaboration.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaboration"));
    }
    // -end- 33D1394E029F remove_all_body448D24D90367 "ModelElement::clearCollaboration"
  }

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head448D24D90367 "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head448D24D90367 "ModelElement::sizeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F size_body448D24D90367 "ModelElement::sizeCollaboration"
    return collaboration.size();
    // -end- 33D1394E029F size_body448D24D90367 "ModelElement::sizeCollaboration"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body448D24D90367 "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1)
  {
    collaboration.add(collaboration1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaboration"));
    return;
  }
  // -end- 33D1394E029F _link_body448D24D90367 "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body448D24D90367 "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1)
  {
    collaboration.remove(collaboration1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaboration"));
    return;
  }
  // -end- 33D1394E029F _unlink_body448D24D90367 "ModelElement::_unlinkCollaboration"

  // -beg- preserve=no 36008FB700E7 code448D24D90367 "classifierRole"
  private java.util.Set classifierRole = new java.util.HashSet();
  // -end- 36008FB700E7 code448D24D90367 "classifierRole"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head448D24D90367 "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head448D24D90367 "ModelElement::addClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 add_body448D24D90367 "ModelElement::addClassifierRole"
    classifierRole.add(classifierRole1);
    classifierRole1._linkAvailableContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassifierRole"));
    return;
    // -end- 36008FB700E7 add_body448D24D90367 "ModelElement::addClassifierRole"
  }

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head448D24D90367 "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head448D24D90367 "ModelElement::removeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_body448D24D90367 "ModelElement::removeClassifierRole"
    ClassifierRole ret=null;
    if(classifierRole1==null || !classifierRole.contains(classifierRole1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = classifierRole1;
    classifierRole.remove(classifierRole1);
    classifierRole1._unlinkAvailableContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassifierRole"));
    return ret;
    // -end- 36008FB700E7 remove_body448D24D90367 "ModelElement::removeClassifierRole"
  }

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head448D24D90367 "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head448D24D90367 "ModelElement::containsClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 test_body448D24D90367 "ModelElement::containsClassifierRole"
    return classifierRole.contains(classifierRole1);
    // -end- 36008FB700E7 test_body448D24D90367 "ModelElement::containsClassifierRole"
  }

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head448D24D90367 "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head448D24D90367 "ModelElement::iteratorClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 get_all_body448D24D90367 "ModelElement::iteratorClassifierRole"
    return classifierRole.iterator();
    // -end- 36008FB700E7 get_all_body448D24D90367 "ModelElement::iteratorClassifierRole"
  }

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head448D24D90367 "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head448D24D90367 "ModelElement::clearClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_all_body448D24D90367 "ModelElement::clearClassifierRole"
    if(sizeClassifierRole()>0){
      for(java.util.Iterator p = classifierRole.iterator(); p.hasNext();){
        ((ClassifierRole)p.next())._unlinkAvailableContents(this);
      }
      classifierRole.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassifierRole"));
    }
    // -end- 36008FB700E7 remove_all_body448D24D90367 "ModelElement::clearClassifierRole"
  }

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head448D24D90367 "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head448D24D90367 "ModelElement::sizeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 size_body448D24D90367 "ModelElement::sizeClassifierRole"
    return classifierRole.size();
    // -end- 36008FB700E7 size_body448D24D90367 "ModelElement::sizeClassifierRole"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body448D24D90367 "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1)
  {
    classifierRole.add(classifierRole1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassifierRole"));
    return;
  }
  // -end- 36008FB700E7 _link_body448D24D90367 "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body448D24D90367 "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1)
  {
    classifierRole.remove(classifierRole1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassifierRole"));
    return;
  }
  // -end- 36008FB700E7 _unlink_body448D24D90367 "ModelElement::_unlinkClassifierRole"

  // -beg- preserve=no 39E9065C0186 code448D24D90367 "collaborationInstanceSet"
  private java.util.Set collaborationInstanceSet = new java.util.HashSet();
  // -end- 39E9065C0186 code448D24D90367 "collaborationInstanceSet"

  /** add a CollaborationInstanceSet.
   *  
   *  @see #removeCollaborationInstanceSet
   *  @see #containsCollaborationInstanceSet
   *  @see #iteratorCollaborationInstanceSet
   *  @see #clearCollaborationInstanceSet
   *  @see #sizeCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 add_head448D24D90367 "ModelElement::addCollaborationInstanceSet"
  public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 add_head448D24D90367 "ModelElement::addCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 add_body448D24D90367 "ModelElement::addCollaborationInstanceSet"
    collaborationInstanceSet.add(collaborationInstanceSet1);
    collaborationInstanceSet1._linkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaborationInstanceSet"));
    return;
    // -end- 39E9065C0186 add_body448D24D90367 "ModelElement::addCollaborationInstanceSet"
  }

  /** disconnect a CollaborationInstanceSet.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_head448D24D90367 "ModelElement::removeCollaborationInstanceSet"
  public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 remove_head448D24D90367 "ModelElement::removeCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 remove_body448D24D90367 "ModelElement::removeCollaborationInstanceSet"
    CollaborationInstanceSet ret=null;
    if(collaborationInstanceSet1==null || !collaborationInstanceSet.contains(collaborationInstanceSet1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = collaborationInstanceSet1;
    collaborationInstanceSet.remove(collaborationInstanceSet1);
    collaborationInstanceSet1._unlinkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaborationInstanceSet"));
    return ret;
    // -end- 39E9065C0186 remove_body448D24D90367 "ModelElement::removeCollaborationInstanceSet"
  }

  /** tests if a given CollaborationInstanceSet is connected.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 test_head448D24D90367 "ModelElement::containsCollaborationInstanceSet"
  public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 test_head448D24D90367 "ModelElement::containsCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 test_body448D24D90367 "ModelElement::containsCollaborationInstanceSet"
    return collaborationInstanceSet.contains(collaborationInstanceSet1);
    // -end- 39E9065C0186 test_body448D24D90367 "ModelElement::containsCollaborationInstanceSet"
  }

  /** used to enumerate all connected CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 get_all_head448D24D90367 "ModelElement::iteratorCollaborationInstanceSet"
  public java.util.Iterator iteratorCollaborationInstanceSet()
  // -end- 39E9065C0186 get_all_head448D24D90367 "ModelElement::iteratorCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 get_all_body448D24D90367 "ModelElement::iteratorCollaborationInstanceSet"
    return collaborationInstanceSet.iterator();
    // -end- 39E9065C0186 get_all_body448D24D90367 "ModelElement::iteratorCollaborationInstanceSet"
  }

  /** disconnect all CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_all_head448D24D90367 "ModelElement::clearCollaborationInstanceSet"
  public void clearCollaborationInstanceSet()
  // -end- 39E9065C0186 remove_all_head448D24D90367 "ModelElement::clearCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 remove_all_body448D24D90367 "ModelElement::clearCollaborationInstanceSet"
    if(sizeCollaborationInstanceSet()>0){
      for(java.util.Iterator p = collaborationInstanceSet.iterator(); p.hasNext();){
        ((CollaborationInstanceSet)p.next())._unlinkConstrainingElement(this);
      }
      collaborationInstanceSet.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaborationInstanceSet"));
    }
    // -end- 39E9065C0186 remove_all_body448D24D90367 "ModelElement::clearCollaborationInstanceSet"
  }

  /** returns the number of CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 size_head448D24D90367 "ModelElement::sizeCollaborationInstanceSet"
  public int sizeCollaborationInstanceSet()
  // -end- 39E9065C0186 size_head448D24D90367 "ModelElement::sizeCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 size_body448D24D90367 "ModelElement::sizeCollaborationInstanceSet"
    return collaborationInstanceSet.size();
    // -end- 39E9065C0186 size_body448D24D90367 "ModelElement::sizeCollaborationInstanceSet"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _link_body448D24D90367 "ModelElement::_linkCollaborationInstanceSet"
  public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  {
    collaborationInstanceSet.add(collaborationInstanceSet1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaborationInstanceSet"));
    return;
  }
  // -end- 39E9065C0186 _link_body448D24D90367 "ModelElement::_linkCollaborationInstanceSet"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _unlink_body448D24D90367 "ModelElement::_unlinkCollaborationInstanceSet"
  public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  {
    collaborationInstanceSet.remove(collaborationInstanceSet1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaborationInstanceSet"));
    return;
  }
  // -end- 39E9065C0186 _unlink_body448D24D90367 "ModelElement::_unlinkCollaborationInstanceSet"

  // -beg- preserve=no 33598CAA030E code448D24D90367 "namespace"
  private ElementOwnership namespace;
  // -end- 33598CAA030E code448D24D90367 "namespace"

  /** attaches a Namespace.
   *  Designates the Namespace that contains the ModelElement.
   *  @see #detachNamespace
   *  @see #getNamespace
   *  @see #containsNamespace
   *  @see #getNamespaceLink
   *  @see #createNamespaceLink
   */
  // -beg- preserve=no 33598CAA030E attach_head448D24D90367 "ModelElement::attachNamespace"
  public void attachNamespace(Namespace namespace1)
  // -end- 33598CAA030E attach_head448D24D90367 "ModelElement::attachNamespace"
  {
    // -beg- preserve=no 33598CAA030E attach_body448D24D90367 "ModelElement::attachNamespace"
    if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
    if(namespace1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as namespace");}
    namespace = createNamespaceLink();
    namespace.setNamespace(namespace1);
    namespace.setOwnedElement(this);
    namespace1._linkOwnedElement(namespace);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespace"));
    return;
    // -end- 33598CAA030E attach_body448D24D90367 "ModelElement::attachNamespace"
  }

  /** attaches a link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E attachlink_head448D24D90367 "ModelElement::attachNamespaceLink"
  public void attachNamespaceLink(ElementOwnership namespace1)
  // -end- 33598CAA030E attachlink_head448D24D90367 "ModelElement::attachNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E attachlink_body448D24D90367 "ModelElement::attachNamespaceLink"
    if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
    namespace = namespace1;
    namespace.setOwnedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespaceLink"));
    return;
    // -end- 33598CAA030E attachlink_body448D24D90367 "ModelElement::attachNamespaceLink"
  }

  /** disconnect the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E detach_head448D24D90367 "ModelElement::detachNamespace"
  public Namespace detachNamespace()
  // -end- 33598CAA030E detach_head448D24D90367 "ModelElement::detachNamespace"
  {
    // -beg- preserve=no 33598CAA030E detach_body448D24D90367 "ModelElement::detachNamespace"
    Namespace ret = null;
    if(namespace!=null){
      ret = namespace.getNamespace();
      ret._unlinkOwnedElement(namespace);
      namespace = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachNamespace"));
    return ret;
    // -end- 33598CAA030E detach_body448D24D90367 "ModelElement::detachNamespace"
  }

  /** get the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E get_head448D24D90367 "ModelElement::getNamespace"
  public Namespace getNamespace()
  // -end- 33598CAA030E get_head448D24D90367 "ModelElement::getNamespace"
  {
    // -beg- preserve=no 33598CAA030E get_body448D24D90367 "ModelElement::getNamespace"
    if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
    return namespace.getNamespace();
    // -end- 33598CAA030E get_body448D24D90367 "ModelElement::getNamespace"
  }

  /** get the link class of currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E getlink_head448D24D90367 "ModelElement::getNamespaceLink"
  public ElementOwnership getNamespaceLink()
  // -end- 33598CAA030E getlink_head448D24D90367 "ModelElement::getNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E getlink_body448D24D90367 "ModelElement::getNamespaceLink"
    if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
    return namespace;
    // -end- 33598CAA030E getlink_body448D24D90367 "ModelElement::getNamespaceLink"
  }

  /** create a link class for a new link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E createlink_head448D24D90367 "ModelElement::createNamespaceLink"
  public ElementOwnership createNamespaceLink()
  // -end- 33598CAA030E createlink_head448D24D90367 "ModelElement::createNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E createlink_body448D24D90367 "ModelElement::createNamespaceLink"
    return new ElementOwnership();
    // -end- 33598CAA030E createlink_body448D24D90367 "ModelElement::createNamespaceLink"
  }

  /** tests if there is a Namespace attached.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E test_head448D24D90367 "ModelElement::containsNamespace"
  public boolean containsNamespace()
  // -end- 33598CAA030E test_head448D24D90367 "ModelElement::containsNamespace"
  {
    // -beg- preserve=no 33598CAA030E test_body448D24D90367 "ModelElement::containsNamespace"
    return namespace!=null;
    // -end- 33598CAA030E test_body448D24D90367 "ModelElement::containsNamespace"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _link_body448D24D90367 "ModelElement::_linkNamespace"
  public void _linkNamespace(ElementOwnership namespace1)
  {
    namespace = namespace1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkNamespace"));
    return;
  }
  // -end- 33598CAA030E _link_body448D24D90367 "ModelElement::_linkNamespace"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _unlink_body448D24D90367 "ModelElement::_unlinkNamespace"
  public void _unlinkNamespace(ElementOwnership namespace1)
  {
    namespace = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkNamespace"));
    return;
  }
  // -end- 33598CAA030E _unlink_body448D24D90367 "ModelElement::_unlinkNamespace"

  // -beg- preserve=no 33FFE57B0395 code448D24D90367 "clientDependency"
  private java.util.Set clientDependency = new java.util.HashSet();
  // -end- 33FFE57B0395 code448D24D90367 "clientDependency"

  /** add a ClientDependency.
   *  
   *  @see #removeClientDependency
   *  @see #containsClientDependency
   *  @see #iteratorClientDependency
   *  @see #clearClientDependency
   *  @see #sizeClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 add_head448D24D90367 "ModelElement::addClientDependency"
  public void addClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 add_head448D24D90367 "ModelElement::addClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 add_body448D24D90367 "ModelElement::addClientDependency"
    clientDependency.add(clientDependency1);
    clientDependency1._linkClient(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClientDependency"));
    return;
    // -end- 33FFE57B0395 add_body448D24D90367 "ModelElement::addClientDependency"
  }

  /** disconnect a ClientDependency.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_head448D24D90367 "ModelElement::removeClientDependency"
  public Dependency removeClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 remove_head448D24D90367 "ModelElement::removeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_body448D24D90367 "ModelElement::removeClientDependency"
    Dependency ret=null;
    if(clientDependency1==null || !clientDependency.contains(clientDependency1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = clientDependency1;
    clientDependency.remove(clientDependency1);
    clientDependency1._unlinkClient(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClientDependency"));
    return ret;
    // -end- 33FFE57B0395 remove_body448D24D90367 "ModelElement::removeClientDependency"
  }

  /** tests if a given ClientDependency is connected.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 test_head448D24D90367 "ModelElement::containsClientDependency"
  public boolean containsClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 test_head448D24D90367 "ModelElement::containsClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 test_body448D24D90367 "ModelElement::containsClientDependency"
    return clientDependency.contains(clientDependency1);
    // -end- 33FFE57B0395 test_body448D24D90367 "ModelElement::containsClientDependency"
  }

  /** used to enumerate all connected ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 get_all_head448D24D90367 "ModelElement::iteratorClientDependency"
  public java.util.Iterator iteratorClientDependency()
  // -end- 33FFE57B0395 get_all_head448D24D90367 "ModelElement::iteratorClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 get_all_body448D24D90367 "ModelElement::iteratorClientDependency"
    return clientDependency.iterator();
    // -end- 33FFE57B0395 get_all_body448D24D90367 "ModelElement::iteratorClientDependency"
  }

  /** disconnect all ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_all_head448D24D90367 "ModelElement::clearClientDependency"
  public void clearClientDependency()
  // -end- 33FFE57B0395 remove_all_head448D24D90367 "ModelElement::clearClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_all_body448D24D90367 "ModelElement::clearClientDependency"
    if(sizeClientDependency()>0){
      for(java.util.Iterator p = clientDependency.iterator(); p.hasNext();){
        ((Dependency)p.next())._unlinkClient(this);
      }
      clientDependency.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClientDependency"));
    }
    // -end- 33FFE57B0395 remove_all_body448D24D90367 "ModelElement::clearClientDependency"
  }

  /** returns the number of ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 size_head448D24D90367 "ModelElement::sizeClientDependency"
  public int sizeClientDependency()
  // -end- 33FFE57B0395 size_head448D24D90367 "ModelElement::sizeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 size_body448D24D90367 "ModelElement::sizeClientDependency"
    return clientDependency.size();
    // -end- 33FFE57B0395 size_body448D24D90367 "ModelElement::sizeClientDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _link_body448D24D90367 "ModelElement::_linkClientDependency"
  public void _linkClientDependency(Dependency clientDependency1)
  {
    clientDependency.add(clientDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClientDependency"));
    return;
  }
  // -end- 33FFE57B0395 _link_body448D24D90367 "ModelElement::_linkClientDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _unlink_body448D24D90367 "ModelElement::_unlinkClientDependency"
  public void _unlinkClientDependency(Dependency clientDependency1)
  {
    clientDependency.remove(clientDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClientDependency"));
    return;
  }
  // -end- 33FFE57B0395 _unlink_body448D24D90367 "ModelElement::_unlinkClientDependency"

  // -beg- preserve=no 33E901E003D4 code448D24D90367 "taggedValue"
  private java.util.Set taggedValue = new java.util.HashSet();
  // -end- 33E901E003D4 code448D24D90367 "taggedValue"

  /** add a TaggedValue.
   *  
   *  @see #removeTaggedValue
   *  @see #containsTaggedValue
   *  @see #iteratorTaggedValue
   *  @see #clearTaggedValue
   *  @see #sizeTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 add_head448D24D90367 "ModelElement::addTaggedValue"
  public void addTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 add_head448D24D90367 "ModelElement::addTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 add_body448D24D90367 "ModelElement::addTaggedValue"
    taggedValue.add(taggedValue1);
    taggedValue1._linkModelElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTaggedValue"));
    return;
    // -end- 33E901E003D4 add_body448D24D90367 "ModelElement::addTaggedValue"
  }

  /** disconnect a TaggedValue.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 remove_head448D24D90367 "ModelElement::removeTaggedValue"
  public TaggedValue removeTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 remove_head448D24D90367 "ModelElement::removeTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 remove_body448D24D90367 "ModelElement::removeTaggedValue"
    TaggedValue ret=null;
    if(taggedValue1==null || !taggedValue.contains(taggedValue1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = taggedValue1;
    taggedValue.remove(taggedValue1);
    taggedValue1._unlinkModelElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTaggedValue"));
    return ret;
    // -end- 33E901E003D4 remove_body448D24D90367 "ModelElement::removeTaggedValue"
  }

  /** tests if a given TaggedValue is connected.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 test_head448D24D90367 "ModelElement::containsTaggedValue"
  public boolean containsTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 test_head448D24D90367 "ModelElement::containsTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 test_body448D24D90367 "ModelElement::containsTaggedValue"
    return taggedValue.contains(taggedValue1);
    // -end- 33E901E003D4 test_body448D24D90367 "ModelElement::containsTaggedValue"
  }

  /** used to enumerate all connected TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 get_all_head448D24D90367 "ModelElement::iteratorTaggedValue"
  public java.util.Iterator iteratorTaggedValue()
  // -end- 33E901E003D4 get_all_head448D24D90367 "ModelElement::iteratorTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 get_all_body448D24D90367 "ModelElement::iteratorTaggedValue"
    return taggedValue.iterator();
    // -end- 33E901E003D4 get_all_body448D24D90367 "ModelElement::iteratorTaggedValue"
  }

  /** disconnect all TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 remove_all_head448D24D90367 "ModelElement::clearTaggedValue"
  public void clearTaggedValue()
  // -end- 33E901E003D4 remove_all_head448D24D90367 "ModelElement::clearTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 remove_all_body448D24D90367 "ModelElement::clearTaggedValue"
    if(sizeTaggedValue()>0){
      for(java.util.Iterator p = taggedValue.iterator(); p.hasNext();){
        ((TaggedValue)p.next())._unlinkModelElement(this);
      }
      taggedValue.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTaggedValue"));
    }
    // -end- 33E901E003D4 remove_all_body448D24D90367 "ModelElement::clearTaggedValue"
  }

  /** returns the number of TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 size_head448D24D90367 "ModelElement::sizeTaggedValue"
  public int sizeTaggedValue()
  // -end- 33E901E003D4 size_head448D24D90367 "ModelElement::sizeTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 size_body448D24D90367 "ModelElement::sizeTaggedValue"
    return taggedValue.size();
    // -end- 33E901E003D4 size_body448D24D90367 "ModelElement::sizeTaggedValue"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E901E003D4 _link_body448D24D90367 "ModelElement::_linkTaggedValue"
  public void _linkTaggedValue(TaggedValue taggedValue1)
  {
    taggedValue.add(taggedValue1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTaggedValue"));
    return;
  }
  // -end- 33E901E003D4 _link_body448D24D90367 "ModelElement::_linkTaggedValue"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E901E003D4 _unlink_body448D24D90367 "ModelElement::_unlinkTaggedValue"
  public void _unlinkTaggedValue(TaggedValue taggedValue1)
  {
    taggedValue.remove(taggedValue1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTaggedValue"));
    return;
  }
  // -end- 33E901E003D4 _unlink_body448D24D90367 "ModelElement::_unlinkTaggedValue"

  // -beg- preserve=no 33EA67BB010E code448D24D90367 "constraint"
  private java.util.Set constraint = new java.util.HashSet();
  // -end- 33EA67BB010E code448D24D90367 "constraint"

  /** add a Constraint.
   *  
   *  @see #removeConstraint
   *  @see #containsConstraint
   *  @see #iteratorConstraint
   *  @see #clearConstraint
   *  @see #sizeConstraint
   */
  // -beg- preserve=no 33EA67BB010E add_head448D24D90367 "ModelElement::addConstraint"
  public void addConstraint(Constraint constraint1)
  // -end- 33EA67BB010E add_head448D24D90367 "ModelElement::addConstraint"
  {
    // -beg- preserve=no 33EA67BB010E add_body448D24D90367 "ModelElement::addConstraint"
    constraint.add(constraint1);
    constraint1._linkConstrainedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addConstraint"));
    return;
    // -end- 33EA67BB010E add_body448D24D90367 "ModelElement::addConstraint"
  }

  /** disconnect a Constraint.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_head448D24D90367 "ModelElement::removeConstraint"
  public Constraint removeConstraint(Constraint constraint1)
  // -end- 33EA67BB010E remove_head448D24D90367 "ModelElement::removeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_body448D24D90367 "ModelElement::removeConstraint"
    Constraint ret=null;
    if(constraint1==null || !constraint.contains(constraint1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = constraint1;
    constraint.remove(constraint1);
    constraint1._unlinkConstrainedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeConstraint"));
    return ret;
    // -end- 33EA67BB010E remove_body448D24D90367 "ModelElement::removeConstraint"
  }

  /** tests if a given Constraint is connected.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E test_head448D24D90367 "ModelElement::containsConstraint"
  public boolean containsConstraint(Constraint constraint1)
  // -end- 33EA67BB010E test_head448D24D90367 "ModelElement::containsConstraint"
  {
    // -beg- preserve=no 33EA67BB010E test_body448D24D90367 "ModelElement::containsConstraint"
    return constraint.contains(constraint1);
    // -end- 33EA67BB010E test_body448D24D90367 "ModelElement::containsConstraint"
  }

  /** used to enumerate all connected Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E get_all_head448D24D90367 "ModelElement::iteratorConstraint"
  public java.util.Iterator iteratorConstraint()
  // -end- 33EA67BB010E get_all_head448D24D90367 "ModelElement::iteratorConstraint"
  {
    // -beg- preserve=no 33EA67BB010E get_all_body448D24D90367 "ModelElement::iteratorConstraint"
    return constraint.iterator();
    // -end- 33EA67BB010E get_all_body448D24D90367 "ModelElement::iteratorConstraint"
  }

  /** disconnect all Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_all_head448D24D90367 "ModelElement::clearConstraint"
  public void clearConstraint()
  // -end- 33EA67BB010E remove_all_head448D24D90367 "ModelElement::clearConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_all_body448D24D90367 "ModelElement::clearConstraint"
    if(sizeConstraint()>0){
      for(java.util.Iterator p = constraint.iterator(); p.hasNext();){
        ((Constraint)p.next())._unlinkConstrainedElement(this);
      }
      constraint.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearConstraint"));
    }
    // -end- 33EA67BB010E remove_all_body448D24D90367 "ModelElement::clearConstraint"
  }

  /** returns the number of Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E size_head448D24D90367 "ModelElement::sizeConstraint"
  public int sizeConstraint()
  // -end- 33EA67BB010E size_head448D24D90367 "ModelElement::sizeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E size_body448D24D90367 "ModelElement::sizeConstraint"
    return constraint.size();
    // -end- 33EA67BB010E size_body448D24D90367 "ModelElement::sizeConstraint"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _link_body448D24D90367 "ModelElement::_linkConstraint"
  public void _linkConstraint(Constraint constraint1)
  {
    constraint.add(constraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkConstraint"));
    return;
  }
  // -end- 33EA67BB010E _link_body448D24D90367 "ModelElement::_linkConstraint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _unlink_body448D24D90367 "ModelElement::_unlinkConstraint"
  public void _unlinkConstraint(Constraint constraint1)
  {
    constraint.remove(constraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkConstraint"));
    return;
  }
  // -end- 33EA67BB010E _unlink_body448D24D90367 "ModelElement::_unlinkConstraint"

  // -beg- preserve=no 335C0D7A02A8 code448D24D90367 "supplierDependency"
  private java.util.Set supplierDependency = new java.util.HashSet();
  // -end- 335C0D7A02A8 code448D24D90367 "supplierDependency"

  /** add a SupplierDependency.
   *  
   *  @see #removeSupplierDependency
   *  @see #containsSupplierDependency
   *  @see #iteratorSupplierDependency
   *  @see #clearSupplierDependency
   *  @see #sizeSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 add_head448D24D90367 "ModelElement::addSupplierDependency"
  public void addSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 add_head448D24D90367 "ModelElement::addSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 add_body448D24D90367 "ModelElement::addSupplierDependency"
    supplierDependency.add(supplierDependency1);
    supplierDependency1._linkSupplier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSupplierDependency"));
    return;
    // -end- 335C0D7A02A8 add_body448D24D90367 "ModelElement::addSupplierDependency"
  }

  /** disconnect a SupplierDependency.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_head448D24D90367 "ModelElement::removeSupplierDependency"
  public Dependency removeSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 remove_head448D24D90367 "ModelElement::removeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_body448D24D90367 "ModelElement::removeSupplierDependency"
    Dependency ret=null;
    if(supplierDependency1==null || !supplierDependency.contains(supplierDependency1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = supplierDependency1;
    supplierDependency.remove(supplierDependency1);
    supplierDependency1._unlinkSupplier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSupplierDependency"));
    return ret;
    // -end- 335C0D7A02A8 remove_body448D24D90367 "ModelElement::removeSupplierDependency"
  }

  /** tests if a given SupplierDependency is connected.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 test_head448D24D90367 "ModelElement::containsSupplierDependency"
  public boolean containsSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 test_head448D24D90367 "ModelElement::containsSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 test_body448D24D90367 "ModelElement::containsSupplierDependency"
    return supplierDependency.contains(supplierDependency1);
    // -end- 335C0D7A02A8 test_body448D24D90367 "ModelElement::containsSupplierDependency"
  }

  /** used to enumerate all connected SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 get_all_head448D24D90367 "ModelElement::iteratorSupplierDependency"
  public java.util.Iterator iteratorSupplierDependency()
  // -end- 335C0D7A02A8 get_all_head448D24D90367 "ModelElement::iteratorSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 get_all_body448D24D90367 "ModelElement::iteratorSupplierDependency"
    return supplierDependency.iterator();
    // -end- 335C0D7A02A8 get_all_body448D24D90367 "ModelElement::iteratorSupplierDependency"
  }

  /** disconnect all SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_all_head448D24D90367 "ModelElement::clearSupplierDependency"
  public void clearSupplierDependency()
  // -end- 335C0D7A02A8 remove_all_head448D24D90367 "ModelElement::clearSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_all_body448D24D90367 "ModelElement::clearSupplierDependency"
    if(sizeSupplierDependency()>0){
      for(java.util.Iterator p = supplierDependency.iterator(); p.hasNext();){
        ((Dependency)p.next())._unlinkSupplier(this);
      }
      supplierDependency.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSupplierDependency"));
    }
    // -end- 335C0D7A02A8 remove_all_body448D24D90367 "ModelElement::clearSupplierDependency"
  }

  /** returns the number of SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 size_head448D24D90367 "ModelElement::sizeSupplierDependency"
  public int sizeSupplierDependency()
  // -end- 335C0D7A02A8 size_head448D24D90367 "ModelElement::sizeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 size_body448D24D90367 "ModelElement::sizeSupplierDependency"
    return supplierDependency.size();
    // -end- 335C0D7A02A8 size_body448D24D90367 "ModelElement::sizeSupplierDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _link_body448D24D90367 "ModelElement::_linkSupplierDependency"
  public void _linkSupplierDependency(Dependency supplierDependency1)
  {
    supplierDependency.add(supplierDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSupplierDependency"));
    return;
  }
  // -end- 335C0D7A02A8 _link_body448D24D90367 "ModelElement::_linkSupplierDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _unlink_body448D24D90367 "ModelElement::_unlinkSupplierDependency"
  public void _unlinkSupplierDependency(Dependency supplierDependency1)
  {
    supplierDependency.remove(supplierDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSupplierDependency"));
    return;
  }
  // -end- 335C0D7A02A8 _unlink_body448D24D90367 "ModelElement::_unlinkSupplierDependency"

  // -beg- preserve=no 362409A9000A code448D24D90367 "presentation"
  private java.util.Set presentation = new java.util.HashSet();
  // -end- 362409A9000A code448D24D90367 "presentation"

  /** add a Presentation.
   *  
   *  @see #removePresentation
   *  @see #containsPresentation
   *  @see #iteratorPresentation
   *  @see #clearPresentation
   *  @see #sizePresentation
   */
  // -beg- preserve=no 362409A9000A add_head448D24D90367 "ModelElement::addPresentation"
  public void addPresentation(PresentationElement presentation1)
  // -end- 362409A9000A add_head448D24D90367 "ModelElement::addPresentation"
  {
    // -beg- preserve=no 362409A9000A add_body448D24D90367 "ModelElement::addPresentation"
    presentation.add(presentation1);
    presentation1._linkSubject(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentation"));
    return;
    // -end- 362409A9000A add_body448D24D90367 "ModelElement::addPresentation"
  }

  /** disconnect a Presentation.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_head448D24D90367 "ModelElement::removePresentation"
  public PresentationElement removePresentation(PresentationElement presentation1)
  // -end- 362409A9000A remove_head448D24D90367 "ModelElement::removePresentation"
  {
    // -beg- preserve=no 362409A9000A remove_body448D24D90367 "ModelElement::removePresentation"
    PresentationElement ret=null;
    if(presentation1==null || !presentation.contains(presentation1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = presentation1;
    presentation.remove(presentation1);
    presentation1._unlinkSubject(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentation"));
    return ret;
    // -end- 362409A9000A remove_body448D24D90367 "ModelElement::removePresentation"
  }

  /** tests if a given Presentation is connected.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A test_head448D24D90367 "ModelElement::containsPresentation"
  public boolean containsPresentation(PresentationElement presentation1)
  // -end- 362409A9000A test_head448D24D90367 "ModelElement::containsPresentation"
  {
    // -beg- preserve=no 362409A9000A test_body448D24D90367 "ModelElement::containsPresentation"
    return presentation.contains(presentation1);
    // -end- 362409A9000A test_body448D24D90367 "ModelElement::containsPresentation"
  }

  /** used to enumerate all connected Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A get_all_head448D24D90367 "ModelElement::iteratorPresentation"
  public java.util.Iterator iteratorPresentation()
  // -end- 362409A9000A get_all_head448D24D90367 "ModelElement::iteratorPresentation"
  {
    // -beg- preserve=no 362409A9000A get_all_body448D24D90367 "ModelElement::iteratorPresentation"
    return presentation.iterator();
    // -end- 362409A9000A get_all_body448D24D90367 "ModelElement::iteratorPresentation"
  }

  /** disconnect all Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_all_head448D24D90367 "ModelElement::clearPresentation"
  public void clearPresentation()
  // -end- 362409A9000A remove_all_head448D24D90367 "ModelElement::clearPresentation"
  {
    // -beg- preserve=no 362409A9000A remove_all_body448D24D90367 "ModelElement::clearPresentation"
    if(sizePresentation()>0){
      for(java.util.Iterator p = presentation.iterator(); p.hasNext();){
        ((PresentationElement)p.next())._unlinkSubject(this);
      }
      presentation.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentation"));
    }
    // -end- 362409A9000A remove_all_body448D24D90367 "ModelElement::clearPresentation"
  }

  /** returns the number of Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A size_head448D24D90367 "ModelElement::sizePresentation"
  public int sizePresentation()
  // -end- 362409A9000A size_head448D24D90367 "ModelElement::sizePresentation"
  {
    // -beg- preserve=no 362409A9000A size_body448D24D90367 "ModelElement::sizePresentation"
    return presentation.size();
    // -end- 362409A9000A size_body448D24D90367 "ModelElement::sizePresentation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _link_body448D24D90367 "ModelElement::_linkPresentation"
  public void _linkPresentation(PresentationElement presentation1)
  {
    presentation.add(presentation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentation"));
    return;
  }
  // -end- 362409A9000A _link_body448D24D90367 "ModelElement::_linkPresentation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _unlink_body448D24D90367 "ModelElement::_unlinkPresentation"
  public void _unlinkPresentation(PresentationElement presentation1)
  {
    presentation.remove(presentation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentation"));
    return;
  }
  // -end- 362409A9000A _unlink_body448D24D90367 "ModelElement::_unlinkPresentation"

  // -beg- preserve=no 36240CA4024E code448D24D90367 "container"
  private java.util.Set container = new java.util.HashSet();
  // -end- 36240CA4024E code448D24D90367 "container"

  /** add a Container.
   *  
   *  @see #removeContainer
   *  @see #containsContainer
   *  @see #iteratorContainer
   *  @see #clearContainer
   *  @see #sizeContainer
   *  @see #iteratorContainerLink
   *  @see #createContainerLink
   *  @see #findContainerLink
   */
  // -beg- preserve=no 36240CA4024E add_head448D24D90367 "ModelElement::addContainer"
  public void addContainer(Component container1)
  // -end- 36240CA4024E add_head448D24D90367 "ModelElement::addContainer"
  {
    // -beg- preserve=no 36240CA4024E add_body448D24D90367 "ModelElement::addContainer"
    ElementResidence linkobj=createContainerLink();
    linkobj.setContainer(container1);
    linkobj.setResident(this);
    container.add(linkobj);
    container1._linkResident(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainer"));
    return;
    // -end- 36240CA4024E add_body448D24D90367 "ModelElement::addContainer"
  }

  /** add a link to a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E addlink_head448D24D90367 "ModelElement::addContainerLink"
  public void addContainerLink(ElementResidence container1)
  // -end- 36240CA4024E addlink_head448D24D90367 "ModelElement::addContainerLink"
  {
    // -beg- preserve=no 36240CA4024E addlink_body448D24D90367 "ModelElement::addContainerLink"
    container1.setResident(this);
    container.add(container1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainerLink"));
    return;
    // -end- 36240CA4024E addlink_body448D24D90367 "ModelElement::addContainerLink"
  }

  /** disconnect a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E remove_head448D24D90367 "ModelElement::removeContainer"
  public Component removeContainer(Component container1)
  // -end- 36240CA4024E remove_head448D24D90367 "ModelElement::removeContainer"
  {
    // -beg- preserve=no 36240CA4024E remove_body448D24D90367 "ModelElement::removeContainer"
    Component ret=null;
    ElementResidence linkobj=findContainerLink(container1);
    if(container1==null || linkobj==null){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = linkobj.getContainer();
    container.remove(linkobj);
    ret._unlinkResident(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeContainer"));
    return ret;
    // -end- 36240CA4024E remove_body448D24D90367 "ModelElement::removeContainer"
  }

  /** tests if a given Container is connected.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E test_head448D24D90367 "ModelElement::containsContainer"
  public boolean containsContainer(Component container1)
  // -end- 36240CA4024E test_head448D24D90367 "ModelElement::containsContainer"
  {
    // -beg- preserve=no 36240CA4024E test_body448D24D90367 "ModelElement::containsContainer"
    return container.contains(findContainerLink(container1));
    // -end- 36240CA4024E test_body448D24D90367 "ModelElement::containsContainer"
  }

  /** used to enumerate all connected Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E get_all_head448D24D90367 "ModelElement::iteratorContainer"
  public java.util.Iterator iteratorContainer()
  // -end- 36240CA4024E get_all_head448D24D90367 "ModelElement::iteratorContainer"
  {
    // -beg- preserve=no 36240CA4024E get_all_body448D24D90367 "ModelElement::iteratorContainer"
    return new java.util.Iterator(){
      private java.util.Iterator i=container.iterator();
      public boolean hasNext(){
        return i.hasNext();
      }
      public Object next(){
        ElementResidence next=(ElementResidence)i.next();
        return next.getContainer();
      }
      public void remove(){
        i.remove();
      }
    };
    // -end- 36240CA4024E get_all_body448D24D90367 "ModelElement::iteratorContainer"
  }

  /** disconnect all Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E remove_all_head448D24D90367 "ModelElement::clearContainer"
  public void clearContainer()
  // -end- 36240CA4024E remove_all_head448D24D90367 "ModelElement::clearContainer"
  {
    // -beg- preserve=no 36240CA4024E remove_all_body448D24D90367 "ModelElement::clearContainer"
    if(sizeContainer()>0){
      for(java.util.Iterator p = container.iterator(); p.hasNext();){
        ElementResidence linkobj=(ElementResidence)p.next();
        linkobj.getContainer()._unlinkResident(linkobj);
      }
      container.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearContainer"));
    }
    // -end- 36240CA4024E remove_all_body448D24D90367 "ModelElement::clearContainer"
  }

  /** returns the number of Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E size_head448D24D90367 "ModelElement::sizeContainer"
  public int sizeContainer()
  // -end- 36240CA4024E size_head448D24D90367 "ModelElement::sizeContainer"
  {
    // -beg- preserve=no 36240CA4024E size_body448D24D90367 "ModelElement::sizeContainer"
    return container.size();
    // -end- 36240CA4024E size_body448D24D90367 "ModelElement::sizeContainer"
  }

  /** enumerate the link objects of currently connected Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E itlink_head448D24D90367 "ModelElement::getContainerLink"
  public java.util.Iterator iteratorContainerLink()
  // -end- 36240CA4024E itlink_head448D24D90367 "ModelElement::getContainerLink"
  {
    // -beg- preserve=no 36240CA4024E itlink_body448D24D90367 "ModelElement::getContainerLink"
    return container.iterator();
    // -end- 36240CA4024E itlink_body448D24D90367 "ModelElement::getContainerLink"
  }

  /** create a link class for a new link to a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E createlink_head448D24D90367 "ModelElement::createContainerLink"
  public ElementResidence createContainerLink()
  // -end- 36240CA4024E createlink_head448D24D90367 "ModelElement::createContainerLink"
  {
    // -beg- preserve=no 36240CA4024E createlink_body448D24D90367 "ModelElement::createContainerLink"
    // return new ElementResidence();
    throw new java.lang.UnsupportedOperationException();
    // -end- 36240CA4024E createlink_body448D24D90367 "ModelElement::createContainerLink"
  }

  /** find a link object for a given Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E find_head448D24D90367 "ModelElement::findContainerLink"
  public ElementResidence findContainerLink(Component container1)
  // -end- 36240CA4024E find_head448D24D90367 "ModelElement::findContainerLink"
  {
      // -beg- preserve=no 36240CA4024E find_body448D24D90367 "ModelElement::findContainerLink"
      if(container1==null) return null;
      for(java.util.Iterator p = container.iterator(); p.hasNext();){
        ElementResidence linkobj=(ElementResidence)p.next();
        if(linkobj.getContainer()==container1) return linkobj;
      }
      return null;
      // -end- 36240CA4024E find_body448D24D90367 "ModelElement::findContainerLink"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240CA4024E _link_body448D24D90367 "ModelElement::_linkContainer"
    public void _linkContainer(ElementResidence container1)
    {
      container.add(container1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkContainer"));
      return;
    }
    // -end- 36240CA4024E _link_body448D24D90367 "ModelElement::_linkContainer"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240CA4024E _unlink_body448D24D90367 "ModelElement::_unlinkContainer"
    public void _unlinkContainer(ElementResidence container1)
    {
      container.remove(container1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkContainer"));
      return;
    }
    // -end- 36240CA4024E _unlink_body448D24D90367 "ModelElement::_unlinkContainer"

    // -beg- preserve=no 36240F380050 code448D24D90367 "templateParameter"
    private java.util.List templateParameter = new java.util.ArrayList();
    // -end- 36240F380050 code448D24D90367 "templateParameter"

    /** add a TemplateParameter.
     *  
     *  @see #removeTemplateParameter
     *  @see #containsTemplateParameter
     *  @see #iteratorTemplateParameter
     *  @see #clearTemplateParameter
     *  @see #sizeTemplateParameter
     */
    // -beg- preserve=no 36240F380050 add_head448D24D90367 "ModelElement::addTemplateParameter"
    public void addTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 add_head448D24D90367 "ModelElement::addTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 add_body448D24D90367 "ModelElement::addTemplateParameter"
      templateParameter.add(templateParameter1);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
      return;
      // -end- 36240F380050 add_body448D24D90367 "ModelElement::addTemplateParameter"
    }

    // -beg- preserve=no 36240F380050 add2_head448D24D90367 "ModelElement::add2TemplateParameter"
    public void addTemplateParameter(int index,TemplateParameter templateParameter1)
    // -end- 36240F380050 add2_head448D24D90367 "ModelElement::add2TemplateParameter"
    {
      // -beg- preserve=no 36240F380050 add2_body448D24D90367 "ModelElement::add2TemplateParameter"
      templateParameter.add(index,templateParameter1);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
      return;
      // -end- 36240F380050 add2_body448D24D90367 "ModelElement::add2TemplateParameter"
    }

    /** disconnect a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove_head448D24D90367 "ModelElement::removeTemplateParameter"
    public TemplateParameter removeTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 remove_head448D24D90367 "ModelElement::removeTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove_body448D24D90367 "ModelElement::removeTemplateParameter"
      TemplateParameter ret=null;
      if(templateParameter1==null || !templateParameter.contains(templateParameter1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = templateParameter1;
      templateParameter.remove(templateParameter1);
      templateParameter1._unlinkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
      return ret;
      // -end- 36240F380050 remove_body448D24D90367 "ModelElement::removeTemplateParameter"
    }

    /** disconnect a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove2_head448D24D90367 "ModelElement::remove2TemplateParameter"
    public TemplateParameter removeTemplateParameter(int index)
    // -end- 36240F380050 remove2_head448D24D90367 "ModelElement::remove2TemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove2_body448D24D90367 "ModelElement::remove2TemplateParameter"
      TemplateParameter ret=null;
      ret = (TemplateParameter)templateParameter.remove(index);
      ret._unlinkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
      return ret;
      // -end- 36240F380050 remove2_body448D24D90367 "ModelElement::remove2TemplateParameter"
    }

    /** change a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 set_head448D24D90367 "ModelElement::setTemplateParameter"
    public TemplateParameter setTemplateParameter(int index,TemplateParameter templateParameter1)
    // -end- 36240F380050 set_head448D24D90367 "ModelElement::setTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 set_body448D24D90367 "ModelElement::setTemplateParameter"
      TemplateParameter ret=null;
      ret = (TemplateParameter)templateParameter.set(index,templateParameter1);
      ret._unlinkTemplate(this);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setTemplateParameter"));
      return ret;
      // -end- 36240F380050 set_body448D24D90367 "ModelElement::setTemplateParameter"
    }

    /** tests if a given TemplateParameter is connected.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 test_head448D24D90367 "ModelElement::containsTemplateParameter"
    public boolean containsTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 test_head448D24D90367 "ModelElement::containsTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 test_body448D24D90367 "ModelElement::containsTemplateParameter"
      return templateParameter.contains(templateParameter1);
      // -end- 36240F380050 test_body448D24D90367 "ModelElement::containsTemplateParameter"
    }

    /** used to enumerate all connected TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 get_all_head448D24D90367 "ModelElement::iteratorTemplateParameter"
    public java.util.Iterator iteratorTemplateParameter()
    // -end- 36240F380050 get_all_head448D24D90367 "ModelElement::iteratorTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 get_all_body448D24D90367 "ModelElement::iteratorTemplateParameter"
      return templateParameter.iterator();
      // -end- 36240F380050 get_all_body448D24D90367 "ModelElement::iteratorTemplateParameter"
    }

    /** disconnect all TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove_all_head448D24D90367 "ModelElement::clearTemplateParameter"
    public void clearTemplateParameter()
    // -end- 36240F380050 remove_all_head448D24D90367 "ModelElement::clearTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove_all_body448D24D90367 "ModelElement::clearTemplateParameter"
      if(sizeTemplateParameter()>0){
        for(java.util.Iterator p = templateParameter.iterator(); p.hasNext();){
          ((TemplateParameter)p.next())._unlinkTemplate(this);
        }
        templateParameter.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTemplateParameter"));
      }
      // -end- 36240F380050 remove_all_body448D24D90367 "ModelElement::clearTemplateParameter"
    }

    /** returns the number of TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 size_head448D24D90367 "ModelElement::sizeTemplateParameter"
    public int sizeTemplateParameter()
    // -end- 36240F380050 size_head448D24D90367 "ModelElement::sizeTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 size_body448D24D90367 "ModelElement::sizeTemplateParameter"
      return templateParameter.size();
      // -end- 36240F380050 size_body448D24D90367 "ModelElement::sizeTemplateParameter"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240F380050 _link_body448D24D90367 "ModelElement::_linkTemplateParameter"
    public void _linkTemplateParameter(TemplateParameter templateParameter1)
    {
      templateParameter.add(templateParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTemplateParameter"));
      return;
    }
    // -end- 36240F380050 _link_body448D24D90367 "ModelElement::_linkTemplateParameter"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240F380050 _unlink_body448D24D90367 "ModelElement::_unlinkTemplateParameter"
    public void _unlinkTemplateParameter(TemplateParameter templateParameter1)
    {
      templateParameter.remove(templateParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTemplateParameter"));
      return;
    }
    // -end- 36240F380050 _unlink_body448D24D90367 "ModelElement::_unlinkTemplateParameter"

    // -beg- preserve=no 3627D5E9010F code448D24D90367 "targetFlow"
    private java.util.Set targetFlow = new java.util.HashSet();
    // -end- 3627D5E9010F code448D24D90367 "targetFlow"

    /** add a TargetFlow.
     *  
     *  @see #removeTargetFlow
     *  @see #containsTargetFlow
     *  @see #iteratorTargetFlow
     *  @see #clearTargetFlow
     *  @see #sizeTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F add_head448D24D90367 "ModelElement::addTargetFlow"
    public void addTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F add_head448D24D90367 "ModelElement::addTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F add_body448D24D90367 "ModelElement::addTargetFlow"
      targetFlow.add(targetFlow1);
      targetFlow1._linkTarget(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTargetFlow"));
      return;
      // -end- 3627D5E9010F add_body448D24D90367 "ModelElement::addTargetFlow"
    }

    /** disconnect a TargetFlow.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F remove_head448D24D90367 "ModelElement::removeTargetFlow"
    public Flow removeTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F remove_head448D24D90367 "ModelElement::removeTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F remove_body448D24D90367 "ModelElement::removeTargetFlow"
      Flow ret=null;
      if(targetFlow1==null || !targetFlow.contains(targetFlow1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = targetFlow1;
      targetFlow.remove(targetFlow1);
      targetFlow1._unlinkTarget(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTargetFlow"));
      return ret;
      // -end- 3627D5E9010F remove_body448D24D90367 "ModelElement::removeTargetFlow"
    }

    /** tests if a given TargetFlow is connected.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F test_head448D24D90367 "ModelElement::containsTargetFlow"
    public boolean containsTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F test_head448D24D90367 "ModelElement::containsTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F test_body448D24D90367 "ModelElement::containsTargetFlow"
      return targetFlow.contains(targetFlow1);
      // -end- 3627D5E9010F test_body448D24D90367 "ModelElement::containsTargetFlow"
    }

    /** used to enumerate all connected TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F get_all_head448D24D90367 "ModelElement::iteratorTargetFlow"
    public java.util.Iterator iteratorTargetFlow()
    // -end- 3627D5E9010F get_all_head448D24D90367 "ModelElement::iteratorTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F get_all_body448D24D90367 "ModelElement::iteratorTargetFlow"
      return targetFlow.iterator();
      // -end- 3627D5E9010F get_all_body448D24D90367 "ModelElement::iteratorTargetFlow"
    }

    /** disconnect all TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F remove_all_head448D24D90367 "ModelElement::clearTargetFlow"
    public void clearTargetFlow()
    // -end- 3627D5E9010F remove_all_head448D24D90367 "ModelElement::clearTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F remove_all_body448D24D90367 "ModelElement::clearTargetFlow"
      if(sizeTargetFlow()>0){
        for(java.util.Iterator p = targetFlow.iterator(); p.hasNext();){
          ((Flow)p.next())._unlinkTarget(this);
        }
        targetFlow.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTargetFlow"));
      }
      // -end- 3627D5E9010F remove_all_body448D24D90367 "ModelElement::clearTargetFlow"
    }

    /** returns the number of TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F size_head448D24D90367 "ModelElement::sizeTargetFlow"
    public int sizeTargetFlow()
    // -end- 3627D5E9010F size_head448D24D90367 "ModelElement::sizeTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F size_body448D24D90367 "ModelElement::sizeTargetFlow"
      return targetFlow.size();
      // -end- 3627D5E9010F size_body448D24D90367 "ModelElement::sizeTargetFlow"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D5E9010F _link_body448D24D90367 "ModelElement::_linkTargetFlow"
    public void _linkTargetFlow(Flow targetFlow1)
    {
      targetFlow.add(targetFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTargetFlow"));
      return;
    }
    // -end- 3627D5E9010F _link_body448D24D90367 "ModelElement::_linkTargetFlow"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D5E9010F _unlink_body448D24D90367 "ModelElement::_unlinkTargetFlow"
    public void _unlinkTargetFlow(Flow targetFlow1)
    {
      targetFlow.remove(targetFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTargetFlow"));
      return;
    }
    // -end- 3627D5E9010F _unlink_body448D24D90367 "ModelElement::_unlinkTargetFlow"

    // -beg- preserve=no 3627D60F03DF code448D24D90367 "sourceFlow"
    private java.util.Set sourceFlow = new java.util.HashSet();
    // -end- 3627D60F03DF code448D24D90367 "sourceFlow"

    /** add a SourceFlow.
     *  
     *  @see #removeSourceFlow
     *  @see #containsSourceFlow
     *  @see #iteratorSourceFlow
     *  @see #clearSourceFlow
     *  @see #sizeSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF add_head448D24D90367 "ModelElement::addSourceFlow"
    public void addSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF add_head448D24D90367 "ModelElement::addSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF add_body448D24D90367 "ModelElement::addSourceFlow"
      sourceFlow.add(sourceFlow1);
      sourceFlow1._linkSource(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSourceFlow"));
      return;
      // -end- 3627D60F03DF add_body448D24D90367 "ModelElement::addSourceFlow"
    }

    /** disconnect a SourceFlow.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF remove_head448D24D90367 "ModelElement::removeSourceFlow"
    public Flow removeSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF remove_head448D24D90367 "ModelElement::removeSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF remove_body448D24D90367 "ModelElement::removeSourceFlow"
      Flow ret=null;
      if(sourceFlow1==null || !sourceFlow.contains(sourceFlow1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = sourceFlow1;
      sourceFlow.remove(sourceFlow1);
      sourceFlow1._unlinkSource(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSourceFlow"));
      return ret;
      // -end- 3627D60F03DF remove_body448D24D90367 "ModelElement::removeSourceFlow"
    }

    /** tests if a given SourceFlow is connected.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF test_head448D24D90367 "ModelElement::containsSourceFlow"
    public boolean containsSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF test_head448D24D90367 "ModelElement::containsSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF test_body448D24D90367 "ModelElement::containsSourceFlow"
      return sourceFlow.contains(sourceFlow1);
      // -end- 3627D60F03DF test_body448D24D90367 "ModelElement::containsSourceFlow"
    }

    /** used to enumerate all connected SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF get_all_head448D24D90367 "ModelElement::iteratorSourceFlow"
    public java.util.Iterator iteratorSourceFlow()
    // -end- 3627D60F03DF get_all_head448D24D90367 "ModelElement::iteratorSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF get_all_body448D24D90367 "ModelElement::iteratorSourceFlow"
      return sourceFlow.iterator();
      // -end- 3627D60F03DF get_all_body448D24D90367 "ModelElement::iteratorSourceFlow"
    }

    /** disconnect all SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF remove_all_head448D24D90367 "ModelElement::clearSourceFlow"
    public void clearSourceFlow()
    // -end- 3627D60F03DF remove_all_head448D24D90367 "ModelElement::clearSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF remove_all_body448D24D90367 "ModelElement::clearSourceFlow"
      if(sizeSourceFlow()>0){
        for(java.util.Iterator p = sourceFlow.iterator(); p.hasNext();){
          ((Flow)p.next())._unlinkSource(this);
        }
        sourceFlow.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSourceFlow"));
      }
      // -end- 3627D60F03DF remove_all_body448D24D90367 "ModelElement::clearSourceFlow"
    }

    /** returns the number of SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF size_head448D24D90367 "ModelElement::sizeSourceFlow"
    public int sizeSourceFlow()
    // -end- 3627D60F03DF size_head448D24D90367 "ModelElement::sizeSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF size_body448D24D90367 "ModelElement::sizeSourceFlow"
      return sourceFlow.size();
      // -end- 3627D60F03DF size_body448D24D90367 "ModelElement::sizeSourceFlow"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D60F03DF _link_body448D24D90367 "ModelElement::_linkSourceFlow"
    public void _linkSourceFlow(Flow sourceFlow1)
    {
      sourceFlow.add(sourceFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSourceFlow"));
      return;
    }
    // -end- 3627D60F03DF _link_body448D24D90367 "ModelElement::_linkSourceFlow"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D60F03DF _unlink_body448D24D90367 "ModelElement::_unlinkSourceFlow"
    public void _unlinkSourceFlow(Flow sourceFlow1)
    {
      sourceFlow.remove(sourceFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSourceFlow"));
      return;
    }
    // -end- 3627D60F03DF _unlink_body448D24D90367 "ModelElement::_unlinkSourceFlow"

    // -beg- preserve=no 365EEE82035C code448D24D90367 "defaultParameter"
    private java.util.Set defaultParameter = new java.util.HashSet();
    // -end- 365EEE82035C code448D24D90367 "defaultParameter"

    /** add a DefaultParameter.
     *  
     *  @see #removeDefaultParameter
     *  @see #containsDefaultParameter
     *  @see #iteratorDefaultParameter
     *  @see #clearDefaultParameter
     *  @see #sizeDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C add_head448D24D90367 "ModelElement::addDefaultParameter"
    public void addDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C add_head448D24D90367 "ModelElement::addDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C add_body448D24D90367 "ModelElement::addDefaultParameter"
      defaultParameter.add(defaultParameter1);
      defaultParameter1._linkDefaultElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDefaultParameter"));
      return;
      // -end- 365EEE82035C add_body448D24D90367 "ModelElement::addDefaultParameter"
    }

    /** disconnect a DefaultParameter.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C remove_head448D24D90367 "ModelElement::removeDefaultParameter"
    public TemplateParameter removeDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C remove_head448D24D90367 "ModelElement::removeDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C remove_body448D24D90367 "ModelElement::removeDefaultParameter"
      TemplateParameter ret=null;
      if(defaultParameter1==null || !defaultParameter.contains(defaultParameter1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = defaultParameter1;
      defaultParameter.remove(defaultParameter1);
      defaultParameter1._unlinkDefaultElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDefaultParameter"));
      return ret;
      // -end- 365EEE82035C remove_body448D24D90367 "ModelElement::removeDefaultParameter"
    }

    /** tests if a given DefaultParameter is connected.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C test_head448D24D90367 "ModelElement::containsDefaultParameter"
    public boolean containsDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C test_head448D24D90367 "ModelElement::containsDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C test_body448D24D90367 "ModelElement::containsDefaultParameter"
      return defaultParameter.contains(defaultParameter1);
      // -end- 365EEE82035C test_body448D24D90367 "ModelElement::containsDefaultParameter"
    }

    /** used to enumerate all connected DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C get_all_head448D24D90367 "ModelElement::iteratorDefaultParameter"
    public java.util.Iterator iteratorDefaultParameter()
    // -end- 365EEE82035C get_all_head448D24D90367 "ModelElement::iteratorDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C get_all_body448D24D90367 "ModelElement::iteratorDefaultParameter"
      return defaultParameter.iterator();
      // -end- 365EEE82035C get_all_body448D24D90367 "ModelElement::iteratorDefaultParameter"
    }

    /** disconnect all DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C remove_all_head448D24D90367 "ModelElement::clearDefaultParameter"
    public void clearDefaultParameter()
    // -end- 365EEE82035C remove_all_head448D24D90367 "ModelElement::clearDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C remove_all_body448D24D90367 "ModelElement::clearDefaultParameter"
      if(sizeDefaultParameter()>0){
        for(java.util.Iterator p = defaultParameter.iterator(); p.hasNext();){
          ((TemplateParameter)p.next())._unlinkDefaultElement(this);
        }
        defaultParameter.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDefaultParameter"));
      }
      // -end- 365EEE82035C remove_all_body448D24D90367 "ModelElement::clearDefaultParameter"
    }

    /** returns the number of DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C size_head448D24D90367 "ModelElement::sizeDefaultParameter"
    public int sizeDefaultParameter()
    // -end- 365EEE82035C size_head448D24D90367 "ModelElement::sizeDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C size_body448D24D90367 "ModelElement::sizeDefaultParameter"
      return defaultParameter.size();
      // -end- 365EEE82035C size_body448D24D90367 "ModelElement::sizeDefaultParameter"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 365EEE82035C _link_body448D24D90367 "ModelElement::_linkDefaultParameter"
    public void _linkDefaultParameter(TemplateParameter defaultParameter1)
    {
      defaultParameter.add(defaultParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDefaultParameter"));
      return;
    }
    // -end- 365EEE82035C _link_body448D24D90367 "ModelElement::_linkDefaultParameter"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 365EEE82035C _unlink_body448D24D90367 "ModelElement::_unlinkDefaultParameter"
    public void _unlinkDefaultParameter(TemplateParameter defaultParameter1)
    {
      defaultParameter.remove(defaultParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDefaultParameter"));
      return;
    }
    // -end- 365EEE82035C _unlink_body448D24D90367 "ModelElement::_unlinkDefaultParameter"

    // -beg- preserve=no 370E7E3C02DE code448D24D90367 "comment"
    private java.util.Set comment = new java.util.HashSet();
    // -end- 370E7E3C02DE code448D24D90367 "comment"

    /** add a Comment.
     *  
     *  @see #removeComment
     *  @see #containsComment
     *  @see #iteratorComment
     *  @see #clearComment
     *  @see #sizeComment
     */
    // -beg- preserve=no 370E7E3C02DE add_head448D24D90367 "ModelElement::addComment"
    public void addComment(Comment comment1)
    // -end- 370E7E3C02DE add_head448D24D90367 "ModelElement::addComment"
    {
      // -beg- preserve=no 370E7E3C02DE add_body448D24D90367 "ModelElement::addComment"
      comment.add(comment1);
      comment1._linkAnnotatedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addComment"));
      return;
      // -end- 370E7E3C02DE add_body448D24D90367 "ModelElement::addComment"
    }

    /** disconnect a Comment.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE remove_head448D24D90367 "ModelElement::removeComment"
    public Comment removeComment(Comment comment1)
    // -end- 370E7E3C02DE remove_head448D24D90367 "ModelElement::removeComment"
    {
      // -beg- preserve=no 370E7E3C02DE remove_body448D24D90367 "ModelElement::removeComment"
      Comment ret=null;
      if(comment1==null || !comment.contains(comment1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = comment1;
      comment.remove(comment1);
      comment1._unlinkAnnotatedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeComment"));
      return ret;
      // -end- 370E7E3C02DE remove_body448D24D90367 "ModelElement::removeComment"
    }

    /** tests if a given Comment is connected.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE test_head448D24D90367 "ModelElement::containsComment"
    public boolean containsComment(Comment comment1)
    // -end- 370E7E3C02DE test_head448D24D90367 "ModelElement::containsComment"
    {
      // -beg- preserve=no 370E7E3C02DE test_body448D24D90367 "ModelElement::containsComment"
      return comment.contains(comment1);
      // -end- 370E7E3C02DE test_body448D24D90367 "ModelElement::containsComment"
    }

    /** used to enumerate all connected Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE get_all_head448D24D90367 "ModelElement::iteratorComment"
    public java.util.Iterator iteratorComment()
    // -end- 370E7E3C02DE get_all_head448D24D90367 "ModelElement::iteratorComment"
    {
      // -beg- preserve=no 370E7E3C02DE get_all_body448D24D90367 "ModelElement::iteratorComment"
      return comment.iterator();
      // -end- 370E7E3C02DE get_all_body448D24D90367 "ModelElement::iteratorComment"
    }

    /** disconnect all Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE remove_all_head448D24D90367 "ModelElement::clearComment"
    public void clearComment()
    // -end- 370E7E3C02DE remove_all_head448D24D90367 "ModelElement::clearComment"
    {
      // -beg- preserve=no 370E7E3C02DE remove_all_body448D24D90367 "ModelElement::clearComment"
      if(sizeComment()>0){
        for(java.util.Iterator p = comment.iterator(); p.hasNext();){
          ((Comment)p.next())._unlinkAnnotatedElement(this);
        }
        comment.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearComment"));
      }
      // -end- 370E7E3C02DE remove_all_body448D24D90367 "ModelElement::clearComment"
    }

    /** returns the number of Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE size_head448D24D90367 "ModelElement::sizeComment"
    public int sizeComment()
    // -end- 370E7E3C02DE size_head448D24D90367 "ModelElement::sizeComment"
    {
      // -beg- preserve=no 370E7E3C02DE size_body448D24D90367 "ModelElement::sizeComment"
      return comment.size();
      // -end- 370E7E3C02DE size_body448D24D90367 "ModelElement::sizeComment"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 370E7E3C02DE _link_body448D24D90367 "ModelElement::_linkComment"
    public void _linkComment(Comment comment1)
    {
      comment.add(comment1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkComment"));
      return;
    }
    // -end- 370E7E3C02DE _link_body448D24D90367 "ModelElement::_linkComment"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 370E7E3C02DE _unlink_body448D24D90367 "ModelElement::_unlinkComment"
    public void _unlinkComment(Comment comment1)
    {
      comment.remove(comment1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkComment"));
      return;
    }
    // -end- 370E7E3C02DE _unlink_body448D24D90367 "ModelElement::_unlinkComment"

    // -beg- preserve=no 338613A4007B code448D24D90367 "stereotype"
    private java.util.Set stereotype = new java.util.HashSet();
    // -end- 338613A4007B code448D24D90367 "stereotype"

    /** add a Stereotype.
     *  
     *  @see #removeStereotype
     *  @see #containsStereotype
     *  @see #iteratorStereotype
     *  @see #clearStereotype
     *  @see #sizeStereotype
     */
    // -beg- preserve=no 338613A4007B add_head448D24D90367 "ModelElement::addStereotype"
    public void addStereotype(Stereotype stereotype1)
    // -end- 338613A4007B add_head448D24D90367 "ModelElement::addStereotype"
    {
      // -beg- preserve=no 338613A4007B add_body448D24D90367 "ModelElement::addStereotype"
      stereotype.add(stereotype1);
      stereotype1._linkExtendedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addStereotype"));
      return;
      // -end- 338613A4007B add_body448D24D90367 "ModelElement::addStereotype"
    }

    /** disconnect a Stereotype.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B remove_head448D24D90367 "ModelElement::removeStereotype"
    public Stereotype removeStereotype(Stereotype stereotype1)
    // -end- 338613A4007B remove_head448D24D90367 "ModelElement::removeStereotype"
    {
      // -beg- preserve=no 338613A4007B remove_body448D24D90367 "ModelElement::removeStereotype"
      Stereotype ret=null;
      if(stereotype1==null || !stereotype.contains(stereotype1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = stereotype1;
      stereotype.remove(stereotype1);
      stereotype1._unlinkExtendedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeStereotype"));
      return ret;
      // -end- 338613A4007B remove_body448D24D90367 "ModelElement::removeStereotype"
    }

    /** tests if a given Stereotype is connected.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B test_head448D24D90367 "ModelElement::containsStereotype"
    public boolean containsStereotype(Stereotype stereotype1)
    // -end- 338613A4007B test_head448D24D90367 "ModelElement::containsStereotype"
    {
      // -beg- preserve=no 338613A4007B test_body448D24D90367 "ModelElement::containsStereotype"
      return stereotype.contains(stereotype1);
      // -end- 338613A4007B test_body448D24D90367 "ModelElement::containsStereotype"
    }

    /** used to enumerate all connected Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B get_all_head448D24D90367 "ModelElement::iteratorStereotype"
    public java.util.Iterator iteratorStereotype()
    // -end- 338613A4007B get_all_head448D24D90367 "ModelElement::iteratorStereotype"
    {
      // -beg- preserve=no 338613A4007B get_all_body448D24D90367 "ModelElement::iteratorStereotype"
      return stereotype.iterator();
      // -end- 338613A4007B get_all_body448D24D90367 "ModelElement::iteratorStereotype"
    }

    /** disconnect all Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B remove_all_head448D24D90367 "ModelElement::clearStereotype"
    public void clearStereotype()
    // -end- 338613A4007B remove_all_head448D24D90367 "ModelElement::clearStereotype"
    {
      // -beg- preserve=no 338613A4007B remove_all_body448D24D90367 "ModelElement::clearStereotype"
      if(sizeStereotype()>0){
        for(java.util.Iterator p = stereotype.iterator(); p.hasNext();){
          ((Stereotype)p.next())._unlinkExtendedElement(this);
        }
        stereotype.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearStereotype"));
      }
      // -end- 338613A4007B remove_all_body448D24D90367 "ModelElement::clearStereotype"
    }

    /** returns the number of Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B size_head448D24D90367 "ModelElement::sizeStereotype"
    public int sizeStereotype()
    // -end- 338613A4007B size_head448D24D90367 "ModelElement::sizeStereotype"
    {
      // -beg- preserve=no 338613A4007B size_body448D24D90367 "ModelElement::sizeStereotype"
      return stereotype.size();
      // -end- 338613A4007B size_body448D24D90367 "ModelElement::sizeStereotype"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 338613A4007B _link_body448D24D90367 "ModelElement::_linkStereotype"
    public void _linkStereotype(Stereotype stereotype1)
    {
      stereotype.add(stereotype1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkStereotype"));
      return;
    }
    // -end- 338613A4007B _link_body448D24D90367 "ModelElement::_linkStereotype"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 338613A4007B _unlink_body448D24D90367 "ModelElement::_unlinkStereotype"
    public void _unlinkStereotype(Stereotype stereotype1)
    {
      stereotype.remove(stereotype1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkStereotype"));
      return;
    }
    // -end- 338613A4007B _unlink_body448D24D90367 "ModelElement::_unlinkStereotype"

    // -beg- preserve=no 39B9B0F703C8 code448D24D90367 "referenceTag"
    private java.util.Set referenceTag = new java.util.HashSet();
    // -end- 39B9B0F703C8 code448D24D90367 "referenceTag"

    /** add a ReferenceTag.
     *  
     *  @see #removeReferenceTag
     *  @see #containsReferenceTag
     *  @see #iteratorReferenceTag
     *  @see #clearReferenceTag
     *  @see #sizeReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 add_head448D24D90367 "ModelElement::addReferenceTag"
    public void addReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 add_head448D24D90367 "ModelElement::addReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 add_body448D24D90367 "ModelElement::addReferenceTag"
      referenceTag.add(referenceTag1);
      referenceTag1._linkReferenceValue(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addReferenceTag"));
      return;
      // -end- 39B9B0F703C8 add_body448D24D90367 "ModelElement::addReferenceTag"
    }

    /** disconnect a ReferenceTag.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 remove_head448D24D90367 "ModelElement::removeReferenceTag"
    public TaggedValue removeReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 remove_head448D24D90367 "ModelElement::removeReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 remove_body448D24D90367 "ModelElement::removeReferenceTag"
      TaggedValue ret=null;
      if(referenceTag1==null || !referenceTag.contains(referenceTag1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = referenceTag1;
      referenceTag.remove(referenceTag1);
      referenceTag1._unlinkReferenceValue(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeReferenceTag"));
      return ret;
      // -end- 39B9B0F703C8 remove_body448D24D90367 "ModelElement::removeReferenceTag"
    }

    /** tests if a given ReferenceTag is connected.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 test_head448D24D90367 "ModelElement::containsReferenceTag"
    public boolean containsReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 test_head448D24D90367 "ModelElement::containsReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 test_body448D24D90367 "ModelElement::containsReferenceTag"
      return referenceTag.contains(referenceTag1);
      // -end- 39B9B0F703C8 test_body448D24D90367 "ModelElement::containsReferenceTag"
    }

    /** used to enumerate all connected ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 get_all_head448D24D90367 "ModelElement::iteratorReferenceTag"
    public java.util.Iterator iteratorReferenceTag()
    // -end- 39B9B0F703C8 get_all_head448D24D90367 "ModelElement::iteratorReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 get_all_body448D24D90367 "ModelElement::iteratorReferenceTag"
      return referenceTag.iterator();
      // -end- 39B9B0F703C8 get_all_body448D24D90367 "ModelElement::iteratorReferenceTag"
    }

    /** disconnect all ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 remove_all_head448D24D90367 "ModelElement::clearReferenceTag"
    public void clearReferenceTag()
    // -end- 39B9B0F703C8 remove_all_head448D24D90367 "ModelElement::clearReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 remove_all_body448D24D90367 "ModelElement::clearReferenceTag"
      if(sizeReferenceTag()>0){
        for(java.util.Iterator p = referenceTag.iterator(); p.hasNext();){
          ((TaggedValue)p.next())._unlinkReferenceValue(this);
        }
        referenceTag.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearReferenceTag"));
      }
      // -end- 39B9B0F703C8 remove_all_body448D24D90367 "ModelElement::clearReferenceTag"
    }

    /** returns the number of ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 size_head448D24D90367 "ModelElement::sizeReferenceTag"
    public int sizeReferenceTag()
    // -end- 39B9B0F703C8 size_head448D24D90367 "ModelElement::sizeReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 size_body448D24D90367 "ModelElement::sizeReferenceTag"
      return referenceTag.size();
      // -end- 39B9B0F703C8 size_body448D24D90367 "ModelElement::sizeReferenceTag"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 39B9B0F703C8 _link_body448D24D90367 "ModelElement::_linkReferenceTag"
    public void _linkReferenceTag(TaggedValue referenceTag1)
    {
      referenceTag.add(referenceTag1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkReferenceTag"));
      return;
    }
    // -end- 39B9B0F703C8 _link_body448D24D90367 "ModelElement::_linkReferenceTag"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 39B9B0F703C8 _unlink_body448D24D90367 "ModelElement::_unlinkReferenceTag"
    public void _unlinkReferenceTag(TaggedValue referenceTag1)
    {
      referenceTag.remove(referenceTag1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkReferenceTag"));
      return;
    }
    // -end- 39B9B0F703C8 _unlink_body448D24D90367 "ModelElement::_unlinkReferenceTag"

    // -beg- preserve=no 33CD739B0316 code448D24D90367 "importedBy"
    private java.util.Set importedBy = new java.util.HashSet();
    // -end- 33CD739B0316 code448D24D90367 "importedBy"

    /** add a ImportedBy.
     *  
     *  @see #removeImportedBy
     *  @see #containsImportedBy
     *  @see #iteratorImportedBy
     *  @see #clearImportedBy
     *  @see #sizeImportedBy
     *  @see #iteratorImportedByLink
     *  @see #createImportedByLink
     *  @see #findImportedByLink
     */
    // -beg- preserve=no 33CD739B0316 add_head448D24D90367 "ModelElement::addImportedBy"
    public void addImportedBy(Package importedBy1)
    // -end- 33CD739B0316 add_head448D24D90367 "ModelElement::addImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 add_body448D24D90367 "ModelElement::addImportedBy"
      ElementImport linkobj=createImportedByLink();
      linkobj.setImportedBy(importedBy1);
      linkobj.setImportedElement(this);
      importedBy.add(linkobj);
      importedBy1._linkImportedElement(linkobj);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedBy"));
      return;
      // -end- 33CD739B0316 add_body448D24D90367 "ModelElement::addImportedBy"
    }

    /** add a link to a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 addlink_head448D24D90367 "ModelElement::addImportedByLink"
    public void addImportedByLink(ElementImport importedBy1)
    // -end- 33CD739B0316 addlink_head448D24D90367 "ModelElement::addImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 addlink_body448D24D90367 "ModelElement::addImportedByLink"
      importedBy1.setImportedElement(this);
      importedBy.add(importedBy1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedByLink"));
      return;
      // -end- 33CD739B0316 addlink_body448D24D90367 "ModelElement::addImportedByLink"
    }

    /** disconnect a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 remove_head448D24D90367 "ModelElement::removeImportedBy"
    public Package removeImportedBy(Package importedBy1)
    // -end- 33CD739B0316 remove_head448D24D90367 "ModelElement::removeImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 remove_body448D24D90367 "ModelElement::removeImportedBy"
      Package ret=null;
      ElementImport linkobj=findImportedByLink(importedBy1);
      if(importedBy1==null || linkobj==null){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = linkobj.getImportedBy();
      importedBy.remove(linkobj);
      ret._unlinkImportedElement(linkobj);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeImportedBy"));
      return ret;
      // -end- 33CD739B0316 remove_body448D24D90367 "ModelElement::removeImportedBy"
    }

    /** tests if a given ImportedBy is connected.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 test_head448D24D90367 "ModelElement::containsImportedBy"
    public boolean containsImportedBy(Package importedBy1)
    // -end- 33CD739B0316 test_head448D24D90367 "ModelElement::containsImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 test_body448D24D90367 "ModelElement::containsImportedBy"
      return importedBy.contains(findImportedByLink(importedBy1));
      // -end- 33CD739B0316 test_body448D24D90367 "ModelElement::containsImportedBy"
    }

    /** used to enumerate all connected ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 get_all_head448D24D90367 "ModelElement::iteratorImportedBy"
    public java.util.Iterator iteratorImportedBy()
    // -end- 33CD739B0316 get_all_head448D24D90367 "ModelElement::iteratorImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 get_all_body448D24D90367 "ModelElement::iteratorImportedBy"
      return new java.util.Iterator(){
        private java.util.Iterator i=importedBy.iterator();
        public boolean hasNext(){
          return i.hasNext();
        }
        public Object next(){
          ElementImport next=(ElementImport)i.next();
          return next.getImportedBy();
        }
        public void remove(){
          i.remove();
        }
      };
      // -end- 33CD739B0316 get_all_body448D24D90367 "ModelElement::iteratorImportedBy"
    }

    /** disconnect all ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 remove_all_head448D24D90367 "ModelElement::clearImportedBy"
    public void clearImportedBy()
    // -end- 33CD739B0316 remove_all_head448D24D90367 "ModelElement::clearImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 remove_all_body448D24D90367 "ModelElement::clearImportedBy"
      if(sizeImportedBy()>0){
        for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          linkobj.getImportedBy()._unlinkImportedElement(linkobj);
        }
        importedBy.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearImportedBy"));
      }
      // -end- 33CD739B0316 remove_all_body448D24D90367 "ModelElement::clearImportedBy"
    }

    /** returns the number of ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 size_head448D24D90367 "ModelElement::sizeImportedBy"
    public int sizeImportedBy()
    // -end- 33CD739B0316 size_head448D24D90367 "ModelElement::sizeImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 size_body448D24D90367 "ModelElement::sizeImportedBy"
      return importedBy.size();
      // -end- 33CD739B0316 size_body448D24D90367 "ModelElement::sizeImportedBy"
    }

    /** enumerate the link objects of currently connected ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 itlink_head448D24D90367 "ModelElement::getImportedByLink"
    public java.util.Iterator iteratorImportedByLink()
    // -end- 33CD739B0316 itlink_head448D24D90367 "ModelElement::getImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 itlink_body448D24D90367 "ModelElement::getImportedByLink"
      return importedBy.iterator();
      // -end- 33CD739B0316 itlink_body448D24D90367 "ModelElement::getImportedByLink"
    }

    /** create a link class for a new link to a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 createlink_head448D24D90367 "ModelElement::createImportedByLink"
    public ElementImport createImportedByLink()
    // -end- 33CD739B0316 createlink_head448D24D90367 "ModelElement::createImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 createlink_body448D24D90367 "ModelElement::createImportedByLink"
      // return new ElementImport();
      throw new java.lang.UnsupportedOperationException();
      // -end- 33CD739B0316 createlink_body448D24D90367 "ModelElement::createImportedByLink"
    }

    /** find a link object for a given ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 find_head448D24D90367 "ModelElement::findImportedByLink"
    public ElementImport findImportedByLink(Package importedBy1)
    // -end- 33CD739B0316 find_head448D24D90367 "ModelElement::findImportedByLink"
    {
        // -beg- preserve=no 33CD739B0316 find_body448D24D90367 "ModelElement::findImportedByLink"
        if(importedBy1==null) return null;
        for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          if(linkobj.getImportedBy()==importedBy1) return linkobj;
        }
        return null;
        // -end- 33CD739B0316 find_body448D24D90367 "ModelElement::findImportedByLink"
      }

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B0316 _link_body448D24D90367 "ModelElement::_linkImportedBy"
      public void _linkImportedBy(ElementImport importedBy1)
      {
        importedBy.add(importedBy1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkImportedBy"));
        return;
      }
      // -end- 33CD739B0316 _link_body448D24D90367 "ModelElement::_linkImportedBy"

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B0316 _unlink_body448D24D90367 "ModelElement::_unlinkImportedBy"
      public void _unlinkImportedBy(ElementImport importedBy1)
      {
        importedBy.remove(importedBy1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkImportedBy"));
        return;
      }
      // -end- 33CD739B0316 _unlink_body448D24D90367 "ModelElement::_unlinkImportedBy"

      // -beg- preserve=no 335D4BA70064 var448D24D90367 "name"
      private NlsString name = null;
      // -end- 335D4BA70064 var448D24D90367 "name"

      /** get current value of name
       *  @see #setName
       */
      // -beg- preserve=no 335D4BA70064 get_head448D24D90367 "name"
      public  NlsString getName()
      // -end- 335D4BA70064 get_head448D24D90367 "name"
      {
        // -beg- preserve=no 335D4BA70064 get_body448D24D90367 "name"
        return name;
        // -end- 335D4BA70064 get_body448D24D90367 "name"
      }

      /** set current value of name
       *  @see #getName
       */
      // -beg- preserve=no 335D4BA70064 set_head448D24D90367 "name"
      public  void setName(NlsString value1)
      // -end- 335D4BA70064 set_head448D24D90367 "name"
      {
        // -beg- preserve=no 335D4BA70064 set_body448D24D90367 "name"
        if(name!=value1 && (name==null || !name.equals(value1))){
          name = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setName"));
        }
        // -end- 335D4BA70064 set_body448D24D90367 "name"
      }

      // -beg- preserve=no 3C1DF92B0234 var448D24D90367 "documentation"
      private NlsString documentation = null;
      // -end- 3C1DF92B0234 var448D24D90367 "documentation"

      /** get current value of documentation
       *  @see #setDocumentation
       */
      // -beg- preserve=no 3C1DF92B0234 get_head448D24D90367 "documentation"
      public  NlsString getDocumentation()
      // -end- 3C1DF92B0234 get_head448D24D90367 "documentation"
      {
        // -beg- preserve=no 3C1DF92B0234 get_body448D24D90367 "documentation"
        return documentation;
        // -end- 3C1DF92B0234 get_body448D24D90367 "documentation"
      }

      /** set current value of documentation
       *  @see #getDocumentation
       */
      // -beg- preserve=no 3C1DF92B0234 set_head448D24D90367 "documentation"
      public  void setDocumentation(NlsString value1)
      // -end- 3C1DF92B0234 set_head448D24D90367 "documentation"
      {
        // -beg- preserve=no 3C1DF92B0234 set_body448D24D90367 "documentation"
        if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
          documentation = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
        }
        // -end- 3C1DF92B0234 set_body448D24D90367 "documentation"
      }

      // declare/define something only in the code
      // please fill in/modify the following section
      // -beg- preserve=no 448D24D90367 detail_end "UmlStereotype"

      // -end- 448D24D90367 detail_end "UmlStereotype"

    }

=======
/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-06-13 14:36:24 $
 */
public class UmlStereotype implements Stereotype {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448D24D90367 detail_begin "UmlStereotype"

	// -end- 448D24D90367 detail_begin "UmlStereotype"

	private static final long serialVersionUID = -5259732147353166340L;

	// -beg- preserve=no 448D3645021F head448D24D90367 "unlinkAll"
	public void unlinkAll()
	// -end- 448D3645021F head448D24D90367 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D3645021F throws448D24D90367 "unlinkAll"

	// -end- 448D3645021F throws448D24D90367 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D3645021F body448D24D90367 "unlinkAll"

		clearDefinedTag();
		clearExtendedElement();
		clearStereotypeConstraint();
		setIcon(null);
		clearGeneralization();
		clearSpecialization();
		clearBehavior();
		clearPartition();
		clearCollaboration();
		clearClassifierRole();
		clearCollaborationInstanceSet();
		detachNamespace();
		clearClientDependency();
		clearTaggedValue();
		clearConstraint();
		clearSupplierDependency();
		clearPresentation();
		clearContainer();
		clearTemplateParameter();
		clearTargetFlow();
		clearSourceFlow();
		clearDefaultParameter();
		clearComment();
		// Role TemplateArgument: TemplateArgument object(s) may point to this
		// Role ParameterDefinition: TemplateParameter object(s) may point to
		// this
		clearStereotype();
		clearReferenceTag();
		clearImportedBy();
		// Role EditorTreeElement: EditorTreeElement object(s) may point to this
		setName(null);
		setMetaAttrb(null);
		setMetaMapping(null);
		setDocumentation(null);
		
		setMetaName(null);
		setMetaMsg(null);

		// -end- 448D3645021F body448D24D90367 "unlinkAll"
	}

	// -beg- preserve=no 448D364A028B head448D24D90367 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 448D364A028B head448D24D90367 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D364A028B throws448D24D90367 "enumerateChildren"

	// -end- 448D364A028B throws448D24D90367 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D364A028B body448D24D90367 "enumerateChildren"
		Iterator<?> it = null;
		it = iteratorDefinedTag();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorStereotypeConstraint();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getIcon());
		it = iteratorBehavior();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTaggedValue();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTemplateParameter();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getName());
		visitor.visit(getMetaAttrb());
		visitor.visit(getDocumentation());

		// -end- 448D364A028B body448D24D90367 "enumerateChildren"
	}

	// -beg- preserve=no 3386129C0040 code448D24D90367 "definedTag"
	private Set<TagDefinition> definedTag = new HashSet<TagDefinition>();
	// -end- 3386129C0040 code448D24D90367 "definedTag"

	/**
	 * add a DefinedTag.
	 *
	 * @see #removeDefinedTag
	 * @see #containsDefinedTag
	 * @see #iteratorDefinedTag
	 * @see #clearDefinedTag
	 * @see #sizeDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 add_head448D24D90367
	// "Stereotype::addDefinedTag"
	public void addDefinedTag(TagDefinition definedTag1)
	// -end- 3386129C0040 add_head448D24D90367 "Stereotype::addDefinedTag"
	{
		// -beg- preserve=no 3386129C0040 add_body448D24D90367
		// "Stereotype::addDefinedTag"
		definedTag.add(definedTag1);
		definedTag1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addDefinedTag"));
		return;
		// -end- 3386129C0040 add_body448D24D90367 "Stereotype::addDefinedTag"
	}

	/**
	 * disconnect a DefinedTag.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 remove_head448D24D90367
	// "Stereotype::removeDefinedTag"
	public TagDefinition removeDefinedTag(TagDefinition definedTag1)
	// -end- 3386129C0040 remove_head448D24D90367 "Stereotype::removeDefinedTag"
	{
		// -beg- preserve=no 3386129C0040 remove_body448D24D90367
		// "Stereotype::removeDefinedTag"
		TagDefinition ret = null;
		if (definedTag1 == null || !definedTag.contains(definedTag1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = definedTag1;
		definedTag.remove(definedTag1);
		definedTag1._unlinkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeDefinedTag"));
		return ret;
		// -end- 3386129C0040 remove_body448D24D90367
		// "Stereotype::removeDefinedTag"
	}

	/**
	 * tests if a given DefinedTag is connected.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 test_head448D24D90367
	// "Stereotype::containsDefinedTag"
	public boolean containsDefinedTag(TagDefinition definedTag1)
	// -end- 3386129C0040 test_head448D24D90367 "Stereotype::containsDefinedTag"
	{
		// -beg- preserve=no 3386129C0040 test_body448D24D90367
		// "Stereotype::containsDefinedTag"
		return definedTag.contains(definedTag1);
		// -end- 3386129C0040 test_body448D24D90367
		// "Stereotype::containsDefinedTag"
	}

	/**
	 * used to enumerate all connected DefinedTags.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 get_all_head448D24D90367
	// "Stereotype::iteratorDefinedTag"
	public Iterator<?> iteratorDefinedTag()
	// -end- 3386129C0040 get_all_head448D24D90367
	// "Stereotype::iteratorDefinedTag"
	{
		// -beg- preserve=no 3386129C0040 get_all_body448D24D90367
		// "Stereotype::iteratorDefinedTag"
		return definedTag.iterator();
		// -end- 3386129C0040 get_all_body448D24D90367
		// "Stereotype::iteratorDefinedTag"
	}

	/**
	 * disconnect all DefinedTags.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 remove_all_head448D24D90367
	// "Stereotype::clearDefinedTag"
	public void clearDefinedTag()
	// -end- 3386129C0040 remove_all_head448D24D90367
	// "Stereotype::clearDefinedTag"
	{
		// -beg- preserve=no 3386129C0040 remove_all_body448D24D90367
		// "Stereotype::clearDefinedTag"
		if (sizeDefinedTag() > 0) {
			for (Iterator<?> p = definedTag.iterator(); p.hasNext();) {
				((TagDefinition) p.next())._unlinkOwner(this);
			}
			definedTag.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearDefinedTag"));
		}
		// -end- 3386129C0040 remove_all_body448D24D90367
		// "Stereotype::clearDefinedTag"
	}

	/**
	 * returns the number of DefinedTags.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 size_head448D24D90367
	// "Stereotype::sizeDefinedTag"
	public int sizeDefinedTag()
	// -end- 3386129C0040 size_head448D24D90367 "Stereotype::sizeDefinedTag"
	{
		// -beg- preserve=no 3386129C0040 size_body448D24D90367
		// "Stereotype::sizeDefinedTag"
		return definedTag.size();
		// -end- 3386129C0040 size_body448D24D90367 "Stereotype::sizeDefinedTag"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3386129C0040 _link_body448D24D90367
	// "Stereotype::_linkDefinedTag"
	public void _linkDefinedTag(TagDefinition definedTag1) {
		definedTag.add(definedTag1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkDefinedTag"));
		return;
	}
	// -end- 3386129C0040 _link_body448D24D90367 "Stereotype::_linkDefinedTag"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3386129C0040 _unlink_body448D24D90367
	// "Stereotype::_unlinkDefinedTag"
	public void _unlinkDefinedTag(TagDefinition definedTag1) {
		definedTag.remove(definedTag1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkDefinedTag"));
		return;
	}
	// -end- 3386129C0040 _unlink_body448D24D90367
	// "Stereotype::_unlinkDefinedTag"

	// -beg- preserve=no 338613A4007A code448D24D90367 "extendedElement"
	private Set<ModelElement> extendedElement = new HashSet<ModelElement>();
	// -end- 338613A4007A code448D24D90367 "extendedElement"

	/**
	 * add a ExtendedElement.
	 *
	 * @see #removeExtendedElement
	 * @see #containsExtendedElement
	 * @see #iteratorExtendedElement
	 * @see #clearExtendedElement
	 * @see #sizeExtendedElement
	 */
	// -beg- preserve=no 338613A4007A add_head448D24D90367
	// "Stereotype::addExtendedElement"
	public void addExtendedElement(ModelElement extendedElement1)
	// -end- 338613A4007A add_head448D24D90367 "Stereotype::addExtendedElement"
	{
		// -beg- preserve=no 338613A4007A add_body448D24D90367
		// "Stereotype::addExtendedElement"
		extendedElement.add(extendedElement1);
		extendedElement1._linkStereotype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addExtendedElement"));
		return;
		// -end- 338613A4007A add_body448D24D90367
		// "Stereotype::addExtendedElement"
	}

	/**
	 * disconnect a ExtendedElement.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A remove_head448D24D90367
	// "Stereotype::removeExtendedElement"
	public ModelElement removeExtendedElement(ModelElement extendedElement1)
	// -end- 338613A4007A remove_head448D24D90367
	// "Stereotype::removeExtendedElement"
	{
		// -beg- preserve=no 338613A4007A remove_body448D24D90367
		// "Stereotype::removeExtendedElement"
		ModelElement ret = null;
		if (extendedElement1 == null || !extendedElement.contains(extendedElement1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = extendedElement1;
		extendedElement.remove(extendedElement1);
		extendedElement1._unlinkStereotype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeExtendedElement"));
		return ret;
		// -end- 338613A4007A remove_body448D24D90367
		// "Stereotype::removeExtendedElement"
	}

	/**
	 * tests if a given ExtendedElement is connected.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A test_head448D24D90367
	// "Stereotype::containsExtendedElement"
	public boolean containsExtendedElement(ModelElement extendedElement1)
	// -end- 338613A4007A test_head448D24D90367
	// "Stereotype::containsExtendedElement"
	{
		// -beg- preserve=no 338613A4007A test_body448D24D90367
		// "Stereotype::containsExtendedElement"
		return extendedElement.contains(extendedElement1);
		// -end- 338613A4007A test_body448D24D90367
		// "Stereotype::containsExtendedElement"
	}

	/**
	 * used to enumerate all connected ExtendedElements.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A get_all_head448D24D90367
	// "Stereotype::iteratorExtendedElement"
	public Iterator<ModelElement> iteratorExtendedElement()
	// -end- 338613A4007A get_all_head448D24D90367
	// "Stereotype::iteratorExtendedElement"
	{
		// -beg- preserve=no 338613A4007A get_all_body448D24D90367
		// "Stereotype::iteratorExtendedElement"
		return extendedElement.iterator();
		// -end- 338613A4007A get_all_body448D24D90367
		// "Stereotype::iteratorExtendedElement"
	}

	/**
	 * disconnect all ExtendedElements.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A remove_all_head448D24D90367
	// "Stereotype::clearExtendedElement"
	public void clearExtendedElement()
	// -end- 338613A4007A remove_all_head448D24D90367
	// "Stereotype::clearExtendedElement"
	{
		// -beg- preserve=no 338613A4007A remove_all_body448D24D90367
		// "Stereotype::clearExtendedElement"
		if (sizeExtendedElement() > 0) {
			for (Iterator<ModelElement> p = extendedElement.iterator(); p.hasNext();) {
				((ModelElement) p.next())._unlinkStereotype(this);
			}
			extendedElement.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearExtendedElement"));
		}
		// -end- 338613A4007A remove_all_body448D24D90367
		// "Stereotype::clearExtendedElement"
	}

	/**
	 * returns the number of ExtendedElements.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A size_head448D24D90367
	// "Stereotype::sizeExtendedElement"
	public int sizeExtendedElement()
	// -end- 338613A4007A size_head448D24D90367
	// "Stereotype::sizeExtendedElement"
	{
		// -beg- preserve=no 338613A4007A size_body448D24D90367
		// "Stereotype::sizeExtendedElement"
		return extendedElement.size();
		// -end- 338613A4007A size_body448D24D90367
		// "Stereotype::sizeExtendedElement"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 338613A4007A _link_body448D24D90367
	// "Stereotype::_linkExtendedElement"
	public void _linkExtendedElement(ModelElement extendedElement1) {
		extendedElement.add(extendedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkExtendedElement"));
		return;
	}
	// -end- 338613A4007A _link_body448D24D90367
	// "Stereotype::_linkExtendedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 338613A4007A _unlink_body448D24D90367
	// "Stereotype::_unlinkExtendedElement"
	public void _unlinkExtendedElement(ModelElement extendedElement1) {
		extendedElement.remove(extendedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkExtendedElement"));
		return;
	}
	// -end- 338613A4007A _unlink_body448D24D90367
	// "Stereotype::_unlinkExtendedElement"

	// -beg- preserve=no 364B66900258 code448D24D90367 "stereotypeConstraint"
	private Set<Constraint> stereotypeConstraint = new HashSet<Constraint>();
	// -end- 364B66900258 code448D24D90367 "stereotypeConstraint"

	/**
	 * add a StereotypeConstraint.
	 *
	 * @see #removeStereotypeConstraint
	 * @see #containsStereotypeConstraint
	 * @see #iteratorStereotypeConstraint
	 * @see #clearStereotypeConstraint
	 * @see #sizeStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 add_head448D24D90367
	// "Stereotype::addStereotypeConstraint"
	public void addStereotypeConstraint(Constraint stereotypeConstraint1)
	// -end- 364B66900258 add_head448D24D90367
	// "Stereotype::addStereotypeConstraint"
	{
		// -beg- preserve=no 364B66900258 add_body448D24D90367
		// "Stereotype::addStereotypeConstraint"
		stereotypeConstraint.add(stereotypeConstraint1);
		stereotypeConstraint1._linkConstrainedStereotype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addStereotypeConstraint"));
		return;
		// -end- 364B66900258 add_body448D24D90367
		// "Stereotype::addStereotypeConstraint"
	}

	/**
	 * disconnect a StereotypeConstraint.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 remove_head448D24D90367
	// "Stereotype::removeStereotypeConstraint"
	public Constraint removeStereotypeConstraint(Constraint stereotypeConstraint1)
	// -end- 364B66900258 remove_head448D24D90367
	// "Stereotype::removeStereotypeConstraint"
	{
		// -beg- preserve=no 364B66900258 remove_body448D24D90367
		// "Stereotype::removeStereotypeConstraint"
		Constraint ret = null;
		if (stereotypeConstraint1 == null || !stereotypeConstraint.contains(stereotypeConstraint1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = stereotypeConstraint1;
		stereotypeConstraint.remove(stereotypeConstraint1);
		stereotypeConstraint1._unlinkConstrainedStereotype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeStereotypeConstraint"));
		return ret;
		// -end- 364B66900258 remove_body448D24D90367
		// "Stereotype::removeStereotypeConstraint"
	}

	/**
	 * tests if a given StereotypeConstraint is connected.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 test_head448D24D90367
	// "Stereotype::containsStereotypeConstraint"
	public boolean containsStereotypeConstraint(Constraint stereotypeConstraint1)
	// -end- 364B66900258 test_head448D24D90367
	// "Stereotype::containsStereotypeConstraint"
	{
		// -beg- preserve=no 364B66900258 test_body448D24D90367
		// "Stereotype::containsStereotypeConstraint"
		return stereotypeConstraint.contains(stereotypeConstraint1);
		// -end- 364B66900258 test_body448D24D90367
		// "Stereotype::containsStereotypeConstraint"
	}

	/**
	 * used to enumerate all connected StereotypeConstraints.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 get_all_head448D24D90367
	// "Stereotype::iteratorStereotypeConstraint"
	public Iterator<?> iteratorStereotypeConstraint()
	// -end- 364B66900258 get_all_head448D24D90367
	// "Stereotype::iteratorStereotypeConstraint"
	{
		// -beg- preserve=no 364B66900258 get_all_body448D24D90367
		// "Stereotype::iteratorStereotypeConstraint"
		return stereotypeConstraint.iterator();
		// -end- 364B66900258 get_all_body448D24D90367
		// "Stereotype::iteratorStereotypeConstraint"
	}

	/**
	 * disconnect all StereotypeConstraints.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 remove_all_head448D24D90367
	// "Stereotype::clearStereotypeConstraint"
	public void clearStereotypeConstraint()
	// -end- 364B66900258 remove_all_head448D24D90367
	// "Stereotype::clearStereotypeConstraint"
	{
		// -beg- preserve=no 364B66900258 remove_all_body448D24D90367
		// "Stereotype::clearStereotypeConstraint"
		if (sizeStereotypeConstraint() > 0) {
			for (Iterator<?> p = stereotypeConstraint.iterator(); p.hasNext();) {
				((Constraint) p.next())._unlinkConstrainedStereotype(this);
			}
			stereotypeConstraint.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
					new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearStereotypeConstraint"));
		}
		// -end- 364B66900258 remove_all_body448D24D90367
		// "Stereotype::clearStereotypeConstraint"
	}

	/**
	 * returns the number of StereotypeConstraints.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 size_head448D24D90367
	// "Stereotype::sizeStereotypeConstraint"
	public int sizeStereotypeConstraint()
	// -end- 364B66900258 size_head448D24D90367
	// "Stereotype::sizeStereotypeConstraint"
	{
		// -beg- preserve=no 364B66900258 size_body448D24D90367
		// "Stereotype::sizeStereotypeConstraint"
		return stereotypeConstraint.size();
		// -end- 364B66900258 size_body448D24D90367
		// "Stereotype::sizeStereotypeConstraint"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900258 _link_body448D24D90367
	// "Stereotype::_linkStereotypeConstraint"
	public void _linkStereotypeConstraint(Constraint stereotypeConstraint1) {
		stereotypeConstraint.add(stereotypeConstraint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkStereotypeConstraint"));
		return;
	}
	// -end- 364B66900258 _link_body448D24D90367
	// "Stereotype::_linkStereotypeConstraint"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900258 _unlink_body448D24D90367
	// "Stereotype::_unlinkStereotypeConstraint"
	public void _unlinkStereotypeConstraint(Constraint stereotypeConstraint1) {
		stereotypeConstraint.remove(stereotypeConstraint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkStereotypeConstraint"));
		return;
	}
	// -end- 364B66900258 _unlink_body448D24D90367
	// "Stereotype::_unlinkStereotypeConstraint"

	// -beg- preserve=no 338614B602CD var448D24D90367 "icon"
	private Geometry icon = null;
	// -end- 338614B602CD var448D24D90367 "icon"

	/**
	 * get current value of icon The geometrical description for an icon to be
	 * used to present animage of a model element branded by the stereotype.
	 * 
	 * @see #setIcon
	 */
	// -beg- preserve=no 338614B602CD get_head448D24D90367 "icon"
	public Geometry getIcon()
	// -end- 338614B602CD get_head448D24D90367 "icon"
	{
		// -beg- preserve=no 338614B602CD get_body448D24D90367 "icon"
		return icon;
		// -end- 338614B602CD get_body448D24D90367 "icon"
	}

	/**
	 * set current value of icon
	 * 
	 * @see #getIcon
	 */
	// -beg- preserve=no 338614B602CD set_head448D24D90367 "icon"
	public void setIcon(Geometry value1)
	// -end- 338614B602CD set_head448D24D90367 "icon"
	{
		// -beg- preserve=no 338614B602CD set_body448D24D90367 "icon"
		if (icon != value1 && (icon == null || !icon.equals(value1))) {
			icon = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setIcon"));
		}
		// -end- 338614B602CD set_body448D24D90367 "icon"
	}

	// -beg- preserve=no 340389C403C0 var448D24D90367 "baseClass"
	private String baseClass;
	// -end- 340389C403C0 var448D24D90367 "baseClass"

	/**
	 * get current value of baseClass Specifies the names of one or more UML
	 * modeling elements towhich the stereotype applies, such as Class,
	 * Association,Refinement, Constraint, etc.
	 * 
	 * @see #setBaseClass
	 */
	// -beg- preserve=no 340389C403C0 get_head448D24D90367 "baseClass"
	public String getBaseClass()
	// -end- 340389C403C0 get_head448D24D90367 "baseClass"
	{
		// -beg- preserve=no 340389C403C0 get_body448D24D90367 "baseClass"
		return baseClass;
		// -end- 340389C403C0 get_body448D24D90367 "baseClass"
	}

	/**
	 * set current value of baseClass
	 * 
	 * @see #getBaseClass
	 */
	// -beg- preserve=no 340389C403C0 set_head448D24D90367 "baseClass"
	public void setBaseClass(String value1)
	// -end- 340389C403C0 set_head448D24D90367 "baseClass"
	{
		// -beg- preserve=no 340389C403C0 set_body448D24D90367 "baseClass"
		if (baseClass != value1) {
			baseClass = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setBaseClass"));
		}
		// -end- 340389C403C0 set_body448D24D90367 "baseClass"
	}

	// -beg- preserve=no 335C14A5019A code448D24D90367 "generalization"
	private Set<Generalization> generalization = new HashSet<Generalization>();
	// -end- 335C14A5019A code448D24D90367 "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head448D24D90367
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head448D24D90367
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body448D24D90367
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addGeneralization"));
		return;
		// -end- 335C14A5019A add_body448D24D90367
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head448D24D90367
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head448D24D90367
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body448D24D90367
		// "GeneralizableElement::removeGeneralization"
		Generalization ret = null;
		if (generalization1 == null || !generalization.contains(generalization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = generalization1;
		generalization.remove(generalization1);
		generalization1._unlinkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeGeneralization"));
		return ret;
		// -end- 335C14A5019A remove_body448D24D90367
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head448D24D90367
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head448D24D90367
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body448D24D90367
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body448D24D90367
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head448D24D90367
	// "GeneralizableElement::iteratorGeneralization"
	public Iterator<Generalization> iteratorGeneralization()
	// -end- 335C14A5019A get_all_head448D24D90367
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body448D24D90367
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body448D24D90367
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head448D24D90367
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head448D24D90367
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body448D24D90367
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (Iterator<Generalization> p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearGeneralization"));
		}
		// -end- 335C14A5019A remove_all_body448D24D90367
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head448D24D90367
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head448D24D90367
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body448D24D90367
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body448D24D90367
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body448D24D90367
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _link_body448D24D90367
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body448D24D90367
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _unlink_body448D24D90367
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code448D24D90367 "specialization"
	private Set<Generalization> specialization = new HashSet<Generalization>();
	// -end- 335C146B01D6 code448D24D90367 "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head448D24D90367
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head448D24D90367
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body448D24D90367
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecialization"));
		return;
		// -end- 335C146B01D6 add_body448D24D90367
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head448D24D90367
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head448D24D90367
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body448D24D90367
		// "GeneralizableElement::removeSpecialization"
		Generalization ret = null;
		if (specialization1 == null || !specialization.contains(specialization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specialization1;
		specialization.remove(specialization1);
		specialization1._unlinkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSpecialization"));
		return ret;
		// -end- 335C146B01D6 remove_body448D24D90367
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head448D24D90367
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head448D24D90367
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body448D24D90367
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body448D24D90367
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head448D24D90367
	// "GeneralizableElement::iteratorSpecialization"
	public Iterator<Generalization> iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head448D24D90367
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body448D24D90367
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body448D24D90367
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head448D24D90367
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head448D24D90367
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body448D24D90367
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (Iterator<Generalization> p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecialization"));
		}
		// -end- 335C146B01D6 remove_all_body448D24D90367
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head448D24D90367
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head448D24D90367
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body448D24D90367
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body448D24D90367
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body448D24D90367
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _link_body448D24D90367
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body448D24D90367
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _unlink_body448D24D90367
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var448D24D90367 "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var448D24D90367 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head448D24D90367 "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head448D24D90367 "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body448D24D90367 "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body448D24D90367 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head448D24D90367 "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head448D24D90367 "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body448D24D90367 "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 327A877801CC set_body448D24D90367 "isRoot"
	}

	// -beg- preserve=no 327A877E006E var448D24D90367 "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var448D24D90367 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head448D24D90367 "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head448D24D90367 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body448D24D90367 "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body448D24D90367 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head448D24D90367 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head448D24D90367 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body448D24D90367 "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 327A877E006E set_body448D24D90367 "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var448D24D90367 "isAbstract"
	private boolean isAbstract;
	// -end- 327A878400D2 var448D24D90367 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head448D24D90367 "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head448D24D90367 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body448D24D90367 "isAbstract"
		return isAbstract;
		// -end- 327A878400D2 get_body448D24D90367 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head448D24D90367 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head448D24D90367 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body448D24D90367 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 327A878400D2 set_body448D24D90367 "isAbstract"
	}

	// -beg- preserve=no 3CE2221702C6 head448D24D90367 "getDefLangName"
	public String getDefLangName()
	// -end- 3CE2221702C6 head448D24D90367 "getDefLangName"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE2221702C6 throws448D24D90367 "getDefLangName"

	// -end- 3CE2221702C6 throws448D24D90367 "getDefLangName"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3CE2221702C6 body448D24D90367 "getDefLangName"
		return null;
		// -end- 3CE2221702C6 body448D24D90367 "getDefLangName"
	}

	// -beg- preserve=no 3CE222250149 head448D24D90367 "setDefLangName"
	public void setDefLangName(String name)
	// -end- 3CE222250149 head448D24D90367 "setDefLangName"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE222250149 throws448D24D90367 "setDefLangName"

	// -end- 3CE222250149 throws448D24D90367 "setDefLangName"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3CE222250149 body448D24D90367 "setDefLangName"
		return;
		// -end- 3CE222250149 body448D24D90367 "setDefLangName"
	}

	// -beg- preserve=no 33CF8BD500F1 code448D24D90367 "behavior"
	private Set<StateMachine> behavior = new HashSet<StateMachine>();
	// -end- 33CF8BD500F1 code448D24D90367 "behavior"

	/**
	 * add a Behavior.
	 *
	 * @see #removeBehavior
	 * @see #containsBehavior
	 * @see #iteratorBehavior
	 * @see #clearBehavior
	 * @see #sizeBehavior
	 */
	// -beg- preserve=no 33CF8BD500F1 add_head448D24D90367
	// "ModelElement::addBehavior"
	public void addBehavior(StateMachine behavior1)
	// -end- 33CF8BD500F1 add_head448D24D90367 "ModelElement::addBehavior"
	{
		// -beg- preserve=no 33CF8BD500F1 add_body448D24D90367
		// "ModelElement::addBehavior"
		behavior.add(behavior1);
		behavior1._linkContext(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addBehavior"));
		return;
		// -end- 33CF8BD500F1 add_body448D24D90367 "ModelElement::addBehavior"
	}

	/**
	 * disconnect a Behavior.
	 * 
	 * @see #addBehavior
	 */
	// -beg- preserve=no 33CF8BD500F1 remove_head448D24D90367
	// "ModelElement::removeBehavior"
	public StateMachine removeBehavior(StateMachine behavior1)
	// -end- 33CF8BD500F1 remove_head448D24D90367 "ModelElement::removeBehavior"
	{
		// -beg- preserve=no 33CF8BD500F1 remove_body448D24D90367
		// "ModelElement::removeBehavior"
		StateMachine ret = null;
		if (behavior1 == null || !behavior.contains(behavior1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = behavior1;
		behavior.remove(behavior1);
		behavior1._unlinkContext(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeBehavior"));
		return ret;
		// -end- 33CF8BD500F1 remove_body448D24D90367
		// "ModelElement::removeBehavior"
	}

	/**
	 * tests if a given Behavior is connected.
	 * 
	 * @see #addBehavior
	 */
	// -beg- preserve=no 33CF8BD500F1 test_head448D24D90367
	// "ModelElement::containsBehavior"
	public boolean containsBehavior(StateMachine behavior1)
	// -end- 33CF8BD500F1 test_head448D24D90367 "ModelElement::containsBehavior"
	{
		// -beg- preserve=no 33CF8BD500F1 test_body448D24D90367
		// "ModelElement::containsBehavior"
		return behavior.contains(behavior1);
		// -end- 33CF8BD500F1 test_body448D24D90367
		// "ModelElement::containsBehavior"
	}

	/**
	 * used to enumerate all connected Behaviors.
	 * 
	 * @see #addBehavior
	 */
	// -beg- preserve=no 33CF8BD500F1 get_all_head448D24D90367
	// "ModelElement::iteratorBehavior"
	public Iterator<?> iteratorBehavior()
	// -end- 33CF8BD500F1 get_all_head448D24D90367
	// "ModelElement::iteratorBehavior"
	{
		// -beg- preserve=no 33CF8BD500F1 get_all_body448D24D90367
		// "ModelElement::iteratorBehavior"
		return behavior.iterator();
		// -end- 33CF8BD500F1 get_all_body448D24D90367
		// "ModelElement::iteratorBehavior"
	}

	/**
	 * disconnect all Behaviors.
	 * 
	 * @see #addBehavior
	 */
	// -beg- preserve=no 33CF8BD500F1 remove_all_head448D24D90367
	// "ModelElement::clearBehavior"
	public void clearBehavior()
	// -end- 33CF8BD500F1 remove_all_head448D24D90367
	// "ModelElement::clearBehavior"
	{
		// -beg- preserve=no 33CF8BD500F1 remove_all_body448D24D90367
		// "ModelElement::clearBehavior"
		if (sizeBehavior() > 0) {
			for (Iterator<?> p = behavior.iterator(); p.hasNext();) {
				((StateMachine) p.next())._unlinkContext(this);
			}
			behavior.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearBehavior"));
		}
		// -end- 33CF8BD500F1 remove_all_body448D24D90367
		// "ModelElement::clearBehavior"
	}

	/**
	 * returns the number of Behaviors.
	 * 
	 * @see #addBehavior
	 */
	// -beg- preserve=no 33CF8BD500F1 size_head448D24D90367
	// "ModelElement::sizeBehavior"
	public int sizeBehavior()
	// -end- 33CF8BD500F1 size_head448D24D90367 "ModelElement::sizeBehavior"
	{
		// -beg- preserve=no 33CF8BD500F1 size_body448D24D90367
		// "ModelElement::sizeBehavior"
		return behavior.size();
		// -end- 33CF8BD500F1 size_body448D24D90367 "ModelElement::sizeBehavior"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF8BD500F1 _link_body448D24D90367
	// "ModelElement::_linkBehavior"
	public void _linkBehavior(StateMachine behavior1) {
		behavior.add(behavior1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkBehavior"));
		return;
	}
	// -end- 33CF8BD500F1 _link_body448D24D90367 "ModelElement::_linkBehavior"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF8BD500F1 _unlink_body448D24D90367
	// "ModelElement::_unlinkBehavior"
	public void _unlinkBehavior(StateMachine behavior1) {
		behavior.remove(behavior1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkBehavior"));
		return;
	}
	// -end- 33CF8BD500F1 _unlink_body448D24D90367
	// "ModelElement::_unlinkBehavior"

	// -beg- preserve=no 33CF9A030140 code448D24D90367 "partition"
	private Set<Partition> partition = new HashSet<Partition>();
	// -end- 33CF9A030140 code448D24D90367 "partition"

	/**
	 * add a Partition.
	 *
	 * @see #removePartition
	 * @see #containsPartition
	 * @see #iteratorPartition
	 * @see #clearPartition
	 * @see #sizePartition
	 */
	// -beg- preserve=no 33CF9A030140 add_head448D24D90367
	// "ModelElement::addPartition"
	public void addPartition(Partition partition1)
	// -end- 33CF9A030140 add_head448D24D90367 "ModelElement::addPartition"
	{
		// -beg- preserve=no 33CF9A030140 add_body448D24D90367
		// "ModelElement::addPartition"
		partition.add(partition1);
		partition1._linkContents(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addPartition"));
		return;
		// -end- 33CF9A030140 add_body448D24D90367 "ModelElement::addPartition"
	}

	/**
	 * disconnect a Partition.
	 * 
	 * @see #addPartition
	 */
	// -beg- preserve=no 33CF9A030140 remove_head448D24D90367
	// "ModelElement::removePartition"
	public Partition removePartition(Partition partition1)
	// -end- 33CF9A030140 remove_head448D24D90367
	// "ModelElement::removePartition"
	{
		// -beg- preserve=no 33CF9A030140 remove_body448D24D90367
		// "ModelElement::removePartition"
		Partition ret = null;
		if (partition1 == null || !partition.contains(partition1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = partition1;
		partition.remove(partition1);
		partition1._unlinkContents(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removePartition"));
		return ret;
		// -end- 33CF9A030140 remove_body448D24D90367
		// "ModelElement::removePartition"
	}

	/**
	 * tests if a given Partition is connected.
	 * 
	 * @see #addPartition
	 */
	// -beg- preserve=no 33CF9A030140 test_head448D24D90367
	// "ModelElement::containsPartition"
	public boolean containsPartition(Partition partition1)
	// -end- 33CF9A030140 test_head448D24D90367
	// "ModelElement::containsPartition"
	{
		// -beg- preserve=no 33CF9A030140 test_body448D24D90367
		// "ModelElement::containsPartition"
		return partition.contains(partition1);
		// -end- 33CF9A030140 test_body448D24D90367
		// "ModelElement::containsPartition"
	}

	/**
	 * used to enumerate all connected Partitions.
	 * 
	 * @see #addPartition
	 */
	// -beg- preserve=no 33CF9A030140 get_all_head448D24D90367
	// "ModelElement::iteratorPartition"
	public Iterator<Partition> iteratorPartition()
	// -end- 33CF9A030140 get_all_head448D24D90367
	// "ModelElement::iteratorPartition"
	{
		// -beg- preserve=no 33CF9A030140 get_all_body448D24D90367
		// "ModelElement::iteratorPartition"
		return partition.iterator();
		// -end- 33CF9A030140 get_all_body448D24D90367
		// "ModelElement::iteratorPartition"
	}

	/**
	 * disconnect all Partitions.
	 * 
	 * @see #addPartition
	 */
	// -beg- preserve=no 33CF9A030140 remove_all_head448D24D90367
	// "ModelElement::clearPartition"
	public void clearPartition()
	// -end- 33CF9A030140 remove_all_head448D24D90367
	// "ModelElement::clearPartition"
	{
		// -beg- preserve=no 33CF9A030140 remove_all_body448D24D90367
		// "ModelElement::clearPartition"
		if (sizePartition() > 0) {
			for (Iterator<Partition> p = partition.iterator(); p.hasNext();) {
				((Partition) p.next())._unlinkContents(this);
			}
			partition.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearPartition"));
		}
		// -end- 33CF9A030140 remove_all_body448D24D90367
		// "ModelElement::clearPartition"
	}

	/**
	 * returns the number of Partitions.
	 * 
	 * @see #addPartition
	 */
	// -beg- preserve=no 33CF9A030140 size_head448D24D90367
	// "ModelElement::sizePartition"
	public int sizePartition()
	// -end- 33CF9A030140 size_head448D24D90367 "ModelElement::sizePartition"
	{
		// -beg- preserve=no 33CF9A030140 size_body448D24D90367
		// "ModelElement::sizePartition"
		return partition.size();
		// -end- 33CF9A030140 size_body448D24D90367
		// "ModelElement::sizePartition"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9A030140 _link_body448D24D90367
	// "ModelElement::_linkPartition"
	public void _linkPartition(Partition partition1) {
		partition.add(partition1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkPartition"));
		return;
	}
	// -end- 33CF9A030140 _link_body448D24D90367 "ModelElement::_linkPartition"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9A030140 _unlink_body448D24D90367
	// "ModelElement::_unlinkPartition"
	public void _unlinkPartition(Partition partition1) {
		partition.remove(partition1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkPartition"));
		return;
	}
	// -end- 33CF9A030140 _unlink_body448D24D90367
	// "ModelElement::_unlinkPartition"

	// -beg- preserve=no 33D1394E029F code448D24D90367 "collaboration"
	private Set<Collaboration> collaboration = new HashSet<Collaboration>();
	// -end- 33D1394E029F code448D24D90367 "collaboration"

	/**
	 * add a Collaboration.
	 *
	 * @see #removeCollaboration
	 * @see #containsCollaboration
	 * @see #iteratorCollaboration
	 * @see #clearCollaboration
	 * @see #sizeCollaboration
	 */
	// -beg- preserve=no 33D1394E029F add_head448D24D90367
	// "ModelElement::addCollaboration"
	public void addCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F add_head448D24D90367 "ModelElement::addCollaboration"
	{
		// -beg- preserve=no 33D1394E029F add_body448D24D90367
		// "ModelElement::addCollaboration"
		collaboration.add(collaboration1);
		collaboration1._linkConstrainingElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addCollaboration"));
		return;
		// -end- 33D1394E029F add_body448D24D90367
		// "ModelElement::addCollaboration"
	}

	/**
	 * disconnect a Collaboration.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_head448D24D90367
	// "ModelElement::removeCollaboration"
	public Collaboration removeCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F remove_head448D24D90367
	// "ModelElement::removeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_body448D24D90367
		// "ModelElement::removeCollaboration"
		Collaboration ret = null;
		if (collaboration1 == null || !collaboration.contains(collaboration1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = collaboration1;
		collaboration.remove(collaboration1);
		collaboration1._unlinkConstrainingElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeCollaboration"));
		return ret;
		// -end- 33D1394E029F remove_body448D24D90367
		// "ModelElement::removeCollaboration"
	}

	/**
	 * tests if a given Collaboration is connected.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F test_head448D24D90367
	// "ModelElement::containsCollaboration"
	public boolean containsCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F test_head448D24D90367
	// "ModelElement::containsCollaboration"
	{
		// -beg- preserve=no 33D1394E029F test_body448D24D90367
		// "ModelElement::containsCollaboration"
		return collaboration.contains(collaboration1);
		// -end- 33D1394E029F test_body448D24D90367
		// "ModelElement::containsCollaboration"
	}

	/**
	 * used to enumerate all connected Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F get_all_head448D24D90367
	// "ModelElement::iteratorCollaboration"
	public Iterator<Collaboration> iteratorCollaboration()
	// -end- 33D1394E029F get_all_head448D24D90367
	// "ModelElement::iteratorCollaboration"
	{
		// -beg- preserve=no 33D1394E029F get_all_body448D24D90367
		// "ModelElement::iteratorCollaboration"
		return collaboration.iterator();
		// -end- 33D1394E029F get_all_body448D24D90367
		// "ModelElement::iteratorCollaboration"
	}

	/**
	 * disconnect all Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_all_head448D24D90367
	// "ModelElement::clearCollaboration"
	public void clearCollaboration()
	// -end- 33D1394E029F remove_all_head448D24D90367
	// "ModelElement::clearCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_all_body448D24D90367
		// "ModelElement::clearCollaboration"
		if (sizeCollaboration() > 0) {
			for (Iterator<Collaboration> p = collaboration.iterator(); p.hasNext();) {
				((Collaboration) p.next())._unlinkConstrainingElement(this);
			}
			collaboration.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearCollaboration"));
		}
		// -end- 33D1394E029F remove_all_body448D24D90367
		// "ModelElement::clearCollaboration"
	}

	/**
	 * returns the number of Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F size_head448D24D90367
	// "ModelElement::sizeCollaboration"
	public int sizeCollaboration()
	// -end- 33D1394E029F size_head448D24D90367
	// "ModelElement::sizeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F size_body448D24D90367
		// "ModelElement::sizeCollaboration"
		return collaboration.size();
		// -end- 33D1394E029F size_body448D24D90367
		// "ModelElement::sizeCollaboration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _link_body448D24D90367
	// "ModelElement::_linkCollaboration"
	public void _linkCollaboration(Collaboration collaboration1) {
		collaboration.add(collaboration1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCollaboration"));
		return;
	}
	// -end- 33D1394E029F _link_body448D24D90367
	// "ModelElement::_linkCollaboration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _unlink_body448D24D90367
	// "ModelElement::_unlinkCollaboration"
	public void _unlinkCollaboration(Collaboration collaboration1) {
		collaboration.remove(collaboration1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCollaboration"));
		return;
	}
	// -end- 33D1394E029F _unlink_body448D24D90367
	// "ModelElement::_unlinkCollaboration"

	// -beg- preserve=no 36008FB700E7 code448D24D90367 "classifierRole"
	private Set<ClassifierRole> classifierRole = new HashSet<ClassifierRole>();
	// -end- 36008FB700E7 code448D24D90367 "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head448D24D90367
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head448D24D90367 "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body448D24D90367
		// "ModelElement::addClassifierRole"
		classifierRole.add(classifierRole1);
		classifierRole1._linkAvailableContents(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addClassifierRole"));
		return;
		// -end- 36008FB700E7 add_body448D24D90367
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head448D24D90367
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head448D24D90367
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body448D24D90367
		// "ModelElement::removeClassifierRole"
		ClassifierRole ret = null;
		if (classifierRole1 == null || !classifierRole.contains(classifierRole1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = classifierRole1;
		classifierRole.remove(classifierRole1);
		classifierRole1._unlinkAvailableContents(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeClassifierRole"));
		return ret;
		// -end- 36008FB700E7 remove_body448D24D90367
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head448D24D90367
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head448D24D90367
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body448D24D90367
		// "ModelElement::containsClassifierRole"
		return classifierRole.contains(classifierRole1);
		// -end- 36008FB700E7 test_body448D24D90367
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head448D24D90367
	// "ModelElement::iteratorClassifierRole"
	public Iterator<ClassifierRole> iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head448D24D90367
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body448D24D90367
		// "ModelElement::iteratorClassifierRole"
		return classifierRole.iterator();
		// -end- 36008FB700E7 get_all_body448D24D90367
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head448D24D90367
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head448D24D90367
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body448D24D90367
		// "ModelElement::clearClassifierRole"
		if (sizeClassifierRole() > 0) {
			for (Iterator<ClassifierRole> p = classifierRole.iterator(); p.hasNext();) {
				((ClassifierRole) p.next())._unlinkAvailableContents(this);
			}
			classifierRole.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearClassifierRole"));
		}
		// -end- 36008FB700E7 remove_all_body448D24D90367
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head448D24D90367
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head448D24D90367
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body448D24D90367
		// "ModelElement::sizeClassifierRole"
		return classifierRole.size();
		// -end- 36008FB700E7 size_body448D24D90367
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body448D24D90367
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		classifierRole.add(classifierRole1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkClassifierRole"));
		return;
	}
	// -end- 36008FB700E7 _link_body448D24D90367
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body448D24D90367
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		classifierRole.remove(classifierRole1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkClassifierRole"));
		return;
	}
	// -end- 36008FB700E7 _unlink_body448D24D90367
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 39E9065C0186 code448D24D90367
	// "collaborationInstanceSet"
	private Set<CollaborationInstanceSet> collaborationInstanceSet = new HashSet<CollaborationInstanceSet>();
	// -end- 39E9065C0186 code448D24D90367 "collaborationInstanceSet"

	/**
	 * add a CollaborationInstanceSet.
	 *
	 * @see #removeCollaborationInstanceSet
	 * @see #containsCollaborationInstanceSet
	 * @see #iteratorCollaborationInstanceSet
	 * @see #clearCollaborationInstanceSet
	 * @see #sizeCollaborationInstanceSet
	 */
	// -beg- preserve=no 39E9065C0186 add_head448D24D90367
	// "ModelElement::addCollaborationInstanceSet"
	public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
	// -end- 39E9065C0186 add_head448D24D90367
	// "ModelElement::addCollaborationInstanceSet"
	{
		// -beg- preserve=no 39E9065C0186 add_body448D24D90367
		// "ModelElement::addCollaborationInstanceSet"
		collaborationInstanceSet.add(collaborationInstanceSet1);
		collaborationInstanceSet1._linkConstrainingElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addCollaborationInstanceSet"));
		return;
		// -end- 39E9065C0186 add_body448D24D90367
		// "ModelElement::addCollaborationInstanceSet"
	}

	/**
	 * disconnect a CollaborationInstanceSet.
	 * 
	 * @see #addCollaborationInstanceSet
	 */
	// -beg- preserve=no 39E9065C0186 remove_head448D24D90367
	// "ModelElement::removeCollaborationInstanceSet"
	public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
	// -end- 39E9065C0186 remove_head448D24D90367
	// "ModelElement::removeCollaborationInstanceSet"
	{
		// -beg- preserve=no 39E9065C0186 remove_body448D24D90367
		// "ModelElement::removeCollaborationInstanceSet"
		CollaborationInstanceSet ret = null;
		if (collaborationInstanceSet1 == null || !collaborationInstanceSet.contains(collaborationInstanceSet1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = collaborationInstanceSet1;
		collaborationInstanceSet.remove(collaborationInstanceSet1);
		collaborationInstanceSet1._unlinkConstrainingElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
				new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeCollaborationInstanceSet"));
		return ret;
		// -end- 39E9065C0186 remove_body448D24D90367
		// "ModelElement::removeCollaborationInstanceSet"
	}

	/**
	 * tests if a given CollaborationInstanceSet is connected.
	 * 
	 * @see #addCollaborationInstanceSet
	 */
	// -beg- preserve=no 39E9065C0186 test_head448D24D90367
	// "ModelElement::containsCollaborationInstanceSet"
	public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
	// -end- 39E9065C0186 test_head448D24D90367
	// "ModelElement::containsCollaborationInstanceSet"
	{
		// -beg- preserve=no 39E9065C0186 test_body448D24D90367
		// "ModelElement::containsCollaborationInstanceSet"
		return collaborationInstanceSet.contains(collaborationInstanceSet1);
		// -end- 39E9065C0186 test_body448D24D90367
		// "ModelElement::containsCollaborationInstanceSet"
	}

	/**
	 * used to enumerate all connected CollaborationInstanceSets.
	 * 
	 * @see #addCollaborationInstanceSet
	 */
	// -beg- preserve=no 39E9065C0186 get_all_head448D24D90367
	// "ModelElement::iteratorCollaborationInstanceSet"
	public Iterator<CollaborationInstanceSet> iteratorCollaborationInstanceSet()
	// -end- 39E9065C0186 get_all_head448D24D90367
	// "ModelElement::iteratorCollaborationInstanceSet"
	{
		// -beg- preserve=no 39E9065C0186 get_all_body448D24D90367
		// "ModelElement::iteratorCollaborationInstanceSet"
		return collaborationInstanceSet.iterator();
		// -end- 39E9065C0186 get_all_body448D24D90367
		// "ModelElement::iteratorCollaborationInstanceSet"
	}

	/**
	 * disconnect all CollaborationInstanceSets.
	 * 
	 * @see #addCollaborationInstanceSet
	 */
	// -beg- preserve=no 39E9065C0186 remove_all_head448D24D90367
	// "ModelElement::clearCollaborationInstanceSet"
	public void clearCollaborationInstanceSet()
	// -end- 39E9065C0186 remove_all_head448D24D90367
	// "ModelElement::clearCollaborationInstanceSet"
	{
		// -beg- preserve=no 39E9065C0186 remove_all_body448D24D90367
		// "ModelElement::clearCollaborationInstanceSet"
		if (sizeCollaborationInstanceSet() > 0) {
			for (Iterator<CollaborationInstanceSet> p = collaborationInstanceSet.iterator(); p.hasNext();) {
				((CollaborationInstanceSet) p.next())._unlinkConstrainingElement(this);
			}
			collaborationInstanceSet.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
					new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearCollaborationInstanceSet"));
		}
		// -end- 39E9065C0186 remove_all_body448D24D90367
		// "ModelElement::clearCollaborationInstanceSet"
	}

	/**
	 * returns the number of CollaborationInstanceSets.
	 * 
	 * @see #addCollaborationInstanceSet
	 */
	// -beg- preserve=no 39E9065C0186 size_head448D24D90367
	// "ModelElement::sizeCollaborationInstanceSet"
	public int sizeCollaborationInstanceSet()
	// -end- 39E9065C0186 size_head448D24D90367
	// "ModelElement::sizeCollaborationInstanceSet"
	{
		// -beg- preserve=no 39E9065C0186 size_body448D24D90367
		// "ModelElement::sizeCollaborationInstanceSet"
		return collaborationInstanceSet.size();
		// -end- 39E9065C0186 size_body448D24D90367
		// "ModelElement::sizeCollaborationInstanceSet"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 39E9065C0186 _link_body448D24D90367
	// "ModelElement::_linkCollaborationInstanceSet"
	public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1) {
		collaborationInstanceSet.add(collaborationInstanceSet1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
				new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCollaborationInstanceSet"));
		return;
	}
	// -end- 39E9065C0186 _link_body448D24D90367
	// "ModelElement::_linkCollaborationInstanceSet"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 39E9065C0186 _unlink_body448D24D90367
	// "ModelElement::_unlinkCollaborationInstanceSet"
	public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1) {
		collaborationInstanceSet.remove(collaborationInstanceSet1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
				new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCollaborationInstanceSet"));
		return;
	}
	// -end- 39E9065C0186 _unlink_body448D24D90367
	// "ModelElement::_unlinkCollaborationInstanceSet"

	// -beg- preserve=no 33598CAA030E code448D24D90367 "namespace"
	private ElementOwnership namespace;
	// -end- 33598CAA030E code448D24D90367 "namespace"

	/**
	 * attaches a Namespace. Designates the Namespace that contains the
	 * ModelElement.
	 * 
	 * @see #detachNamespace
	 * @see #getNamespace
	 * @see #containsNamespace
	 * @see #getNamespaceLink
	 * @see #createNamespaceLink
	 */
	// -beg- preserve=no 33598CAA030E attach_head448D24D90367
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head448D24D90367
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body448D24D90367
		// "ModelElement::attachNamespace"
		if (namespace != null) {
			throw new java.lang.IllegalStateException("already a namespace attached");
		}
		if (namespace1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as namespace");
		}
		namespace = createNamespaceLink();
		namespace.setNamespace(namespace1);
		namespace.setOwnedElement(this);
		namespace1._linkOwnedElement(namespace);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachNamespace"));
		return;
		// -end- 33598CAA030E attach_body448D24D90367
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head448D24D90367
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head448D24D90367
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body448D24D90367
		// "ModelElement::attachNamespaceLink"
		if (namespace != null) {
			throw new java.lang.IllegalStateException("already a namespace attached");
		}
		namespace = namespace1;
		namespace.setOwnedElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachNamespaceLink"));
		return;
		// -end- 33598CAA030E attachlink_body448D24D90367
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head448D24D90367
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head448D24D90367
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body448D24D90367
		// "ModelElement::detachNamespace"
		Namespace ret = null;
		if (namespace != null) {
			ret = namespace.getNamespace();
			ret._unlinkOwnedElement(namespace);
			namespace = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachNamespace"));
		return ret;
		// -end- 33598CAA030E detach_body448D24D90367
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head448D24D90367
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head448D24D90367 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body448D24D90367
		// "ModelElement::getNamespace"
		if (namespace == null) {
			throw new java.lang.IllegalStateException("no namespace attached");
		}
		return namespace.getNamespace();
		// -end- 33598CAA030E get_body448D24D90367 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head448D24D90367
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head448D24D90367
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body448D24D90367
		// "ModelElement::getNamespaceLink"
		if (namespace == null) {
			throw new java.lang.IllegalStateException("no namespace attached");
		}
		return namespace;
		// -end- 33598CAA030E getlink_body448D24D90367
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head448D24D90367
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head448D24D90367
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body448D24D90367
		// "ModelElement::createNamespaceLink"
		return new ElementOwnership();
		// -end- 33598CAA030E createlink_body448D24D90367
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head448D24D90367
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head448D24D90367
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body448D24D90367
		// "ModelElement::containsNamespace"
		return namespace != null;
		// -end- 33598CAA030E test_body448D24D90367
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body448D24D90367
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		namespace = namespace1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkNamespace"));
		return;
	}
	// -end- 33598CAA030E _link_body448D24D90367 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body448D24D90367
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		namespace = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkNamespace"));
		return;
	}
	// -end- 33598CAA030E _unlink_body448D24D90367
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 33FFE57B0395 code448D24D90367 "clientDependency"
	private Set<Dependency> clientDependency = new HashSet<Dependency>();
	// -end- 33FFE57B0395 code448D24D90367 "clientDependency"

	/**
	 * add a ClientDependency.
	 *
	 * @see #removeClientDependency
	 * @see #containsClientDependency
	 * @see #iteratorClientDependency
	 * @see #clearClientDependency
	 * @see #sizeClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 add_head448D24D90367
	// "ModelElement::addClientDependency"
	public void addClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 add_head448D24D90367
	// "ModelElement::addClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 add_body448D24D90367
		// "ModelElement::addClientDependency"
		clientDependency.add(clientDependency1);
		clientDependency1._linkClient(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addClientDependency"));
		return;
		// -end- 33FFE57B0395 add_body448D24D90367
		// "ModelElement::addClientDependency"
	}

	/**
	 * disconnect a ClientDependency.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 remove_head448D24D90367
	// "ModelElement::removeClientDependency"
	public Dependency removeClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 remove_head448D24D90367
	// "ModelElement::removeClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 remove_body448D24D90367
		// "ModelElement::removeClientDependency"
		Dependency ret = null;
		if (clientDependency1 == null || !clientDependency.contains(clientDependency1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = clientDependency1;
		clientDependency.remove(clientDependency1);
		clientDependency1._unlinkClient(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeClientDependency"));
		return ret;
		// -end- 33FFE57B0395 remove_body448D24D90367
		// "ModelElement::removeClientDependency"
	}

	/**
	 * tests if a given ClientDependency is connected.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 test_head448D24D90367
	// "ModelElement::containsClientDependency"
	public boolean containsClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 test_head448D24D90367
	// "ModelElement::containsClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 test_body448D24D90367
		// "ModelElement::containsClientDependency"
		return clientDependency.contains(clientDependency1);
		// -end- 33FFE57B0395 test_body448D24D90367
		// "ModelElement::containsClientDependency"
	}

	/**
	 * used to enumerate all connected ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 get_all_head448D24D90367
	// "ModelElement::iteratorClientDependency"
	public Iterator<Dependency> iteratorClientDependency()
	// -end- 33FFE57B0395 get_all_head448D24D90367
	// "ModelElement::iteratorClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 get_all_body448D24D90367
		// "ModelElement::iteratorClientDependency"
		return clientDependency.iterator();
		// -end- 33FFE57B0395 get_all_body448D24D90367
		// "ModelElement::iteratorClientDependency"
	}

	/**
	 * disconnect all ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 remove_all_head448D24D90367
	// "ModelElement::clearClientDependency"
	public void clearClientDependency()
	// -end- 33FFE57B0395 remove_all_head448D24D90367
	// "ModelElement::clearClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 remove_all_body448D24D90367
		// "ModelElement::clearClientDependency"
		if (sizeClientDependency() > 0) {
			for (Iterator<Dependency> p = clientDependency.iterator(); p.hasNext();) {
				((Dependency) p.next())._unlinkClient(this);
			}
			clientDependency.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearClientDependency"));
		}
		// -end- 33FFE57B0395 remove_all_body448D24D90367
		// "ModelElement::clearClientDependency"
	}

	/**
	 * returns the number of ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 size_head448D24D90367
	// "ModelElement::sizeClientDependency"
	public int sizeClientDependency()
	// -end- 33FFE57B0395 size_head448D24D90367
	// "ModelElement::sizeClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 size_body448D24D90367
		// "ModelElement::sizeClientDependency"
		return clientDependency.size();
		// -end- 33FFE57B0395 size_body448D24D90367
		// "ModelElement::sizeClientDependency"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B0395 _link_body448D24D90367
	// "ModelElement::_linkClientDependency"
	public void _linkClientDependency(Dependency clientDependency1) {
		clientDependency.add(clientDependency1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkClientDependency"));
		return;
	}
	// -end- 33FFE57B0395 _link_body448D24D90367
	// "ModelElement::_linkClientDependency"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B0395 _unlink_body448D24D90367
	// "ModelElement::_unlinkClientDependency"
	public void _unlinkClientDependency(Dependency clientDependency1) {
		clientDependency.remove(clientDependency1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkClientDependency"));
		return;
	}
	// -end- 33FFE57B0395 _unlink_body448D24D90367
	// "ModelElement::_unlinkClientDependency"

	// -beg- preserve=no 33E901E003D4 code448D24D90367 "taggedValue"
	private Set<TaggedValue> taggedValue = new HashSet<TaggedValue>();
	// -end- 33E901E003D4 code448D24D90367 "taggedValue"

	/**
	 * add a TaggedValue.
	 *
	 * @see #removeTaggedValue
	 * @see #containsTaggedValue
	 * @see #iteratorTaggedValue
	 * @see #clearTaggedValue
	 * @see #sizeTaggedValue
	 */
	// -beg- preserve=no 33E901E003D4 add_head448D24D90367
	// "ModelElement::addTaggedValue"
	public void addTaggedValue(TaggedValue taggedValue1)
	// -end- 33E901E003D4 add_head448D24D90367 "ModelElement::addTaggedValue"
	{
		// -beg- preserve=no 33E901E003D4 add_body448D24D90367
		// "ModelElement::addTaggedValue"
		taggedValue.add(taggedValue1);
		taggedValue1._linkModelElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addTaggedValue"));
		return;
		// -end- 33E901E003D4 add_body448D24D90367
		// "ModelElement::addTaggedValue"
	}

	/**
	 * disconnect a TaggedValue.
	 * 
	 * @see #addTaggedValue
	 */
	// -beg- preserve=no 33E901E003D4 remove_head448D24D90367
	// "ModelElement::removeTaggedValue"
	public TaggedValue removeTaggedValue(TaggedValue taggedValue1)
	// -end- 33E901E003D4 remove_head448D24D90367
	// "ModelElement::removeTaggedValue"
	{
		// -beg- preserve=no 33E901E003D4 remove_body448D24D90367
		// "ModelElement::removeTaggedValue"
		TaggedValue ret = null;
		if (taggedValue1 == null || !taggedValue.contains(taggedValue1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = taggedValue1;
		taggedValue.remove(taggedValue1);
		taggedValue1._unlinkModelElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeTaggedValue"));
		return ret;
		// -end- 33E901E003D4 remove_body448D24D90367
		// "ModelElement::removeTaggedValue"
	}

	/**
	 * tests if a given TaggedValue is connected.
	 * 
	 * @see #addTaggedValue
	 */
	// -beg- preserve=no 33E901E003D4 test_head448D24D90367
	// "ModelElement::containsTaggedValue"
	public boolean containsTaggedValue(TaggedValue taggedValue1)
	// -end- 33E901E003D4 test_head448D24D90367
	// "ModelElement::containsTaggedValue"
	{
		// -beg- preserve=no 33E901E003D4 test_body448D24D90367
		// "ModelElement::containsTaggedValue"
		return taggedValue.contains(taggedValue1);
		// -end- 33E901E003D4 test_body448D24D90367
		// "ModelElement::containsTaggedValue"
	}

	/**
	 * used to enumerate all connected TaggedValues.
	 * 
	 * @see #addTaggedValue
	 */
	// -beg- preserve=no 33E901E003D4 get_all_head448D24D90367
	// "ModelElement::iteratorTaggedValue"
	public Iterator<TaggedValue> iteratorTaggedValue()
	// -end- 33E901E003D4 get_all_head448D24D90367
	// "ModelElement::iteratorTaggedValue"
	{
		// -beg- preserve=no 33E901E003D4 get_all_body448D24D90367
		// "ModelElement::iteratorTaggedValue"
		return taggedValue.iterator();
		// -end- 33E901E003D4 get_all_body448D24D90367
		// "ModelElement::iteratorTaggedValue"
	}

	/**
	 * disconnect all TaggedValues.
	 * 
	 * @see #addTaggedValue
	 */
	// -beg- preserve=no 33E901E003D4 remove_all_head448D24D90367
	// "ModelElement::clearTaggedValue"
	public void clearTaggedValue()
	// -end- 33E901E003D4 remove_all_head448D24D90367
	// "ModelElement::clearTaggedValue"
	{
		// -beg- preserve=no 33E901E003D4 remove_all_body448D24D90367
		// "ModelElement::clearTaggedValue"
		if (sizeTaggedValue() > 0) {
			for (Iterator<TaggedValue> p = taggedValue.iterator(); p.hasNext();) {
				((TaggedValue) p.next())._unlinkModelElement(this);
			}
			taggedValue.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearTaggedValue"));
		}
		// -end- 33E901E003D4 remove_all_body448D24D90367
		// "ModelElement::clearTaggedValue"
	}

	/**
	 * returns the number of TaggedValues.
	 * 
	 * @see #addTaggedValue
	 */
	// -beg- preserve=no 33E901E003D4 size_head448D24D90367
	// "ModelElement::sizeTaggedValue"
	public int sizeTaggedValue()
	// -end- 33E901E003D4 size_head448D24D90367 "ModelElement::sizeTaggedValue"
	{
		// -beg- preserve=no 33E901E003D4 size_body448D24D90367
		// "ModelElement::sizeTaggedValue"
		return taggedValue.size();
		// -end- 33E901E003D4 size_body448D24D90367
		// "ModelElement::sizeTaggedValue"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E901E003D4 _link_body448D24D90367
	// "ModelElement::_linkTaggedValue"
	public void _linkTaggedValue(TaggedValue taggedValue1) {
		taggedValue.add(taggedValue1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkTaggedValue"));
		return;
	}
	// -end- 33E901E003D4 _link_body448D24D90367
	// "ModelElement::_linkTaggedValue"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E901E003D4 _unlink_body448D24D90367
	// "ModelElement::_unlinkTaggedValue"
	public void _unlinkTaggedValue(TaggedValue taggedValue1) {
		taggedValue.remove(taggedValue1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkTaggedValue"));
		return;
	}
	// -end- 33E901E003D4 _unlink_body448D24D90367
	// "ModelElement::_unlinkTaggedValue"

	// -beg- preserve=no 33EA67BB010E code448D24D90367 "constraint"
	private Set<Constraint> constraint = new HashSet<Constraint>();
	// -end- 33EA67BB010E code448D24D90367 "constraint"

	/**
	 * add a Constraint.
	 *
	 * @see #removeConstraint
	 * @see #containsConstraint
	 * @see #iteratorConstraint
	 * @see #clearConstraint
	 * @see #sizeConstraint
	 */
	// -beg- preserve=no 33EA67BB010E add_head448D24D90367
	// "ModelElement::addConstraint"
	public void addConstraint(Constraint constraint1)
	// -end- 33EA67BB010E add_head448D24D90367 "ModelElement::addConstraint"
	{
		// -beg- preserve=no 33EA67BB010E add_body448D24D90367
		// "ModelElement::addConstraint"
		constraint.add(constraint1);
		constraint1._linkConstrainedElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addConstraint"));
		return;
		// -end- 33EA67BB010E add_body448D24D90367 "ModelElement::addConstraint"
	}

	/**
	 * disconnect a Constraint.
	 * 
	 * @see #addConstraint
	 */
	// -beg- preserve=no 33EA67BB010E remove_head448D24D90367
	// "ModelElement::removeConstraint"
	public Constraint removeConstraint(Constraint constraint1)
	// -end- 33EA67BB010E remove_head448D24D90367
	// "ModelElement::removeConstraint"
	{
		// -beg- preserve=no 33EA67BB010E remove_body448D24D90367
		// "ModelElement::removeConstraint"
		Constraint ret = null;
		if (constraint1 == null || !constraint.contains(constraint1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = constraint1;
		constraint.remove(constraint1);
		constraint1._unlinkConstrainedElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeConstraint"));
		return ret;
		// -end- 33EA67BB010E remove_body448D24D90367
		// "ModelElement::removeConstraint"
	}

	/**
	 * tests if a given Constraint is connected.
	 * 
	 * @see #addConstraint
	 */
	// -beg- preserve=no 33EA67BB010E test_head448D24D90367
	// "ModelElement::containsConstraint"
	public boolean containsConstraint(Constraint constraint1)
	// -end- 33EA67BB010E test_head448D24D90367
	// "ModelElement::containsConstraint"
	{
		// -beg- preserve=no 33EA67BB010E test_body448D24D90367
		// "ModelElement::containsConstraint"
		return constraint.contains(constraint1);
		// -end- 33EA67BB010E test_body448D24D90367
		// "ModelElement::containsConstraint"
	}

	/**
	 * used to enumerate all connected Constraints.
	 * 
	 * @see #addConstraint
	 */
	// -beg- preserve=no 33EA67BB010E get_all_head448D24D90367
	// "ModelElement::iteratorConstraint"
	public Iterator<Constraint> iteratorConstraint()
	// -end- 33EA67BB010E get_all_head448D24D90367
	// "ModelElement::iteratorConstraint"
	{
		// -beg- preserve=no 33EA67BB010E get_all_body448D24D90367
		// "ModelElement::iteratorConstraint"
		return constraint.iterator();
		// -end- 33EA67BB010E get_all_body448D24D90367
		// "ModelElement::iteratorConstraint"
	}

	/**
	 * disconnect all Constraints.
	 * 
	 * @see #addConstraint
	 */
	// -beg- preserve=no 33EA67BB010E remove_all_head448D24D90367
	// "ModelElement::clearConstraint"
	public void clearConstraint()
	// -end- 33EA67BB010E remove_all_head448D24D90367
	// "ModelElement::clearConstraint"
	{
		// -beg- preserve=no 33EA67BB010E remove_all_body448D24D90367
		// "ModelElement::clearConstraint"
		if (sizeConstraint() > 0) {
			for (Iterator<?> p = constraint.iterator(); p.hasNext();) {
				((Constraint) p.next())._unlinkConstrainedElement(this);
			}
			constraint.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearConstraint"));
		}
		// -end- 33EA67BB010E remove_all_body448D24D90367
		// "ModelElement::clearConstraint"
	}

	/**
	 * returns the number of Constraints.
	 * 
	 * @see #addConstraint
	 */
	// -beg- preserve=no 33EA67BB010E size_head448D24D90367
	// "ModelElement::sizeConstraint"
	public int sizeConstraint()
	// -end- 33EA67BB010E size_head448D24D90367 "ModelElement::sizeConstraint"
	{
		// -beg- preserve=no 33EA67BB010E size_body448D24D90367
		// "ModelElement::sizeConstraint"
		return constraint.size();
		// -end- 33EA67BB010E size_body448D24D90367
		// "ModelElement::sizeConstraint"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33EA67BB010E _link_body448D24D90367
	// "ModelElement::_linkConstraint"
	public void _linkConstraint(Constraint constraint1) {
		constraint.add(constraint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkConstraint"));
		return;
	}
	// -end- 33EA67BB010E _link_body448D24D90367 "ModelElement::_linkConstraint"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33EA67BB010E _unlink_body448D24D90367
	// "ModelElement::_unlinkConstraint"
	public void _unlinkConstraint(Constraint constraint1) {
		constraint.remove(constraint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkConstraint"));
		return;
	}
	// -end- 33EA67BB010E _unlink_body448D24D90367
	// "ModelElement::_unlinkConstraint"

	// -beg- preserve=no 335C0D7A02A8 code448D24D90367 "supplierDependency"
	private Set<Dependency> supplierDependency = new HashSet<Dependency>();
	// -end- 335C0D7A02A8 code448D24D90367 "supplierDependency"

	/**
	 * add a SupplierDependency.
	 *
	 * @see #removeSupplierDependency
	 * @see #containsSupplierDependency
	 * @see #iteratorSupplierDependency
	 * @see #clearSupplierDependency
	 * @see #sizeSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 add_head448D24D90367
	// "ModelElement::addSupplierDependency"
	public void addSupplierDependency(Dependency supplierDependency1)
	// -end- 335C0D7A02A8 add_head448D24D90367
	// "ModelElement::addSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 add_body448D24D90367
		// "ModelElement::addSupplierDependency"
		supplierDependency.add(supplierDependency1);
		supplierDependency1._linkSupplier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSupplierDependency"));
		return;
		// -end- 335C0D7A02A8 add_body448D24D90367
		// "ModelElement::addSupplierDependency"
	}

	/**
	 * disconnect a SupplierDependency.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 remove_head448D24D90367
	// "ModelElement::removeSupplierDependency"
	public Dependency removeSupplierDependency(Dependency supplierDependency1)
	// -end- 335C0D7A02A8 remove_head448D24D90367
	// "ModelElement::removeSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 remove_body448D24D90367
		// "ModelElement::removeSupplierDependency"
		Dependency ret = null;
		if (supplierDependency1 == null || !supplierDependency.contains(supplierDependency1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = supplierDependency1;
		supplierDependency.remove(supplierDependency1);
		supplierDependency1._unlinkSupplier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSupplierDependency"));
		return ret;
		// -end- 335C0D7A02A8 remove_body448D24D90367
		// "ModelElement::removeSupplierDependency"
	}

	/**
	 * tests if a given SupplierDependency is connected.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 test_head448D24D90367
	// "ModelElement::containsSupplierDependency"
	public boolean containsSupplierDependency(Dependency supplierDependency1)
	// -end- 335C0D7A02A8 test_head448D24D90367
	// "ModelElement::containsSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 test_body448D24D90367
		// "ModelElement::containsSupplierDependency"
		return supplierDependency.contains(supplierDependency1);
		// -end- 335C0D7A02A8 test_body448D24D90367
		// "ModelElement::containsSupplierDependency"
	}

	/**
	 * used to enumerate all connected SupplierDependencys.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 get_all_head448D24D90367
	// "ModelElement::iteratorSupplierDependency"
	public Iterator<Dependency> iteratorSupplierDependency()
	// -end- 335C0D7A02A8 get_all_head448D24D90367
	// "ModelElement::iteratorSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 get_all_body448D24D90367
		// "ModelElement::iteratorSupplierDependency"
		return supplierDependency.iterator();
		// -end- 335C0D7A02A8 get_all_body448D24D90367
		// "ModelElement::iteratorSupplierDependency"
	}

	/**
	 * disconnect all SupplierDependencys.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 remove_all_head448D24D90367
	// "ModelElement::clearSupplierDependency"
	public void clearSupplierDependency()
	// -end- 335C0D7A02A8 remove_all_head448D24D90367
	// "ModelElement::clearSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 remove_all_body448D24D90367
		// "ModelElement::clearSupplierDependency"
		if (sizeSupplierDependency() > 0) {
			for (Iterator<Dependency> p = supplierDependency.iterator(); p.hasNext();) {
				((Dependency) p.next())._unlinkSupplier(this);
			}
			supplierDependency.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSupplierDependency"));
		}
		// -end- 335C0D7A02A8 remove_all_body448D24D90367
		// "ModelElement::clearSupplierDependency"
	}

	/**
	 * returns the number of SupplierDependencys.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 size_head448D24D90367
	// "ModelElement::sizeSupplierDependency"
	public int sizeSupplierDependency()
	// -end- 335C0D7A02A8 size_head448D24D90367
	// "ModelElement::sizeSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 size_body448D24D90367
		// "ModelElement::sizeSupplierDependency"
		return supplierDependency.size();
		// -end- 335C0D7A02A8 size_body448D24D90367
		// "ModelElement::sizeSupplierDependency"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02A8 _link_body448D24D90367
	// "ModelElement::_linkSupplierDependency"
	public void _linkSupplierDependency(Dependency supplierDependency1) {
		supplierDependency.add(supplierDependency1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSupplierDependency"));
		return;
	}
	// -end- 335C0D7A02A8 _link_body448D24D90367
	// "ModelElement::_linkSupplierDependency"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02A8 _unlink_body448D24D90367
	// "ModelElement::_unlinkSupplierDependency"
	public void _unlinkSupplierDependency(Dependency supplierDependency1) {
		supplierDependency.remove(supplierDependency1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSupplierDependency"));
		return;
	}
	// -end- 335C0D7A02A8 _unlink_body448D24D90367
	// "ModelElement::_unlinkSupplierDependency"

	// -beg- preserve=no 362409A9000A code448D24D90367 "presentation"
	private Set<PresentationElement> presentation = new HashSet<PresentationElement>();
	// -end- 362409A9000A code448D24D90367 "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head448D24D90367
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head448D24D90367 "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body448D24D90367
		// "ModelElement::addPresentation"
		presentation.add(presentation1);
		presentation1._linkSubject(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addPresentation"));
		return;
		// -end- 362409A9000A add_body448D24D90367
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head448D24D90367
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head448D24D90367
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body448D24D90367
		// "ModelElement::removePresentation"
		PresentationElement ret = null;
		if (presentation1 == null || !presentation.contains(presentation1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = presentation1;
		presentation.remove(presentation1);
		presentation1._unlinkSubject(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removePresentation"));
		return ret;
		// -end- 362409A9000A remove_body448D24D90367
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head448D24D90367
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head448D24D90367
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body448D24D90367
		// "ModelElement::containsPresentation"
		return presentation.contains(presentation1);
		// -end- 362409A9000A test_body448D24D90367
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head448D24D90367
	// "ModelElement::iteratorPresentation"
	public Iterator<PresentationElement> iteratorPresentation()
	// -end- 362409A9000A get_all_head448D24D90367
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body448D24D90367
		// "ModelElement::iteratorPresentation"
		return presentation.iterator();
		// -end- 362409A9000A get_all_body448D24D90367
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head448D24D90367
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head448D24D90367
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body448D24D90367
		// "ModelElement::clearPresentation"
		if (sizePresentation() > 0) {
			for (Iterator<PresentationElement> p = presentation.iterator(); p.hasNext();) {
				((PresentationElement) p.next())._unlinkSubject(this);
			}
			presentation.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearPresentation"));
		}
		// -end- 362409A9000A remove_all_body448D24D90367
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head448D24D90367
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head448D24D90367 "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body448D24D90367
		// "ModelElement::sizePresentation"
		return presentation.size();
		// -end- 362409A9000A size_body448D24D90367
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body448D24D90367
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		presentation.add(presentation1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkPresentation"));
		return;
	}
	// -end- 362409A9000A _link_body448D24D90367
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body448D24D90367
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		presentation.remove(presentation1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkPresentation"));
		return;
	}
	// -end- 362409A9000A _unlink_body448D24D90367
	// "ModelElement::_unlinkPresentation"

	// -beg- preserve=no 36240CA4024E code448D24D90367 "container"
	private Set<ElementResidence> container = new HashSet<ElementResidence>();
	// -end- 36240CA4024E code448D24D90367 "container"

	/**
	 * add a Container.
	 *
	 * @see #removeContainer
	 * @see #containsContainer
	 * @see #iteratorContainer
	 * @see #clearContainer
	 * @see #sizeContainer
	 * @see #iteratorContainerLink
	 * @see #createContainerLink
	 * @see #findContainerLink
	 */
	// -beg- preserve=no 36240CA4024E add_head448D24D90367
	// "ModelElement::addContainer"
	public void addContainer(Component container1)
	// -end- 36240CA4024E add_head448D24D90367 "ModelElement::addContainer"
	{
		// -beg- preserve=no 36240CA4024E add_body448D24D90367
		// "ModelElement::addContainer"
		ElementResidence linkobj = createContainerLink();
		linkobj.setContainer(container1);
		linkobj.setResident(this);
		container.add(linkobj);
		container1._linkResident(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addContainer"));
		return;
		// -end- 36240CA4024E add_body448D24D90367 "ModelElement::addContainer"
	}

	/**
	 * add a link to a Container.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E addlink_head448D24D90367
	// "ModelElement::addContainerLink"
	public void addContainerLink(ElementResidence container1)
	// -end- 36240CA4024E addlink_head448D24D90367
	// "ModelElement::addContainerLink"
	{
		// -beg- preserve=no 36240CA4024E addlink_body448D24D90367
		// "ModelElement::addContainerLink"
		container1.setResident(this);
		container.add(container1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addContainerLink"));
		return;
		// -end- 36240CA4024E addlink_body448D24D90367
		// "ModelElement::addContainerLink"
	}

	/**
	 * disconnect a Container.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E remove_head448D24D90367
	// "ModelElement::removeContainer"
	public Component removeContainer(Component container1)
	// -end- 36240CA4024E remove_head448D24D90367
	// "ModelElement::removeContainer"
	{
		// -beg- preserve=no 36240CA4024E remove_body448D24D90367
		// "ModelElement::removeContainer"
		Component ret = null;
		ElementResidence linkobj = findContainerLink(container1);
		if (container1 == null || linkobj == null) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = linkobj.getContainer();
		container.remove(linkobj);
		ret._unlinkResident(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeContainer"));
		return ret;
		// -end- 36240CA4024E remove_body448D24D90367
		// "ModelElement::removeContainer"
	}

	/**
	 * tests if a given Container is connected.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E test_head448D24D90367
	// "ModelElement::containsContainer"
	public boolean containsContainer(Component container1)
	// -end- 36240CA4024E test_head448D24D90367
	// "ModelElement::containsContainer"
	{
		// -beg- preserve=no 36240CA4024E test_body448D24D90367
		// "ModelElement::containsContainer"
		return container.contains(findContainerLink(container1));
		// -end- 36240CA4024E test_body448D24D90367
		// "ModelElement::containsContainer"
	}

	/**
	 * used to enumerate all connected Containers.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E get_all_head448D24D90367
	// "ModelElement::iteratorContainer"
	public Iterator<?> iteratorContainer()
	// -end- 36240CA4024E get_all_head448D24D90367
	// "ModelElement::iteratorContainer"
	{
		// -beg- preserve=no 36240CA4024E get_all_body448D24D90367
		// "ModelElement::iteratorContainer"
		return new Iterator<Object>() {
			private Iterator<ElementResidence> i = container.iterator();

			public boolean hasNext() {
				return i.hasNext();
			}

			public Object next() {
				ElementResidence next = (ElementResidence) i.next();
				return next.getContainer();
			}

			public void remove() {
				i.remove();
			}
		};
		// -end- 36240CA4024E get_all_body448D24D90367
		// "ModelElement::iteratorContainer"
	}

	/**
	 * disconnect all Containers.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E remove_all_head448D24D90367
	// "ModelElement::clearContainer"
	public void clearContainer()
	// -end- 36240CA4024E remove_all_head448D24D90367
	// "ModelElement::clearContainer"
	{
		// -beg- preserve=no 36240CA4024E remove_all_body448D24D90367
		// "ModelElement::clearContainer"
		if (sizeContainer() > 0) {
			for (Iterator<ElementResidence> p = container.iterator(); p.hasNext();) {
				ElementResidence linkobj = (ElementResidence) p.next();
				linkobj.getContainer()._unlinkResident(linkobj);
			}
			container.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearContainer"));
		}
		// -end- 36240CA4024E remove_all_body448D24D90367
		// "ModelElement::clearContainer"
	}

	/**
	 * returns the number of Containers.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E size_head448D24D90367
	// "ModelElement::sizeContainer"
	public int sizeContainer()
	// -end- 36240CA4024E size_head448D24D90367 "ModelElement::sizeContainer"
	{
		// -beg- preserve=no 36240CA4024E size_body448D24D90367
		// "ModelElement::sizeContainer"
		return container.size();
		// -end- 36240CA4024E size_body448D24D90367
		// "ModelElement::sizeContainer"
	}

	/**
	 * enumerate the link objects of currently connected Container.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E itlink_head448D24D90367
	// "ModelElement::getContainerLink"
	public Iterator<?> iteratorContainerLink()
	// -end- 36240CA4024E itlink_head448D24D90367
	// "ModelElement::getContainerLink"
	{
		// -beg- preserve=no 36240CA4024E itlink_body448D24D90367
		// "ModelElement::getContainerLink"
		return container.iterator();
		// -end- 36240CA4024E itlink_body448D24D90367
		// "ModelElement::getContainerLink"
	}

	/**
	 * create a link class for a new link to a Container.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E createlink_head448D24D90367
	// "ModelElement::createContainerLink"
	public ElementResidence createContainerLink()
	// -end- 36240CA4024E createlink_head448D24D90367
	// "ModelElement::createContainerLink"
	{
		// -beg- preserve=no 36240CA4024E createlink_body448D24D90367
		// "ModelElement::createContainerLink"
		// return new ElementResidence();
		throw new java.lang.UnsupportedOperationException();
		// -end- 36240CA4024E createlink_body448D24D90367
		// "ModelElement::createContainerLink"
	}

	/**
	 * find a link object for a given Container.
	 * 
	 * @see #addContainer
	 */
	// -beg- preserve=no 36240CA4024E find_head448D24D90367
	// "ModelElement::findContainerLink"
	public ElementResidence findContainerLink(Component container1)
	// -end- 36240CA4024E find_head448D24D90367
	// "ModelElement::findContainerLink"
	{
		// -beg- preserve=no 36240CA4024E find_body448D24D90367
		// "ModelElement::findContainerLink"
		if (container1 == null)
			return null;
		for (Iterator<?> p = container.iterator(); p.hasNext();) {
			ElementResidence linkobj = (ElementResidence) p.next();
			if (linkobj.getContainer() == container1)
				return linkobj;
		}
		return null;
		// -end- 36240CA4024E find_body448D24D90367
		// "ModelElement::findContainerLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36240CA4024E _link_body448D24D90367
	// "ModelElement::_linkContainer"
	public void _linkContainer(ElementResidence container1) {
		container.add(container1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkContainer"));
		return;
	}
	// -end- 36240CA4024E _link_body448D24D90367 "ModelElement::_linkContainer"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36240CA4024E _unlink_body448D24D90367
	// "ModelElement::_unlinkContainer"
	public void _unlinkContainer(ElementResidence container1) {
		container.remove(container1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkContainer"));
		return;
	}
	// -end- 36240CA4024E _unlink_body448D24D90367
	// "ModelElement::_unlinkContainer"

	// -beg- preserve=no 36240F380050 code448D24D90367 "templateParameter"
	private List<TemplateParameter> templateParameter = new ArrayList<TemplateParameter>();
	// -end- 36240F380050 code448D24D90367 "templateParameter"

	/**
	 * add a TemplateParameter.
	 *
	 * @see #removeTemplateParameter
	 * @see #containsTemplateParameter
	 * @see #iteratorTemplateParameter
	 * @see #clearTemplateParameter
	 * @see #sizeTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 add_head448D24D90367
	// "ModelElement::addTemplateParameter"
	public void addTemplateParameter(TemplateParameter templateParameter1)
	// -end- 36240F380050 add_head448D24D90367
	// "ModelElement::addTemplateParameter"
	{
		// -beg- preserve=no 36240F380050 add_body448D24D90367
		// "ModelElement::addTemplateParameter"
		templateParameter.add(templateParameter1);
		templateParameter1._linkTemplate(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addTemplateParameter"));
		return;
		// -end- 36240F380050 add_body448D24D90367
		// "ModelElement::addTemplateParameter"
	}

	// -beg- preserve=no 36240F380050 add2_head448D24D90367
	// "ModelElement::add2TemplateParameter"
	public void addTemplateParameter(int index, TemplateParameter templateParameter1)
	// -end- 36240F380050 add2_head448D24D90367
	// "ModelElement::add2TemplateParameter"
	{
		// -beg- preserve=no 36240F380050 add2_body448D24D90367
		// "ModelElement::add2TemplateParameter"
		templateParameter.add(index, templateParameter1);
		templateParameter1._linkTemplate(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addTemplateParameter"));
		return;
		// -end- 36240F380050 add2_body448D24D90367
		// "ModelElement::add2TemplateParameter"
	}

	/**
	 * disconnect a TemplateParameter.
	 * 
	 * @see #addTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 remove_head448D24D90367
	// "ModelElement::removeTemplateParameter"
	public TemplateParameter removeTemplateParameter(TemplateParameter templateParameter1)
	// -end- 36240F380050 remove_head448D24D90367
	// "ModelElement::removeTemplateParameter"
	{
		// -beg- preserve=no 36240F380050 remove_body448D24D90367
		// "ModelElement::removeTemplateParameter"
		TemplateParameter ret = null;
		if (templateParameter1 == null || !templateParameter.contains(templateParameter1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = templateParameter1;
		templateParameter.remove(templateParameter1);
		templateParameter1._unlinkTemplate(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeTemplateParameter"));
		return ret;
		// -end- 36240F380050 remove_body448D24D90367
		// "ModelElement::removeTemplateParameter"
	}

	/**
	 * disconnect a TemplateParameter.
	 * 
	 * @see #addTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 remove2_head448D24D90367
	// "ModelElement::remove2TemplateParameter"
	public TemplateParameter removeTemplateParameter(int index)
	// -end- 36240F380050 remove2_head448D24D90367
	// "ModelElement::remove2TemplateParameter"
	{
		// -beg- preserve=no 36240F380050 remove2_body448D24D90367
		// "ModelElement::remove2TemplateParameter"
		TemplateParameter ret = null;
		ret = (TemplateParameter) templateParameter.remove(index);
		ret._unlinkTemplate(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeTemplateParameter"));
		return ret;
		// -end- 36240F380050 remove2_body448D24D90367
		// "ModelElement::remove2TemplateParameter"
	}

	/**
	 * change a TemplateParameter.
	 * 
	 * @see #addTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 set_head448D24D90367
	// "ModelElement::setTemplateParameter"
	public TemplateParameter setTemplateParameter(int index, TemplateParameter templateParameter1)
	// -end- 36240F380050 set_head448D24D90367
	// "ModelElement::setTemplateParameter"
	{
		// -beg- preserve=no 36240F380050 set_body448D24D90367
		// "ModelElement::setTemplateParameter"
		TemplateParameter ret = null;
		ret = (TemplateParameter) templateParameter.set(index, templateParameter1);
		ret._unlinkTemplate(this);
		templateParameter1._linkTemplate(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setTemplateParameter"));
		return ret;
		// -end- 36240F380050 set_body448D24D90367
		// "ModelElement::setTemplateParameter"
	}

	/**
	 * tests if a given TemplateParameter is connected.
	 * 
	 * @see #addTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 test_head448D24D90367
	// "ModelElement::containsTemplateParameter"
	public boolean containsTemplateParameter(TemplateParameter templateParameter1)
	// -end- 36240F380050 test_head448D24D90367
	// "ModelElement::containsTemplateParameter"
	{
		// -beg- preserve=no 36240F380050 test_body448D24D90367
		// "ModelElement::containsTemplateParameter"
		return templateParameter.contains(templateParameter1);
		// -end- 36240F380050 test_body448D24D90367
		// "ModelElement::containsTemplateParameter"
	}

	/**
	 * used to enumerate all connected TemplateParameters.
	 * 
	 * @see #addTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 get_all_head448D24D90367
	// "ModelElement::iteratorTemplateParameter"
	public Iterator<TemplateParameter> iteratorTemplateParameter()
	// -end- 36240F380050 get_all_head448D24D90367
	// "ModelElement::iteratorTemplateParameter"
	{
		// -beg- preserve=no 36240F380050 get_all_body448D24D90367
		// "ModelElement::iteratorTemplateParameter"
		return templateParameter.iterator();
		// -end- 36240F380050 get_all_body448D24D90367
		// "ModelElement::iteratorTemplateParameter"
	}

	/**
	 * disconnect all TemplateParameters.
	 * 
	 * @see #addTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 remove_all_head448D24D90367
	// "ModelElement::clearTemplateParameter"
	public void clearTemplateParameter()
	// -end- 36240F380050 remove_all_head448D24D90367
	// "ModelElement::clearTemplateParameter"
	{
		// -beg- preserve=no 36240F380050 remove_all_body448D24D90367
		// "ModelElement::clearTemplateParameter"
		if (sizeTemplateParameter() > 0) {
			for (Iterator<TemplateParameter> p = templateParameter.iterator(); p.hasNext();) {
				((TemplateParameter) p.next())._unlinkTemplate(this);
			}
			templateParameter.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearTemplateParameter"));
		}
		// -end- 36240F380050 remove_all_body448D24D90367
		// "ModelElement::clearTemplateParameter"
	}

	/**
	 * returns the number of TemplateParameters.
	 * 
	 * @see #addTemplateParameter
	 */
	// -beg- preserve=no 36240F380050 size_head448D24D90367
	// "ModelElement::sizeTemplateParameter"
	public int sizeTemplateParameter()
	// -end- 36240F380050 size_head448D24D90367
	// "ModelElement::sizeTemplateParameter"
	{
		// -beg- preserve=no 36240F380050 size_body448D24D90367
		// "ModelElement::sizeTemplateParameter"
		return templateParameter.size();
		// -end- 36240F380050 size_body448D24D90367
		// "ModelElement::sizeTemplateParameter"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36240F380050 _link_body448D24D90367
	// "ModelElement::_linkTemplateParameter"
	public void _linkTemplateParameter(TemplateParameter templateParameter1) {
		templateParameter.add(templateParameter1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkTemplateParameter"));
		return;
	}
	// -end- 36240F380050 _link_body448D24D90367
	// "ModelElement::_linkTemplateParameter"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36240F380050 _unlink_body448D24D90367
	// "ModelElement::_unlinkTemplateParameter"
	public void _unlinkTemplateParameter(TemplateParameter templateParameter1) {
		templateParameter.remove(templateParameter1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkTemplateParameter"));
		return;
	}
	// -end- 36240F380050 _unlink_body448D24D90367
	// "ModelElement::_unlinkTemplateParameter"

	// -beg- preserve=no 3627D5E9010F code448D24D90367 "targetFlow"
	private Set<Flow> targetFlow = new HashSet<Flow>();
	// -end- 3627D5E9010F code448D24D90367 "targetFlow"

	/**
	 * add a TargetFlow.
	 *
	 * @see #removeTargetFlow
	 * @see #containsTargetFlow
	 * @see #iteratorTargetFlow
	 * @see #clearTargetFlow
	 * @see #sizeTargetFlow
	 */
	// -beg- preserve=no 3627D5E9010F add_head448D24D90367
	// "ModelElement::addTargetFlow"
	public void addTargetFlow(Flow targetFlow1)
	// -end- 3627D5E9010F add_head448D24D90367 "ModelElement::addTargetFlow"
	{
		// -beg- preserve=no 3627D5E9010F add_body448D24D90367
		// "ModelElement::addTargetFlow"
		targetFlow.add(targetFlow1);
		targetFlow1._linkTarget(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addTargetFlow"));
		return;
		// -end- 3627D5E9010F add_body448D24D90367 "ModelElement::addTargetFlow"
	}

	/**
	 * disconnect a TargetFlow.
	 * 
	 * @see #addTargetFlow
	 */
	// -beg- preserve=no 3627D5E9010F remove_head448D24D90367
	// "ModelElement::removeTargetFlow"
	public Flow removeTargetFlow(Flow targetFlow1)
	// -end- 3627D5E9010F remove_head448D24D90367
	// "ModelElement::removeTargetFlow"
	{
		// -beg- preserve=no 3627D5E9010F remove_body448D24D90367
		// "ModelElement::removeTargetFlow"
		Flow ret = null;
		if (targetFlow1 == null || !targetFlow.contains(targetFlow1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = targetFlow1;
		targetFlow.remove(targetFlow1);
		targetFlow1._unlinkTarget(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeTargetFlow"));
		return ret;
		// -end- 3627D5E9010F remove_body448D24D90367
		// "ModelElement::removeTargetFlow"
	}

	/**
	 * tests if a given TargetFlow is connected.
	 * 
	 * @see #addTargetFlow
	 */
	// -beg- preserve=no 3627D5E9010F test_head448D24D90367
	// "ModelElement::containsTargetFlow"
	public boolean containsTargetFlow(Flow targetFlow1)
	// -end- 3627D5E9010F test_head448D24D90367
	// "ModelElement::containsTargetFlow"
	{
		// -beg- preserve=no 3627D5E9010F test_body448D24D90367
		// "ModelElement::containsTargetFlow"
		return targetFlow.contains(targetFlow1);
		// -end- 3627D5E9010F test_body448D24D90367
		// "ModelElement::containsTargetFlow"
	}

	/**
	 * used to enumerate all connected TargetFlows.
	 * 
	 * @see #addTargetFlow
	 */
	// -beg- preserve=no 3627D5E9010F get_all_head448D24D90367
	// "ModelElement::iteratorTargetFlow"
	public Iterator<Flow> iteratorTargetFlow()
	// -end- 3627D5E9010F get_all_head448D24D90367
	// "ModelElement::iteratorTargetFlow"
	{
		// -beg- preserve=no 3627D5E9010F get_all_body448D24D90367
		// "ModelElement::iteratorTargetFlow"
		return targetFlow.iterator();
		// -end- 3627D5E9010F get_all_body448D24D90367
		// "ModelElement::iteratorTargetFlow"
	}

	/**
	 * disconnect all TargetFlows.
	 * 
	 * @see #addTargetFlow
	 */
	// -beg- preserve=no 3627D5E9010F remove_all_head448D24D90367
	// "ModelElement::clearTargetFlow"
	public void clearTargetFlow()
	// -end- 3627D5E9010F remove_all_head448D24D90367
	// "ModelElement::clearTargetFlow"
	{
		// -beg- preserve=no 3627D5E9010F remove_all_body448D24D90367
		// "ModelElement::clearTargetFlow"
		if (sizeTargetFlow() > 0) {
			for (Iterator<Flow> p = targetFlow.iterator(); p.hasNext();) {
				((Flow) p.next())._unlinkTarget(this);
			}
			targetFlow.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearTargetFlow"));
		}
		// -end- 3627D5E9010F remove_all_body448D24D90367
		// "ModelElement::clearTargetFlow"
	}

	/**
	 * returns the number of TargetFlows.
	 * 
	 * @see #addTargetFlow
	 */
	// -beg- preserve=no 3627D5E9010F size_head448D24D90367
	// "ModelElement::sizeTargetFlow"
	public int sizeTargetFlow()
	// -end- 3627D5E9010F size_head448D24D90367 "ModelElement::sizeTargetFlow"
	{
		// -beg- preserve=no 3627D5E9010F size_body448D24D90367
		// "ModelElement::sizeTargetFlow"
		return targetFlow.size();
		// -end- 3627D5E9010F size_body448D24D90367
		// "ModelElement::sizeTargetFlow"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3627D5E9010F _link_body448D24D90367
	// "ModelElement::_linkTargetFlow"
	public void _linkTargetFlow(Flow targetFlow1) {
		targetFlow.add(targetFlow1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkTargetFlow"));
		return;
	}
	// -end- 3627D5E9010F _link_body448D24D90367 "ModelElement::_linkTargetFlow"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3627D5E9010F _unlink_body448D24D90367
	// "ModelElement::_unlinkTargetFlow"
	public void _unlinkTargetFlow(Flow targetFlow1) {
		targetFlow.remove(targetFlow1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkTargetFlow"));
		return;
	}
	// -end- 3627D5E9010F _unlink_body448D24D90367
	// "ModelElement::_unlinkTargetFlow"

	// -beg- preserve=no 3627D60F03DF code448D24D90367 "sourceFlow"
	private Set<Flow> sourceFlow = new HashSet<Flow>();
	// -end- 3627D60F03DF code448D24D90367 "sourceFlow"

	/**
	 * add a SourceFlow.
	 *
	 * @see #removeSourceFlow
	 * @see #containsSourceFlow
	 * @see #iteratorSourceFlow
	 * @see #clearSourceFlow
	 * @see #sizeSourceFlow
	 */
	// -beg- preserve=no 3627D60F03DF add_head448D24D90367
	// "ModelElement::addSourceFlow"
	public void addSourceFlow(Flow sourceFlow1)
	// -end- 3627D60F03DF add_head448D24D90367 "ModelElement::addSourceFlow"
	{
		// -beg- preserve=no 3627D60F03DF add_body448D24D90367
		// "ModelElement::addSourceFlow"
		sourceFlow.add(sourceFlow1);
		sourceFlow1._linkSource(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSourceFlow"));
		return;
		// -end- 3627D60F03DF add_body448D24D90367 "ModelElement::addSourceFlow"
	}

	/**
	 * disconnect a SourceFlow.
	 * 
	 * @see #addSourceFlow
	 */
	// -beg- preserve=no 3627D60F03DF remove_head448D24D90367
	// "ModelElement::removeSourceFlow"
	public Flow removeSourceFlow(Flow sourceFlow1)
	// -end- 3627D60F03DF remove_head448D24D90367
	// "ModelElement::removeSourceFlow"
	{
		// -beg- preserve=no 3627D60F03DF remove_body448D24D90367
		// "ModelElement::removeSourceFlow"
		Flow ret = null;
		if (sourceFlow1 == null || !sourceFlow.contains(sourceFlow1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = sourceFlow1;
		sourceFlow.remove(sourceFlow1);
		sourceFlow1._unlinkSource(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSourceFlow"));
		return ret;
		// -end- 3627D60F03DF remove_body448D24D90367
		// "ModelElement::removeSourceFlow"
	}

	/**
	 * tests if a given SourceFlow is connected.
	 * 
	 * @see #addSourceFlow
	 */
	// -beg- preserve=no 3627D60F03DF test_head448D24D90367
	// "ModelElement::containsSourceFlow"
	public boolean containsSourceFlow(Flow sourceFlow1)
	// -end- 3627D60F03DF test_head448D24D90367
	// "ModelElement::containsSourceFlow"
	{
		// -beg- preserve=no 3627D60F03DF test_body448D24D90367
		// "ModelElement::containsSourceFlow"
		return sourceFlow.contains(sourceFlow1);
		// -end- 3627D60F03DF test_body448D24D90367
		// "ModelElement::containsSourceFlow"
	}

	/**
	 * used to enumerate all connected SourceFlows.
	 * 
	 * @see #addSourceFlow
	 */
	// -beg- preserve=no 3627D60F03DF get_all_head448D24D90367
	// "ModelElement::iteratorSourceFlow"
	public Iterator<Flow> iteratorSourceFlow()
	// -end- 3627D60F03DF get_all_head448D24D90367
	// "ModelElement::iteratorSourceFlow"
	{
		// -beg- preserve=no 3627D60F03DF get_all_body448D24D90367
		// "ModelElement::iteratorSourceFlow"
		return sourceFlow.iterator();
		// -end- 3627D60F03DF get_all_body448D24D90367
		// "ModelElement::iteratorSourceFlow"
	}

	/**
	 * disconnect all SourceFlows.
	 * 
	 * @see #addSourceFlow
	 */
	// -beg- preserve=no 3627D60F03DF remove_all_head448D24D90367
	// "ModelElement::clearSourceFlow"
	public void clearSourceFlow()
	// -end- 3627D60F03DF remove_all_head448D24D90367
	// "ModelElement::clearSourceFlow"
	{
		// -beg- preserve=no 3627D60F03DF remove_all_body448D24D90367
		// "ModelElement::clearSourceFlow"
		if (sizeSourceFlow() > 0) {
			for (Iterator<Flow> p = sourceFlow.iterator(); p.hasNext();) {
				((Flow) p.next())._unlinkSource(this);
			}
			sourceFlow.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSourceFlow"));
		}
		// -end- 3627D60F03DF remove_all_body448D24D90367
		// "ModelElement::clearSourceFlow"
	}

	/**
	 * returns the number of SourceFlows.
	 * 
	 * @see #addSourceFlow
	 */
	// -beg- preserve=no 3627D60F03DF size_head448D24D90367
	// "ModelElement::sizeSourceFlow"
	public int sizeSourceFlow()
	// -end- 3627D60F03DF size_head448D24D90367 "ModelElement::sizeSourceFlow"
	{
		// -beg- preserve=no 3627D60F03DF size_body448D24D90367
		// "ModelElement::sizeSourceFlow"
		return sourceFlow.size();
		// -end- 3627D60F03DF size_body448D24D90367
		// "ModelElement::sizeSourceFlow"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3627D60F03DF _link_body448D24D90367
	// "ModelElement::_linkSourceFlow"
	public void _linkSourceFlow(Flow sourceFlow1) {
		sourceFlow.add(sourceFlow1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSourceFlow"));
		return;
	}
	// -end- 3627D60F03DF _link_body448D24D90367 "ModelElement::_linkSourceFlow"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3627D60F03DF _unlink_body448D24D90367
	// "ModelElement::_unlinkSourceFlow"
	public void _unlinkSourceFlow(Flow sourceFlow1) {
		sourceFlow.remove(sourceFlow1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSourceFlow"));
		return;
	}
	// -end- 3627D60F03DF _unlink_body448D24D90367
	// "ModelElement::_unlinkSourceFlow"

	// -beg- preserve=no 365EEE82035C code448D24D90367 "defaultParameter"
	private Set<TemplateParameter> defaultParameter = new HashSet<TemplateParameter>();
	// -end- 365EEE82035C code448D24D90367 "defaultParameter"

	/**
	 * add a DefaultParameter.
	 *
	 * @see #removeDefaultParameter
	 * @see #containsDefaultParameter
	 * @see #iteratorDefaultParameter
	 * @see #clearDefaultParameter
	 * @see #sizeDefaultParameter
	 */
	// -beg- preserve=no 365EEE82035C add_head448D24D90367
	// "ModelElement::addDefaultParameter"
	public void addDefaultParameter(TemplateParameter defaultParameter1)
	// -end- 365EEE82035C add_head448D24D90367
	// "ModelElement::addDefaultParameter"
	{
		// -beg- preserve=no 365EEE82035C add_body448D24D90367
		// "ModelElement::addDefaultParameter"
		defaultParameter.add(defaultParameter1);
		defaultParameter1._linkDefaultElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addDefaultParameter"));
		return;
		// -end- 365EEE82035C add_body448D24D90367
		// "ModelElement::addDefaultParameter"
	}

	/**
	 * disconnect a DefaultParameter.
	 * 
	 * @see #addDefaultParameter
	 */
	// -beg- preserve=no 365EEE82035C remove_head448D24D90367
	// "ModelElement::removeDefaultParameter"
	public TemplateParameter removeDefaultParameter(TemplateParameter defaultParameter1)
	// -end- 365EEE82035C remove_head448D24D90367
	// "ModelElement::removeDefaultParameter"
	{
		// -beg- preserve=no 365EEE82035C remove_body448D24D90367
		// "ModelElement::removeDefaultParameter"
		TemplateParameter ret = null;
		if (defaultParameter1 == null || !defaultParameter.contains(defaultParameter1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = defaultParameter1;
		defaultParameter.remove(defaultParameter1);
		defaultParameter1._unlinkDefaultElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeDefaultParameter"));
		return ret;
		// -end- 365EEE82035C remove_body448D24D90367
		// "ModelElement::removeDefaultParameter"
	}

	/**
	 * tests if a given DefaultParameter is connected.
	 * 
	 * @see #addDefaultParameter
	 */
	// -beg- preserve=no 365EEE82035C test_head448D24D90367
	// "ModelElement::containsDefaultParameter"
	public boolean containsDefaultParameter(TemplateParameter defaultParameter1)
	// -end- 365EEE82035C test_head448D24D90367
	// "ModelElement::containsDefaultParameter"
	{
		// -beg- preserve=no 365EEE82035C test_body448D24D90367
		// "ModelElement::containsDefaultParameter"
		return defaultParameter.contains(defaultParameter1);
		// -end- 365EEE82035C test_body448D24D90367
		// "ModelElement::containsDefaultParameter"
	}

	/**
	 * used to enumerate all connected DefaultParameters.
	 * 
	 * @see #addDefaultParameter
	 */
	// -beg- preserve=no 365EEE82035C get_all_head448D24D90367
	// "ModelElement::iteratorDefaultParameter"
	public Iterator<TemplateParameter> iteratorDefaultParameter()
	// -end- 365EEE82035C get_all_head448D24D90367
	// "ModelElement::iteratorDefaultParameter"
	{
		// -beg- preserve=no 365EEE82035C get_all_body448D24D90367
		// "ModelElement::iteratorDefaultParameter"
		return defaultParameter.iterator();
		// -end- 365EEE82035C get_all_body448D24D90367
		// "ModelElement::iteratorDefaultParameter"
	}

	/**
	 * disconnect all DefaultParameters.
	 * 
	 * @see #addDefaultParameter
	 */
	// -beg- preserve=no 365EEE82035C remove_all_head448D24D90367
	// "ModelElement::clearDefaultParameter"
	public void clearDefaultParameter()
	// -end- 365EEE82035C remove_all_head448D24D90367
	// "ModelElement::clearDefaultParameter"
	{
		// -beg- preserve=no 365EEE82035C remove_all_body448D24D90367
		// "ModelElement::clearDefaultParameter"
		if (sizeDefaultParameter() > 0) {
			for (Iterator<TemplateParameter> p = defaultParameter.iterator(); p.hasNext();) {
				((TemplateParameter) p.next())._unlinkDefaultElement(this);
			}
			defaultParameter.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearDefaultParameter"));
		}
		// -end- 365EEE82035C remove_all_body448D24D90367
		// "ModelElement::clearDefaultParameter"
	}

	/**
	 * returns the number of DefaultParameters.
	 * 
	 * @see #addDefaultParameter
	 */
	// -beg- preserve=no 365EEE82035C size_head448D24D90367
	// "ModelElement::sizeDefaultParameter"
	public int sizeDefaultParameter()
	// -end- 365EEE82035C size_head448D24D90367
	// "ModelElement::sizeDefaultParameter"
	{
		// -beg- preserve=no 365EEE82035C size_body448D24D90367
		// "ModelElement::sizeDefaultParameter"
		return defaultParameter.size();
		// -end- 365EEE82035C size_body448D24D90367
		// "ModelElement::sizeDefaultParameter"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 365EEE82035C _link_body448D24D90367
	// "ModelElement::_linkDefaultParameter"
	public void _linkDefaultParameter(TemplateParameter defaultParameter1) {
		defaultParameter.add(defaultParameter1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkDefaultParameter"));
		return;
	}
	// -end- 365EEE82035C _link_body448D24D90367
	// "ModelElement::_linkDefaultParameter"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 365EEE82035C _unlink_body448D24D90367
	// "ModelElement::_unlinkDefaultParameter"
	public void _unlinkDefaultParameter(TemplateParameter defaultParameter1) {
		defaultParameter.remove(defaultParameter1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkDefaultParameter"));
		return;
	}
	// -end- 365EEE82035C _unlink_body448D24D90367
	// "ModelElement::_unlinkDefaultParameter"

	// -beg- preserve=no 370E7E3C02DE code448D24D90367 "comment"
	private Set<Comment> comment = new HashSet<Comment>();
	// -end- 370E7E3C02DE code448D24D90367 "comment"

	/**
	 * add a Comment.
	 *
	 * @see #removeComment
	 * @see #containsComment
	 * @see #iteratorComment
	 * @see #clearComment
	 * @see #sizeComment
	 */
	// -beg- preserve=no 370E7E3C02DE add_head448D24D90367
	// "ModelElement::addComment"
	public void addComment(Comment comment1)
	// -end- 370E7E3C02DE add_head448D24D90367 "ModelElement::addComment"
	{
		// -beg- preserve=no 370E7E3C02DE add_body448D24D90367
		// "ModelElement::addComment"
		comment.add(comment1);
		comment1._linkAnnotatedElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addComment"));
		return;
		// -end- 370E7E3C02DE add_body448D24D90367 "ModelElement::addComment"
	}

	/**
	 * disconnect a Comment.
	 * 
	 * @see #addComment
	 */
	// -beg- preserve=no 370E7E3C02DE remove_head448D24D90367
	// "ModelElement::removeComment"
	public Comment removeComment(Comment comment1)
	// -end- 370E7E3C02DE remove_head448D24D90367 "ModelElement::removeComment"
	{
		// -beg- preserve=no 370E7E3C02DE remove_body448D24D90367
		// "ModelElement::removeComment"
		Comment ret = null;
		if (comment1 == null || !comment.contains(comment1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = comment1;
		comment.remove(comment1);
		comment1._unlinkAnnotatedElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeComment"));
		return ret;
		// -end- 370E7E3C02DE remove_body448D24D90367
		// "ModelElement::removeComment"
	}

	/**
	 * tests if a given Comment is connected.
	 * 
	 * @see #addComment
	 */
	// -beg- preserve=no 370E7E3C02DE test_head448D24D90367
	// "ModelElement::containsComment"
	public boolean containsComment(Comment comment1)
	// -end- 370E7E3C02DE test_head448D24D90367 "ModelElement::containsComment"
	{
		// -beg- preserve=no 370E7E3C02DE test_body448D24D90367
		// "ModelElement::containsComment"
		return comment.contains(comment1);
		// -end- 370E7E3C02DE test_body448D24D90367
		// "ModelElement::containsComment"
	}

	/**
	 * used to enumerate all connected Comments.
	 * 
	 * @see #addComment
	 */
	// -beg- preserve=no 370E7E3C02DE get_all_head448D24D90367
	// "ModelElement::iteratorComment"
	public Iterator<Comment> iteratorComment()
	// -end- 370E7E3C02DE get_all_head448D24D90367
	// "ModelElement::iteratorComment"
	{
		// -beg- preserve=no 370E7E3C02DE get_all_body448D24D90367
		// "ModelElement::iteratorComment"
		return comment.iterator();
		// -end- 370E7E3C02DE get_all_body448D24D90367
		// "ModelElement::iteratorComment"
	}

	/**
	 * disconnect all Comments.
	 * 
	 * @see #addComment
	 */
	// -beg- preserve=no 370E7E3C02DE remove_all_head448D24D90367
	// "ModelElement::clearComment"
	public void clearComment()
	// -end- 370E7E3C02DE remove_all_head448D24D90367
	// "ModelElement::clearComment"
	{
		// -beg- preserve=no 370E7E3C02DE remove_all_body448D24D90367
		// "ModelElement::clearComment"
		if (sizeComment() > 0) {
			for (Iterator<Comment> p = comment.iterator(); p.hasNext();) {
				((Comment) p.next())._unlinkAnnotatedElement(this);
			}
			comment.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearComment"));
		}
		// -end- 370E7E3C02DE remove_all_body448D24D90367
		// "ModelElement::clearComment"
	}

	/**
	 * returns the number of Comments.
	 * 
	 * @see #addComment
	 */
	// -beg- preserve=no 370E7E3C02DE size_head448D24D90367
	// "ModelElement::sizeComment"
	public int sizeComment()
	// -end- 370E7E3C02DE size_head448D24D90367 "ModelElement::sizeComment"
	{
		// -beg- preserve=no 370E7E3C02DE size_body448D24D90367
		// "ModelElement::sizeComment"
		return comment.size();
		// -end- 370E7E3C02DE size_body448D24D90367 "ModelElement::sizeComment"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 370E7E3C02DE _link_body448D24D90367
	// "ModelElement::_linkComment"
	public void _linkComment(Comment comment1) {
		comment.add(comment1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkComment"));
		return;
	}
	// -end- 370E7E3C02DE _link_body448D24D90367 "ModelElement::_linkComment"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 370E7E3C02DE _unlink_body448D24D90367
	// "ModelElement::_unlinkComment"
	public void _unlinkComment(Comment comment1) {
		comment.remove(comment1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkComment"));
		return;
	}
	// -end- 370E7E3C02DE _unlink_body448D24D90367
	// "ModelElement::_unlinkComment"

	// -beg- preserve=no 338613A4007B code448D24D90367 "stereotype"
	private Set<Stereotype> stereotype = new HashSet<Stereotype>();
	// -end- 338613A4007B code448D24D90367 "stereotype"

	/**
	 * add a Stereotype.
	 *
	 * @see #removeStereotype
	 * @see #containsStereotype
	 * @see #iteratorStereotype
	 * @see #clearStereotype
	 * @see #sizeStereotype
	 */
	// -beg- preserve=no 338613A4007B add_head448D24D90367
	// "ModelElement::addStereotype"
	public void addStereotype(Stereotype stereotype1)
	// -end- 338613A4007B add_head448D24D90367 "ModelElement::addStereotype"
	{
		// -beg- preserve=no 338613A4007B add_body448D24D90367
		// "ModelElement::addStereotype"
		stereotype.add(stereotype1);
		stereotype1._linkExtendedElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addStereotype"));
		return;
		// -end- 338613A4007B add_body448D24D90367 "ModelElement::addStereotype"
	}

	/**
	 * disconnect a Stereotype.
	 * 
	 * @see #addStereotype
	 */
	// -beg- preserve=no 338613A4007B remove_head448D24D90367
	// "ModelElement::removeStereotype"
	public Stereotype removeStereotype(Stereotype stereotype1)
	// -end- 338613A4007B remove_head448D24D90367
	// "ModelElement::removeStereotype"
	{
		// -beg- preserve=no 338613A4007B remove_body448D24D90367
		// "ModelElement::removeStereotype"
		Stereotype ret = null;
		if (stereotype1 == null || !stereotype.contains(stereotype1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = stereotype1;
		stereotype.remove(stereotype1);
		stereotype1._unlinkExtendedElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeStereotype"));
		return ret;
		// -end- 338613A4007B remove_body448D24D90367
		// "ModelElement::removeStereotype"
	}

	/**
	 * tests if a given Stereotype is connected.
	 * 
	 * @see #addStereotype
	 */
	// -beg- preserve=no 338613A4007B test_head448D24D90367
	// "ModelElement::containsStereotype"
	public boolean containsStereotype(Stereotype stereotype1)
	// -end- 338613A4007B test_head448D24D90367
	// "ModelElement::containsStereotype"
	{
		// -beg- preserve=no 338613A4007B test_body448D24D90367
		// "ModelElement::containsStereotype"
		return stereotype.contains(stereotype1);
		// -end- 338613A4007B test_body448D24D90367
		// "ModelElement::containsStereotype"
	}

	/**
	 * used to enumerate all connected Stereotypes.
	 * 
	 * @see #addStereotype
	 */
	// -beg- preserve=no 338613A4007B get_all_head448D24D90367
	// "ModelElement::iteratorStereotype"
	public Iterator<Stereotype> iteratorStereotype()
	// -end- 338613A4007B get_all_head448D24D90367
	// "ModelElement::iteratorStereotype"
	{
		// -beg- preserve=no 338613A4007B get_all_body448D24D90367
		// "ModelElement::iteratorStereotype"
		return stereotype.iterator();
		// -end- 338613A4007B get_all_body448D24D90367
		// "ModelElement::iteratorStereotype"
	}

	/**
	 * disconnect all Stereotypes.
	 * 
	 * @see #addStereotype
	 */
	// -beg- preserve=no 338613A4007B remove_all_head448D24D90367
	// "ModelElement::clearStereotype"
	public void clearStereotype()
	// -end- 338613A4007B remove_all_head448D24D90367
	// "ModelElement::clearStereotype"
	{
		// -beg- preserve=no 338613A4007B remove_all_body448D24D90367
		// "ModelElement::clearStereotype"
		if (sizeStereotype() > 0) {
			for (Iterator<Stereotype> p = stereotype.iterator(); p.hasNext();) {
				((Stereotype) p.next())._unlinkExtendedElement(this);
			}
			stereotype.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearStereotype"));
		}
		// -end- 338613A4007B remove_all_body448D24D90367
		// "ModelElement::clearStereotype"
	}

	/**
	 * returns the number of Stereotypes.
	 * 
	 * @see #addStereotype
	 */
	// -beg- preserve=no 338613A4007B size_head448D24D90367
	// "ModelElement::sizeStereotype"
	public int sizeStereotype()
	// -end- 338613A4007B size_head448D24D90367 "ModelElement::sizeStereotype"
	{
		// -beg- preserve=no 338613A4007B size_body448D24D90367
		// "ModelElement::sizeStereotype"
		return stereotype.size();
		// -end- 338613A4007B size_body448D24D90367
		// "ModelElement::sizeStereotype"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 338613A4007B _link_body448D24D90367
	// "ModelElement::_linkStereotype"
	public void _linkStereotype(Stereotype stereotype1) {
		stereotype.add(stereotype1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkStereotype"));
		return;
	}
	// -end- 338613A4007B _link_body448D24D90367 "ModelElement::_linkStereotype"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 338613A4007B _unlink_body448D24D90367
	// "ModelElement::_unlinkStereotype"
	public void _unlinkStereotype(Stereotype stereotype1) {
		stereotype.remove(stereotype1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkStereotype"));
		return;
	}
	// -end- 338613A4007B _unlink_body448D24D90367
	// "ModelElement::_unlinkStereotype"

	// -beg- preserve=no 39B9B0F703C8 code448D24D90367 "referenceTag"
	private Set<TaggedValue> referenceTag = new HashSet<TaggedValue>();
	// -end- 39B9B0F703C8 code448D24D90367 "referenceTag"

	/**
	 * add a ReferenceTag.
	 *
	 * @see #removeReferenceTag
	 * @see #containsReferenceTag
	 * @see #iteratorReferenceTag
	 * @see #clearReferenceTag
	 * @see #sizeReferenceTag
	 */
	// -beg- preserve=no 39B9B0F703C8 add_head448D24D90367
	// "ModelElement::addReferenceTag"
	public void addReferenceTag(TaggedValue referenceTag1)
	// -end- 39B9B0F703C8 add_head448D24D90367 "ModelElement::addReferenceTag"
	{
		// -beg- preserve=no 39B9B0F703C8 add_body448D24D90367
		// "ModelElement::addReferenceTag"
		referenceTag.add(referenceTag1);
		referenceTag1._linkReferenceValue(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addReferenceTag"));
		return;
		// -end- 39B9B0F703C8 add_body448D24D90367
		// "ModelElement::addReferenceTag"
	}

	/**
	 * disconnect a ReferenceTag.
	 * 
	 * @see #addReferenceTag
	 */
	// -beg- preserve=no 39B9B0F703C8 remove_head448D24D90367
	// "ModelElement::removeReferenceTag"
	public TaggedValue removeReferenceTag(TaggedValue referenceTag1)
	// -end- 39B9B0F703C8 remove_head448D24D90367
	// "ModelElement::removeReferenceTag"
	{
		// -beg- preserve=no 39B9B0F703C8 remove_body448D24D90367
		// "ModelElement::removeReferenceTag"
		TaggedValue ret = null;
		if (referenceTag1 == null || !referenceTag.contains(referenceTag1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = referenceTag1;
		referenceTag.remove(referenceTag1);
		referenceTag1._unlinkReferenceValue(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeReferenceTag"));
		return ret;
		// -end- 39B9B0F703C8 remove_body448D24D90367
		// "ModelElement::removeReferenceTag"
	}

	/**
	 * tests if a given ReferenceTag is connected.
	 * 
	 * @see #addReferenceTag
	 */
	// -beg- preserve=no 39B9B0F703C8 test_head448D24D90367
	// "ModelElement::containsReferenceTag"
	public boolean containsReferenceTag(TaggedValue referenceTag1)
	// -end- 39B9B0F703C8 test_head448D24D90367
	// "ModelElement::containsReferenceTag"
	{
		// -beg- preserve=no 39B9B0F703C8 test_body448D24D90367
		// "ModelElement::containsReferenceTag"
		return referenceTag.contains(referenceTag1);
		// -end- 39B9B0F703C8 test_body448D24D90367
		// "ModelElement::containsReferenceTag"
	}

	/**
	 * used to enumerate all connected ReferenceTags.
	 * 
	 * @see #addReferenceTag
	 */
	// -beg- preserve=no 39B9B0F703C8 get_all_head448D24D90367
	// "ModelElement::iteratorReferenceTag"
	public Iterator<TaggedValue> iteratorReferenceTag()
	// -end- 39B9B0F703C8 get_all_head448D24D90367
	// "ModelElement::iteratorReferenceTag"
	{
		// -beg- preserve=no 39B9B0F703C8 get_all_body448D24D90367
		// "ModelElement::iteratorReferenceTag"
		return referenceTag.iterator();
		// -end- 39B9B0F703C8 get_all_body448D24D90367
		// "ModelElement::iteratorReferenceTag"
	}

	/**
	 * disconnect all ReferenceTags.
	 * 
	 * @see #addReferenceTag
	 */
	// -beg- preserve=no 39B9B0F703C8 remove_all_head448D24D90367
	// "ModelElement::clearReferenceTag"
	public void clearReferenceTag()
	// -end- 39B9B0F703C8 remove_all_head448D24D90367
	// "ModelElement::clearReferenceTag"
	{
		// -beg- preserve=no 39B9B0F703C8 remove_all_body448D24D90367
		// "ModelElement::clearReferenceTag"
		if (sizeReferenceTag() > 0) {
			for (Iterator<TaggedValue> p = referenceTag.iterator(); p.hasNext();) {
				((TaggedValue) p.next())._unlinkReferenceValue(this);
			}
			referenceTag.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearReferenceTag"));
		}
		// -end- 39B9B0F703C8 remove_all_body448D24D90367
		// "ModelElement::clearReferenceTag"
	}

	/**
	 * returns the number of ReferenceTags.
	 * 
	 * @see #addReferenceTag
	 */
	// -beg- preserve=no 39B9B0F703C8 size_head448D24D90367
	// "ModelElement::sizeReferenceTag"
	public int sizeReferenceTag()
	// -end- 39B9B0F703C8 size_head448D24D90367 "ModelElement::sizeReferenceTag"
	{
		// -beg- preserve=no 39B9B0F703C8 size_body448D24D90367
		// "ModelElement::sizeReferenceTag"
		return referenceTag.size();
		// -end- 39B9B0F703C8 size_body448D24D90367
		// "ModelElement::sizeReferenceTag"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 39B9B0F703C8 _link_body448D24D90367
	// "ModelElement::_linkReferenceTag"
	public void _linkReferenceTag(TaggedValue referenceTag1) {
		referenceTag.add(referenceTag1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkReferenceTag"));
		return;
	}
	// -end- 39B9B0F703C8 _link_body448D24D90367
	// "ModelElement::_linkReferenceTag"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 39B9B0F703C8 _unlink_body448D24D90367
	// "ModelElement::_unlinkReferenceTag"
	public void _unlinkReferenceTag(TaggedValue referenceTag1) {
		referenceTag.remove(referenceTag1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkReferenceTag"));
		return;
	}
	// -end- 39B9B0F703C8 _unlink_body448D24D90367
	// "ModelElement::_unlinkReferenceTag"

	// -beg- preserve=no 33CD739B0316 code448D24D90367 "importedBy"
	private Set<ElementImport> importedBy = new HashSet<ElementImport>();
	// -end- 33CD739B0316 code448D24D90367 "importedBy"

	/**
	 * add a ImportedBy.
	 *
	 * @see #removeImportedBy
	 * @see #containsImportedBy
	 * @see #iteratorImportedBy
	 * @see #clearImportedBy
	 * @see #sizeImportedBy
	 * @see #iteratorImportedByLink
	 * @see #createImportedByLink
	 * @see #findImportedByLink
	 */
	// -beg- preserve=no 33CD739B0316 add_head448D24D90367
	// "ModelElement::addImportedBy"
	public void addImportedBy(Package importedBy1)
	// -end- 33CD739B0316 add_head448D24D90367 "ModelElement::addImportedBy"
	{
		// -beg- preserve=no 33CD739B0316 add_body448D24D90367
		// "ModelElement::addImportedBy"
		ElementImport linkobj = createImportedByLink();
		linkobj.setImportedBy(importedBy1);
		linkobj.setImportedElement(this);
		importedBy.add(linkobj);
		importedBy1._linkImportedElement(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addImportedBy"));
		return;
		// -end- 33CD739B0316 add_body448D24D90367 "ModelElement::addImportedBy"
	}

	/**
	 * add a link to a ImportedBy.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 addlink_head448D24D90367
	// "ModelElement::addImportedByLink"
	public void addImportedByLink(ElementImport importedBy1)
	// -end- 33CD739B0316 addlink_head448D24D90367
	// "ModelElement::addImportedByLink"
	{
		// -beg- preserve=no 33CD739B0316 addlink_body448D24D90367
		// "ModelElement::addImportedByLink"
		importedBy1.setImportedElement(this);
		importedBy.add(importedBy1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addImportedByLink"));
		return;
		// -end- 33CD739B0316 addlink_body448D24D90367
		// "ModelElement::addImportedByLink"
	}

	/**
	 * disconnect a ImportedBy.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 remove_head448D24D90367
	// "ModelElement::removeImportedBy"
	public Package removeImportedBy(Package importedBy1)
	// -end- 33CD739B0316 remove_head448D24D90367
	// "ModelElement::removeImportedBy"
	{
		// -beg- preserve=no 33CD739B0316 remove_body448D24D90367
		// "ModelElement::removeImportedBy"
		Package ret = null;
		ElementImport linkobj = findImportedByLink(importedBy1);
		if (importedBy1 == null || linkobj == null) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = linkobj.getImportedBy();
		importedBy.remove(linkobj);
		ret._unlinkImportedElement(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeImportedBy"));
		return ret;
		// -end- 33CD739B0316 remove_body448D24D90367
		// "ModelElement::removeImportedBy"
	}

	/**
	 * tests if a given ImportedBy is connected.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 test_head448D24D90367
	// "ModelElement::containsImportedBy"
	public boolean containsImportedBy(Package importedBy1)
	// -end- 33CD739B0316 test_head448D24D90367
	// "ModelElement::containsImportedBy"
	{
		// -beg- preserve=no 33CD739B0316 test_body448D24D90367
		// "ModelElement::containsImportedBy"
		return importedBy.contains(findImportedByLink(importedBy1));
		// -end- 33CD739B0316 test_body448D24D90367
		// "ModelElement::containsImportedBy"
	}

	/**
	 * used to enumerate all connected ImportedBys.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 get_all_head448D24D90367
	// "ModelElement::iteratorImportedBy"
	public Iterator<?> iteratorImportedBy()
	// -end- 33CD739B0316 get_all_head448D24D90367
	// "ModelElement::iteratorImportedBy"
	{
		// -beg- preserve=no 33CD739B0316 get_all_body448D24D90367
		// "ModelElement::iteratorImportedBy"
		return new Iterator<Object>() {
			private Iterator<ElementImport> i = importedBy.iterator();

			public boolean hasNext() {
				return i.hasNext();
			}

			public Object next() {
				ElementImport next = (ElementImport) i.next();
				return next.getImportedBy();
			}

			public void remove() {
				i.remove();
			}
		};
		// -end- 33CD739B0316 get_all_body448D24D90367
		// "ModelElement::iteratorImportedBy"
	}

	/**
	 * disconnect all ImportedBys.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 remove_all_head448D24D90367
	// "ModelElement::clearImportedBy"
	public void clearImportedBy()
	// -end- 33CD739B0316 remove_all_head448D24D90367
	// "ModelElement::clearImportedBy"
	{
		// -beg- preserve=no 33CD739B0316 remove_all_body448D24D90367
		// "ModelElement::clearImportedBy"
		if (sizeImportedBy() > 0) {
			for (Iterator<ElementImport> p = importedBy.iterator(); p.hasNext();) {
				ElementImport linkobj = (ElementImport) p.next();
				linkobj.getImportedBy()._unlinkImportedElement(linkobj);
			}
			importedBy.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearImportedBy"));
		}
		// -end- 33CD739B0316 remove_all_body448D24D90367
		// "ModelElement::clearImportedBy"
	}

	/**
	 * returns the number of ImportedBys.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 size_head448D24D90367
	// "ModelElement::sizeImportedBy"
	public int sizeImportedBy()
	// -end- 33CD739B0316 size_head448D24D90367 "ModelElement::sizeImportedBy"
	{
		// -beg- preserve=no 33CD739B0316 size_body448D24D90367
		// "ModelElement::sizeImportedBy"
		return importedBy.size();
		// -end- 33CD739B0316 size_body448D24D90367
		// "ModelElement::sizeImportedBy"
	}

	/**
	 * enumerate the link objects of currently connected ImportedBy.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 itlink_head448D24D90367
	// "ModelElement::getImportedByLink"
	public Iterator<?> iteratorImportedByLink()
	// -end- 33CD739B0316 itlink_head448D24D90367
	// "ModelElement::getImportedByLink"
	{
		// -beg- preserve=no 33CD739B0316 itlink_body448D24D90367
		// "ModelElement::getImportedByLink"
		return importedBy.iterator();
		// -end- 33CD739B0316 itlink_body448D24D90367
		// "ModelElement::getImportedByLink"
	}

	/**
	 * create a link class for a new link to a ImportedBy.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 createlink_head448D24D90367
	// "ModelElement::createImportedByLink"
	public ElementImport createImportedByLink()
	// -end- 33CD739B0316 createlink_head448D24D90367
	// "ModelElement::createImportedByLink"
	{
		// -beg- preserve=no 33CD739B0316 createlink_body448D24D90367
		// "ModelElement::createImportedByLink"
		// return new ElementImport();
		throw new java.lang.UnsupportedOperationException();
		// -end- 33CD739B0316 createlink_body448D24D90367
		// "ModelElement::createImportedByLink"
	}

	/**
	 * find a link object for a given ImportedBy.
	 * 
	 * @see #addImportedBy
	 */
	// -beg- preserve=no 33CD739B0316 find_head448D24D90367
	// "ModelElement::findImportedByLink"
	public ElementImport findImportedByLink(Package importedBy1)
	// -end- 33CD739B0316 find_head448D24D90367
	// "ModelElement::findImportedByLink"
	{
		// -beg- preserve=no 33CD739B0316 find_body448D24D90367
		// "ModelElement::findImportedByLink"
		if (importedBy1 == null)
			return null;
		for (Iterator<?> p = importedBy.iterator(); p.hasNext();) {
			ElementImport linkobj = (ElementImport) p.next();
			if (linkobj.getImportedBy() == importedBy1)
				return linkobj;
		}
		return null;
		// -end- 33CD739B0316 find_body448D24D90367
		// "ModelElement::findImportedByLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD739B0316 _link_body448D24D90367
	// "ModelElement::_linkImportedBy"
	public void _linkImportedBy(ElementImport importedBy1) {
		importedBy.add(importedBy1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkImportedBy"));
		return;
	}
	// -end- 33CD739B0316 _link_body448D24D90367 "ModelElement::_linkImportedBy"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD739B0316 _unlink_body448D24D90367
	// "ModelElement::_unlinkImportedBy"
	public void _unlinkImportedBy(ElementImport importedBy1) {
		importedBy.remove(importedBy1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkImportedBy"));
		return;
	}
	// -end- 33CD739B0316 _unlink_body448D24D90367
	// "ModelElement::_unlinkImportedBy"

	// -beg- preserve=no 335D4BA70064 var448D24D90367 "name"
	private NlsString name = null;
	// -end- 335D4BA70064 var448D24D90367 "name"

	/**
	 * get current value of name
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 335D4BA70064 get_head448D24D90367 "name"
	public NlsString getName()
	// -end- 335D4BA70064 get_head448D24D90367 "name"
	{
		// -beg- preserve=no 335D4BA70064 get_body448D24D90367 "name"
		return name;
		// -end- 335D4BA70064 get_body448D24D90367 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 335D4BA70064 set_head448D24D90367 "name"
	public void setName(NlsString value1)
	// -end- 335D4BA70064 set_head448D24D90367 "name"
	{
		// -beg- preserve=no 335D4BA70064 set_body448D24D90367 "name"
		if (name != value1 && (name == null || !name.equals(value1))) {
			name = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setName"));
		}
		// -end- 335D4BA70064 set_body448D24D90367 "name"
	}

	// -beg- preserve=no 3C1DF92B0234 var448D24D90367 "documentation"
	private NlsString documentation = null;
	// -end- 3C1DF92B0234 var448D24D90367 "documentation"

	/**
	 * get current value of documentation
	 * 
	 * @see #setDocumentation
	 */
	// -beg- preserve=no 3C1DF92B0234 get_head448D24D90367 "documentation"
	public NlsString getDocumentation()
	// -end- 3C1DF92B0234 get_head448D24D90367 "documentation"
	{
		// -beg- preserve=no 3C1DF92B0234 get_body448D24D90367 "documentation"
		return documentation;
		// -end- 3C1DF92B0234 get_body448D24D90367 "documentation"
	}

	/**
	 * set current value of documentation
	 * 
	 * @see #getDocumentation
	 */
	// -beg- preserve=no 3C1DF92B0234 set_head448D24D90367 "documentation"
	public void setDocumentation(NlsString value1)
	// -end- 3C1DF92B0234 set_head448D24D90367 "documentation"
	{
		// -beg- preserve=no 3C1DF92B0234 set_body448D24D90367 "documentation"
		if (documentation != value1 && (documentation == null || !documentation.equals(value1))) {
			documentation = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setDocumentation"));
		}
		// -end- 3C1DF92B0234 set_body448D24D90367 "documentation"
	}

	private NlsString metaAttrb = null;

	/**
 	 * get current value of meta attribute
 	 * 
 	 * @see #setMetaAttrb
 	 */
 	public NlsString getMetaAttrb() {		
 		return metaAttrb;
 	}
 	
 	/**
 	 * set current value of meta attribute
 	 * 
 	 * @see #getMetaAttrb
 	 */
 	public void setMetaAttrb(NlsString value1) {
 		if (metaAttrb != value1 && (metaAttrb == null || !metaAttrb.equals(value1))) {
 			metaAttrb = value1;
 			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
 					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaAttrb"));
 		}
 	}
 	
 	private NlsString metaMapping = null;

	/**
 	 * get current value of meta mapping
 	 * 
 	 * @see #setMetaMapping
 	 */
 	public NlsString getMetaMapping() {		
 		return metaMapping;
 	}
 	
 	/**
 	 * set current value of meta attribute
 	 * 
 	 * @see #getMetaMapping
 	 */
 	public void setMetaMapping(NlsString value1) {
 		if (metaMapping != value1 && (metaMapping == null || !metaMapping.equals(value1))) {
 			metaMapping = value1;
 			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
 					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaMapping"));
 		}
 	}
 
 	private NlsString metaName = null;
 	
 	/**
 	 * get current value of meta name
 	 * 
 	 * @see #setMetaName
 	 */
 	public NlsString getMetaName() {
 		return metaName;
 	}
 	
 	/**
 	 * set current value of meta name
 	 * 
 	 * @see #getMetaName
 	 */
 	public void setMetaName(NlsString value) {
 		if (metaName != value && (metaName == null || !metaName.equals(value))) {
 			metaName = value;
 			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
 					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaName"));
 		}
 	}
 
 	private NlsString metaMsg = null;
 	
 	/**
 	 * get current value of meta message
 	 * 
 	 * @see #setMetaMsg
 	 */
 	public NlsString getMetaMsg() {
  		// TODO Auto-generated method stub		  		// TODO Auto-generated method stub
 		return metaMsg;
 	}
  		  
 	/**
 	 * set current value of meta message
 	 * 
 	 * @see #getMetaMsg
 	 */
 	public void setMetaMsg(NlsString value) {
 		// TODO Auto-generated method stub
 		if (metaMsg != value && (metaMsg == null || !metaMsg.equals(value))) {
 			metaMsg = value;
 			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
 					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaMsg"));
 		}
 	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448D24D90367 detail_end "UmlStereotype"

	// -end- 448D24D90367 detail_end "UmlStereotype"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
