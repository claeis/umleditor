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

          // -beg- preserve=no 39609BAB0260 package "FactElement"
package ch.ehi.interlis.logicalexpressions;
          // -end- 39609BAB0260 package "FactElement"

          // -beg- preserve=no 39609BAB0260 autoimport "FactElement"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.logicalexpressions.AttributePath;
          import ch.ehi.interlis.logicalexpressions.FunctionCall;
          import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
          import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;
          import ch.ehi.interlis.logicalexpressions.FactElementKind;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 39609BAB0260 autoimport "FactElement"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 39609BAB0260 import "FactElement"

          // -end- 39609BAB0260 import "FactElement"

          /** Diese Klasse ist nur in INTERLIS2 definiert.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:03 $
           */
public class FactElement extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 39609BAB0260 detail_begin "FactElement"

            // -end- 39609BAB0260 detail_begin "FactElement"

            // -beg- preserve=no 3D4FA2180239 head39609BAB0260 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2180239 head39609BAB0260 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180239 throws39609BAB0260 "unlinkAll"

              // -end- 3D4FA2180239 throws39609BAB0260 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180239 body39609BAB0260 "unlinkAll"
              
              // Role Factor: Factor object(s) may point to this
              detachAttributePath();
              detachFunctionCall();
              detachConstant();
              detachGraphicParameterDef();
              super.unlinkAll();
              // -end- 3D4FA2180239 body39609BAB0260 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2180243 head39609BAB0260 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2180243 head39609BAB0260 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180243 throws39609BAB0260 "enumerateChildren"

              // -end- 3D4FA2180243 throws39609BAB0260 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180243 body39609BAB0260 "enumerateChildren"
              java.util.Iterator it=null;
              if(containsAttributePath())visitor.visit(getAttributePath());
              if(containsFunctionCall())visitor.visit(getFunctionCall());
              if(containsConstant())visitor.visit(getConstant());
              if(containsGraphicParameterDef())visitor.visit(getGraphicParameterDef());
              super.enumerateChildren(visitor);
              // -end- 3D4FA2180243 body39609BAB0260 "enumerateChildren"
              }

            // -beg- preserve=no 3960A09A033A code39609BAB0260 "attributePath"
            private AttributePath attributePath;
            // -end- 3960A09A033A code39609BAB0260 "attributePath"

            /** attaches a AttributePath.
             *  
             *  @see #detachAttributePath
             *  @see #getAttributePath
             *  @see #containsAttributePath
             */
            // -beg- preserve=no 3960A09A033A attach_head39609BAB0260 "FactElement::attachAttributePath"
            public void attachAttributePath(AttributePath attributePath1)
            // -end- 3960A09A033A attach_head39609BAB0260 "FactElement::attachAttributePath"
            {
              // -beg- preserve=no 3960A09A033A attach_body39609BAB0260 "FactElement::attachAttributePath"
              if(attributePath!=null) {throw new java.lang.IllegalStateException("already a attributePath attached");}
              if(attributePath1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as attributePath");}
              attributePath = attributePath1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAttributePath"));
              return;
              // -end- 3960A09A033A attach_body39609BAB0260 "FactElement::attachAttributePath"
            }

            /** disconnect the currently attached AttributePath.
             *  @see #attachAttributePath
             */
            // -beg- preserve=no 3960A09A033A detach_head39609BAB0260 "FactElement::detachAttributePath"
            public AttributePath detachAttributePath()
            // -end- 3960A09A033A detach_head39609BAB0260 "FactElement::detachAttributePath"
            {
              // -beg- preserve=no 3960A09A033A detach_body39609BAB0260 "FactElement::detachAttributePath"
              AttributePath ret = null;
              ret = attributePath;
              attributePath = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAttributePath"));
              return ret;
              // -end- 3960A09A033A detach_body39609BAB0260 "FactElement::detachAttributePath"
            }

            /** get the currently attached AttributePath.
             *  @see #attachAttributePath
             */
            // -beg- preserve=no 3960A09A033A get_head39609BAB0260 "FactElement::getAttributePath"
            public AttributePath getAttributePath()
            // -end- 3960A09A033A get_head39609BAB0260 "FactElement::getAttributePath"
            {
              // -beg- preserve=no 3960A09A033A get_body39609BAB0260 "FactElement::getAttributePath"
              if(attributePath==null) {throw new java.lang.IllegalStateException("no attributePath attached");}
              return attributePath;
              // -end- 3960A09A033A get_body39609BAB0260 "FactElement::getAttributePath"
            }

            /** tests if there is a AttributePath attached.
             *  @see #attachAttributePath
             */
            // -beg- preserve=no 3960A09A033A test_head39609BAB0260 "FactElement::containsAttributePath"
            public boolean containsAttributePath()
            // -end- 3960A09A033A test_head39609BAB0260 "FactElement::containsAttributePath"
            {
              // -beg- preserve=no 3960A09A033A test_body39609BAB0260 "FactElement::containsAttributePath"
              return attributePath!=null;
              // -end- 3960A09A033A test_body39609BAB0260 "FactElement::containsAttributePath"
            }

            // -beg- preserve=no 3960A0D8027A code39609BAB0260 "functionCall"
            private FunctionCall functionCall;
            // -end- 3960A0D8027A code39609BAB0260 "functionCall"

            /** attaches a FunctionCall.
             *  
             *  @see #detachFunctionCall
             *  @see #getFunctionCall
             *  @see #containsFunctionCall
             */
            // -beg- preserve=no 3960A0D8027A attach_head39609BAB0260 "FactElement::attachFunctionCall"
            public void attachFunctionCall(FunctionCall functionCall1)
            // -end- 3960A0D8027A attach_head39609BAB0260 "FactElement::attachFunctionCall"
            {
              // -beg- preserve=no 3960A0D8027A attach_body39609BAB0260 "FactElement::attachFunctionCall"
              if(functionCall!=null) {throw new java.lang.IllegalStateException("already a functionCall attached");}
              if(functionCall1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as functionCall");}
              functionCall = functionCall1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachFunctionCall"));
              return;
              // -end- 3960A0D8027A attach_body39609BAB0260 "FactElement::attachFunctionCall"
            }

            /** disconnect the currently attached FunctionCall.
             *  @see #attachFunctionCall
             */
            // -beg- preserve=no 3960A0D8027A detach_head39609BAB0260 "FactElement::detachFunctionCall"
            public FunctionCall detachFunctionCall()
            // -end- 3960A0D8027A detach_head39609BAB0260 "FactElement::detachFunctionCall"
            {
              // -beg- preserve=no 3960A0D8027A detach_body39609BAB0260 "FactElement::detachFunctionCall"
              FunctionCall ret = null;
              ret = functionCall;
              functionCall = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachFunctionCall"));
              return ret;
              // -end- 3960A0D8027A detach_body39609BAB0260 "FactElement::detachFunctionCall"
            }

            /** get the currently attached FunctionCall.
             *  @see #attachFunctionCall
             */
            // -beg- preserve=no 3960A0D8027A get_head39609BAB0260 "FactElement::getFunctionCall"
            public FunctionCall getFunctionCall()
            // -end- 3960A0D8027A get_head39609BAB0260 "FactElement::getFunctionCall"
            {
              // -beg- preserve=no 3960A0D8027A get_body39609BAB0260 "FactElement::getFunctionCall"
              if(functionCall==null) {throw new java.lang.IllegalStateException("no functionCall attached");}
              return functionCall;
              // -end- 3960A0D8027A get_body39609BAB0260 "FactElement::getFunctionCall"
            }

            /** tests if there is a FunctionCall attached.
             *  @see #attachFunctionCall
             */
            // -beg- preserve=no 3960A0D8027A test_head39609BAB0260 "FactElement::containsFunctionCall"
            public boolean containsFunctionCall()
            // -end- 3960A0D8027A test_head39609BAB0260 "FactElement::containsFunctionCall"
            {
              // -beg- preserve=no 3960A0D8027A test_body39609BAB0260 "FactElement::containsFunctionCall"
              return functionCall!=null;
              // -end- 3960A0D8027A test_body39609BAB0260 "FactElement::containsFunctionCall"
            }

            // -beg- preserve=no 3960A19600F6 code39609BAB0260 "constant"
            private Constant constant;
            // -end- 3960A19600F6 code39609BAB0260 "constant"

            /** attaches a Constant.
             *  
             *  @see #detachConstant
             *  @see #getConstant
             *  @see #containsConstant
             */
            // -beg- preserve=no 3960A19600F6 attach_head39609BAB0260 "FactElement::attachConstant"
            public void attachConstant(Constant constant1)
            // -end- 3960A19600F6 attach_head39609BAB0260 "FactElement::attachConstant"
            {
              // -beg- preserve=no 3960A19600F6 attach_body39609BAB0260 "FactElement::attachConstant"
              if(constant!=null) {throw new java.lang.IllegalStateException("already a constant attached");}
              if(constant1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as constant");}
              constant = constant1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachConstant"));
              return;
              // -end- 3960A19600F6 attach_body39609BAB0260 "FactElement::attachConstant"
            }

            /** disconnect the currently attached Constant.
             *  @see #attachConstant
             */
            // -beg- preserve=no 3960A19600F6 detach_head39609BAB0260 "FactElement::detachConstant"
            public Constant detachConstant()
            // -end- 3960A19600F6 detach_head39609BAB0260 "FactElement::detachConstant"
            {
              // -beg- preserve=no 3960A19600F6 detach_body39609BAB0260 "FactElement::detachConstant"
              Constant ret = null;
              ret = constant;
              constant = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachConstant"));
              return ret;
              // -end- 3960A19600F6 detach_body39609BAB0260 "FactElement::detachConstant"
            }

            /** get the currently attached Constant.
             *  @see #attachConstant
             */
            // -beg- preserve=no 3960A19600F6 get_head39609BAB0260 "FactElement::getConstant"
            public Constant getConstant()
            // -end- 3960A19600F6 get_head39609BAB0260 "FactElement::getConstant"
            {
              // -beg- preserve=no 3960A19600F6 get_body39609BAB0260 "FactElement::getConstant"
              if(constant==null) {throw new java.lang.IllegalStateException("no constant attached");}
              return constant;
              // -end- 3960A19600F6 get_body39609BAB0260 "FactElement::getConstant"
            }

            /** tests if there is a Constant attached.
             *  @see #attachConstant
             */
            // -beg- preserve=no 3960A19600F6 test_head39609BAB0260 "FactElement::containsConstant"
            public boolean containsConstant()
            // -end- 3960A19600F6 test_head39609BAB0260 "FactElement::containsConstant"
            {
              // -beg- preserve=no 3960A19600F6 test_body39609BAB0260 "FactElement::containsConstant"
              return constant!=null;
              // -end- 3960A19600F6 test_body39609BAB0260 "FactElement::containsConstant"
            }

            // -beg- preserve=no 3960A563001A code39609BAB0260 "graphicParameterDef"
            private GraphicParameterDef graphicParameterDef;
            // -end- 3960A563001A code39609BAB0260 "graphicParameterDef"

            /** attaches a GraphicParameterDef.
             *  
             *  @see #detachGraphicParameterDef
             *  @see #getGraphicParameterDef
             *  @see #containsGraphicParameterDef
             */
            // -beg- preserve=no 3960A563001A attach_head39609BAB0260 "FactElement::attachGraphicParameterDef"
            public void attachGraphicParameterDef(GraphicParameterDef graphicParameterDef1)
            // -end- 3960A563001A attach_head39609BAB0260 "FactElement::attachGraphicParameterDef"
            {
              // -beg- preserve=no 3960A563001A attach_body39609BAB0260 "FactElement::attachGraphicParameterDef"
              if(graphicParameterDef!=null) {throw new java.lang.IllegalStateException("already a graphicParameterDef attached");}
              if(graphicParameterDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as graphicParameterDef");}
              graphicParameterDef = graphicParameterDef1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachGraphicParameterDef"));
              return;
              // -end- 3960A563001A attach_body39609BAB0260 "FactElement::attachGraphicParameterDef"
            }

            /** disconnect the currently attached GraphicParameterDef.
             *  @see #attachGraphicParameterDef
             */
            // -beg- preserve=no 3960A563001A detach_head39609BAB0260 "FactElement::detachGraphicParameterDef"
            public GraphicParameterDef detachGraphicParameterDef()
            // -end- 3960A563001A detach_head39609BAB0260 "FactElement::detachGraphicParameterDef"
            {
              // -beg- preserve=no 3960A563001A detach_body39609BAB0260 "FactElement::detachGraphicParameterDef"
              GraphicParameterDef ret = null;
              ret = graphicParameterDef;
              graphicParameterDef = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachGraphicParameterDef"));
              return ret;
              // -end- 3960A563001A detach_body39609BAB0260 "FactElement::detachGraphicParameterDef"
            }

            /** get the currently attached GraphicParameterDef.
             *  @see #attachGraphicParameterDef
             */
            // -beg- preserve=no 3960A563001A get_head39609BAB0260 "FactElement::getGraphicParameterDef"
            public GraphicParameterDef getGraphicParameterDef()
            // -end- 3960A563001A get_head39609BAB0260 "FactElement::getGraphicParameterDef"
            {
              // -beg- preserve=no 3960A563001A get_body39609BAB0260 "FactElement::getGraphicParameterDef"
              if(graphicParameterDef==null) {throw new java.lang.IllegalStateException("no graphicParameterDef attached");}
              return graphicParameterDef;
              // -end- 3960A563001A get_body39609BAB0260 "FactElement::getGraphicParameterDef"
            }

            /** tests if there is a GraphicParameterDef attached.
             *  @see #attachGraphicParameterDef
             */
            // -beg- preserve=no 3960A563001A test_head39609BAB0260 "FactElement::containsGraphicParameterDef"
            public boolean containsGraphicParameterDef()
            // -end- 3960A563001A test_head39609BAB0260 "FactElement::containsGraphicParameterDef"
            {
              // -beg- preserve=no 3960A563001A test_body39609BAB0260 "FactElement::containsGraphicParameterDef"
              return graphicParameterDef!=null;
              // -end- 3960A563001A test_body39609BAB0260 "FactElement::containsGraphicParameterDef"
            }

            // -beg- preserve=no 3960A7760171 var39609BAB0260 "kind"
            private int kind;
            // -end- 3960A7760171 var39609BAB0260 "kind"

            /** get current value of kind
             *  ATTRPATH, FUNCCALL, GRAPHICPARAM oder CONSTANT
             *  @see ch.ehi.interlis.logicalexpressions.FactElementKind
             *  @see #setKind
             */
            // -beg- preserve=no 3960A7760171 get_head39609BAB0260 "kind"
            public  int getKind()
            // -end- 3960A7760171 get_head39609BAB0260 "kind"
            {
              // -beg- preserve=no 3960A7760171 get_body39609BAB0260 "kind"
              return kind;
              // -end- 3960A7760171 get_body39609BAB0260 "kind"
            }

            /** set current value of kind
             *  @see ch.ehi.interlis.logicalexpressions.FactElementKind
             *  @see #getKind
             */
            // -beg- preserve=no 3960A7760171 set_head39609BAB0260 "kind"
            public  void setKind(int value1)
            // -end- 3960A7760171 set_head39609BAB0260 "kind"
            {
              // -beg- preserve=no 3960A7760171 set_body39609BAB0260 "kind"
              if(kind != value1){
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
              }
              // -end- 3960A7760171 set_body39609BAB0260 "kind"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 39609BAB0260 detail_end "FactElement"

            // -end- 39609BAB0260 detail_end "FactElement"

          }

=======
// -beg- preserve=no 39609BAB0260 package "FactElement"
package ch.ehi.interlis.logicalexpressions;
// -end- 39609BAB0260 package "FactElement"

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 39609BAB0260 autoimport "FactElement"
import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;
// -beg- preserve=no 39609BAB0260 autoimport "FactElement"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39609BAB0260 import "FactElement"

// -end- 39609BAB0260 import "FactElement"

/**
 * Diese Klasse ist nur in INTERLIS2 definiert.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:03 $
 */
public class FactElement extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39609BAB0260 detail_begin "FactElement"

	// -end- 39609BAB0260 detail_begin "FactElement"

	private static final long serialVersionUID = 6061295615432976990L;

	// -beg- preserve=no 3D4FA2180239 head39609BAB0260 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2180239 head39609BAB0260 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180239 throws39609BAB0260 "unlinkAll"

	// -end- 3D4FA2180239 throws39609BAB0260 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180239 body39609BAB0260 "unlinkAll"

		// Role Factor: Factor object(s) may point to this
		detachAttributePath();
		detachFunctionCall();
		detachConstant();
		detachGraphicParameterDef();
		super.unlinkAll();
		// -end- 3D4FA2180239 body39609BAB0260 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180243 head39609BAB0260 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180243 head39609BAB0260 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180243 throws39609BAB0260 "enumerateChildren"

	// -end- 3D4FA2180243 throws39609BAB0260 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180243 body39609BAB0260 "enumerateChildren"
		Iterator<?> it = null;
		if (containsAttributePath())
			visitor.visit(getAttributePath());
		if (containsFunctionCall())
			visitor.visit(getFunctionCall());
		if (containsConstant())
			visitor.visit(getConstant());
		if (containsGraphicParameterDef())
			visitor.visit(getGraphicParameterDef());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180243 body39609BAB0260 "enumerateChildren"
	}

	// -beg- preserve=no 3960A09A033A code39609BAB0260 "attributePath"
	private AttributePath attributePath;
	// -end- 3960A09A033A code39609BAB0260 "attributePath"

	/**
	 * attaches a AttributePath.
	 *
	 * @see #detachAttributePath
	 * @see #getAttributePath
	 * @see #containsAttributePath
	 */
	// -beg- preserve=no 3960A09A033A attach_head39609BAB0260
	// "FactElement::attachAttributePath"
	public void attachAttributePath(AttributePath attributePath1)
	// -end- 3960A09A033A attach_head39609BAB0260
	// "FactElement::attachAttributePath"
	{
		// -beg- preserve=no 3960A09A033A attach_body39609BAB0260
		// "FactElement::attachAttributePath"
		if (attributePath != null) {
			throw new java.lang.IllegalStateException("already a attributePath attached");
		}
		if (attributePath1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as attributePath");
		}
		attributePath = attributePath1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAttributePath"));
		return;
		// -end- 3960A09A033A attach_body39609BAB0260
		// "FactElement::attachAttributePath"
	}

	/**
	 * disconnect the currently attached AttributePath.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 3960A09A033A detach_head39609BAB0260
	// "FactElement::detachAttributePath"
	public AttributePath detachAttributePath()
	// -end- 3960A09A033A detach_head39609BAB0260
	// "FactElement::detachAttributePath"
	{
		// -beg- preserve=no 3960A09A033A detach_body39609BAB0260
		// "FactElement::detachAttributePath"
		AttributePath ret = null;
		ret = attributePath;
		attributePath = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAttributePath"));
		return ret;
		// -end- 3960A09A033A detach_body39609BAB0260
		// "FactElement::detachAttributePath"
	}

	/**
	 * get the currently attached AttributePath.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 3960A09A033A get_head39609BAB0260
	// "FactElement::getAttributePath"
	public AttributePath getAttributePath()
	// -end- 3960A09A033A get_head39609BAB0260 "FactElement::getAttributePath"
	{
		// -beg- preserve=no 3960A09A033A get_body39609BAB0260
		// "FactElement::getAttributePath"
		if (attributePath == null) {
			throw new java.lang.IllegalStateException("no attributePath attached");
		}
		return attributePath;
		// -end- 3960A09A033A get_body39609BAB0260
		// "FactElement::getAttributePath"
	}

	/**
	 * tests if there is a AttributePath attached.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 3960A09A033A test_head39609BAB0260
	// "FactElement::containsAttributePath"
	public boolean containsAttributePath()
	// -end- 3960A09A033A test_head39609BAB0260
	// "FactElement::containsAttributePath"
	{
		// -beg- preserve=no 3960A09A033A test_body39609BAB0260
		// "FactElement::containsAttributePath"
		return attributePath != null;
		// -end- 3960A09A033A test_body39609BAB0260
		// "FactElement::containsAttributePath"
	}

	// -beg- preserve=no 3960A0D8027A code39609BAB0260 "functionCall"
	private FunctionCall functionCall;
	// -end- 3960A0D8027A code39609BAB0260 "functionCall"

	/**
	 * attaches a FunctionCall.
	 *
	 * @see #detachFunctionCall
	 * @see #getFunctionCall
	 * @see #containsFunctionCall
	 */
	// -beg- preserve=no 3960A0D8027A attach_head39609BAB0260
	// "FactElement::attachFunctionCall"
	public void attachFunctionCall(FunctionCall functionCall1)
	// -end- 3960A0D8027A attach_head39609BAB0260
	// "FactElement::attachFunctionCall"
	{
		// -beg- preserve=no 3960A0D8027A attach_body39609BAB0260
		// "FactElement::attachFunctionCall"
		if (functionCall != null) {
			throw new java.lang.IllegalStateException("already a functionCall attached");
		}
		if (functionCall1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as functionCall");
		}
		functionCall = functionCall1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachFunctionCall"));
		return;
		// -end- 3960A0D8027A attach_body39609BAB0260
		// "FactElement::attachFunctionCall"
	}

	/**
	 * disconnect the currently attached FunctionCall.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 3960A0D8027A detach_head39609BAB0260
	// "FactElement::detachFunctionCall"
	public FunctionCall detachFunctionCall()
	// -end- 3960A0D8027A detach_head39609BAB0260
	// "FactElement::detachFunctionCall"
	{
		// -beg- preserve=no 3960A0D8027A detach_body39609BAB0260
		// "FactElement::detachFunctionCall"
		FunctionCall ret = null;
		ret = functionCall;
		functionCall = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachFunctionCall"));
		return ret;
		// -end- 3960A0D8027A detach_body39609BAB0260
		// "FactElement::detachFunctionCall"
	}

	/**
	 * get the currently attached FunctionCall.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 3960A0D8027A get_head39609BAB0260
	// "FactElement::getFunctionCall"
	public FunctionCall getFunctionCall()
	// -end- 3960A0D8027A get_head39609BAB0260 "FactElement::getFunctionCall"
	{
		// -beg- preserve=no 3960A0D8027A get_body39609BAB0260
		// "FactElement::getFunctionCall"
		if (functionCall == null) {
			throw new java.lang.IllegalStateException("no functionCall attached");
		}
		return functionCall;
		// -end- 3960A0D8027A get_body39609BAB0260
		// "FactElement::getFunctionCall"
	}

	/**
	 * tests if there is a FunctionCall attached.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 3960A0D8027A test_head39609BAB0260
	// "FactElement::containsFunctionCall"
	public boolean containsFunctionCall()
	// -end- 3960A0D8027A test_head39609BAB0260
	// "FactElement::containsFunctionCall"
	{
		// -beg- preserve=no 3960A0D8027A test_body39609BAB0260
		// "FactElement::containsFunctionCall"
		return functionCall != null;
		// -end- 3960A0D8027A test_body39609BAB0260
		// "FactElement::containsFunctionCall"
	}

	// -beg- preserve=no 3960A19600F6 code39609BAB0260 "constant"
	private Constant constant;
	// -end- 3960A19600F6 code39609BAB0260 "constant"

	/**
	 * attaches a Constant.
	 *
	 * @see #detachConstant
	 * @see #getConstant
	 * @see #containsConstant
	 */
	// -beg- preserve=no 3960A19600F6 attach_head39609BAB0260
	// "FactElement::attachConstant"
	public void attachConstant(Constant constant1)
	// -end- 3960A19600F6 attach_head39609BAB0260 "FactElement::attachConstant"
	{
		// -beg- preserve=no 3960A19600F6 attach_body39609BAB0260
		// "FactElement::attachConstant"
		if (constant != null) {
			throw new java.lang.IllegalStateException("already a constant attached");
		}
		if (constant1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as constant");
		}
		constant = constant1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachConstant"));
		return;
		// -end- 3960A19600F6 attach_body39609BAB0260
		// "FactElement::attachConstant"
	}

	/**
	 * disconnect the currently attached Constant.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3960A19600F6 detach_head39609BAB0260
	// "FactElement::detachConstant"
	public Constant detachConstant()
	// -end- 3960A19600F6 detach_head39609BAB0260 "FactElement::detachConstant"
	{
		// -beg- preserve=no 3960A19600F6 detach_body39609BAB0260
		// "FactElement::detachConstant"
		Constant ret = null;
		ret = constant;
		constant = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachConstant"));
		return ret;
		// -end- 3960A19600F6 detach_body39609BAB0260
		// "FactElement::detachConstant"
	}

	/**
	 * get the currently attached Constant.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3960A19600F6 get_head39609BAB0260
	// "FactElement::getConstant"
	public Constant getConstant()
	// -end- 3960A19600F6 get_head39609BAB0260 "FactElement::getConstant"
	{
		// -beg- preserve=no 3960A19600F6 get_body39609BAB0260
		// "FactElement::getConstant"
		if (constant == null) {
			throw new java.lang.IllegalStateException("no constant attached");
		}
		return constant;
		// -end- 3960A19600F6 get_body39609BAB0260 "FactElement::getConstant"
	}

	/**
	 * tests if there is a Constant attached.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3960A19600F6 test_head39609BAB0260
	// "FactElement::containsConstant"
	public boolean containsConstant()
	// -end- 3960A19600F6 test_head39609BAB0260 "FactElement::containsConstant"
	{
		// -beg- preserve=no 3960A19600F6 test_body39609BAB0260
		// "FactElement::containsConstant"
		return constant != null;
		// -end- 3960A19600F6 test_body39609BAB0260
		// "FactElement::containsConstant"
	}

	// -beg- preserve=no 3960A563001A code39609BAB0260 "graphicParameterDef"
	private GraphicParameterDef graphicParameterDef;
	// -end- 3960A563001A code39609BAB0260 "graphicParameterDef"

	/**
	 * attaches a GraphicParameterDef.
	 *
	 * @see #detachGraphicParameterDef
	 * @see #getGraphicParameterDef
	 * @see #containsGraphicParameterDef
	 */
	// -beg- preserve=no 3960A563001A attach_head39609BAB0260
	// "FactElement::attachGraphicParameterDef"
	public void attachGraphicParameterDef(GraphicParameterDef graphicParameterDef1)
	// -end- 3960A563001A attach_head39609BAB0260
	// "FactElement::attachGraphicParameterDef"
	{
		// -beg- preserve=no 3960A563001A attach_body39609BAB0260
		// "FactElement::attachGraphicParameterDef"
		if (graphicParameterDef != null) {
			throw new java.lang.IllegalStateException("already a graphicParameterDef attached");
		}
		if (graphicParameterDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as graphicParameterDef");
		}
		graphicParameterDef = graphicParameterDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachGraphicParameterDef"));
		return;
		// -end- 3960A563001A attach_body39609BAB0260
		// "FactElement::attachGraphicParameterDef"
	}

	/**
	 * disconnect the currently attached GraphicParameterDef.
	 * 
	 * @see #attachGraphicParameterDef
	 */
	// -beg- preserve=no 3960A563001A detach_head39609BAB0260
	// "FactElement::detachGraphicParameterDef"
	public GraphicParameterDef detachGraphicParameterDef()
	// -end- 3960A563001A detach_head39609BAB0260
	// "FactElement::detachGraphicParameterDef"
	{
		// -beg- preserve=no 3960A563001A detach_body39609BAB0260
		// "FactElement::detachGraphicParameterDef"
		GraphicParameterDef ret = null;
		ret = graphicParameterDef;
		graphicParameterDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachGraphicParameterDef"));
		return ret;
		// -end- 3960A563001A detach_body39609BAB0260
		// "FactElement::detachGraphicParameterDef"
	}

	/**
	 * get the currently attached GraphicParameterDef.
	 * 
	 * @see #attachGraphicParameterDef
	 */
	// -beg- preserve=no 3960A563001A get_head39609BAB0260
	// "FactElement::getGraphicParameterDef"
	public GraphicParameterDef getGraphicParameterDef()
	// -end- 3960A563001A get_head39609BAB0260
	// "FactElement::getGraphicParameterDef"
	{
		// -beg- preserve=no 3960A563001A get_body39609BAB0260
		// "FactElement::getGraphicParameterDef"
		if (graphicParameterDef == null) {
			throw new java.lang.IllegalStateException("no graphicParameterDef attached");
		}
		return graphicParameterDef;
		// -end- 3960A563001A get_body39609BAB0260
		// "FactElement::getGraphicParameterDef"
	}

	/**
	 * tests if there is a GraphicParameterDef attached.
	 * 
	 * @see #attachGraphicParameterDef
	 */
	// -beg- preserve=no 3960A563001A test_head39609BAB0260
	// "FactElement::containsGraphicParameterDef"
	public boolean containsGraphicParameterDef()
	// -end- 3960A563001A test_head39609BAB0260
	// "FactElement::containsGraphicParameterDef"
	{
		// -beg- preserve=no 3960A563001A test_body39609BAB0260
		// "FactElement::containsGraphicParameterDef"
		return graphicParameterDef != null;
		// -end- 3960A563001A test_body39609BAB0260
		// "FactElement::containsGraphicParameterDef"
	}

	// -beg- preserve=no 3960A7760171 var39609BAB0260 "kind"
	private int kind;
	// -end- 3960A7760171 var39609BAB0260 "kind"

	/**
	 * get current value of kind ATTRPATH, FUNCCALL, GRAPHICPARAM oder CONSTANT
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.FactElementKind
	 * @see #setKind
	 */
	// -beg- preserve=no 3960A7760171 get_head39609BAB0260 "kind"
	public int getKind()
	// -end- 3960A7760171 get_head39609BAB0260 "kind"
	{
		// -beg- preserve=no 3960A7760171 get_body39609BAB0260 "kind"
		return kind;
		// -end- 3960A7760171 get_body39609BAB0260 "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.FactElementKind
	 * @see #getKind
	 */
	// -beg- preserve=no 3960A7760171 set_head39609BAB0260 "kind"
	public void setKind(int value1)
	// -end- 3960A7760171 set_head39609BAB0260 "kind"
	{
		// -beg- preserve=no 3960A7760171 set_body39609BAB0260 "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 3960A7760171 set_body39609BAB0260 "kind"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39609BAB0260 detail_end "FactElement"

	// -end- 39609BAB0260 detail_end "FactElement"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
