package ch.ehi.umleditor.umldrawingtools;

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
import CH.ifa.draw.util.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.umlpresentation.*;
import ch.softenvironment.view.CommonUserAccess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;
import CH.ifa.draw.figures.*;

/**
 * Delegate mouse selection to a specific TextTool if
 * the figure selected inside a CompositeFigure is a
 * TextFigure.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.11 $ $Date: 2008-04-08 09:58:25 $
 */
public class DelegationSelectionTool extends CustomSelectionTool implements java.awt.event.ActionListener {
	// TextTool which will be invoked at the top level container
//private static java.util.ResourceBundle resources = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/umldrawingtools/resources/DelegationSelectionTool");  //$NON-NLS-1$
	private JHotDrawTextTool textTool = null;

	private static final int NONE = 0;
	private static final int ADD_WAYPOINT = 1;
	private static final int MOVE_ENDPOINT = 2;
//	private static final int JOIN_SEGMENT = 3;
	private static final int MOVE_WAYPOINT = 4;
	private int dragCase = NONE;
	private int endPointIndex = -1;
	private int wayPointIndex = -1;
	private PresentationNode dragSourceNode = null;

	// adding WayPoints
	private int splitX = -1;
	private int splitY = -1;
	private int splitIndex = -1;
	private ConnectionFigure editedConnection = null;

