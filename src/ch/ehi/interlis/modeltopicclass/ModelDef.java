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
// -beg- preserve=no 358A5DB202C5 package "ModelDef"
package ch.ehi.interlis.modeltopicclass;
// -end- 358A5DB202C5 package "ModelDef"

<<<<<<< HEAD
// -beg- preserve=no 358A5DB202C5 autoimport "ModelDef"
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.interlis.DefinitionProxy;
import ch.ehi.uml1_4.implementation.AbstractNamespace;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.interlis.modeltopicclass.Contract;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.interlis.modeltopicclass.Translation;
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.modeltopicclass.ModelDefKind;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
// -end- 358A5DB202C5 autoimport "ModelDef"
=======
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.DefinitionProxy;
import ch.ehi.uml1_4.foundation.core.Class;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.uml1_4.implementation.AbstractNamespace;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
// -beg- preserve=no 358A5DB202C5 autoimport "ModelDef"
import ch.ehi.uml1_4.modelmanagement.Package;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5DB202C5 import "ModelDef"

// -end- 358A5DB202C5 import "ModelDef"

<<<<<<< HEAD
/** Definiert ein Modell.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2006-06-13 14:22:01 $
 */
public class ModelDef extends AbstractNamespace implements Package , DefinitionProxy , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 358A5DB202C5 detail_begin "ModelDef"

  // -end- 358A5DB202C5 detail_begin "ModelDef"

  /** return the list of valid owned elements for this namespace.
   */
  // -beg- preserve=no 3CE4FBC60306 head358A5DB202C5 "getValidOwnedElements"
  public String[] getValidOwnedElements()
  // -end- 3CE4FBC60306 head358A5DB202C5 "getValidOwnedElements"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE4FBC60306 throws358A5DB202C5 "getValidOwnedElements"

    // -end- 3CE4FBC60306 throws358A5DB202C5 "getValidOwnedElements"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CE4FBC60306 body358A5DB202C5 "getValidOwnedElements"
    String ret[]={
      "ch.ehi.interlis.metaobjects.MetaDataUseDef"
      ,"ch.ehi.interlis.units.UnitDef"
      ,"ch.ehi.interlis.functions.FunctionDef"
      ,"ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef"
      ,"ch.ehi.interlis.domainsandconstants.DomainDef"
      ,"ch.ehi.interlis.modeltopicclass.ClassDef"
      ,"ch.ehi.interlis.graphicdescriptions.GraphicParameterDef"
      ,"ch.ehi.interlis.modeltopicclass.TopicDef"
      ,"ch.ehi.uml1_4.implementation.UmlPackage"
      };
    return ret;
    // -end- 3CE4FBC60306 body358A5DB202C5 "getValidOwnedElements"
    }

  // -beg- preserve=no 3CFE209C0280 head358A5DB202C5 "getValidSecondLanguages"
  public java.util.Set getValidSecondLanguages()
  // -end- 3CFE209C0280 head358A5DB202C5 "getValidSecondLanguages"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CFE209C0280 throws358A5DB202C5 "getValidSecondLanguages"

    // -end- 3CFE209C0280 throws358A5DB202C5 "getValidSecondLanguages"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE209C0280 body358A5DB202C5 "getValidSecondLanguages"
    java.util.HashSet ret=new java.util.HashSet();
    java.util.Iterator langi=iteratorTranslation();
    while(langi.hasNext()){
      Translation lang=(Translation)langi.next();
      ret.add(lang.getLanguage());
    }
    return ret;
    // -end- 3CFE209C0280 body358A5DB202C5 "getValidSecondLanguages"
    }

  // -beg- preserve=no 3D4FA219021C head358A5DB202C5 "unlinkAll"
  public void unlinkAll()
  // -end- 3D4FA219021C head358A5DB202C5 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA219021C throws358A5DB202C5 "unlinkAll"

    // -end- 3D4FA219021C throws358A5DB202C5 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA219021C body358A5DB202C5 "unlinkAll"
    
    detachNamespace();
    clearContract();
    clearClientDependency();
    clearOwnedElement();
    clearSupplierDependency();
    clearTranslation();
    setName(null);
    setIssuerURI(null);
    setVersion(null);
    setVersionComment(null);
    clearImportedElement();
    clearPresentation();
    clearGeneralization();
    clearSpecialization();
    clearDiagram();
    clearBehavior();
    clearPartition();
    clearCollaboration();
    clearClassifierRole();
    clearCollaborationInstanceSet();
    clearTaggedValue();
    clearConstraint();
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
    setDocumentation(null);
    super.unlinkAll();
    // -end- 3D4FA219021C body358A5DB202C5 "unlinkAll"
    }

  // -beg- preserve=no 3D4FA2190244 head358A5DB202C5 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 3D4FA2190244 head358A5DB202C5 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2190244 throws358A5DB202C5 "enumerateChildren"

    // -end- 3D4FA2190244 throws358A5DB202C5 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2190244 body358A5DB202C5 "enumerateChildren"
    java.util.Iterator it=null;
    it=iteratorContract();while(it.hasNext())visitor.visit(it.next());
    it=iteratorOwnedElement();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTranslation();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getIssuerURI());
    visitor.visit(getVersion());
    visitor.visit(getVersionComment());
    it=iteratorImportedElement();while(it.hasNext())visitor.visit(it.next());
    it=iteratorDiagram();while(it.hasNext())visitor.visit(it.next());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getDocumentation());
    super.enumerateChildren(visitor);
    // -end- 3D4FA2190244 body358A5DB202C5 "enumerateChildren"
    }

  // -beg- preserve=no 33598CAA030E code358A5DB202C5 "namespace"

  // -end- 33598CAA030E code358A5DB202C5 "namespace"

  /** attaches a Namespace.
   *  Designates the Namespace that contains the ModelElement.
   *  @see #detachNamespace
   *  @see #getNamespace
   *  @see #containsNamespace
   *  @see #getNamespaceLink
   *  @see #createNamespaceLink
   */
  // -beg- preserve=no 33598CAA030E attach_head358A5DB202C5 "ModelElement::attachNamespace"
  public void attachNamespace(Namespace namespace1)
  // -end- 33598CAA030E attach_head358A5DB202C5 "ModelElement::attachNamespace"
  {
    // -beg- preserve=no 33598CAA030E attach_body358A5DB202C5 "ModelElement::attachNamespace"
    super.attachNamespace(namespace1);
    // -end- 33598CAA030E attach_body358A5DB202C5 "ModelElement::attachNamespace"
  }

  /** attaches a link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E attachlink_head358A5DB202C5 "ModelElement::attachNamespaceLink"
  public void attachNamespaceLink(ElementOwnership namespace1)
  // -end- 33598CAA030E attachlink_head358A5DB202C5 "ModelElement::attachNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E attachlink_body358A5DB202C5 "ModelElement::attachNamespaceLink"
    super.attachNamespaceLink(namespace1);
    // -end- 33598CAA030E attachlink_body358A5DB202C5 "ModelElement::attachNamespaceLink"
  }

  /** disconnect the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E detach_head358A5DB202C5 "ModelElement::detachNamespace"
  public Namespace detachNamespace()
  // -end- 33598CAA030E detach_head358A5DB202C5 "ModelElement::detachNamespace"
  {
    // -beg- preserve=no 33598CAA030E detach_body358A5DB202C5 "ModelElement::detachNamespace"
    return super.detachNamespace();
    // -end- 33598CAA030E detach_body358A5DB202C5 "ModelElement::detachNamespace"
  }

  /** get the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E get_head358A5DB202C5 "ModelElement::getNamespace"
  public Namespace getNamespace()
  // -end- 33598CAA030E get_head358A5DB202C5 "ModelElement::getNamespace"
  {
    // -beg- preserve=no 33598CAA030E get_body358A5DB202C5 "ModelElement::getNamespace"
    return super.getNamespace();
    // -end- 33598CAA030E get_body358A5DB202C5 "ModelElement::getNamespace"
  }

  /** get the link class of currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E getlink_head358A5DB202C5 "ModelElement::getNamespaceLink"
  public ElementOwnership getNamespaceLink()
  // -end- 33598CAA030E getlink_head358A5DB202C5 "ModelElement::getNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E getlink_body358A5DB202C5 "ModelElement::getNamespaceLink"
    return super.getNamespaceLink();
    // -end- 33598CAA030E getlink_body358A5DB202C5 "ModelElement::getNamespaceLink"
  }

  /** create a link class for a new link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E createlink_head358A5DB202C5 "ModelElement::createNamespaceLink"
  public ElementOwnership createNamespaceLink()
  // -end- 33598CAA030E createlink_head358A5DB202C5 "ModelElement::createNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E createlink_body358A5DB202C5 "ModelElement::createNamespaceLink"
    return super.createNamespaceLink();
    // -end- 33598CAA030E createlink_body358A5DB202C5 "ModelElement::createNamespaceLink"
  }

  /** tests if there is a Namespace attached.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E test_head358A5DB202C5 "ModelElement::containsNamespace"
  public boolean containsNamespace()
  // -end- 33598CAA030E test_head358A5DB202C5 "ModelElement::containsNamespace"
  {
    // -beg- preserve=no 33598CAA030E test_body358A5DB202C5 "ModelElement::containsNamespace"
    return super.containsNamespace();
    // -end- 33598CAA030E test_body358A5DB202C5 "ModelElement::containsNamespace"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _link_body358A5DB202C5 "ModelElement::_linkNamespace"
  public void _linkNamespace(ElementOwnership namespace1)
  {
    super._linkNamespace(namespace1);
  }
  // -end- 33598CAA030E _link_body358A5DB202C5 "ModelElement::_linkNamespace"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _unlink_body358A5DB202C5 "ModelElement::_unlinkNamespace"
  public void _unlinkNamespace(ElementOwnership namespace1)
  {
    super._unlinkNamespace(namespace1);
  }
  // -end- 33598CAA030E _unlink_body358A5DB202C5 "ModelElement::_unlinkNamespace"

  // -beg- preserve=no 3940AD300137 code358A5DB202C5 "contract"
  private java.util.Set contract = new java.util.HashSet();
  // -end- 3940AD300137 code358A5DB202C5 "contract"

  /** add a Contract.
   *  
   *  @see #removeContract
   *  @see #containsContract
   *  @see #iteratorContract
   *  @see #clearContract
   *  @see #sizeContract
   */
  // -beg- preserve=no 3940AD300137 add_head358A5DB202C5 "ModelDef::addContract"
  public void addContract(Contract contract1)
  // -end- 3940AD300137 add_head358A5DB202C5 "ModelDef::addContract"
  {
    // -beg- preserve=no 3940AD300137 add_body358A5DB202C5 "ModelDef::addContract"
    contract.add(contract1);
    contract1._linkModelDef(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContract"));
    return;
    // -end- 3940AD300137 add_body358A5DB202C5 "ModelDef::addContract"
  }

  /** disconnect a Contract.
   *  @see #addContract
   */
  // -beg- preserve=no 3940AD300137 remove_head358A5DB202C5 "ModelDef::removeContract"
  public Contract removeContract(Contract contract1)
  // -end- 3940AD300137 remove_head358A5DB202C5 "ModelDef::removeContract"
  {
    // -beg- preserve=no 3940AD300137 remove_body358A5DB202C5 "ModelDef::removeContract"
    Contract ret=null;
    if(contract1==null || !contract.contains(contract1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = contract1;
    contract.remove(contract1);
    contract1._unlinkModelDef(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeContract"));
    return ret;
    // -end- 3940AD300137 remove_body358A5DB202C5 "ModelDef::removeContract"
  }

  /** tests if a given Contract is connected.
   *  @see #addContract
   */
  // -beg- preserve=no 3940AD300137 test_head358A5DB202C5 "ModelDef::containsContract"
  public boolean containsContract(Contract contract1)
  // -end- 3940AD300137 test_head358A5DB202C5 "ModelDef::containsContract"
  {
    // -beg- preserve=no 3940AD300137 test_body358A5DB202C5 "ModelDef::containsContract"
    return contract.contains(contract1);
    // -end- 3940AD300137 test_body358A5DB202C5 "ModelDef::containsContract"
  }

  /** used to enumerate all connected Contracts.
   *  @see #addContract
   */
  // -beg- preserve=no 3940AD300137 get_all_head358A5DB202C5 "ModelDef::iteratorContract"
  public java.util.Iterator iteratorContract()
  // -end- 3940AD300137 get_all_head358A5DB202C5 "ModelDef::iteratorContract"
  {
    // -beg- preserve=no 3940AD300137 get_all_body358A5DB202C5 "ModelDef::iteratorContract"
    return contract.iterator();
    // -end- 3940AD300137 get_all_body358A5DB202C5 "ModelDef::iteratorContract"
  }

  /** disconnect all Contracts.
   *  @see #addContract
   */
  // -beg- preserve=no 3940AD300137 remove_all_head358A5DB202C5 "ModelDef::clearContract"
  public void clearContract()
  // -end- 3940AD300137 remove_all_head358A5DB202C5 "ModelDef::clearContract"
  {
    // -beg- preserve=no 3940AD300137 remove_all_body358A5DB202C5 "ModelDef::clearContract"
    if(sizeContract()>0){
      for(java.util.Iterator p = contract.iterator(); p.hasNext();){
        ((Contract)p.next())._unlinkModelDef(this);
      }
      contract.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearContract"));
    }
    // -end- 3940AD300137 remove_all_body358A5DB202C5 "ModelDef::clearContract"
  }

  /** returns the number of Contracts.
   *  @see #addContract
   */
  // -beg- preserve=no 3940AD300137 size_head358A5DB202C5 "ModelDef::sizeContract"
  public int sizeContract()
  // -end- 3940AD300137 size_head358A5DB202C5 "ModelDef::sizeContract"
  {
    // -beg- preserve=no 3940AD300137 size_body358A5DB202C5 "ModelDef::sizeContract"
    return contract.size();
    // -end- 3940AD300137 size_body358A5DB202C5 "ModelDef::sizeContract"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3940AD300137 _link_body358A5DB202C5 "ModelDef::_linkContract"
  public void _linkContract(Contract contract1)
  {
    contract.add(contract1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkContract"));
    return;
  }
  // -end- 3940AD300137 _link_body358A5DB202C5 "ModelDef::_linkContract"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3940AD300137 _unlink_body358A5DB202C5 "ModelDef::_unlinkContract"
  public void _unlinkContract(Contract contract1)
  {
    contract.remove(contract1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkContract"));
    return;
  }
  // -end- 3940AD300137 _unlink_body358A5DB202C5 "ModelDef::_unlinkContract"

  // -beg- preserve=no 33FFE57B0395 code358A5DB202C5 "clientDependency"

  // -end- 33FFE57B0395 code358A5DB202C5 "clientDependency"

  /** add a ClientDependency.
   *  
   *  @see #removeClientDependency
   *  @see #containsClientDependency
   *  @see #iteratorClientDependency
   *  @see #clearClientDependency
   *  @see #sizeClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 add_head358A5DB202C5 "ModelElement::addClientDependency"
  public void addClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 add_head358A5DB202C5 "ModelElement::addClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 add_body358A5DB202C5 "ModelElement::addClientDependency"
    super.addClientDependency(clientDependency1);
    // -end- 33FFE57B0395 add_body358A5DB202C5 "ModelElement::addClientDependency"
  }

  /** disconnect a ClientDependency.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_head358A5DB202C5 "ModelElement::removeClientDependency"
  public Dependency removeClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 remove_head358A5DB202C5 "ModelElement::removeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_body358A5DB202C5 "ModelElement::removeClientDependency"
    return super.removeClientDependency(clientDependency1);
    // -end- 33FFE57B0395 remove_body358A5DB202C5 "ModelElement::removeClientDependency"
  }

  /** tests if a given ClientDependency is connected.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 test_head358A5DB202C5 "ModelElement::containsClientDependency"
  public boolean containsClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 test_head358A5DB202C5 "ModelElement::containsClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 test_body358A5DB202C5 "ModelElement::containsClientDependency"
    return super.containsClientDependency(clientDependency1);
    // -end- 33FFE57B0395 test_body358A5DB202C5 "ModelElement::containsClientDependency"
  }

  /** used to enumerate all connected ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 get_all_head358A5DB202C5 "ModelElement::iteratorClientDependency"
  public java.util.Iterator iteratorClientDependency()
  // -end- 33FFE57B0395 get_all_head358A5DB202C5 "ModelElement::iteratorClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 get_all_body358A5DB202C5 "ModelElement::iteratorClientDependency"
    return super.iteratorClientDependency();
    // -end- 33FFE57B0395 get_all_body358A5DB202C5 "ModelElement::iteratorClientDependency"
  }

  /** disconnect all ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_all_head358A5DB202C5 "ModelElement::clearClientDependency"
  public void clearClientDependency()
  // -end- 33FFE57B0395 remove_all_head358A5DB202C5 "ModelElement::clearClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_all_body358A5DB202C5 "ModelElement::clearClientDependency"
    super.clearClientDependency();
    // -end- 33FFE57B0395 remove_all_body358A5DB202C5 "ModelElement::clearClientDependency"
  }

  /** returns the number of ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 size_head358A5DB202C5 "ModelElement::sizeClientDependency"
  public int sizeClientDependency()
  // -end- 33FFE57B0395 size_head358A5DB202C5 "ModelElement::sizeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 size_body358A5DB202C5 "ModelElement::sizeClientDependency"
    return super.sizeClientDependency();
    // -end- 33FFE57B0395 size_body358A5DB202C5 "ModelElement::sizeClientDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _link_body358A5DB202C5 "ModelElement::_linkClientDependency"
  public void _linkClientDependency(Dependency clientDependency1)
  {
    super._linkClientDependency(clientDependency1);
  }
  // -end- 33FFE57B0395 _link_body358A5DB202C5 "ModelElement::_linkClientDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _unlink_body358A5DB202C5 "ModelElement::_unlinkClientDependency"
  public void _unlinkClientDependency(Dependency clientDependency1)
  {
    super._unlinkClientDependency(clientDependency1);
  }
  // -end- 33FFE57B0395 _unlink_body358A5DB202C5 "ModelElement::_unlinkClientDependency"

  // -beg- preserve=no 33598CAA030D code358A5DB202C5 "ownedElement"

  // -end- 33598CAA030D code358A5DB202C5 "ownedElement"

  /** add a OwnedElement.
   *  A set of ModelElementsowned by the Namespace.
   *  @see #removeOwnedElement
   *  @see #containsOwnedElement
   *  @see #iteratorOwnedElement
   *  @see #clearOwnedElement
   *  @see #sizeOwnedElement
   *  @see #iteratorOwnedElementLink
   *  @see #createOwnedElementLink
   *  @see #findOwnedElementLink
   */
  // -beg- preserve=no 33598CAA030D add_head358A5DB202C5 "Namespace::addOwnedElement"
  public void addOwnedElement(ModelElement ownedElement1)
  // -end- 33598CAA030D add_head358A5DB202C5 "Namespace::addOwnedElement"
  {
    // -beg- preserve=no 33598CAA030D add_body358A5DB202C5 "Namespace::addOwnedElement"
    super.addOwnedElement(ownedElement1);
    // -end- 33598CAA030D add_body358A5DB202C5 "Namespace::addOwnedElement"
  }

  // -beg- preserve=no 33598CAA030D add2_head358A5DB202C5 "Namespace::add2OwnedElement"
  public void addOwnedElement(int index,ModelElement ownedElement1)
  // -end- 33598CAA030D add2_head358A5DB202C5 "Namespace::add2OwnedElement"
  {
    // -beg- preserve=no 33598CAA030D add2_body358A5DB202C5 "Namespace::add2OwnedElement"
    super.addOwnedElement(index,ownedElement1);
    // -end- 33598CAA030D add2_body358A5DB202C5 "Namespace::add2OwnedElement"
  }

  /** add a link to a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D addlink_head358A5DB202C5 "Namespace::addOwnedElementLink"
  public void addOwnedElementLink(ElementOwnership ownedElement1)
  // -end- 33598CAA030D addlink_head358A5DB202C5 "Namespace::addOwnedElementLink"
  {
    // -beg- preserve=no 33598CAA030D addlink_body358A5DB202C5 "Namespace::addOwnedElementLink"
    super.addOwnedElementLink(ownedElement1);
    // -end- 33598CAA030D addlink_body358A5DB202C5 "Namespace::addOwnedElementLink"
  }

  /** disconnect a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D remove_head358A5DB202C5 "Namespace::removeOwnedElement"
  public ModelElement removeOwnedElement(ModelElement ownedElement1)
  // -end- 33598CAA030D remove_head358A5DB202C5 "Namespace::removeOwnedElement"
  {
    // -beg- preserve=no 33598CAA030D remove_body358A5DB202C5 "Namespace::removeOwnedElement"
    return super.removeOwnedElement(ownedElement1);
    // -end- 33598CAA030D remove_body358A5DB202C5 "Namespace::removeOwnedElement"
  }

  /** disconnect a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D remove2_head358A5DB202C5 "Namespace::remove2OwnedElement"
  public ModelElement removeOwnedElement(int index)
  // -end- 33598CAA030D remove2_head358A5DB202C5 "Namespace::remove2OwnedElement"
  {
    // -beg- preserve=no 33598CAA030D remove2_body358A5DB202C5 "Namespace::remove2OwnedElement"
    return super.removeOwnedElement(index);
    // -end- 33598CAA030D remove2_body358A5DB202C5 "Namespace::remove2OwnedElement"
  }

  /** change a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D set_head358A5DB202C5 "Namespace::setOwnedElement"
  public ModelElement setOwnedElement(int index,ModelElement ownedElement1)
  // -end- 33598CAA030D set_head358A5DB202C5 "Namespace::setOwnedElement"
  {
    // -beg- preserve=no 33598CAA030D set_body358A5DB202C5 "Namespace::setOwnedElement"
    return super.setOwnedElement(index,ownedElement1);
    // -end- 33598CAA030D set_body358A5DB202C5 "Namespace::setOwnedElement"
  }

  /** tests if a given OwnedElement is connected.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D test_head358A5DB202C5 "Namespace::containsOwnedElement"
  public boolean containsOwnedElement(ModelElement ownedElement1)
  // -end- 33598CAA030D test_head358A5DB202C5 "Namespace::containsOwnedElement"
  {
    // -beg- preserve=no 33598CAA030D test_body358A5DB202C5 "Namespace::containsOwnedElement"
    return super.containsOwnedElement(ownedElement1);
    // -end- 33598CAA030D test_body358A5DB202C5 "Namespace::containsOwnedElement"
  }

  /** used to enumerate all connected OwnedElements.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D get_all_head358A5DB202C5 "Namespace::iteratorOwnedElement"
  public java.util.Iterator iteratorOwnedElement()
  // -end- 33598CAA030D get_all_head358A5DB202C5 "Namespace::iteratorOwnedElement"
  {
    // -beg- preserve=no 33598CAA030D get_all_body358A5DB202C5 "Namespace::iteratorOwnedElement"
    return super.iteratorOwnedElement();
    // -end- 33598CAA030D get_all_body358A5DB202C5 "Namespace::iteratorOwnedElement"
  }

  /** disconnect all OwnedElements.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D remove_all_head358A5DB202C5 "Namespace::clearOwnedElement"
  public void clearOwnedElement()
  // -end- 33598CAA030D remove_all_head358A5DB202C5 "Namespace::clearOwnedElement"
  {
    // -beg- preserve=no 33598CAA030D remove_all_body358A5DB202C5 "Namespace::clearOwnedElement"
    super.clearOwnedElement();
    // -end- 33598CAA030D remove_all_body358A5DB202C5 "Namespace::clearOwnedElement"
  }

  /** returns the number of OwnedElements.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D size_head358A5DB202C5 "Namespace::sizeOwnedElement"
  public int sizeOwnedElement()
  // -end- 33598CAA030D size_head358A5DB202C5 "Namespace::sizeOwnedElement"
  {
    // -beg- preserve=no 33598CAA030D size_body358A5DB202C5 "Namespace::sizeOwnedElement"
    return super.sizeOwnedElement();
    // -end- 33598CAA030D size_body358A5DB202C5 "Namespace::sizeOwnedElement"
  }

  /** enumerate the link objects of currently connected OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D itlink_head358A5DB202C5 "Namespace::getOwnedElementLink"
  public java.util.Iterator iteratorOwnedElementLink()
  // -end- 33598CAA030D itlink_head358A5DB202C5 "Namespace::getOwnedElementLink"
  {
    // -beg- preserve=no 33598CAA030D itlink_body358A5DB202C5 "Namespace::getOwnedElementLink"
    return super.iteratorOwnedElementLink();
    // -end- 33598CAA030D itlink_body358A5DB202C5 "Namespace::getOwnedElementLink"
  }

  /** create a link class for a new link to a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D createlink_head358A5DB202C5 "Namespace::createOwnedElementLink"
  public ElementOwnership createOwnedElementLink()
  // -end- 33598CAA030D createlink_head358A5DB202C5 "Namespace::createOwnedElementLink"
  {
    // -beg- preserve=no 33598CAA030D createlink_body358A5DB202C5 "Namespace::createOwnedElementLink"
    return super.createOwnedElementLink();
    // -end- 33598CAA030D createlink_body358A5DB202C5 "Namespace::createOwnedElementLink"
  }

  /** find a link object for a given OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D find_head358A5DB202C5 "Namespace::findOwnedElementLink"
  public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
  // -end- 33598CAA030D find_head358A5DB202C5 "Namespace::findOwnedElementLink"
  {
    // -beg- preserve=no 33598CAA030D find_body358A5DB202C5 "Namespace::findOwnedElementLink"
    return super.findOwnedElementLink(ownedElement1);
    // -end- 33598CAA030D find_body358A5DB202C5 "Namespace::findOwnedElementLink"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030D _link_body358A5DB202C5 "Namespace::_linkOwnedElement"
  public void _linkOwnedElement(ElementOwnership ownedElement1)
  {
    super._linkOwnedElement(ownedElement1);
  }
  // -end- 33598CAA030D _link_body358A5DB202C5 "Namespace::_linkOwnedElement"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030D _unlink_body358A5DB202C5 "Namespace::_unlinkOwnedElement"
  public void _unlinkOwnedElement(ElementOwnership ownedElement1)
  {
    super._unlinkOwnedElement(ownedElement1);
  }
  // -end- 33598CAA030D _unlink_body358A5DB202C5 "Namespace::_unlinkOwnedElement"

  // -beg- preserve=no 335C0D7A02A8 code358A5DB202C5 "supplierDependency"

  // -end- 335C0D7A02A8 code358A5DB202C5 "supplierDependency"

  /** add a SupplierDependency.
   *  
   *  @see #removeSupplierDependency
   *  @see #containsSupplierDependency
   *  @see #iteratorSupplierDependency
   *  @see #clearSupplierDependency
   *  @see #sizeSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 add_head358A5DB202C5 "ModelElement::addSupplierDependency"
  public void addSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 add_head358A5DB202C5 "ModelElement::addSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 add_body358A5DB202C5 "ModelElement::addSupplierDependency"
    super.addSupplierDependency(supplierDependency1);
    // -end- 335C0D7A02A8 add_body358A5DB202C5 "ModelElement::addSupplierDependency"
  }

  /** disconnect a SupplierDependency.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_head358A5DB202C5 "ModelElement::removeSupplierDependency"
  public Dependency removeSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 remove_head358A5DB202C5 "ModelElement::removeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_body358A5DB202C5 "ModelElement::removeSupplierDependency"
    return super.removeSupplierDependency(supplierDependency1);
    // -end- 335C0D7A02A8 remove_body358A5DB202C5 "ModelElement::removeSupplierDependency"
  }

  /** tests if a given SupplierDependency is connected.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 test_head358A5DB202C5 "ModelElement::containsSupplierDependency"
  public boolean containsSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 test_head358A5DB202C5 "ModelElement::containsSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 test_body358A5DB202C5 "ModelElement::containsSupplierDependency"
    return super.containsSupplierDependency(supplierDependency1);
    // -end- 335C0D7A02A8 test_body358A5DB202C5 "ModelElement::containsSupplierDependency"
  }

  /** used to enumerate all connected SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 get_all_head358A5DB202C5 "ModelElement::iteratorSupplierDependency"
  public java.util.Iterator iteratorSupplierDependency()
  // -end- 335C0D7A02A8 get_all_head358A5DB202C5 "ModelElement::iteratorSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 get_all_body358A5DB202C5 "ModelElement::iteratorSupplierDependency"
    return super.iteratorSupplierDependency();
    // -end- 335C0D7A02A8 get_all_body358A5DB202C5 "ModelElement::iteratorSupplierDependency"
  }

  /** disconnect all SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_all_head358A5DB202C5 "ModelElement::clearSupplierDependency"
  public void clearSupplierDependency()
  // -end- 335C0D7A02A8 remove_all_head358A5DB202C5 "ModelElement::clearSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_all_body358A5DB202C5 "ModelElement::clearSupplierDependency"
    super.clearSupplierDependency();
    // -end- 335C0D7A02A8 remove_all_body358A5DB202C5 "ModelElement::clearSupplierDependency"
  }

  /** returns the number of SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 size_head358A5DB202C5 "ModelElement::sizeSupplierDependency"
  public int sizeSupplierDependency()
  // -end- 335C0D7A02A8 size_head358A5DB202C5 "ModelElement::sizeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 size_body358A5DB202C5 "ModelElement::sizeSupplierDependency"
    return super.sizeSupplierDependency();
    // -end- 335C0D7A02A8 size_body358A5DB202C5 "ModelElement::sizeSupplierDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _link_body358A5DB202C5 "ModelElement::_linkSupplierDependency"
  public void _linkSupplierDependency(Dependency supplierDependency1)
  {
    super._linkSupplierDependency(supplierDependency1);
  }
  // -end- 335C0D7A02A8 _link_body358A5DB202C5 "ModelElement::_linkSupplierDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _unlink_body358A5DB202C5 "ModelElement::_unlinkSupplierDependency"
  public void _unlinkSupplierDependency(Dependency supplierDependency1)
  {
    super._unlinkSupplierDependency(supplierDependency1);
  }
  // -end- 335C0D7A02A8 _unlink_body358A5DB202C5 "ModelElement::_unlinkSupplierDependency"

  // -beg- preserve=no 3C1DC4150216 code358A5DB202C5 "translation"
  private java.util.Set translation = new java.util.HashSet();
  // -end- 3C1DC4150216 code358A5DB202C5 "translation"

  /** add a Translation.
   *  
   *  @see #removeTranslation
   *  @see #containsTranslation
   *  @see #iteratorTranslation
   *  @see #clearTranslation
   *  @see #sizeTranslation
   */
  // -beg- preserve=no 3C1DC4150216 add_head358A5DB202C5 "ModelDef::addTranslation"
  public void addTranslation(Translation translation1)
  // -end- 3C1DC4150216 add_head358A5DB202C5 "ModelDef::addTranslation"
  {
    // -beg- preserve=no 3C1DC4150216 add_body358A5DB202C5 "ModelDef::addTranslation"
    translation.add(translation1);
    translation1._linkModelDef(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTranslation"));
    return;
    // -end- 3C1DC4150216 add_body358A5DB202C5 "ModelDef::addTranslation"
  }

  /** disconnect a Translation.
   *  @see #addTranslation
   */
  // -beg- preserve=no 3C1DC4150216 remove_head358A5DB202C5 "ModelDef::removeTranslation"
  public Translation removeTranslation(Translation translation1)
  // -end- 3C1DC4150216 remove_head358A5DB202C5 "ModelDef::removeTranslation"
  {
    // -beg- preserve=no 3C1DC4150216 remove_body358A5DB202C5 "ModelDef::removeTranslation"
    Translation ret=null;
    if(translation1==null || !translation.contains(translation1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = translation1;
    translation.remove(translation1);
    translation1._unlinkModelDef(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTranslation"));
    return ret;
    // -end- 3C1DC4150216 remove_body358A5DB202C5 "ModelDef::removeTranslation"
  }

  /** tests if a given Translation is connected.
   *  @see #addTranslation
   */
  // -beg- preserve=no 3C1DC4150216 test_head358A5DB202C5 "ModelDef::containsTranslation"
  public boolean containsTranslation(Translation translation1)
  // -end- 3C1DC4150216 test_head358A5DB202C5 "ModelDef::containsTranslation"
  {
    // -beg- preserve=no 3C1DC4150216 test_body358A5DB202C5 "ModelDef::containsTranslation"
    return translation.contains(translation1);
    // -end- 3C1DC4150216 test_body358A5DB202C5 "ModelDef::containsTranslation"
  }

  /** used to enumerate all connected Translations.
   *  @see #addTranslation
   */
  // -beg- preserve=no 3C1DC4150216 get_all_head358A5DB202C5 "ModelDef::iteratorTranslation"
  public java.util.Iterator iteratorTranslation()
  // -end- 3C1DC4150216 get_all_head358A5DB202C5 "ModelDef::iteratorTranslation"
  {
    // -beg- preserve=no 3C1DC4150216 get_all_body358A5DB202C5 "ModelDef::iteratorTranslation"
    return translation.iterator();
    // -end- 3C1DC4150216 get_all_body358A5DB202C5 "ModelDef::iteratorTranslation"
  }

  /** disconnect all Translations.
   *  @see #addTranslation
   */
  // -beg- preserve=no 3C1DC4150216 remove_all_head358A5DB202C5 "ModelDef::clearTranslation"
  public void clearTranslation()
  // -end- 3C1DC4150216 remove_all_head358A5DB202C5 "ModelDef::clearTranslation"
  {
    // -beg- preserve=no 3C1DC4150216 remove_all_body358A5DB202C5 "ModelDef::clearTranslation"
    if(sizeTranslation()>0){
      for(java.util.Iterator p = translation.iterator(); p.hasNext();){
        ((Translation)p.next())._unlinkModelDef(this);
      }
      translation.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTranslation"));
    }
    // -end- 3C1DC4150216 remove_all_body358A5DB202C5 "ModelDef::clearTranslation"
  }

  /** returns the number of Translations.
   *  @see #addTranslation
   */
  // -beg- preserve=no 3C1DC4150216 size_head358A5DB202C5 "ModelDef::sizeTranslation"
  public int sizeTranslation()
  // -end- 3C1DC4150216 size_head358A5DB202C5 "ModelDef::sizeTranslation"
  {
    // -beg- preserve=no 3C1DC4150216 size_body358A5DB202C5 "ModelDef::sizeTranslation"
    return translation.size();
    // -end- 3C1DC4150216 size_body358A5DB202C5 "ModelDef::sizeTranslation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C1DC4150216 _link_body358A5DB202C5 "ModelDef::_linkTranslation"
  public void _linkTranslation(Translation translation1)
  {
    translation.add(translation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTranslation"));
    return;
  }
  // -end- 3C1DC4150216 _link_body358A5DB202C5 "ModelDef::_linkTranslation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C1DC4150216 _unlink_body358A5DB202C5 "ModelDef::_unlinkTranslation"
  public void _unlinkTranslation(Translation translation1)
  {
    translation.remove(translation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTranslation"));
    return;
  }
  // -end- 3C1DC4150216 _unlink_body358A5DB202C5 "ModelDef::_unlinkTranslation"

  // -beg- preserve=no 358A617B02C9 var358A5DB202C5 "name"

  // -end- 358A617B02C9 var358A5DB202C5 "name"

  /** get current value of name
   *  Name des Modells.
   *  @see #setName
   */
  // -beg- preserve=no 358A617B02C9 get_head358A5DB202C5 "name"
  public  NlsString getName()
  // -end- 358A617B02C9 get_head358A5DB202C5 "name"
  {
    // -beg- preserve=no 358A617B02C9 get_body358A5DB202C5 "name"
    return super.getName();
    // -end- 358A617B02C9 get_body358A5DB202C5 "name"
  }

  /** set current value of name
   *  @see #getName
   */
  // -beg- preserve=no 358A617B02C9 set_head358A5DB202C5 "name"
  public  void setName(NlsString value1)
  // -end- 358A617B02C9 set_head358A5DB202C5 "name"
  {
    // -beg- preserve=no 358A617B02C9 set_body358A5DB202C5 "name"
    super.setName(value1);
    // -end- 358A617B02C9 set_body358A5DB202C5 "name"
  }

  // -beg- preserve=no 3940A9FB0316 var358A5DB202C5 "kind"
  private int kind;
  // -end- 3940A9FB0316 var358A5DB202C5 "kind"

  /** get current value of kind
   *  TYPE, REFSYSTEM, SYMBOLOGY, DATA, VIEW oder GRAPHIC
   *  @see ch.ehi.interlis.modeltopicclass.ModelDefKind
   *  @see #setKind
   */
  // -beg- preserve=no 3940A9FB0316 get_head358A5DB202C5 "kind"
  public  int getKind()
  // -end- 3940A9FB0316 get_head358A5DB202C5 "kind"
  {
    // -beg- preserve=no 3940A9FB0316 get_body358A5DB202C5 "kind"
    return kind;
    // -end- 3940A9FB0316 get_body358A5DB202C5 "kind"
  }

  /** set current value of kind
   *  @see ch.ehi.interlis.modeltopicclass.ModelDefKind
   *  @see #getKind
   */
  // -beg- preserve=no 3940A9FB0316 set_head358A5DB202C5 "kind"
  public  void setKind(int value1)
  // -end- 3940A9FB0316 set_head358A5DB202C5 "kind"
  {
    // -beg- preserve=no 3940A9FB0316 set_body358A5DB202C5 "kind"
    if(kind != value1){
      kind = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
    }
    // -end- 3940A9FB0316 set_body358A5DB202C5 "kind"
  }

  // -beg- preserve=no 3CFE2260028A var358A5DB202C5 "baseLanguage"
  private String baseLanguage = NlsString.getDefaultLanguage();
  // -end- 3CFE2260028A var358A5DB202C5 "baseLanguage"

  /** get current value of baseLanguage
   *  defines the base language.
   *  @see #setBaseLanguage
   */
  // -beg- preserve=no 3CFE2260028A get_head358A5DB202C5 "baseLanguage"
  public  String getBaseLanguage()
  // -end- 3CFE2260028A get_head358A5DB202C5 "baseLanguage"
  {
    // -beg- preserve=no 3CFE2260028A get_body358A5DB202C5 "baseLanguage"
    return baseLanguage;
    // -end- 3CFE2260028A get_body358A5DB202C5 "baseLanguage"
  }

  /** set current value of baseLanguage
   *  @see #getBaseLanguage
   */
  // -beg- preserve=no 3CFE2260028A set_head358A5DB202C5 "baseLanguage"
  public  void setBaseLanguage(String value1)
  // -end- 3CFE2260028A set_head358A5DB202C5 "baseLanguage"
  {
    // -beg- preserve=no 3CFE2260028A set_body358A5DB202C5 "baseLanguage"
    if(baseLanguage != value1){
      baseLanguage = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBaseLanguage"));
    }
    // -end- 3CFE2260028A set_body358A5DB202C5 "baseLanguage"
  }

  // -beg- preserve=no 44891CB20388 var358A5DB202C5 "isContracted"
  private boolean isContracted = false;
  // -end- 44891CB20388 var358A5DB202C5 "isContracted"

  /** get current value of isContracted
   *  @see #setContracted
   */
  // -beg- preserve=no 44891CB20388 get_head358A5DB202C5 "isContracted"
  public  boolean isContracted()
  // -end- 44891CB20388 get_head358A5DB202C5 "isContracted"
  {
    // -beg- preserve=no 44891CB20388 get_body358A5DB202C5 "isContracted"
    return isContracted;
    // -end- 44891CB20388 get_body358A5DB202C5 "isContracted"
  }

  /** set current value of isContracted
   *  @see #isContracted
   */
  // -beg- preserve=no 44891CB20388 set_head358A5DB202C5 "isContracted"
  public  void setContracted(boolean value1)
  // -end- 44891CB20388 set_head358A5DB202C5 "isContracted"
  {
    // -beg- preserve=no 44891CB20388 set_body358A5DB202C5 "isContracted"
    if(isContracted != value1){
      isContracted = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setContracted"));
    }
    // -end- 44891CB20388 set_body358A5DB202C5 "isContracted"
  }

  // -beg- preserve=no 44891D5E005A var358A5DB202C5 "issuerURI"
  private NlsString issuerURI = null;
  // -end- 44891D5E005A var358A5DB202C5 "issuerURI"

  /** get current value of issuerURI
   *  @see #setIssuerURI
   */
  // -beg- preserve=no 44891D5E005A get_head358A5DB202C5 "issuerURI"
  public  NlsString getIssuerURI()
  // -end- 44891D5E005A get_head358A5DB202C5 "issuerURI"
  {
    // -beg- preserve=no 44891D5E005A get_body358A5DB202C5 "issuerURI"
    return issuerURI;
    // -end- 44891D5E005A get_body358A5DB202C5 "issuerURI"
  }

  /** set current value of issuerURI
   *  @see #getIssuerURI
   */
  // -beg- preserve=no 44891D5E005A set_head358A5DB202C5 "issuerURI"
  public  void setIssuerURI(NlsString value1)
  // -end- 44891D5E005A set_head358A5DB202C5 "issuerURI"
  {
    // -beg- preserve=no 44891D5E005A set_body358A5DB202C5 "issuerURI"
    if(issuerURI!=value1 && (issuerURI==null || !issuerURI.equals(value1))){
      issuerURI = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setIssuerURI"));
    }
    // -end- 44891D5E005A set_body358A5DB202C5 "issuerURI"
  }

  // -beg- preserve=no 44891E6A0005 var358A5DB202C5 "version"
  private NlsString version = null;
  // -end- 44891E6A0005 var358A5DB202C5 "version"

  /** get current value of version
   *  @see #setVersion
   */
  // -beg- preserve=no 44891E6A0005 get_head358A5DB202C5 "version"
  public  NlsString getVersion()
  // -end- 44891E6A0005 get_head358A5DB202C5 "version"
  {
    // -beg- preserve=no 44891E6A0005 get_body358A5DB202C5 "version"
    return version;
    // -end- 44891E6A0005 get_body358A5DB202C5 "version"
  }

  /** set current value of version
   *  @see #getVersion
   */
  // -beg- preserve=no 44891E6A0005 set_head358A5DB202C5 "version"
  public  void setVersion(NlsString value1)
  // -end- 44891E6A0005 set_head358A5DB202C5 "version"
  {
    // -beg- preserve=no 44891E6A0005 set_body358A5DB202C5 "version"
    if(version!=value1 && (version==null || !version.equals(value1))){
      version = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setVersion"));
    }
    // -end- 44891E6A0005 set_body358A5DB202C5 "version"
  }

  // -beg- preserve=no 44891E9201A7 var358A5DB202C5 "versionComment"
  private NlsString versionComment = null;
  // -end- 44891E9201A7 var358A5DB202C5 "versionComment"

  /** get current value of versionComment
   *  @see #setVersionComment
   */
  // -beg- preserve=no 44891E9201A7 get_head358A5DB202C5 "versionComment"
  public  NlsString getVersionComment()
  // -end- 44891E9201A7 get_head358A5DB202C5 "versionComment"
  {
    // -beg- preserve=no 44891E9201A7 get_body358A5DB202C5 "versionComment"
    return versionComment;
    // -end- 44891E9201A7 get_body358A5DB202C5 "versionComment"
  }

  /** set current value of versionComment
   *  @see #getVersionComment
   */
  // -beg- preserve=no 44891E9201A7 set_head358A5DB202C5 "versionComment"
  public  void setVersionComment(NlsString value1)
  // -end- 44891E9201A7 set_head358A5DB202C5 "versionComment"
  {
    // -beg- preserve=no 44891E9201A7 set_body358A5DB202C5 "versionComment"
    if(versionComment!=value1 && (versionComment==null || !versionComment.equals(value1))){
      versionComment = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setVersionComment"));
    }
    // -end- 44891E9201A7 set_body358A5DB202C5 "versionComment"
  }

  // -beg- preserve=no 33CD739B02DA code358A5DB202C5 "importedElement"
  private java.util.Set importedElement = new java.util.HashSet();
  // -end- 33CD739B02DA code358A5DB202C5 "importedElement"

  /** add a ImportedElement.
   *  The namespace defined by a package is extended by modelelements in other, imported packages.
   *  @see #removeImportedElement
   *  @see #containsImportedElement
   *  @see #iteratorImportedElement
   *  @see #clearImportedElement
   *  @see #sizeImportedElement
   *  @see #iteratorImportedElementLink
   *  @see #createImportedElementLink
   *  @see #findImportedElementLink
   */
  // -beg- preserve=no 33CD739B02DA add_head358A5DB202C5 "Package::addImportedElement"
  public void addImportedElement(ModelElement importedElement1)
  // -end- 33CD739B02DA add_head358A5DB202C5 "Package::addImportedElement"
  {
    // -beg- preserve=no 33CD739B02DA add_body358A5DB202C5 "Package::addImportedElement"
    ElementImport linkobj=createImportedElementLink();
    linkobj.setImportedElement(importedElement1);
    linkobj.setImportedBy(this);
    importedElement.add(linkobj);
    importedElement1._linkImportedBy(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedElement"));
    return;
    // -end- 33CD739B02DA add_body358A5DB202C5 "Package::addImportedElement"
  }

  /** add a link to a ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA addlink_head358A5DB202C5 "Package::addImportedElementLink"
  public void addImportedElementLink(ElementImport importedElement1)
  // -end- 33CD739B02DA addlink_head358A5DB202C5 "Package::addImportedElementLink"
  {
    // -beg- preserve=no 33CD739B02DA addlink_body358A5DB202C5 "Package::addImportedElementLink"
    importedElement1.setImportedBy(this);
    importedElement.add(importedElement1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedElementLink"));
    return;
    // -end- 33CD739B02DA addlink_body358A5DB202C5 "Package::addImportedElementLink"
  }

  /** disconnect a ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA remove_head358A5DB202C5 "Package::removeImportedElement"
  public ModelElement removeImportedElement(ModelElement importedElement1)
  // -end- 33CD739B02DA remove_head358A5DB202C5 "Package::removeImportedElement"
  {
    // -beg- preserve=no 33CD739B02DA remove_body358A5DB202C5 "Package::removeImportedElement"
    ModelElement ret=null;
    ElementImport linkobj=findImportedElementLink(importedElement1);
    if(importedElement1==null || linkobj==null){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = linkobj.getImportedElement();
    importedElement.remove(linkobj);
    ret._unlinkImportedBy(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeImportedElement"));
    return ret;
    // -end- 33CD739B02DA remove_body358A5DB202C5 "Package::removeImportedElement"
  }

  /** tests if a given ImportedElement is connected.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA test_head358A5DB202C5 "Package::containsImportedElement"
  public boolean containsImportedElement(ModelElement importedElement1)
  // -end- 33CD739B02DA test_head358A5DB202C5 "Package::containsImportedElement"
  {
    // -beg- preserve=no 33CD739B02DA test_body358A5DB202C5 "Package::containsImportedElement"
    return importedElement.contains(findImportedElementLink(importedElement1));
    // -end- 33CD739B02DA test_body358A5DB202C5 "Package::containsImportedElement"
  }

  /** used to enumerate all connected ImportedElements.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA get_all_head358A5DB202C5 "Package::iteratorImportedElement"
  public java.util.Iterator iteratorImportedElement()
  // -end- 33CD739B02DA get_all_head358A5DB202C5 "Package::iteratorImportedElement"
  {
    // -beg- preserve=no 33CD739B02DA get_all_body358A5DB202C5 "Package::iteratorImportedElement"
    return new java.util.Iterator(){
      private java.util.Iterator i=importedElement.iterator();
      public boolean hasNext(){
        return i.hasNext();
      }
      public Object next(){
        ElementImport next=(ElementImport)i.next();
        return next.getImportedElement();
      }
      public void remove(){
        i.remove();
      }
    };
    // -end- 33CD739B02DA get_all_body358A5DB202C5 "Package::iteratorImportedElement"
  }

  /** disconnect all ImportedElements.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA remove_all_head358A5DB202C5 "Package::clearImportedElement"
  public void clearImportedElement()
  // -end- 33CD739B02DA remove_all_head358A5DB202C5 "Package::clearImportedElement"
  {
    // -beg- preserve=no 33CD739B02DA remove_all_body358A5DB202C5 "Package::clearImportedElement"
    if(sizeImportedElement()>0){
      for(java.util.Iterator p = importedElement.iterator(); p.hasNext();){
        ElementImport linkobj=(ElementImport)p.next();
        linkobj.getImportedElement()._unlinkImportedBy(linkobj);
      }
      importedElement.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearImportedElement"));
    }
    // -end- 33CD739B02DA remove_all_body358A5DB202C5 "Package::clearImportedElement"
  }

  /** returns the number of ImportedElements.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA size_head358A5DB202C5 "Package::sizeImportedElement"
  public int sizeImportedElement()
  // -end- 33CD739B02DA size_head358A5DB202C5 "Package::sizeImportedElement"
  {
    // -beg- preserve=no 33CD739B02DA size_body358A5DB202C5 "Package::sizeImportedElement"
    return importedElement.size();
    // -end- 33CD739B02DA size_body358A5DB202C5 "Package::sizeImportedElement"
  }

  /** enumerate the link objects of currently connected ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA itlink_head358A5DB202C5 "Package::getImportedElementLink"
  public java.util.Iterator iteratorImportedElementLink()
  // -end- 33CD739B02DA itlink_head358A5DB202C5 "Package::getImportedElementLink"
  {
    // -beg- preserve=no 33CD739B02DA itlink_body358A5DB202C5 "Package::getImportedElementLink"
    return importedElement.iterator();
    // -end- 33CD739B02DA itlink_body358A5DB202C5 "Package::getImportedElementLink"
  }

  /** create a link class for a new link to a ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA createlink_head358A5DB202C5 "Package::createImportedElementLink"
  public ElementImport createImportedElementLink()
  // -end- 33CD739B02DA createlink_head358A5DB202C5 "Package::createImportedElementLink"
  {
    // -beg- preserve=no 33CD739B02DA createlink_body358A5DB202C5 "Package::createImportedElementLink"
    // return new ElementImport();
    throw new java.lang.UnsupportedOperationException();
    // -end- 33CD739B02DA createlink_body358A5DB202C5 "Package::createImportedElementLink"
  }

  /** find a link object for a given ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA find_head358A5DB202C5 "Package::findImportedElementLink"
  public ElementImport findImportedElementLink(ModelElement importedElement1)
  // -end- 33CD739B02DA find_head358A5DB202C5 "Package::findImportedElementLink"
  {
      // -beg- preserve=no 33CD739B02DA find_body358A5DB202C5 "Package::findImportedElementLink"
      if(importedElement1==null) return null;
      for(java.util.Iterator p = importedElement.iterator(); p.hasNext();){
        ElementImport linkobj=(ElementImport)p.next();
        if(linkobj.getImportedElement()==importedElement1) return linkobj;
      }
      return null;
      // -end- 33CD739B02DA find_body358A5DB202C5 "Package::findImportedElementLink"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 33CD739B02DA _link_body358A5DB202C5 "Package::_linkImportedElement"
    public void _linkImportedElement(ElementImport importedElement1)
    {
      importedElement.add(importedElement1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkImportedElement"));
      return;
    }
    // -end- 33CD739B02DA _link_body358A5DB202C5 "Package::_linkImportedElement"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 33CD739B02DA _unlink_body358A5DB202C5 "Package::_unlinkImportedElement"
    public void _unlinkImportedElement(ElementImport importedElement1)
    {
      importedElement.remove(importedElement1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkImportedElement"));
      return;
    }
    // -end- 33CD739B02DA _unlink_body358A5DB202C5 "Package::_unlinkImportedElement"

    // -beg- preserve=no 362409A9000A code358A5DB202C5 "presentation"

    // -end- 362409A9000A code358A5DB202C5 "presentation"

    /** add a Presentation.
     *  
     *  @see #removePresentation
     *  @see #containsPresentation
     *  @see #iteratorPresentation
     *  @see #clearPresentation
     *  @see #sizePresentation
     */
    // -beg- preserve=no 362409A9000A add_head358A5DB202C5 "ModelElement::addPresentation"
    public void addPresentation(PresentationElement presentation1)
    // -end- 362409A9000A add_head358A5DB202C5 "ModelElement::addPresentation"
    {
      // -beg- preserve=no 362409A9000A add_body358A5DB202C5 "ModelElement::addPresentation"
      super.addPresentation(presentation1);
      // -end- 362409A9000A add_body358A5DB202C5 "ModelElement::addPresentation"
    }

    /** disconnect a Presentation.
     *  @see #addPresentation
     */
    // -beg- preserve=no 362409A9000A remove_head358A5DB202C5 "ModelElement::removePresentation"
    public PresentationElement removePresentation(PresentationElement presentation1)
    // -end- 362409A9000A remove_head358A5DB202C5 "ModelElement::removePresentation"
    {
      // -beg- preserve=no 362409A9000A remove_body358A5DB202C5 "ModelElement::removePresentation"
      return super.removePresentation(presentation1);
      // -end- 362409A9000A remove_body358A5DB202C5 "ModelElement::removePresentation"
    }

    /** tests if a given Presentation is connected.
     *  @see #addPresentation
     */
    // -beg- preserve=no 362409A9000A test_head358A5DB202C5 "ModelElement::containsPresentation"
    public boolean containsPresentation(PresentationElement presentation1)
    // -end- 362409A9000A test_head358A5DB202C5 "ModelElement::containsPresentation"
    {
      // -beg- preserve=no 362409A9000A test_body358A5DB202C5 "ModelElement::containsPresentation"
      return super.containsPresentation(presentation1);
      // -end- 362409A9000A test_body358A5DB202C5 "ModelElement::containsPresentation"
    }

    /** used to enumerate all connected Presentations.
     *  @see #addPresentation
     */
    // -beg- preserve=no 362409A9000A get_all_head358A5DB202C5 "ModelElement::iteratorPresentation"
    public java.util.Iterator iteratorPresentation()
    // -end- 362409A9000A get_all_head358A5DB202C5 "ModelElement::iteratorPresentation"
    {
      // -beg- preserve=no 362409A9000A get_all_body358A5DB202C5 "ModelElement::iteratorPresentation"
      return super.iteratorPresentation();
      // -end- 362409A9000A get_all_body358A5DB202C5 "ModelElement::iteratorPresentation"
    }

    /** disconnect all Presentations.
     *  @see #addPresentation
     */
    // -beg- preserve=no 362409A9000A remove_all_head358A5DB202C5 "ModelElement::clearPresentation"
    public void clearPresentation()
    // -end- 362409A9000A remove_all_head358A5DB202C5 "ModelElement::clearPresentation"
    {
      // -beg- preserve=no 362409A9000A remove_all_body358A5DB202C5 "ModelElement::clearPresentation"
      super.clearPresentation();
      // -end- 362409A9000A remove_all_body358A5DB202C5 "ModelElement::clearPresentation"
    }

    /** returns the number of Presentations.
     *  @see #addPresentation
     */
    // -beg- preserve=no 362409A9000A size_head358A5DB202C5 "ModelElement::sizePresentation"
    public int sizePresentation()
    // -end- 362409A9000A size_head358A5DB202C5 "ModelElement::sizePresentation"
    {
      // -beg- preserve=no 362409A9000A size_body358A5DB202C5 "ModelElement::sizePresentation"
      return super.sizePresentation();
      // -end- 362409A9000A size_body358A5DB202C5 "ModelElement::sizePresentation"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 362409A9000A _link_body358A5DB202C5 "ModelElement::_linkPresentation"
    public void _linkPresentation(PresentationElement presentation1)
    {
      super._linkPresentation(presentation1);
    }
    // -end- 362409A9000A _link_body358A5DB202C5 "ModelElement::_linkPresentation"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 362409A9000A _unlink_body358A5DB202C5 "ModelElement::_unlinkPresentation"
    public void _unlinkPresentation(PresentationElement presentation1)
    {
      super._unlinkPresentation(presentation1);
    }
    // -end- 362409A9000A _unlink_body358A5DB202C5 "ModelElement::_unlinkPresentation"

    // -beg- preserve=no 3C16416801D0 var358A5DB202C5 "isProxy"
    private boolean isProxy;
    // -end- 3C16416801D0 var358A5DB202C5 "isProxy"

    /** get current value of isProxy
     *  true if this is not an actual definition, but a placeholder, so that references can point to something
     *  @see #setProxy
     */
    // -beg- preserve=no 3C16416801D0 get_head358A5DB202C5 "isProxy"
    public  boolean isProxy()
    // -end- 3C16416801D0 get_head358A5DB202C5 "isProxy"
    {
      // -beg- preserve=no 3C16416801D0 get_body358A5DB202C5 "isProxy"
      return isProxy;
      // -end- 3C16416801D0 get_body358A5DB202C5 "isProxy"
    }

    /** set current value of isProxy
     *  @see #isProxy
     */
    // -beg- preserve=no 3C16416801D0 set_head358A5DB202C5 "isProxy"
    public  void setProxy(boolean value1)
    // -end- 3C16416801D0 set_head358A5DB202C5 "isProxy"
    {
      // -beg- preserve=no 3C16416801D0 set_body358A5DB202C5 "isProxy"
      if(isProxy != value1){
        isProxy = value1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setProxy"));
      }
      // -end- 3C16416801D0 set_body358A5DB202C5 "isProxy"
    }

    // -beg- preserve=no 335C14A5019A code358A5DB202C5 "generalization"
    private java.util.Set generalization = new java.util.HashSet();
    // -end- 335C14A5019A code358A5DB202C5 "generalization"

    /** add a Generalization.
     *  
     *  @see #removeGeneralization
     *  @see #containsGeneralization
     *  @see #iteratorGeneralization
     *  @see #clearGeneralization
     *  @see #sizeGeneralization
     */
    // -beg- preserve=no 335C14A5019A add_head358A5DB202C5 "GeneralizableElement::addGeneralization"
    public void addGeneralization(Generalization generalization1)
    // -end- 335C14A5019A add_head358A5DB202C5 "GeneralizableElement::addGeneralization"
    {
      // -beg- preserve=no 335C14A5019A add_body358A5DB202C5 "GeneralizableElement::addGeneralization"
      generalization.add(generalization1);
      generalization1._linkChild(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addGeneralization"));
      return;
      // -end- 335C14A5019A add_body358A5DB202C5 "GeneralizableElement::addGeneralization"
    }

    /** disconnect a Generalization.
     *  @see #addGeneralization
     */
    // -beg- preserve=no 335C14A5019A remove_head358A5DB202C5 "GeneralizableElement::removeGeneralization"
    public Generalization removeGeneralization(Generalization generalization1)
    // -end- 335C14A5019A remove_head358A5DB202C5 "GeneralizableElement::removeGeneralization"
    {
      // -beg- preserve=no 335C14A5019A remove_body358A5DB202C5 "GeneralizableElement::removeGeneralization"
      Generalization ret=null;
      if(generalization1==null || !generalization.contains(generalization1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = generalization1;
      generalization.remove(generalization1);
      generalization1._unlinkChild(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeGeneralization"));
      return ret;
      // -end- 335C14A5019A remove_body358A5DB202C5 "GeneralizableElement::removeGeneralization"
    }

    /** tests if a given Generalization is connected.
     *  @see #addGeneralization
     */
    // -beg- preserve=no 335C14A5019A test_head358A5DB202C5 "GeneralizableElement::containsGeneralization"
    public boolean containsGeneralization(Generalization generalization1)
    // -end- 335C14A5019A test_head358A5DB202C5 "GeneralizableElement::containsGeneralization"
    {
      // -beg- preserve=no 335C14A5019A test_body358A5DB202C5 "GeneralizableElement::containsGeneralization"
      return generalization.contains(generalization1);
      // -end- 335C14A5019A test_body358A5DB202C5 "GeneralizableElement::containsGeneralization"
    }

    /** used to enumerate all connected Generalizations.
     *  @see #addGeneralization
     */
    // -beg- preserve=no 335C14A5019A get_all_head358A5DB202C5 "GeneralizableElement::iteratorGeneralization"
    public java.util.Iterator iteratorGeneralization()
    // -end- 335C14A5019A get_all_head358A5DB202C5 "GeneralizableElement::iteratorGeneralization"
    {
      // -beg- preserve=no 335C14A5019A get_all_body358A5DB202C5 "GeneralizableElement::iteratorGeneralization"
      return generalization.iterator();
      // -end- 335C14A5019A get_all_body358A5DB202C5 "GeneralizableElement::iteratorGeneralization"
    }

    /** disconnect all Generalizations.
     *  @see #addGeneralization
     */
    // -beg- preserve=no 335C14A5019A remove_all_head358A5DB202C5 "GeneralizableElement::clearGeneralization"
    public void clearGeneralization()
    // -end- 335C14A5019A remove_all_head358A5DB202C5 "GeneralizableElement::clearGeneralization"
    {
      // -beg- preserve=no 335C14A5019A remove_all_body358A5DB202C5 "GeneralizableElement::clearGeneralization"
      if(sizeGeneralization()>0){
        for(java.util.Iterator p = generalization.iterator(); p.hasNext();){
          ((Generalization)p.next())._unlinkChild(this);
        }
        generalization.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearGeneralization"));
      }
      // -end- 335C14A5019A remove_all_body358A5DB202C5 "GeneralizableElement::clearGeneralization"
    }

    /** returns the number of Generalizations.
     *  @see #addGeneralization
     */
    // -beg- preserve=no 335C14A5019A size_head358A5DB202C5 "GeneralizableElement::sizeGeneralization"
    public int sizeGeneralization()
    // -end- 335C14A5019A size_head358A5DB202C5 "GeneralizableElement::sizeGeneralization"
    {
      // -beg- preserve=no 335C14A5019A size_body358A5DB202C5 "GeneralizableElement::sizeGeneralization"
      return generalization.size();
      // -end- 335C14A5019A size_body358A5DB202C5 "GeneralizableElement::sizeGeneralization"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 335C14A5019A _link_body358A5DB202C5 "GeneralizableElement::_linkGeneralization"
    public void _linkGeneralization(Generalization generalization1)
    {
      generalization.add(generalization1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkGeneralization"));
      return;
    }
    // -end- 335C14A5019A _link_body358A5DB202C5 "GeneralizableElement::_linkGeneralization"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 335C14A5019A _unlink_body358A5DB202C5 "GeneralizableElement::_unlinkGeneralization"
    public void _unlinkGeneralization(Generalization generalization1)
    {
      generalization.remove(generalization1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkGeneralization"));
      return;
    }
    // -end- 335C14A5019A _unlink_body358A5DB202C5 "GeneralizableElement::_unlinkGeneralization"

    // -beg- preserve=no 335C146B01D6 code358A5DB202C5 "specialization"
    private java.util.Set specialization = new java.util.HashSet();
    // -end- 335C146B01D6 code358A5DB202C5 "specialization"

    /** add a Specialization.
     *  
     *  @see #removeSpecialization
     *  @see #containsSpecialization
     *  @see #iteratorSpecialization
     *  @see #clearSpecialization
     *  @see #sizeSpecialization
     */
    // -beg- preserve=no 335C146B01D6 add_head358A5DB202C5 "GeneralizableElement::addSpecialization"
    public void addSpecialization(Generalization specialization1)
    // -end- 335C146B01D6 add_head358A5DB202C5 "GeneralizableElement::addSpecialization"
    {
      // -beg- preserve=no 335C146B01D6 add_body358A5DB202C5 "GeneralizableElement::addSpecialization"
      specialization.add(specialization1);
      specialization1._linkParent(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecialization"));
      return;
      // -end- 335C146B01D6 add_body358A5DB202C5 "GeneralizableElement::addSpecialization"
    }

    /** disconnect a Specialization.
     *  @see #addSpecialization
     */
    // -beg- preserve=no 335C146B01D6 remove_head358A5DB202C5 "GeneralizableElement::removeSpecialization"
    public Generalization removeSpecialization(Generalization specialization1)
    // -end- 335C146B01D6 remove_head358A5DB202C5 "GeneralizableElement::removeSpecialization"
    {
      // -beg- preserve=no 335C146B01D6 remove_body358A5DB202C5 "GeneralizableElement::removeSpecialization"
      Generalization ret=null;
      if(specialization1==null || !specialization.contains(specialization1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = specialization1;
      specialization.remove(specialization1);
      specialization1._unlinkParent(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecialization"));
      return ret;
      // -end- 335C146B01D6 remove_body358A5DB202C5 "GeneralizableElement::removeSpecialization"
    }

    /** tests if a given Specialization is connected.
     *  @see #addSpecialization
     */
    // -beg- preserve=no 335C146B01D6 test_head358A5DB202C5 "GeneralizableElement::containsSpecialization"
    public boolean containsSpecialization(Generalization specialization1)
    // -end- 335C146B01D6 test_head358A5DB202C5 "GeneralizableElement::containsSpecialization"
    {
      // -beg- preserve=no 335C146B01D6 test_body358A5DB202C5 "GeneralizableElement::containsSpecialization"
      return specialization.contains(specialization1);
      // -end- 335C146B01D6 test_body358A5DB202C5 "GeneralizableElement::containsSpecialization"
    }

    /** used to enumerate all connected Specializations.
     *  @see #addSpecialization
     */
    // -beg- preserve=no 335C146B01D6 get_all_head358A5DB202C5 "GeneralizableElement::iteratorSpecialization"
    public java.util.Iterator iteratorSpecialization()
    // -end- 335C146B01D6 get_all_head358A5DB202C5 "GeneralizableElement::iteratorSpecialization"
    {
      // -beg- preserve=no 335C146B01D6 get_all_body358A5DB202C5 "GeneralizableElement::iteratorSpecialization"
      return specialization.iterator();
      // -end- 335C146B01D6 get_all_body358A5DB202C5 "GeneralizableElement::iteratorSpecialization"
    }

    /** disconnect all Specializations.
     *  @see #addSpecialization
     */
    // -beg- preserve=no 335C146B01D6 remove_all_head358A5DB202C5 "GeneralizableElement::clearSpecialization"
    public void clearSpecialization()
    // -end- 335C146B01D6 remove_all_head358A5DB202C5 "GeneralizableElement::clearSpecialization"
    {
      // -beg- preserve=no 335C146B01D6 remove_all_body358A5DB202C5 "GeneralizableElement::clearSpecialization"
      if(sizeSpecialization()>0){
        for(java.util.Iterator p = specialization.iterator(); p.hasNext();){
          ((Generalization)p.next())._unlinkParent(this);
        }
        specialization.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecialization"));
      }
      // -end- 335C146B01D6 remove_all_body358A5DB202C5 "GeneralizableElement::clearSpecialization"
    }

    /** returns the number of Specializations.
     *  @see #addSpecialization
     */
    // -beg- preserve=no 335C146B01D6 size_head358A5DB202C5 "GeneralizableElement::sizeSpecialization"
    public int sizeSpecialization()
    // -end- 335C146B01D6 size_head358A5DB202C5 "GeneralizableElement::sizeSpecialization"
    {
      // -beg- preserve=no 335C146B01D6 size_body358A5DB202C5 "GeneralizableElement::sizeSpecialization"
      return specialization.size();
      // -end- 335C146B01D6 size_body358A5DB202C5 "GeneralizableElement::sizeSpecialization"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 335C146B01D6 _link_body358A5DB202C5 "GeneralizableElement::_linkSpecialization"
    public void _linkSpecialization(Generalization specialization1)
    {
      specialization.add(specialization1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecialization"));
      return;
    }
    // -end- 335C146B01D6 _link_body358A5DB202C5 "GeneralizableElement::_linkSpecialization"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 335C146B01D6 _unlink_body358A5DB202C5 "GeneralizableElement::_unlinkSpecialization"
    public void _unlinkSpecialization(Generalization specialization1)
    {
      specialization.remove(specialization1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecialization"));
      return;
    }
    // -end- 335C146B01D6 _unlink_body358A5DB202C5 "GeneralizableElement::_unlinkSpecialization"

    // -beg- preserve=no 327A877801CC var358A5DB202C5 "isRoot"
    private boolean isRoot;
    // -end- 327A877801CC var358A5DB202C5 "isRoot"

    /** get current value of isRoot
     *  @see #setRoot
     */
    // -beg- preserve=no 327A877801CC get_head358A5DB202C5 "isRoot"
    public  boolean isRoot()
    // -end- 327A877801CC get_head358A5DB202C5 "isRoot"
    {
      // -beg- preserve=no 327A877801CC get_body358A5DB202C5 "isRoot"
      return isRoot;
      // -end- 327A877801CC get_body358A5DB202C5 "isRoot"
    }

    /** set current value of isRoot
     *  @see #isRoot
     */
    // -beg- preserve=no 327A877801CC set_head358A5DB202C5 "isRoot"
    public  void setRoot(boolean value1)
    // -end- 327A877801CC set_head358A5DB202C5 "isRoot"
    {
      // -beg- preserve=no 327A877801CC set_body358A5DB202C5 "isRoot"
      if(isRoot != value1){
        isRoot = value1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
      }
      // -end- 327A877801CC set_body358A5DB202C5 "isRoot"
    }

    // -beg- preserve=no 327A877E006E var358A5DB202C5 "isLeaf"
    private boolean isLeaf;
    // -end- 327A877E006E var358A5DB202C5 "isLeaf"

    /** get current value of isLeaf
     *  @see #setLeaf
     */
    // -beg- preserve=no 327A877E006E get_head358A5DB202C5 "isLeaf"
    public  boolean isLeaf()
    // -end- 327A877E006E get_head358A5DB202C5 "isLeaf"
    {
      // -beg- preserve=no 327A877E006E get_body358A5DB202C5 "isLeaf"
      return isLeaf;
      // -end- 327A877E006E get_body358A5DB202C5 "isLeaf"
    }

    /** set current value of isLeaf
     *  @see #isLeaf
     */
    // -beg- preserve=no 327A877E006E set_head358A5DB202C5 "isLeaf"
    public  void setLeaf(boolean value1)
    // -end- 327A877E006E set_head358A5DB202C5 "isLeaf"
    {
      // -beg- preserve=no 327A877E006E set_body358A5DB202C5 "isLeaf"
      if(isLeaf != value1){
        isLeaf = value1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
      }
      // -end- 327A877E006E set_body358A5DB202C5 "isLeaf"
    }

    // -beg- preserve=no 327A878400D2 var358A5DB202C5 "isAbstract"
    private boolean isAbstract;
    // -end- 327A878400D2 var358A5DB202C5 "isAbstract"

    /** get current value of isAbstract
     *  @see #setAbstract
     */
    // -beg- preserve=no 327A878400D2 get_head358A5DB202C5 "isAbstract"
    public  boolean isAbstract()
    // -end- 327A878400D2 get_head358A5DB202C5 "isAbstract"
    {
      // -beg- preserve=no 327A878400D2 get_body358A5DB202C5 "isAbstract"
      return isAbstract;
      // -end- 327A878400D2 get_body358A5DB202C5 "isAbstract"
    }

    /** set current value of isAbstract
     *  @see #isAbstract
     */
    // -beg- preserve=no 327A878400D2 set_head358A5DB202C5 "isAbstract"
    public  void setAbstract(boolean value1)
    // -end- 327A878400D2 set_head358A5DB202C5 "isAbstract"
    {
      // -beg- preserve=no 327A878400D2 set_body358A5DB202C5 "isAbstract"
      if(isAbstract != value1){
        isAbstract = value1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
      }
      // -end- 327A878400D2 set_body358A5DB202C5 "isAbstract"
    }

    // declare/define something only in the code
    // please fill in/modify the following section
    // -beg- preserve=no 358A5DB202C5 detail_end "ModelDef"
    public java.util.Iterator iteratorIliImport()
    {
      java.util.Iterator impi=super.iteratorClientDependency();
      java.util.ArrayList imps=new java.util.ArrayList();
      while(impi.hasNext()){
    	  Dependency dep=(Dependency)impi.next();
    	  if(dep instanceof IliImport){
    		  imps.add(dep);
    	  }
      }
      return imps.iterator();
    }

    // -end- 358A5DB202C5 detail_end "ModelDef"

  }

=======
/**
 * Definiert ein Modell.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.2 $ $Date: 2006-06-13 14:22:01 $
 */
public class ModelDef extends AbstractNamespace implements Package, DefinitionProxy, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5DB202C5 detail_begin "ModelDef"

	// -end- 358A5DB202C5 detail_begin "ModelDef"

	private static final long serialVersionUID = -5189150316884136849L;

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 3CE4FBC60306 head358A5DB202C5 "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 3CE4FBC60306 head358A5DB202C5 "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE4FBC60306 throws358A5DB202C5 "getValidOwnedElements"

	// -end- 3CE4FBC60306 throws358A5DB202C5 "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CE4FBC60306 body358A5DB202C5
		// "getValidOwnedElements"
		String ret[] = { "ch.ehi.interlis.metaobjects.MetaDataUseDef", "ch.ehi.interlis.units.UnitDef",
				"ch.ehi.interlis.functions.FunctionDef",
				"ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef",
				"ch.ehi.interlis.domainsandconstants.DomainDef", "ch.ehi.interlis.modeltopicclass.ClassDef",
				"ch.ehi.interlis.graphicdescriptions.GraphicParameterDef", "ch.ehi.interlis.modeltopicclass.TopicDef",
				"ch.ehi.uml1_4.implementation.UmlPackage" };
		return ret;
		// -end- 3CE4FBC60306 body358A5DB202C5 "getValidOwnedElements"
	}

	// -beg- preserve=no 3CFE209C0280 head358A5DB202C5 "getValidSecondLanguages"
	public Set<String> getValidSecondLanguages()
	// -end- 3CFE209C0280 head358A5DB202C5 "getValidSecondLanguages"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CFE209C0280 throws358A5DB202C5
	// "getValidSecondLanguages"

	// -end- 3CFE209C0280 throws358A5DB202C5 "getValidSecondLanguages"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CFE209C0280 body358A5DB202C5
		// "getValidSecondLanguages"
		HashSet<String> ret = new HashSet<String>();
		Iterator<AbstractEditorElement> langi = iteratorTranslation();
		while (langi.hasNext()) {
			Translation lang = (Translation) langi.next();
			ret.add(lang.getLanguage());
		}
		return ret;
		// -end- 3CFE209C0280 body358A5DB202C5 "getValidSecondLanguages"
	}

	// -beg- preserve=no 3D4FA219021C head358A5DB202C5 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA219021C head358A5DB202C5 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA219021C throws358A5DB202C5 "unlinkAll"

	// -end- 3D4FA219021C throws358A5DB202C5 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA219021C body358A5DB202C5 "unlinkAll"

		detachNamespace();
		clearContract();
		clearClientDependency();
		clearOwnedElement();
		clearSupplierDependency();
		clearTranslation();
		setName(null);
		setIssuerURI(null);
		setVersion(null);
		setVersionComment(null);
		clearImportedElement();
		clearPresentation();
		clearGeneralization();
		clearSpecialization();
		clearDiagram();
		clearBehavior();
		clearPartition();
		clearCollaboration();
		clearClassifierRole();
		clearCollaborationInstanceSet();
		clearTaggedValue();
		clearConstraint();
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
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA219021C body358A5DB202C5 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2190244 head358A5DB202C5 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2190244 head358A5DB202C5 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2190244 throws358A5DB202C5 "enumerateChildren"

	// -end- 3D4FA2190244 throws358A5DB202C5 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2190244 body358A5DB202C5 "enumerateChildren"
		Iterator<?> it = null;
		it = iteratorContract();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorOwnedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTranslation();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getName());
		visitor.visit(getIssuerURI());
		visitor.visit(getVersion());
		visitor.visit(getVersionComment());
		it = iteratorImportedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorDiagram();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorBehavior();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTaggedValue();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTemplateParameter();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2190244 body358A5DB202C5 "enumerateChildren"
	}

	// -beg- preserve=no 33598CAA030E code358A5DB202C5 "namespace"

	// -end- 33598CAA030E code358A5DB202C5 "namespace"

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
	// -beg- preserve=no 33598CAA030E attach_head358A5DB202C5
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head358A5DB202C5
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body358A5DB202C5
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body358A5DB202C5
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head358A5DB202C5
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head358A5DB202C5
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body358A5DB202C5
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body358A5DB202C5
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head358A5DB202C5
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head358A5DB202C5
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body358A5DB202C5
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body358A5DB202C5
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head358A5DB202C5
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head358A5DB202C5 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body358A5DB202C5
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body358A5DB202C5 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head358A5DB202C5
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head358A5DB202C5
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body358A5DB202C5
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body358A5DB202C5
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head358A5DB202C5
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head358A5DB202C5
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body358A5DB202C5
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body358A5DB202C5
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head358A5DB202C5
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head358A5DB202C5
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body358A5DB202C5
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body358A5DB202C5
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body358A5DB202C5
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body358A5DB202C5 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body358A5DB202C5
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body358A5DB202C5
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 3940AD300137 code358A5DB202C5 "contract"
	private Set<Contract> contract = new HashSet<Contract>();
	// -end- 3940AD300137 code358A5DB202C5 "contract"

	/**
	 * add a Contract.
	 *
	 * @see #removeContract
	 * @see #containsContract
	 * @see #iteratorContract
	 * @see #clearContract
	 * @see #sizeContract
	 */
	// -beg- preserve=no 3940AD300137 add_head358A5DB202C5
	// "ModelDef::addContract"
	public void addContract(Contract contract1)
	// -end- 3940AD300137 add_head358A5DB202C5 "ModelDef::addContract"
	{
		// -beg- preserve=no 3940AD300137 add_body358A5DB202C5
		// "ModelDef::addContract"
		contract.add(contract1);
		contract1._linkModelDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addContract"));
		return;
		// -end- 3940AD300137 add_body358A5DB202C5 "ModelDef::addContract"
	}

	/**
	 * disconnect a Contract.
	 * 
	 * @see #addContract
	 */
	// -beg- preserve=no 3940AD300137 remove_head358A5DB202C5
	// "ModelDef::removeContract"
	public Contract removeContract(Contract contract1)
	// -end- 3940AD300137 remove_head358A5DB202C5 "ModelDef::removeContract"
	{
		// -beg- preserve=no 3940AD300137 remove_body358A5DB202C5
		// "ModelDef::removeContract"
		Contract ret = null;
		if (contract1 == null || !contract.contains(contract1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = contract1;
		contract.remove(contract1);
		contract1._unlinkModelDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeContract"));
		return ret;
		// -end- 3940AD300137 remove_body358A5DB202C5 "ModelDef::removeContract"
	}

	/**
	 * tests if a given Contract is connected.
	 * 
	 * @see #addContract
	 */
	// -beg- preserve=no 3940AD300137 test_head358A5DB202C5
	// "ModelDef::containsContract"
	public boolean containsContract(Contract contract1)
	// -end- 3940AD300137 test_head358A5DB202C5 "ModelDef::containsContract"
	{
		// -beg- preserve=no 3940AD300137 test_body358A5DB202C5
		// "ModelDef::containsContract"
		return contract.contains(contract1);
		// -end- 3940AD300137 test_body358A5DB202C5 "ModelDef::containsContract"
	}

	/**
	 * used to enumerate all connected Contracts.
	 * 
	 * @see #addContract
	 */
	// -beg- preserve=no 3940AD300137 get_all_head358A5DB202C5
	// "ModelDef::iteratorContract"
	public Iterator<Contract> iteratorContract()
	// -end- 3940AD300137 get_all_head358A5DB202C5 "ModelDef::iteratorContract"
	{
		// -beg- preserve=no 3940AD300137 get_all_body358A5DB202C5
		// "ModelDef::iteratorContract"
		return contract.iterator();
		// -end- 3940AD300137 get_all_body358A5DB202C5
		// "ModelDef::iteratorContract"
	}

	/**
	 * disconnect all Contracts.
	 * 
	 * @see #addContract
	 */
	// -beg- preserve=no 3940AD300137 remove_all_head358A5DB202C5
	// "ModelDef::clearContract"
	public void clearContract()
	// -end- 3940AD300137 remove_all_head358A5DB202C5 "ModelDef::clearContract"
	{
		// -beg- preserve=no 3940AD300137 remove_all_body358A5DB202C5
		// "ModelDef::clearContract"
		if (sizeContract() > 0) {
			for (Iterator<Contract> p = contract.iterator(); p.hasNext();) {
				((Contract) p.next())._unlinkModelDef(this);
			}
			contract.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearContract"));
		}
		// -end- 3940AD300137 remove_all_body358A5DB202C5
		// "ModelDef::clearContract"
	}

	/**
	 * returns the number of Contracts.
	 * 
	 * @see #addContract
	 */
	// -beg- preserve=no 3940AD300137 size_head358A5DB202C5
	// "ModelDef::sizeContract"
	public int sizeContract()
	// -end- 3940AD300137 size_head358A5DB202C5 "ModelDef::sizeContract"
	{
		// -beg- preserve=no 3940AD300137 size_body358A5DB202C5
		// "ModelDef::sizeContract"
		return contract.size();
		// -end- 3940AD300137 size_body358A5DB202C5 "ModelDef::sizeContract"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3940AD300137 _link_body358A5DB202C5
	// "ModelDef::_linkContract"
	public void _linkContract(Contract contract1) {
		contract.add(contract1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkContract"));
		return;
	}
	// -end- 3940AD300137 _link_body358A5DB202C5 "ModelDef::_linkContract"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3940AD300137 _unlink_body358A5DB202C5
	// "ModelDef::_unlinkContract"
	public void _unlinkContract(Contract contract1) {
		contract.remove(contract1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkContract"));
		return;
	}
	// -end- 3940AD300137 _unlink_body358A5DB202C5 "ModelDef::_unlinkContract"

	// -beg- preserve=no 33FFE57B0395 code358A5DB202C5 "clientDependency"

	// -end- 33FFE57B0395 code358A5DB202C5 "clientDependency"

	/**
	 * add a ClientDependency.
	 *
	 * @see #removeClientDependency
	 * @see #containsClientDependency
	 * @see #iteratorClientDependency
	 * @see #clearClientDependency
	 * @see #sizeClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 add_head358A5DB202C5
	// "ModelElement::addClientDependency"
	public void addClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 add_head358A5DB202C5
	// "ModelElement::addClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 add_body358A5DB202C5
		// "ModelElement::addClientDependency"
		super.addClientDependency(clientDependency1);
		// -end- 33FFE57B0395 add_body358A5DB202C5
		// "ModelElement::addClientDependency"
	}

	/**
	 * disconnect a ClientDependency.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 remove_head358A5DB202C5
	// "ModelElement::removeClientDependency"
	public Dependency removeClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 remove_head358A5DB202C5
	// "ModelElement::removeClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 remove_body358A5DB202C5
		// "ModelElement::removeClientDependency"
		return super.removeClientDependency(clientDependency1);
		// -end- 33FFE57B0395 remove_body358A5DB202C5
		// "ModelElement::removeClientDependency"
	}

	/**
	 * tests if a given ClientDependency is connected.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 test_head358A5DB202C5
	// "ModelElement::containsClientDependency"
	public boolean containsClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 test_head358A5DB202C5
	// "ModelElement::containsClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 test_body358A5DB202C5
		// "ModelElement::containsClientDependency"
		return super.containsClientDependency(clientDependency1);
		// -end- 33FFE57B0395 test_body358A5DB202C5
		// "ModelElement::containsClientDependency"
	}

	/**
	 * used to enumerate all connected ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 get_all_head358A5DB202C5
	// "ModelElement::iteratorClientDependency"
	public Iterator<?> iteratorClientDependency()
	// -end- 33FFE57B0395 get_all_head358A5DB202C5
	// "ModelElement::iteratorClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 get_all_body358A5DB202C5
		// "ModelElement::iteratorClientDependency"
		return super.iteratorClientDependency();
		// -end- 33FFE57B0395 get_all_body358A5DB202C5
		// "ModelElement::iteratorClientDependency"
	}

	/**
	 * disconnect all ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 remove_all_head358A5DB202C5
	// "ModelElement::clearClientDependency"
	public void clearClientDependency()
	// -end- 33FFE57B0395 remove_all_head358A5DB202C5
	// "ModelElement::clearClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 remove_all_body358A5DB202C5
		// "ModelElement::clearClientDependency"
		super.clearClientDependency();
		// -end- 33FFE57B0395 remove_all_body358A5DB202C5
		// "ModelElement::clearClientDependency"
	}

	/**
	 * returns the number of ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 size_head358A5DB202C5
	// "ModelElement::sizeClientDependency"
	public int sizeClientDependency()
	// -end- 33FFE57B0395 size_head358A5DB202C5
	// "ModelElement::sizeClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 size_body358A5DB202C5
		// "ModelElement::sizeClientDependency"
		return super.sizeClientDependency();
		// -end- 33FFE57B0395 size_body358A5DB202C5
		// "ModelElement::sizeClientDependency"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B0395 _link_body358A5DB202C5
	// "ModelElement::_linkClientDependency"
	public void _linkClientDependency(Dependency clientDependency1) {
		super._linkClientDependency(clientDependency1);
	}
	// -end- 33FFE57B0395 _link_body358A5DB202C5
	// "ModelElement::_linkClientDependency"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B0395 _unlink_body358A5DB202C5
	// "ModelElement::_unlinkClientDependency"
	public void _unlinkClientDependency(Dependency clientDependency1) {
		super._unlinkClientDependency(clientDependency1);
	}
	// -end- 33FFE57B0395 _unlink_body358A5DB202C5
	// "ModelElement::_unlinkClientDependency"

	// -beg- preserve=no 33598CAA030D code358A5DB202C5 "ownedElement"

	// -end- 33598CAA030D code358A5DB202C5 "ownedElement"

	/**
	 * add a OwnedElement. A set of ModelElementsowned by the Namespace.
	 * 
	 * @see #removeOwnedElement
	 * @see #containsOwnedElement
	 * @see #iteratorOwnedElement
	 * @see #clearOwnedElement
	 * @see #sizeOwnedElement
	 * @see #iteratorOwnedElementLink
	 * @see #createOwnedElementLink
	 * @see #findOwnedElementLink
	 */
	// -beg- preserve=no 33598CAA030D add_head358A5DB202C5
	// "Namespace::addOwnedElement"
	public void addOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D add_head358A5DB202C5 "Namespace::addOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add_body358A5DB202C5
		// "Namespace::addOwnedElement"
		super.addOwnedElement(ownedElement1);
		// -end- 33598CAA030D add_body358A5DB202C5 "Namespace::addOwnedElement"
	}

	// -beg- preserve=no 33598CAA030D add2_head358A5DB202C5
	// "Namespace::add2OwnedElement"
	public void addOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D add2_head358A5DB202C5 "Namespace::add2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add2_body358A5DB202C5
		// "Namespace::add2OwnedElement"
		super.addOwnedElement(index, ownedElement1);
		// -end- 33598CAA030D add2_body358A5DB202C5
		// "Namespace::add2OwnedElement"
	}

	/**
	 * add a link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D addlink_head358A5DB202C5
	// "Namespace::addOwnedElementLink"
	public void addOwnedElementLink(ElementOwnership ownedElement1)
	// -end- 33598CAA030D addlink_head358A5DB202C5
	// "Namespace::addOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D addlink_body358A5DB202C5
		// "Namespace::addOwnedElementLink"
		super.addOwnedElementLink(ownedElement1);
		// -end- 33598CAA030D addlink_body358A5DB202C5
		// "Namespace::addOwnedElementLink"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_head358A5DB202C5
	// "Namespace::removeOwnedElement"
	public ModelElement removeOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D remove_head358A5DB202C5
	// "Namespace::removeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_body358A5DB202C5
		// "Namespace::removeOwnedElement"
		return super.removeOwnedElement(ownedElement1);
		// -end- 33598CAA030D remove_body358A5DB202C5
		// "Namespace::removeOwnedElement"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove2_head358A5DB202C5
	// "Namespace::remove2OwnedElement"
	public ModelElement removeOwnedElement(int index)
	// -end- 33598CAA030D remove2_head358A5DB202C5
	// "Namespace::remove2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove2_body358A5DB202C5
		// "Namespace::remove2OwnedElement"
		return super.removeOwnedElement(index);
		// -end- 33598CAA030D remove2_body358A5DB202C5
		// "Namespace::remove2OwnedElement"
	}

	/**
	 * change a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D set_head358A5DB202C5
	// "Namespace::setOwnedElement"
	public ModelElement setOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D set_head358A5DB202C5 "Namespace::setOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D set_body358A5DB202C5
		// "Namespace::setOwnedElement"
		return super.setOwnedElement(index, ownedElement1);
		// -end- 33598CAA030D set_body358A5DB202C5 "Namespace::setOwnedElement"
	}

	/**
	 * tests if a given OwnedElement is connected.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D test_head358A5DB202C5
	// "Namespace::containsOwnedElement"
	public boolean containsOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D test_head358A5DB202C5
	// "Namespace::containsOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D test_body358A5DB202C5
		// "Namespace::containsOwnedElement"
		return super.containsOwnedElement(ownedElement1);
		// -end- 33598CAA030D test_body358A5DB202C5
		// "Namespace::containsOwnedElement"
	}

	/**
	 * used to enumerate all connected OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D get_all_head358A5DB202C5
	// "Namespace::iteratorOwnedElement"
	public Iterator<?> iteratorOwnedElement()
	// -end- 33598CAA030D get_all_head358A5DB202C5
	// "Namespace::iteratorOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D get_all_body358A5DB202C5
		// "Namespace::iteratorOwnedElement"
		return super.iteratorOwnedElement();
		// -end- 33598CAA030D get_all_body358A5DB202C5
		// "Namespace::iteratorOwnedElement"
	}

	/**
	 * disconnect all OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_all_head358A5DB202C5
	// "Namespace::clearOwnedElement"
	public void clearOwnedElement()
	// -end- 33598CAA030D remove_all_head358A5DB202C5
	// "Namespace::clearOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_all_body358A5DB202C5
		// "Namespace::clearOwnedElement"
		super.clearOwnedElement();
		// -end- 33598CAA030D remove_all_body358A5DB202C5
		// "Namespace::clearOwnedElement"
	}

	/**
	 * returns the number of OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D size_head358A5DB202C5
	// "Namespace::sizeOwnedElement"
	public int sizeOwnedElement()
	// -end- 33598CAA030D size_head358A5DB202C5 "Namespace::sizeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D size_body358A5DB202C5
		// "Namespace::sizeOwnedElement"
		return super.sizeOwnedElement();
		// -end- 33598CAA030D size_body358A5DB202C5
		// "Namespace::sizeOwnedElement"
	}

	/**
	 * enumerate the link objects of currently connected OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D itlink_head358A5DB202C5
	// "Namespace::getOwnedElementLink"
	public Iterator<?> iteratorOwnedElementLink()
	// -end- 33598CAA030D itlink_head358A5DB202C5
	// "Namespace::getOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D itlink_body358A5DB202C5
		// "Namespace::getOwnedElementLink"
		return super.iteratorOwnedElementLink();
		// -end- 33598CAA030D itlink_body358A5DB202C5
		// "Namespace::getOwnedElementLink"
	}

	/**
	 * create a link class for a new link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D createlink_head358A5DB202C5
	// "Namespace::createOwnedElementLink"
	public ElementOwnership createOwnedElementLink()
	// -end- 33598CAA030D createlink_head358A5DB202C5
	// "Namespace::createOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D createlink_body358A5DB202C5
		// "Namespace::createOwnedElementLink"
		return super.createOwnedElementLink();
		// -end- 33598CAA030D createlink_body358A5DB202C5
		// "Namespace::createOwnedElementLink"
	}

	/**
	 * find a link object for a given OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D find_head358A5DB202C5
	// "Namespace::findOwnedElementLink"
	public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
	// -end- 33598CAA030D find_head358A5DB202C5
	// "Namespace::findOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D find_body358A5DB202C5
		// "Namespace::findOwnedElementLink"
		return super.findOwnedElementLink(ownedElement1);
		// -end- 33598CAA030D find_body358A5DB202C5
		// "Namespace::findOwnedElementLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _link_body358A5DB202C5
	// "Namespace::_linkOwnedElement"
	public void _linkOwnedElement(ElementOwnership ownedElement1) {
		super._linkOwnedElement(ownedElement1);
	}
	// -end- 33598CAA030D _link_body358A5DB202C5 "Namespace::_linkOwnedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _unlink_body358A5DB202C5
	// "Namespace::_unlinkOwnedElement"
	public void _unlinkOwnedElement(ElementOwnership ownedElement1) {
		super._unlinkOwnedElement(ownedElement1);
	}
	// -end- 33598CAA030D _unlink_body358A5DB202C5
	// "Namespace::_unlinkOwnedElement"

	// -beg- preserve=no 335C0D7A02A8 code358A5DB202C5 "supplierDependency"

	// -end- 335C0D7A02A8 code358A5DB202C5 "supplierDependency"

	/**
	 * add a SupplierDependency.
	 *
	 * @see #removeSupplierDependency
	 * @see #containsSupplierDependency
	 * @see #iteratorSupplierDependency
	 * @see #clearSupplierDependency
	 * @see #sizeSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 add_head358A5DB202C5
	// "ModelElement::addSupplierDependency"
	public void addSupplierDependency(Dependency supplierDependency1)
	// -end- 335C0D7A02A8 add_head358A5DB202C5
	// "ModelElement::addSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 add_body358A5DB202C5
		// "ModelElement::addSupplierDependency"
		super.addSupplierDependency(supplierDependency1);
		// -end- 335C0D7A02A8 add_body358A5DB202C5
		// "ModelElement::addSupplierDependency"
	}

	/**
	 * disconnect a SupplierDependency.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 remove_head358A5DB202C5
	// "ModelElement::removeSupplierDependency"
	public Dependency removeSupplierDependency(Dependency supplierDependency1)
	// -end- 335C0D7A02A8 remove_head358A5DB202C5
	// "ModelElement::removeSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 remove_body358A5DB202C5
		// "ModelElement::removeSupplierDependency"
		return super.removeSupplierDependency(supplierDependency1);
		// -end- 335C0D7A02A8 remove_body358A5DB202C5
		// "ModelElement::removeSupplierDependency"
	}

	/**
	 * tests if a given SupplierDependency is connected.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 test_head358A5DB202C5
	// "ModelElement::containsSupplierDependency"
	public boolean containsSupplierDependency(Dependency supplierDependency1)
	// -end- 335C0D7A02A8 test_head358A5DB202C5
	// "ModelElement::containsSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 test_body358A5DB202C5
		// "ModelElement::containsSupplierDependency"
		return super.containsSupplierDependency(supplierDependency1);
		// -end- 335C0D7A02A8 test_body358A5DB202C5
		// "ModelElement::containsSupplierDependency"
	}

	/**
	 * used to enumerate all connected SupplierDependencys.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 get_all_head358A5DB202C5
	// "ModelElement::iteratorSupplierDependency"
	public Iterator<?> iteratorSupplierDependency()
	// -end- 335C0D7A02A8 get_all_head358A5DB202C5
	// "ModelElement::iteratorSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 get_all_body358A5DB202C5
		// "ModelElement::iteratorSupplierDependency"
		return super.iteratorSupplierDependency();
		// -end- 335C0D7A02A8 get_all_body358A5DB202C5
		// "ModelElement::iteratorSupplierDependency"
	}

	/**
	 * disconnect all SupplierDependencys.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 remove_all_head358A5DB202C5
	// "ModelElement::clearSupplierDependency"
	public void clearSupplierDependency()
	// -end- 335C0D7A02A8 remove_all_head358A5DB202C5
	// "ModelElement::clearSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 remove_all_body358A5DB202C5
		// "ModelElement::clearSupplierDependency"
		super.clearSupplierDependency();
		// -end- 335C0D7A02A8 remove_all_body358A5DB202C5
		// "ModelElement::clearSupplierDependency"
	}

	/**
	 * returns the number of SupplierDependencys.
	 * 
	 * @see #addSupplierDependency
	 */
	// -beg- preserve=no 335C0D7A02A8 size_head358A5DB202C5
	// "ModelElement::sizeSupplierDependency"
	public int sizeSupplierDependency()
	// -end- 335C0D7A02A8 size_head358A5DB202C5
	// "ModelElement::sizeSupplierDependency"
	{
		// -beg- preserve=no 335C0D7A02A8 size_body358A5DB202C5
		// "ModelElement::sizeSupplierDependency"
		return super.sizeSupplierDependency();
		// -end- 335C0D7A02A8 size_body358A5DB202C5
		// "ModelElement::sizeSupplierDependency"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02A8 _link_body358A5DB202C5
	// "ModelElement::_linkSupplierDependency"
	public void _linkSupplierDependency(Dependency supplierDependency1) {
		super._linkSupplierDependency(supplierDependency1);
	}
	// -end- 335C0D7A02A8 _link_body358A5DB202C5
	// "ModelElement::_linkSupplierDependency"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02A8 _unlink_body358A5DB202C5
	// "ModelElement::_unlinkSupplierDependency"
	public void _unlinkSupplierDependency(Dependency supplierDependency1) {
		super._unlinkSupplierDependency(supplierDependency1);
	}
	// -end- 335C0D7A02A8 _unlink_body358A5DB202C5
	// "ModelElement::_unlinkSupplierDependency"

	// -beg- preserve=no 3C1DC4150216 code358A5DB202C5 "translation"
	private Set<AbstractEditorElement> translation = new HashSet<AbstractEditorElement>();
	// -end- 3C1DC4150216 code358A5DB202C5 "translation"

	/**
	 * add a Translation.
	 *
	 * @see #removeTranslation
	 * @see #containsTranslation
	 * @see #iteratorTranslation
	 * @see #clearTranslation
	 * @see #sizeTranslation
	 */
	// -beg- preserve=no 3C1DC4150216 add_head358A5DB202C5
	// "ModelDef::addTranslation"
	public void addTranslation(Translation translation1)
	// -end- 3C1DC4150216 add_head358A5DB202C5 "ModelDef::addTranslation"
	{
		// -beg- preserve=no 3C1DC4150216 add_body358A5DB202C5
		// "ModelDef::addTranslation"
		translation.add(translation1);
		translation1._linkModelDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addTranslation"));
		return;
		// -end- 3C1DC4150216 add_body358A5DB202C5 "ModelDef::addTranslation"
	}

	/**
	 * disconnect a Translation.
	 * 
	 * @see #addTranslation
	 */
	// -beg- preserve=no 3C1DC4150216 remove_head358A5DB202C5
	// "ModelDef::removeTranslation"
	public Translation removeTranslation(Translation translation1)
	// -end- 3C1DC4150216 remove_head358A5DB202C5 "ModelDef::removeTranslation"
	{
		// -beg- preserve=no 3C1DC4150216 remove_body358A5DB202C5
		// "ModelDef::removeTranslation"
		Translation ret = null;
		if (translation1 == null || !translation.contains(translation1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = translation1;
		translation.remove(translation1);
		translation1._unlinkModelDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeTranslation"));
		return ret;
		// -end- 3C1DC4150216 remove_body358A5DB202C5
		// "ModelDef::removeTranslation"
	}

	/**
	 * tests if a given Translation is connected.
	 * 
	 * @see #addTranslation
	 */
	// -beg- preserve=no 3C1DC4150216 test_head358A5DB202C5
	// "ModelDef::containsTranslation"
	public boolean containsTranslation(Translation translation1)
	// -end- 3C1DC4150216 test_head358A5DB202C5 "ModelDef::containsTranslation"
	{
		// -beg- preserve=no 3C1DC4150216 test_body358A5DB202C5
		// "ModelDef::containsTranslation"
		return translation.contains(translation1);
		// -end- 3C1DC4150216 test_body358A5DB202C5
		// "ModelDef::containsTranslation"
	}

	/**
	 * used to enumerate all connected Translations.
	 * 
	 * @see #addTranslation
	 */
	// -beg- preserve=no 3C1DC4150216 get_all_head358A5DB202C5
	// "ModelDef::iteratorTranslation"
	public java.util.Iterator<AbstractEditorElement> iteratorTranslation()
	// -end- 3C1DC4150216 get_all_head358A5DB202C5
	// "ModelDef::iteratorTranslation"
	{
		// -beg- preserve=no 3C1DC4150216 get_all_body358A5DB202C5
		// "ModelDef::iteratorTranslation"
		return translation.iterator();
		// -end- 3C1DC4150216 get_all_body358A5DB202C5
		// "ModelDef::iteratorTranslation"
	}

	/**
	 * disconnect all Translations.
	 * 
	 * @see #addTranslation
	 */
	// -beg- preserve=no 3C1DC4150216 remove_all_head358A5DB202C5
	// "ModelDef::clearTranslation"
	public void clearTranslation()
	// -end- 3C1DC4150216 remove_all_head358A5DB202C5
	// "ModelDef::clearTranslation"
	{
		// -beg- preserve=no 3C1DC4150216 remove_all_body358A5DB202C5
		// "ModelDef::clearTranslation"
		if (sizeTranslation() > 0) {
			for (Iterator<AbstractEditorElement> p = translation.iterator(); p.hasNext();) {
				((Translation) p.next())._unlinkModelDef(this);
			}
			translation.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearTranslation"));
		}
		// -end- 3C1DC4150216 remove_all_body358A5DB202C5
		// "ModelDef::clearTranslation"
	}

	/**
	 * returns the number of Translations.
	 * 
	 * @see #addTranslation
	 */
	// -beg- preserve=no 3C1DC4150216 size_head358A5DB202C5
	// "ModelDef::sizeTranslation"
	public int sizeTranslation()
	// -end- 3C1DC4150216 size_head358A5DB202C5 "ModelDef::sizeTranslation"
	{
		// -beg- preserve=no 3C1DC4150216 size_body358A5DB202C5
		// "ModelDef::sizeTranslation"
		return translation.size();
		// -end- 3C1DC4150216 size_body358A5DB202C5 "ModelDef::sizeTranslation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C1DC4150216 _link_body358A5DB202C5
	// "ModelDef::_linkTranslation"
	public void _linkTranslation(Translation translation1) {
		translation.add(translation1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkTranslation"));
		return;
	}
	// -end- 3C1DC4150216 _link_body358A5DB202C5 "ModelDef::_linkTranslation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C1DC4150216 _unlink_body358A5DB202C5
	// "ModelDef::_unlinkTranslation"
	public void _unlinkTranslation(Translation translation1) {
		translation.remove(translation1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkTranslation"));
		return;
	}
	// -end- 3C1DC4150216 _unlink_body358A5DB202C5
	// "ModelDef::_unlinkTranslation"

	// -beg- preserve=no 358A617B02C9 var358A5DB202C5 "name"

	// -end- 358A617B02C9 var358A5DB202C5 "name"

	/**
	 * get current value of name Name des Modells.
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 358A617B02C9 get_head358A5DB202C5 "name"
	public NlsString getName()
	// -end- 358A617B02C9 get_head358A5DB202C5 "name"
	{
		// -beg- preserve=no 358A617B02C9 get_body358A5DB202C5 "name"
		return super.getName();
		// -end- 358A617B02C9 get_body358A5DB202C5 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 358A617B02C9 set_head358A5DB202C5 "name"
	public void setName(NlsString value1)
	// -end- 358A617B02C9 set_head358A5DB202C5 "name"
	{
		// -beg- preserve=no 358A617B02C9 set_body358A5DB202C5 "name"
		super.setName(value1);
		// -end- 358A617B02C9 set_body358A5DB202C5 "name"
	}

	// -beg- preserve=no 3940A9FB0316 var358A5DB202C5 "kind"
	private int kind;
	// -end- 3940A9FB0316 var358A5DB202C5 "kind"

	/**
	 * get current value of kind TYPE, REFSYSTEM, SYMBOLOGY, DATA, VIEW oder
	 * GRAPHIC
	 * 
	 * @see ch.ehi.interlis.modeltopicclass.ModelDefKind
	 * @see #setKind
	 */
	// -beg- preserve=no 3940A9FB0316 get_head358A5DB202C5 "kind"
	public int getKind()
	// -end- 3940A9FB0316 get_head358A5DB202C5 "kind"
	{
		// -beg- preserve=no 3940A9FB0316 get_body358A5DB202C5 "kind"
		return kind;
		// -end- 3940A9FB0316 get_body358A5DB202C5 "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.modeltopicclass.ModelDefKind
	 * @see #getKind
	 */
	// -beg- preserve=no 3940A9FB0316 set_head358A5DB202C5 "kind"
	public void setKind(int value1)
	// -end- 3940A9FB0316 set_head358A5DB202C5 "kind"
	{
		// -beg- preserve=no 3940A9FB0316 set_body358A5DB202C5 "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 3940A9FB0316 set_body358A5DB202C5 "kind"
	}

	// -beg- preserve=no 3CFE2260028A var358A5DB202C5 "baseLanguage"
	private String baseLanguage = NlsString.getDefaultLanguage();
	// -end- 3CFE2260028A var358A5DB202C5 "baseLanguage"

	/**
	 * get current value of baseLanguage defines the base language.
	 * 
	 * @see #setBaseLanguage
	 */
	// -beg- preserve=no 3CFE2260028A get_head358A5DB202C5 "baseLanguage"
	public String getBaseLanguage()
	// -end- 3CFE2260028A get_head358A5DB202C5 "baseLanguage"
	{
		// -beg- preserve=no 3CFE2260028A get_body358A5DB202C5 "baseLanguage"
		return baseLanguage;
		// -end- 3CFE2260028A get_body358A5DB202C5 "baseLanguage"
	}

	/**
	 * set current value of baseLanguage
	 * 
	 * @see #getBaseLanguage
	 */
	// -beg- preserve=no 3CFE2260028A set_head358A5DB202C5 "baseLanguage"
	public void setBaseLanguage(String value1)
	// -end- 3CFE2260028A set_head358A5DB202C5 "baseLanguage"
	{
		// -beg- preserve=no 3CFE2260028A set_body358A5DB202C5 "baseLanguage"
		if (baseLanguage != value1) {
			baseLanguage = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setBaseLanguage"));
		}
		// -end- 3CFE2260028A set_body358A5DB202C5 "baseLanguage"
	}

	// -beg- preserve=no 44891CB20388 var358A5DB202C5 "isContracted"
	private boolean isContracted = false;
	// -end- 44891CB20388 var358A5DB202C5 "isContracted"

	/**
	 * get current value of isContracted
	 * 
	 * @see #setContracted
	 */
	// -beg- preserve=no 44891CB20388 get_head358A5DB202C5 "isContracted"
	public boolean isContracted()
	// -end- 44891CB20388 get_head358A5DB202C5 "isContracted"
	{
		// -beg- preserve=no 44891CB20388 get_body358A5DB202C5 "isContracted"
		return isContracted;
		// -end- 44891CB20388 get_body358A5DB202C5 "isContracted"
	}

	/**
	 * set current value of isContracted
	 * 
	 * @see #isContracted
	 */
	// -beg- preserve=no 44891CB20388 set_head358A5DB202C5 "isContracted"
	public void setContracted(boolean value1)
	// -end- 44891CB20388 set_head358A5DB202C5 "isContracted"
	{
		// -beg- preserve=no 44891CB20388 set_body358A5DB202C5 "isContracted"
		if (isContracted != value1) {
			isContracted = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setContracted"));
		}
		// -end- 44891CB20388 set_body358A5DB202C5 "isContracted"
	}

	// -beg- preserve=no 44891D5E005A var358A5DB202C5 "issuerURI"
	private NlsString issuerURI = null;
	// -end- 44891D5E005A var358A5DB202C5 "issuerURI"

	/**
	 * get current value of issuerURI
	 * 
	 * @see #setIssuerURI
	 */
	// -beg- preserve=no 44891D5E005A get_head358A5DB202C5 "issuerURI"
	public NlsString getIssuerURI()
	// -end- 44891D5E005A get_head358A5DB202C5 "issuerURI"
	{
		// -beg- preserve=no 44891D5E005A get_body358A5DB202C5 "issuerURI"
		return issuerURI;
		// -end- 44891D5E005A get_body358A5DB202C5 "issuerURI"
	}

	/**
	 * set current value of issuerURI
	 * 
	 * @see #getIssuerURI
	 */
	// -beg- preserve=no 44891D5E005A set_head358A5DB202C5 "issuerURI"
	public void setIssuerURI(NlsString value1)
	// -end- 44891D5E005A set_head358A5DB202C5 "issuerURI"
	{
		// -beg- preserve=no 44891D5E005A set_body358A5DB202C5 "issuerURI"
		if (issuerURI != value1 && (issuerURI == null || !issuerURI.equals(value1))) {
			issuerURI = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setIssuerURI"));
		}
		// -end- 44891D5E005A set_body358A5DB202C5 "issuerURI"
	}

	// -beg- preserve=no 44891E6A0005 var358A5DB202C5 "version"
	private NlsString version = null;
	// -end- 44891E6A0005 var358A5DB202C5 "version"

	/**
	 * get current value of version
	 * 
	 * @see #setVersion
	 */
	// -beg- preserve=no 44891E6A0005 get_head358A5DB202C5 "version"
	public NlsString getVersion()
	// -end- 44891E6A0005 get_head358A5DB202C5 "version"
	{
		// -beg- preserve=no 44891E6A0005 get_body358A5DB202C5 "version"
		return version;
		// -end- 44891E6A0005 get_body358A5DB202C5 "version"
	}

	/**
	 * set current value of version
	 * 
	 * @see #getVersion
	 */
	// -beg- preserve=no 44891E6A0005 set_head358A5DB202C5 "version"
	public void setVersion(NlsString value1)
	// -end- 44891E6A0005 set_head358A5DB202C5 "version"
	{
		// -beg- preserve=no 44891E6A0005 set_body358A5DB202C5 "version"
		if (version != value1 && (version == null || !version.equals(value1))) {
			version = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setVersion"));
		}
		// -end- 44891E6A0005 set_body358A5DB202C5 "version"
	}

	// -beg- preserve=no 44891E9201A7 var358A5DB202C5 "versionComment"
	private NlsString versionComment = null;
	// -end- 44891E9201A7 var358A5DB202C5 "versionComment"

	/**
	 * get current value of versionComment
	 * 
	 * @see #setVersionComment
	 */
	// -beg- preserve=no 44891E9201A7 get_head358A5DB202C5 "versionComment"
	public NlsString getVersionComment()
	// -end- 44891E9201A7 get_head358A5DB202C5 "versionComment"
	{
		// -beg- preserve=no 44891E9201A7 get_body358A5DB202C5 "versionComment"
		return versionComment;
		// -end- 44891E9201A7 get_body358A5DB202C5 "versionComment"
	}

	/**
	 * set current value of versionComment
	 * 
	 * @see #getVersionComment
	 */
	// -beg- preserve=no 44891E9201A7 set_head358A5DB202C5 "versionComment"
	public void setVersionComment(NlsString value1)
	// -end- 44891E9201A7 set_head358A5DB202C5 "versionComment"
	{
		// -beg- preserve=no 44891E9201A7 set_body358A5DB202C5 "versionComment"
		if (versionComment != value1 && (versionComment == null || !versionComment.equals(value1))) {
			versionComment = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setVersionComment"));
		}
		// -end- 44891E9201A7 set_body358A5DB202C5 "versionComment"
	}

	// -beg- preserve=no 33CD739B02DA code358A5DB202C5 "importedElement"
	private Set<ElementImport> importedElement = new HashSet<ElementImport>();
	// -end- 33CD739B02DA code358A5DB202C5 "importedElement"

	/**
	 * add a ImportedElement. The namespace defined by a package is extended by
	 * modelelements in other, imported packages.
	 * 
	 * @see #removeImportedElement
	 * @see #containsImportedElement
	 * @see #iteratorImportedElement
	 * @see #clearImportedElement
	 * @see #sizeImportedElement
	 * @see #iteratorImportedElementLink
	 * @see #createImportedElementLink
	 * @see #findImportedElementLink
	 */
	// -beg- preserve=no 33CD739B02DA add_head358A5DB202C5
	// "Package::addImportedElement"
	public void addImportedElement(ModelElement importedElement1)
	// -end- 33CD739B02DA add_head358A5DB202C5 "Package::addImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA add_body358A5DB202C5
		// "Package::addImportedElement"
		ElementImport linkobj = createImportedElementLink();
		linkobj.setImportedElement(importedElement1);
		linkobj.setImportedBy(this);
		importedElement.add(linkobj);
		importedElement1._linkImportedBy(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addImportedElement"));
		return;
		// -end- 33CD739B02DA add_body358A5DB202C5 "Package::addImportedElement"
	}

	/**
	 * add a link to a ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA addlink_head358A5DB202C5
	// "Package::addImportedElementLink"
	public void addImportedElementLink(ElementImport importedElement1)
	// -end- 33CD739B02DA addlink_head358A5DB202C5
	// "Package::addImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA addlink_body358A5DB202C5
		// "Package::addImportedElementLink"
		importedElement1.setImportedBy(this);
		importedElement.add(importedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addImportedElementLink"));
		return;
		// -end- 33CD739B02DA addlink_body358A5DB202C5
		// "Package::addImportedElementLink"
	}

	/**
	 * disconnect a ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA remove_head358A5DB202C5
	// "Package::removeImportedElement"
	public ModelElement removeImportedElement(ModelElement importedElement1)
	// -end- 33CD739B02DA remove_head358A5DB202C5
	// "Package::removeImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA remove_body358A5DB202C5
		// "Package::removeImportedElement"
		ModelElement ret = null;
		ElementImport linkobj = findImportedElementLink(importedElement1);
		if (importedElement1 == null || linkobj == null) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = linkobj.getImportedElement();
		importedElement.remove(linkobj);
		ret._unlinkImportedBy(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeImportedElement"));
		return ret;
		// -end- 33CD739B02DA remove_body358A5DB202C5
		// "Package::removeImportedElement"
	}

	/**
	 * tests if a given ImportedElement is connected.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA test_head358A5DB202C5
	// "Package::containsImportedElement"
	public boolean containsImportedElement(ModelElement importedElement1)
	// -end- 33CD739B02DA test_head358A5DB202C5
	// "Package::containsImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA test_body358A5DB202C5
		// "Package::containsImportedElement"
		return importedElement.contains(findImportedElementLink(importedElement1));
		// -end- 33CD739B02DA test_body358A5DB202C5
		// "Package::containsImportedElement"
	}

	/**
	 * used to enumerate all connected ImportedElements.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA get_all_head358A5DB202C5
	// "Package::iteratorImportedElement"
	public Iterator<?> iteratorImportedElement()
	// -end- 33CD739B02DA get_all_head358A5DB202C5
	// "Package::iteratorImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA get_all_body358A5DB202C5
		// "Package::iteratorImportedElement"
		return new Iterator<Object>() {
			private Iterator<ElementImport> i = importedElement.iterator();

			public boolean hasNext() {
				return i.hasNext();
			}

			public Object next() {
				ElementImport next = (ElementImport) i.next();
				return next.getImportedElement();
			}

			public void remove() {
				i.remove();
			}
		};
		// -end- 33CD739B02DA get_all_body358A5DB202C5
		// "Package::iteratorImportedElement"
	}

	/**
	 * disconnect all ImportedElements.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA remove_all_head358A5DB202C5
	// "Package::clearImportedElement"
	public void clearImportedElement()
	// -end- 33CD739B02DA remove_all_head358A5DB202C5
	// "Package::clearImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA remove_all_body358A5DB202C5
		// "Package::clearImportedElement"
		if (sizeImportedElement() > 0) {
			for (Iterator<ElementImport> p = importedElement.iterator(); p.hasNext();) {
				ElementImport linkobj = (ElementImport) p.next();
				linkobj.getImportedElement()._unlinkImportedBy(linkobj);
			}
			importedElement.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearImportedElement"));
		}
		// -end- 33CD739B02DA remove_all_body358A5DB202C5
		// "Package::clearImportedElement"
	}

	/**
	 * returns the number of ImportedElements.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA size_head358A5DB202C5
	// "Package::sizeImportedElement"
	public int sizeImportedElement()
	// -end- 33CD739B02DA size_head358A5DB202C5 "Package::sizeImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA size_body358A5DB202C5
		// "Package::sizeImportedElement"
		return importedElement.size();
		// -end- 33CD739B02DA size_body358A5DB202C5
		// "Package::sizeImportedElement"
	}

	/**
	 * enumerate the link objects of currently connected ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA itlink_head358A5DB202C5
	// "Package::getImportedElementLink"
	public Iterator<ElementImport> iteratorImportedElementLink()
	// -end- 33CD739B02DA itlink_head358A5DB202C5
	// "Package::getImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA itlink_body358A5DB202C5
		// "Package::getImportedElementLink"
		return importedElement.iterator();
		// -end- 33CD739B02DA itlink_body358A5DB202C5
		// "Package::getImportedElementLink"
	}

	/**
	 * create a link class for a new link to a ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA createlink_head358A5DB202C5
	// "Package::createImportedElementLink"
	public ElementImport createImportedElementLink()
	// -end- 33CD739B02DA createlink_head358A5DB202C5
	// "Package::createImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA createlink_body358A5DB202C5
		// "Package::createImportedElementLink"
		// return new ElementImport();
		throw new java.lang.UnsupportedOperationException();
		// -end- 33CD739B02DA createlink_body358A5DB202C5
		// "Package::createImportedElementLink"
	}

	/**
	 * find a link object for a given ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA find_head358A5DB202C5
	// "Package::findImportedElementLink"
	public ElementImport findImportedElementLink(ModelElement importedElement1)
	// -end- 33CD739B02DA find_head358A5DB202C5
	// "Package::findImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA find_body358A5DB202C5
		// "Package::findImportedElementLink"
		if (importedElement1 == null)
			return null;
		for (Iterator<ElementImport> p = importedElement.iterator(); p.hasNext();) {
			ElementImport linkobj = (ElementImport) p.next();
			if (linkobj.getImportedElement() == importedElement1)
				return linkobj;
		}
		return null;
		// -end- 33CD739B02DA find_body358A5DB202C5
		// "Package::findImportedElementLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD739B02DA _link_body358A5DB202C5
	// "Package::_linkImportedElement"
	public void _linkImportedElement(ElementImport importedElement1) {
		importedElement.add(importedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkImportedElement"));
		return;
	}
	// -end- 33CD739B02DA _link_body358A5DB202C5 "Package::_linkImportedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD739B02DA _unlink_body358A5DB202C5
	// "Package::_unlinkImportedElement"
	public void _unlinkImportedElement(ElementImport importedElement1) {
		importedElement.remove(importedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkImportedElement"));
		return;
	}
	// -end- 33CD739B02DA _unlink_body358A5DB202C5
	// "Package::_unlinkImportedElement"

	// -beg- preserve=no 362409A9000A code358A5DB202C5 "presentation"

	// -end- 362409A9000A code358A5DB202C5 "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head358A5DB202C5
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head358A5DB202C5 "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body358A5DB202C5
		// "ModelElement::addPresentation"
		super.addPresentation(presentation1);
		// -end- 362409A9000A add_body358A5DB202C5
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head358A5DB202C5
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head358A5DB202C5
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body358A5DB202C5
		// "ModelElement::removePresentation"
		return super.removePresentation(presentation1);
		// -end- 362409A9000A remove_body358A5DB202C5
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head358A5DB202C5
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head358A5DB202C5
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body358A5DB202C5
		// "ModelElement::containsPresentation"
		return super.containsPresentation(presentation1);
		// -end- 362409A9000A test_body358A5DB202C5
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head358A5DB202C5
	// "ModelElement::iteratorPresentation"
	public Iterator<?> iteratorPresentation()
	// -end- 362409A9000A get_all_head358A5DB202C5
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body358A5DB202C5
		// "ModelElement::iteratorPresentation"
		return super.iteratorPresentation();
		// -end- 362409A9000A get_all_body358A5DB202C5
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head358A5DB202C5
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head358A5DB202C5
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body358A5DB202C5
		// "ModelElement::clearPresentation"
		super.clearPresentation();
		// -end- 362409A9000A remove_all_body358A5DB202C5
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head358A5DB202C5
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head358A5DB202C5 "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body358A5DB202C5
		// "ModelElement::sizePresentation"
		return super.sizePresentation();
		// -end- 362409A9000A size_body358A5DB202C5
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body358A5DB202C5
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		super._linkPresentation(presentation1);
	}
	// -end- 362409A9000A _link_body358A5DB202C5
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body358A5DB202C5
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		super._unlinkPresentation(presentation1);
	}
	// -end- 362409A9000A _unlink_body358A5DB202C5
	// "ModelElement::_unlinkPresentation"

	// -beg- preserve=no 3C16416801D0 var358A5DB202C5 "isProxy"
	private boolean isProxy;
	// -end- 3C16416801D0 var358A5DB202C5 "isProxy"

	/**
	 * get current value of isProxy true if this is not an actual definition,
	 * but a placeholder, so that references can point to something
	 * 
	 * @see #setProxy
	 */
	// -beg- preserve=no 3C16416801D0 get_head358A5DB202C5 "isProxy"
	public boolean isProxy()
	// -end- 3C16416801D0 get_head358A5DB202C5 "isProxy"
	{
		// -beg- preserve=no 3C16416801D0 get_body358A5DB202C5 "isProxy"
		return isProxy;
		// -end- 3C16416801D0 get_body358A5DB202C5 "isProxy"
	}

	/**
	 * set current value of isProxy
	 * 
	 * @see #isProxy
	 */
	// -beg- preserve=no 3C16416801D0 set_head358A5DB202C5 "isProxy"
	public void setProxy(boolean value1)
	// -end- 3C16416801D0 set_head358A5DB202C5 "isProxy"
	{
		// -beg- preserve=no 3C16416801D0 set_body358A5DB202C5 "isProxy"
		if (isProxy != value1) {
			isProxy = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setProxy"));
		}
		// -end- 3C16416801D0 set_body358A5DB202C5 "isProxy"
	}

	// -beg- preserve=no 335C14A5019A code358A5DB202C5 "generalization"
	private Set<Generalization> generalization = new HashSet<Generalization>();
	// -end- 335C14A5019A code358A5DB202C5 "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head358A5DB202C5
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head358A5DB202C5
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body358A5DB202C5
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addGeneralization"));
		return;
		// -end- 335C14A5019A add_body358A5DB202C5
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head358A5DB202C5
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head358A5DB202C5
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body358A5DB202C5
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
		// -end- 335C14A5019A remove_body358A5DB202C5
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head358A5DB202C5
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head358A5DB202C5
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body358A5DB202C5
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body358A5DB202C5
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head358A5DB202C5
	// "GeneralizableElement::iteratorGeneralization"
	public Iterator<Generalization> iteratorGeneralization()
	// -end- 335C14A5019A get_all_head358A5DB202C5
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body358A5DB202C5
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body358A5DB202C5
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head358A5DB202C5
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head358A5DB202C5
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body358A5DB202C5
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (Iterator<Generalization> p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearGeneralization"));
		}
		// -end- 335C14A5019A remove_all_body358A5DB202C5
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head358A5DB202C5
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head358A5DB202C5
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body358A5DB202C5
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body358A5DB202C5
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body358A5DB202C5
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _link_body358A5DB202C5
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body358A5DB202C5
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _unlink_body358A5DB202C5
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code358A5DB202C5 "specialization"
	private Set<Generalization> specialization = new HashSet<Generalization>();
	// -end- 335C146B01D6 code358A5DB202C5 "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head358A5DB202C5
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head358A5DB202C5
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body358A5DB202C5
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecialization"));
		return;
		// -end- 335C146B01D6 add_body358A5DB202C5
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head358A5DB202C5
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head358A5DB202C5
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body358A5DB202C5
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
		// -end- 335C146B01D6 remove_body358A5DB202C5
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head358A5DB202C5
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head358A5DB202C5
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body358A5DB202C5
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body358A5DB202C5
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head358A5DB202C5
	// "GeneralizableElement::iteratorSpecialization"
	public Iterator<Generalization> iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head358A5DB202C5
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body358A5DB202C5
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body358A5DB202C5
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head358A5DB202C5
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head358A5DB202C5
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body358A5DB202C5
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (Iterator<Generalization> p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecialization"));
		}
		// -end- 335C146B01D6 remove_all_body358A5DB202C5
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head358A5DB202C5
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head358A5DB202C5
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body358A5DB202C5
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body358A5DB202C5
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body358A5DB202C5
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _link_body358A5DB202C5
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body358A5DB202C5
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _unlink_body358A5DB202C5
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var358A5DB202C5 "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var358A5DB202C5 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head358A5DB202C5 "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head358A5DB202C5 "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body358A5DB202C5 "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body358A5DB202C5 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head358A5DB202C5 "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head358A5DB202C5 "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body358A5DB202C5 "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 327A877801CC set_body358A5DB202C5 "isRoot"
	}

	// -beg- preserve=no 327A877E006E var358A5DB202C5 "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var358A5DB202C5 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head358A5DB202C5 "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head358A5DB202C5 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body358A5DB202C5 "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body358A5DB202C5 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head358A5DB202C5 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head358A5DB202C5 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body358A5DB202C5 "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 327A877E006E set_body358A5DB202C5 "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var358A5DB202C5 "isAbstract"
	private boolean isAbstract;
	// -end- 327A878400D2 var358A5DB202C5 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head358A5DB202C5 "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head358A5DB202C5 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body358A5DB202C5 "isAbstract"
		return isAbstract;
		// -end- 327A878400D2 get_body358A5DB202C5 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head358A5DB202C5 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head358A5DB202C5 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body358A5DB202C5 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 327A878400D2 set_body358A5DB202C5 "isAbstract"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5DB202C5 detail_end "ModelDef"
	public Iterator<Dependency> iteratorIliImport() {
		Iterator<?> impi = super.iteratorClientDependency();
		ArrayList<Dependency> imps = new ArrayList<Dependency>();
		while (impi.hasNext()) {
			Dependency dep = (Dependency) impi.next();
			if (dep instanceof IliImport) {
				imps.add(dep);
			}
		}
		return imps.iterator();
	}
	// -end- 358A5DB202C5 detail_end "ModelDef"

	@Override
	public boolean deepContainsOwnedElement(Class aclass, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ModelElement deepGetOwnedElement(Class aclass, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
