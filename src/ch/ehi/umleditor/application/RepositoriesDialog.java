package ch.ehi.umleditor.application;

import javax.swing.*;

import ch.ehi.basics.tools.StringUtility;

import java.awt.*;
import java.awt.event.*;

class RepositoriesDialog extends JDialog {
	public final static int OK_OPTION = 1;
	public final static int CANCEL_OPTION = 2;
	private int pressedButton = CANCEL_OPTION;
	private String ilidirs = null;
	private String host = null;
	private String port = null;
	private JTextField ilidirsUi = null;
	private JTextField hostUi = null;
	private JTextField portUi = null;

	public RepositoriesDialog(Frame aFrame) {
		super(aFrame, /* modal */ true);

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

			ilidirsUi = new JTextField(50);
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 1;
			cnstrts.gridy = 0;
			cnstrts.fill = java.awt.GridBagConstraints.HORIZONTAL;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHWEST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(ilidirsUi, cnstrts);

			lbl = new JLabel("http Proxy Host");
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 0;
			cnstrts.gridy = 1;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHEAST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(lbl, cnstrts);

			hostUi = new JTextField();
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 1;
			cnstrts.gridy = 1;
			cnstrts.fill = java.awt.GridBagConstraints.HORIZONTAL;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHWEST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(hostUi, cnstrts);

			lbl = new JLabel("http Proxy Port");
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 0;
			cnstrts.gridy = 2;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHEAST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(lbl, cnstrts);

			portUi = new JTextField();
			cnstrts = new java.awt.GridBagConstraints();
			cnstrts.gridx = 1;
			cnstrts.gridy = 2;
			cnstrts.fill = java.awt.GridBagConstraints.HORIZONTAL;
			cnstrts.anchor = java.awt.GridBagConstraints.SOUTHWEST;
			cnstrts.weightx = 1.0;
			cnstrts.weighty = 1.0;
			cnstrts.insets = new java.awt.Insets(5, 5, 5, 5);
			dataPane.add(portUi, cnstrts);

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
}
