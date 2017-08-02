/* This file is part of the umleditor project.
 * For more information, please see <http://www.interlis.ch>.
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
import ch.softenvironment.util.*;

/**
 * @author ce
 * @version $Revision: 1.2 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeDatePanel extends BasePanel implements DataPanel {
	private static java.util.ResourceBundle res = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/IliBaseTypeDatePanel"); //$NON-NLS-1$

	private javax.swing.JLabel lblMin = null;
	private javax.swing.JLabel lblMax = null;
	private ch.ehi.umleditor.application.IliDateValuePanel pnlMin = null;
	private ch.ehi.umleditor.application.IliDateValuePanel pnlMax = null;

	/**
	 * This method initializes
	 *
	 */
	public IliBaseTypeDatePanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		java.awt.GridBagConstraints consGridBagConstraints2 = new java.awt.GridBagConstraints();
		java.awt.GridBagConstraints consGridBagConstraints1 = new java.awt.GridBagConstraints();
		java.awt.GridBagConstraints consGridBagConstraints4 = new java.awt.GridBagConstraints();
		java.awt.GridBagConstraints consGridBagConstraints3 = new java.awt.GridBagConstraints();
		consGridBagConstraints2.gridx = 1;
		consGridBagConstraints2.gridy = 2;
		consGridBagConstraints2.anchor = java.awt.GridBagConstraints.NORTHWEST;
		consGridBagConstraints2.insets = new java.awt.Insets(5, 5, 5, 5);
		consGridBagConstraints1.gridx = 1;
		consGridBagConstraints1.gridy = 1;
		consGridBagConstraints1.insets = new java.awt.Insets(5, 5, 5, 5);
		consGridBagConstraints1.anchor = java.awt.GridBagConstraints.NORTHWEST;
		consGridBagConstraints4.gridx = 2;
		consGridBagConstraints4.gridy = 2;
		consGridBagConstraints4.anchor = java.awt.GridBagConstraints.NORTHWEST;
		consGridBagConstraints3.gridx = 2;
		consGridBagConstraints3.gridy = 1;
		consGridBagConstraints3.insets = new java.awt.Insets(0, 0, 0, 0);
		consGridBagConstraints3.anchor = java.awt.GridBagConstraints.NORTHWEST;
		this.setLayout(new java.awt.GridBagLayout());
		this.add(getLblMin(), consGridBagConstraints1);
		this.add(getLblMax(), consGridBagConstraints2);
		this.add(getPnlMin(), consGridBagConstraints3);
		this.add(getPnlMax(), consGridBagConstraints4);

	}

	public Object getObject() {
		DateType type = null;
		type = ElementFactory.createDateType();
		// Range
		type.setMin((DateValue) getPnlMin().getObject());
		type.setMax((DateValue) getPnlMax().getObject());
		return type;
	}

	public void setObject(Object arg0) {
		throw new DeveloperException("call setObject(Object, ModelElement) instead");//$NON-NLS-1$
	}

	/**
	 * Set the Object to be displayed by panel.
	 */
	public void setObject(java.lang.Object object, ch.ehi.uml1_4.foundation.core.ModelElement modelElement) {
		DateType type = (DateType) object;
		getPnlMin().setObject(type.getMin());
		getPnlMax().setObject(type.getMax());
	}

	/**
	 * This method initializes lblMin
	 *
	 * @return javax.swing.JLabel
	 */
	private javax.swing.JLabel getLblMin() {
		if (lblMin == null) {
			lblMin = new javax.swing.JLabel();
			lblMin.setText(res.getString("lblMin_text"));
		}
		return lblMin;
	}

	/**
	 * This method initializes lblMax
	 *
	 * @return javax.swing.JLabel
	 */
	private javax.swing.JLabel getLblMax() {
		if (lblMax == null) {
			lblMax = new javax.swing.JLabel();
			lblMax.setText(res.getString("lblMax_text"));
		}
		return lblMax;
	}

	/**
	 * This method initializes pnlMin
	 *
	 * @return ch.ehi.umleditor.application.IliDateValuePanel
	 */
	private ch.ehi.umleditor.application.IliDateValuePanel getPnlMin() {
		if (pnlMin == null) {
			pnlMin = new ch.ehi.umleditor.application.IliDateValuePanel();
		}
		return pnlMin;
	}

	/**
	 * This method initializes pnlMax
	 *
	 * @return ch.ehi.umleditor.application.IliDateValuePanel
	 */
	private ch.ehi.umleditor.application.IliDateValuePanel getPnlMax() {
		if (pnlMax == null) {
			pnlMax = new ch.ehi.umleditor.application.IliDateValuePanel();
		}
		return pnlMax;
	}
}
