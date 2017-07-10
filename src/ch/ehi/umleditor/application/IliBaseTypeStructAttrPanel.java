package ch.ehi.umleditor.application;

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

import java.awt.*;
import java.util.Iterator;

import javax.swing.*;
import ch.softenvironment.util.DeveloperException;
import ch.softenvironment.view.BasePanel;
import ch.softenvironment.view.DataPanel;
import ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDefKind;

/**
 * panel to view/edit a INTERLIS structure attribute.
 *
 * @author ce
 * @version $Revision: 1.4 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeStructAttrPanel extends BasePanel implements DataPanel {
	private static java.util.ResourceBundle resRoleDefDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/RoleDefDialog"); //$NON-NLS-1$;
    private GridBagLayout gridBagLayout1 = new GridBagLayout();
    private ReferencableComboBox cbStruct = new ReferencableComboBox();
    private RestrictedClassesPanel tabRestricted = new RestrictedClassesPanel();
    private JDialog thisDialog=null;

  public IliBaseTypeStructAttrPanel() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    setLayout(gridBagLayout1);
    this.add(new JLabel(resRoleDefDialog.getString("RbtStructure_text")), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(11,11, 0, 0), 0, 0));
    this.add(cbStruct, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(11, 11, 0, 11), 0, 0));
    //tabRestricted.setPreferredSize(new Dimension(220,220));
    this.add(new JLabel(resRoleDefDialog.getString("LblRestrictionTo_text")), new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(11, 11, 11, 0), 0, 0));
    this.add(tabRestricted, new GridBagConstraints(
    1 // gridx
    ,1 // gridy
    ,1 // gridwidth
    ,1 // gridheight
    , 1.0 // weightx
    , 1.0 // weighty
    , GridBagConstraints.CENTER // anchor
    , GridBagConstraints.BOTH // fill
    , new Insets(11, 11,11, 11) // insets
    , 0 // ipadx
    , 0 // ipady
    ));
  }
protected void setOwnerDialog(javax.swing.JDialog ownerDialog) {
	thisDialog = ownerDialog;
        tabRestricted.setOwnerDialog(thisDialog);
}
/**
 * Set the Object to be displayed by panel.
 * @see #setObject(Object, ModelElement) -> call first
 */
public final void setObject(java.lang.Object object) throws DeveloperException {
	throw new DeveloperException("call setObject(Object, ModelElement) instead");//$NON-NLS-1$
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object, ch.ehi.uml1_4.foundation.core.ModelElement modelElement) {

	  java.util.Set referenceableElements=ch.ehi.interlis.tools.ModelElementUtility.getReferencableElements(modelElement, ClassDef.class);
	  for(Iterator refi=referenceableElements.iterator();refi.hasNext();){
		  ClassDef ref=(ClassDef)refi.next();
		  if(ref.getKind()!=ClassDefKind.STRUCTURE){
			  refi.remove();
		  }
	  }

  StructAttrType type=(StructAttrType)object;

  AbstractClassDef[] rv=new AbstractClassDef[type.sizeRestrictedTo()];
  java.util.Iterator ri=type.iteratorRestrictedTo();
  for(int i=0;i<rv.length;i++){
    rv[i]=(AbstractClassDef)ri.next();
  }
  tabRestricted.setObject(rv,modelElement,referenceableElements);
  ClassDef participant=null;
  if(type.containsParticipant()){
	  participant=type.getParticipant();
  }
  cbStruct.setElement(referenceableElements, modelElement, participant);

}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
  // get values from view
  StructAttrType type=new StructAttrType();
  ClassDef participant=(ClassDef)cbStruct.getElement();
  if(participant!=null){
	  type.attachParticipant(participant);
  }
  AbstractClassDef[] rv=(AbstractClassDef[])tabRestricted.getObject();
  for(int i=0;i<rv.length;i++){
    if(!type.containsRestrictedTo((ClassDef)rv[i])){
      type.addRestrictedTo((ClassDef)rv[i]);
    }
  }
  return type;
}

}