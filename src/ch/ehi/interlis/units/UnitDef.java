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


          // -beg- preserve=no 3940EC1D0094 package "UnitDef"
package ch.ehi.interlis.units;
          // -end- 3940EC1D0094 package "UnitDef"

          // -beg- preserve=no 3940EC1D0094 autoimport "UnitDef"
          import ch.ehi.uml1_4.foundation.core.ModelElement;
          import ch.ehi.interlis.IliSyntax;
          import ch.ehi.uml1_4.implementation.AbstractModelElement;
          import ch.ehi.uml1_4.foundation.core.Namespace;
          import ch.ehi.uml1_4.foundation.core.ElementOwnership;
          import ch.ehi.interlis.units.DerivedUnit;
          import ch.ehi.interlis.units.ComposedUnit;
          import ch.ehi.interlis.units.StructuredUnit;
          import ch.ehi.interlis.domainsandconstants.basetypes.NumericalType;
          import ch.ehi.basics.types.NlsString;
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
          import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
          import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
          import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
          import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
          import ch.ehi.uml1_4.foundation.core.Dependency;
          import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
          import ch.ehi.uml1_4.foundation.core.Constraint;
          import ch.ehi.uml1_4.foundation.core.PresentationElement;
          import ch.ehi.uml1_4.foundation.core.Component;
          import ch.ehi.uml1_4.foundation.core.ElementResidence;
          import ch.ehi.uml1_4.foundation.core.TemplateParameter;
          import ch.ehi.uml1_4.foundation.core.Flow;
          import ch.ehi.uml1_4.foundation.core.Comment;
          import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
          import ch.ehi.uml1_4.modelmanagement.Package;
          import ch.ehi.uml1_4.modelmanagement.ElementImport;
          // -end- 3940EC1D0094 autoimport "UnitDef"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3940EC1D0094 import "UnitDef"

          // -end- 3940EC1D0094 import "UnitDef"

          /** Definition von Einheiten z.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:25 $
           */
