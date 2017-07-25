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


  // -beg- preserve=no 3C68E11703C1 package "UmlPackage"
package ch.ehi.uml1_4.implementation;
  // -end- 3C68E11703C1 package "UmlPackage"

  // -beg- preserve=no 3C68E11703C1 autoimport "UmlPackage"
  import ch.ehi.uml1_4.modelmanagement.Package;
  import ch.ehi.uml1_4.implementation.AbstractNamespace;
  import ch.ehi.basics.tools.AbstractVisitor;
  import ch.ehi.uml1_4.foundation.core.ModelElement;
  import ch.ehi.uml1_4.modelmanagement.ElementImport;
  import ch.ehi.uml1_4.foundation.core.PresentationElement;
  import ch.ehi.uml1_4.foundation.core.Generalization;
  import ch.ehi.uml1_4.implementation.AbstractEditorElement;
  import ch.ehi.uml1_4.foundation.core.ElementOwnership;
  import ch.ehi.umleditor.umlpresentation.Diagram;
  import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
  import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
  import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
  import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
  import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
  import ch.ehi.uml1_4.foundation.core.Namespace;
  import ch.ehi.uml1_4.foundation.core.Dependency;
  import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
  import ch.ehi.uml1_4.foundation.core.Constraint;
  import ch.ehi.uml1_4.foundation.core.Component;
  import ch.ehi.uml1_4.foundation.core.ElementResidence;
  import ch.ehi.uml1_4.foundation.core.TemplateParameter;
  import ch.ehi.uml1_4.foundation.core.Flow;
  import ch.ehi.uml1_4.foundation.core.Comment;
  import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
  import ch.ehi.basics.types.NlsString;
  // -end- 3C68E11703C1 autoimport "UmlPackage"

  // import declarations
  // please fill in/modify the following section
  // -beg- preserve=no 3C68E11703C1 import "UmlPackage"

  // -end- 3C68E11703C1 import "UmlPackage"

  /** @author Claude Eisenhut
   *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:15 $
   */
