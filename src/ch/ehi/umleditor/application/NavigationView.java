package ch.ehi.umleditor.application;

import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
import javax.swing.tree.*;
import ch.softenvironment.util.*;
import ch.softenvironment.view.CommonUserAccess;
/**
 * Panel to represent an INTERLIS UmlModel as a Tree.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.6 $ $Date: 2004-05-03 13:38:26 $
 */
public class NavigationView extends ch.softenvironment.view.BasePanel implements ch.ehi.umleditor.umldrawingtools.ModelElementUI {
    //private TreeDragSource ds;
    //private TreeDropTarget dt;
    private NavigationTreeModel modelAdapter=null;
	// optimize speed
	private DefaultMutableTreeNode latestNodeInTree = null;
	private boolean singleClickTreated = false;
	private boolean doubleClickTreated = false;
        private javax.swing.JMenuItem mniMoveElement=null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JSeparator ivjJSeparator6 = null;
	private javax.swing.JSeparator ivjJSeparator7 = null;
	private javax.swing.JMenuItem ivjMniOpenSpecification = null;
	private javax.swing.JMenuItem ivjMniRename = null;
	private javax.swing.JPopupMenu ivjMnpTreeActions = null;
	private javax.swing.JTree ivjTreNavigation = null;
	private javax.swing.JMenuItem ivjMniMetaDataUseDef = null;
	private javax.swing.JMenuItem ivjMniClassDef = null;
	private javax.swing.JMenuItem ivjMniDomainDef = null;
	private javax.swing.JMenuItem ivjMniModelDef = null;
	private javax.swing.JMenuItem ivjMniTopicDef = null;
	private javax.swing.JMenuItem ivjMniInterlis2Def = null;
	private javax.swing.JMenuItem ivjMniFunctionDef = null;
	private javax.swing.JMenuItem ivjMniGraphicDef = null;
	private javax.swing.JMenuItem ivjMniGraphicParameterDef = null;
	private javax.swing.JMenuItem ivjMniLineFormTypeDef = null;
	private javax.swing.JMenuItem ivjMniRemove = null;
	private javax.swing.JMenuItem ivjMniUnitDef = null;
	private javax.swing.JMenuItem ivjMniViewDef = null;
	private javax.swing.JMenuItem ivjMniViewProjectionDef = null;
	private javax.swing.JMenu ivjMnuNew = null;
	private javax.swing.JMenuItem ivjMniClassDiagram = null;
	private javax.swing.JMenuItem ivjMniOpen = null;
	private javax.swing.JMenuItem ivjMniPrint = null;
	private javax.swing.JMenuItem ivjMniAttributeDef = null;
	private javax.swing.JSeparator ivjJSeparator1 = null;
	private javax.swing.JMenuItem ivjMniAddToDiagram = null;
	private javax.swing.JScrollPane ivjScpNavigation = null;
	private javax.swing.JMenuItem ivjMniAssociationDef = null;
	private javax.swing.JMenuItem ivjMniRoleDef = null;
	private javax.swing.JMenuItem ivjMniMetaObjectFile = null;
	private javax.swing.JMenuItem ivjMniUmlPackage = null;
	private javax.swing.JRadioButtonMenuItem ivjMniSortbyKindName = null;
	private javax.swing.JRadioButtonMenuItem ivjMniSortbyName = null;
	private javax.swing.JMenu ivjMnuSort = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.MouseListener, javax.swing.event.TreeSelectionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == NavigationView.this.getMniOpenSpecification())
				connEtoC2(e);
			if (e.getSource() == NavigationView.this.getMniRemove())
				connEtoC3(e);
			if (e.getSource() == NavigationView.this.getMniRename())
				connEtoC4(e);
			if (e.getSource() == NavigationView.this.getMniClassDiagram())
				connEtoC5(e);
			if (e.getSource() == NavigationView.this.getMniInterlis2Def())
				connEtoC6(e);
			if (e.getSource() == NavigationView.this.getMniModelDef())
				connEtoC7(e);
			if (e.getSource() == NavigationView.this.getMniMetaDataUseDef())
				connEtoC10(e);
			if (e.getSource() == NavigationView.this.getMniTopicDef())
				connEtoC16(e);
			if (e.getSource() == NavigationView.this.getMniClassDef())
				connEtoC17(e);
			if (e.getSource() == NavigationView.this.getMniDomainDef())
				connEtoC9(e);
			if (e.getSource() == NavigationView.this.getMniUnitDef())
				connEtoC11(e);
			if (e.getSource() == NavigationView.this.getMniFunctionDef())
				connEtoC12(e);
			if (e.getSource() == NavigationView.this.getMniLineFormTypeDef())
				connEtoC13(e);
			if (e.getSource() == NavigationView.this.getMniGraphicParameterDef())
				connEtoC14(e);
			if (e.getSource() == NavigationView.this.getMniViewDef())
				connEtoC20(e);
			if (e.getSource() == NavigationView.this.getMniViewProjectionDef())
				connEtoC21(e);
			if (e.getSource() == NavigationView.this.getMniGraphicDef())
				connEtoC22(e);
			if (e.getSource() == NavigationView.this.getMniOpen())
				connEtoC28(e);
			if (e.getSource() == NavigationView.this.getMniPrint())
				connEtoC29(e);
			if (e.getSource() == NavigationView.this.getMniAttributeDef())
				connEtoC18(e);
			if (e.getSource() == NavigationView.this.getMniAddToDiagram())
				connEtoC19(e);
			if (e.getSource() == NavigationView.this.getMniAssociationDef())
				connEtoC15(e);
			if (e.getSource() == NavigationView.this.getMniRoleDef())
				connEtoC23(e);
			if (e.getSource() == NavigationView.this.getMniMetaObjectFile())
				connEtoC24(e);
			if (e.getSource() == NavigationView.this.getMniUmlPackage())
				connEtoC25(e);
			if (e.getSource() == NavigationView.this.getMniSortbyName())
				connEtoC26(e);
			if (e.getSource() == NavigationView.this.getMniSortbyKindName())
				connEtoC27(e);
		};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == NavigationView.this.getTreNavigation())
				connEtoC30(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == NavigationView.this.getTreNavigation())
				connEtoC1(e);
		};
		public void valueChanged(javax.swing.event.TreeSelectionEvent e) {
			if (e.getSource() == NavigationView.this.getTreNavigation())
				connEtoC8(e);
		};
	};
