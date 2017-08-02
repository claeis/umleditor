package ch.ehi.umleditor.application;

import javax.swing.tree.*;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.Artifact;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import javax.swing.tree.MutableTreeNode;

public class MoveElementDialog extends ch.softenvironment.view.BaseDialog {

	private javax.swing.JTree tree;
	private Namespace selectedPackage = null;

	class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == MoveElementDialog.this.getBtnCancel())
				connEtoC1(e);
			if (e.getSource() == MoveElementDialog.this.getBtnOk())
				connEtoC2(e);
		};
	};

	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JScrollPane ivjScpTree = null;
	private javax.swing.JTree ivjTreTree = null;

	public MoveElementDialog(java.awt.Dialog owner, String title, boolean modal, Namespace apackage) {
		super(owner, title, modal);
		initialize();
		fillTreeView(apackage);
		initializeTree();
		if (title != null) {
			setTitle(title);
		}
		show();
	}

	public MoveElementDialog(java.awt.Frame owner, String title, boolean modal, Namespace apackage) {
		super(owner, title, modal);
		initialize();
		fillTreeView(apackage);
		initializeTree();
		if (title != null) {
			setTitle(title);
		}
		show();
	}

	/**
	 * connEtoC1: (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> PackageSelectionDialog.cancelPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC1(java.awt.event.ActionEvent arg1) {
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
	 * connEtoC2: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * PackageSelectionDialog.okPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC2(java.awt.event.ActionEvent arg1) {
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
	 * sets up the tree content
	 */
	private void fillTreeView(Namespace apackage) {
		getTreTree().setModel(new NavigationTreeModel(apackage, true));
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
				ivjBaseDialogContentPane.setLayout(new java.awt.GridBagLayout());

				java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
				constraintsBtnCancel.gridx = 2;
				constraintsBtnCancel.gridy = 2;
				constraintsBtnCancel.ipadx = 18;
				constraintsBtnCancel.insets = new java.awt.Insets(3, 6, 17, 97);
				getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 1;
				constraintsBtnOk.gridy = 2;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(3, 88, 17, 5);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

				java.awt.GridBagConstraints constraintsScpTree = new java.awt.GridBagConstraints();
				constraintsScpTree.gridx = 1;
				constraintsScpTree.gridy = 1;
				constraintsScpTree.gridwidth = 2;
				constraintsScpTree.fill = java.awt.GridBagConstraints.BOTH;
				constraintsScpTree.weightx = 1.0;
				constraintsScpTree.weighty = 1.0;
				constraintsScpTree.ipadx = 383;
				constraintsScpTree.ipady = 160;
				constraintsScpTree.insets = new java.awt.Insets(10, 12, 3, 9);
				getBaseDialogContentPane().add(getScpTree(), constraintsScpTree);
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
	 * Return the BtnCancel property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getBtnCancel() {
		if (ivjBtnCancel == null) {
			try {
				ivjBtnCancel = new javax.swing.JButton();
				ivjBtnCancel.setName("BtnCancel");
				ivjBtnCancel.setText("Abbrechen");
				// user code begin {1}
				ivjBtnCancel.setText(getCancelString());
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
	 * Return the BtnOk property value.
	 * 
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
	 * Return the ScpTree property value.
	 * 
	 * @return javax.swing.JScrollPane
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JScrollPane getScpTree() {
		if (ivjScpTree == null) {
			try {
				ivjScpTree = new javax.swing.JScrollPane();
				ivjScpTree.setName("ScpTree");
				getScpTree().setViewportView(getTreTree());
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjScpTree;
	}

	/**
	 * returns the Package selected by the user
	 */
	public Namespace getSelectedPackage() {
		return selectedPackage;
	}

	/**
	 * Return the TreTree property value.
	 * 
	 * @return javax.swing.JTree
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTree getTreTree() {
		if (ivjTreTree == null) {
			try {
				ivjTreTree = new javax.swing.JTree();
				ivjTreTree.setName("TreTree");
				ivjTreTree.setBounds(0, 0, 78, 72);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTreTree;
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
		getBtnCancel().addActionListener(ivjEventHandler);
		getBtnOk().addActionListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("PackageSelectionDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(426, 240);
			setTitle("<PackageSelection>");
			setContentPane(getBaseDialogContentPane());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		// user code end
	}

	/**
	 * Initialize the JTree.
	 * 
	 * @see EditorTreeCellRenderer
	 */
	private void initializeTree() {
		// set Listener's
		/*
		 * MouseListener ml = new MouseAdapter() { public void
		 * mouseClicked(MouseEvent e) { int selectedRow =
		 * getTreTree().getRowForLocation(e.getX(), e.getY()); if (selectedRow
		 * != -1) { TreePath selectedPath =
		 * getTreTree().getPathForLocation(e.getX(), e.getY()); MutableTreeNode
		 * selectedNode = (MutableTreeNode)selectedPath.getLastPathComponent();
		 * if (selectedNode != null) { if (e.getClickCount() == 2) { // HACK:
		 * this event comes twicely doubleClickTreated = !doubleClickTreated; if
		 * (!doubleClickTreated) { // doubleClick(selRow, selPath)
		 * NavigationTreeNode element = (NavigationTreeNode)selectedNode; if
		 * (element.hasSpecification()) { showSpecification(); } else if
		 * (element.isClassDiagram()) { openDiagram(element.getElement()); } } }
		 * } } } }; getTreTree().addMouseListener(ml);
		 */
		// Cell Rendering
		getTreTree().setCellRenderer(new NavigationTreeCellRenderer());

		// no Cell editing

		// make tree ask for the height of each row
		getTreTree().setRowHeight(-1);
		getTreTree().setRootVisible(true);

		// set Single Row selection model
		DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
		selectionModel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		getTreTree().setSelectionModel(selectionModel);

		// Enable tool tips for the tree
		javax.swing.ToolTipManager.sharedInstance().registerComponent(getTreTree());

		// show lines from Parent to leaf
		getTreTree().putClientProperty("JTree.lineStyle", "Angled");//$NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Overwrites in case OK-Button was pressed.
	 * 
	 * @return boolean whether saving was successful or not
	 */
	protected boolean save() {
		selectedPackage = (Namespace) getTreTree().getSelectionPath().getLastPathComponent();
		return super.save();
	}
}
