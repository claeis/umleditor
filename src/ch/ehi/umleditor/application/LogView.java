package ch.ehi.umleditor.application;

import ch.softenvironment.view.*;
import ch.ehi.uml1_4.foundation.core.ModelElement;

/**
 * Log-Panel to trace output.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.7 $ $Date: 2004-06-29 11:38:47 $
 */
public class LogView extends BasePanel {
	private static final String ID_TEXT = "<ID:";//$NON-NLS-1$
	private javax.swing.JPanel ivjPnlLog = null;
	private javax.swing.JScrollPane ivjScpLog = null;
	private javax.swing.JTabbedPane ivjTbpLog = null;
	private javax.swing.JTextArea ivjTxaLog = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JSeparator ivjJSeparator1 = null;
	private javax.swing.JSeparator ivjJSeparator2 = null;
	private javax.swing.JMenuItem ivjMniClear = null;
	private javax.swing.JMenuItem ivjMniSave = null;
	private javax.swing.JMenuItem ivjMniSelectAll = null;
	private javax.swing.JPopupMenu ivjMnpLogMenu = null;
	private javax.swing.JMenuItem ivjMniCopy = null;
	private javax.swing.JSeparator ivjJSeparator3 = null;
	private javax.swing.JMenuItem ivjMniSelectNodeInTree = null;
	private javax.swing.JCheckBoxMenuItem ivjMncWrapLines = null;
        /** offset into text of mouse position during popup menu activation
         *
         */
        private int currentOffset=-1;
        /** current line of text at mouse position during popup menu activation
         *
         */
        private String currentLine=null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.ItemListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == LogView.this.getMniClear()) 
				connEtoC1(e);
			if (e.getSource() == LogView.this.getMniSelectAll()) 
				connEtoM1(e);
			if (e.getSource() == LogView.this.getMniCopy()) 
				connEtoM2(e);
			if (e.getSource() == LogView.this.getMniSave()) 
				connEtoC3(e);
			if (e.getSource() == LogView.this.getMniSelectNodeInTree()) 
				connEtoC4(e);
		};
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == LogView.this.getMncWrapLines()) 
				connEtoC5(e);
		};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == LogView.this.getTxaLog()) 
				connEtoC6(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == LogView.this.getTxaLog()) 
				connEtoC2(e);
		};
	};
/**
 * LogView constructor comment.
 */
public LogView() {
	super();
	initialize();
}
/**
 * Overwrites.
 */
protected void adaptSelection(java.awt.event.MouseEvent event, javax.swing.JPopupMenu popupMenu) {
	// enable/disable menu
	boolean isEmpty = (getTxaLog().getText() != null) && (getTxaLog().getText().length() > 0);
	getMniClear().setEnabled(isEmpty);
	getMniSelectAll().setEnabled(isEmpty);
	if (getTxaLog().getSelectedText() == null) {
		getMniCopy().setEnabled(false);
		getMniSelectNodeInTree().setEnabled(false);
	} else {
		getMniCopy().setEnabled(true);
	}

	// popoup inside text area?
    if((currentOffset>=0) &&
    		(currentOffset < getTxaLog().getDocument().getLength() /*prevent BadRelocationException*/)){
        javax.swing.JTextArea t=LogView.this.getTxaLog();
        try{
           // get current line
           int line=t.getLineOfOffset(currentOffset);
           int start=t.getLineStartOffset(line);
           int end=t.getLineEndOffset(line);
           currentLine=t.getText(start,end-start);
           // enable function "jump to element" if line contains an element id
 	  		getMniSelectNodeInTree().setEnabled(currentLine.indexOf("<ID:") > 0);//$NON-NLS-1$
         }catch(javax.swing.text.BadLocationException ex){
           handleException(ex);
         }
   }
}
/**
 * Append a log-message without a specific theme.
 */
public void appendText(String logText) {
	String text = getTime() + " " + logText;//$NON-NLS-1$

	if (getTxaLog().getText().length() > 0) {
		// append
		getTxaLog().append("\n");
		getTxaLog().append(text);
	} else {
		getTxaLog().setText(text);
	}
}
/**
 * Append a log-message with a specific theme.
 */
public void appendText(String title, String logText) {
	appendText("[" + title + "] " + logText);//$NON-NLS-2$//$NON-NLS-1$
}
/**
 * Append a log-message with a specific theme.
 * @param id unique identity to trace object of log interest
 */
