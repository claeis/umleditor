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
 
/**
 * StatusBar (bottom-Line of a Window).
 * @author: Peter Hirzel <i>soft</i>Environment
 * @see ApplicationFrame Subclasses
 */
public class StatusBar extends javax.swing.JPanel {
	public java.lang.String statusMaster;
	private javax.swing.JLabel ivjLblAction = null;
	private javax.swing.JLabel ivjLblStatus = null;
	private javax.swing.JLabel ivjLblMark = null;
	private javax.swing.JPanel ivjPnlAction = null;
	private javax.swing.JPanel ivjPnlStatus = null;
	private javax.swing.JPanel ivjPnlUserInfo = null;
/**
 * StatusBar constructor comment.
 */
public StatusBar() {
	super();
	initialize();
}
/**
 * StatusBar constructor comment.
 * @param layout java.awt.LayoutManager
 */
public StatusBar(java.awt.LayoutManager layout) {
	super(layout);
}
public void clearAll() {
	getLblStatus().setText(null);
	getLblAction().setText(null);
	getLblMark().setText(null);
}
/**
 * Return the LblStatusMsg2 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblAction() {
	if (ivjLblAction == null) {
		try {
			ivjLblAction = new javax.swing.JLabel();
			ivjLblAction.setName("LblAction");
			ivjLblAction.setPreferredSize(new java.awt.Dimension(4, 18));
			ivjLblAction.setBorder(new javax.swing.border.EtchedBorder());
			ivjLblAction.setText("");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblAction;
}
/**
 * Return the LblTimestamp property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblMark() {
	if (ivjLblMark == null) {
		try {
			ivjLblMark = new javax.swing.JLabel();
			ivjLblMark.setName("LblMark");
			ivjLblMark.setBorder(new javax.swing.border.EtchedBorder());
			ivjLblMark.setText("");
			ivjLblMark.setMaximumSize(new java.awt.Dimension(4, 4));
			ivjLblMark.setPreferredSize(new java.awt.Dimension(150, 18));
			ivjLblMark.setMinimumSize(new java.awt.Dimension(4, 4));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblMark;
}
/**
 * Return the LblStatusMsg1 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblStatus() {
	if (ivjLblStatus == null) {
		try {
			ivjLblStatus = new javax.swing.JLabel();
			ivjLblStatus.setName("LblStatus");
			ivjLblStatus.setBorder(new javax.swing.border.EtchedBorder());
			ivjLblStatus.setText("");
			ivjLblStatus.setMaximumSize(new java.awt.Dimension(4, 4));
			ivjLblStatus.setPreferredSize(new java.awt.Dimension(160, 18));
			ivjLblStatus.setMinimumSize(new java.awt.Dimension(4, 4));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblStatus;
}
/**
 * Return the PnlAction property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlAction() {
	if (ivjPnlAction == null) {
		try {
			ivjPnlAction = new javax.swing.JPanel();
			ivjPnlAction.setName("PnlAction");
			ivjPnlAction.setPreferredSize(new java.awt.Dimension(200, 18));
			ivjPnlAction.setBorder(new javax.swing.border.CompoundBorder());
			ivjPnlAction.setLayout(new java.awt.BorderLayout());
			ivjPnlAction.setMinimumSize(new java.awt.Dimension(4, 18));
			getPnlAction().add(getLblAction(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlAction;
}
/**
 * Return the PnlStatus property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlStatus() {
	if (ivjPnlStatus == null) {
		try {
			ivjPnlStatus = new javax.swing.JPanel();
			ivjPnlStatus.setName("PnlStatus");
			ivjPnlStatus.setPreferredSize(new java.awt.Dimension(180, 18));
			ivjPnlStatus.setBorder(new javax.swing.border.CompoundBorder());
			ivjPnlStatus.setLayout(new java.awt.BorderLayout());
			ivjPnlStatus.setMinimumSize(new java.awt.Dimension(150, 18));
			getPnlStatus().add(getLblStatus(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlStatus;
}
/**
 * Return the PnlUserInfo property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlUserInfo() {
	if (ivjPnlUserInfo == null) {
		try {
			ivjPnlUserInfo = new javax.swing.JPanel();
			ivjPnlUserInfo.setName("PnlUserInfo");
			ivjPnlUserInfo.setPreferredSize(new java.awt.Dimension(200, 18));
			ivjPnlUserInfo.setBorder(new javax.swing.border.CompoundBorder());
			ivjPnlUserInfo.setLayout(new java.awt.BorderLayout());
			ivjPnlUserInfo.setMinimumSize(new java.awt.Dimension(120, 18));
			getPnlUserInfo().add(getLblMark(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlUserInfo;
}
/**
 * Insert the method's description here.
 * Creation date: (07.09.2001 14:29:35)
 * @return java.lang.String
 */
private java.lang.String getStatusMaster() {
	return statusMaster;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {
	ch.softenvironment.util.Tracer.getInstance().uncaughtException(this, "handleException(..)", exception);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("StatusBar");
		setPreferredSize(new java.awt.Dimension(104, 18));
		setLayout(new java.awt.BorderLayout());
		setSize(488, 23);
		setMinimumSize(new java.awt.Dimension(804, 20));
		add(getPnlStatus(), "West");
		add(getPnlUserInfo(), "East");
		add(getPnlAction(), "Center");
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
		StatusBar aStatusBar;
		aStatusBar = new StatusBar();
		frame.setContentPane(aStatusBar);
		frame.setSize(aStatusBar.getSize());
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
		System.err.println("Exception occurred in main() of javax.swing.JPanel");
		exception.printStackTrace(System.out);
	}
}
public void setAction(String status) {
	getLblAction().setForeground(java.awt.Color.black);
	getLblAction().setText(status);
}
public void setMark(String status) {
	getLblMark().setText(status);
}
public void setStatus(String status) {
	getLblStatus().setText(status);
}
public void setWarning(String status) {
	getLblAction().setForeground(java.awt.Color.red);
	getLblAction().setText(status);
}
/**
 * Hide or show the statusbar.
 */
public void toggleVisbility() {
	setVisible(!(isVisible()));
}
}
