package ch.softenvironment.view;

/* 
 *This file is part of the UML/INTERLIS-Editor.
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
 */
 
import ch.softenvironment.util.*;
/**
 * Provide a simple editor Area with minimal functionality.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public class SimpleEditorPanel extends javax.swing.JPanel {
	private static java.util.ResourceBundle resSimpleEditorPanel = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/SimpleEditorPanel");  //$NON-NLS-1$
	private boolean hasContentsChanged = false;
	private javax.swing.JTextArea ivjTxaEditor = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JSeparator ivjJSeparator2 = null;
	private javax.swing.JSeparator ivjJSeparator22 = null;
	private javax.swing.JMenuItem ivjMniCopy = null;
	private javax.swing.JMenuItem ivjMniCut = null;
	private javax.swing.JMenuItem ivjMniPaste = null;
	private javax.swing.JMenuItem ivjMniRedo = null;
	private javax.swing.JMenuItem ivjMniSelectAll = null;
	private javax.swing.JMenuItem ivjMniUndo = null;
	private javax.swing.JPopupMenu ivjMnuEdit = null;
	private javax.swing.JMenuItem ivjMniDelete = null;
	private javax.swing.JScrollPane ivjScpEditor = null;
	protected transient ch.softenvironment.view.SimpleEditorPanelListener fieldSimpleEditorPanelListenerEventMulticaster = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.KeyListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == SimpleEditorPanel.this.getMniUndo()) 
				connEtoC2(e);
			if (e.getSource() == SimpleEditorPanel.this.getMniRedo()) 
				connEtoC3(e);
			if (e.getSource() == SimpleEditorPanel.this.getMniSelectAll()) 
				connEtoM1(e);
			if (e.getSource() == SimpleEditorPanel.this.getMniDelete()) 
				connEtoC1(e);
			if (e.getSource() == SimpleEditorPanel.this.getMniCut()) 
				connEtoC6(e);
			if (e.getSource() == SimpleEditorPanel.this.getMniCopy()) 
				connEtoC7(e);
			if (e.getSource() == SimpleEditorPanel.this.getMniPaste()) 
				connEtoC9(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == SimpleEditorPanel.this.getTxaEditor()) 
				connEtoM2(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void keyPressed(java.awt.event.KeyEvent e) {};
		public void keyReleased(java.awt.event.KeyEvent e) {
			if (e.getSource() == SimpleEditorPanel.this.getTxaEditor()) 
				connEtoC5(e);
			if (e.getSource() == SimpleEditorPanel.this.getTxaEditor()) 
				connEtoC8(e);
		};
		public void keyTyped(java.awt.event.KeyEvent e) {};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == SimpleEditorPanel.this.getTxaEditor()) 
				connEtoC10(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == SimpleEditorPanel.this.getTxaEditor()) 
				connEtoC4(e);
		};
	};
/**
 * SimpleEditorPanel constructor comment.
 */
public SimpleEditorPanel() {
	super();
	initialize();
}
/**
 * SimpleEditorPanel constructor comment.
 * @param layout java.awt.LayoutManager
 */
public SimpleEditorPanel(java.awt.LayoutManager layout) {
	super(layout);
}
/**
 * SimpleEditorPanel constructor comment.
 * @param layout java.awt.LayoutManager
 * @param isDoubleBuffered boolean
 */
public SimpleEditorPanel(java.awt.LayoutManager layout, boolean isDoubleBuffered) {
	super(layout, isDoubleBuffered);
}
/**
 * SimpleEditorPanel constructor comment.
 * @param isDoubleBuffered boolean
 */
public SimpleEditorPanel(boolean isDoubleBuffered) {
	super(isDoubleBuffered);
}
/**
 * 
 * @param newListener ch.softenvironment.view.SimpleEditorPanelListener
 */