public void appendText(String id, String title, String logText) {
	appendText(title, ID_TEXT + id + "> " + logText);//$NON-NLS-1$
}
/**
 * Perform the clear method.
 */
public void clear() {
	/* Perform the clear method. */
	getTxaLog().setText(null);
}
/**
 * connEtoC1:  (MniClear.action.actionPerformed(java.awt.event.ActionEvent) --> LogView.clear()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.clear();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (TxaLog.mouse.mouseReleased(java.awt.event.MouseEvent) --> LogView.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		currentOffset = LogView.this.getTxaLog().viewToModel(arg1.getPoint());
		// user code end
		this.genericPopupDisplay(arg1, getMnpLogMenu());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (MniSave.action.actionPerformed(java.awt.event.ActionEvent) --> LogView.mniSave()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniSave();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (MniSelectNodeInTree.action.actionPerformed(java.awt.event.ActionEvent) --> LogView.mniSelectNodeInTree()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniSelectNodeInTree();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (MncWrapLines.item.itemStateChanged(java.awt.event.ItemEvent) --> LogView.mncWrapLines()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mncWrapLines();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (TxaLog.mouse.mousePressed(java.awt.event.MouseEvent) --> LogView.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnpLogMenu());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM1:  (MniSelectAll.action.actionPerformed(java.awt.event.ActionEvent) --> TxaLog.selectAll()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxaLog().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM2:  (MniCopy.action.actionPerformed(java.awt.event.ActionEvent) --> TxaLog.copy()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxaLog().copy();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
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
 * Return the JSeparator3 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator3() {
	if (ivjJSeparator3 == null) {
		try {
			ivjJSeparator3 = new javax.swing.JSeparator();
			ivjJSeparator3.setName("JSeparator3");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator3;
}
/**
 * Return the MncWrapLines property value.
 * @return javax.swing.JCheckBoxMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBoxMenuItem getMncWrapLines() {
	if (ivjMncWrapLines == null) {
		try {
			ivjMncWrapLines = new javax.swing.JCheckBoxMenuItem();
			ivjMncWrapLines.setName("MncWrapLines");
			ivjMncWrapLines.setText("Zeilen umbrechen");
			// user code begin {1}
			ivjMncWrapLines.setText(getResourceString("MncWrapLines_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMncWrapLines;
}
/**
 * Return the MniClear property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniClear() {
	if (ivjMniClear == null) {
		try {
			ivjMniClear = new javax.swing.JMenuItem();
			ivjMniClear.setName("MniClear");
			ivjMniClear.setText("Log löschen");
			ivjMniClear.setEnabled(false);
			// user code begin {1}
			ivjMniClear.setText(CommonUserAccess.getMniEditRemoveText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniClear;
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
			ivjMniCopy.setText("Kopieren");
			ivjMniCopy.setEnabled(false);
			// user code begin {1}
			ivjMniCopy.setText(CommonUserAccess.getMniEditCopyText());
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
 * Return the MniSave property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniSave() {
	if (ivjMniSave == null) {
		try {
			ivjMniSave = new javax.swing.JMenuItem();
			ivjMniSave.setName("MniSave");
			ivjMniSave.setText("Speichern unter...");
			ivjMniSave.setEnabled(false);
			// user code begin {1}
			ivjMniSave.setText(CommonUserAccess.getMniFileSaveText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniSave;
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
			ivjMniSelectAll.setText("Alles markieren");
			ivjMniSelectAll.setEnabled(false);
			// user code begin {1}
			ivjMniSelectAll.setText(CommonUserAccess.getMniEditSelectAllText());
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
 * Return the MniSelectNodeInTree property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniSelectNodeInTree() {
	if (ivjMniSelectNodeInTree == null) {
		try {
			ivjMniSelectNodeInTree = new javax.swing.JMenuItem();
			ivjMniSelectNodeInTree.setName("MniSelectNodeInTree");
			ivjMniSelectNodeInTree.setToolTipText("Knoten in der Navigation selektieren");
			ivjMniSelectNodeInTree.setText("Knoten selektieren");
			ivjMniSelectNodeInTree.setEnabled(false);
			// user code begin {1}
			ivjMniSelectNodeInTree.setToolTipText(getResourceString("MniSelectNodeInTree_toolTipText"));
			ivjMniSelectNodeInTree.setText(getResourceString("MniSelectNodeInTree_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniSelectNodeInTree;
}
/**
 * Return the MnpLogMenu property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnpLogMenu() {
	if (ivjMnpLogMenu == null) {
		try {
			ivjMnpLogMenu = new javax.swing.JPopupMenu();
			ivjMnpLogMenu.setName("MnpLogMenu");
			ivjMnpLogMenu.add(getMniClear());
			ivjMnpLogMenu.add(getMniCopy());
			ivjMnpLogMenu.add(getJSeparator1());
			ivjMnpLogMenu.add(getMniSelectAll());
			ivjMnpLogMenu.add(getMncWrapLines());
			ivjMnpLogMenu.add(getJSeparator2());
			ivjMnpLogMenu.add(getMniSave());
			ivjMnpLogMenu.add(getJSeparator3());
			ivjMnpLogMenu.add(getMniSelectNodeInTree());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnpLogMenu;
}
/**
 * Return the PnlLog property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlLog() {
	if (ivjPnlLog == null) {
		try {
			ivjPnlLog = new javax.swing.JPanel();
			ivjPnlLog.setName("PnlLog");
			ivjPnlLog.setLayout(new java.awt.BorderLayout());
			getPnlLog().add(getScpLog(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlLog;
}
/**
 * Return the ScpLog property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpLog() {
	if (ivjScpLog == null) {
		try {
			ivjScpLog = new javax.swing.JScrollPane();
			ivjScpLog.setName("ScpLog");
			getScpLog().setViewportView(getTxaLog());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpLog;
}
/**
 * Return the TbpLog property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpLog() {
	if (ivjTbpLog == null) {
		try {
			ivjTbpLog = new javax.swing.JTabbedPane();
			ivjTbpLog.setName("TbpLog");
			ivjTbpLog.insertTab(getResourceString("CTLog"), null, getPnlLog(), null, 0);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbpLog;
}
/**
 * Return time->now as String
 *
 */
