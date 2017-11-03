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

              // -beg- preserve=no 3948DE860321 package "RotationDef"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 3948DE860321 package "RotationDef"

              // -beg- preserve=no 3948DE860321 autoimport "RotationDef"
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 3948DE860321 autoimport "RotationDef"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3948DE860321 import "RotationDef"

              // -end- 3948DE860321 import "RotationDef"

              /** Definiert die Rotation bei Koordinatendatentypen.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:29 $
               */
public class RotationDef extends AbstractEditorElement implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3948DE860321 detail_begin "RotationDef"

                // -end- 3948DE860321 detail_begin "RotationDef"

                // -beg- preserve=no 3D4FA21B0201 head3948DE860321 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0201 head3948DE860321 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0201 throws3948DE860321 "unlinkAll"

                  // -end- 3D4FA21B0201 throws3948DE860321 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0201 body3948DE860321 "unlinkAll"
                  
                  // Role CoordinateType: CoordinateType object(s) may point to this
                  super.unlinkAll();
                  // -end- 3D4FA21B0201 body3948DE860321 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B020B head3948DE860321 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B020B head3948DE860321 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B020B throws3948DE860321 "enumerateChildren"

                  // -end- 3D4FA21B020B throws3948DE860321 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B020B body3948DE860321 "enumerateChildren"
                  java.util.Iterator it=null;
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B020B body3948DE860321 "enumerateChildren"
                  }

                // -beg- preserve=no 3948DFB001E9 var3948DE860321 "nullAxis"
                private long nullAxis;
                // -end- 3948DFB001E9 var3948DE860321 "nullAxis"

                /** get current value of nullAxis
                 *  Achsnummer der Hauptachse (Nullrichtung)
                 *  @see #setNullAxis
                 */
                // -beg- preserve=no 3948DFB001E9 get_head3948DE860321 "nullAxis"
                public  long getNullAxis()
                // -end- 3948DFB001E9 get_head3948DE860321 "nullAxis"
                {
                  // -beg- preserve=no 3948DFB001E9 get_body3948DE860321 "nullAxis"
                  return nullAxis;
                  // -end- 3948DFB001E9 get_body3948DE860321 "nullAxis"
                }

                /** set current value of nullAxis
                 *  @see #getNullAxis
                 */
                // -beg- preserve=no 3948DFB001E9 set_head3948DE860321 "nullAxis"
                public  void setNullAxis(long value1)
                // -end- 3948DFB001E9 set_head3948DE860321 "nullAxis"
                {
                  // -beg- preserve=no 3948DFB001E9 set_body3948DE860321 "nullAxis"
                  if(nullAxis != value1){
                    nullAxis = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNullAxis"));
                  }
                  // -end- 3948DFB001E9 set_body3948DE860321 "nullAxis"
                }

                // -beg- preserve=no 3948DFB602EC var3948DE860321 "pihalfAxis"
                private long pihalfAxis;
                // -end- 3948DFB602EC var3948DE860321 "pihalfAxis"

                /** get current value of pihalfAxis
                 *  Achsnummer die einem positiven rechten Winkel entspricht.
                 *  @see #setPihalfAxis
                 */
                // -beg- preserve=no 3948DFB602EC get_head3948DE860321 "pihalfAxis"
                public  long getPihalfAxis()
                // -end- 3948DFB602EC get_head3948DE860321 "pihalfAxis"
                {
                  // -beg- preserve=no 3948DFB602EC get_body3948DE860321 "pihalfAxis"
                  return pihalfAxis;
                  // -end- 3948DFB602EC get_body3948DE860321 "pihalfAxis"
                }

                /** set current value of pihalfAxis
                 *  @see #getPihalfAxis
                 */
                // -beg- preserve=no 3948DFB602EC set_head3948DE860321 "pihalfAxis"
                public  void setPihalfAxis(long value1)
                // -end- 3948DFB602EC set_head3948DE860321 "pihalfAxis"
                {
                  // -beg- preserve=no 3948DFB602EC set_body3948DE860321 "pihalfAxis"
                  if(pihalfAxis != value1){
                    pihalfAxis = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPihalfAxis"));
                  }
                  // -end- 3948DFB602EC set_body3948DE860321 "pihalfAxis"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3948DE860321 detail_end "RotationDef"

                // -end- 3948DE860321 detail_end "RotationDef"

              }