public void addSimpleEditorPanelListener(ch.softenvironment.view.SimpleEditorPanelListener newListener) {
	fieldSimpleEditorPanelListenerEventMulticaster = ch.softenvironment.view.SimpleEditorPanelListenerEventMulticaster.add(fieldSimpleEditorPanelListenerEventMulticaster, newListener);
	return;
}
/**
 * connEtoC1:  (MniDelete.action.actionPerformed(java.awt.event.ActionEvent) --> SimpleEditorPanel.mniDelete()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniDelete();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC10:  (TxaEditor.mouse.mousePressed(java.awt.event.MouseEvent) --> SimpleEditorPanel.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC10(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuEdit());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (MniUndo.action.actionPerformed(java.awt.event.ActionEvent) --> SimpleEditorPanel.mniUndo()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniUndo();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (MniRedo.action.actionPerformed(java.awt.event.ActionEvent) --> SimpleEditorPanel.mniRedo()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniRedo();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (TxaEditor.mouse.mouseReleased(java.awt.event.MouseEvent) --> SimpleEditorPanel.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuEdit());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (TxaEditor.key.keyReleased(java.awt.event.KeyEvent) --> SimpleEditorPanel.txaEditor_KeyReleased(Ljava.awt.event.KeyEvent;)V)
 * @param arg1 java.awt.event.KeyEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.KeyEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.txaEditor_KeyReleased(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (MniCut.action.actionPerformed(java.awt.event.ActionEvent) --> SimpleEditorPanel.mniCut()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniCut();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (MniCopy.action.actionPerformed(java.awt.event.ActionEvent) --> SimpleEditorPanel.mniCopy()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC7(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniCopy();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC8:  (TxaEditor.key.keyReleased(java.awt.event.KeyEvent) --> SimpleEditorPanel.fireTxaEditorKey_keyReleased(Ljava.util.EventObject;)V)
 * @param arg1 java.awt.event.KeyEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(java.awt.event.KeyEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.fireTxaEditorKey_keyReleased(new java.util.EventObject(this));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC9:  (MniPaste.action.actionPerformed(java.awt.event.ActionEvent) --> SimpleEditorPanel.mniPaste()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC9(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniPaste();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM1:  (MniSelectAll.action.actionPerformed(java.awt.event.ActionEvent) --> TxaEditor.selectAll()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxaEditor().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM2:  (TxaEditor.focus.focusGained(java.awt.event.FocusEvent) --> TxaEditor.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxaEditor().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Method to support listener events.
 * @param newEvent java.util.EventObject
 */
protected void fireTxaEditorKey_keyReleased(java.util.EventObject newEvent) {
	if (fieldSimpleEditorPanelListenerEventMulticaster == null) {
		return;
	};
	fieldSimpleEditorPanelListenerEventMulticaster.txaEditorKey_keyReleased(newEvent);
}
/**
 * @see BaseFrame (same method)
 */
