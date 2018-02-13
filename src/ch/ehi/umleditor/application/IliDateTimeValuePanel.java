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

import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 * @author ce
 * @version $Revision: 1.1 $ $Date: 2006-07-03 09:01:42 $
 */
public class IliDateTimeValuePanel extends BasePanel implements DataPanel {
	
	private static final long serialVersionUID = -2869513677823436490L;

	private static java.util.ResourceBundle res = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/IliDateTimeValuePanel"); //$NON-NLS-1$

	private javax.swing.JTextField txtYear = null;
	private javax.swing.JTextField txtMonth = null;
	private javax.swing.JTextField txtDay = null;
	private javax.swing.JTextField txtHours = null;
	private javax.swing.JTextField txtMinutes = null;
	private javax.swing.JTextField txtSeconds = null;

	/**
	 * This method initializes
	 *
	 */
	public IliDateTimeValuePanel() {
		super();
		initialize();
		addUndoRedo(getTxtDay(),getTxtHours(),getTxtMinutes(),getTxtMonth(),getTxtSeconds(),getTxtYear());
	}
	/**
	  * Handle Ctrl+z and Ctrl+y to Undo/Redo text
	  * @param textcomp
	  */
	 private void addUndoRedo(JTextComponent... textcomp) {
		
		 for(int i=0;i<textcomp.length;i++){
			 final UndoManager undo = new UndoManager();
				 Document doc = textcomp[i].getDocument();
			    
			   // Listen for undo and redo events
			   doc.addUndoableEditListener(new UndoableEditListener() {
			       public void undoableEditHappened(UndoableEditEvent evt) {
			           undo.addEdit(evt.getEdit());
			       }
			   });
			    
			   // Create an undo action and add it to the text component
			   textcomp[i].getActionMap().put("Undo",
			       new AbstractAction("Undo") {
			           public void actionPerformed(ActionEvent evt) {
			               try {
			                   if (undo.canUndo()) {
			                       undo.undo();
			                   }
			               } catch (CannotUndoException e) {
			               }
			           }
			      });
			    
			   // Bind the undo action to ctl-Z
			   textcomp[i].getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");
			    
			   // Create a redo action and add it to the text component
			   textcomp[i].getActionMap().put("Redo",
			       new AbstractAction("Redo") {
			           public void actionPerformed(ActionEvent evt) {
			               try {
			                   if (undo.canRedo()) {
			                       undo.redo();
			                   }
			               } catch (CannotRedoException e) {
			               }
			           }
			       });
			    
			   // Bind the redo action to ctl-Y
			   textcomp[i].getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
		 }
	 }

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.add(getTxtYear(), null);
		this.add(getTxtMonth(), null);
		this.add(getTxtDay(), null);
		this.add(getTxtHours(), null);
		this.add(getTxtMinutes(), null);
		this.add(getTxtSeconds(), null);
		this.setSize(103, 29);

	}

	public Object getObject() {
		if ((getTxtYear().getText() == null) || (getTxtYear().getText().length() == 0)) {
			return null;
		} else {
			DateTimeValue value = new DateTimeValue();
			value.setYear(Integer.parseInt(getTxtYear().getText()));
			value.setMonth(Integer.parseInt(getTxtMonth().getText()));
			value.setDay(Integer.parseInt(getTxtDay().getText()));
			value.setHours(Integer.parseInt(getTxtHours().getText()));
			value.setMinutes(Integer.parseInt(getTxtMinutes().getText()));
			value.setSeconds(Float.parseFloat(getTxtSeconds().getText()));
			return value;
		}
	}

	public void setObject(Object object) {
		DateTimeValue value = (DateTimeValue) object;
		if (value == null) {
			getTxtYear().setText(null);
			getTxtMonth().setText(null);
			getTxtDay().setText(null);
			getTxtHours().setText(null);
			getTxtMinutes().setText(null);
			getTxtSeconds().setText(null);
		} else {
			getTxtYear().setText(Integer.toString(value.getYear()));
			getTxtMonth().setText(Integer.toString(value.getMonth()));
			getTxtDay().setText(Integer.toString(value.getDay()));
			getTxtHours().setText(Integer.toString(value.getHours()));
			getTxtMinutes().setText(Integer.toString(value.getMinutes()));
			getTxtSeconds().setText(Float.toString(value.getSeconds()));
		}
	}

	/**
	 * This method initializes txtYear
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtYear() {
		if (txtYear == null) {
			txtYear = new javax.swing.JTextField(4);
			txtYear.setToolTipText(res.getString("txtYear_toolTipText"));
		}
		return txtYear;
	}

	/**
	 * This method initializes txtMonth
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtMonth() {
		if (txtMonth == null) {
			txtMonth = new javax.swing.JTextField();
			txtMonth.setToolTipText(res.getString("txtMonth_toolTipText"));
			txtMonth.setColumns(2);
		}
		return txtMonth;
	}

	/**
	 * This method initializes txtDay
	 *
	 * @return javax.swing.JTextField
	 */
	private javax.swing.JTextField getTxtDay() {
		if (txtDay == null) {
			txtDay = new javax.swing.JTextField();
			txtDay.setToolTipText(res.getString("txtDay_toolTipText"));
			txtDay.setColumns(2);
		}
		return txtDay;
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