=======
// -beg- preserve=no 3948DE860321 package "RotationDef"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 3948DE860321 package "RotationDef"

// -beg- preserve=no 3948DE860321 autoimport "RotationDef"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3948DE860321 autoimport "RotationDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3948DE860321 import "RotationDef"

// -end- 3948DE860321 import "RotationDef"

/**
 * Definiert die Rotation bei Koordinatendatentypen.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:29 $
 */
public class RotationDef extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3948DE860321 detail_begin "RotationDef"

	// -end- 3948DE860321 detail_begin "RotationDef"

	private static final long serialVersionUID = -5163766943259978500L;

	// -beg- preserve=no 3D4FA21B0201 head3948DE860321 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0201 head3948DE860321 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0201 throws3948DE860321 "unlinkAll"

	// -end- 3D4FA21B0201 throws3948DE860321 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0201 body3948DE860321 "unlinkAll"

		// Role CoordinateType: CoordinateType object(s) may point to this
		super.unlinkAll();
		// -end- 3D4FA21B0201 body3948DE860321 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B020B head3948DE860321 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B020B head3948DE860321 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B020B throws3948DE860321 "enumerateChildren"

	// -end- 3D4FA21B020B throws3948DE860321 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B020B body3948DE860321 "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B020B body3948DE860321 "enumerateChildren"
	}

	// -beg- preserve=no 3948DFB001E9 var3948DE860321 "nullAxis"
	private long nullAxis;
	// -end- 3948DFB001E9 var3948DE860321 "nullAxis"

	/**
	 * get current value of nullAxis Achsnummer der Hauptachse (Nullrichtung)
	 * 
	 * @see #setNullAxis
	 */
	// -beg- preserve=no 3948DFB001E9 get_head3948DE860321 "nullAxis"
	public long getNullAxis()
	// -end- 3948DFB001E9 get_head3948DE860321 "nullAxis"
	{
		// -beg- preserve=no 3948DFB001E9 get_body3948DE860321 "nullAxis"
		return nullAxis;
		// -end- 3948DFB001E9 get_body3948DE860321 "nullAxis"
	}

	/**
	 * set current value of nullAxis
	 * 
	 * @see #getNullAxis
	 */
	// -beg- preserve=no 3948DFB001E9 set_head3948DE860321 "nullAxis"
	public void setNullAxis(long value1)
	// -end- 3948DFB001E9 set_head3948DE860321 "nullAxis"
	{
		// -beg- preserve=no 3948DFB001E9 set_body3948DE860321 "nullAxis"
		if (nullAxis != value1) {
			nullAxis = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setNullAxis"));
		}
		// -end- 3948DFB001E9 set_body3948DE860321 "nullAxis"
	}

	// -beg- preserve=no 3948DFB602EC var3948DE860321 "pihalfAxis"
	private long pihalfAxis;
	// -end- 3948DFB602EC var3948DE860321 "pihalfAxis"

	/**
	 * get current value of pihalfAxis Achsnummer die einem positiven rechten
	 * Winkel entspricht.
	 * 
	 * @see #setPihalfAxis
	 */
	// -beg- preserve=no 3948DFB602EC get_head3948DE860321 "pihalfAxis"
	public long getPihalfAxis()
	// -end- 3948DFB602EC get_head3948DE860321 "pihalfAxis"
	{
		// -beg- preserve=no 3948DFB602EC get_body3948DE860321 "pihalfAxis"
		return pihalfAxis;
		// -end- 3948DFB602EC get_body3948DE860321 "pihalfAxis"
	}

	/**
	 * set current value of pihalfAxis
	 * 
	 * @see #getPihalfAxis
	 */
	// -beg- preserve=no 3948DFB602EC set_head3948DE860321 "pihalfAxis"
	public void setPihalfAxis(long value1)
	// -end- 3948DFB602EC set_head3948DE860321 "pihalfAxis"
	{
		// -beg- preserve=no 3948DFB602EC set_body3948DE860321 "pihalfAxis"
		if (pihalfAxis != value1) {
			pihalfAxis = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setPihalfAxis"));
		}
		// -end- 3948DFB602EC set_body3948DE860321 "pihalfAxis"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3948DE860321 detail_end "RotationDef"

	// -end- 3948DE860321 detail_end "RotationDef"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
