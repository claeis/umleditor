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
import ch.softenvironment.util.*;
import ch.softenvironment.view.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
/**
 * INTERLIS BaseType representation of <b>Text</b>.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.5 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeTextPanel extends BasePanel implements DataPanel {
private static java.util.ResourceBundle resIliBaseTypeTextPanel = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/IliBaseTypeTextPanel");  //$NON-NLS-1$
	private javax.swing.JRadioButton ivjRbtMultiLine = null;
	private javax.swing.JRadioButton ivjRbtName = null;
	private javax.swing.JRadioButton ivjRbtSingleLine = null;
	private javax.swing.JRadioButton ivjRbtURI = null;
	private javax.swing.JTextField ivjTxtLength = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblKind = null;
	private javax.swing.JLabel ivjLblMax = null;

class IvjEventHandler implements java.awt.event.FocusListener, java.awt.event.ItemListener {
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == IliBaseTypeTextPanel.this.getTxtLength())
				connEtoM1(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == IliBaseTypeTextPanel.this.getRbtMultiLine())
				connEtoC1(e);
			if (e.getSource() == IliBaseTypeTextPanel.this.getRbtSingleLine())
				connEtoC2(e);
		};
	};
/**
 * IliBaseTypeTextPanel constructor comment.
 */
public IliBaseTypeTextPanel() {
	super();
	initialize();
}
/**
 * connEtoC1:  (RbtLength.item.itemStateChanged(java.awt.event.ItemEvent) --> IliBaseTypeTextPanel.rbtLength_ItemStateChanged(Ljava.awt.event.ItemEvent;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.length_StateChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
private void connEtoC2(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.length_StateChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM1:  (TxtLength.focus.focusGained(java.awt.event.FocusEvent) --> TxtLength.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtLength().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return Kind.
 */
