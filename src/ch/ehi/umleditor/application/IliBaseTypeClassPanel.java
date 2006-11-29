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
import javax.swing.*;
import ch.softenvironment.util.DeveloperException;
import ch.softenvironment.view.BasePanel;
import ch.softenvironment.view.DataPanel;
import ch.ehi.interlis.domainsandconstants.basetypes.ClassType;
import ch.ehi.interlis.modeltopicclass.ClassDefKind;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;

/**
 * panel to view/edit a INTERLIS ClassType.
 *
 * @author ce
 * @version $Revision: 1.4 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeClassPanel extends BasePanel implements DataPanel {
    private GridBagLayout gridBagLayout1 = new GridBagLayout();
    private JRadioButton rbClass = new JRadioButton();
    private JRadioButton rbStruct = new JRadioButton();
    private RestrictedClassesPanel tabRestricted = new RestrictedClassesPanel();
    private JDialog thisDialog=null;

  public IliBaseTypeClassPanel() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    setLayout(gridBagLayout1);
    rbClass.setText(getResourceString("RbClass_text"));
    rbStruct.setText(getResourceString("RbStructure_text"));
    this.add(rbClass, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    this.add(rbStruct, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    //tabRestricted.setPreferredSize(new Dimension(220,220));
    this.add(tabRestricted, new GridBagConstraints(
    0 // gridx
    ,1 // gridy
    ,2 // gridwidth
    ,1 // gridheight
    , 1.0 // weightx
    , 1.0 // weighty
    , GridBagConstraints.CENTER // anchor
    , GridBagConstraints.BOTH // fill
    , new Insets(0, 0, 0, 0) // insets
    , 0 // ipadx
    , 0 // ipady
    ));
	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
	group.add(rbClass);
	group.add(rbStruct);
	rbClass.setSelected(true);
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
  // initalize aggregations
  //pnlNumeric.setObject(ElementFactory.createNumericType(), modelElement);

  // update View
  ClassType type=(ClassType)object;
  if(type.getKind()==ClassDefKind.CLASS){
	rbClass.setSelected(true);
  }else if(type.getKind()==ClassDefKind.STRUCTURE){
	rbStruct.setSelected(true);
  }

  AbstractClassDef[] rv=new AbstractClassDef[type.sizeRestrictedTo()];
  java.util.Iterator ri=type.iteratorRestrictedTo();
  for(int i=0;i<rv.length;i++){
    rv[i]=(AbstractClassDef)ri.next();
  }
  tabRestricted.setObject(rv,modelElement);

}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
  // get values from view
  ClassType type=new ClassType();
    	if (rbClass.isSelected()) {
          type.setKind(ClassDefKind.CLASS);
    	}else if (rbStruct.isSelected()) {
          type.setKind(ClassDefKind.STRUCTURE);
        }
  AbstractClassDef[] rv=(AbstractClassDef[])tabRestricted.getObject();
  for(int i=0;i<rv.length;i++){
    if(!type.containsRestrictedTo(rv[i])){
      type.addRestrictedTo(rv[i]);
    }
  }
  return type;
}

}