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
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.interlis.domainsandconstants.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.softenvironment.util.*;
import ch.softenvironment.view.*;

/**
 * INTERLIS BaseType representation of <b>LineType</b>.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:06 $
 */
public class IliBaseTypeLinePanel extends DataPanel {
	private static java.util.ResourceBundle resIliBaseTypeLinePanel = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/IliBaseTypeLinePanel");  //$NON-NLS-1$
	//private LineType lineType = null;
        private java.lang.Class lineTypeClass = null;
	private ModelElement parent = null;
	private javax.swing.JDialog dialog = null;
	private ReferencableComboBox ivjCbxClassDef = null;
	private ReferencableComboBox ivjCbxDomainDef = null;
	private javax.swing.JCheckBox ivjChxDirected = null;
	private javax.swing.JLabel ivjLblControlPoints = null;
	private javax.swing.JLabel ivjLblIntersection = null;
	private javax.swing.JScrollPane ivjScpLineFormTypeDef = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblLineAttributes = null;
	private javax.swing.table.TableColumn ivjTbcLineFormTypeDef = null;
	private javax.swing.JSeparator ivjJSeparator1 = null;
	private javax.swing.JMenuItem ivjMniNewLineFormTypeDef = null;
	private javax.swing.JMenuItem ivjMniOpenLineFormTypeDefSpecification = null;
	private javax.swing.JMenuItem ivjMniRemoveLineFormTypeDef = null;
	private javax.swing.JPopupMenu ivjMnuLineFormTypeDef = null;
	private javax.swing.JPanel ivjPnlLineForm = null;
	private javax.swing.JTable ivjTblLineFormTypeDef = null;
	private IliDimPanel ivjPnlIntersection = null;
	private javax.swing.JCheckBox ivjChxArcs = null;
	private javax.swing.JCheckBox ivjChxStraights = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == IliBaseTypeLinePanel.this.getMniOpenLineFormTypeDefSpecification()) 
				connEtoC6(e);
			if (e.getSource() == IliBaseTypeLinePanel.this.getMniNewLineFormTypeDef()) 
				connEtoC7(e);
			if (e.getSource() == IliBaseTypeLinePanel.this.getMniRemoveLineFormTypeDef()) 
				connEtoC8(e);
		};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == IliBaseTypeLinePanel.this.getScpLineFormTypeDef()) 
				connEtoC1(e);
			if (e.getSource() == IliBaseTypeLinePanel.this.getTblLineFormTypeDef()) 
				connEtoC2(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == IliBaseTypeLinePanel.this.getScpLineFormTypeDef()) 
				connEtoC4(e);
			if (e.getSource() == IliBaseTypeLinePanel.this.getTblLineFormTypeDef()) 
				connEtoC5(e);
		};
	};
/**
 * IliBaseTypeTextPanel constructor comment.
 */
public IliBaseTypeLinePanel() {
	super();
	initialize();
}
/**
 * Adapt the given PopupMenu before displaying it (for e.g. disable Items).
 * Overwrite this method.
 */
