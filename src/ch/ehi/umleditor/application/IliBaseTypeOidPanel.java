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

import java.awt.event.*;
import ch.ehi.interlis.domainsandconstants.basetypes.OidType;
import ch.ehi.interlis.domainsandconstants.basetypes.OidKind;
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;

/**
 * panel to view/edit a INTERLIS OidType.
 *
 * @author ce
 * @version $Revision: 1.4 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeOidPanel extends BasePanel implements DataPanel {
  private GridBagLayout gridBagLayout1 = new GridBagLayout();
  private JRadioButton rbAny = new JRadioButton();
  private JRadioButton rbText = new JRadioButton();
  private JRadioButton rbNumeric = new JRadioButton();
  private IliBaseTypeNumericPanel pnlNumeric = new IliBaseTypeNumericPanel();
  private IliBaseTypeTextPanel pnlText = new IliBaseTypeTextPanel();
  private JPanel pnlAny = new JPanel();

  public IliBaseTypeOidPanel() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    rbAny.setText(getResourceString("RbAny_text"));
    rbAny.addItemListener(new java.awt.event.ItemListener() {

      public void itemStateChanged(ItemEvent e) {
        kind_itemStateChanged(e);
      }
    });
    this.setLayout(gridBagLayout1);
    rbText.setText(getResourceString("RbText_text"));
    rbText.addItemListener(new java.awt.event.ItemListener() {

      public void itemStateChanged(ItemEvent e) {
        kind_itemStateChanged(e);
      }
    });
    rbNumeric.setText(getResourceString("RbNumeric_text"));
    rbNumeric.addItemListener(new java.awt.event.ItemListener() {

      public void itemStateChanged(ItemEvent e) {
        kind_itemStateChanged(e);
      }
    });
    pnlText.setPreferredSize(new Dimension(487, 259));
    pnlAny.setPreferredSize(new Dimension(487, 259));
    this.add(rbAny, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    this.add(rbText, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    this.add(rbNumeric, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    this.add(pnlAny, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    this.add(pnlText, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    this.add(pnlNumeric, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
	group.add(rbAny);
	group.add(rbText);
	group.add(rbNumeric);
	rbAny.setSelected(true);
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
  pnlNumeric.setObject(ElementFactory.createNumericType(), modelElement);

  // update View
  OidType oid=(OidType)object;
  if(oid.getKind()==OidKind.ANY){
	rbAny.setSelected(true);
  }else if(oid.getKind()==OidKind.NUMERIC){
	rbNumeric.setSelected(true);
        pnlNumeric.setObject(oid.getOiddomain(), modelElement);
  }else if(oid.getKind()==OidKind.TEXT){
	rbText.setSelected(true);
        pnlText.setObject(oid.getOiddomain());
  }

}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
  // get values from view
  OidType oid=new OidType();
    	if (rbAny.isSelected()) {
          oid.setKind(OidKind.ANY);
    	}else if (rbNumeric.isSelected()) {
          oid.setKind(OidKind.NUMERIC);
          oid.attachOiddomain((BaseType)pnlNumeric.getObject());
    	}else if (rbText.isSelected()) {
          oid.setKind(OidKind.TEXT);
          oid.attachOiddomain((BaseType)pnlText.getObject());
        }
  return oid;
}

  void kind_itemStateChanged(ItemEvent e) {
    	if (rbAny.isSelected()) {
		pnlAny.setVisible(true);
		pnlNumeric.setVisible(false);
		pnlText.setVisible(false);
    	}else if (rbNumeric.isSelected()) {
		pnlAny.setVisible(false);
		pnlNumeric.setVisible(true);
		pnlText.setVisible(false);
    	}else if (rbText.isSelected()) {
		pnlAny.setVisible(false);
		pnlNumeric.setVisible(false);
		pnlText.setVisible(true);
        }
  }
}