/**
 * NavTree constructor comment.
 */
public NavigationView() {
	super();
	initialize();
}
/**
 * Factory method to create a popup menu which allows to add attributes and methods.
 *
 * @return popup menu
 * @see showSpecification()
 */
public javax.swing.JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	Element treeNode = getSelectedNode();
	boolean selected = (treeNode != null);

	// treat "Main-Menu"
	getMniOpenSpecification().setEnabled(selected
            && (!(treeNode instanceof ch.ehi.umleditor.umlpresentation.Diagram))
            && NavigationTreeNodeUtility.hasSpecification(treeNode));
	getMniOpen().setEnabled(selected && NavigationTreeNodeUtility.isClassDiagram(treeNode));
	getMniPrint().setEnabled(selected && NavigationTreeNodeUtility.isClassDiagram(treeNode));
	getMniRemove().setEnabled(selected && NavigationTreeNodeUtility.isNodeRemovable(treeNode));
	getMniRename().setEnabled(selected && NavigationTreeNodeUtility.isNodeEditable(treeNode));
	getMniAddToDiagram().setEnabled(selected && (LauncherView.getInstance().getCurrentClassDiagram() != null) && LauncherView.getInstance().getCurrentClassDiagram().isAddable(treeNode));

	// build "New-Menu" dynamically
	getMnuNew().setEnabled(false);
	getMnuNew().removeAll();
Tracer.getInstance().patch(this, "adaptPopupMenu()", "setFont of Submenu <Neu>");//$NON-NLS-2$//$NON-NLS-1$
getMnuNew().setFont(getMniOpen().getFont());
getMnuSort().setFont(getMniOpen().getFont());
	if (modelAdapter != null) {
		if (modelAdapter.getOrdering().equals(NavigationTreeModel.SORT_BY_NAME)) {
			getMniSortbyName().setSelected(true);
		} else {
			getMniSortbyKindName().setSelected(modelAdapter.getOrdering().equals(NavigationTreeModel.SORT_BY_KIND_NAME));
		}
	} else {
		getMniSortbyName().setSelected(false);
		getMniSortbyKindName().setSelected(false);
	}
	if (selected) {
		if (ch.ehi.umleditor.umldrawingtools.ClassDiagramView.allowsPackages(treeNode) ||
				ch.ehi.umleditor.umldrawingtools.ClassDiagramView.allowsClasses(treeNode)) {
			addMenuItem(getMniClassDiagram());	// ClassDiagram's may be added to any package
			addMenuItem(getMniUmlPackage());	// UmlPackage's may be added to any package
			getMnuNew().add(new javax.swing.JSeparator());
		}

		// setup NEW submenu
		if (isInsideUmlModel(treeNode)) {
			addMenuItem(getMniInterlis2Def());
			addMenuItem(getMniMetaObjectFile());
/*			addMenuItem(getMniIli2ModelSet());
		} else if (userObject.isIli2ModelSet()) {
			addMenuItem(getMniInterlis2Def());
*/
		} else if (isInsideInterlis2Def(treeNode)) {
			addMenuItem(getMniModelDef());
		} else if (isInsideModelDef(treeNode)) {
			addMenuItem(getMniAssociationDef());
			addMenuItem(getMniClassDef());
			addMenuItem(getMniDomainDef());
			addMenuItem(getMniFunctionDef());
			addMenuItem(getMniGraphicParameterDef());
			addMenuItem(getMniLineFormTypeDef());
			addMenuItem(getMniMetaDataUseDef());
			addMenuItem(getMniTopicDef());
			addMenuItem(getMniUnitDef());
		} else if (isInsideTopicDef(treeNode)) {
			addMenuItem(getMniAssociationDef());
			addMenuItem(getMniClassDef());
			addMenuItem(getMniDomainDef());
			addMenuItem(getMniGraphicDef());
			addMenuItem(getMniLineFormTypeDef());
			addMenuItem(getMniMetaDataUseDef());
			addMenuItem(getMniUnitDef());
			addMenuItem(getMniViewDef());
			// only ili2.1 addMenuItem(getMniViewProjectionDef());
		} else if (NavigationTreeNodeUtility.isAssociationDef(treeNode)) {
			addMenuItem(getMniAttributeDef());
			addMenuItem(getMniRoleDef());
		} else if (NavigationTreeNodeUtility.isClassDef(treeNode)) {
			addMenuItem(getMniAttributeDef());
		} // else Leaf-Item selected -> no more submenus

		getMnuNew().setEnabled(getMnuNew().getItemCount() > 0);
	}
        mniMoveElement.setEnabled(selected);
	return popupMenu;
}
/**
 * Add ModelElement to UML-Model.
 */