protected javax.swing.JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	boolean isSelected = getTblLineFormTypeDef().getSelectedRow() >= 0;
	getMniOpenLineFormTypeDefSpecification().setEnabled(isSelected);
	getMniRemoveLineFormTypeDef().setEnabled(isSelected);

	return popupMenu;
}
/**
 * connEtoC1:  (ScpLineFormTypeDef.mouse.mousePressed(java.awt.event.MouseEvent) --> IliBaseTypeLinePanel.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuLineFormTypeDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (TblLineFormTypeDef.mouse.mousePressed(java.awt.event.MouseEvent) --> IliBaseTypeLinePanel.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuLineFormTypeDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (ScpLineFormTypeDef.mouse.mouseReleased(java.awt.event.MouseEvent) --> IliBaseTypeLinePanel.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuLineFormTypeDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (TblLineFormTypeRef.mouse.mouseReleased(java.awt.event.MouseEvent) --> IliBaseTypeLinePanel.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuLineFormTypeDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (MniOpenLineFormTypeDefSpecification.action.actionPerformed(java.awt.event.ActionEvent) --> IliBaseTypeLinePanel.mniOpenLineFormTypeDefSpecification()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniOpenLineFormTypeDefSpecification();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (MniNewLineFormTypeDef.action.actionPerformed(java.awt.event.ActionEvent) --> IliBaseTypeLinePanel.mniNewLineFormTypeDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC7(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniNewLineFormTypeDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC8:  (MniRemoveLineFormTypeDef.action.actionPerformed(java.awt.event.ActionEvent) --> IliBaseTypeLinePanel.mniRemoveLineFormTypeDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniRemoveLineFormTypeDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the CbxClassDef property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxClassDef() {
	if (ivjCbxClassDef == null) {
		try {
			ivjCbxClassDef = new ch.ehi.umleditor.application.ReferencableComboBox();
			ivjCbxClassDef.setName("CbxClassDef");
			ivjCbxClassDef.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxClassDef;
}
/**
 * Return the CbxDomainDef property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxDomainDef() {
	if (ivjCbxDomainDef == null) {
		try {
			ivjCbxDomainDef = new ch.ehi.umleditor.application.ReferencableComboBox();
			ivjCbxDomainDef.setName("CbxDomainDef");
			ivjCbxDomainDef.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
			ivjCbxDomainDef.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxDomainDef;
}
/**
 * Return the ChxArcs property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxArcs() {
	if (ivjChxArcs == null) {
		try {
			ivjChxArcs = new javax.swing.JCheckBox();
			ivjChxArcs.setName("ChxArcs");
			ivjChxArcs.setToolTipText(resIliBaseTypeLinePanel.getString("ChxArcs_toolTipText"));
			ivjChxArcs.setText(resIliBaseTypeLinePanel.getString("ChxArcs_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxArcs;
}
/**
 * Return the JCheckBox1 property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxDirected() {
	if (ivjChxDirected == null) {
		try {
			ivjChxDirected = new javax.swing.JCheckBox();
			ivjChxDirected.setName("ChxDirected");
			ivjChxDirected.setToolTipText("Gerichtet");
			ivjChxDirected.setText("Directed");
			// user code begin {1}
			ivjChxDirected.setToolTipText(resIliBaseTypeLinePanel.getString("ChxDirected_toolTipText"));
			ivjChxDirected.setText(resIliBaseTypeLinePanel.getString("ChxDirected_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxDirected;
}
/**
 * Return the ChxStraights property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxStraights() {
	if (ivjChxStraights == null) {
		try {
			ivjChxStraights = new javax.swing.JCheckBox();
			ivjChxStraights.setName("ChxStraights");
			ivjChxStraights.setToolTipText(resIliBaseTypeLinePanel.getString("ChxStraights_toolTipText"));
			ivjChxStraights.setText(resIliBaseTypeLinePanel.getString("ChxStraights_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxStraights;
}
/**
 * Return the JSeparator1 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator1() {
	if (ivjJSeparator1 == null) {
		try {
			ivjJSeparator1 = new javax.swing.JSeparator();
			ivjJSeparator1.setName("JSeparator1");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator1;
}
/**
 * Return the JLabel12 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblControlPoints() {
	if (ivjLblControlPoints == null) {
		try {
			ivjLblControlPoints = new javax.swing.JLabel();
			ivjLblControlPoints.setName("LblControlPoints");
			ivjLblControlPoints.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblControlPoints.setText("Control Points:");
			// user code begin {1}
			ivjLblControlPoints.setText(resIliBaseTypeLinePanel.getString("LblControlPoints_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblControlPoints;
}
/**
 * Return the JLabel13 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblIntersection() {
	if (ivjLblIntersection == null) {
		try {
			ivjLblIntersection = new javax.swing.JLabel();
			ivjLblIntersection.setName("LblIntersection");
			ivjLblIntersection.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblIntersection.setText("Intersection:");
			// user code begin {1}
			ivjLblIntersection.setText(resIliBaseTypeLinePanel.getString("LblIntersection_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblIntersection;
}
/**
 * Return the JLabel131 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblLineAttributes() {
	if (ivjLblLineAttributes == null) {
		try {
			ivjLblLineAttributes = new javax.swing.JLabel();
			ivjLblLineAttributes.setName("LblLineAttributes");
			ivjLblLineAttributes.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblLineAttributes.setText("Line Attributes:");
			// user code begin {1}
			ivjLblLineAttributes.setText(resIliBaseTypeLinePanel.getString("LblLineAttributes_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblLineAttributes;
}
/**
 * Return the MniNewLineFormTypeDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniNewLineFormTypeDef() {
	if (ivjMniNewLineFormTypeDef == null) {
		try {
			ivjMniNewLineFormTypeDef = new javax.swing.JMenuItem();
			ivjMniNewLineFormTypeDef.setName("MniNewLineFormTypeDef");
			ivjMniNewLineFormTypeDef.setText("Neu...");
			ivjMniNewLineFormTypeDef.setEnabled(true);
			// user code begin {1}
			ivjMniNewLineFormTypeDef.setText(MENU_FILE_NEW_WINDOW);
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniNewLineFormTypeDef;
}
/**
 * Return the MniOpenLineFormTypeDefSpecification property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOpenLineFormTypeDefSpecification() {
	if (ivjMniOpenLineFormTypeDefSpecification == null) {
		try {
			ivjMniOpenLineFormTypeDefSpecification = new javax.swing.JMenuItem();
			ivjMniOpenLineFormTypeDefSpecification.setName("MniOpenLineFormTypeDefSpecification");
			ivjMniOpenLineFormTypeDefSpecification.setText("Öffne Spezifikation...");
			ivjMniOpenLineFormTypeDefSpecification.setEnabled(false);
			// user code begin {1}
			ivjMniOpenLineFormTypeDefSpecification.setText(MENU_EDIT_CHANGE_WINDOW);
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOpenLineFormTypeDefSpecification;
}
/**
 * Return the MniRemoveLineFormTypeDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRemoveLineFormTypeDef() {
	if (ivjMniRemoveLineFormTypeDef == null) {
		try {
			ivjMniRemoveLineFormTypeDef = new javax.swing.JMenuItem();
			ivjMniRemoveLineFormTypeDef.setName("MniRemoveLineFormTypeDef");
			ivjMniRemoveLineFormTypeDef.setText("Löschen");
			ivjMniRemoveLineFormTypeDef.setEnabled(false);
			// user code begin {1}
			ivjMniRemoveLineFormTypeDef.setText(MENU_EDIT_REMOVE);
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRemoveLineFormTypeDef;
}
/**
 * Return the MnuLineFormTypeDef property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnuLineFormTypeDef() {
	if (ivjMnuLineFormTypeDef == null) {
		try {
			ivjMnuLineFormTypeDef = new javax.swing.JPopupMenu();
			ivjMnuLineFormTypeDef.setName("MnuLineFormTypeDef");
			ivjMnuLineFormTypeDef.add(getMniOpenLineFormTypeDefSpecification());
			ivjMnuLineFormTypeDef.add(getJSeparator1());
			ivjMnuLineFormTypeDef.add(getMniNewLineFormTypeDef());
			ivjMnuLineFormTypeDef.add(getMniRemoveLineFormTypeDef());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuLineFormTypeDef;
}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
        LineType lineType = null;
	// get kind
	if (lineTypeClass==IliPolyline.class) {
                lineType=new IliPolyline();
		((IliPolyline)lineType).setDirected(getChxDirected().isSelected());
	} else {
                if (lineTypeClass==IndividualSurface.class) {
                  lineType=new IndividualSurface();
                }else{
                  lineType=new Tesselation();
                }
		// get LineAttributes
		SurfaceType surfaceType = (SurfaceType)lineType;
		if (getCbxClassDef().getElement() != null) {
			// add new Definition
			surfaceType.attachLinAttrDef((ClassDef)getCbxClassDef().getElement());
		}
	}

	// ControlPoints
	if (getCbxDomainDef().getElement() != null) {
		lineType.attachControlpoints((DomainDef)getCbxDomainDef().getElement());
	}

	// Intersection
	if (getPnlIntersection().getObject() == null) {
		if (lineType.containsIntersectionDef()) {
			lineType.getIntersectionDef().setMaxi(null);
		}
	} else {
		if (!lineType.containsIntersectionDef()) {
			try {
				lineType.attachIntersectionDef((IntersectionDef)ElementFactory.createObject(IntersectionDef.class));
			} catch(Throwable e) {
				handleException(e);
			}
		}
		lineType.getIntersectionDef().setMaxi((IliDim)getPnlIntersection().getObject());
	}

	// LineForm
	if (getChxStraights().isSelected() || getChxArcs().isSelected() || (getTblLineFormTypeDef().getModel().getRowCount() > 0)) {
		if (!lineType.containsLineForm()) {
			lineType.attachLineForm((LineForm)ElementFactory.createObject(LineForm.class));
		}
		lineType.getLineForm().setStraights(getChxStraights().isSelected());
		lineType.getLineForm().setArcs(getChxArcs().isSelected());
                EditorTableModel formTableModel=((EditorTableModel)getTblLineFormTypeDef().getModel());
        	for (int i=0; i<formTableModel.getRowCount(); i++) {
        		lineType.getLineForm().addLineFormTypeDef((LineFormTypeDef)formTableModel.getValueAt(i,1));
        	}

	} else if (lineType.containsLineForm()) {
		lineType.detachLineForm();
	}

	return lineType;
}
/**
 * Return the PnlIntersection property value.
 * @return ch.ehi.umleditor.application.IliDimPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliDimPanel getPnlIntersection() {
	if (ivjPnlIntersection == null) {
		try {
			ivjPnlIntersection = new ch.ehi.umleditor.application.IliDimPanel();
			ivjPnlIntersection.setName("PnlIntersection");
			ivjPnlIntersection.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlIntersection;
}
/**
 * Return the JPanel11 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlLineForm() {
	if (ivjPnlLineForm == null) {
		try {
			ivjPnlLineForm = new javax.swing.JPanel();
			ivjPnlLineForm.setName("PnlLineForm");
			ivjPnlLineForm.setBorder(new javax.swing.border.EtchedBorder());
			ivjPnlLineForm.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsScpLineFormTypeDef = new java.awt.GridBagConstraints();
			constraintsScpLineFormTypeDef.gridx = 1; constraintsScpLineFormTypeDef.gridy = 2;
			constraintsScpLineFormTypeDef.gridwidth = 2;
			constraintsScpLineFormTypeDef.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpLineFormTypeDef.weightx = 1.0;
			constraintsScpLineFormTypeDef.weighty = 1.0;
			constraintsScpLineFormTypeDef.ipadx = 411;
			constraintsScpLineFormTypeDef.ipady = 48;
			constraintsScpLineFormTypeDef.insets = new java.awt.Insets(3, 16, 0, 15);
			getPnlLineForm().add(getScpLineFormTypeDef(), constraintsScpLineFormTypeDef);

			java.awt.GridBagConstraints constraintsChxArcs = new java.awt.GridBagConstraints();
			constraintsChxArcs.gridx = 2; constraintsChxArcs.gridy = 1;
			constraintsChxArcs.ipadx = 65;
			constraintsChxArcs.insets = new java.awt.Insets(12, 4, 2, 182);
			getPnlLineForm().add(getChxArcs(), constraintsChxArcs);

			java.awt.GridBagConstraints constraintsChxStraights = new java.awt.GridBagConstraints();
			constraintsChxStraights.gridx = 1; constraintsChxStraights.gridy = 1;
			constraintsChxStraights.ipadx = 46;
			constraintsChxStraights.insets = new java.awt.Insets(12, 16, 2, 4);
			getPnlLineForm().add(getChxStraights(), constraintsChxStraights);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlLineForm;
}
/**
 * Return the JScrollPane1 property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpLineFormTypeDef() {
	if (ivjScpLineFormTypeDef == null) {
		try {
			ivjScpLineFormTypeDef = new javax.swing.JScrollPane();
			ivjScpLineFormTypeDef.setName("ScpLineFormTypeDef");
			ivjScpLineFormTypeDef.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			ivjScpLineFormTypeDef.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			getScpLineFormTypeDef().setViewportView(getTblLineFormTypeDef());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpLineFormTypeDef;
}
/**
 * Return the TableColumn1 property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcLineFormTypeDef() {
	if (ivjTbcLineFormTypeDef == null) {
		try {
			ivjTbcLineFormTypeDef = new javax.swing.table.TableColumn();
			ivjTbcLineFormTypeDef.setHeaderValue("LineFormTypeDef");
			// user code begin {1}
			ivjTbcLineFormTypeDef.setHeaderValue(resIliBaseTypeLinePanel.getString("TbcLineFormTypeDef_header"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcLineFormTypeDef;
}
/**
 * Return the ScrollPaneTable property value.
 * @return javax.swing.JTable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTable getTblLineFormTypeDef() {
	if (ivjTblLineFormTypeDef == null) {
		try {
			ivjTblLineFormTypeDef = new javax.swing.JTable();
			ivjTblLineFormTypeDef.setName("TblLineFormTypeDef");
			getScpLineFormTypeDef().setColumnHeaderView(ivjTblLineFormTypeDef.getTableHeader());
			getScpLineFormTypeDef().getViewport().setBackingStoreEnabled(true);
			ivjTblLineFormTypeDef.setBounds(0, 0, 200, 200);
			ivjTblLineFormTypeDef.setAutoCreateColumnsFromModel(false);
			ivjTblLineFormTypeDef.addColumn(getTbcLineFormTypeDef());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTblLineFormTypeDef;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	LauncherView.getInstance().handleException(exception);
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getScpLineFormTypeDef().addMouseListener(ivjEventHandler);
	getTblLineFormTypeDef().addMouseListener(ivjEventHandler);
	getMniOpenLineFormTypeDefSpecification().addActionListener(ivjEventHandler);
	getMniNewLineFormTypeDef().addActionListener(ivjEventHandler);
	getMniRemoveLineFormTypeDef().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("IliBaseTypeTextPanel");
		setToolTipText(resIliBaseTypeLinePanel.getString("IliBaseTypeTextPanel_toolTipText"));
		setLayout(new java.awt.GridBagLayout());
		setSize(477, 282);

		java.awt.GridBagConstraints constraintsChxDirected = new java.awt.GridBagConstraints();
		constraintsChxDirected.gridx = 1; constraintsChxDirected.gridy = 4;
		constraintsChxDirected.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsChxDirected.ipadx = 67;
		constraintsChxDirected.insets = new java.awt.Insets(3, 10, 6, 5);
		add(getChxDirected(), constraintsChxDirected);

		java.awt.GridBagConstraints constraintsPnlLineForm = new java.awt.GridBagConstraints();
		constraintsPnlLineForm.gridx = 1; constraintsPnlLineForm.gridy = 5;
		constraintsPnlLineForm.gridwidth = 2;
		constraintsPnlLineForm.fill = java.awt.GridBagConstraints.BOTH;
		constraintsPnlLineForm.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsPnlLineForm.weightx = 1.0;
		constraintsPnlLineForm.weighty = 1.0;
		constraintsPnlLineForm.ipadx = -13;
		constraintsPnlLineForm.ipady = 17;
		constraintsPnlLineForm.insets = new java.awt.Insets(7, 6, 9, 7);
		add(getPnlLineForm(), constraintsPnlLineForm);

		java.awt.GridBagConstraints constraintsLblControlPoints = new java.awt.GridBagConstraints();
		constraintsLblControlPoints.gridx = 1; constraintsLblControlPoints.gridy = 1;
		constraintsLblControlPoints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsLblControlPoints.ipadx = 57;
		constraintsLblControlPoints.insets = new java.awt.Insets(15, 10, 7, 5);
		add(getLblControlPoints(), constraintsLblControlPoints);

		java.awt.GridBagConstraints constraintsCbxDomainDef = new java.awt.GridBagConstraints();
		constraintsCbxDomainDef.gridx = 2; constraintsCbxDomainDef.gridy = 1;
		constraintsCbxDomainDef.fill = java.awt.GridBagConstraints.HORIZONTAL;
		constraintsCbxDomainDef.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsCbxDomainDef.weightx = 1.0;
		constraintsCbxDomainDef.ipadx = 38;
		constraintsCbxDomainDef.insets = new java.awt.Insets(10, 6, 3, 152);
		add(getCbxDomainDef(), constraintsCbxDomainDef);

		java.awt.GridBagConstraints constraintsLblIntersection = new java.awt.GridBagConstraints();
		constraintsLblIntersection.gridx = 1; constraintsLblIntersection.gridy = 2;
		constraintsLblIntersection.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsLblIntersection.ipadx = 69;
		constraintsLblIntersection.insets = new java.awt.Insets(7, 10, 15, 5);
		add(getLblIntersection(), constraintsLblIntersection);

		java.awt.GridBagConstraints constraintsLblLineAttributes = new java.awt.GridBagConstraints();
		constraintsLblLineAttributes.gridx = 1; constraintsLblLineAttributes.gridy = 3;
		constraintsLblLineAttributes.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsLblLineAttributes.ipadx = 54;
		constraintsLblLineAttributes.insets = new java.awt.Insets(6, 10, 9, 5);
		add(getLblLineAttributes(), constraintsLblLineAttributes);

		java.awt.GridBagConstraints constraintsCbxClassDef = new java.awt.GridBagConstraints();
		constraintsCbxClassDef.gridx = 2; constraintsCbxClassDef.gridy = 3;
		constraintsCbxClassDef.fill = java.awt.GridBagConstraints.HORIZONTAL;
		constraintsCbxClassDef.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsCbxClassDef.weightx = 1.0;
		constraintsCbxClassDef.ipadx = 38;
		constraintsCbxClassDef.insets = new java.awt.Insets(4, 6, 2, 152);
		add(getCbxClassDef(), constraintsCbxClassDef);

		java.awt.GridBagConstraints constraintsPnlIntersection = new java.awt.GridBagConstraints();
		constraintsPnlIntersection.gridx = 2; constraintsPnlIntersection.gridy = 2;
		constraintsPnlIntersection.fill = java.awt.GridBagConstraints.BOTH;
		constraintsPnlIntersection.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsPnlIntersection.weightx = 1.0;
		constraintsPnlIntersection.weighty = 1.0;
		constraintsPnlIntersection.ipadx = 163;
		constraintsPnlIntersection.ipady = 27;
		constraintsPnlIntersection.insets = new java.awt.Insets(4, 6, 4, 152);
		add(getPnlIntersection(), constraintsPnlIntersection);
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getTblLineFormTypeDef().setModel(new EditorTableModel());
	((EditorTableModel)getTblLineFormTypeDef().getModel()).setLineFormTypeDef(null);
	// user code end
}
/**
 * Comment
 */