private String getTime() {
	java.util.GregorianCalendar now = new java.util.GregorianCalendar();
	now.getTime().toString();
	java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("HH:mm:ss");//$NON-NLS-1$
	return formater.format(now.getTime());
}
/**
 * Return the TxaLog property value.
 * @return javax.swing.JTextArea
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextArea getTxaLog() {
	if (ivjTxaLog == null) {
		try {
			ivjTxaLog = new javax.swing.JTextArea();
			ivjTxaLog.setName("TxaLog");
			ivjTxaLog.setLineWrap(true);
			ivjTxaLog.setBounds(0, 0, 160, 120);
			ivjTxaLog.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxaLog;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	new ErrorDialog(this, null, exception.toString(), exception);//$NON-NLS-1$
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getMniClear().addActionListener(ivjEventHandler);
	getTxaLog().addMouseListener(ivjEventHandler);
	getMniSelectAll().addActionListener(ivjEventHandler);
	getMniCopy().addActionListener(ivjEventHandler);
	getMniSave().addActionListener(ivjEventHandler);
	getMniSelectNodeInTree().addActionListener(ivjEventHandler);
	getMncWrapLines().addItemListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("LogView");
		setLayout(new java.awt.BorderLayout());
		setSize(623, 139);
		add(getTbpLog(), "Center");
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	wrapLines(false);
	// user code end
}
/**
 * Show the lines wrapped or not.
 */
private void mncWrapLines() {
	wrapLines(getMncWrapLines().isSelected());
}
/**
 * Comment
 */
private void mniSave() {
LauncherView.getInstance().nyi("save()");//$NON-NLS-1$
}
/**
 * Select all nodes in NavigationTree where ID's are selected in LogText.
 */
private void mniSelectNodeInTree() {
    String sel=currentLine;
    int start=sel.indexOf("<ID:") ;//$NON-NLS-1$
    if(start==-1)return;
    int end=sel.indexOf(">",start);//$NON-NLS-1$
    if(end==-1)return;
    String id=sel.substring(start+4,end).trim();
    ModelElement modelElement=(ModelElement)LauncherView.getInstance().getModel().deepGetElementById(id);
    LauncherView.getInstance().showSpecification(modelElement);
}
/**
 * Hide or show the statusbar.
 */
public void toggleVisibility() {
	setVisible(!(isVisible()));
}
private void wrapLines(boolean wrap)
{
	if (wrap) {
		getScpLog().setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getTxaLog().setAutoscrolls(false);
		getTxaLog().setLineWrap(true);
	} else {
		getScpLog().setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		getTxaLog().setAutoscrolls(true);
		getTxaLog().setLineWrap(false);
	}
	
}
}