private void genericPopupDisplay(java.awt.event.MouseEvent event, javax.swing.JPopupMenu popupMenu) {
	if (event.isPopupTrigger() && getTxaEditorEditable())  {
		// enable/disable buttons
		boolean isEditable = getTxaEditor().isEditable();
		boolean isSelected = getTxaEditor().getSelectedText() != null;
		getMniCopy().setEnabled(isSelected);
		getMniCut().setEnabled(isSelected);
		getMniDelete().setEnabled(isEditable && isSelected);
		getMniSelectAll().setEnabled(getTxaEditor().getText().length() > 0);
		java.awt.datatransfer.Clipboard clipboard = getToolkit().getSystemClipboard();
		getMniPaste().setEnabled(isEditable && (clipboard.getContents(this) != null));
		
		popupMenu.show(event.getComponent(), event.getX(), event.getY());
	}
}
/**
 * Return the JSeparator2 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator2() {
	if (ivjJSeparator2 == null) {
		try {
			ivjJSeparator2 = new javax.swing.JSeparator();
			ivjJSeparator2.setName("JSeparator2");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator2;
}
/**
 * Return the JSeparator22 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator22() {
	if (ivjJSeparator22 == null) {
		try {
			ivjJSeparator22 = new javax.swing.JSeparator();
			ivjJSeparator22.setName("JSeparator22");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator22;
}
/**
 * Return the MniCopy property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniCopy() {
	if (ivjMniCopy == null) {
		try {
			ivjMniCopy = new javax.swing.JMenuItem();
			ivjMniCopy.setName("MniCopy");
			ivjMniCopy.setText(resSimpleEditorPanel.getString("MniCopy_text"));
			ivjMniCopy.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniCopy;
}
/**
 * Return the MniCut property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniCut() {
	if (ivjMniCut == null) {
		try {
			ivjMniCut = new javax.swing.JMenuItem();
			ivjMniCut.setName("MniCut");
			ivjMniCut.setText(resSimpleEditorPanel.getString("MniCut_text"));
			ivjMniCut.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniCut;
}
/**
 * Return the MniDelete property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniDelete() {
	if (ivjMniDelete == null) {
		try {
			ivjMniDelete = new javax.swing.JMenuItem();
			ivjMniDelete.setName("MniDelete");
			ivjMniDelete.setText(resSimpleEditorPanel.getString("MniDelete_text"));
			ivjMniDelete.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniDelete;
}
/**
 * Return the MniPaste property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniPaste() {
	if (ivjMniPaste == null) {
		try {
			ivjMniPaste = new javax.swing.JMenuItem();
			ivjMniPaste.setName("MniPaste");
			ivjMniPaste.setText(resSimpleEditorPanel.getString("MniPaste_text"));
			ivjMniPaste.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniPaste;
}
/**
 * Return the MniRedo property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRedo() {
	if (ivjMniRedo == null) {
		try {
			ivjMniRedo = new javax.swing.JMenuItem();
			ivjMniRedo.setName("MniRedo");
			ivjMniRedo.setText(resSimpleEditorPanel.getString("MniRedo_text"));
			ivjMniRedo.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRedo;
}
/**
 * Return the MniSelectAll property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniSelectAll() {
	if (ivjMniSelectAll == null) {
		try {
			ivjMniSelectAll = new javax.swing.JMenuItem();
			ivjMniSelectAll.setName("MniSelectAll");
			ivjMniSelectAll.setText(resSimpleEditorPanel.getString("MniSelectAll_text"));
			ivjMniSelectAll.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniSelectAll;
}
/**
 * Return the MniUndo property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniUndo() {
	if (ivjMniUndo == null) {
		try {
			ivjMniUndo = new javax.swing.JMenuItem();
			ivjMniUndo.setName("MniUndo");
			ivjMniUndo.setText(resSimpleEditorPanel.getString("MniUndo_text"));
			ivjMniUndo.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniUndo;
}
/**
 * Return the MnuEdit property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnuEdit() {
	if (ivjMnuEdit == null) {
		try {
			ivjMnuEdit = new javax.swing.JPopupMenu();
			ivjMnuEdit.setName("MnuEdit");
			ivjMnuEdit.add(getMniUndo());
			ivjMnuEdit.add(getMniRedo());
			ivjMnuEdit.add(getJSeparator22());
			ivjMnuEdit.add(getMniCut());
			ivjMnuEdit.add(getMniCopy());
			ivjMnuEdit.add(getMniPaste());
			ivjMnuEdit.add(getMniDelete());
			ivjMnuEdit.add(getJSeparator2());
			ivjMnuEdit.add(getMniSelectAll());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuEdit;
}
/**
 * Return the JScrollPane1 property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpEditor() {
	if (ivjScpEditor == null) {
		try {
			ivjScpEditor = new javax.swing.JScrollPane();
			ivjScpEditor.setName("ScpEditor");
			ivjScpEditor.setAutoscrolls(true);
			getScpEditor().setViewportView(getTxaEditor());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpEditor;
}
/**
 * Return contents.
 */
public String getText() {
	return getTxaEditor().getText();
}
/**
 * Return the TxaEditor property value.
 * @return javax.swing.JTextArea
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextArea getTxaEditor() {
	if (ivjTxaEditor == null) {
		try {
			ivjTxaEditor = new javax.swing.JTextArea();
			ivjTxaEditor.setName("TxaEditor");
			ivjTxaEditor.setLineWrap(true);
			ivjTxaEditor.setWrapStyleWord(true);
			ivjTxaEditor.setBounds(0, 0, 160, 117);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxaEditor;
}
/**
 * Method generated to support the promotion of the txaEditorEditable attribute.
 * @return boolean
 */
