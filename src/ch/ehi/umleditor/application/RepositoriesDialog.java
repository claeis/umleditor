package ch.ehi.umleditor.application;

import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import ch.ehi.basics.tools.StringUtility;
import ch.softenvironment.view.BaseDialog;

import java.awt.*;
import java.awt.event.*;

class RepositoriesDialog extends JDialog{
	
	private static final long serialVersionUID = -4895755701568979945L;
	public final static int OK_OPTION = 1;
	public final static int CANCEL_OPTION = 2;
	private int pressedButton = CANCEL_OPTION;
	private String ilidirs = null;
	private String host = null;
	private String port = null;
	private JTextField ilidirsUi = null;
	private JTextField hostUi = null;
	private JTextField portUi = null;

	/**
	 * Return the ilidirsUi property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtIlidirsUi() {
		if (ilidirsUi == null) {
			try {
				ilidirsUi = new javax.swing.JTextField(50);
				ilidirsUi.setName("TxtIlidirs");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				System.out.println("Exception "+ivjExc);
			}
		}
		return ilidirsUi;
	}
	
	/**
	 * Return the ilidirsUi property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtPortUi() {
		if (portUi == null) {
			try {
				portUi = new javax.swing.JTextField();
				portUi.setName("TxtPort");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				System.out.println("Exception "+ivjExc);
			}
		}
		return portUi;
	}
	
	/**
	 * Return the ilidirsUi property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtHostUi() {
		if (hostUi == null) {
			try {
				hostUi = new javax.swing.JTextField();
				hostUi.setName("TxtHost");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				System.out.println("Exception "+ivjExc);
			}
		}
		return hostUi;
	}
	
	public RepositoriesDialog(Frame aFrame) {
		super(aFrame, /* modal */ true);

		addEscapeKey();
		addUndoRedo(getTxtIlidirsUi(),getTxtHostUi(),getTxtPortUi());
		setTitle("Model Repository Settings");
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

		// entry fields
		{
			java.awt.GridBagConstraints cnstrts = null;
			JLabel lbl = null;
			JPanel dataPane = new JPanel();
			dataPane.setLayout(new GridBagLayout());

			lbl = new JLabel("Model Repositories");
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 0;
			cnstrts.gridy = 0;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHEAST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(lbl, cnstrts);

			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 1;
			cnstrts.gridy = 0;
			cnstrts.fill = java.awt.GridBagConstraints.HORIZONTAL;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHWEST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(getTxtIlidirsUi(), cnstrts);

			lbl = new JLabel("http Proxy Host");
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 0;
			cnstrts.gridy = 1;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHEAST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(lbl, cnstrts);

			
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 1;
			cnstrts.gridy = 1;
			cnstrts.fill = java.awt.GridBagConstraints.HORIZONTAL;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHWEST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(getTxtHostUi(), cnstrts);

			lbl = new JLabel("http Proxy Port");
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 0;
			cnstrts.gridy = 2;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHEAST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(lbl, cnstrts);

			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 1;
			cnstrts.gridy = 2;
			cnstrts.fill = java.awt.GridBagConstraints.HORIZONTAL;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHWEST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(getTxtPortUi(), cnstrts);

			pane.add(dataPane);
		}

		// buttons
		JButton ok = null;
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
			buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
			buttonPane.add(Box.createHorizontalGlue());
			ok = new JButton("Ok");
			ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pressedButton = OK_OPTION;
					ilidirs = StringUtility.purge(ilidirsUi.getText());
					host = StringUtility.purge(hostUi.getText());
					port = StringUtility.purge(portUi.getText());
					dispose();
				}
			});
			buttonPane.add(ok);
			buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
			JButton cancel = new JButton("Cancel");
			cancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pressedButton = CANCEL_OPTION;
					dispose();
				}
			});
			buttonPane.add(cancel);
			pane.add(buttonPane);
		}

		getRootPane().setDefaultButton(ok);
		getContentPane().add(pane);
		// setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		pack(); // realize it
	}

	public int showDialog() {
		show();
		return pressedButton;
	}

	public String getHttpProxyHost() {
		return host;
	}

	public void setHttpProxyHost(String boid1) {
		host = boid1;
		hostUi.setText(host);
	}

	public String getHttpProxyPort() {
		return port;
	}

	public void setHttpProxyPort(String port1) {
		port = port1;
		portUi.setText(port);
	}

	public String getIlidirs() {
		return ilidirs;
	}

	public void setIlidirs(String basket1) {
		ilidirs = basket1;
		ilidirsUi.setText(ilidirs);
	}
	/**
	 * Handle escape key to close the dialog
	 */
	 private void addEscapeKey() {
		 
		 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
		 Action escapeAction = new AbstractAction() {
			
			private static final long serialVersionUID = -1887250897081389470L;

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
}
