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
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.uml1_4.foundation.core.Classifier;

/**
 * @author ce
 */
public class RoleDefUtility {
	private RoleDefUtility(){
	}
	/** tests if role is a ili struct attr
	 */
	static public boolean isIliStructAttr(RoleDef role){
		AssociationDef assoc=(AssociationDef)role.getAssociation();
		if(assoc.sizeConnection()!=2){
			return false;
		}
		RoleDef oppend=getOppEnd(role);
		if(oppend==null){
			// association incomplete
			return false; 
		}
		if(!oppend.containsParticipant()){
			// association incomplete
			return false; 
		}
		Classifier oppendClass=oppend.getParticipant();
		if(role.getAggregation()==AggregationKind.COMPOSITE 
				&& oppendClass instanceof ClassDef 
				&& ((ClassDef)oppendClass).getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE){
			return true;
		}
		return false;
	}
	/** tests if role is a ili reference attr
	 */
	static public boolean isIliRefAttr(RoleDef role)
	{
		AssociationDef assoc=(AssociationDef)role.getAssociation();
		if(assoc.sizeConnection()!=2){
			return false;
		}
		RoleDef oppend=getOppEnd(role);
		if(oppend==null){
			// association incomplete
			return false; 
		}
		if(!role.containsParticipant()){
			// association incomplete
			return false; 
		}
		Classifier thisClass=role.getParticipant();
		if(!oppend.containsParticipant()){
			// association incomplete
			return false; 
		}
		Classifier oppendClass=oppend.getParticipant();
		if(role.getAggregation()==AggregationKind.NONE
		&& thisClass instanceof ClassDef
		&& ((ClassDef)thisClass).getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE 
		&& ((oppendClass instanceof ClassDef
			&& ((ClassDef)oppendClass).getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.CLASS)
			|| oppendClass instanceof AssociationDef
			)
		&& oppend.getAggregation()==AggregationKind.NONE){
			return true;
		}
		return false;
	}
	/** tests if role is a ili reference or struct attr
	 */
	static public boolean isIliAttr(RoleDef role)
	{
		return isIliRefAttr(role) || isIliStructAttr(role);
	}
	/** get other end of a bidrectional association
	 *
	 */
	static public RoleDef getOppEnd(RoleDef athis)
	{
	  AssociationDef assoc=(AssociationDef)athis.getAssociation();
	  java.util.Iterator rolei=assoc.iteratorConnection();
	  while(rolei.hasNext()){
		RoleDef obj=(RoleDef)rolei.next();
		if(obj!=athis){
		  return obj;
		}
	  }
	  return null;
	}

}