public boolean getTxaEditorEditable() {
	return getTxaEditor().isEditable();
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {
	Tracer.getInstance().uncaughtException(this, "handleException(..)", exception);//$NON-NLS-1$
}
/**
 * Set contents from outside.
 * Reset of contentsChanged.
 * @see hasContentsChanged()
 */
public boolean hasContentsChanged() {
	return hasContentsChanged;
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getMniUndo().addActionListener(ivjEventHandler);
	getMniRedo().addActionListener(ivjEventHandler);
	getMniSelectAll().addActionListener(ivjEventHandler);
	getTxaEditor().addMouseListener(ivjEventHandler);
	getMniDelete().addActionListener(ivjEventHandler);
	getTxaEditor().addKeyListener(ivjEventHandler);
	getMniCut().addActionListener(ivjEventHandler);
	getMniCopy().addActionListener(ivjEventHandler);
	getMniPaste().addActionListener(ivjEventHandler);
	getTxaEditor().addFocusListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("PnlEditor");
		setAutoscrolls(true);
		setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));
		setSize(160, 120);
		add(getScpEditor(), getScpEditor().getName());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * main entrypoint - starts the part when it is run as an application
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		javax.swing.JFrame frame = new javax.swing.JFrame();
		SimpleEditorPanel aSimpleEditorPanel;
		aSimpleEditorPanel = new SimpleEditorPanel();
		frame.setContentPane(aSimpleEditorPanel);
		frame.setSize(aSimpleEditorPanel.getSize());
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		frame.show();
		java.awt.Insets insets = frame.getInsets();
		frame.setSize(frame.getWidth() + insets.left + insets.right, frame.getHeight() + insets.top + insets.bottom);
		frame.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("Exception occurred in main() of javax.swing.JPanel");//$NON-NLS-1$
		exception.printStackTrace(System.out);
	}
}
/**
 * Copy selection-contents into Clipboard.
 */
private void mniCopy() {
	getTxaEditor().copy();
	hasContentsChanged = true;
}
/**
 * Cut text into Clipboard.
 */
private void mniCut() {
	getTxaEditor().cut();
	hasContentsChanged = true;
}
/**
 * Remove the selected contents.
 */
private void mniDelete() {
	getTxaEditor().replaceSelection("");//$NON-NLS-1$
	hasContentsChanged = true;
}
/**
 * Comment
 */
private void mniFindReplace() {
	return;
}
/**
 * Paste Clipboard contents into TextArea.
 */
private void mniPaste() {
	getTxaEditor().paste();
	hasContentsChanged = true;
}
/**
 * Comment
 */
private void mniRedo() {
	return;
}
/**
 * Comment
 */
private void mniUndo() {
	return;
}
/**
 * 
 * @param newListener ch.softenvironment.view.SimpleEditorPanelListener
 */
public void removeSimpleEditorPanelListener(ch.softenvironment.view.SimpleEditorPanelListener newListener) {
	fieldSimpleEditorPanelListenerEventMulticaster = ch.softenvironment.view.SimpleEditorPanelListenerEventMulticaster.remove(fieldSimpleEditorPanelListenerEventMulticaster, newListener);
	return;
}
/**
 * @see JTextArea.
 */
public void setBackground(java.awt.Color color) {
	getTxaEditor().setBackground(color);
}
/**
 * @see JTextArea.
 */
public void setEditable(boolean isEditable) {
	getTxaEditor().setEditable(isEditable);
	if (isEditable) {
		getTxaEditor().setBackground(java.awt.Color.white);
	} else {
		getTxaEditor().setBackground(java.awt.Color.lightGray);
	}
}
/**
 * @see JTextArea.
 */
public void setEnabled(boolean isEnabled) {
	getTxaEditor().setEnabled(isEnabled);
}
/**
 * @see JTextArea.
 */
public void setLineWrap(boolean isLineWrap) {
	getTxaEditor().setLineWrap(isLineWrap);
}
/**
 * @see JTextArea.
 */
public void setText(String text) {
	getTxaEditor().setText(text);
}
/**
 * @see JTextArea.
 */
public void setToolTipText(String toolTip) {
	getTxaEditor().setToolTipText(toolTip);
}
/**
 * Method generated to support the promotion of the txaEditorEditable attribute.
 * @param arg1 boolean
 */
public void setTxaEditorEditable(boolean arg1) {
	getTxaEditor().setEditable(arg1);
}
/**
 * Keyboard typed.
 */
private void txaEditor_KeyReleased(java.awt.event.KeyEvent keyEvent) {
	hasContentsChanged = true;
}
}
