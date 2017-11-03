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

              // -beg- preserve=no 3C1784E100B2 package "AttrType"
package ch.ehi.interlis.attributes;
              // -end- 3C1784E100B2 package "AttrType"

              // -beg- preserve=no 3C1784E100B2 autoimport "AttrType"
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.interlis.attributes.AttributeDef;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 3C1784E100B2 autoimport "AttrType"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3C1784E100B2 import "AttrType"

              // -end- 3C1784E100B2 import "AttrType"

              /** @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:48 $
               */
public abstract class AttrType extends AbstractEditorElement implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1784E100B2 detail_begin "AttrType"

                // -end- 3C1784E100B2 detail_begin "AttrType"

                // -beg- preserve=no 3D4FA21A02B4 head3C1784E100B2 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21A02B4 head3C1784E100B2 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A02B4 throws3C1784E100B2 "unlinkAll"

                  // -end- 3D4FA21A02B4 throws3C1784E100B2 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A02B4 body3C1784E100B2 "unlinkAll"
                  
                  // Role ParameterDef: ParameterDef object(s) may point to this
                  detachAttributeDef();
                  super.unlinkAll();
                  // -end- 3D4FA21A02B4 body3C1784E100B2 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21A02BE head3C1784E100B2 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21A02BE head3C1784E100B2 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A02BE throws3C1784E100B2 "enumerateChildren"

                  // -end- 3D4FA21A02BE throws3C1784E100B2 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A02BE body3C1784E100B2 "enumerateChildren"
                  java.util.Iterator it=null;
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21A02BE body3C1784E100B2 "enumerateChildren"
                  }

                // -beg- preserve=no 3C178681031D code3C1784E100B2 "attributeDef"
                private AttributeDef attributeDef;
                // -end- 3C178681031D code3C1784E100B2 "attributeDef"

                /** attaches a AttributeDef.
                 *  
                 *  @see #detachAttributeDef
                 *  @see #getAttributeDef
                 *  @see #containsAttributeDef
                 */
                // -beg- preserve=no 3C178681031D attach_head3C1784E100B2 "AttrType::attachAttributeDef"
                public void attachAttributeDef(AttributeDef attributeDef1)
                // -end- 3C178681031D attach_head3C1784E100B2 "AttrType::attachAttributeDef"
                {
                  // -beg- preserve=no 3C178681031D attach_body3C1784E100B2 "AttrType::attachAttributeDef"
                  if(attributeDef!=null) {throw new java.lang.IllegalStateException("already a attributeDef attached");}
                  if(attributeDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as attributeDef");}
                  attributeDef = attributeDef1;
                  attributeDef1._linkAttrType(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAttributeDef"));
                  return;
                  // -end- 3C178681031D attach_body3C1784E100B2 "AttrType::attachAttributeDef"
                }

                /** disconnect the currently attached AttributeDef.
                 *  @see #attachAttributeDef
                 */
                // -beg- preserve=no 3C178681031D detach_head3C1784E100B2 "AttrType::detachAttributeDef"
                public AttributeDef detachAttributeDef()
                // -end- 3C178681031D detach_head3C1784E100B2 "AttrType::detachAttributeDef"
                {
                  // -beg- preserve=no 3C178681031D detach_body3C1784E100B2 "AttrType::detachAttributeDef"
                  AttributeDef ret = null;
                  if(attributeDef!=null){
                    attributeDef._unlinkAttrType(this);
                    ret = attributeDef;
                    attributeDef = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAttributeDef"));
                  return ret;
                  // -end- 3C178681031D detach_body3C1784E100B2 "AttrType::detachAttributeDef"
                }

                /** get the currently attached AttributeDef.
                 *  @see #attachAttributeDef
                 */
                // -beg- preserve=no 3C178681031D get_head3C1784E100B2 "AttrType::getAttributeDef"
                public AttributeDef getAttributeDef()
                // -end- 3C178681031D get_head3C1784E100B2 "AttrType::getAttributeDef"
                {
                  // -beg- preserve=no 3C178681031D get_body3C1784E100B2 "AttrType::getAttributeDef"
                  if(attributeDef==null) {throw new java.lang.IllegalStateException("no attributeDef attached");}
                  return attributeDef;
                  // -end- 3C178681031D get_body3C1784E100B2 "AttrType::getAttributeDef"
                }

                /** tests if there is a AttributeDef attached.
                 *  @see #attachAttributeDef
                 */
                // -beg- preserve=no 3C178681031D test_head3C1784E100B2 "AttrType::containsAttributeDef"
                public boolean containsAttributeDef()
                // -end- 3C178681031D test_head3C1784E100B2 "AttrType::containsAttributeDef"
                {
                  // -beg- preserve=no 3C178681031D test_body3C1784E100B2 "AttrType::containsAttributeDef"
                  return attributeDef!=null;
                  // -end- 3C178681031D test_body3C1784E100B2 "AttrType::containsAttributeDef"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3C178681031D _link_body3C1784E100B2 "AttrType::_linkAttributeDef"
                public void _linkAttributeDef(AttributeDef attributeDef1)
                {
                  attributeDef = attributeDef1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAttributeDef"));
                  return;
                }
                // -end- 3C178681031D _link_body3C1784E100B2 "AttrType::_linkAttributeDef"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3C178681031D _unlink_body3C1784E100B2 "AttrType::_unlinkAttributeDef"
                public void _unlinkAttributeDef(AttributeDef attributeDef1)
                {
                  attributeDef = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAttributeDef"));
                  return;
                }
                // -end- 3C178681031D _unlink_body3C1784E100B2 "AttrType::_unlinkAttributeDef"

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1784E100B2 detail_end "AttrType"

                // -end- 3C1784E100B2 detail_end "AttrType"

              }

=======
// -beg- preserve=no 3C1784E100B2 package "AttrType"
package ch.ehi.interlis.attributes;
// -end- 3C1784E100B2 package "AttrType"

// -beg- preserve=no 3C1784E100B2 autoimport "AttrType"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C1784E100B2 autoimport "AttrType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C1784E100B2 import "AttrType"

// -end- 3C1784E100B2 import "AttrType"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:48 $
 */
public abstract class AttrType extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1784E100B2 detail_begin "AttrType"

	// -end- 3C1784E100B2 detail_begin "AttrType"

	private static final long serialVersionUID = 273282772216886205L;

	// -beg- preserve=no 3D4FA21A02B4 head3C1784E100B2 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A02B4 head3C1784E100B2 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A02B4 throws3C1784E100B2 "unlinkAll"

	// -end- 3D4FA21A02B4 throws3C1784E100B2 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A02B4 body3C1784E100B2 "unlinkAll"

		// Role ParameterDef: ParameterDef object(s) may point to this
		detachAttributeDef();
		super.unlinkAll();
		// -end- 3D4FA21A02B4 body3C1784E100B2 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A02BE head3C1784E100B2 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A02BE head3C1784E100B2 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A02BE throws3C1784E100B2 "enumerateChildren"

	// -end- 3D4FA21A02BE throws3C1784E100B2 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A02BE body3C1784E100B2 "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21A02BE body3C1784E100B2 "enumerateChildren"
	}

	// -beg- preserve=no 3C178681031D code3C1784E100B2 "attributeDef"
	private AttributeDef attributeDef;
	// -end- 3C178681031D code3C1784E100B2 "attributeDef"

	/**
	 * attaches a AttributeDef.
	 *
	 * @see #detachAttributeDef
	 * @see #getAttributeDef
	 * @see #containsAttributeDef
	 */
	// -beg- preserve=no 3C178681031D attach_head3C1784E100B2
	// "AttrType::attachAttributeDef"
	public void attachAttributeDef(AttributeDef attributeDef1)
	// -end- 3C178681031D attach_head3C1784E100B2 "AttrType::attachAttributeDef"
	{
		// -beg- preserve=no 3C178681031D attach_body3C1784E100B2
		// "AttrType::attachAttributeDef"
		if (attributeDef != null) {
			throw new java.lang.IllegalStateException("already a attributeDef attached");
		}
		if (attributeDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as attributeDef");
		}
		attributeDef = attributeDef1;
		attributeDef1._linkAttrType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAttributeDef"));
		return;
		// -end- 3C178681031D attach_body3C1784E100B2
		// "AttrType::attachAttributeDef"
	}

	/**
	 * disconnect the currently attached AttributeDef.
	 * 
	 * @see #attachAttributeDef
	 */
	// -beg- preserve=no 3C178681031D detach_head3C1784E100B2
	// "AttrType::detachAttributeDef"
	public AttributeDef detachAttributeDef()
	// -end- 3C178681031D detach_head3C1784E100B2 "AttrType::detachAttributeDef"
	{
		// -beg- preserve=no 3C178681031D detach_body3C1784E100B2
		// "AttrType::detachAttributeDef"
		AttributeDef ret = null;
		if (attributeDef != null) {
			attributeDef._unlinkAttrType(this);
			ret = attributeDef;
			attributeDef = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAttributeDef"));
		return ret;
		// -end- 3C178681031D detach_body3C1784E100B2
		// "AttrType::detachAttributeDef"
	}

	/**
	 * get the currently attached AttributeDef.
	 * 
	 * @see #attachAttributeDef
	 */
	// -beg- preserve=no 3C178681031D get_head3C1784E100B2
	// "AttrType::getAttributeDef"
	public AttributeDef getAttributeDef()
	// -end- 3C178681031D get_head3C1784E100B2 "AttrType::getAttributeDef"
	{
		// -beg- preserve=no 3C178681031D get_body3C1784E100B2
		// "AttrType::getAttributeDef"
		if (attributeDef == null) {
			throw new java.lang.IllegalStateException("no attributeDef attached");
		}
		return attributeDef;
		// -end- 3C178681031D get_body3C1784E100B2 "AttrType::getAttributeDef"
	}

	/**
	 * tests if there is a AttributeDef attached.
	 * 
	 * @see #attachAttributeDef
	 */
	// -beg- preserve=no 3C178681031D test_head3C1784E100B2
	// "AttrType::containsAttributeDef"
	public boolean containsAttributeDef()
	// -end- 3C178681031D test_head3C1784E100B2 "AttrType::containsAttributeDef"
	{
		// -beg- preserve=no 3C178681031D test_body3C1784E100B2
		// "AttrType::containsAttributeDef"
		return attributeDef != null;
		// -end- 3C178681031D test_body3C1784E100B2
		// "AttrType::containsAttributeDef"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C178681031D _link_body3C1784E100B2
	// "AttrType::_linkAttributeDef"
	public void _linkAttributeDef(AttributeDef attributeDef1) {
		attributeDef = attributeDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAttributeDef"));
		return;
	}
	// -end- 3C178681031D _link_body3C1784E100B2 "AttrType::_linkAttributeDef"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C178681031D _unlink_body3C1784E100B2
	// "AttrType::_unlinkAttributeDef"
	public void _unlinkAttributeDef(AttributeDef attributeDef1) {
		attributeDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAttributeDef"));
		return;
	}
	// -end- 3C178681031D _unlink_body3C1784E100B2
	// "AttrType::_unlinkAttributeDef"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1784E100B2 detail_end "AttrType"

	// -end- 3C1784E100B2 detail_end "AttrType"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
