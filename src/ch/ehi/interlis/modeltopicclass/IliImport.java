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


              // -beg- preserve=no 3940AEA40090 package "IliImport"
package ch.ehi.interlis.modeltopicclass;
              // -end- 3940AEA40090 package "IliImport"

              // -beg- preserve=no 3940AEA40090 autoimport "IliImport"
              import ch.ehi.uml1_4.foundation.core.Permission;
              import ch.ehi.uml1_4.implementation.AbstractDependency;
              import ch.ehi.uml1_4.foundation.core.ModelElement;
              import ch.ehi.basics.tools.AbstractVisitor;
              import ch.ehi.uml1_4.foundation.core.PresentationElement;
              import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
              import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
              import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
              import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
              import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
              import ch.ehi.uml1_4.foundation.core.Namespace;
              import ch.ehi.uml1_4.foundation.core.ElementOwnership;
              import ch.ehi.uml1_4.foundation.core.Dependency;
              import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
              import ch.ehi.uml1_4.foundation.core.Constraint;
              import ch.ehi.uml1_4.foundation.core.Component;
              import ch.ehi.uml1_4.foundation.core.ElementResidence;
              import ch.ehi.uml1_4.foundation.core.TemplateParameter;
              import ch.ehi.uml1_4.foundation.core.Flow;
              import ch.ehi.uml1_4.foundation.core.Comment;
              import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
              import ch.ehi.uml1_4.modelmanagement.Package;
              import ch.ehi.uml1_4.modelmanagement.ElementImport;
              import ch.ehi.basics.types.NlsString;
              // -end- 3940AEA40090 autoimport "IliImport"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3940AEA40090 import "IliImport"

              // -end- 3940AEA40090 import "IliImport"

              /** Definiert eine Abhaengigkeit von einem anderen Modell.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:42 $
               */
