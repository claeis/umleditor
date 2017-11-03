package ch.ehi.umleditor.application;

<<<<<<< HEAD
=======
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
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
import ch.softenvironment.view.*;
<<<<<<< HEAD
/**
 * User Interface for an INTERLIS Translation.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:00 $
 */
public class TranslationDialog extends BaseDialog {
	// ModelElement
	private static java.util.ResourceBundle resTranslationDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/TranslationDialog");  //$NON-NLS-1$
=======

/**
 * User Interface for an INTERLIS Translation.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:00 $
 */
public class TranslationDialog extends BaseDialog {
	
	private static final long serialVersionUID = 8079485588584930261L;
	// ModelElement
	private static java.util.ResourceBundle resTranslationDialog = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/TranslationDialog"); //$NON-NLS-1$
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	private Translation translation = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JButton ivjBtnApply = null;
	private javax.swing.JLabel ivjLblBaseLanguage = null;
	private javax.swing.JLabel ivjLblLanguage = null;
	private javax.swing.JTextField ivjTxtBaseLanguage = null;
	private javax.swing.JTextField ivjTxtLanguage = null;

<<<<<<< HEAD
class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == TranslationDialog.this.getBtnOk()) 
				connEtoC1(e);
			if (e.getSource() == TranslationDialog.this.getBtnCancel()) 
				connEtoC2(e);
			if (e.getSource() == TranslationDialog.this.getBtnApply()) 
				connEtoC3(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == TranslationDialog.this.getTxtLanguage()) 
				connEtoM1(e);
			if (e.getSource() == TranslationDialog.this.getTxtBaseLanguage()) 
				connEtoM2(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
	};
/**
 * Constructor
 */
public TranslationDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();

