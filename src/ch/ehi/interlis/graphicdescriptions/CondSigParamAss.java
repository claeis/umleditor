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


          // -beg- preserve=no 3961F7DF017A package "CondSigParamAss"
package ch.ehi.interlis.graphicdescriptions;
          // -end- 3961F7DF017A package "CondSigParamAss"

          // -beg- preserve=no 3961F7DF017A autoimport "CondSigParamAss"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.logicalexpressions.Term;
          import ch.ehi.interlis.graphicdescriptions.SigAssignment;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3961F7DF017A autoimport "CondSigParamAss"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3961F7DF017A import "CondSigParamAss"

          // -end- 3961F7DF017A import "CondSigParamAss"

          /** Definiert bedingte Zuweisungen für ein Signatur-Attribut.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:49 $
           */
public class CondSigParamAss extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3961F7DF017A detail_begin "CondSigParamAss"

            // -end- 3961F7DF017A detail_begin "CondSigParamAss"

            // -beg- preserve=no 3D4FA2190081 head3961F7DF017A "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2190081 head3961F7DF017A "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2190081 throws3961F7DF017A "unlinkAll"

              // -end- 3D4FA2190081 throws3961F7DF017A "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2190081 body3961F7DF017A "unlinkAll"
              
              // Role SignAttribute: SignAttribute object(s) may point to this
              detachWhere();
              clearSigAssignment();
              super.unlinkAll();
              // -end- 3D4FA2190081 body3961F7DF017A "unlinkAll"
              }

            // -beg- preserve=no 3D4FA219008B head3961F7DF017A "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA219008B head3961F7DF017A "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA219008B throws3961F7DF017A "enumerateChildren"

              // -end- 3D4FA219008B throws3961F7DF017A "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA219008B body3961F7DF017A "enumerateChildren"
              java.util.Iterator it=null;
              if(containsWhere())visitor.visit(getWhere());
              it=iteratorSigAssignment();while(it.hasNext())visitor.visit(it.next());
              super.enumerateChildren(visitor);
              // -end- 3D4FA219008B body3961F7DF017A "enumerateChildren"
              }

            // -beg- preserve=no 3961F8CF028E code3961F7DF017A "where"
            private Term where;
            // -end- 3961F8CF028E code3961F7DF017A "where"

            /** attaches a Where.
             *  
             *  @see #detachWhere
             *  @see #getWhere
             *  @see #containsWhere
             */
            // -beg- preserve=no 3961F8CF028E attach_head3961F7DF017A "CondSigParamAss::attachWhere"
            public void attachWhere(Term where1)
            // -end- 3961F8CF028E attach_head3961F7DF017A "CondSigParamAss::attachWhere"
            {
              // -beg- preserve=no 3961F8CF028E attach_body3961F7DF017A "CondSigParamAss::attachWhere"
              if(where!=null) {throw new java.lang.IllegalStateException("already a where attached");}
              if(where1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as where");}
              where = where1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachWhere"));
              return;
              // -end- 3961F8CF028E attach_body3961F7DF017A "CondSigParamAss::attachWhere"
            }

            /** disconnect the currently attached Where.
             *  @see #attachWhere
             */
            // -beg- preserve=no 3961F8CF028E detach_head3961F7DF017A "CondSigParamAss::detachWhere"
            public Term detachWhere()
            // -end- 3961F8CF028E detach_head3961F7DF017A "CondSigParamAss::detachWhere"
            {
              // -beg- preserve=no 3961F8CF028E detach_body3961F7DF017A "CondSigParamAss::detachWhere"
              Term ret = null;
              ret = where;
              where = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachWhere"));
              return ret;
              // -end- 3961F8CF028E detach_body3961F7DF017A "CondSigParamAss::detachWhere"
            }

            /** get the currently attached Where.
             *  @see #attachWhere
             */
            // -beg- preserve=no 3961F8CF028E get_head3961F7DF017A "CondSigParamAss::getWhere"
            public Term getWhere()
            // -end- 3961F8CF028E get_head3961F7DF017A "CondSigParamAss::getWhere"
            {
              // -beg- preserve=no 3961F8CF028E get_body3961F7DF017A "CondSigParamAss::getWhere"
              if(where==null) {throw new java.lang.IllegalStateException("no where attached");}
              return where;
              // -end- 3961F8CF028E get_body3961F7DF017A "CondSigParamAss::getWhere"
            }

            /** tests if there is a Where attached.
             *  @see #attachWhere
             */
            // -beg- preserve=no 3961F8CF028E test_head3961F7DF017A "CondSigParamAss::containsWhere"
            public boolean containsWhere()
            // -end- 3961F8CF028E test_head3961F7DF017A "CondSigParamAss::containsWhere"
            {
              // -beg- preserve=no 3961F8CF028E test_body3961F7DF017A "CondSigParamAss::containsWhere"
              return where!=null;
              // -end- 3961F8CF028E test_body3961F7DF017A "CondSigParamAss::containsWhere"
            }

            // -beg- preserve=no 3961F97801E8 code3961F7DF017A "sigAssignment"
            private java.util.Set sigAssignment = new java.util.HashSet();
            // -end- 3961F97801E8 code3961F7DF017A "sigAssignment"

            /** add a SigAssignment.
             *  
             *  @see #removeSigAssignment
             *  @see #containsSigAssignment
             *  @see #iteratorSigAssignment
             *  @see #clearSigAssignment
             *  @see #sizeSigAssignment
             */
            // -beg- preserve=no 3961F97801E8 add_head3961F7DF017A "CondSigParamAss::addSigAssignment"
            public void addSigAssignment(SigAssignment sigAssignment1)
            // -end- 3961F97801E8 add_head3961F7DF017A "CondSigParamAss::addSigAssignment"
            {
              // -beg- preserve=no 3961F97801E8 add_body3961F7DF017A "CondSigParamAss::addSigAssignment"
              sigAssignment.add(sigAssignment1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSigAssignment"));
              return;
              // -end- 3961F97801E8 add_body3961F7DF017A "CondSigParamAss::addSigAssignment"
            }

            /** disconnect a SigAssignment.
             *  @see #addSigAssignment
             */
            // -beg- preserve=no 3961F97801E8 remove_head3961F7DF017A "CondSigParamAss::removeSigAssignment"
            public SigAssignment removeSigAssignment(SigAssignment sigAssignment1)
            // -end- 3961F97801E8 remove_head3961F7DF017A "CondSigParamAss::removeSigAssignment"
            {
              // -beg- preserve=no 3961F97801E8 remove_body3961F7DF017A "CondSigParamAss::removeSigAssignment"
              SigAssignment ret=null;
              if(sigAssignment1==null || !sigAssignment.contains(sigAssignment1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = sigAssignment1;
              sigAssignment.remove(sigAssignment1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSigAssignment"));
              return ret;
              // -end- 3961F97801E8 remove_body3961F7DF017A "CondSigParamAss::removeSigAssignment"
            }

            /** tests if a given SigAssignment is connected.
             *  @see #addSigAssignment
             */
            // -beg- preserve=no 3961F97801E8 test_head3961F7DF017A "CondSigParamAss::containsSigAssignment"
            public boolean containsSigAssignment(SigAssignment sigAssignment1)
            // -end- 3961F97801E8 test_head3961F7DF017A "CondSigParamAss::containsSigAssignment"
            {
              // -beg- preserve=no 3961F97801E8 test_body3961F7DF017A "CondSigParamAss::containsSigAssignment"
              return sigAssignment.contains(sigAssignment1);
              // -end- 3961F97801E8 test_body3961F7DF017A "CondSigParamAss::containsSigAssignment"
            }

            /** used to enumerate all connected SigAssignments.
             *  @see #addSigAssignment
             */
            // -beg- preserve=no 3961F97801E8 get_all_head3961F7DF017A "CondSigParamAss::iteratorSigAssignment"
            public java.util.Iterator iteratorSigAssignment()
            // -end- 3961F97801E8 get_all_head3961F7DF017A "CondSigParamAss::iteratorSigAssignment"
            {
              // -beg- preserve=no 3961F97801E8 get_all_body3961F7DF017A "CondSigParamAss::iteratorSigAssignment"
              return sigAssignment.iterator();
              // -end- 3961F97801E8 get_all_body3961F7DF017A "CondSigParamAss::iteratorSigAssignment"
            }

            /** disconnect all SigAssignments.
             *  @see #addSigAssignment
             */
            // -beg- preserve=no 3961F97801E8 remove_all_head3961F7DF017A "CondSigParamAss::clearSigAssignment"
            public void clearSigAssignment()
            // -end- 3961F97801E8 remove_all_head3961F7DF017A "CondSigParamAss::clearSigAssignment"
            {
              // -beg- preserve=no 3961F97801E8 remove_all_body3961F7DF017A "CondSigParamAss::clearSigAssignment"
              if(sizeSigAssignment()>0){
                sigAssignment.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSigAssignment"));
              }
              // -end- 3961F97801E8 remove_all_body3961F7DF017A "CondSigParamAss::clearSigAssignment"
            }

            /** returns the number of SigAssignments.
             *  @see #addSigAssignment
             */
            // -beg- preserve=no 3961F97801E8 size_head3961F7DF017A "CondSigParamAss::sizeSigAssignment"
            public int sizeSigAssignment()
            // -end- 3961F97801E8 size_head3961F7DF017A "CondSigParamAss::sizeSigAssignment"
            {
              // -beg- preserve=no 3961F97801E8 size_body3961F7DF017A "CondSigParamAss::sizeSigAssignment"
              return sigAssignment.size();
              // -end- 3961F97801E8 size_body3961F7DF017A "CondSigParamAss::sizeSigAssignment"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3961F7DF017A detail_end "CondSigParamAss"

            // -end- 3961F7DF017A detail_end "CondSigParamAss"

          }

