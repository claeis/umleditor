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
import ch.softenvironment.view.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
/**
 * INTERLIS BaseType representation of <b>Horiz/VertAlignment</b>.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.4 $ $Date: 2004-04-28 19:29:04 $
 */
public class IliBaseTypeAlignmentPanel extends BasePanel implements DataPanel {
	private javax.swing.JLabel ivjLblKind = null;
	private javax.swing.JRadioButton ivjRbtHAlignment = null;
	private javax.swing.JRadioButton ivjRbtVertical = null;
/**
 * IliBaseTypeTextPanel constructor comment.
 */
public IliBaseTypeAlignmentPanel() {
	super();
	initialize();
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
			ivjLblKind.setText("Art:");
			ivjLblKind.setBounds(10, 20, 140, 14);
			// user code begin {1}
			ivjLblKind.setText(getResourceString("LblKind_text"));
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
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
	if (getRbtHAlignment().isSelected()) {
		return new HorizAlignment();
	} else {
		return new VertAlignment();
	}
}
/**
 * Return the RbtUnspecified property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtHAlignment() {
	if (ivjRbtHAlignment == null) {
		try {
			ivjRbtHAlignment = new javax.swing.JRadioButton();
			ivjRbtHAlignment.setName("RbtHAlignment");
			ivjRbtHAlignment.setToolTipText("Horizontal");
			ivjRbtHAlignment.setText("Horizontal");
			ivjRbtHAlignment.setBounds(160, 15, 140, 22);
			// user code begin {1}
			ivjRbtHAlignment.setToolTipText(getResourceString("RbtHAlignment_toolTipText"));
			ivjRbtHAlignment.setText(getResourceString("RbtHAlignment_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtHAlignment;
}
/**
 * Return the RbtLength property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtVertical() {
	if (ivjRbtVertical == null) {
		try {
			ivjRbtVertical = new javax.swing.JRadioButton();
			ivjRbtVertical.setName("RbtVertical");
			ivjRbtVertical.setToolTipText("");
			ivjRbtVertical.setText("Vertikal");
			ivjRbtVertical.setBounds(160, 40, 140, 22);
			// user code begin {1}
			ivjRbtVertical.setToolTipText(getResourceString("RbtVertical_toolTipText"));
			ivjRbtVertical.setText(getResourceString("RbtVertical_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtVertical;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	LauncherView.getInstance().handleException(exception);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("IliBaseTypeAlignmentPanel");
		setToolTipText("INTERLIS Basistyp <ALIGNMENT>");
		setLayout(null);
		setSize(348, 109);
		add(getRbtHAlignment(), getRbtHAlignment().getName());
		add(getRbtVertical(), getRbtVertical().getName());
		add(getLblKind(), getLblKind().getName());
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setToolTipText(getResourceString("PnlINTERLIS_toolTipText"));
	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
	group.add(getRbtHAlignment());
	group.add(getRbtVertical());
	getRbtHAlignment().setSelected(true);
	// user code end
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object) {
	if (object instanceof HorizAlignment) {
		getRbtHAlignment().setSelected(true);
	} else {
		getRbtVertical().setSelected(true);
	}
}
}
