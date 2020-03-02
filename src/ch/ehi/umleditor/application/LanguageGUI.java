package ch.ehi.umleditor.application;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import ch.ehi.umleditor.application.LauncherView;

import ch.ehi.basics.logging.EhiLogger;
import ch.softenvironment.view.BaseDialog;

public class LanguageGUI extends BaseDialog {
	
	private static final long serialVersionUID = 976542662651387791L;

	public static ResourceBundle resourceBundle;

	IvjEventHandler ivjEventHandler = new IvjEventHandler();
    private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JLabel ivjLblLanguage = null;
	private javax.swing.JButton ivjBtnOk = null;
	private String actualLanguage = null;
	private LauncherView launcher = null;
    private JComboBox ivjCbxlanguage = null;
    
    class IvjEventHandler implements java.awt.event.ActionListener,  java.awt.event.KeyListener{
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == LanguageGUI.this.getBtnOk())
				connEtoC1(e);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		};
	};
    
    public LanguageGUI(Component owner, boolean modal) {
		super(owner, true);
		launcher = (LauncherView) owner;
		initialize();
		addEscapeKey();
		setRelativeLocation(owner);
		show();
	}
    
    public LanguageGUI (java.awt.Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
		if (title != null) {
			setTitle(title);
		}
		show();
	}
	
	/**
	 * Handle escape key to close the dialog
	 */
	 private void addEscapeKey() {
		 
		 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
		 Action escapeAction = new AbstractAction() {
			
			private static final long serialVersionUID = -2972481431614869047L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				dispose();
			}
		 };
		 getRootPane ().getInputMap (JComponent.WHEN_IN_FOCUSED_WINDOW).put (escape, "ESCAPE");
		 getRootPane ().getActionMap ().put ("ESCAPE", escapeAction);
	 }
    
    private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("AssociationDefDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(315, 175);
			setTitle("Beziehung");
			setContentPane(getBaseDialogContentPane());
			
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		setTitle(getResourceString("CTDialog"));
		getCbxLanguage().addItem(Locale.US);
		getCbxLanguage().addItem(new Locale("ES"));
		getCbxLanguage().addItem(Locale.GERMAN);
		getCbxLanguage().addItem(Locale.FRENCH);
		if (actualLanguage != null) {
			getCbxLanguage().setSelectedItem(actualLanguage);
		}
	}
       
    private javax.swing.JPanel getBaseDialogContentPane() {
		if (ivjBaseDialogContentPane == null) {
			try {
				
				ivjBaseDialogContentPane = new javax.swing.JPanel();
				ivjBaseDialogContentPane.setName("BaseDialogContentPane");
				ivjBaseDialogContentPane.setLayout(new java.awt.GridBagLayout());

				java.awt.GridBagConstraints constraintsLblLanguage = new java.awt.GridBagConstraints();
				constraintsLblLanguage.gridx = 0;
				constraintsLblLanguage.gridy = 0;
				constraintsLblLanguage.ipadx = 349;
				constraintsLblLanguage.insets = new java.awt.Insets(29, 10, 15, 25);
				getBaseDialogContentPane().add(getLblLanguage(), constraintsLblLanguage);
				
				java.awt.GridBagConstraints constraintsCbxLanguage = new java.awt.GridBagConstraints();
				constraintsCbxLanguage.gridx = 0;
				constraintsCbxLanguage.gridy = 1;
				constraintsCbxLanguage.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsCbxLanguage.weightx = 1.0;
				constraintsCbxLanguage.ipadx = 9;
				constraintsCbxLanguage.insets = new java.awt.Insets(15, 3, 15, 20);
				getBaseDialogContentPane().add(getCbxLanguage(), constraintsCbxLanguage);
				
				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 0;
				constraintsBtnOk.gridy = 2;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(17, 5, 44, 250);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjBaseDialogContentPane;
	}
    
    private javax.swing.JLabel getLblLanguage() {
		if (ivjLblLanguage == null) {
			try {
				ivjLblLanguage = new javax.swing.JLabel();
				ivjLblLanguage.setName("LblLanguage");
				ivjLblLanguage.setText("Language:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjLblLanguage;
	}
    
    private javax.swing.JComboBox getCbxLanguage() {
		if (ivjCbxlanguage == null) {
			try {
				ivjCbxlanguage = new javax.swing.JComboBox();
				ivjCbxlanguage.setName("CbxLanguage");
											
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjCbxlanguage;
	}
    
    private javax.swing.JButton getBtnOk() {
		if (ivjBtnOk == null) {
			try {
				ivjBtnOk = new javax.swing.JButton();
				ivjBtnOk.setName("BtnOk");
				ivjBtnOk.setText("OK");
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjBtnOk;
	}
    
    private void initConnections() throws java.lang.Exception {
		// user code begin {1}
		// user code end
		getLblLanguage().addKeyListener(ivjEventHandler);
		getBtnOk().addActionListener(ivjEventHandler);
	}
    
    private void connEtoC1(ActionEvent e) {
		try {
			if(ivjCbxlanguage.getSelectedItem().equals(Locale.getDefault())) {
    		 // Nothing to do
			} else {
				Locale.setDefault(new Locale(ivjCbxlanguage.getSelectedItem().toString()));
				launcher.getSettings().setLanguage(ivjCbxlanguage.getSelectedItem().toString());
				ch.ehi.basics.types.NlsString.setDefaultLanguage(ivjCbxlanguage.getSelectedItem().toString());
				EhiLogger.logState("language of User Interface set to '"
						+ ch.ehi.basics.types.NlsString.getDefaultLanguage() + "'");
			} 
    		
    	this.okPressed();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
	}
    
    	
}