private void mniNewLineFormTypeDef() {
	ModelElementSelectionDialog selectionDialog = new ModelElementSelectionDialog(dialog, resIliBaseTypeLinePanel.getString("CTDialog"), true, parent, LineFormTypeDef.class); //$NON-NLS-1$

	// update view
	for (int i=0; i<selectionDialog.getSelectedItems().size(); i++) {
		((EditorTableModel)getTblLineFormTypeDef().getModel()).addRowElement(selectionDialog.getSelectedItems().get(i));
	}
}
/**
 * Comment
 */
private void mniOpenLineFormTypeDefSpecification() {
	((EditorTableModel)getTblLineFormTypeDef().getModel()).showSpecification(getTblLineFormTypeDef().getSelectedRows());
}
/**
 * Comment
 */
private void mniRemoveLineFormTypeDef() {
	((EditorTableModel)getTblLineFormTypeDef().getModel()).removeRows(getTblLineFormTypeDef().getSelectedRows());
}
/**
 * Set the lineTypes general data.
 */
private void setLinetype(LineType lineType,ModelElement modelElement) {
	// ControlPoints
	if ((lineType != null) && lineType.containsControlpoints()) {
		getCbxDomainDef().setElement(DomainDef.class, modelElement, lineType.getControlpoints());
	} else {
		getCbxDomainDef().setElement(DomainDef.class, modelElement, null);
	}

	// Intersection
	if ((lineType != null) && lineType.containsIntersectionDef()) {
		getPnlIntersection().setObject(lineType.getIntersectionDef().getMaxi());
	} else {
		getPnlIntersection().setObject(null);
	}

	// LineForm
	if ((lineType != null) && lineType.containsLineForm()) {
		getChxStraights().setSelected(lineType.getLineForm().isStraights());
		getChxArcs().setSelected(lineType.getLineForm().isArcs());
		((EditorTableModel)getTblLineFormTypeDef().getModel()).setLineFormTypeDef(lineType.getLineForm().iteratorLineFormTypeDef());
	} else {
		getTblLineFormTypeDef().setModel(new EditorTableModel());
		((EditorTableModel)getTblLineFormTypeDef().getModel()).setLineFormTypeDef(null);
	}
}
/**
 * Set the Object to be displayed by panel.
 */
