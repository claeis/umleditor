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
package ch.ehi.interlis.tools;
import ch.ehi.interlis.associations.*;
import ch.ehi.uml1_4.foundation.datatypes.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.interlis.attributes.*;
import ch.ehi.uml1_4.foundation.core.Classifier;
import java.util.*;

/**
 * @author ce
 */
public class AbstractClassDefUtility {
	private AbstractClassDefUtility(){
	}
	static public List getIliAttributes(AbstractClassDef aclass){ 
		Iterator it=aclass.iteratorFeature();
		ArrayList attrlist=new ArrayList();
		while ((it != null) && (it.hasNext())) {
			Object feature = it.next();
			if (feature instanceof AttributeDef) {
				attrlist.add((AttributeDef)feature);
			}
		}
		ArrayList rolesSorted=new ArrayList();
		it=aclass.iteratorAssociation();
		while(it.hasNext()){
		   Object obj=it.next();
		   if(obj instanceof RoleDef && RoleDefUtility.isIliAttr((RoleDef)obj)){
			rolesSorted.add(RoleDefUtility.getOppEnd((RoleDef)obj));
		   }else{
			// ignore others; should not have others
		   }
		}
	
		java.util.Collections.sort(rolesSorted,new java.util.Comparator(){
		  public int compare(Object o1,Object o2){
			int idx1=((RoleDef)o1).getIliAttributeIdx();
			int idx2=((RoleDef)o2).getIliAttributeIdx();
			if(idx1==idx2){
				if(idx1==-1){
					// both not yet ordered
					// sort according to name
					return ((RoleDef)o1).getDefLangName().compareTo(((RoleDef)o2).getDefLangName());
				}
				return 0;
			}
			if(idx1==-1)return 1;
			if(idx2==-1)return -1;
			if(idx1<idx2)return -1;
			return 1;
		  }
		});
		it=rolesSorted.iterator();
		while (it.hasNext()){
		  RoleDef role = (RoleDef) it.next();
		  int idx=role.getIliAttributeIdx();
		  if(idx==-1 || idx>=attrlist.size()){
			attrlist.add(role);
		  }else{
			attrlist.add(idx,role);
		  }
		}
		return attrlist;
	}
}