public class UmlPackage extends AbstractNamespace implements Package , java.io.Serializable
  {
    // declare/define something only in the code
    // please fill in/modify the following section
    // -beg- preserve=no 3C68E11703C1 detail_begin "UmlPackage"

    // -end- 3C68E11703C1 detail_begin "UmlPackage"

    /** return the list of valid owned elements for this namespace.
     */
    // -beg- preserve=no 3CE4F6C401A4 head3C68E11703C1 "getValidOwnedElements"
    public String[] getValidOwnedElements()
    // -end- 3CE4F6C401A4 head3C68E11703C1 "getValidOwnedElements"
      // declare any checked exceptions
      // please fill in/modify the following section
      // -beg- preserve=no 3CE4F6C401A4 throws3C68E11703C1 "getValidOwnedElements"

      // -end- 3CE4F6C401A4 throws3C68E11703C1 "getValidOwnedElements"
      {
      // please fill in/modify the following section
      // -beg- preserve=yes 3CE4F6C401A4 body3C68E11703C1 "getValidOwnedElements"
    // return same as parent namespace
    return getNamespace().getValidOwnedElements();
      // -end- 3CE4F6C401A4 body3C68E11703C1 "getValidOwnedElements"
      }

    // -beg- preserve=no 3D4FA218001C head3C68E11703C1 "unlinkAll"
    public void unlinkAll()
    // -end- 3D4FA218001C head3C68E11703C1 "unlinkAll"
      // declare any checked exceptions
      // please fill in/modify the following section
      // -beg- preserve=no 3D4FA218001C throws3C68E11703C1 "unlinkAll"

      // -end- 3D4FA218001C throws3C68E11703C1 "unlinkAll"
      {
      // please fill in/modify the following section
      // -beg- preserve=no 3D4FA218001C body3C68E11703C1 "unlinkAll"
      
      clearImportedElement();
      clearPresentation();
      clearGeneralization();
      clearSpecialization();
      clearOwnedElement();
      clearDiagram();
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
      setMetaAttrb(null);
      setDocumentation(null);
      super.unlinkAll();
      // -end- 3D4FA218001C body3C68E11703C1 "unlinkAll"
      }

    // -beg- preserve=no 3D4FA2180026 head3C68E11703C1 "enumerateChildren"
    public void enumerateChildren(AbstractVisitor visitor)
    // -end- 3D4FA2180026 head3C68E11703C1 "enumerateChildren"
      // declare any checked exceptions
      // please fill in/modify the following section
      // -beg- preserve=no 3D4FA2180026 throws3C68E11703C1 "enumerateChildren"

      // -end- 3D4FA2180026 throws3C68E11703C1 "enumerateChildren"
      {
      // please fill in/modify the following section
      // -beg- preserve=no 3D4FA2180026 body3C68E11703C1 "enumerateChildren"
      java.util.Iterator it=null;
      it=iteratorImportedElement();while(it.hasNext())visitor.visit(it.next());
      it=iteratorOwnedElement();while(it.hasNext())visitor.visit(it.next());
      it=iteratorDiagram();while(it.hasNext())visitor.visit(it.next());
      it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
      it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
      it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
      visitor.visit(getName());
      visitor.visit(getDocumentation());
      super.enumerateChildren(visitor);
      // -end- 3D4FA2180026 body3C68E11703C1 "enumerateChildren"
      }

    // -beg- preserve=no 33CD739B02DA code3C68E11703C1 "importedElement"
    private java.util.Set importedElement = new java.util.HashSet();
    // -end- 33CD739B02DA code3C68E11703C1 "importedElement"

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
    // -beg- preserve=no 33CD739B02DA add_head3C68E11703C1 "Package::addImportedElement"
    public void addImportedElement(ModelElement importedElement1)
    // -end- 33CD739B02DA add_head3C68E11703C1 "Package::addImportedElement"
    {
      // -beg- preserve=no 33CD739B02DA add_body3C68E11703C1 "Package::addImportedElement"
      ElementImport linkobj=createImportedElementLink();
      linkobj.setImportedElement(importedElement1);
      linkobj.setImportedBy(this);
      importedElement.add(linkobj);
      importedElement1._linkImportedBy(linkobj);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedElement"));
      return;
      // -end- 33CD739B02DA add_body3C68E11703C1 "Package::addImportedElement"
    }

    /** add a link to a ImportedElement.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA addlink_head3C68E11703C1 "Package::addImportedElementLink"
    public void addImportedElementLink(ElementImport importedElement1)
    // -end- 33CD739B02DA addlink_head3C68E11703C1 "Package::addImportedElementLink"
    {
      // -beg- preserve=no 33CD739B02DA addlink_body3C68E11703C1 "Package::addImportedElementLink"
      importedElement1.setImportedBy(this);
      importedElement.add(importedElement1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedElementLink"));
      return;
      // -end- 33CD739B02DA addlink_body3C68E11703C1 "Package::addImportedElementLink"
    }

    /** disconnect a ImportedElement.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA remove_head3C68E11703C1 "Package::removeImportedElement"
    public ModelElement removeImportedElement(ModelElement importedElement1)
    // -end- 33CD739B02DA remove_head3C68E11703C1 "Package::removeImportedElement"
    {
      // -beg- preserve=no 33CD739B02DA remove_body3C68E11703C1 "Package::removeImportedElement"
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
      // -end- 33CD739B02DA remove_body3C68E11703C1 "Package::removeImportedElement"
    }

    /** tests if a given ImportedElement is connected.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA test_head3C68E11703C1 "Package::containsImportedElement"
    public boolean containsImportedElement(ModelElement importedElement1)
    // -end- 33CD739B02DA test_head3C68E11703C1 "Package::containsImportedElement"
    {
      // -beg- preserve=no 33CD739B02DA test_body3C68E11703C1 "Package::containsImportedElement"
      return importedElement.contains(findImportedElementLink(importedElement1));
      // -end- 33CD739B02DA test_body3C68E11703C1 "Package::containsImportedElement"
    }

    /** used to enumerate all connected ImportedElements.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA get_all_head3C68E11703C1 "Package::iteratorImportedElement"
    public java.util.Iterator iteratorImportedElement()
    // -end- 33CD739B02DA get_all_head3C68E11703C1 "Package::iteratorImportedElement"
    {
      // -beg- preserve=no 33CD739B02DA get_all_body3C68E11703C1 "Package::iteratorImportedElement"
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
      // -end- 33CD739B02DA get_all_body3C68E11703C1 "Package::iteratorImportedElement"
    }

    /** disconnect all ImportedElements.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA remove_all_head3C68E11703C1 "Package::clearImportedElement"
    public void clearImportedElement()
    // -end- 33CD739B02DA remove_all_head3C68E11703C1 "Package::clearImportedElement"
    {
      // -beg- preserve=no 33CD739B02DA remove_all_body3C68E11703C1 "Package::clearImportedElement"
      if(sizeImportedElement()>0){
        for(java.util.Iterator p = importedElement.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          linkobj.getImportedElement()._unlinkImportedBy(linkobj);
        }
        importedElement.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearImportedElement"));
      }
      // -end- 33CD739B02DA remove_all_body3C68E11703C1 "Package::clearImportedElement"
    }

    /** returns the number of ImportedElements.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA size_head3C68E11703C1 "Package::sizeImportedElement"
    public int sizeImportedElement()
    // -end- 33CD739B02DA size_head3C68E11703C1 "Package::sizeImportedElement"
    {
      // -beg- preserve=no 33CD739B02DA size_body3C68E11703C1 "Package::sizeImportedElement"
      return importedElement.size();
      // -end- 33CD739B02DA size_body3C68E11703C1 "Package::sizeImportedElement"
    }

    /** enumerate the link objects of currently connected ImportedElement.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA itlink_head3C68E11703C1 "Package::getImportedElementLink"
    public java.util.Iterator iteratorImportedElementLink()
    // -end- 33CD739B02DA itlink_head3C68E11703C1 "Package::getImportedElementLink"
    {
      // -beg- preserve=no 33CD739B02DA itlink_body3C68E11703C1 "Package::getImportedElementLink"
      return importedElement.iterator();
      // -end- 33CD739B02DA itlink_body3C68E11703C1 "Package::getImportedElementLink"
    }

    /** create a link class for a new link to a ImportedElement.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA createlink_head3C68E11703C1 "Package::createImportedElementLink"
    public ElementImport createImportedElementLink()
    // -end- 33CD739B02DA createlink_head3C68E11703C1 "Package::createImportedElementLink"
    {
      // -beg- preserve=no 33CD739B02DA createlink_body3C68E11703C1 "Package::createImportedElementLink"
      // return new ElementImport();
      throw new java.lang.UnsupportedOperationException();
      // -end- 33CD739B02DA createlink_body3C68E11703C1 "Package::createImportedElementLink"
    }

    /** find a link object for a given ImportedElement.
     *  @see #addImportedElement
     */
    // -beg- preserve=no 33CD739B02DA find_head3C68E11703C1 "Package::findImportedElementLink"
    public ElementImport findImportedElementLink(ModelElement importedElement1)
    // -end- 33CD739B02DA find_head3C68E11703C1 "Package::findImportedElementLink"
    {
        // -beg- preserve=no 33CD739B02DA find_body3C68E11703C1 "Package::findImportedElementLink"
        if(importedElement1==null) return null;
        for(java.util.Iterator p = importedElement.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          if(linkobj.getImportedElement()==importedElement1) return linkobj;
        }
        return null;
        // -end- 33CD739B02DA find_body3C68E11703C1 "Package::findImportedElementLink"
      }

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B02DA _link_body3C68E11703C1 "Package::_linkImportedElement"
      public void _linkImportedElement(ElementImport importedElement1)
      {
        importedElement.add(importedElement1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkImportedElement"));
        return;
      }
      // -end- 33CD739B02DA _link_body3C68E11703C1 "Package::_linkImportedElement"

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B02DA _unlink_body3C68E11703C1 "Package::_unlinkImportedElement"
      public void _unlinkImportedElement(ElementImport importedElement1)
      {
        importedElement.remove(importedElement1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkImportedElement"));
        return;
      }
      // -end- 33CD739B02DA _unlink_body3C68E11703C1 "Package::_unlinkImportedElement"

      // -beg- preserve=no 362409A9000A code3C68E11703C1 "presentation"

      // -end- 362409A9000A code3C68E11703C1 "presentation"

      /** add a Presentation.
       *  
       *  @see #removePresentation
       *  @see #containsPresentation
       *  @see #iteratorPresentation
       *  @see #clearPresentation
       *  @see #sizePresentation
       */
      // -beg- preserve=no 362409A9000A add_head3C68E11703C1 "ModelElement::addPresentation"
      public void addPresentation(PresentationElement presentation1)
      // -end- 362409A9000A add_head3C68E11703C1 "ModelElement::addPresentation"
      {
        // -beg- preserve=no 362409A9000A add_body3C68E11703C1 "ModelElement::addPresentation"
        super.addPresentation(presentation1);
        // -end- 362409A9000A add_body3C68E11703C1 "ModelElement::addPresentation"
      }

      /** disconnect a Presentation.
       *  @see #addPresentation
       */
      // -beg- preserve=no 362409A9000A remove_head3C68E11703C1 "ModelElement::removePresentation"
      public PresentationElement removePresentation(PresentationElement presentation1)
      // -end- 362409A9000A remove_head3C68E11703C1 "ModelElement::removePresentation"
      {
        // -beg- preserve=no 362409A9000A remove_body3C68E11703C1 "ModelElement::removePresentation"
        return super.removePresentation(presentation1);
        // -end- 362409A9000A remove_body3C68E11703C1 "ModelElement::removePresentation"
      }

      /** tests if a given Presentation is connected.
       *  @see #addPresentation
       */
      // -beg- preserve=no 362409A9000A test_head3C68E11703C1 "ModelElement::containsPresentation"
      public boolean containsPresentation(PresentationElement presentation1)
      // -end- 362409A9000A test_head3C68E11703C1 "ModelElement::containsPresentation"
      {
        // -beg- preserve=no 362409A9000A test_body3C68E11703C1 "ModelElement::containsPresentation"
        return super.containsPresentation(presentation1);
        // -end- 362409A9000A test_body3C68E11703C1 "ModelElement::containsPresentation"
      }

      /** used to enumerate all connected Presentations.
       *  @see #addPresentation
       */
      // -beg- preserve=no 362409A9000A get_all_head3C68E11703C1 "ModelElement::iteratorPresentation"
      public java.util.Iterator iteratorPresentation()
      // -end- 362409A9000A get_all_head3C68E11703C1 "ModelElement::iteratorPresentation"
      {
        // -beg- preserve=no 362409A9000A get_all_body3C68E11703C1 "ModelElement::iteratorPresentation"
        return super.iteratorPresentation();
        // -end- 362409A9000A get_all_body3C68E11703C1 "ModelElement::iteratorPresentation"
      }

      /** disconnect all Presentations.
       *  @see #addPresentation
       */
      // -beg- preserve=no 362409A9000A remove_all_head3C68E11703C1 "ModelElement::clearPresentation"
      public void clearPresentation()
      // -end- 362409A9000A remove_all_head3C68E11703C1 "ModelElement::clearPresentation"
      {
        // -beg- preserve=no 362409A9000A remove_all_body3C68E11703C1 "ModelElement::clearPresentation"
        super.clearPresentation();
        // -end- 362409A9000A remove_all_body3C68E11703C1 "ModelElement::clearPresentation"
      }

      /** returns the number of Presentations.
       *  @see #addPresentation
       */
      // -beg- preserve=no 362409A9000A size_head3C68E11703C1 "ModelElement::sizePresentation"
      public int sizePresentation()
      // -end- 362409A9000A size_head3C68E11703C1 "ModelElement::sizePresentation"
      {
        // -beg- preserve=no 362409A9000A size_body3C68E11703C1 "ModelElement::sizePresentation"
        return super.sizePresentation();
        // -end- 362409A9000A size_body3C68E11703C1 "ModelElement::sizePresentation"
      }

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 362409A9000A _link_body3C68E11703C1 "ModelElement::_linkPresentation"
      public void _linkPresentation(PresentationElement presentation1)
      {
        super._linkPresentation(presentation1);
      }
      // -end- 362409A9000A _link_body3C68E11703C1 "ModelElement::_linkPresentation"

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 362409A9000A _unlink_body3C68E11703C1 "ModelElement::_unlinkPresentation"
      public void _unlinkPresentation(PresentationElement presentation1)
      {
        super._unlinkPresentation(presentation1);
      }
      // -end- 362409A9000A _unlink_body3C68E11703C1 "ModelElement::_unlinkPresentation"

      // -beg- preserve=no 335C14A5019A code3C68E11703C1 "generalization"
      private java.util.Set generalization = new java.util.HashSet();
      // -end- 335C14A5019A code3C68E11703C1 "generalization"

      /** add a Generalization.
       *  
       *  @see #removeGeneralization
       *  @see #containsGeneralization
       *  @see #iteratorGeneralization
       *  @see #clearGeneralization
       *  @see #sizeGeneralization
       */
      // -beg- preserve=no 335C14A5019A add_head3C68E11703C1 "GeneralizableElement::addGeneralization"
      public void addGeneralization(Generalization generalization1)
      // -end- 335C14A5019A add_head3C68E11703C1 "GeneralizableElement::addGeneralization"
      {
        // -beg- preserve=no 335C14A5019A add_body3C68E11703C1 "GeneralizableElement::addGeneralization"
        generalization.add(generalization1);
        generalization1._linkChild(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addGeneralization"));
        return;
        // -end- 335C14A5019A add_body3C68E11703C1 "GeneralizableElement::addGeneralization"
      }

      /** disconnect a Generalization.
       *  @see #addGeneralization
       */
      // -beg- preserve=no 335C14A5019A remove_head3C68E11703C1 "GeneralizableElement::removeGeneralization"
      public Generalization removeGeneralization(Generalization generalization1)
      // -end- 335C14A5019A remove_head3C68E11703C1 "GeneralizableElement::removeGeneralization"
      {
        // -beg- preserve=no 335C14A5019A remove_body3C68E11703C1 "GeneralizableElement::removeGeneralization"
        Generalization ret=null;
        if(generalization1==null || !generalization.contains(generalization1)){
          throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = generalization1;
        generalization.remove(generalization1);
        generalization1._unlinkChild(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeGeneralization"));
        return ret;
        // -end- 335C14A5019A remove_body3C68E11703C1 "GeneralizableElement::removeGeneralization"
      }

      /** tests if a given Generalization is connected.
       *  @see #addGeneralization
       */
      // -beg- preserve=no 335C14A5019A test_head3C68E11703C1 "GeneralizableElement::containsGeneralization"
      public boolean containsGeneralization(Generalization generalization1)
      // -end- 335C14A5019A test_head3C68E11703C1 "GeneralizableElement::containsGeneralization"
      {
        // -beg- preserve=no 335C14A5019A test_body3C68E11703C1 "GeneralizableElement::containsGeneralization"
        return generalization.contains(generalization1);
        // -end- 335C14A5019A test_body3C68E11703C1 "GeneralizableElement::containsGeneralization"
      }

      /** used to enumerate all connected Generalizations.
       *  @see #addGeneralization
       */
      // -beg- preserve=no 335C14A5019A get_all_head3C68E11703C1 "GeneralizableElement::iteratorGeneralization"
      public java.util.Iterator iteratorGeneralization()
      // -end- 335C14A5019A get_all_head3C68E11703C1 "GeneralizableElement::iteratorGeneralization"
      {
        // -beg- preserve=no 335C14A5019A get_all_body3C68E11703C1 "GeneralizableElement::iteratorGeneralization"
        return generalization.iterator();
        // -end- 335C14A5019A get_all_body3C68E11703C1 "GeneralizableElement::iteratorGeneralization"
      }

      /** disconnect all Generalizations.
       *  @see #addGeneralization
       */
      // -beg- preserve=no 335C14A5019A remove_all_head3C68E11703C1 "GeneralizableElement::clearGeneralization"
      public void clearGeneralization()
      // -end- 335C14A5019A remove_all_head3C68E11703C1 "GeneralizableElement::clearGeneralization"
      {
        // -beg- preserve=no 335C14A5019A remove_all_body3C68E11703C1 "GeneralizableElement::clearGeneralization"
        if(sizeGeneralization()>0){
          for(java.util.Iterator p = generalization.iterator(); p.hasNext();){
            ((Generalization)p.next())._unlinkChild(this);
          }
          generalization.clear();
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearGeneralization"));
        }
        // -end- 335C14A5019A remove_all_body3C68E11703C1 "GeneralizableElement::clearGeneralization"
      }

      /** returns the number of Generalizations.
       *  @see #addGeneralization
       */
      // -beg- preserve=no 335C14A5019A size_head3C68E11703C1 "GeneralizableElement::sizeGeneralization"
      public int sizeGeneralization()
      // -end- 335C14A5019A size_head3C68E11703C1 "GeneralizableElement::sizeGeneralization"
      {
        // -beg- preserve=no 335C14A5019A size_body3C68E11703C1 "GeneralizableElement::sizeGeneralization"
        return generalization.size();
        // -end- 335C14A5019A size_body3C68E11703C1 "GeneralizableElement::sizeGeneralization"
      }

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 335C14A5019A _link_body3C68E11703C1 "GeneralizableElement::_linkGeneralization"
      public void _linkGeneralization(Generalization generalization1)
      {
        generalization.add(generalization1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkGeneralization"));
        return;
      }
      // -end- 335C14A5019A _link_body3C68E11703C1 "GeneralizableElement::_linkGeneralization"

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 335C14A5019A _unlink_body3C68E11703C1 "GeneralizableElement::_unlinkGeneralization"
      public void _unlinkGeneralization(Generalization generalization1)
      {
        generalization.remove(generalization1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkGeneralization"));
        return;
      }
      // -end- 335C14A5019A _unlink_body3C68E11703C1 "GeneralizableElement::_unlinkGeneralization"

      // -beg- preserve=no 335C146B01D6 code3C68E11703C1 "specialization"
      private java.util.Set specialization = new java.util.HashSet();
      // -end- 335C146B01D6 code3C68E11703C1 "specialization"

      /** add a Specialization.
       *  
       *  @see #removeSpecialization
       *  @see #containsSpecialization
       *  @see #iteratorSpecialization
       *  @see #clearSpecialization
       *  @see #sizeSpecialization
       */
      // -beg- preserve=no 335C146B01D6 add_head3C68E11703C1 "GeneralizableElement::addSpecialization"
      public void addSpecialization(Generalization specialization1)
      // -end- 335C146B01D6 add_head3C68E11703C1 "GeneralizableElement::addSpecialization"
      {
        // -beg- preserve=no 335C146B01D6 add_body3C68E11703C1 "GeneralizableElement::addSpecialization"
        specialization.add(specialization1);
        specialization1._linkParent(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecialization"));
        return;
        // -end- 335C146B01D6 add_body3C68E11703C1 "GeneralizableElement::addSpecialization"
      }

      /** disconnect a Specialization.
       *  @see #addSpecialization
       */
      // -beg- preserve=no 335C146B01D6 remove_head3C68E11703C1 "GeneralizableElement::removeSpecialization"
      public Generalization removeSpecialization(Generalization specialization1)
      // -end- 335C146B01D6 remove_head3C68E11703C1 "GeneralizableElement::removeSpecialization"
      {
        // -beg- preserve=no 335C146B01D6 remove_body3C68E11703C1 "GeneralizableElement::removeSpecialization"
        Generalization ret=null;
        if(specialization1==null || !specialization.contains(specialization1)){
          throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = specialization1;
        specialization.remove(specialization1);
        specialization1._unlinkParent(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecialization"));
        return ret;
        // -end- 335C146B01D6 remove_body3C68E11703C1 "GeneralizableElement::removeSpecialization"
      }

      /** tests if a given Specialization is connected.
       *  @see #addSpecialization
       */
      // -beg- preserve=no 335C146B01D6 test_head3C68E11703C1 "GeneralizableElement::containsSpecialization"
      public boolean containsSpecialization(Generalization specialization1)
      // -end- 335C146B01D6 test_head3C68E11703C1 "GeneralizableElement::containsSpecialization"
      {
        // -beg- preserve=no 335C146B01D6 test_body3C68E11703C1 "GeneralizableElement::containsSpecialization"
        return specialization.contains(specialization1);
        // -end- 335C146B01D6 test_body3C68E11703C1 "GeneralizableElement::containsSpecialization"
      }

      /** used to enumerate all connected Specializations.
       *  @see #addSpecialization
       */
      // -beg- preserve=no 335C146B01D6 get_all_head3C68E11703C1 "GeneralizableElement::iteratorSpecialization"
      public java.util.Iterator iteratorSpecialization()
      // -end- 335C146B01D6 get_all_head3C68E11703C1 "GeneralizableElement::iteratorSpecialization"
      {
        // -beg- preserve=no 335C146B01D6 get_all_body3C68E11703C1 "GeneralizableElement::iteratorSpecialization"
        return specialization.iterator();
        // -end- 335C146B01D6 get_all_body3C68E11703C1 "GeneralizableElement::iteratorSpecialization"
      }

      /** disconnect all Specializations.
       *  @see #addSpecialization
       */
      // -beg- preserve=no 335C146B01D6 remove_all_head3C68E11703C1 "GeneralizableElement::clearSpecialization"
      public void clearSpecialization()
      // -end- 335C146B01D6 remove_all_head3C68E11703C1 "GeneralizableElement::clearSpecialization"
      {
        // -beg- preserve=no 335C146B01D6 remove_all_body3C68E11703C1 "GeneralizableElement::clearSpecialization"
        if(sizeSpecialization()>0){
          for(java.util.Iterator p = specialization.iterator(); p.hasNext();){
            ((Generalization)p.next())._unlinkParent(this);
          }
          specialization.clear();
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecialization"));
        }
        // -end- 335C146B01D6 remove_all_body3C68E11703C1 "GeneralizableElement::clearSpecialization"
      }

      /** returns the number of Specializations.
       *  @see #addSpecialization
       */
      // -beg- preserve=no 335C146B01D6 size_head3C68E11703C1 "GeneralizableElement::sizeSpecialization"
      public int sizeSpecialization()
      // -end- 335C146B01D6 size_head3C68E11703C1 "GeneralizableElement::sizeSpecialization"
      {
        // -beg- preserve=no 335C146B01D6 size_body3C68E11703C1 "GeneralizableElement::sizeSpecialization"
        return specialization.size();
        // -end- 335C146B01D6 size_body3C68E11703C1 "GeneralizableElement::sizeSpecialization"
      }

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 335C146B01D6 _link_body3C68E11703C1 "GeneralizableElement::_linkSpecialization"
      public void _linkSpecialization(Generalization specialization1)
      {
        specialization.add(specialization1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecialization"));
        return;
      }
      // -end- 335C146B01D6 _link_body3C68E11703C1 "GeneralizableElement::_linkSpecialization"

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 335C146B01D6 _unlink_body3C68E11703C1 "GeneralizableElement::_unlinkSpecialization"
      public void _unlinkSpecialization(Generalization specialization1)
      {
        specialization.remove(specialization1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecialization"));
        return;
      }
      // -end- 335C146B01D6 _unlink_body3C68E11703C1 "GeneralizableElement::_unlinkSpecialization"

      // -beg- preserve=no 327A877801CC var3C68E11703C1 "isRoot"
      private boolean isRoot;
      // -end- 327A877801CC var3C68E11703C1 "isRoot"

      /** get current value of isRoot
       *  @see #setRoot
       */
      // -beg- preserve=no 327A877801CC get_head3C68E11703C1 "isRoot"
      public  boolean isRoot()
      // -end- 327A877801CC get_head3C68E11703C1 "isRoot"
      {
        // -beg- preserve=no 327A877801CC get_body3C68E11703C1 "isRoot"
        return isRoot;
        // -end- 327A877801CC get_body3C68E11703C1 "isRoot"
      }

      /** set current value of isRoot
       *  @see #isRoot
       */
      // -beg- preserve=no 327A877801CC set_head3C68E11703C1 "isRoot"
      public  void setRoot(boolean value1)
      // -end- 327A877801CC set_head3C68E11703C1 "isRoot"
      {
        // -beg- preserve=no 327A877801CC set_body3C68E11703C1 "isRoot"
        if(isRoot != value1){
          isRoot = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
        }
        // -end- 327A877801CC set_body3C68E11703C1 "isRoot"
      }

      // -beg- preserve=no 327A877E006E var3C68E11703C1 "isLeaf"
      private boolean isLeaf;
      // -end- 327A877E006E var3C68E11703C1 "isLeaf"

      /** get current value of isLeaf
       *  @see #setLeaf
       */
      // -beg- preserve=no 327A877E006E get_head3C68E11703C1 "isLeaf"
      public  boolean isLeaf()
      // -end- 327A877E006E get_head3C68E11703C1 "isLeaf"
      {
        // -beg- preserve=no 327A877E006E get_body3C68E11703C1 "isLeaf"
        return isLeaf;
        // -end- 327A877E006E get_body3C68E11703C1 "isLeaf"
      }

      /** set current value of isLeaf
       *  @see #isLeaf
       */
      // -beg- preserve=no 327A877E006E set_head3C68E11703C1 "isLeaf"
      public  void setLeaf(boolean value1)
      // -end- 327A877E006E set_head3C68E11703C1 "isLeaf"
      {
        // -beg- preserve=no 327A877E006E set_body3C68E11703C1 "isLeaf"
        if(isLeaf != value1){
          isLeaf = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
        }
        // -end- 327A877E006E set_body3C68E11703C1 "isLeaf"
      }

      // -beg- preserve=no 327A878400D2 var3C68E11703C1 "isAbstract"
      private boolean isAbstract;
      // -end- 327A878400D2 var3C68E11703C1 "isAbstract"

      /** get current value of isAbstract
       *  @see #setAbstract
       */
      // -beg- preserve=no 327A878400D2 get_head3C68E11703C1 "isAbstract"
      public  boolean isAbstract()
      // -end- 327A878400D2 get_head3C68E11703C1 "isAbstract"
      {
        // -beg- preserve=no 327A878400D2 get_body3C68E11703C1 "isAbstract"
        return isAbstract;
        // -end- 327A878400D2 get_body3C68E11703C1 "isAbstract"
      }

      /** set current value of isAbstract
       *  @see #isAbstract
       */
      // -beg- preserve=no 327A878400D2 set_head3C68E11703C1 "isAbstract"
      public  void setAbstract(boolean value1)
      // -end- 327A878400D2 set_head3C68E11703C1 "isAbstract"
      {
        // -beg- preserve=no 327A878400D2 set_body3C68E11703C1 "isAbstract"
        if(isAbstract != value1){
          isAbstract = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
        }
        // -end- 327A878400D2 set_body3C68E11703C1 "isAbstract"
      }

      public NlsString getMetaAttrb(){
    		 return super.getMetaAttrb();
    	  }
    	  
	  public void setMetaAttrb(NlsString value) {
		  super.setMettaAttrb(value);	
	  }

      // declare/define something only in the code
      // please fill in/modify the following section
      // -beg- preserve=no 3C68E11703C1 detail_end "UmlPackage"

      // -end- 3C68E11703C1 detail_end "UmlPackage"

    }