public class UnitDef extends AbstractModelElement implements ModelElement , IliSyntax , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3940EC1D0094 detail_begin "UnitDef"

            // -end- 3940EC1D0094 detail_begin "UnitDef"

            // -beg- preserve=no 3D4FA2180116 head3940EC1D0094 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2180116 head3940EC1D0094 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180116 throws3940EC1D0094 "unlinkAll"

              // -end- 3D4FA2180116 throws3940EC1D0094 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180116 body3940EC1D0094 "unlinkAll"
              
              detachNamespace();
              // Role UnitDef: UnitDef object(s) may point to this
              detach_extends();
              detachDerivedUnit();
              detachComposedUnit();
              detachStructuredUnit();
              // Role ComposedUnitFactor: ComposedUnitFactor object(s) may point to this
              // Role StructuredUnitDim: StructuredUnitDim object(s) may point to this
              detachNumericalType();
              // Role NumericConst: NumericConst object(s) may point to this
              // Role StructUnitConst: StructUnitConst object(s) may point to this
              setName(null);
              setDescName(null);
              clearBehavior();
              clearPartition();
              clearCollaboration();
              clearClassifierRole();
              clearCollaborationInstanceSet();
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
              setSyntax(null);
              setDocumentation(null);
              super.unlinkAll();
              // -end- 3D4FA2180116 body3940EC1D0094 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2180120 head3940EC1D0094 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2180120 head3940EC1D0094 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180120 throws3940EC1D0094 "enumerateChildren"

              // -end- 3D4FA2180120 throws3940EC1D0094 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180120 body3940EC1D0094 "enumerateChildren"
              java.util.Iterator it=null;
              if(contains_extends())visitor.visit(get_extends());
              if(containsDerivedUnit())visitor.visit(getDerivedUnit());
              if(containsComposedUnit())visitor.visit(getComposedUnit());
              if(containsStructuredUnit())visitor.visit(getStructuredUnit());
              visitor.visit(getName());
              visitor.visit(getDescName());
              it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getSyntax());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3D4FA2180120 body3940EC1D0094 "enumerateChildren"
              }

            // -beg- preserve=no 33598CAA030E code3940EC1D0094 "namespace"

            // -end- 33598CAA030E code3940EC1D0094 "namespace"

            /** attaches a Namespace.
             *  Designates the Namespace that contains the ModelElement.
             *  @see #detachNamespace
             *  @see #getNamespace
             *  @see #containsNamespace
             *  @see #getNamespaceLink
             *  @see #createNamespaceLink
             */
            // -beg- preserve=no 33598CAA030E attach_head3940EC1D0094 "ModelElement::attachNamespace"
            public void attachNamespace(Namespace namespace1)
            // -end- 33598CAA030E attach_head3940EC1D0094 "ModelElement::attachNamespace"
            {
              // -beg- preserve=no 33598CAA030E attach_body3940EC1D0094 "ModelElement::attachNamespace"
              super.attachNamespace(namespace1);
              // -end- 33598CAA030E attach_body3940EC1D0094 "ModelElement::attachNamespace"
            }

            /** attaches a link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E attachlink_head3940EC1D0094 "ModelElement::attachNamespaceLink"
            public void attachNamespaceLink(ElementOwnership namespace1)
            // -end- 33598CAA030E attachlink_head3940EC1D0094 "ModelElement::attachNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E attachlink_body3940EC1D0094 "ModelElement::attachNamespaceLink"
              super.attachNamespaceLink(namespace1);
              // -end- 33598CAA030E attachlink_body3940EC1D0094 "ModelElement::attachNamespaceLink"
            }

            /** disconnect the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E detach_head3940EC1D0094 "ModelElement::detachNamespace"
            public Namespace detachNamespace()
            // -end- 33598CAA030E detach_head3940EC1D0094 "ModelElement::detachNamespace"
            {
              // -beg- preserve=no 33598CAA030E detach_body3940EC1D0094 "ModelElement::detachNamespace"
              return super.detachNamespace();
              // -end- 33598CAA030E detach_body3940EC1D0094 "ModelElement::detachNamespace"
            }

            /** get the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E get_head3940EC1D0094 "ModelElement::getNamespace"
            public Namespace getNamespace()
            // -end- 33598CAA030E get_head3940EC1D0094 "ModelElement::getNamespace"
            {
              // -beg- preserve=no 33598CAA030E get_body3940EC1D0094 "ModelElement::getNamespace"
              return super.getNamespace();
              // -end- 33598CAA030E get_body3940EC1D0094 "ModelElement::getNamespace"
            }

            /** get the link class of currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E getlink_head3940EC1D0094 "ModelElement::getNamespaceLink"
            public ElementOwnership getNamespaceLink()
            // -end- 33598CAA030E getlink_head3940EC1D0094 "ModelElement::getNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E getlink_body3940EC1D0094 "ModelElement::getNamespaceLink"
              return super.getNamespaceLink();
              // -end- 33598CAA030E getlink_body3940EC1D0094 "ModelElement::getNamespaceLink"
            }

            /** create a link class for a new link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E createlink_head3940EC1D0094 "ModelElement::createNamespaceLink"
            public ElementOwnership createNamespaceLink()
            // -end- 33598CAA030E createlink_head3940EC1D0094 "ModelElement::createNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E createlink_body3940EC1D0094 "ModelElement::createNamespaceLink"
              return super.createNamespaceLink();
              // -end- 33598CAA030E createlink_body3940EC1D0094 "ModelElement::createNamespaceLink"
            }

            /** tests if there is a Namespace attached.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E test_head3940EC1D0094 "ModelElement::containsNamespace"
            public boolean containsNamespace()
            // -end- 33598CAA030E test_head3940EC1D0094 "ModelElement::containsNamespace"
            {
              // -beg- preserve=no 33598CAA030E test_body3940EC1D0094 "ModelElement::containsNamespace"
              return super.containsNamespace();
              // -end- 33598CAA030E test_body3940EC1D0094 "ModelElement::containsNamespace"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _link_body3940EC1D0094 "ModelElement::_linkNamespace"
            public void _linkNamespace(ElementOwnership namespace1)
            {
              super._linkNamespace(namespace1);
            }
            // -end- 33598CAA030E _link_body3940EC1D0094 "ModelElement::_linkNamespace"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _unlink_body3940EC1D0094 "ModelElement::_unlinkNamespace"
            public void _unlinkNamespace(ElementOwnership namespace1)
            {
              super._unlinkNamespace(namespace1);
            }
            // -end- 33598CAA030E _unlink_body3940EC1D0094 "ModelElement::_unlinkNamespace"

            // -beg- preserve=no 3949E03F01AC code3940EC1D0094 "_extends"
            private UnitDef _extends;
            // -end- 3949E03F01AC code3940EC1D0094 "_extends"

            /** attaches a _extends.
             *  
             *  @see #detach_extends
             *  @see #get_extends
             *  @see #contains_extends
             */
            // -beg- preserve=no 3949E03F01AC attach_head3940EC1D0094 "UnitDef::attach_extends"
            public void attach_extends(UnitDef _extends1)
            // -end- 3949E03F01AC attach_head3940EC1D0094 "UnitDef::attach_extends"
            {
              // -beg- preserve=no 3949E03F01AC attach_body3940EC1D0094 "UnitDef::attach_extends"
              if(_extends!=null) {throw new java.lang.IllegalStateException("already a _extends attached");}
              if(_extends1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as _extends");}
              _extends = _extends1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attach_extends"));
              return;
              // -end- 3949E03F01AC attach_body3940EC1D0094 "UnitDef::attach_extends"
            }

            /** disconnect the currently attached _extends.
             *  @see #attach_extends
             */
            // -beg- preserve=no 3949E03F01AC detach_head3940EC1D0094 "UnitDef::detach_extends"
            public UnitDef detach_extends()
            // -end- 3949E03F01AC detach_head3940EC1D0094 "UnitDef::detach_extends"
            {
              // -beg- preserve=no 3949E03F01AC detach_body3940EC1D0094 "UnitDef::detach_extends"
              UnitDef ret = null;
              ret = _extends;
              _extends = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detach_extends"));
              return ret;
              // -end- 3949E03F01AC detach_body3940EC1D0094 "UnitDef::detach_extends"
            }

            /** get the currently attached _extends.
             *  @see #attach_extends
             */
            // -beg- preserve=no 3949E03F01AC get_head3940EC1D0094 "UnitDef::get_extends"
            public UnitDef get_extends()
            // -end- 3949E03F01AC get_head3940EC1D0094 "UnitDef::get_extends"
            {
              // -beg- preserve=no 3949E03F01AC get_body3940EC1D0094 "UnitDef::get_extends"
              if(_extends==null) {throw new java.lang.IllegalStateException("no _extends attached");}
              return _extends;
              // -end- 3949E03F01AC get_body3940EC1D0094 "UnitDef::get_extends"
            }

            /** tests if there is a _extends attached.
             *  @see #attach_extends
             */
            // -beg- preserve=no 3949E03F01AC test_head3940EC1D0094 "UnitDef::contains_extends"
            public boolean contains_extends()
            // -end- 3949E03F01AC test_head3940EC1D0094 "UnitDef::contains_extends"
            {
              // -beg- preserve=no 3949E03F01AC test_body3940EC1D0094 "UnitDef::contains_extends"
              return _extends!=null;
              // -end- 3949E03F01AC test_body3940EC1D0094 "UnitDef::contains_extends"
            }

            // -beg- preserve=no 3949E1A2012A code3940EC1D0094 "derivedUnit"
            private DerivedUnit derivedUnit;
            // -end- 3949E1A2012A code3940EC1D0094 "derivedUnit"

            /** attaches a DerivedUnit.
             *  
             *  @see #detachDerivedUnit
             *  @see #getDerivedUnit
             *  @see #containsDerivedUnit
             */
            // -beg- preserve=no 3949E1A2012A attach_head3940EC1D0094 "UnitDef::attachDerivedUnit"
            public void attachDerivedUnit(DerivedUnit derivedUnit1)
            // -end- 3949E1A2012A attach_head3940EC1D0094 "UnitDef::attachDerivedUnit"
            {
              // -beg- preserve=no 3949E1A2012A attach_body3940EC1D0094 "UnitDef::attachDerivedUnit"
              if(derivedUnit!=null) {throw new java.lang.IllegalStateException("already a derivedUnit attached");}
              if(derivedUnit1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as derivedUnit");}
              derivedUnit = derivedUnit1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDerivedUnit"));
              return;
              // -end- 3949E1A2012A attach_body3940EC1D0094 "UnitDef::attachDerivedUnit"
            }

            /** disconnect the currently attached DerivedUnit.
             *  @see #attachDerivedUnit
             */
            // -beg- preserve=no 3949E1A2012A detach_head3940EC1D0094 "UnitDef::detachDerivedUnit"
            public DerivedUnit detachDerivedUnit()
            // -end- 3949E1A2012A detach_head3940EC1D0094 "UnitDef::detachDerivedUnit"
            {
              // -beg- preserve=no 3949E1A2012A detach_body3940EC1D0094 "UnitDef::detachDerivedUnit"
              DerivedUnit ret = null;
              ret = derivedUnit;
              derivedUnit = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDerivedUnit"));
              return ret;
              // -end- 3949E1A2012A detach_body3940EC1D0094 "UnitDef::detachDerivedUnit"
            }

            /** get the currently attached DerivedUnit.
             *  @see #attachDerivedUnit
             */
            // -beg- preserve=no 3949E1A2012A get_head3940EC1D0094 "UnitDef::getDerivedUnit"
            public DerivedUnit getDerivedUnit()
            // -end- 3949E1A2012A get_head3940EC1D0094 "UnitDef::getDerivedUnit"
            {
              // -beg- preserve=no 3949E1A2012A get_body3940EC1D0094 "UnitDef::getDerivedUnit"
              if(derivedUnit==null) {throw new java.lang.IllegalStateException("no derivedUnit attached");}
              return derivedUnit;
              // -end- 3949E1A2012A get_body3940EC1D0094 "UnitDef::getDerivedUnit"
            }

            /** tests if there is a DerivedUnit attached.
             *  @see #attachDerivedUnit
             */
            // -beg- preserve=no 3949E1A2012A test_head3940EC1D0094 "UnitDef::containsDerivedUnit"
            public boolean containsDerivedUnit()
            // -end- 3949E1A2012A test_head3940EC1D0094 "UnitDef::containsDerivedUnit"
            {
              // -beg- preserve=no 3949E1A2012A test_body3940EC1D0094 "UnitDef::containsDerivedUnit"
              return derivedUnit!=null;
              // -end- 3949E1A2012A test_body3940EC1D0094 "UnitDef::containsDerivedUnit"
            }

            // -beg- preserve=no 3949E1A500F3 code3940EC1D0094 "composedUnit"
            private ComposedUnit composedUnit;
            // -end- 3949E1A500F3 code3940EC1D0094 "composedUnit"

            /** attaches a ComposedUnit.
             *  
             *  @see #detachComposedUnit
             *  @see #getComposedUnit
             *  @see #containsComposedUnit
             */
            // -beg- preserve=no 3949E1A500F3 attach_head3940EC1D0094 "UnitDef::attachComposedUnit"
            public void attachComposedUnit(ComposedUnit composedUnit1)
            // -end- 3949E1A500F3 attach_head3940EC1D0094 "UnitDef::attachComposedUnit"
            {
              // -beg- preserve=no 3949E1A500F3 attach_body3940EC1D0094 "UnitDef::attachComposedUnit"
              if(composedUnit!=null) {throw new java.lang.IllegalStateException("already a composedUnit attached");}
              if(composedUnit1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as composedUnit");}
              composedUnit = composedUnit1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachComposedUnit"));
              return;
              // -end- 3949E1A500F3 attach_body3940EC1D0094 "UnitDef::attachComposedUnit"
            }

            /** disconnect the currently attached ComposedUnit.
             *  @see #attachComposedUnit
             */
            // -beg- preserve=no 3949E1A500F3 detach_head3940EC1D0094 "UnitDef::detachComposedUnit"
            public ComposedUnit detachComposedUnit()
            // -end- 3949E1A500F3 detach_head3940EC1D0094 "UnitDef::detachComposedUnit"
            {
              // -beg- preserve=no 3949E1A500F3 detach_body3940EC1D0094 "UnitDef::detachComposedUnit"
              ComposedUnit ret = null;
              ret = composedUnit;
              composedUnit = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachComposedUnit"));
              return ret;
              // -end- 3949E1A500F3 detach_body3940EC1D0094 "UnitDef::detachComposedUnit"
            }

            /** get the currently attached ComposedUnit.
             *  @see #attachComposedUnit
             */
            // -beg- preserve=no 3949E1A500F3 get_head3940EC1D0094 "UnitDef::getComposedUnit"
            public ComposedUnit getComposedUnit()
            // -end- 3949E1A500F3 get_head3940EC1D0094 "UnitDef::getComposedUnit"
            {
              // -beg- preserve=no 3949E1A500F3 get_body3940EC1D0094 "UnitDef::getComposedUnit"
              if(composedUnit==null) {throw new java.lang.IllegalStateException("no composedUnit attached");}
              return composedUnit;
              // -end- 3949E1A500F3 get_body3940EC1D0094 "UnitDef::getComposedUnit"
            }

            /** tests if there is a ComposedUnit attached.
             *  @see #attachComposedUnit
             */
            // -beg- preserve=no 3949E1A500F3 test_head3940EC1D0094 "UnitDef::containsComposedUnit"
            public boolean containsComposedUnit()
            // -end- 3949E1A500F3 test_head3940EC1D0094 "UnitDef::containsComposedUnit"
            {
              // -beg- preserve=no 3949E1A500F3 test_body3940EC1D0094 "UnitDef::containsComposedUnit"
              return composedUnit!=null;
              // -end- 3949E1A500F3 test_body3940EC1D0094 "UnitDef::containsComposedUnit"
            }

            // -beg- preserve=no 3949E1A80133 code3940EC1D0094 "structuredUnit"
            private StructuredUnit structuredUnit;
            // -end- 3949E1A80133 code3940EC1D0094 "structuredUnit"

            /** attaches a StructuredUnit.
             *  
             *  @see #detachStructuredUnit
             *  @see #getStructuredUnit
             *  @see #containsStructuredUnit
             */
            // -beg- preserve=no 3949E1A80133 attach_head3940EC1D0094 "UnitDef::attachStructuredUnit"
            public void attachStructuredUnit(StructuredUnit structuredUnit1)
            // -end- 3949E1A80133 attach_head3940EC1D0094 "UnitDef::attachStructuredUnit"
            {
              // -beg- preserve=no 3949E1A80133 attach_body3940EC1D0094 "UnitDef::attachStructuredUnit"
              if(structuredUnit!=null) {throw new java.lang.IllegalStateException("already a structuredUnit attached");}
              if(structuredUnit1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as structuredUnit");}
              structuredUnit = structuredUnit1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachStructuredUnit"));
              return;
              // -end- 3949E1A80133 attach_body3940EC1D0094 "UnitDef::attachStructuredUnit"
            }

            /** disconnect the currently attached StructuredUnit.
             *  @see #attachStructuredUnit
             */
            // -beg- preserve=no 3949E1A80133 detach_head3940EC1D0094 "UnitDef::detachStructuredUnit"
            public StructuredUnit detachStructuredUnit()
            // -end- 3949E1A80133 detach_head3940EC1D0094 "UnitDef::detachStructuredUnit"
            {
              // -beg- preserve=no 3949E1A80133 detach_body3940EC1D0094 "UnitDef::detachStructuredUnit"
              StructuredUnit ret = null;
              ret = structuredUnit;
              structuredUnit = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachStructuredUnit"));
              return ret;
              // -end- 3949E1A80133 detach_body3940EC1D0094 "UnitDef::detachStructuredUnit"
            }

            /** get the currently attached StructuredUnit.
             *  @see #attachStructuredUnit
             */
            // -beg- preserve=no 3949E1A80133 get_head3940EC1D0094 "UnitDef::getStructuredUnit"
            public StructuredUnit getStructuredUnit()
            // -end- 3949E1A80133 get_head3940EC1D0094 "UnitDef::getStructuredUnit"
            {
              // -beg- preserve=no 3949E1A80133 get_body3940EC1D0094 "UnitDef::getStructuredUnit"
              if(structuredUnit==null) {throw new java.lang.IllegalStateException("no structuredUnit attached");}
              return structuredUnit;
              // -end- 3949E1A80133 get_body3940EC1D0094 "UnitDef::getStructuredUnit"
            }

            /** tests if there is a StructuredUnit attached.
             *  @see #attachStructuredUnit
             */
            // -beg- preserve=no 3949E1A80133 test_head3940EC1D0094 "UnitDef::containsStructuredUnit"
            public boolean containsStructuredUnit()
            // -end- 3949E1A80133 test_head3940EC1D0094 "UnitDef::containsStructuredUnit"
            {
              // -beg- preserve=no 3949E1A80133 test_body3940EC1D0094 "UnitDef::containsStructuredUnit"
              return structuredUnit!=null;
              // -end- 3949E1A80133 test_body3940EC1D0094 "UnitDef::containsStructuredUnit"
            }

            // -beg- preserve=no 3948A0C1035D code3940EC1D0094 "numericalType"
            private NumericalType numericalType;
            // -end- 3948A0C1035D code3940EC1D0094 "numericalType"

            /** attaches a NumericalType.
             *  
             *  @see #detachNumericalType
             *  @see #getNumericalType
             *  @see #containsNumericalType
             */
            // -beg- preserve=no 3948A0C1035D attach_head3940EC1D0094 "UnitDef::attachNumericalType"
            public void attachNumericalType(NumericalType numericalType1)
            // -end- 3948A0C1035D attach_head3940EC1D0094 "UnitDef::attachNumericalType"
            {
              // -beg- preserve=no 3948A0C1035D attach_body3940EC1D0094 "UnitDef::attachNumericalType"
              if(numericalType!=null) {throw new java.lang.IllegalStateException("already a numericalType attached");}
              if(numericalType1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as numericalType");}
              numericalType = numericalType1;
              numericalType1._linkUnitDef(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNumericalType"));
              return;
              // -end- 3948A0C1035D attach_body3940EC1D0094 "UnitDef::attachNumericalType"
            }

            /** disconnect the currently attached NumericalType.
             *  @see #attachNumericalType
             */
            // -beg- preserve=no 3948A0C1035D detach_head3940EC1D0094 "UnitDef::detachNumericalType"
            public NumericalType detachNumericalType()
            // -end- 3948A0C1035D detach_head3940EC1D0094 "UnitDef::detachNumericalType"
            {
              // -beg- preserve=no 3948A0C1035D detach_body3940EC1D0094 "UnitDef::detachNumericalType"
              NumericalType ret = null;
              if(numericalType!=null){
                numericalType._unlinkUnitDef(this);
                ret = numericalType;
                numericalType = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachNumericalType"));
              return ret;
              // -end- 3948A0C1035D detach_body3940EC1D0094 "UnitDef::detachNumericalType"
            }

            /** get the currently attached NumericalType.
             *  @see #attachNumericalType
             */
            // -beg- preserve=no 3948A0C1035D get_head3940EC1D0094 "UnitDef::getNumericalType"
            public NumericalType getNumericalType()
            // -end- 3948A0C1035D get_head3940EC1D0094 "UnitDef::getNumericalType"
            {
              // -beg- preserve=no 3948A0C1035D get_body3940EC1D0094 "UnitDef::getNumericalType"
              if(numericalType==null) {throw new java.lang.IllegalStateException("no numericalType attached");}
              return numericalType;
              // -end- 3948A0C1035D get_body3940EC1D0094 "UnitDef::getNumericalType"
            }

            /** tests if there is a NumericalType attached.
             *  @see #attachNumericalType
             */
            // -beg- preserve=no 3948A0C1035D test_head3940EC1D0094 "UnitDef::containsNumericalType"
            public boolean containsNumericalType()
            // -end- 3948A0C1035D test_head3940EC1D0094 "UnitDef::containsNumericalType"
            {
              // -beg- preserve=no 3948A0C1035D test_body3940EC1D0094 "UnitDef::containsNumericalType"
              return numericalType!=null;
              // -end- 3948A0C1035D test_body3940EC1D0094 "UnitDef::containsNumericalType"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3948A0C1035D _link_body3940EC1D0094 "UnitDef::_linkNumericalType"
            public void _linkNumericalType(NumericalType numericalType1)
            {
              numericalType = numericalType1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkNumericalType"));
              return;
            }
            // -end- 3948A0C1035D _link_body3940EC1D0094 "UnitDef::_linkNumericalType"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3948A0C1035D _unlink_body3940EC1D0094 "UnitDef::_unlinkNumericalType"
            public void _unlinkNumericalType(NumericalType numericalType1)
            {
              numericalType = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkNumericalType"));
              return;
            }
            // -end- 3948A0C1035D _unlink_body3940EC1D0094 "UnitDef::_unlinkNumericalType"

            // -beg- preserve=no 3949DF3B00EA var3940EC1D0094 "name"

            // -end- 3949DF3B00EA var3940EC1D0094 "name"

            /** get current value of name
             *  short name of the unit
             *  @see #setName
             */
            // -beg- preserve=no 3949DF3B00EA get_head3940EC1D0094 "name"
            public  NlsString getName()
            // -end- 3949DF3B00EA get_head3940EC1D0094 "name"
            {
              // -beg- preserve=no 3949DF3B00EA get_body3940EC1D0094 "name"
              return super.getName();
              // -end- 3949DF3B00EA get_body3940EC1D0094 "name"
            }

            /** set current value of name
             *  @see #getName
             */
            // -beg- preserve=no 3949DF3B00EA set_head3940EC1D0094 "name"
            public  void setName(NlsString value1)
            // -end- 3949DF3B00EA set_head3940EC1D0094 "name"
            {
              // -beg- preserve=no 3949DF3B00EA set_body3940EC1D0094 "name"
              super.setName(value1);
              // -end- 3949DF3B00EA set_body3940EC1D0094 "name"
            }

            // -beg- preserve=no 3949DF400029 var3940EC1D0094 "descName"
            private NlsString descName = null;
            // -end- 3949DF400029 var3940EC1D0094 "descName"

            /** get current value of descName
             *  descriptive name of the unit.
             *  @see #setDescName
             */
            // -beg- preserve=no 3949DF400029 get_head3940EC1D0094 "descName"
            public  NlsString getDescName()
            // -end- 3949DF400029 get_head3940EC1D0094 "descName"
            {
              // -beg- preserve=no 3949DF400029 get_body3940EC1D0094 "descName"
              return descName;
              // -end- 3949DF400029 get_body3940EC1D0094 "descName"
            }

            /** set current value of descName
             *  @see #getDescName
             */
            // -beg- preserve=no 3949DF400029 set_head3940EC1D0094 "descName"
            public  void setDescName(NlsString value1)
            // -end- 3949DF400029 set_head3940EC1D0094 "descName"
            {
              // -beg- preserve=no 3949DF400029 set_body3940EC1D0094 "descName"
              if(descName!=value1 && (descName==null || !descName.equals(value1))){
                descName = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDescName"));
              }
              // -end- 3949DF400029 set_body3940EC1D0094 "descName"
            }

            // -beg- preserve=no 3949DF46024E var3940EC1D0094 "isAbstract"
            private boolean isAbstract;
            // -end- 3949DF46024E var3940EC1D0094 "isAbstract"

            /** get current value of isAbstract
             *  Abstrakte Einheit?
             *  @see #setAbstract
             */
            // -beg- preserve=no 3949DF46024E get_head3940EC1D0094 "isAbstract"
            public  boolean isAbstract()
            // -end- 3949DF46024E get_head3940EC1D0094 "isAbstract"
            {
              // -beg- preserve=no 3949DF46024E get_body3940EC1D0094 "isAbstract"
              return isAbstract;
              // -end- 3949DF46024E get_body3940EC1D0094 "isAbstract"
            }

            /** set current value of isAbstract
             *  @see #isAbstract
             */
            // -beg- preserve=no 3949DF46024E set_head3940EC1D0094 "isAbstract"
            public  void setAbstract(boolean value1)
            // -end- 3949DF46024E set_head3940EC1D0094 "isAbstract"
            {
              // -beg- preserve=no 3949DF46024E set_body3940EC1D0094 "isAbstract"
              if(isAbstract != value1){
                isAbstract = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
              }
              // -end- 3949DF46024E set_body3940EC1D0094 "isAbstract"
            }

            // -beg- preserve=no 3C8F5ABE022D var3940EC1D0094 "syntax"
            private NlsString syntax = null;
            // -end- 3C8F5ABE022D var3940EC1D0094 "syntax"

            /** get current value of syntax
             *  the actual definition of the model element in valid INTERLIS syntax.
             *  @see #setSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D get_head3940EC1D0094 "syntax"
            public  NlsString getSyntax()
            // -end- 3C8F5ABE022D get_head3940EC1D0094 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D get_body3940EC1D0094 "syntax"
              return syntax;
              // -end- 3C8F5ABE022D get_body3940EC1D0094 "syntax"
            }

            /** set current value of syntax
             *  @see #getSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D set_head3940EC1D0094 "syntax"
            public  void setSyntax(NlsString value1)
            // -end- 3C8F5ABE022D set_head3940EC1D0094 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D set_body3940EC1D0094 "syntax"
              if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                syntax = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
              }
              // -end- 3C8F5ABE022D set_body3940EC1D0094 "syntax"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3940EC1D0094 detail_end "UnitDef"

            // -end- 3940EC1D0094 detail_end "UnitDef"

          }