	setTitle(resTranslationDialog.getString("CTSpecification")); //$NON-NLS-1$
	setRelativeLocation(owner);
	setElement(element);
	show();
}
/**
 * connEtoC1:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> UmlModelDialog.okPressed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.okPressed();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> Ili2ModelSetDialog.cancelPressed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.cancelPressed();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (BtnApply.action.actionPerformed(java.awt.event.ActionEvent) --> Ili2ModelSetDialog.applyPressed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.applyPressed();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM1:  (TxtLanguage.focus.focusGained(java.awt.event.FocusEvent) --> TxtLanguage.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtLanguage().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM2:  (TxtBaseLanguage.focus.focusGained(java.awt.event.FocusEvent) --> TxtBaseLanguage.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtBaseLanguage().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the BaseDialogContentPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getBaseDialogContentPane() {
	if (ivjBaseDialogContentPane == null) {
		try {
			ivjBaseDialogContentPane = new javax.swing.JPanel();
			ivjBaseDialogContentPane.setName("BaseDialogContentPane");
			ivjBaseDialogContentPane.setLayout(null);
			getBaseDialogContentPane().add(getLblLanguage(), getLblLanguage().getName());
			getBaseDialogContentPane().add(getTxtLanguage(), getTxtLanguage().getName());
			getBaseDialogContentPane().add(getBtnOk(), getBtnOk().getName());
			getBaseDialogContentPane().add(getBtnCancel(), getBtnCancel().getName());
			getBaseDialogContentPane().add(getBtnApply(), getBtnApply().getName());
			getBaseDialogContentPane().add(getLblBaseLanguage(), getLblBaseLanguage().getName());
			getBaseDialogContentPane().add(getTxtBaseLanguage(), getTxtBaseLanguage().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBaseDialogContentPane;
}
/**
 * Return the BtnApply property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnApply() {
	if (ivjBtnApply == null) {
		try {
			ivjBtnApply = new javax.swing.JButton();
			ivjBtnApply.setName("BtnApply");
			ivjBtnApply.setText(getApplyString());
			ivjBtnApply.setBounds(295, 85, 115, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
=======
	class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == TranslationDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == TranslationDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == TranslationDialog.this.getBtnApply())
				connEtoC3(e);
		};

		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == TranslationDialog.this.getTxtLanguage())
				connEtoM1(e);
			if (e.getSource() == TranslationDialog.this.getTxtBaseLanguage())
				connEtoM2(e);
		};

		public void focusLost(java.awt.event.FocusEvent e) {
		};
	};

	/**
	 * Constructor
	 */
	public TranslationDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
		super(owner, true);
		initialize();
		addEscapeKey();
		setTitle(resTranslationDialog.getString("CTSpecification")); //$NON-NLS-1$
		setRelativeLocation(owner);
		setElement(element);
		show();
	}

	/**
	 * Handle escape key to close the dialog
	 */
	 private void addEscapeKey() {
		 
		 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
		 Action escapeAction = new AbstractAction() {
			
			private static final long serialVersionUID = 6682936348100169781L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				dispose();
			}
		 };
		 getRootPane ().getInputMap (JComponent.WHEN_IN_FOCUSED_WINDOW).put (escape, "ESCAPE");
		 getRootPane ().getActionMap ().put ("ESCAPE", escapeAction);
	 }
	/**
	 * connEtoC1: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * UmlModelDialog.okPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC1(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.okPressed();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			// user code end
			handleException(ivjExc);
		}
	}
<<<<<<< HEAD
	return ivjBtnApply;
}
/**
 * Return the JButton2 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new javax.swing.JButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText(getCancelString());
			ivjBtnCancel.setBounds(159, 85, 115, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnCancel;
}
/**
 * Return the JButton1 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnOk() {
	if (ivjBtnOk == null) {
		try {
			ivjBtnOk = new javax.swing.JButton();
			ivjBtnOk.setName("BtnOk");
			ivjBtnOk.setText(getOKString());
			ivjBtnOk.setBounds(21, 85, 115, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
=======

	/**
	 * connEtoC2: (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> Ili2ModelSetDialog.cancelPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC2(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.cancelPressed();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			// user code end
			handleException(ivjExc);
		}
	}
<<<<<<< HEAD
	return ivjBtnOk;
}
/**
 * Return the LblExplanation property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblBaseLanguage() {
	if (ivjLblBaseLanguage == null) {
		try {
			ivjLblBaseLanguage = new javax.swing.JLabel();
			ivjLblBaseLanguage.setName("LblBaseLanguage");
			ivjLblBaseLanguage.setToolTipText(resTranslationDialog.getString("LblBaseLanguage_toolTipText"));
			ivjLblBaseLanguage.setText(resTranslationDialog.getString("LblBaseLanguage_text"));
			ivjLblBaseLanguage.setBounds(12, 50, 192, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblBaseLanguage;
}
/**
 * Return the JLabel1 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblLanguage() {
	if (ivjLblLanguage == null) {
		try {
			ivjLblLanguage = new javax.swing.JLabel();
			ivjLblLanguage.setName("LblLanguage");
			ivjLblLanguage.setToolTipText(resTranslationDialog.getString("LblLanguage_toolTipText"));
			ivjLblLanguage.setText(resTranslationDialog.getString("LblLanguage_text"));
			ivjLblLanguage.setBounds(12, 23, 190, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblLanguage;
}
/**
 * Return the TxtExplanation property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtBaseLanguage() {
	if (ivjTxtBaseLanguage == null) {
		try {
			ivjTxtBaseLanguage = new javax.swing.JTextField();
			ivjTxtBaseLanguage.setName("TxtBaseLanguage");
			ivjTxtBaseLanguage.setBounds(214, 49, 196, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtBaseLanguage;
}
/**
 * Return the JTextField1 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtLanguage() {
	if (ivjTxtLanguage == null) {
		try {
			ivjTxtLanguage = new javax.swing.JTextField();
			ivjTxtLanguage.setName("TxtLanguage");
			ivjTxtLanguage.setBounds(214, 24, 196, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtLanguage;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	super.handleException(exception);
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getBtnOk().addActionListener(ivjEventHandler);
	getBtnCancel().addActionListener(ivjEventHandler);
	getBtnApply().addActionListener(ivjEventHandler);
	getTxtLanguage().addFocusListener(ivjEventHandler);
	getTxtBaseLanguage().addFocusListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("TranslationSpecificationDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(426, 154);
		setTitle("Translation (Spezifikation)");
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * Save ModelElement changes.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	translation.setLanguage(getTxtLanguage().getText());
	translation.setBaseLanguage(getTxtBaseLanguage().getText());

	return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	translation = (Translation)element;

	getTxtLanguage().setText(translation.getLanguage());
	getTxtBaseLanguage().setText(translation.getBaseLanguage());
}
=======

	/**
	 * connEtoC3: (BtnApply.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> Ili2ModelSetDialog.applyPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC3(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.applyPressed();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoM1: (TxtLanguage.focus.focusGained(java.awt.event.FocusEvent) -->
	 * TxtLanguage.selectAll()V)
	 * 
	 * @param arg1
	 *            java.awt.event.FocusEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoM1(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtLanguage().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoM2: (TxtBaseLanguage.focus.focusGained(java.awt.event.FocusEvent)
	 * --> TxtBaseLanguage.selectAll()V)
	 * 
	 * @param arg1
	 *            java.awt.event.FocusEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoM2(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtBaseLanguage().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * Return the BaseDialogContentPane property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getBaseDialogContentPane() {
		if (ivjBaseDialogContentPane == null) {
			try {
				ivjBaseDialogContentPane = new javax.swing.JPanel();
				ivjBaseDialogContentPane.setName("BaseDialogContentPane");
				ivjBaseDialogContentPane.setLayout(null);
				getBaseDialogContentPane().add(getLblLanguage(), getLblLanguage().getName());
				getBaseDialogContentPane().add(getTxtLanguage(), getTxtLanguage().getName());
				getBaseDialogContentPane().add(getBtnOk(), getBtnOk().getName());
				getBaseDialogContentPane().add(getBtnCancel(), getBtnCancel().getName());
				getBaseDialogContentPane().add(getBtnApply(), getBtnApply().getName());
				getBaseDialogContentPane().add(getLblBaseLanguage(), getLblBaseLanguage().getName());
				getBaseDialogContentPane().add(getTxtBaseLanguage(), getTxtBaseLanguage().getName());
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjBaseDialogContentPane;
	}

	/**
	 * Return the BtnApply property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getBtnApply() {
		if (ivjBtnApply == null) {
			try {
				ivjBtnApply = new javax.swing.JButton();
				ivjBtnApply.setName("BtnApply");
				ivjBtnApply.setText(getApplyString());
				ivjBtnApply.setBounds(295, 85, 115, 25);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjBtnApply;
	}

	/**
	 * Return the JButton2 property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getBtnCancel() {
		if (ivjBtnCancel == null) {
			try {
				ivjBtnCancel = new javax.swing.JButton();
				ivjBtnCancel.setName("BtnCancel");
				ivjBtnCancel.setText(getCancelString());
				ivjBtnCancel.setBounds(159, 85, 115, 25);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjBtnCancel;
	}

	/**
	 * Return the JButton1 property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getBtnOk() {
		if (ivjBtnOk == null) {
			try {
				ivjBtnOk = new javax.swing.JButton();
				ivjBtnOk.setName("BtnOk");
				ivjBtnOk.setText(getOKString());
				ivjBtnOk.setBounds(21, 85, 115, 25);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjBtnOk;
	}

	/**
	 * Return the LblExplanation property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblBaseLanguage() {
		if (ivjLblBaseLanguage == null) {
			try {
				ivjLblBaseLanguage = new javax.swing.JLabel();
				ivjLblBaseLanguage.setName("LblBaseLanguage");
				ivjLblBaseLanguage.setToolTipText(resTranslationDialog.getString("LblBaseLanguage_toolTipText"));
				ivjLblBaseLanguage.setText(resTranslationDialog.getString("LblBaseLanguage_text"));
				ivjLblBaseLanguage.setBounds(12, 50, 192, 14);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblBaseLanguage;
	}

	/**
	 * Return the JLabel1 property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblLanguage() {
		if (ivjLblLanguage == null) {
			try {
				ivjLblLanguage = new javax.swing.JLabel();
				ivjLblLanguage.setName("LblLanguage");
				ivjLblLanguage.setToolTipText(resTranslationDialog.getString("LblLanguage_toolTipText"));
				ivjLblLanguage.setText(resTranslationDialog.getString("LblLanguage_text"));
				ivjLblLanguage.setBounds(12, 23, 190, 14);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblLanguage;
	}

	/**
	 * Return the TxtExplanation property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtBaseLanguage() {
		if (ivjTxtBaseLanguage == null) {
			try {
				ivjTxtBaseLanguage = new javax.swing.JTextField();
				ivjTxtBaseLanguage.setName("TxtBaseLanguage");
				ivjTxtBaseLanguage.setBounds(214, 49, 196, 20);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtBaseLanguage;
	}

	/**
	 * Return the JTextField1 property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtLanguage() {
		if (ivjTxtLanguage == null) {
			try {
				ivjTxtLanguage = new javax.swing.JTextField();
				ivjTxtLanguage.setName("TxtLanguage");
				ivjTxtLanguage.setBounds(214, 24, 196, 20);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtLanguage;
	}

	/**
	 * Called whenever the part throws an exception.
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	protected void handleException(java.lang.Throwable exception) {
		super.handleException(exception);
	}

	/**
	 * Initializes connections
	 * 
	 * @exception java.lang.Exception
	 *                The exception description.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initConnections() throws java.lang.Exception {
		// user code begin {1}
		// user code end
		getBtnOk().addActionListener(ivjEventHandler);
		getBtnCancel().addActionListener(ivjEventHandler);
		getBtnApply().addActionListener(ivjEventHandler);
		getTxtLanguage().addFocusListener(ivjEventHandler);
		getTxtBaseLanguage().addFocusListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("TranslationSpecificationDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(426, 154);
			setTitle("Translation (Spezifikation)");
			setContentPane(getBaseDialogContentPane());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		// user code end
	}

	/**
	 * Save ModelElement changes.
	 * 
	 * @see okPressed()
	 * @see applyPressed
	 */
	protected boolean save() {
		translation.setLanguage(getTxtLanguage().getText());
		translation.setBaseLanguage(getTxtBaseLanguage().getText());

		return super.save();
	}

	/**
	 * Map model to view.
	 */
	private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
		translation = (Translation) element;

		getTxtLanguage().setText(translation.getLanguage());
		getTxtBaseLanguage().setText(translation.getBaseLanguage());
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