	// NON-NLS commands
	private static String ROLES_ACTION_COMMAND = "DISPLAY_ROLES";//$NON-NLS-1$
	private static String CARDINALITY_ACTION_COMMAND = "DISPLAY_CARDINALITY";//$NON-NLS-1$
	private static String ASSOCIATION_NAME_ACTION_COMMAND = "DISPLAY_ASSOCIATION_NAME";//$NON-NLS-1$
	private static String ATTRIBUTES_ACTION_COMMAND = "DISPLAY_ATTRIBUTES";//$NON-NLS-1$
	private static String ATTRIBUTE_TYPES_ACTION_COMMAND = "DISPLAY_ATTRIBUTE_TYPES";//$NON-NLS-1$
	private static String ATTRIBUTE_CARDINALITY_ACTION_COMMAND = "DISPLAY_ATTRIBUTE_CARDINALITY";//$NON-NLS-1$
	private static String LINK_FIGURE_ACTION_COMMAND = "DISPLAY_LINK_FIGURE";//$NON-NLS-1$
	private static String OPERATION_ACTION_COMMAND = "DISPLAY_OPERATIONS";//$NON-NLS-1$
	private JCheckBoxMenuItem chxShowRole = null;
	private JCheckBoxMenuItem chxShowMultiplicity = null;
	private JCheckBoxMenuItem chxShowAssociationNames = null;
	private JCheckBoxMenuItem chxShowAttributes = null;
	private JCheckBoxMenuItem chxShowAttributeTypes = null;
	private JCheckBoxMenuItem chxShowAttributeCardinality = null;
	private JCheckBoxMenuItem chxShowLinkFigure = null;
	private JCheckBoxMenuItem chxShowOperations = null;
	private javax.swing.JMenu mnuFormat = null;
	
/**
 * Constructor.
 * @param editor
 */
public DelegationSelectionTool(DrawingEditor editor) {
	super(editor);
	textTool = new JHotDrawTextTool(editor, new TextFigure());

	chxShowRole = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowRole_text")); //$NON-NLS-1$
	chxShowRole.setActionCommand(ROLES_ACTION_COMMAND);
    chxShowRole.addActionListener(this);
    chxShowRole.setSelected(((ClassDiagramView)view()).isShowAllRoles());

    chxShowMultiplicity = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowMultiplicity_text")); //$NON-NLS-1$
	chxShowMultiplicity.setActionCommand(CARDINALITY_ACTION_COMMAND);
    chxShowMultiplicity.addActionListener(this);
    chxShowMultiplicity.setSelected(((ClassDiagramView)view()).isShowMultiplicities());

    chxShowAssociationNames = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowAssociationNames_text"));
	chxShowAssociationNames.setActionCommand(ASSOCIATION_NAME_ACTION_COMMAND);
    chxShowAssociationNames.addActionListener(this);
    chxShowAssociationNames.setSelected(((ClassDiagramView)view()).isShowAssociationNames());

    chxShowAttributes = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowAttributes_text"));
	chxShowAttributes.setActionCommand(ATTRIBUTES_ACTION_COMMAND);
    chxShowAttributes.addActionListener(this);
    chxShowAttributes.setSelected(((ClassDiagramView)view()).isShowAttributes());

    chxShowAttributeTypes = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowAttributeTypes_text"));
	chxShowAttributeTypes.setActionCommand(ATTRIBUTE_TYPES_ACTION_COMMAND);
    chxShowAttributeTypes.addActionListener(this);
    chxShowAttributeTypes.setSelected(((ClassDiagramView)view()).isShowAttributeTypes());

    chxShowAttributeCardinality = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowAttributeCardinality_text"));
	chxShowAttributeCardinality.setActionCommand(ATTRIBUTE_CARDINALITY_ACTION_COMMAND);
    chxShowAttributeCardinality.addActionListener(this);
    chxShowAttributeCardinality.setSelected(((ClassDiagramView)view()).isShowAttributeMultiplicity());

    chxShowLinkFigure = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowLinkFigure_text"));
	chxShowLinkFigure.setActionCommand(LINK_FIGURE_ACTION_COMMAND);
    chxShowLinkFigure.addActionListener(this);
    chxShowLinkFigure.setSelected(((ClassDiagramView)view()).isShowLinkFigure());

    chxShowOperations = new javax.swing.JCheckBoxMenuItem(NodeFigure.getResourceString(DelegationSelectionTool.class, "ChxShowOperations_text"));
    chxShowOperations.setActionCommand(OPERATION_ACTION_COMMAND);
    chxShowOperations.addActionListener(this);
    chxShowOperations.setSelected(true); //((ClassDiagramView)view()).isShowLinkFigure());
    
	mnuFormat = new javax.swing.JMenu();
	mnuFormat.setName("MnuFormat");
	mnuFormat.setText("Format");
	mnuFormat.setText(CommonUserAccess.getMnuFormatText());
		
	mnuFormat.add(new AbstractAction(CommonUserAccess.getMniWindowOrderAutomaticallyText()) { //$NON-NLS-1$
		public void actionPerformed(ActionEvent event) {
			mniLayoutDiagram();
		}
	});
	mnuFormat.add(new AbstractAction(ch.ehi.basics.i18n.ResourceBundle.getBundle(DelegationSelectionTool.class).getString("MenuLayoutRolesCardinalities")) { //$NON-NLS-1$
		public void actionPerformed(ActionEvent event) {
			mniLayoutRolesAndMultiplicities();
		}
	});
}
/**
 * Invoked when an action occurs.
 * @see #handlePopupMenu(..)
 */
public void actionPerformed(java.awt.event.ActionEvent e) {
	try {
		if (e.getActionCommand().equals(ROLES_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllRoles(chxShowRole.isSelected());
		} else if (e.getActionCommand().equals(CARDINALITY_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllMultiplicities(chxShowMultiplicity.isSelected());
		} else if (e.getActionCommand().equals(ASSOCIATION_NAME_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllAssociationNames(chxShowAssociationNames.isSelected());
		} else if (e.getActionCommand().equals(ATTRIBUTES_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllAttributes(chxShowAttributes.isSelected());
		} else if (e.getActionCommand().equals(ATTRIBUTE_TYPES_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllAttributeTypes(chxShowAttributeTypes.isSelected());
		} else if (e.getActionCommand().equals(ATTRIBUTE_CARDINALITY_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllAttributeMultiplicity(chxShowAttributeCardinality.isSelected());
		} else if (e.getActionCommand().equals(OPERATION_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllOperations(chxShowOperations.isSelected());
		} else if (e.getActionCommand().equals(LINK_FIGURE_ACTION_COMMAND)) {
			((ClassDiagramView)view()).showAllLinkFigures(chxShowLinkFigure.isSelected());
		}
	} catch(Throwable exception) {
		ch.softenvironment.util.Tracer.getInstance().runtimeError(e.toString(), exception);
		ch.ehi.umleditor.application.LauncherView.getInstance().handleException(exception);
	}
}
/**
 * Check whether given Point is in a minimal AreaRange of given coordinates.
 * @return boolean (true->is in range)
 */
private int checkDragCase(ConnectionFigure edgeFigure, int x, int y) {
	wayPointIndex = ((EdgeFigure)edgeFigure).getWayPointIndex(x, y);
	if (wayPointIndex > 0) {
		((EdgeFigure)edgeFigure).getClassDiagram().removeXorNote(((EdgeFigure)edgeFigure).getModelElement());
//TODO trigger PresentationRoleFigure#updateFigure() to draw XOR-Note		
		return MOVE_WAYPOINT;
	} else if ((edgeFigure instanceof PresentationRoleFigure) ||
				(edgeFigure instanceof GeneralizationLineConnection) ||
				(edgeFigure instanceof DependencyLineConnection) ||
				(edgeFigure instanceof NoteAnchorLineConnection)) {

		java.util.Iterator iterator = ((EdgeFigure)edgeFigure).getEdge().iteratorEndpoint();
		if (iterator.hasNext()) {
			dragSourceNode = (PresentationNode)iterator.next();
			if (((dragSourceNode instanceof ch.ehi.umleditor.umlpresentation.Class) ||
				(dragSourceNode instanceof ch.ehi.umleditor.umlpresentation.Package) ||
				(dragSourceNode instanceof Note)) &&
					isWithinRange(edgeFigure.startPoint(), x, y)) {

				// start Point of connection
				endPointIndex = 0;
				return MOVE_ENDPOINT;
			}
		} else {
			throw new ch.softenvironment.util.DeveloperException("start-Node should be set");
		}

		if (iterator.hasNext()) {
			dragSourceNode = (PresentationNode)iterator.next();
			if (((dragSourceNode instanceof ch.ehi.umleditor.umlpresentation.Class) ||
				(dragSourceNode instanceof ch.ehi.umleditor.umlpresentation.Package) ||
				(dragSourceNode instanceof Note)) &&
					isWithinRange(edgeFigure.endPoint(), x, y)) {

				// end Point of connection
				endPointIndex = 1; // wayPoints are kept in a separate ArrayList
				return MOVE_ENDPOINT;
			}
		} else {
			throw new ch.softenvironment.util.DeveloperException("end-Node should be set");
		}
	}

	splitIndex = -1;
	return ADD_WAYPOINT;
}
/**
 * Overwrites.
 */
protected Tool createDragTracker(Figure f) {
	if (f instanceof ModelElementUI) {
		ch.ehi.umleditor.application.LauncherView.getInstance().setDescription(((ModelElementUI)f).getModelElement());
	}

//	return super.createDragTracker(f);
//TODO Patch: using own DragTracker
	return new UndoableTool(new JHotDrawDragTracker(editor(), f));
}
	/**
	 * Terminates the editing of a text figure.
	 */
	public void deactivate() {
		super.deactivate();
		if (getTextTool().isActivated()) {
		    getTextTool().deactivate();
		}
	}
/**
 * Disconnect current node and connect new target.
 * @see ClassDiagramView#correctRoleRelocation(..)
 */
private void dragAssociation(Connector end, Figure targetFigure, int x, int y) {
	// 1) Presentation
//	((EdgeFigure)editedConnection).getEdge().setEndpoint(endPointIndex, ((NodeFigure)targetFigure).getNode());
	// 2) Model
	((ch.ehi.interlis.associations.RoleDef)((EdgeFigure)editedConnection).getModelElement()).changeParticipant((ch.ehi.uml1_4.foundation.core.Classifier)((NodeFigure)targetFigure).getModelElement());
	// 3) show visual reconnect
/*	if (endPointIndex == 0) {
		((EdgeFigure)editedConnection).setStartConnector(end);
	} else {
		// (endPointIndex == 1)
		((EdgeFigure)editedConnection).setEndConnector(end);
	}
*/
}
/**
 * Disconnect current node and connect new target.
 * @see ClassDiagramView#correctDependencyRelocation(..)
 */
private void dragDependency(Connector end, Figure targetFigure, int x, int y) {
	// 1) Presentation
//	((EdgeFigure)editedConnection).getEdge().setEndpoint(endPointIndex, ((NodeFigure)targetFigure).getNode());

	ch.ehi.uml1_4.foundation.core.Dependency dependency = (ch.ehi.uml1_4.foundation.core.Dependency)((EdgeFigure)editedConnection).getModelElement();
	if (endPointIndex == 0) {
		// 2) Model
		dependency.changeClient((ModelElement)dependency.iteratorClient().next(), (ch.ehi.uml1_4.foundation.core.GeneralizableElement)((NodeFigure)targetFigure).getModelElement());
		// 3) show visual reconnect
//		((EdgeFigure)editedConnection).setStartConnector(end);
	} else /* (endPointIndex == 1) */ {
		// 2) Model
		dependency.changeSupplier((ModelElement)dependency.iteratorSupplier().next(), 
                (ModelElement)((NodeFigure)targetFigure).getModelElement());
		// 3) show visual reconnect
//		((EdgeFigure)editedConnection).setEndConnector(end);
	}
}
/**
 * Disconnect current node and connect new target.
 * @see ClassDiagramView#correctGeneralizationRelocation(..)
 */
private void dragGeneralization(Connector end, Figure targetFigure, int x, int y) {
	// 1) Presentation
//	((EdgeFigure)editedConnection).getEdge().setEndpoint(endPointIndex, ((NodeFigure)targetFigure).getNode());

	ch.ehi.uml1_4.foundation.core.Generalization generalization = (ch.ehi.uml1_4.foundation.core.Generalization)((EdgeFigure)editedConnection).getModelElement();
	if (endPointIndex == 0) {
		// 2) Model
		generalization.changeChild((ch.ehi.uml1_4.foundation.core.GeneralizableElement)((NodeFigure)targetFigure).getModelElement());
		// 3) show visual reconnect
//		((EdgeFigure)editedConnection).setStartConnector(end);
	} else /* (endPointIndex == 1) */ {
		// 2) Model
		generalization.changeParent((ch.ehi.uml1_4.foundation.core.GeneralizableElement)((NodeFigure)targetFigure).getModelElement());
		// 3) show visual reconnect
//		((EdgeFigure)editedConnection).setEndConnector(end);
	}
}
/**
 * Disconnect current node and connect new target.
 * This kind of line is not duplicated on other Diagrams,
 * therefore a visual relocation is provoqued here instead of
 * doing it within a ClassDiagrammView.
 */
private void dragNoteAnchor(Connector end, Figure targetFigure, int x, int y) {
	if (endPointIndex == 0) {
		if (targetFigure instanceof NoteFigure) {
			// startFigure must be NoteFigure
			// 1) Presentation
			((EdgeFigure)editedConnection).getEdge().setEndpoint(endPointIndex, ((NodeFigure)targetFigure).getNode());
			// 2) Model	-> no model mappings to change
			// 3) show visual reconnect
			((EdgeFigure)editedConnection).willChange();
			((EdgeFigure)editedConnection).setStartConnector(end);
			((EdgeFigure)editedConnection).changed();
		} else {
			ch.softenvironment.view.BaseDialog.showWarning((java.awt.Component)ch.ehi.umleditor.application.LauncherView.getInstance(), NodeFigure.getResourceString(DelegationSelectionTool.class, "CTModellingError"), NodeFigure.getResourceString(DelegationSelectionTool.class, "CENoteToNoteError"));
		}
	} else {
		// 1) Presentation
		((EdgeFigure)editedConnection).getEdge().setEndpoint(endPointIndex, ((NodeFigure)targetFigure).getNode());
		// 2) Model	-> no model mappings to change
		// 3) show visual reconnect
		((EdgeFigure)editedConnection).willChange();
		((EdgeFigure)editedConnection).setEndConnector(end);
		((EdgeFigure)editedConnection).changed();
	}
}
/**
 * Return the text tool to which double clicks are delegated. The text tool is shared by
 * all figures upon which this selection tool operates.
 *
 * @return delegate text tool
 */
private JHotDrawTextTool getTextTool() {
   return textTool;
}
/**
 * Overwrites.
 */
protected void handleMouseClick(MouseEvent e, int x, int y) {
	deactivate();
}
/**
 * Overwrites.
 * Allow renaming of composite TextFigure-Contents.
 */
protected void handleMouseDoubleClick(MouseEvent e, int x, int y) {
	int splitX = e.getX();
	int splitY = e.getY();
	editedConnection = ((ClassDiagramView)view()).findConnection(splitX, splitY);
	if (editedConnection != null) {
		wayPointIndex = ((EdgeFigure)editedConnection).getWayPointIndex(x, y);
		if (wayPointIndex > 0) {
			// make sure same WAY_POINT_DIAMETER is checked for dragging and deleting
//			editedConnection.joinSegments(splitX, splitY);
			((EdgeFigure)editedConnection).removePointAt(wayPointIndex);
		}
	} else {
		Figure figure = drawing().findFigureInside(e.getX(), e.getY());
		if ((figure != null) && (figure instanceof TextFigure)) {
			getTextTool().activate();
			getTextTool().mouseDown(e, x, y);
		}
	}
}
/**
 * Overwrites.
 * @see ConnectionTool#mouseDown(..)
 */
protected void handleMouseDown(MouseEvent e, int x, int y) {
	try {
		dragCase = NONE;

		if (view() instanceof ClassDiagramView) {
			splitX = e.getX();
			splitY = e.getY();
			editedConnection = ((ClassDiagramView)view()).findConnection(splitX, splitY);
//			LinkFigure linkFigure = ((ClassDiagramView)view()).fin
			if ((editedConnection != null) //&&
//					(editedConnection.getStartConnector() != null) && (editedConnection.getEndConnector() != null)) /* experienced while dragging edges near a LinkFigure */ {
			){
				// only spliting is possible, new Connections must be done by appropriate tools
				dragCase = checkDragCase(editedConnection, splitX, splitY);
//ch.softenvironment.util.Tracer.getInstance().debug("DragCase = " + dragCase);
			}
			
			// update DocumentationPanel in Launcher if Diagram was selected
			Figure figure = drawing().findFigure(e.getX(), e.getY());
			if ((figure == null) && (!e.isShiftDown())) {
				LauncherView.getInstance().setDescription(((ClassDiagramView)view()).getDiagram());
			}
		}
	} catch (Throwable exception) {
		ch.softenvironment.view.BaseDialog.showError(ch.ehi.umleditor.application.LauncherView.getInstance(), null, exception.getMessage(), exception);//$NON-NLS-1$
	}
}
/**
 * Overwrites.
 * Show either Popup for Figure at given position otherwise for current Diagram.
 */
protected void handlePopupMenu(MouseEvent e, int x, int y) {
	Figure figure = drawing().findFigure(e.getX(), e.getY());
	if (figure != null) {
		// show Figure's popup menu
		super.handlePopupMenu(e, x, y);
	} else {
		// show Diagram's popupmenu
		javax.swing.JPopupMenu menu = new javax.swing.JPopupMenu();

	    menu.add(chxShowRole);
		menu.add(chxShowMultiplicity);
		menu.add(chxShowAssociationNames);
		menu.add(chxShowAttributes);
		menu.add(chxShowAttributeTypes);
		menu.add(chxShowAttributeCardinality);
		menu.add(chxShowLinkFigure);
		menu.add(chxShowOperations);

		menu.add(new JSeparator());

		menu.add(new AbstractAction(CommonUserAccess.getMniFilePrintWindowText()) { //$NON-NLS-1$
			public void actionPerformed(ActionEvent event) {
				mniPrintDiagram();
			}
		});

		menu.add(new AbstractAction(NodeFigure.getResourceString(DelegationSelectionTool.class, "MenuSaveDiagram")) { //$NON-NLS-1$
			public void actionPerformed(ActionEvent event) {
				mniSaveDiagram();
			}
		});

		menu.add(mnuFormat);

                double scale=((ClassDiagramView)view()).getScale();
		menu.show(e.getComponent(), (int)(e.getX()*scale), (int)(e.getY()*scale));
	}
}
/**
 * Check whether given Point is in a minimal AreaRange of given coordinates.
 * @return boolean (true->is in range)
 */
private boolean isWithinRange(Point p, int x, int y) {
	int sensitiveSquareLength = ch.ehi.umleditor.application.LauncherView.getSettings().getConnectorZone().intValue();
	return ((java.lang.Math.abs(p.x - x) < sensitiveSquareLength) && (Math.abs(p.y - y) < sensitiveSquareLength));
}
/**
 * Layout the Figures in Diagram automatically.
 * ClassDiagramView popupMenu-Function.
 */
private void mniFindModel() {
//TODO
	ch.ehi.umleditor.application.LauncherView.getInstance().nyi("Modell in NavTree selektieren");
}
/**
 * Layout the Figures in Diagram automatically.
 * ClassDiagramView popupMenu-Function.
 */
private void mniLayoutDiagram() {
	ch.ehi.umleditor.format.LayoutDiagram.layoutCurrentDiagram();
}
/**
 * Layout the shown rolenames and cardinalities in Diagram automatically.
 * ClassDiagramView popupMenu-Function.
 */
private void mniLayoutRolesAndMultiplicities() {
	((ClassDiagramView)view()).layoutAllVisibleMultiplicities();	
	((ClassDiagramView)view()).layoutAllVisibleRolenames();	
}
/**
 * Print the Diagram.
 * ClassDiagramView popupMenu-Function.
 */
private void mniPrintDiagram() {
	ch.ehi.umleditor.application.LauncherView.getInstance().printClassDiagram((ClassDiagramView)view());
}
/**
 * Layout the Figures in Diagram automatically.
 * ClassDiagramView popupMenu-Function.
 */
private void mniSaveDiagram() {
 	ch.ehi.umleditor.objectcatalog.ObjectCatalog.writeDiagram((ClassDiagramView)view());
}
/**
 * Overwrites.
 */
public void mouseDrag(MouseEvent e, int x, int y) {
	try {
		if (!e.isPopupTrigger()) {
			if (editedConnection == null) {
				super.mouseDrag(e, x, y);
			} else switch(dragCase) {
				case MOVE_WAYPOINT: {
					// CASE: Relocate a given WayPoint
					editedConnection.setPointAt(new Point(x, y), wayPointIndex);
					view().checkDamage();
					break;
				}
				case MOVE_ENDPOINT: {
					// CASE: Relocate Connector of a Node to another one
					Figure targetFigure = ((ClassDiagramView)view()).findConnectableFigure(x, y, editedConnection);
					if (targetFigure != null) {
						Connector newEnd = ((ClassDiagramView)view()).findNodeConnector(((NodeFigure)targetFigure).getModelElement(), x, y);

						if (editedConnection instanceof NoteAnchorLineConnection) {
							// connect almost any target to a Note
							dragNoteAnchor(newEnd, targetFigure, x, y);
						}

						if (((NodeFigure)targetFigure).getNode().getClass().equals(dragSourceNode.getClass())) {
							// connect to same type only
							if (editedConnection instanceof PresentationRoleFigure) {
								dragAssociation(newEnd, targetFigure, x, y);
							} else if (editedConnection instanceof GeneralizationLineConnection) {
								dragGeneralization(newEnd, targetFigure, x, y);
							} else if (editedConnection instanceof DependencyLineConnection) {
								dragDependency(newEnd, targetFigure, x, y);
							}
						} else {
							ch.softenvironment.view.BaseDialog.showWarning((java.awt.Component)ch.ehi.umleditor.application.LauncherView.getInstance(), NodeFigure.getResourceString(DelegationSelectionTool.class, "CTModellingError"), NodeFigure.getResourceString(DelegationSelectionTool.class, "CEDragNodeIncompatibility"));
						}

						editedConnection.changed();
						view().checkDamage();
					} // else wait for further drag-events
					break;
				}
				case ADD_WAYPOINT: {
					// CASE: Insert WayPoint
					if (splitIndex < 0) {
						// do this only ONCE
						splitIndex = editedConnection.splitSegment(splitX, splitY);
					}
					editedConnection.setPointAt(new Point(x, y), splitIndex);
					view().checkDamage();
					break;
				}
			}
		}
	} catch (Throwable exception) {
		ch.softenvironment.view.BaseDialog.showError(ch.ehi.umleditor.application.LauncherView.getInstance(), NodeFigure.getResourceString(DelegationSelectionTool.class, "CTModellingError"), exception.getMessage(), exception); //$NON-NLS-1$
	}
}
}
