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
import javax.swing.*;
import ch.softenvironment.view.*;

/**
 * Typical Info/About User Interface.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:24 $
 */
public class AboutBoxDialog extends BaseDialog {
	private static java.util.ResourceBundle resources = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/AboutBoxDialog");
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JLabel ivjLblContractor = null;
	private JLabel ivjLblCopyright = null;
	private JLabel ivjLblVersion = null;
	private JLabel ivjLblEisenhutLogo = null;
	private JLabel ivjLblBy = null;
	private JLabel ivjLblInterlisVersion = null;
	private JLabel ivjLblJavaVMVersion = null;
	private JLabel ivjLblUMLVersion = null;
	private JLabel ivjLblVersionInterlis = null;
	private JLabel ivjLblVersionJava = null;
	private JLabel ivjLblVersionProgram = null;
	private JLabel ivjLblVersionUML = null;
	private JLabel ivjLblVersionVirtualMachine = null;
	private JLabel ivjLblJavaVersion = null;
	private JButton ivjBtnOk = null;
	private JLabel ivjLblDuke = null;
	private JLabel ivjLblInterlisImage = null;
	private JPanel ivjPnlBottom = null;
	private JPanel ivjPnlContents = null;
	private JPanel ivjPnlLeft = null;
	private JPanel ivjTxpInfo = null;
	private JLabel ivjLblApache = null;
	private JLabel ivjLblSoftwareBy = null;
	private JLabel ivjLblSupportedBy = null;
	private JLabel ivjLblSoftEnvironmentLogo = null;
	private JLabel ivjLblInterlisCompilerVersion = null;
	private JLabel ivjLblVersionInterlisCompiler = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == AboutBoxDialog.this.getBtnOk())
				connEtoM1(e);
		};
	};
/**
 * Constructor
 */
