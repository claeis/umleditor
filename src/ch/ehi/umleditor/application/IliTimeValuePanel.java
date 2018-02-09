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

import ch.softenvironment.view.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import javax.swing.*;

/**
 * @author ce
 * @version $Revision: 1.1 $ $Date: 2006-07-03 09:01:42 $
 */
public class IliTimeValuePanel extends BasePanel implements DataPanel {
	
	private static final long serialVersionUID = 7521507242707344039L;

	private static java.util.ResourceBundle res = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/IliTimeValuePanel"); //$NON-NLS-1$

	private javax.swing.JTextField txtHours = null;
	private javax.swing.JTextField txtMinutes = null;
	private javax.swing.JTextField txtSeconds = null;

	/**
	 * This method initializes
	 *
	 */
	public IliTimeValuePanel() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.add(getTxtHours(), null);
		this.add(getTxtMinutes(), null);
		this.add(getTxtSeconds(), null);
		this.setSize(103, 29);

	}

	public Object getObject() {
		if ((getTxtHours().getText() == null) || (getTxtHours().getText().length() == 0)) {
			return null;
		} else {
			TimeValue value = new TimeValue();
			value.setHours(Integer.parseInt(getTxtHours().getText()));
			value.setMinutes(Integer.parseInt(getTxtMinutes().getText()));
			value.setSeconds(Float.parseFloat(getTxtSeconds().getText()));
			return value;
		}
	}

	public void setObject(Object object) {
		TimeValue value = (TimeValue) object;
		if (value == null) {
			getTxtHours().setText(null);
			getTxtMinutes().setText(null);
			getTxtSeconds().setText(null);
		} else {
			getTxtHours().setText(Integer.toString(value.getHours()));
			getTxtMinutes().setText(Integer.toString(value.getMinutes()));
			getTxtSeconds().setText(Float.toString(value.getSeconds()));
		}
	}

	/**
	 * This method initializes txtHours
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtHours() {
		if (txtHours == null) {
			txtHours = new javax.swing.JTextField();
			txtHours.setToolTipText(res.getString("txtHours_toolTipText"));
			txtHours.setColumns(2);
		}
		return txtHours;
	}

	/**
	 * This method initializes txtMinutes
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtMinutes() {
		if (txtMinutes == null) {
			txtMinutes = new javax.swing.JTextField();
			txtMinutes.setToolTipText(res.getString("txtMinutes_toolTipText"));
			txtMinutes.setColumns(2);
		}
		return txtMinutes;
	}

	/**
	 * This method initializes txtSeconds
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtSeconds() {
		if (txtSeconds == null) {
			txtSeconds = new javax.swing.JTextField();
			txtSeconds.setToolTipText(res.getString("txtSeconds_toolTipText"));
			txtSeconds.setColumns(6);
		}
		return txtSeconds;
	}
} // @jve:visual-info decl-index=0 visual-constraint="37,10"