public final void setObject(java.lang.Object object) throws DeveloperException {
	throw new DeveloperException(this, "setObject(Object)", "call setPolyline/Surface/Area(Object, ModelElement) instead");//$NON-NLS-2$//$NON-NLS-1$
}
/**
 * Set the Object to be displayed by panel.
 */
public final void setObject(java.lang.Object object, ModelElement modelElement) {
	LineType lineType = (LineType)object;
        lineTypeClass=object.getClass();
	parent = modelElement;
	if (lineType instanceof IliPolyline) {
		setPolyline((IliPolyline)lineType, modelElement);
	} else {
		setSurfaceType((SurfaceType)lineType, modelElement);
	}
}
protected void setOwnerDialog(javax.swing.JDialog ownerDialog) {
	this.dialog = ownerDialog;
}
/**
 * Set the Object to be displayed by panel.
 */
private void setPolyline(IliPolyline polyLine, ModelElement modelElement) {
	getChxDirected().setVisible(true);
	getLblLineAttributes().setVisible(false);
	getCbxClassDef().setVisible(false);

	if (polyLine == null) {
		getChxDirected().setSelected(false);
	} else {
		getChxDirected().setSelected(polyLine.isDirected());
	}
	setLinetype(polyLine,modelElement);
}
/**
 * Set SurfaceType's LineAttributes.
 */
private void setSurfaceType(SurfaceType surfaceType, ModelElement modelElement) {
	getChxDirected().setVisible(false);
	getLblLineAttributes().setVisible(true);
	getCbxClassDef().setVisible(true);

	if ((surfaceType != null) && surfaceType.containsLinAttrDef()) {
		getCbxClassDef().setElement(ClassDef.class, modelElement, surfaceType.getLinAttrDef());
	} else {
		getCbxClassDef().setElement(ClassDef.class, modelElement, null);
	}

	setLinetype(surfaceType,modelElement);
}
}
