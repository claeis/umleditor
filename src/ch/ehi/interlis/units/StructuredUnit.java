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

          // -beg- preserve=no 3949E1890160 package "StructuredUnit"
package ch.ehi.interlis.units;
          // -end- 3949E1890160 package "StructuredUnit"

          // -beg- preserve=no 3949E1890160 autoimport "StructuredUnit"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.units.StructuredUnitDim;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3949E1890160 autoimport "StructuredUnit"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3949E1890160 import "StructuredUnit"

          // -end- 3949E1890160 import "StructuredUnit"

          /** Definiert eine Strukturierte Einheit.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:21 $
           */
public class StructuredUnit extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3949E1890160 detail_begin "StructuredUnit"

            // -end- 3949E1890160 detail_begin "StructuredUnit"

            // -beg- preserve=no 3D4FA21800F8 head3949E1890160 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21800F8 head3949E1890160 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800F8 throws3949E1890160 "unlinkAll"

              // -end- 3D4FA21800F8 throws3949E1890160 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800F8 body3949E1890160 "unlinkAll"
              
              // Role UnitDef: UnitDef object(s) may point to this
              clearDim();
              super.unlinkAll();
              // -end- 3D4FA21800F8 body3949E1890160 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21800F9 head3949E1890160 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21800F9 head3949E1890160 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800F9 throws3949E1890160 "enumerateChildren"

              // -end- 3D4FA21800F9 throws3949E1890160 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800F9 body3949E1890160 "enumerateChildren"
              java.util.Iterator it=null;
              it=iteratorDim();while(it.hasNext())visitor.visit(it.next());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21800F9 body3949E1890160 "enumerateChildren"
              }

            // -beg- preserve=no 394A243A0299 code3949E1890160 "dim"
            private java.util.Set dim = new java.util.HashSet();
            // -end- 394A243A0299 code3949E1890160 "dim"

            /** add a Dim.
             *  
             *  @see #removeDim
             *  @see #containsDim
             *  @see #iteratorDim
             *  @see #clearDim
             *  @see #sizeDim
             */
            // -beg- preserve=no 394A243A0299 add_head3949E1890160 "StructuredUnit::addDim"
            public void addDim(StructuredUnitDim dim1)
            // -end- 394A243A0299 add_head3949E1890160 "StructuredUnit::addDim"
            {
              // -beg- preserve=no 394A243A0299 add_body3949E1890160 "StructuredUnit::addDim"
              dim.add(dim1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDim"));
              return;
              // -end- 394A243A0299 add_body3949E1890160 "StructuredUnit::addDim"
            }

            /** disconnect a Dim.
             *  @see #addDim
             */
            // -beg- preserve=no 394A243A0299 remove_head3949E1890160 "StructuredUnit::removeDim"
            public StructuredUnitDim removeDim(StructuredUnitDim dim1)
            // -end- 394A243A0299 remove_head3949E1890160 "StructuredUnit::removeDim"
            {
              // -beg- preserve=no 394A243A0299 remove_body3949E1890160 "StructuredUnit::removeDim"
              StructuredUnitDim ret=null;
              if(dim1==null || !dim.contains(dim1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = dim1;
              dim.remove(dim1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDim"));
              return ret;
              // -end- 394A243A0299 remove_body3949E1890160 "StructuredUnit::removeDim"
            }

            /** tests if a given Dim is connected.
             *  @see #addDim
             */
            // -beg- preserve=no 394A243A0299 test_head3949E1890160 "StructuredUnit::containsDim"
            public boolean containsDim(StructuredUnitDim dim1)
            // -end- 394A243A0299 test_head3949E1890160 "StructuredUnit::containsDim"
            {
              // -beg- preserve=no 394A243A0299 test_body3949E1890160 "StructuredUnit::containsDim"
              return dim.contains(dim1);
              // -end- 394A243A0299 test_body3949E1890160 "StructuredUnit::containsDim"
            }

            /** used to enumerate all connected Dims.
             *  @see #addDim
             */
            // -beg- preserve=no 394A243A0299 get_all_head3949E1890160 "StructuredUnit::iteratorDim"
            public java.util.Iterator iteratorDim()
            // -end- 394A243A0299 get_all_head3949E1890160 "StructuredUnit::iteratorDim"
            {
              // -beg- preserve=no 394A243A0299 get_all_body3949E1890160 "StructuredUnit::iteratorDim"
              return dim.iterator();
              // -end- 394A243A0299 get_all_body3949E1890160 "StructuredUnit::iteratorDim"
            }

            /** disconnect all Dims.
             *  @see #addDim
             */
            // -beg- preserve=no 394A243A0299 remove_all_head3949E1890160 "StructuredUnit::clearDim"
            public void clearDim()
            // -end- 394A243A0299 remove_all_head3949E1890160 "StructuredUnit::clearDim"
            {
              // -beg- preserve=no 394A243A0299 remove_all_body3949E1890160 "StructuredUnit::clearDim"
              if(sizeDim()>0){
                dim.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDim"));
              }
              // -end- 394A243A0299 remove_all_body3949E1890160 "StructuredUnit::clearDim"
            }

            /** returns the number of Dims.
             *  @see #addDim
             */
            // -beg- preserve=no 394A243A0299 size_head3949E1890160 "StructuredUnit::sizeDim"
            public int sizeDim()
            // -end- 394A243A0299 size_head3949E1890160 "StructuredUnit::sizeDim"
            {
              // -beg- preserve=no 394A243A0299 size_body3949E1890160 "StructuredUnit::sizeDim"
              return dim.size();
              // -end- 394A243A0299 size_body3949E1890160 "StructuredUnit::sizeDim"
            }

            // -beg- preserve=no 394A2624010C var3949E1890160 "continuous"
            private boolean continuous;
            // -end- 394A2624010C var3949E1890160 "continuous"

            /** get current value of continuous
             *  true wenn Einheit ohne Unstetigkeit.
             *  @see #setContinuous
             */
            // -beg- preserve=no 394A2624010C get_head3949E1890160 "continuous"
            public  boolean isContinuous()
            // -end- 394A2624010C get_head3949E1890160 "continuous"
            {
              // -beg- preserve=no 394A2624010C get_body3949E1890160 "continuous"
              return continuous;
              // -end- 394A2624010C get_body3949E1890160 "continuous"
            }

            /** set current value of continuous
             *  @see #isContinuous
             */
            // -beg- preserve=no 394A2624010C set_head3949E1890160 "continuous"
            public  void setContinuous(boolean value1)
            // -end- 394A2624010C set_head3949E1890160 "continuous"
            {
              // -beg- preserve=no 394A2624010C set_body3949E1890160 "continuous"
              if(continuous != value1){
                continuous = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setContinuous"));
              }
              // -end- 394A2624010C set_body3949E1890160 "continuous"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3949E1890160 detail_end "StructuredUnit"

            // -end- 3949E1890160 detail_end "StructuredUnit"

          }

=======
// -beg- preserve=no 3949E1890160 package "StructuredUnit"
package ch.ehi.interlis.units;
// -end- 3949E1890160 package "StructuredUnit"

// -beg- preserve=no 3949E1890160 autoimport "StructuredUnit"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.units.StructuredUnitDim;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3949E1890160 autoimport "StructuredUnit"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3949E1890160 import "StructuredUnit"

// -end- 3949E1890160 import "StructuredUnit"

/**
 * Definiert eine Strukturierte Einheit.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:21 $
 */
public class StructuredUnit extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3949E1890160 detail_begin "StructuredUnit"

	// -end- 3949E1890160 detail_begin "StructuredUnit"

	private static final long serialVersionUID = -7081724208216366418L;

	// -beg- preserve=no 3D4FA21800F8 head3949E1890160 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21800F8 head3949E1890160 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21800F8 throws3949E1890160 "unlinkAll"

	// -end- 3D4FA21800F8 throws3949E1890160 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21800F8 body3949E1890160 "unlinkAll"

		// Role UnitDef: UnitDef object(s) may point to this
		clearDim();
		super.unlinkAll();
		// -end- 3D4FA21800F8 body3949E1890160 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21800F9 head3949E1890160 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21800F9 head3949E1890160 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21800F9 throws3949E1890160 "enumerateChildren"

	// -end- 3D4FA21800F9 throws3949E1890160 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21800F9 body3949E1890160 "enumerateChildren"
		Iterator<?> it = null;
		it = iteratorDim();
		while (it.hasNext())
			visitor.visit(it.next());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21800F9 body3949E1890160 "enumerateChildren"
	}

	// -beg- preserve=no 394A243A0299 code3949E1890160 "dim"
	private Set<StructuredUnitDim> dim = new HashSet<StructuredUnitDim>();
	// -end- 394A243A0299 code3949E1890160 "dim"

	/**
	 * add a Dim.
	 * 
	 * @see #removeDim
	 * @see #containsDim
	 * @see #iteratorDim
	 * @see #clearDim
	 * @see #sizeDim
	 */
	// -beg- preserve=no 394A243A0299 add_head3949E1890160
	// "StructuredUnit::addDim"
	public void addDim(StructuredUnitDim dim1)
	// -end- 394A243A0299 add_head3949E1890160 "StructuredUnit::addDim"
	{
		// -beg- preserve=no 394A243A0299 add_body3949E1890160
		// "StructuredUnit::addDim"
		dim.add(dim1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addDim"));
		return;
		// -end- 394A243A0299 add_body3949E1890160 "StructuredUnit::addDim"
	}

	/**
	 * disconnect a Dim.
	 * 
	 * @see #addDim
	 */
	// -beg- preserve=no 394A243A0299 remove_head3949E1890160
	// "StructuredUnit::removeDim"
	public StructuredUnitDim removeDim(StructuredUnitDim dim1)
	// -end- 394A243A0299 remove_head3949E1890160 "StructuredUnit::removeDim"
	{
		// -beg- preserve=no 394A243A0299 remove_body3949E1890160
		// "StructuredUnit::removeDim"
		StructuredUnitDim ret = null;
		if (dim1 == null || !dim.contains(dim1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = dim1;
		dim.remove(dim1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeDim"));
		return ret;
		// -end- 394A243A0299 remove_body3949E1890160
		// "StructuredUnit::removeDim"
	}

	/**
	 * tests if a given Dim is connected.
	 * 
	 * @see #addDim
	 */
	// -beg- preserve=no 394A243A0299 test_head3949E1890160
	// "StructuredUnit::containsDim"
	public boolean containsDim(StructuredUnitDim dim1)
	// -end- 394A243A0299 test_head3949E1890160 "StructuredUnit::containsDim"
	{
		// -beg- preserve=no 394A243A0299 test_body3949E1890160
		// "StructuredUnit::containsDim"
		return dim.contains(dim1);
		// -end- 394A243A0299 test_body3949E1890160
		// "StructuredUnit::containsDim"
	}

	/**
	 * used to enumerate all connected Dims.
	 * 
	 * @see #addDim
	 */
	// -beg- preserve=no 394A243A0299 get_all_head3949E1890160
	// "StructuredUnit::iteratorDim"
	public Iterator<?> iteratorDim()
	// -end- 394A243A0299 get_all_head3949E1890160 "StructuredUnit::iteratorDim"
	{
		// -beg- preserve=no 394A243A0299 get_all_body3949E1890160
		// "StructuredUnit::iteratorDim"
		return dim.iterator();
		// -end- 394A243A0299 get_all_body3949E1890160
		// "StructuredUnit::iteratorDim"
	}

	/**
	 * disconnect all Dims.
	 * 
	 * @see #addDim
	 */
	// -beg- preserve=no 394A243A0299 remove_all_head3949E1890160
	// "StructuredUnit::clearDim"
	public void clearDim()
	// -end- 394A243A0299 remove_all_head3949E1890160 "StructuredUnit::clearDim"
	{
		// -beg- preserve=no 394A243A0299 remove_all_body3949E1890160
		// "StructuredUnit::clearDim"
		if (sizeDim() > 0) {
			dim.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearDim"));
		}
		// -end- 394A243A0299 remove_all_body3949E1890160
		// "StructuredUnit::clearDim"
	}

	/**
	 * returns the number of Dims.
	 * 
	 * @see #addDim
	 */
	// -beg- preserve=no 394A243A0299 size_head3949E1890160
	// "StructuredUnit::sizeDim"
	public int sizeDim()
	// -end- 394A243A0299 size_head3949E1890160 "StructuredUnit::sizeDim"
	{
		// -beg- preserve=no 394A243A0299 size_body3949E1890160
		// "StructuredUnit::sizeDim"
		return dim.size();
		// -end- 394A243A0299 size_body3949E1890160 "StructuredUnit::sizeDim"
	}

	// -beg- preserve=no 394A2624010C var3949E1890160 "continuous"
	private boolean continuous;
	// -end- 394A2624010C var3949E1890160 "continuous"

	/**
	 * get current value of continuous true wenn Einheit ohne Unstetigkeit.
	 * 
	 * @see #setContinuous
	 */
	// -beg- preserve=no 394A2624010C get_head3949E1890160 "continuous"
	public boolean isContinuous()
	// -end- 394A2624010C get_head3949E1890160 "continuous"
	{
		// -beg- preserve=no 394A2624010C get_body3949E1890160 "continuous"
		return continuous;
		// -end- 394A2624010C get_body3949E1890160 "continuous"
	}

	/**
	 * set current value of continuous
	 * 
	 * @see #isContinuous
	 */
	// -beg- preserve=no 394A2624010C set_head3949E1890160 "continuous"
	public void setContinuous(boolean value1)
	// -end- 394A2624010C set_head3949E1890160 "continuous"
	{
		// -beg- preserve=no 394A2624010C set_body3949E1890160 "continuous"
		if (continuous != value1) {
			continuous = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setContinuous"));
		}
		// -end- 394A2624010C set_body3949E1890160 "continuous"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3949E1890160 detail_end "StructuredUnit"

	// -end- 3949E1890160 detail_end "StructuredUnit"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