public class IliImport extends AbstractDependency implements Permission , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3940AEA40090 detail_begin "IliImport"

                // -end- 3940AEA40090 detail_begin "IliImport"

                // -beg- preserve=no 3D4FA219037A head3940AEA40090 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA219037A head3940AEA40090 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA219037A throws3940AEA40090 "unlinkAll"

                  // -end- 3D4FA219037A throws3940AEA40090 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA219037A body3940AEA40090 "unlinkAll"
                  
                  clearClient();
                  clearSupplier();
                  clearPresentation();
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
                  clearLanguages();
                  // Role EditorTreeElement: EditorTreeElement object(s) may point to this
                  setName(null);
                  setDocumentation(null);
                  super.unlinkAll();
                  // -end- 3D4FA219037A body3940AEA40090 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA2190384 head3940AEA40090 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA2190384 head3940AEA40090 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA2190384 throws3940AEA40090 "enumerateChildren"

                  // -end- 3D4FA2190384 throws3940AEA40090 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA2190384 body3940AEA40090 "enumerateChildren"
                  java.util.Iterator it=null;
                  it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorLanguages();while(it.hasNext())visitor.visit(it.next());
                  visitor.visit(getName());
                  visitor.visit(getDocumentation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA2190384 body3940AEA40090 "enumerateChildren"
                  }

                // -beg- preserve=no 33FFE57B03B3 code3940AEA40090 "client"

                // -end- 33FFE57B03B3 code3940AEA40090 "client"

                /** add a Client.
                 *  
                 *  @see #removeClient
                 *  @see #containsClient
                 *  @see #iteratorClient
                 *  @see #clearClient
                 *  @see #sizeClient
                 */
                // -beg- preserve=no 33FFE57B03B3 add_head3940AEA40090 "Dependency::addClient"
                public void addClient(ModelElement client1)
                // -end- 33FFE57B03B3 add_head3940AEA40090 "Dependency::addClient"
                {
                  // -beg- preserve=no 33FFE57B03B3 add_body3940AEA40090 "Dependency::addClient"
                  super.addClient(client1);
                  // -end- 33FFE57B03B3 add_body3940AEA40090 "Dependency::addClient"
                }

                /** disconnect a Client.
                 *  @see #addClient
                 */
                // -beg- preserve=no 33FFE57B03B3 remove_head3940AEA40090 "Dependency::removeClient"
                public ModelElement removeClient(ModelElement client1)
                // -end- 33FFE57B03B3 remove_head3940AEA40090 "Dependency::removeClient"
                {
                  // -beg- preserve=no 33FFE57B03B3 remove_body3940AEA40090 "Dependency::removeClient"
                  return super.removeClient(client1);
                  // -end- 33FFE57B03B3 remove_body3940AEA40090 "Dependency::removeClient"
                }

                /** tests if a given Client is connected.
                 *  @see #addClient
                 */
                // -beg- preserve=no 33FFE57B03B3 test_head3940AEA40090 "Dependency::containsClient"
                public boolean containsClient(ModelElement client1)
                // -end- 33FFE57B03B3 test_head3940AEA40090 "Dependency::containsClient"
                {
                  // -beg- preserve=no 33FFE57B03B3 test_body3940AEA40090 "Dependency::containsClient"
                  return super.containsClient(client1);
                  // -end- 33FFE57B03B3 test_body3940AEA40090 "Dependency::containsClient"
                }

                /** used to enumerate all connected Clients.
                 *  @see #addClient
                 */
                // -beg- preserve=no 33FFE57B03B3 get_all_head3940AEA40090 "Dependency::iteratorClient"
                public java.util.Iterator iteratorClient()
                // -end- 33FFE57B03B3 get_all_head3940AEA40090 "Dependency::iteratorClient"
                {
                  // -beg- preserve=no 33FFE57B03B3 get_all_body3940AEA40090 "Dependency::iteratorClient"
                  return super.iteratorClient();
                  // -end- 33FFE57B03B3 get_all_body3940AEA40090 "Dependency::iteratorClient"
                }

                /** disconnect all Clients.
                 *  @see #addClient
                 */
                // -beg- preserve=no 33FFE57B03B3 remove_all_head3940AEA40090 "Dependency::clearClient"
                public void clearClient()
                // -end- 33FFE57B03B3 remove_all_head3940AEA40090 "Dependency::clearClient"
                {
                  // -beg- preserve=no 33FFE57B03B3 remove_all_body3940AEA40090 "Dependency::clearClient"
                  super.clearClient();
                  // -end- 33FFE57B03B3 remove_all_body3940AEA40090 "Dependency::clearClient"
                }

                /** returns the number of Clients.
                 *  @see #addClient
                 */
                // -beg- preserve=no 33FFE57B03B3 size_head3940AEA40090 "Dependency::sizeClient"
                public int sizeClient()
                // -end- 33FFE57B03B3 size_head3940AEA40090 "Dependency::sizeClient"
                {
                  // -beg- preserve=no 33FFE57B03B3 size_body3940AEA40090 "Dependency::sizeClient"
                  return super.sizeClient();
                  // -end- 33FFE57B03B3 size_body3940AEA40090 "Dependency::sizeClient"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33FFE57B03B3 _link_body3940AEA40090 "Dependency::_linkClient"
                public void _linkClient(ModelElement client1)
                {
                  super._linkClient(client1);
                }
                // -end- 33FFE57B03B3 _link_body3940AEA40090 "Dependency::_linkClient"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33FFE57B03B3 _unlink_body3940AEA40090 "Dependency::_unlinkClient"
                public void _unlinkClient(ModelElement client1)
                {
                  super._unlinkClient(client1);
                }
                // -end- 33FFE57B03B3 _unlink_body3940AEA40090 "Dependency::_unlinkClient"

                // -beg- preserve=no 335C0D7A02E4 code3940AEA40090 "supplier"

                // -end- 335C0D7A02E4 code3940AEA40090 "supplier"

                /** add a Supplier.
                 *  
                 *  @see #removeSupplier
                 *  @see #containsSupplier
                 *  @see #iteratorSupplier
                 *  @see #clearSupplier
                 *  @see #sizeSupplier
                 */
                // -beg- preserve=no 335C0D7A02E4 add_head3940AEA40090 "Dependency::addSupplier"
                public void addSupplier(ModelElement supplier1)
                // -end- 335C0D7A02E4 add_head3940AEA40090 "Dependency::addSupplier"
                {
                  // -beg- preserve=no 335C0D7A02E4 add_body3940AEA40090 "Dependency::addSupplier"
                  super.addSupplier(supplier1);
                  // -end- 335C0D7A02E4 add_body3940AEA40090 "Dependency::addSupplier"
                }

                /** disconnect a Supplier.
                 *  @see #addSupplier
                 */
                // -beg- preserve=no 335C0D7A02E4 remove_head3940AEA40090 "Dependency::removeSupplier"
                public ModelElement removeSupplier(ModelElement supplier1)
                // -end- 335C0D7A02E4 remove_head3940AEA40090 "Dependency::removeSupplier"
                {
                  // -beg- preserve=no 335C0D7A02E4 remove_body3940AEA40090 "Dependency::removeSupplier"
                  return super.removeSupplier(supplier1);
                  // -end- 335C0D7A02E4 remove_body3940AEA40090 "Dependency::removeSupplier"
                }

                /** tests if a given Supplier is connected.
                 *  @see #addSupplier
                 */
                // -beg- preserve=no 335C0D7A02E4 test_head3940AEA40090 "Dependency::containsSupplier"
                public boolean containsSupplier(ModelElement supplier1)
                // -end- 335C0D7A02E4 test_head3940AEA40090 "Dependency::containsSupplier"
                {
                  // -beg- preserve=no 335C0D7A02E4 test_body3940AEA40090 "Dependency::containsSupplier"
                  return super.containsSupplier(supplier1);
                  // -end- 335C0D7A02E4 test_body3940AEA40090 "Dependency::containsSupplier"
                }

                /** used to enumerate all connected Suppliers.
                 *  @see #addSupplier
                 */
                // -beg- preserve=no 335C0D7A02E4 get_all_head3940AEA40090 "Dependency::iteratorSupplier"
                public java.util.Iterator iteratorSupplier()
                // -end- 335C0D7A02E4 get_all_head3940AEA40090 "Dependency::iteratorSupplier"
                {
                  // -beg- preserve=no 335C0D7A02E4 get_all_body3940AEA40090 "Dependency::iteratorSupplier"
                  return super.iteratorSupplier();
                  // -end- 335C0D7A02E4 get_all_body3940AEA40090 "Dependency::iteratorSupplier"
                }

                /** disconnect all Suppliers.
                 *  @see #addSupplier
                 */
                // -beg- preserve=no 335C0D7A02E4 remove_all_head3940AEA40090 "Dependency::clearSupplier"
                public void clearSupplier()
                // -end- 335C0D7A02E4 remove_all_head3940AEA40090 "Dependency::clearSupplier"
                {
                  // -beg- preserve=no 335C0D7A02E4 remove_all_body3940AEA40090 "Dependency::clearSupplier"
                  super.clearSupplier();
                  // -end- 335C0D7A02E4 remove_all_body3940AEA40090 "Dependency::clearSupplier"
                }

                /** returns the number of Suppliers.
                 *  @see #addSupplier
                 */
                // -beg- preserve=no 335C0D7A02E4 size_head3940AEA40090 "Dependency::sizeSupplier"
                public int sizeSupplier()
                // -end- 335C0D7A02E4 size_head3940AEA40090 "Dependency::sizeSupplier"
                {
                  // -beg- preserve=no 335C0D7A02E4 size_body3940AEA40090 "Dependency::sizeSupplier"
                  return super.sizeSupplier();
                  // -end- 335C0D7A02E4 size_body3940AEA40090 "Dependency::sizeSupplier"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 335C0D7A02E4 _link_body3940AEA40090 "Dependency::_linkSupplier"
                public void _linkSupplier(ModelElement supplier1)
                {
                  super._linkSupplier(supplier1);
                }
                // -end- 335C0D7A02E4 _link_body3940AEA40090 "Dependency::_linkSupplier"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 335C0D7A02E4 _unlink_body3940AEA40090 "Dependency::_unlinkSupplier"
                public void _unlinkSupplier(ModelElement supplier1)
                {
                  super._unlinkSupplier(supplier1);
                }
                // -end- 335C0D7A02E4 _unlink_body3940AEA40090 "Dependency::_unlinkSupplier"

                /** method exists to prevent "unexpected Element" messages when reading pre 3.8.0 .uml-files 
                 * @deprecated
                 */
                public  void setLanguage(String value1)
                {
                }


                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=yes 3940AEA40090 detail_end "IliImport"
                private java.util.Map<String,StringPair> languages=null;
                private java.util.List<StringPair> languages_raw=new java.util.ArrayList<StringPair>();
                public java.util.Iterator<StringPair> iteratorLanguages()
                {
                    initLanguages();
                    return languages.values().iterator();
                }
                private void clearLanguages() {
                    languages_raw.clear();
                    languages=null;
                }
                public void addLanguages(StringPair entry)
                {
                    languages_raw.add(entry);
                }
                private void initLanguages()
                {
                    if(languages!=null) {
                        return;
                    }
                    languages=new java.util.HashMap<String,StringPair>();
                    for(StringPair entry:languages_raw) {
                        languages.put(entry.getKey(),entry);
                    }
                }
                public void addImportLanguage(String clientLanguage, String supplierLanguage)
                {
                    initLanguages();
                    languages.put(clientLanguage,new StringPair(clientLanguage, supplierLanguage));
                }
                public String getSupplierLanguage(String clientLanguage) {
                    initLanguages();
                    StringPair entry= languages.get(clientLanguage);
                    if(entry==null) {
                        return null;
                    }
                    return entry.getValue();
                }
                // -end- 3940AEA40090 detail_end "IliImport"


              }