private int getkind() {
	if (getRbtSingleLine().isSelected() || getRbtMultiLine().isSelected()) {
		String txt=getTxtLength().getText();
		if(txt!=null){
			txt=txt.trim();
		}
		if(txt==null || txt.length()==0){
			return TextKind.UNDEFINED;
		}
		return TextKind.MAXLEN;
	} else if (getRbtName().isSelected()) {
		return TextKind.NAME;
	} else if (getRbtURI().isSelected()) {
		return TextKind.URI;
	} else {
		throw new DeveloperException("nothing choosed");//$NON-NLS-1$
	}
}
/**
 * Return the LblKind property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblKind() {
	if (ivjLblKind == null) {
		try {
			ivjLblKind = new javax.swing.JLabel();
			ivjLblKind.setName("LblKind");
			ivjLblKind.setText(resIliBaseTypeTextPanel.getString("LblKind_text"));
			ivjLblKind.setBounds(10, 20, 140, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblKind;
}
/**
 * Return the LblMax property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblMax() {
	if (ivjLblMax == null) {
		try {
			ivjLblMax = new javax.swing.JLabel();
			ivjLblMax.setName("LblMax");
			ivjLblMax.setToolTipText("Max. Laenge");
			ivjLblMax.setText("Max. length:");
			ivjLblMax.setBounds(308, 43, 140, 14);
			// user code begin {1}
			ivjLblMax.setToolTipText(getResourceString("LblMax_toolTipText"));
			ivjLblMax.setText(getResourceString("LblMax_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblMax;
}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
	Text type = new Text();

	// kind
	int kind=getkind();
	type.setKind(kind);

	if (kind==TextKind.MAXLEN || kind==TextKind.UNDEFINED){
		type.setMultiline(getRbtMultiLine().isSelected()); 
	}
	if (kind == TextKind.MAXLEN) {
		// length
		type.setMaxLength(Long.parseLong(getTxtLength().getText()));
	} else {
		type.setMaxLength(0);
	}

	return type;
}
/**
 * Return the RbtLength property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtMultiLine() {
	if (ivjRbtMultiLine == null) {
		try {
			ivjRbtMultiLine = new javax.swing.JRadioButton();
			ivjRbtMultiLine.setName("RbtMultiLine");
			ivjRbtMultiLine.setText("Multiline");
			ivjRbtMultiLine.setBounds(160, 40, 140, 22);
			// user code begin {1}
			ivjRbtMultiLine.setText(getResourceString("RbtMultiLine_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtMultiLine;
}
/**
 * Return the RbtName property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtName() {
	if (ivjRbtName == null) {
		try {
			ivjRbtName = new javax.swing.JRadioButton();
			ivjRbtName.setName("RbtName");
			ivjRbtName.setText("NAME");
			ivjRbtName.setBounds(160, 65, 140, 22);
			// user code begin {1}
			ivjRbtName.setText(getResourceString("RbtName_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtName;
}
/**
 * Return the RbtUnspecified property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtSingleLine() {
	if (ivjRbtSingleLine == null) {
		try {
			ivjRbtSingleLine = new javax.swing.JRadioButton();
			ivjRbtSingleLine.setName("RbtSingleLine");
			ivjRbtSingleLine.setText("Single line");
			ivjRbtSingleLine.setBounds(160, 15, 140, 22);
			// user code begin {1}
			ivjRbtSingleLine.setText(getResourceString("RbtSingleLine_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtSingleLine;
}
/**
 * Return the RbtURI property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtURI() {
	if (ivjRbtURI == null) {
		try {
			ivjRbtURI = new javax.swing.JRadioButton();
			ivjRbtURI.setName("RbtURI");
			ivjRbtURI.setText("URI");
			ivjRbtURI.setBounds(160, 90, 266, 22);
			// user code begin {1}
			ivjRbtURI.setText(getResourceString("RbtURI_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtURI;
}
/**
 * Return the TxtLength property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtLength() {
	if (ivjTxtLength == null) {
		try {
			ivjTxtLength = new javax.swing.JTextField();
			ivjTxtLength.setName("TxtLength");
			ivjTxtLength.setBounds(455, 39, 107, 20);
			ivjTxtLength.setEditable(false);
			ivjTxtLength.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtLength;
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
	getRbtMultiLine().addItemListener(ivjEventHandler);
	getRbtSingleLine().addItemListener(ivjEventHandler);
	getTxtLength().addFocusListener(ivjEventHandler);
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
		setToolTipText("INTERLIS Basistyp <TEXT>");
		setLayout(null);
		setSize(572, 126);
		add(getRbtSingleLine(), getRbtSingleLine().getName());
		add(getRbtMultiLine(), getRbtMultiLine().getName());
		add(getRbtName(), getRbtName().getName());
		add(getRbtURI(), getRbtURI().getName());
		add(getTxtLength(), getTxtLength().getName());
		add(getLblKind(), getLblKind().getName());
		add(getLblMax(), getLblMax().getName());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setToolTipText(getResourceString("IliBaseTypeTextPanel_toolTipText"));
	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
	group.add(getRbtSingleLine());
	group.add(getRbtName());
	group.add(getRbtMultiLine());
	group.add(getRbtURI());
	getRbtSingleLine().setSelected(true);
	getTxtLength().setText("");
	// user code end
}
/**
 * Control Length TextField.
 */
private void length_StateChanged(java.awt.event.ItemEvent itemEvent) {
	boolean isSelected = getRbtMultiLine().isSelected() || getRbtSingleLine().isSelected();
	getTxtLength().setEditable(isSelected);
	getTxtLength().setEnabled(isSelected);
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object) {
	Text type = (Text)object;

	// kind
	switch (type.getKind()) {
		case TextKind.UNDEFINED: {
			if(type.isMultiline()){
				getRbtMultiLine().setSelected(true);
			}else{
				getRbtSingleLine().setSelected(true);
			}
			getTxtLength().setText("");
			break;
		}
		case TextKind.MAXLEN: {
			if(type.isMultiline()){
				getRbtMultiLine().setSelected(true);
			}else{
				getRbtSingleLine().setSelected(true);
			}
			getTxtLength().setText(Long.toString(type.getMaxLength()));
			break;
		}
		case TextKind.NAME: {
			getRbtName().setSelected(true);
			break;
		}
		case TextKind.URI: {
			getRbtURI().setSelected(true);
			break;
		}
		default: {
			throw new ch.softenvironment.util.DeveloperException("Unknown Kind <" + type.getKind() + ">");
		}
	}
}
}