public AboutBoxDialog(java.awt.Frame owner) {
	super(owner, true);
	initialize();
	setRelativeLocation(owner);
	show();
}
/**
 * Constructor
 * @param owner Symbol
 * @param modal Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public AboutBoxDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * connEtoM1:  (OkButton.action.actionPerformed(java.awt.event.ActionEvent) --> TemplateViewAboutBox.dispose()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the OkButton property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnOk() {
	if (ivjBtnOk == null) {
		try {
			ivjBtnOk = new javax.swing.JButton();
			ivjBtnOk.setName("BtnOk");
			ivjBtnOk.setText("OK");
			// user code begin {1}
			ivjBtnOk.setText(getOKString());
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
 * Return the LblApache property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblApache() {
	if (ivjLblApache == null) {
		try {
			ivjLblApache = new javax.swing.JLabel();
			ivjLblApache.setName("LblApache");
			ivjLblApache.setText("- Apache Software Foundation  (http://www.apache.org/)");
			ivjLblApache.setBounds(25, 525, 353, 14);
			// user code begin {1}
			ivjLblApache.setText(resources.getString("LblApache_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblApache;
}
/**
 * Return the LblBy property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblBy() {
	if (ivjLblBy == null) {
		try {
			ivjLblBy = new javax.swing.JLabel();
			ivjLblBy.setName("LblBy");
			ivjLblBy.setText("Entwickelt durch:");
			ivjLblBy.setBounds(21, 280, 265, 14);
			// user code begin {1}
			ivjLblBy.setText(resources.getString("LblBy_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblBy;
}
/**
 * Return the UserName property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblContractor() {
	if (ivjLblContractor == null) {
		try {
			ivjLblContractor = new javax.swing.JLabel();
			ivjLblContractor.setName("LblContractor");
			ivjLblContractor.setText("Im Auftrag von KOGIS");
			ivjLblContractor.setBounds(6, 106, 235, 25);
			// user code begin {1}
			ivjLblContractor.setText(resources.getString("LblContractor_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblContractor;
}
/**
 * Return the Copyright property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblCopyright() {
	if (ivjLblCopyright == null) {
		try {
			ivjLblCopyright = new javax.swing.JLabel();
			ivjLblCopyright.setName("LblCopyright");
			ivjLblCopyright.setFont(new java.awt.Font("Arial", 2, 12));
			ivjLblCopyright.setText("Copyright");
			ivjLblCopyright.setBounds(6, 75, 235, 25);
			// user code begin {1}
			ivjLblCopyright.setText(resources.getString("LblCopyright_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblCopyright;
}
/**
 * Return the IconLabel property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblDuke() {
	if (ivjLblDuke == null) {
		try {
			ivjLblDuke = new javax.swing.JLabel();
			ivjLblDuke.setName("LblDuke");
			ivjLblDuke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ch/ehi/umleditor/images/dukeMagnify.gif")));
			ivjLblDuke.setText("");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblDuke;
}
/**
 * Return the LblEisenhutLogo property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblEisenhutLogo() {
	if (ivjLblEisenhutLogo == null) {
		try {
			ivjLblEisenhutLogo = new javax.swing.JLabel();
			ivjLblEisenhutLogo.setName("LblEisenhutLogo");
			ivjLblEisenhutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ch/ehi/umleditor/images/eisenhut_logo.gif")));
			ivjLblEisenhutLogo.setToolTipText("http://www.eisenhutinformatik.ch");
			ivjLblEisenhutLogo.setText("");
			ivjLblEisenhutLogo.setBounds(21, 300, 403, 82);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblEisenhutLogo;
}
/**
 * Return the LblInterlisCompilerVersion property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblInterlisCompilerVersion() {
	if (ivjLblInterlisCompilerVersion == null) {
		try {
			ivjLblInterlisCompilerVersion = new javax.swing.JLabel();
			ivjLblInterlisCompilerVersion.setName("LblInterlisCompilerVersion");
			ivjLblInterlisCompilerVersion.setText("<iliCompilerVersion>");
			ivjLblInterlisCompilerVersion.setBounds(229, 178, 189, 14);
			// user code begin {1}
			ivjLblInterlisCompilerVersion.setText(resources.getString("LblInterlisCompilerVersion_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblInterlisCompilerVersion;
}
/**
 * Return the JLabel2 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblInterlisImage() {
	if (ivjLblInterlisImage == null) {
		try {
			ivjLblInterlisImage = new javax.swing.JLabel();
			ivjLblInterlisImage.setName("LblInterlisImage");
			ivjLblInterlisImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ch/ehi/umleditor/images/interlis_logo.gif")));
			ivjLblInterlisImage.setText("JLabel2");
			ivjLblInterlisImage.setBounds(303, 19, 119, 54);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblInterlisImage;
}
/**
 * Return the LblInterlisVersion property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblInterlisVersion() {
	if (ivjLblInterlisVersion == null) {
		try {
			ivjLblInterlisVersion = new javax.swing.JLabel();
			ivjLblInterlisVersion.setName("LblInterlisVersion");
			ivjLblInterlisVersion.setText("2.2");
			ivjLblInterlisVersion.setBounds(229, 155, 189, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblInterlisVersion;
}
/**
 * Return the LblUMLVersion property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblJavaVersion() {
	if (ivjLblJavaVersion == null) {
		try {
			ivjLblJavaVersion = new javax.swing.JLabel();
			ivjLblJavaVersion.setName("LblJavaVersion");
			ivjLblJavaVersion.setText("<JavaVersion>");
			ivjLblJavaVersion.setBounds(229, 219, 189, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblJavaVersion;
}
/**
 * Return the LblJavaVMVersion property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblJavaVMVersion() {
	if (ivjLblJavaVMVersion == null) {
		try {
			ivjLblJavaVMVersion = new javax.swing.JLabel();
			ivjLblJavaVMVersion.setName("LblJavaVMVersion");
			ivjLblJavaVMVersion.setText("<VMVersion>");
			ivjLblJavaVMVersion.setBounds(229, 240, 189, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblJavaVMVersion;
}
/**
 * Return the LblSoftEnvironmentLogo property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblSoftEnvironmentLogo() {
	if (ivjLblSoftEnvironmentLogo == null) {
		try {
			ivjLblSoftEnvironmentLogo = new javax.swing.JLabel();
			ivjLblSoftEnvironmentLogo.setName("LblSoftEnvironmentLogo");
			ivjLblSoftEnvironmentLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ch/ehi/umleditor/images/softenvironment_logo.gif")));
			ivjLblSoftEnvironmentLogo.setToolTipText("http://www.softenvironment.ch");
			ivjLblSoftEnvironmentLogo.setText("JLabel3");
			ivjLblSoftEnvironmentLogo.setBounds(157, 403, 264, 75);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblSoftEnvironmentLogo;
}
/**
 * Return the LblSoftwareBy property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblSoftwareBy() {
	if (ivjLblSoftwareBy == null) {
		try {
			ivjLblSoftwareBy = new javax.swing.JLabel();
			ivjLblSoftwareBy.setName("LblSoftwareBy");
			ivjLblSoftwareBy.setText("Dieses Produkt enthält Software, die entwickelt wurde durch:");
			ivjLblSoftwareBy.setBounds(21, 505, 371, 14);
			// user code begin {1}
			ivjLblSoftwareBy.setText(resources.getString("LblSoftwareBy_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblSoftwareBy;
}
/**
 * Return the LblSoftEnvironment property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblSupportedBy() {
	if (ivjLblSupportedBy == null) {
		try {
			ivjLblSupportedBy = new javax.swing.JLabel();
			ivjLblSupportedBy.setName("LblSupportedBy");
			ivjLblSupportedBy.setText("Unterstützt durch:");
			ivjLblSupportedBy.setBounds(21, 403, 119, 14);
			// user code begin {1}
			ivjLblSupportedBy.setText(resources.getString("LblSupportedBy_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblSupportedBy;
}
/**
 * Return the LblUMLVersion property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblUMLVersion() {
	if (ivjLblUMLVersion == null) {
		try {
			ivjLblUMLVersion = new javax.swing.JLabel();
			ivjLblUMLVersion.setName("LblUMLVersion");
			ivjLblUMLVersion.setText("1.4");
			ivjLblUMLVersion.setBounds(229, 199, 189, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblUMLVersion;
}
/**
 * Return the Version property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVersion() {
	if (ivjLblVersion == null) {
		try {
			ivjLblVersion = new javax.swing.JLabel();
			ivjLblVersion.setName("LblVersion");
			ivjLblVersion.setText("<ProgramVersion>");
			ivjLblVersion.setBounds(229, 134, 189, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVersion;
}
/**
 * Return the LblVersionInterlis property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVersionInterlis() {
	if (ivjLblVersionInterlis == null) {
		try {
			ivjLblVersionInterlis = new javax.swing.JLabel();
			ivjLblVersionInterlis.setName("LblVersionInterlis");
			ivjLblVersionInterlis.setText("INTERLIS-Version:");
			ivjLblVersionInterlis.setBounds(21, 155, 189, 14);
			// user code begin {1}
			ivjLblVersionInterlis.setText(resources.getString("LblVersionInterlis_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVersionInterlis;
}
/**
 * Return the LblVersionInterlisCompiler property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVersionInterlisCompiler() {
	if (ivjLblVersionInterlisCompiler == null) {
		try {
			ivjLblVersionInterlisCompiler = new javax.swing.JLabel();
			ivjLblVersionInterlisCompiler.setName("LblVersionInterlisCompiler");
			ivjLblVersionInterlisCompiler.setText("INTERLIS-Compiler-Version:");
			ivjLblVersionInterlisCompiler.setBounds(21, 178, 189, 14);
			// user code begin {1}
			ivjLblVersionInterlisCompiler.setText(resources.getString("LblInterlisCompilerVersion_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVersionInterlisCompiler;
}
/**
 * Return the LblVersionJava property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVersionJava() {
	if (ivjLblVersionJava == null) {
		try {
			ivjLblVersionJava = new javax.swing.JLabel();
			ivjLblVersionJava.setName("LblVersionJava");
			ivjLblVersionJava.setText("Java-Version:");
			ivjLblVersionJava.setBounds(21, 219, 189, 14);
			// user code begin {1}
			ivjLblVersionJava.setText(resources.getString("LblVersionJava_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVersionJava;
}
/**
 * Return the LblVersionProgram property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVersionProgram() {
	if (ivjLblVersionProgram == null) {
		try {
			ivjLblVersionProgram = new javax.swing.JLabel();
			ivjLblVersionProgram.setName("LblVersionProgram");
			ivjLblVersionProgram.setText("Version:");
			ivjLblVersionProgram.setBounds(21, 134, 189, 14);
			// user code begin {1}
			ivjLblVersionProgram.setText(resources.getString("LblVersionProgram_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVersionProgram;
}
/**
 * Return the LblVersionUML property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVersionUML() {
	if (ivjLblVersionUML == null) {
		try {
			ivjLblVersionUML = new javax.swing.JLabel();
			ivjLblVersionUML.setName("LblVersionUML");
			ivjLblVersionUML.setText("UML-Version:");
			ivjLblVersionUML.setBounds(21, 199, 189, 14);
			// user code begin {1}
			ivjLblVersionUML.setText(resources.getString("LblVersionUML_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVersionUML;
}
/**
 * Return the LblVersionVirtualMachine property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVersionVirtualMachine() {
	if (ivjLblVersionVirtualMachine == null) {
		try {
			ivjLblVersionVirtualMachine = new javax.swing.JLabel();
			ivjLblVersionVirtualMachine.setName("LblVersionVirtualMachine");
			ivjLblVersionVirtualMachine.setText("VM-Version:");
			ivjLblVersionVirtualMachine.setBounds(21, 240, 189, 14);
			// user code begin {1}
			ivjLblVersionVirtualMachine.setText(resources.getString("LblVersionVirtualMachine_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVersionVirtualMachine;
}
/**
 * Return the ButtonPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlBottom() {
	if (ivjPnlBottom == null) {
		try {
			ivjPnlBottom = new javax.swing.JPanel();
			ivjPnlBottom.setName("PnlBottom");
			ivjPnlBottom.setLayout(new java.awt.FlowLayout());
			getPnlBottom().add(getBtnOk(), getBtnOk().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlBottom;
}
/**
 * Return the JDialogContentPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlContents() {
	if (ivjPnlContents == null) {
		try {
			ivjPnlContents = new javax.swing.JPanel();
			ivjPnlContents.setName("PnlContents");
			ivjPnlContents.setLayout(new java.awt.BorderLayout());
			getPnlContents().add(getPnlBottom(), "South");
			getPnlContents().add(getTxpInfo(), "Center");
			getPnlContents().add(getPnlLeft(), "West");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlContents;
}
/**
 * Return the IconPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlLeft() {
	if (ivjPnlLeft == null) {
		try {
			ivjPnlLeft = new javax.swing.JPanel();
			ivjPnlLeft.setName("PnlLeft");
			ivjPnlLeft.setLayout(new java.awt.FlowLayout());
			getPnlLeft().add(getLblDuke(), getLblDuke().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlLeft;
}
/**
 * Return the TextPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getTxpInfo() {
	if (ivjTxpInfo == null) {
		try {
			ivjTxpInfo = new javax.swing.JPanel();
			ivjTxpInfo.setName("TxpInfo");
			ivjTxpInfo.setLayout(null);
			getTxpInfo().add(getLblVersion(), getLblVersion().getName());
			getTxpInfo().add(getLblCopyright(), getLblCopyright().getName());
			getTxpInfo().add(getLblContractor(), getLblContractor().getName());
			getTxpInfo().add(getLblInterlisImage(), getLblInterlisImage().getName());
			getTxpInfo().add(getLblEisenhutLogo(), getLblEisenhutLogo().getName());
			getTxpInfo().add(getLblBy(), getLblBy().getName());
			getTxpInfo().add(getLblVersionJava(), getLblVersionJava().getName());
			getTxpInfo().add(getLblVersionVirtualMachine(), getLblVersionVirtualMachine().getName());
			getTxpInfo().add(getLblJavaVersion(), getLblJavaVersion().getName());
			getTxpInfo().add(getLblVersionProgram(), getLblVersionProgram().getName());
			getTxpInfo().add(getLblJavaVMVersion(), getLblJavaVMVersion().getName());
			getTxpInfo().add(getLblVersionInterlis(), getLblVersionInterlis().getName());
			getTxpInfo().add(getLblInterlisVersion(), getLblInterlisVersion().getName());
			getTxpInfo().add(getLblVersionUML(), getLblVersionUML().getName());
			getTxpInfo().add(getLblUMLVersion(), getLblUMLVersion().getName());
			getTxpInfo().add(getLblSoftwareBy(), getLblSoftwareBy().getName());
			getTxpInfo().add(getLblApache(), getLblApache().getName());
			getTxpInfo().add(getLblSupportedBy(), getLblSupportedBy().getName());
			getTxpInfo().add(getLblSoftEnvironmentLogo(), getLblSoftEnvironmentLogo().getName());
			getTxpInfo().add(getLblVersionInterlisCompiler(), getLblVersionInterlisCompiler().getName());
			getTxpInfo().add(getLblInterlisCompilerVersion(), getLblInterlisCompilerVersion().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxpInfo;
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
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		getLblVersion().setText(LauncherView.getVersion());
		getLblInterlisCompilerVersion().setText(LauncherView.getIli2cVersion());
		getLblJavaVersion().setText(System.getProperty("java.version"));
		getLblJavaVMVersion().setText(System.getProperty("java.vm.version"));
		// user code end
		setName("DlgAboutBox");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(554, 648);
		setTitle("Info zum UML/INTERLIS-Editor");
		setContentPane(getPnlContents());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setTitle("Info zu:" + " " + LauncherView.getInstance().getApplicationName());
	// user code end
}
}