private void addElement(java.lang.Class aClass) {
	try {
		ElementFactory.createOwnedElement(aClass, getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add a MenuItem dynamically.
 */
private void addMenuItem(javax.swing.JMenuItem item) {
	getMnuNew().add(item);
	item.setVisible(true);
}
/**
 * connEtoC1:  (TreNavigation.mouse.mouseReleased(java.awt.event.MouseEvent) --> NavigationView.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnpTreeActions());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC10:  (MniMetaDataUseDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.mniMetaDataUseDef_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC10(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newMetaDataUseDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC11:  (MniUnitDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newUnitDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC11(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newUnitDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC12:  (MniFunctionDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newFunctionDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC12(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newFunctionDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC13:  (MniLineFormTypeDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newLineFormTypeDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC13(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newLineFormTypeDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC14:  (MniGraphicParameterDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newGraphicParameterDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC14(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newGraphicParameterDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC15:  (MniPatternDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newPatternDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC15(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newAssociationDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC16:  (MniTopicDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.mniTopicDef_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC16(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newTopicDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC17:  (MniClassDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.mniClassDef_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC17(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newClassDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC18:  (MniAttributeDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newAttributeDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC18(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newAttributeDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC19:  (MniAddToDiagram.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.mniAddToDiagram()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC19(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniAddToDiagram();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (MniOpenSpecification.action.actionPerformed(java.awt.event.ActionEvent) --> NavTree.openSpecification()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.showSpecification();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC20:  (MniViewDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newViewDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC20(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newViewDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC21:  (MniViewProjectionDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newViewProjectionDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC21(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newViewProjectionDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC22:  (MniGraphicDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newGraphicDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC22(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newGraphicDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC23:  (MniRoleDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newRoleDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC23(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newRoleDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC24:  (MniMetaObjectFile.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newMetaObjectFile()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC24(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newMetaObjectFile();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC25:  (MniUmlPackage.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newUmlPackage()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC25(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newUmlPackage();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC26:  (MniSortbyName.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.sortByName()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC26(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.sortByName();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC27:  (MniSortbyKindName.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.sortByKindName()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC27(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.sortByKindName();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC28:  (MniOpen.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.mniOpen()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC28(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniOpen();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC29:  (MniPrint.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.mniPrint()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC29(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniPrint();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (MniRemoveNode.action.actionPerformed(java.awt.event.ActionEvent) --> NavTree.removeNode()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.removeInModel();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC30:  (TreNavigation.mouse.mousePressed(java.awt.event.MouseEvent) --> NavigationView.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC30(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnpTreeActions());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (MniRename.action.actionPerformed(java.awt.event.ActionEvent) --> NavTree.renameNode()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.renameNode();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (MniNewUmlModell.action.actionPerformed(java.awt.event.ActionEvent) --> NavTree.newUmlModell()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newClassDiagram();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (MniNewInterlisFile.action.actionPerformed(java.awt.event.ActionEvent) --> NavTree.newInterlisFile()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newInterlis2Def();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (MniNewInterlisModel.action.actionPerformed(java.awt.event.ActionEvent) --> NavTree.newInterlisModel()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC7(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newModelDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC8:  (TreNavigation.treeSelection.valueChanged(javax.swing.event.TreeSelectionEvent) --> NavigationView.selectionChanged(Ljavax.swing.event.TreeSelectionEvent;)V)
 * @param arg1 javax.swing.event.TreeSelectionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(javax.swing.event.TreeSelectionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.selectionChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC9:  (MniIliDomainDef.action.actionPerformed(java.awt.event.ActionEvent) --> NavigationView.newDomainDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC9(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.newDomainDef();
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
 * Return the JSeparator6 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator6() {
	if (ivjJSeparator6 == null) {
		try {
			ivjJSeparator6 = new javax.swing.JSeparator();
			ivjJSeparator6.setName("JSeparator6");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator6;
}
/**
 * Return the JSeparator7 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator7() {
	if (ivjJSeparator7 == null) {
		try {
			ivjJSeparator7 = new javax.swing.JSeparator();
			ivjJSeparator7.setName("JSeparator7");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator7;
}
/**
 * Return the MniAddToDiagram property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniAddToDiagram() {
	if (ivjMniAddToDiagram == null) {
		try {
			ivjMniAddToDiagram = new javax.swing.JMenuItem();
			ivjMniAddToDiagram.setName("MniAddToDiagram");
			ivjMniAddToDiagram.setToolTipText("Fügt Selektierten Knoten im aktuellen Diagram ein");
			ivjMniAddToDiagram.setText("Einfügen in Diagram");
			// user code begin {1}
			ivjMniAddToDiagram.setToolTipText(getResourceString("MniAddToDiagram_toolTipText"));
			ivjMniAddToDiagram.setText(getResourceString("MniAddToDiagram_text"));
			
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniAddToDiagram;
}
/**
 * Return the JMenuItem6 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniAssociationDef() {
	if (ivjMniAssociationDef == null) {
		try {
			ivjMniAssociationDef = new javax.swing.JMenuItem();
			ivjMniAssociationDef.setName("MniAssociationDef");
			ivjMniAssociationDef.setText("Beziehung");
			ivjMniAssociationDef.setEnabled(true);
			// user code begin {1}
			ivjMniAssociationDef.setText(getResourceString("MniAssociationDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniAssociationDef;
}
/**
 * Return the MniAttributeDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniAttributeDef() {
	if (ivjMniAttributeDef == null) {
		try {
			ivjMniAttributeDef = new javax.swing.JMenuItem();
			ivjMniAttributeDef.setName("MniAttributeDef");
			ivjMniAttributeDef.setToolTipText("Attribut");
			ivjMniAttributeDef.setText("AttributeDef");
			// user code begin {1}
			ivjMniAttributeDef.setToolTipText(getResourceString("MniAttributeDef_toolTipText"));
			ivjMniAttributeDef.setText(getResourceString("MniAttributeDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniAttributeDef;
}
/**
 * Return the JMenuItem1 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniClassDef() {
	if (ivjMniClassDef == null) {
		try {
			ivjMniClassDef = new javax.swing.JMenuItem();
			ivjMniClassDef.setName("MniClassDef");
			ivjMniClassDef.setToolTipText("Klasse");
			ivjMniClassDef.setText("ClassDef");
			ivjMniClassDef.setEnabled(true);
			// user code begin {1}
			ivjMniClassDef.setToolTipText(getResourceString("MniClassDef_toolTipText"));
			ivjMniClassDef.setText(getResourceString("MniClassDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniClassDef;
}
/**
 * Return the MniNewUmlModell property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniClassDiagram() {
	if (ivjMniClassDiagram == null) {
		try {
			ivjMniClassDiagram = new javax.swing.JMenuItem();
			ivjMniClassDiagram.setName("MniClassDiagram");
			ivjMniClassDiagram.setText("Klassendiagramm");
			// user code begin {1}
			ivjMniClassDiagram.setText(getResourceString("MniClassDiagram_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniClassDiagram;
}
/**
 * Return the MniIliDomainDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniDomainDef() {
	if (ivjMniDomainDef == null) {
		try {
			ivjMniDomainDef = new javax.swing.JMenuItem();
			ivjMniDomainDef.setName("MniDomainDef");
			ivjMniDomainDef.setText("DomainDef");
			// user code begin {1}
			ivjMniDomainDef.setText(getResourceString("MniDomainDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniDomainDef;
}
/**
 * Return the JMenuItem3 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniFunctionDef() {
	if (ivjMniFunctionDef == null) {
		try {
			ivjMniFunctionDef = new javax.swing.JMenuItem();
			ivjMniFunctionDef.setName("MniFunctionDef");
			ivjMniFunctionDef.setToolTipText("Funktion");
			ivjMniFunctionDef.setText("FunctionDef");
			ivjMniFunctionDef.setEnabled(true);
			// user code begin {1}
			ivjMniFunctionDef.setToolTipText(getResourceString("MniFunctionDef_toolTipText"));
			ivjMniFunctionDef.setText(getResourceString("MniFunctionDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniFunctionDef;
}
/**
 * Return the JMenuItem13 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniGraphicDef() {
	if (ivjMniGraphicDef == null) {
		try {
			ivjMniGraphicDef = new javax.swing.JMenuItem();
			ivjMniGraphicDef.setName("MniGraphicDef");
			ivjMniGraphicDef.setText("GraphicDef");
			ivjMniGraphicDef.setEnabled(true);
			// user code begin {1}
			ivjMniGraphicDef.setText(getResourceString("MniGraphicDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniGraphicDef;
}
/**
 * Return the JMenuItem5 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniGraphicParameterDef() {
	if (ivjMniGraphicParameterDef == null) {
		try {
			ivjMniGraphicParameterDef = new javax.swing.JMenuItem();
			ivjMniGraphicParameterDef.setName("MniGraphicParameterDef");
			ivjMniGraphicParameterDef.setText("GraphicParameterDef");
			ivjMniGraphicParameterDef.setEnabled(true);
			// user code begin {1}
			ivjMniGraphicParameterDef.setText(getResourceString("MniGraphicParameterDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniGraphicParameterDef;
}
/**
 * Return the MniNewInterlisFile property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniInterlis2Def() {
	if (ivjMniInterlis2Def == null) {
		try {
			ivjMniInterlis2Def = new javax.swing.JMenuItem();
			ivjMniInterlis2Def.setName("MniInterlis2Def");
			ivjMniInterlis2Def.setText("Interlis-Datei (Interlis2Def)");
			// user code begin {1}
			ivjMniInterlis2Def.setText(getResourceString("MniInterlis2Def_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniInterlis2Def;
}
/**
 * Return the JMenuItem4 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniLineFormTypeDef() {
	if (ivjMniLineFormTypeDef == null) {
		try {
			ivjMniLineFormTypeDef = new javax.swing.JMenuItem();
			ivjMniLineFormTypeDef.setName("MniLineFormTypeDef");
			ivjMniLineFormTypeDef.setText("LineFormTypeDef");
			ivjMniLineFormTypeDef.setEnabled(true);
			// user code begin {1}
			ivjMniLineFormTypeDef.setText(getResourceString("MniLineFormTypeDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniLineFormTypeDef;
}
/**
 * Return the MniMetaDataUseDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniMetaDataUseDef() {
	if (ivjMniMetaDataUseDef == null) {
		try {
			ivjMniMetaDataUseDef = new javax.swing.JMenuItem();
			ivjMniMetaDataUseDef.setName("MniMetaDataUseDef");
			ivjMniMetaDataUseDef.setText("MetaDataUseDef");
			ivjMniMetaDataUseDef.setEnabled(true);
			// user code begin {1}
			ivjMniMetaDataUseDef.setText(getResourceString("MniMetaDataUseDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniMetaDataUseDef;
}
/**
 * Return the MniMetaObjectFile property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniMetaObjectFile() {
	if (ivjMniMetaObjectFile == null) {
		try {
			ivjMniMetaObjectFile = new javax.swing.JMenuItem();
			ivjMniMetaObjectFile.setName("MniMetaObjectFile");
			ivjMniMetaObjectFile.setText("Metadatenbehälter-Datei");
			// user code begin {1}
			ivjMniMetaObjectFile.setText(getResourceString("MniMetaObjectFile_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniMetaObjectFile;
}
/**
 * Return the MniInterlisModel property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniModelDef() {
	if (ivjMniModelDef == null) {
		try {
			ivjMniModelDef = new javax.swing.JMenuItem();
			ivjMniModelDef.setName("MniModelDef");
			ivjMniModelDef.setText("Interlis-Modell (ModelDef)");
			// user code begin {1}
			ivjMniModelDef.setText(getResourceString("MniModelDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniModelDef;
}
/**
 * Return the MniOpen property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOpen() {
	if (ivjMniOpen == null) {
		try {
			ivjMniOpen = new javax.swing.JMenuItem();
			ivjMniOpen.setName("MniOpen");
			ivjMniOpen.setText("Öffnen");
			// user code begin {1}
			ivjMniOpen.setText(getResourceString("MniOpen_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOpen;
}
/**
 * Return the MniOpenSpecification property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOpenSpecification() {
	if (ivjMniOpenSpecification == null) {
		try {
			ivjMniOpenSpecification = new javax.swing.JMenuItem();
			ivjMniOpenSpecification.setName("MniOpenSpecification");
			ivjMniOpenSpecification.setText("Öffne Spezifikation...");
			// user code begin {1}
			ivjMniOpenSpecification.setText(getResourceString("MniOpenSpecification_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOpenSpecification;
}
/**
 * Return the MniPrint property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniPrint() {
	if (ivjMniPrint == null) {
		try {
			ivjMniPrint = new javax.swing.JMenuItem();
			ivjMniPrint.setName("MniPrint");
			ivjMniPrint.setText("Drucken...");
			ivjMniPrint.setEnabled(true);
			// user code begin {1}
			ivjMniPrint.setText(CommonUserAccess.getMniFilePrintWindowText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniPrint;
}
/**
 * Return the MniRemoveNode property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRemove() {
	if (ivjMniRemove == null) {
		try {
			ivjMniRemove = new javax.swing.JMenuItem();
			ivjMniRemove.setName("MniRemove");
			ivjMniRemove.setText("Löschen (im Modell)");
			// user code begin {1}
			ivjMniRemove.setText(getResourceString("MniRemove_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRemove;
}
/**
 * Return the MniRename property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRename() {
	if (ivjMniRename == null) {
		try {
			ivjMniRename = new javax.swing.JMenuItem();
			ivjMniRename.setName("MniRename");
			ivjMniRename.setText("Umbenennen");
			ivjMniRename.setEnabled(true);
			// user code begin {1}
			ivjMniRename.setText(CommonUserAccess.getMniEditRenameText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRename;
}
/**
 * Return the MniRoleDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRoleDef() {
	if (ivjMniRoleDef == null) {
		try {
			ivjMniRoleDef = new javax.swing.JMenuItem();
			ivjMniRoleDef.setName("MniRoleDef");
			ivjMniRoleDef.setToolTipText("Rolle eines Beziehungsendes");
			ivjMniRoleDef.setText("Rolle");
			// user code begin {1}
			ivjMniRoleDef.setToolTipText(getResourceString("MniRoleDef_toolTipText"));
			ivjMniRoleDef.setText(getResourceString("MniRoleDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRoleDef;
}
/**
 * Return the MniSortbyKindName property value.
 * @return javax.swing.JRadioButtonMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButtonMenuItem getMniSortbyKindName() {
	if (ivjMniSortbyKindName == null) {
		try {
			ivjMniSortbyKindName = new javax.swing.JRadioButtonMenuItem();
			ivjMniSortbyKindName.setName("MniSortbyKindName");
			ivjMniSortbyKindName.setText("Nach Art/Name");
			// user code begin {1}
			ivjMniSortbyKindName.setText(getResourceString("MniSortByKindName_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniSortbyKindName;
}
/**
 * Return the MniSortbyName property value.
 * @return javax.swing.JRadioButtonMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButtonMenuItem getMniSortbyName() {
	if (ivjMniSortbyName == null) {
		try {
			ivjMniSortbyName = new javax.swing.JRadioButtonMenuItem();
			ivjMniSortbyName.setName("MniSortbyName");
			ivjMniSortbyName.setSelected(false);
			ivjMniSortbyName.setText("Nach Name");
			// user code begin {1}
			ivjMniSortbyName.setText(getResourceString("MniSortByName_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniSortbyName;
}
/**
 * Return the JMenuItem7 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniTopicDef() {
	if (ivjMniTopicDef == null) {
		try {
			ivjMniTopicDef = new javax.swing.JMenuItem();
			ivjMniTopicDef.setName("MniTopicDef");
			ivjMniTopicDef.setText("TopicDef");
			// user code begin {1}
			ivjMniTopicDef.setText(getResourceString("MniTopicDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniTopicDef;
}
/**
 * Return the MniUmlPackage property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniUmlPackage() {
	if (ivjMniUmlPackage == null) {
		try {
			ivjMniUmlPackage = new javax.swing.JMenuItem();
			ivjMniUmlPackage.setName("MniUmlPackage");
			ivjMniUmlPackage.setText("UmlPackage");
			// user code begin {1}
			ivjMniUmlPackage.setText(getResourceString("MniUmlPackage_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniUmlPackage;
}
/**
 * Return the JMenuItem2 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniUnitDef() {
	if (ivjMniUnitDef == null) {
		try {
			ivjMniUnitDef = new javax.swing.JMenuItem();
			ivjMniUnitDef.setName("MniUnitDef");
			ivjMniUnitDef.setText("UnitDef");
			ivjMniUnitDef.setEnabled(true);
			// user code begin {1}
			ivjMniUnitDef.setText(getResourceString("MniUnitDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniUnitDef;
}
/**
 * Return the JMenuItem11 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniViewDef() {
	if (ivjMniViewDef == null) {
		try {
			ivjMniViewDef = new javax.swing.JMenuItem();
			ivjMniViewDef.setName("MniViewDef");
			ivjMniViewDef.setText("ViewDef");
			ivjMniViewDef.setEnabled(true);
			// user code begin {1}
			ivjMniViewDef.setText(getResourceString("MniViewDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniViewDef;
}
/**
 * Return the JMenuItem12 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniViewProjectionDef() {
	if (ivjMniViewProjectionDef == null) {
		try {
			ivjMniViewProjectionDef = new javax.swing.JMenuItem();
			ivjMniViewProjectionDef.setName("MniViewProjectionDef");
			ivjMniViewProjectionDef.setText("ViewProjectionDef");
			ivjMniViewProjectionDef.setEnabled(true);
			// user code begin {1}
			ivjMniViewProjectionDef.setText(getResourceString("MniViewProjectionDef_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniViewProjectionDef;
}
/**
 * Return the MnpTreeActions property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnpTreeActions() {
	if (ivjMnpTreeActions == null) {
		try {
			ivjMnpTreeActions = new javax.swing.JPopupMenu();
			ivjMnpTreeActions.setName("MnpTreeActions");
			ivjMnpTreeActions.add(getMnuNew());
			ivjMnpTreeActions.add(getMniOpenSpecification());
			ivjMnpTreeActions.add(getMniOpen());
			ivjMnpTreeActions.add(getJSeparator6());
			ivjMnpTreeActions.add(getMnuSort());
			ivjMnpTreeActions.add(getMniPrint());
			ivjMnpTreeActions.add(getJSeparator7());
			ivjMnpTreeActions.add(getMniRemove());
			ivjMnpTreeActions.add(getMniRename());
			ivjMnpTreeActions.add(getJSeparator1());
			ivjMnpTreeActions.add(getMniAddToDiagram());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnpTreeActions;
}
/**
 * Return the MnuNewUmlDiagrams property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuNew() {
	if (ivjMnuNew == null) {
		try {
			ivjMnuNew = new javax.swing.JMenu();
			ivjMnuNew.setName("MnuNew");
			ivjMnuNew.setText("Neu");
			ivjMnuNew.add(getMniMetaObjectFile());
			ivjMnuNew.add(getMniClassDiagram());
			ivjMnuNew.add(getMniUmlPackage());
			ivjMnuNew.add(getMniInterlis2Def());
			ivjMnuNew.add(getMniModelDef());
			ivjMnuNew.add(getMniMetaDataUseDef());
			ivjMnuNew.add(getMniUnitDef());
			ivjMnuNew.add(getMniFunctionDef());
			ivjMnuNew.add(getMniLineFormTypeDef());
			ivjMnuNew.add(getMniDomainDef());
			ivjMnuNew.add(getMniGraphicParameterDef());
			ivjMnuNew.add(getMniTopicDef());
			ivjMnuNew.add(getMniViewDef());
			ivjMnuNew.add(getMniViewProjectionDef());
			ivjMnuNew.add(getMniGraphicDef());
			ivjMnuNew.add(getMniClassDef());
			ivjMnuNew.add(getMniAssociationDef());
			ivjMnuNew.add(getMniAttributeDef());
			ivjMnuNew.add(getMniRoleDef());
			// user code begin {1}
			ivjMnuNew.setText(CommonUserAccess.getMniFileNewText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuNew;
}
/**
 * Return the MnuSort property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuSort() {
	if (ivjMnuSort == null) {
		try {
			ivjMnuSort = new javax.swing.JMenu();
			ivjMnuSort.setName("MnuSort");
			ivjMnuSort.setText("Sortieren");
			ivjMnuSort.add(getMniSortbyName());
			ivjMnuSort.add(getMniSortbyKindName());
			// user code begin {1}
			ivjMnuSort.setText(getResourceString("MnuSort_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuSort;
}
/**
 * Return the ModelElement represented by this Interface.
 * @return ModelElement
 * @see ModelElementUI
 */
public final ch.ehi.uml1_4.foundation.core.ModelElement getModelElement() {
	throw new DeveloperException(this, "getModelElement()", "not of interest here");//$NON-NLS-2$//$NON-NLS-1$
}
/**
 * Return the ScpNavigation property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpNavigation() {
	if (ivjScpNavigation == null) {
		try {
			ivjScpNavigation = new javax.swing.JScrollPane();
			ivjScpNavigation.setName("ScpNavigation");
			getScpNavigation().setViewportView(getTreNavigation());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpNavigation;
}
/**
 * Returns the TreeNode instance that is selected in the tree.
 * If nothing is selected, null is returned.
 */
private Element getSelectedNode() {
	TreePath selPath = getTreNavigation().getSelectionPath();

	if (selPath != null) {
		return (Element)selPath.getLastPathComponent();
	}
	return null;
}
/**
 * Return the TreNavigation property value.
 * @return javax.swing.JTree
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTree getTreNavigation() {
	if (ivjTreNavigation == null) {
		try {
			ivjTreNavigation = new AutoScrollingJTree();
			ivjTreNavigation.setName("TreNavigation");
			ivjTreNavigation.setVisibleRowCount(50);
			ivjTreNavigation.setBounds(0, 0, 78, 72);
			ivjTreNavigation.setEditable(true);
			ivjTreNavigation.setInvokesStopCellEditing(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTreNavigation;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	LauncherView.getInstance().handleException(exception);
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getMniOpenSpecification().addActionListener(ivjEventHandler);
	getMniRemove().addActionListener(ivjEventHandler);
	getMniRename().addActionListener(ivjEventHandler);
	getMniClassDiagram().addActionListener(ivjEventHandler);
	getMniInterlis2Def().addActionListener(ivjEventHandler);
	getMniModelDef().addActionListener(ivjEventHandler);
	getMniMetaDataUseDef().addActionListener(ivjEventHandler);
	getMniTopicDef().addActionListener(ivjEventHandler);
	getMniClassDef().addActionListener(ivjEventHandler);
	getMniDomainDef().addActionListener(ivjEventHandler);
	getMniUnitDef().addActionListener(ivjEventHandler);
	getMniFunctionDef().addActionListener(ivjEventHandler);
	getMniLineFormTypeDef().addActionListener(ivjEventHandler);
	getMniGraphicParameterDef().addActionListener(ivjEventHandler);
	getMniViewDef().addActionListener(ivjEventHandler);
	getMniViewProjectionDef().addActionListener(ivjEventHandler);
	getMniGraphicDef().addActionListener(ivjEventHandler);
	getMniOpen().addActionListener(ivjEventHandler);
	getMniPrint().addActionListener(ivjEventHandler);
	getMniAttributeDef().addActionListener(ivjEventHandler);
	getMniAddToDiagram().addActionListener(ivjEventHandler);
	getMniAssociationDef().addActionListener(ivjEventHandler);
	getMniRoleDef().addActionListener(ivjEventHandler);
	getMniMetaObjectFile().addActionListener(ivjEventHandler);
	getMniUmlPackage().addActionListener(ivjEventHandler);
	getMniSortbyName().addActionListener(ivjEventHandler);
	getMniSortbyKindName().addActionListener(ivjEventHandler);
	getTreNavigation().addTreeSelectionListener(ivjEventHandler);
	getTreNavigation().addMouseListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("NavTree");
		setPreferredSize(new java.awt.Dimension(200, 300));
		setLayout(new java.awt.BorderLayout());
		setSize(160, 120);
		add(getScpNavigation(), "Center");
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	javax.swing.ButtonGroup sortGroup = new javax.swing.ButtonGroup();
	sortGroup.add(getMniSortbyName());
	sortGroup.add(getMniSortbyKindName());
        mniMoveElement = new javax.swing.JMenuItem();
	mniMoveElement.setText(getResourceString("MniMoveElement_text"));
	mniMoveElement.addActionListener(new java.awt.event.ActionListener() {
	  // callback Handler if Button was pressed
	  public void actionPerformed(java.awt.event.ActionEvent e) {
		// !!! Function implementing any action at Pressing the button
		moveElement();
	  }
	});
        getMnpTreeActions().add(mniMoveElement);
	// user code end
}
/**
 * Initialize the JTree.
 * @see EditorTreeCellRenderer
 */
private void initializeTree() {
    // set Listener's
    /*
    MouseListener ml = new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            int selectedRow = getTreNavigation().getRowForLocation(e.getX(), e.getY());
            if (selectedRow != -1) {
	            TreePath selectedPath = getTreNavigation().getPathForLocation(e.getX(), e.getY());
	            MutableTreeNode selectedNode = (MutableTreeNode)selectedPath.getLastPathComponent();
	        	if (selectedNode != null) {
		            if (e.getClickCount() == 2) {
			            // HACK: this event comes twicely
			            doubleClickTreated = !doubleClickTreated;
			            if (!doubleClickTreated) {
		                    // doubleClick(selRow, selPath)
	                        NavigationTreeNode element = (NavigationTreeNode)selectedNode;
	                        if (element.hasSpecification()) {
	                            showSpecification();
	                        } else if (element.isClassDiagram()) {
								openDiagram(element.getElement());
	                        }
			            }
		            }
           		}
        	}
        }
    };
    getTreNavigation().addMouseListener(ml);
    */
    // Cell Rendering
    NavigationTreeCellRenderer renderer = new NavigationTreeCellRenderer();
    getTreNavigation().setCellRenderer(renderer);

    // Cell editing
    getTreNavigation().setCellEditor(new NavigationTreeCellEditor(getTreNavigation(), renderer));
//    getTreNavigation().getCellEditor().addCellEditorListener(this);
	getTreNavigation().setEditable(true);
	getTreNavigation().setInvokesStopCellEditing(true);

    // make tree ask for the height of each row
    getTreNavigation().setRowHeight(-1);
    getTreNavigation().setRootVisible(true);

    // set Single Row selection model
    DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
    selectionModel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
    getTreNavigation().setSelectionModel(selectionModel);

    // Enable tool tips for the tree
    javax.swing.ToolTipManager.sharedInstance().registerComponent(getTreNavigation());

    // show lines from Parent to leaf
    getTreNavigation().putClientProperty("JTree.lineStyle", "Angled");//$NON-NLS-2$//$NON-NLS-1$
    //ds = new TreeDragSource(getTreNavigation(), java.awt.dnd.DnDConstants.ACTION_MOVE);
    //dt = new TreeDropTarget(getTreNavigation());
}
   /**
    * Return whether TreeElement is a INTERLIS2Def (or a UmlPackage inside a
    * INTERLIS2Def)or not.
    */
   static public boolean isInsideInterlis2Def(Element node) {
         while(node instanceof ch.ehi.uml1_4.implementation.UmlPackage){
            node=((ch.ehi.uml1_4.implementation.UmlPackage)node).getNamespace();
         }
    return node instanceof ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
   }
   /**
    * Return whether TreeElement is a ModelDef (or a UmlPackage inside a
    * ModelDef)or not.
    */
   static public boolean isInsideModelDef(Element node) {
         while(node instanceof ch.ehi.uml1_4.implementation.UmlPackage){
          node=((ch.ehi.uml1_4.implementation.UmlPackage)node).getNamespace();
         }
    return node instanceof ch.ehi.interlis.modeltopicclass.ModelDef;
   }
   /**
    * Return whether TreeElement is a TopicDef (or a UmlPackage inside a
    * TopicDef) or not.
    */
   static public boolean isInsideTopicDef(Element node) {
         while(node instanceof ch.ehi.uml1_4.implementation.UmlPackage){
            node=((ch.ehi.uml1_4.implementation.UmlPackage)node).getNamespace();
         }
    return node instanceof ch.ehi.interlis.modeltopicclass.TopicDef;
   }
   /**
    * Return whether TreeElement is a UmlModel (or a UmlPackage inside a
    * UmlModel) or not.
    */
   static public boolean isInsideUmlModel(Object node) {
         while(node instanceof ch.ehi.uml1_4.implementation.UmlPackage){
            node=((ch.ehi.uml1_4.implementation.UmlPackage)node).getNamespace();
         }
    return node instanceof ch.ehi.uml1_4.implementation.UmlModel;
   }
/**
 * Add Selected node to current ClassDiagram.
 */
private void mniAddToDiagram() {
	LauncherView.getInstance().getCurrentClassDiagram().add(getSelectedNode());
}
/**
 * Open a class diagram.
 */
private void mniOpen() {
	openDiagram(getSelectedNode());
}
/**
 * Comment
 */
private void mniPrint() {
	LauncherView.getInstance().printClassDiagram(openDiagram(getSelectedNode()));
}
private void moveElement() {
	try {
          MoveElementDialog moveDialog = new MoveElementDialog(
                  LauncherView.getInstance(),"Select Target Package"
                  , true, LauncherView.getInstance().getModel());
          if (moveDialog.isSaved()) {
            ch.ehi.uml1_4.foundation.core.Namespace apackage=moveDialog.getSelectedPackage();
      		ModelElement ele=(ModelElement)getSelectedNode();
                ele.detachNamespace();
                ele.attachNamespace(apackage);
          }
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Comment
 */
private void newAssociationDef() {
	try {
		ElementFactory.createAssociationDef(getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newAttributeDef() {
	try {
		ElementFactory.createAttributeDef((AbstractClassDef)(getSelectedNode()));
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newClassDef() {
	try {
		ElementFactory.createClassDef(getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add a new ClassDiagram to Model and open it.
 */
private void newClassDiagram() {
	try {
		LauncherView.getInstance().createClassDiagram(ElementFactory.createDiagram(getSelectedNode()));
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newDomainDef() {
	try {
		ElementFactory.createDomainDef(getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newFunctionDef() {
	addElement(ch.ehi.interlis.functions.FunctionDef.class);
}
/**
 * Add ModelElement to UML-Model.
 */
private void newGraphicDef() {
	addElement(ch.ehi.interlis.graphicdescriptions.GraphicDef.class);
}
/**
 * Add ModelElement to UML-Model.
 */
private void newGraphicParameterDef() {
	addElement(ch.ehi.interlis.graphicdescriptions.GraphicParameterDef.class);
}
/**
 * Add ModelElement to UML-Model.
 */
private void newInterlis2Def() {
	try {
		ElementFactory.createINTERLIS2Def(getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newLineFormTypeDef() {
	addElement(ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef.class);
}
/**
 * Add ModelElement to UML-Model.
 */
private void newMetaDataUseDef() {
	try {
		ElementFactory.createMetaDataUseDef(getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newMetaObjectFile() {
	try {
		ElementFactory.createMetaObjectFile((ch.ehi.uml1_4.implementation.UmlModel)LauncherView.getInstance().getModel());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newModelDef() {
	try {
		ElementFactory.createModelDef(getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Comment
 */
private void newRoleDef() {
	try {
		ElementFactory.createRoleDef((Association)getSelectedNode(), null);
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newTopicDef() {
	try {
		ElementFactory.createTopicDef(getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add a UML-Package.
 */
private void newUmlPackage() {
	try {
		ElementFactory.createOwnedElement(ch.ehi.uml1_4.implementation.UmlPackage. class, getSelectedNode());
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Add ModelElement to UML-Model.
 */
private void newUnitDef() {
	addElement(ch.ehi.interlis.units.UnitDef.class);
}
/**
 * Add ModelElement to UML-Model.
 */
private void newViewDef() {
	addElement(ch.ehi.interlis.views.ViewDef.class);
}
/**
 * Add ModelElement to UML-Model.
 */
private void newViewProjectionDef() {
	addElement(ch.ehi.interlis.views.ViewProjectionDef.class);
}
/**
 * Open a class diagram.
 */
private ch.ehi.umleditor.umldrawingtools.ClassDiagramView openDiagram(Element diagram) {
	return LauncherView.getInstance().createClassDiagram(diagram);
}
/**
 * Remove the Element in Model.
 * @see metaModelChanged8..) for visual removement.
 */
public void removeInModel() {
	Element element = getSelectedNode();

	if (element != null) {
		ElementFactory.removeElement(element);
	}
}
/**
 * Not supported for this class.
 * @see ModelElementUI
 */
public final void removeVisually() {
	throw new DeveloperException(this, "removeVisually", "use removeInModel() or via ClassDiagram instead");	//$NON-NLS-2$//$NON-NLS-1$
}
/**
 * Switch selected Node into editing Mode.
 * @see EditorTreeModel#valueForPathChanged(TreePath, Object)
 */
private void renameNode() {
	getTreNavigation().startEditingAtPath(getTreNavigation().getSelectionPath());
}
/**
 * Select given Element in NavigationTree.
 * If necessary make path visible before.
 */
public void selectElement(Element element) {
	TreePath foundNode = modelAdapter.findElementDefinitionNode(element);

	if (foundNode == null) {
                // ce 20030301 was soll das machen? clearSelection()?
		getTreNavigation().setSelectionPath(null);
	} else {
//		getTreNavigation().expandPath(getTreNavigation().getSelectionPath());
//		getTreNavigation().makeVisible(path);
		getTreNavigation().setSelectionPath(foundNode);
                getTreNavigation().scrollPathToVisible(foundNode);
	}
}
/**
 * Adapt anything when Tree-Selection changes.
 */
private void selectionChanged(javax.swing.event.TreeSelectionEvent treeSelectionEvent) {
	Element treeNode = getSelectedNode();

	if (treeNode != null) {
	    // rename
	    getTreNavigation().setEditable(NavigationTreeNodeUtility.isNodeEditable(treeNode));
	}
	// Documentation (update at deselect as well!)
	LauncherView.getInstance().setDescription(treeNode);
}
/**
 * Build the visual Tree with a given UML-Model.
 * All Nodes have a userObject of type ElementMapper.
 * Hierarchy:
 * -> RootNode has a null ModelElement (though it shows the FileName of UmlModel)
 * 	-> LogicalView -> contains the real model-root => UmlModel
 *		-> Ili2ModelSet
 *		  -> ... (according to INTERLIS-Model)
 * @see ElementMapper#createElement(*)
 */
public synchronized void setModel(Namespace namespace) {
	try {
		if (modelAdapter!=null && ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().containsMetaModelListener(modelAdapter)) {
			// unregister Listener while building new model
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().removeMetaModelListener(modelAdapter);
		}

//		getTreNavigation().stopEditing();
//		getTreNavigation().clearSelection();

	 	// set Root-Node (contains no ModelElement, still shows filename kept in UmlModel)
//	    getTreNavigation().setModel(new DefaultTreeModel(new NavigationTreeNode()));
            modelAdapter=new NavigationTreeModel(namespace,false);
            modelAdapter.setOrdering(((UserSettings)LauncherView.getSettings()).getNavigationSort());
	    getTreNavigation().setModel(modelAdapter);

		initializeTree();

		// always show elements of LogicalView
		getTreNavigation().expandRow(1);

		// register Listener
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().addMetaModelListener(modelAdapter);
	} catch(Throwable e) {
		handleException(e);
	}
}
private void setOrdering(String ordering){
  if(!modelAdapter.getOrdering().equals(ordering)){
    modelAdapter.setOrdering(ordering);
    ((UserSettings)LauncherView.getSettings()).setNavigationSort(ordering);
    // get list of expanded
    java.util.Enumeration expi=getTreNavigation().getExpandedDescendants(
        modelAdapter.getTreePath((Element)modelAdapter.getRoot()));
    java.util.ArrayList expv=new java.util.ArrayList();
    while(expi.hasMoreElements()){
      expv.add(expi.nextElement());
    }
    // fire refresh of whole tree
    modelAdapter.refresh();
    // expanded nodes again
    java.util.Iterator i=expv.iterator();
    while(i.hasNext()){
      getTreNavigation().expandPath((TreePath)i.next());
    }
  }
}
/**
 * Show the Specification Dialog of the PresentationElement.
 * @author Peter Hirzel
 */
public void showSpecification() {
	Element treeNode = getSelectedNode();

	if (treeNode == null) {
		// show UmlModel Specification which is actually in LogicalView node but showed as root node
		LauncherView.getInstance().showSpecification(LauncherView.getInstance().getModel());
	} else if (!NavigationTreeNodeUtility.hasSpecification(treeNode)) {
		// generic case
		new CommonSpecificationDialog(LauncherView.getInstance(), treeNode);
	} else {
		if (!(treeNode instanceof ch.ehi.umleditor.umlpresentation.Diagram)) {
			// default case
			LauncherView.getInstance().showSpecification(treeNode);
		}
	}
}
/**
 * Comment
 */
private void sortByKindName() {
	getMniSortbyName().setSelected(false);
 	setOrdering(NavigationTreeModel.SORT_BY_KIND_NAME);
}
/**
 * Comment
 */
private void sortByName() {
	getMniSortbyKindName().setSelected(false);
 	setOrdering(NavigationTreeModel.SORT_BY_NAME);
}
}
