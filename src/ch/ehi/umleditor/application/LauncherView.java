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
import ch.ehi.basics.view.*;
import ch.ehi.basics.logging.EhiLogger;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

import CH.ifa.draw.contrib.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.util.*;
import ch.ehi.umleditor.umldrawingtools.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.uml1_4.modelmanagement.Model;
import ch.ehi.uml1_4.changepropagation.*;
import ch.ehi.umleditor.xmiuml.*;
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.softenvironment.view.*;
import ch.softenvironment.client.ResourceManager;
import ch.softenvironment.util.*;

/**
 * Application start-up (main) of UML-Editor.
 * This GUI manages all SubPanels like:
 * - NavigationTree
 * - DescriptionPanel
 * - LogView
 * - DrawingArea
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.28 $ $Date: 2007-12-28 10:11:42 $
 */
public class LauncherView extends BaseFrame implements MetaModelListener, DrawingEditor, PaletteListener, javax.swing.event.InternalFrameListener, FileHistoryListener {
	// Constants
        private static String version=null;
	public static final String IMAGE_PATH = "/ch/ehi/umleditor/images/";//$NON-NLS-1$
	public static final String UML_IMAGES = IMAGE_PATH + "UML/";//$NON-NLS-1$
	// Launcher as Singleton
	private static LauncherView instance = null;
	private static UserSettings settings;
	private LogListener logListener=null;

	// Internal frame, which is currently activated (receiving all mouse input)
	private DrawingFrame currentFrame = null;
	private Diagram initialDiagram = null;
	// List of listeners which adhere to the InternalFrameListener interface
	private Vector mdiListeners = new Vector();
	// manage Documentation of an element
	private ch.ehi.uml1_4.foundation.core.Element currentElement = null;
	// manage persistency
	private Model model = null;
	private boolean hasModelChanged = false;
	public final static String defaultFileName = ResourceManager.getResource(LauncherView.class, "CIUnknownFilename"); //$NON-NLS-1$
	private java.io.File currentFile = null;
	//	private JToolBar palette = null;
	private ToolButton defaultToolButton = null;
	private ToolButton selectedToolButton = null;
	private FileHistoryMenu mnuFileHistory = null;
	// Undo management
	private UndoManager undoManager = null;
        private javax.help.HelpBroker mainHB=null;
	// generated code
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JMenuItem ivjMniExit = null;
	private JMenu ivjMnuEdit = null;
	private JMenu ivjMnuFile = null;
	private JMenu ivjMnuHelp = null;
	private JMenu ivjMnuWindow = null;
	private StatusBar ivjStbStatusbar = null;
	private JCheckBoxMenuItem ivjMncStatusbar = null;
	private JCheckBoxMenuItem ivjMncToolbar = null;
	private JMenu ivjMnuView = null;
	private JSeparator ivjJSeparator1 = null;
	private JSeparator ivjJSeparator2 = null;
	private JSeparator ivjJSeparator22 = null;
	private JSeparator ivjJSeparator3 = null;
	private JSeparator ivjJSeparator4 = null;
	private JMenuItem ivjMniAbout = null;
	private JMenuItem ivjMniCopy = null;
	private JMenuItem ivjMniCut = null;
	private JMenuItem ivjMniFindReplace = null;
	private JMenuItem ivjMniHelp = null;
	private JMenuItem ivjMniOptions = null;
	private JMenuItem ivjMniPaste = null;
	private JMenuItem ivjMniRedo = null;
	private JMenuItem ivjMniSave = null;
	private JMenuItem ivjMniSelectAll = null;
	private JMenuItem ivjMniUndo = null;
	private JMenu ivjMnuExtras = null;
	private JSeparator ivjJSeparator5 = null;
	private JMenu ivjMnuLookAndFeel = null;
	private ToolBar ivjTlbStandard = null;
	private JToolBar ivjTlbUmlTools = null;
	private JPanel ivjPnlMain = null;
	private LogView ivjPnlLog = null;
	private JSplitPane ivjSppDesignArea = null;
	private JSplitPane ivjSppMain = null;
	private JSplitPane ivjSppControl = null;
	private JPanel ivjPnlEditArea = null;
	private JMenuBar ivjWindowJMenuBar = null;
	private MDIDesktopPane ivjDtpDrawArea = null;
	private JMenuItem ivjMniFileOpen = null;
	private JSeparator ivjJSeparator10 = null;
	private JMenuItem ivjMniCascadeWindows = null;
	private JMenuItem ivjMniPrint = null;
	private NavigationView ivjPnlNavigation = null;
	private JScrollPane ivjScpDrawArea = null;
	private JSeparator ivjJSeparator6 = null;
	private JMenuItem ivjMniTileWindows = null;
	private SimpleEditorPanel ivjPnlDocumentation = null;
	private JMenuItem ivjMniGroupImport = null;
	private JMenuItem ivjMniLayoutDiagram = null;
	private JMenu ivjMnuFormat = null;
	private JMenuItem ivjMniSaveAs = null;
	private JPanel ivjFrcContents = null;
	private JMenuItem ivjMniObjectCatalog = null;
	private JMenuItem ivjMniStructure = null;
	private JMenuItem ivjMniImportXmiRose = null;
	private JMenu ivjMnuXMI_Rose = null;
	private JMenuItem ivjMniCheckModel = null;
	private JMenuItem ivjMniExportInterlis = null;
	private JMenuItem ivjMniImportInterlis = null;
	private JMenuItem ivjMniNewFile = null;
	private JMenuItem ivjMniXmlExport = null;
	private JMenu ivjMnuInterlisTools = null;
	private JMenu ivjMnuSymbollists = null;
	private JMenu ivjMnuReports = null;
	private JMenu ivjMnuTools = null;

class IvjEventHandler implements ch.softenvironment.view.SimpleEditorPanelListener, ch.softenvironment.view.ToolBarListener, java.awt.event.ActionListener, java.awt.event.ItemListener, java.awt.event.MouseListener, java.awt.event.WindowListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == LauncherView.this.getMniAbout())
				connEtoC8(e);
			if (e.getSource() == LauncherView.this.getMniFileOpen())
				connEtoC11(e);
			if (e.getSource() == LauncherView.this.getMniNewFile())
				connEtoC12(e);
			if (e.getSource() == LauncherView.this.getMniExit())
				connEtoC13(e);
			if (e.getSource() == LauncherView.this.getMniHelp())
				connEtoC5(e);
			if (e.getSource() == LauncherView.this.getMniPrint())
				connEtoC15(e);
			if (e.getSource() == LauncherView.this.getMniOptions())
				connEtoC6(e);
			if (e.getSource() == LauncherView.this.getMniObjectCatalog())
				connEtoC9(e);
			if (e.getSource() == LauncherView.this.getMniImportInterlis())
				connEtoC14(e);
			if (e.getSource() == LauncherView.this.getMniExportInterlis())
				connEtoC16(e);
			if (e.getSource() == LauncherView.this.getMniCheckModel())
				connEtoC17(e);
			if (e.getSource() == LauncherView.this.getMniSave())
				connEtoC10(e);
			if (e.getSource() == LauncherView.this.getMniCascadeWindows())
				connEtoC18(e);
			if (e.getSource() == LauncherView.this.getMniTileWindows())
				connEtoC19(e);
			if (e.getSource() == LauncherView.this.getMniGroupImport())
				connEtoC21(e);
			if (e.getSource() == LauncherView.this.getMniLayoutDiagram())
				connEtoC22(e);
			if (e.getSource() == LauncherView.this.getMniSaveAs())
				connEtoC2(e);
			if (e.getSource() == LauncherView.this.getMniStructure())
				connEtoC35(e);
			if (e.getSource() == LauncherView.this.getMniXmlExport())
				connEtoC36(e);
			if (e.getSource() == LauncherView.this.getMniImportXmiRose())
				connEtoC37(e);
			if (e.getSource() == LauncherView.this.getMniFindReplace())
				connEtoC7(e);
			if (e.getSource() == LauncherView.this.getMniUndo())
				connEtoC38(e);
			if (e.getSource() == LauncherView.this.getMniRedo())
				connEtoC39(e);
		};
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == LauncherView.this.getMncToolbar())
				connEtoC24(e);
			if (e.getSource() == LauncherView.this.getMncStatusbar())
				connEtoC25(e);
		};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == LauncherView.this.getTreProjects())
				connEtoC1(e);
		};
		public void tbbCopyAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC30(newEvent);
		};
		public void tbbCutAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC29(newEvent);
		};
		public void tbbDeleteAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC28(newEvent);
		};
		public void tbbFindAction_actionPerformed(java.util.EventObject newEvent) {};
		public void tbbNewAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC26(newEvent);
		};
		public void tbbOpenAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC27(newEvent);
		};
		public void tbbPasteAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC31(newEvent);
		};
		public void tbbPrintAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC3(newEvent);
		};
		public void tbbRedoAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC32(newEvent);
		};
		public void tbbSaveAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC4(newEvent);
		};
		public void tbbUndoAction_actionPerformed(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getTlbStandard())
				connEtoC33(newEvent);
		};
		public void txaEditorKey_keyReleased(java.util.EventObject newEvent) {
			if (newEvent.getSource() == LauncherView.this.getPnlDocumentation())
				connEtoC23(newEvent);
		};
		public void windowActivated(java.awt.event.WindowEvent e) {};
		public void windowClosed(java.awt.event.WindowEvent e) {};
		public void windowClosing(java.awt.event.WindowEvent e) {};
		public void windowDeactivated(java.awt.event.WindowEvent e) {};
		public void windowDeiconified(java.awt.event.WindowEvent e) {};
		public void windowIconified(java.awt.event.WindowEvent e) {};
		public void windowOpened(java.awt.event.WindowEvent e) {
			if (e.getSource() == LauncherView.this)
				connEtoC34(e);
		};
	};
/**
 * TemplateView constructor comment.
 */
public LauncherView() {
	super();
	initialize();
}
/**
 * Activate an internal frame and adapt corresponding tools.
 * There is no backup as in MDI_InternalFrame.activateFrame(MDI_InternalFrame)
 * instead the UML-Toolbar is adapted according to diagram type.
 */
private void activateFrame(DrawingFrame newFrame) {
	if (currentFrame != newFrame) {
		newFrame.getDrawingView().unfreezeView();
		setCurrentFrame(newFrame);
		try {
			newFrame.setSelected(true);
		} catch(java.beans.PropertyVetoException e) {
			handleException(e);
		}
	}
}
/**
 * Adapt StatusBar and LogView according to saved settings.
 */
private void adaptSubPanels() {
	if (!getSettings().getShowToolBar().booleanValue()) {
		getMncToolbar().setSelected(false);
	}
	if (!getSettings().getShowStatusBar().booleanValue()) {
		getMncStatusbar().setSelected(false);
	}
/*
	if (!getSettings().getShowLogView().booleanValue()) {
		getMncLogView().setSelected(false);
	}
*/
}
/**
 * Set the Tools in the given palette for a certain diagram type.
 * @param palette the palette where the tools are added.
 */
private void adaptTools(DrawingFrame frame) {
	JToolBar palette = getTlbUmlTools();

	// reset Palette
	palette.removeAll();

	if (frame == null) {
		showStatus(null);
	} else {
		if (frame.getDrawingView() instanceof ClassDiagramView) {
			Tool tool = new ZoomTool(this, true);
			palette.add(createToolButton(UML_IMAGES + "ZOOM_IN", getResourceString("CIZoomIn_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$
			tool = new ZoomTool(this, false);
			palette.add(createToolButton(UML_IMAGES + "ZOOM_OUT", getResourceString("CIZoomOut_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$

			// Selection Tool (acc. to Rose)
			tool = new DelegationSelectionTool(this);
			tool.setUsable(true);
			defaultToolButton = createToolButton(UML_IMAGES + "SEL", getResourceString("CISelectionTool_text"), tool); //$NON-NLS-2$//$NON-NLS-1$
			palette.add(defaultToolButton);
			setSelectedTool(defaultToolButton);

			// Note (acc. to Rose)
			tool = new CreationTool(this, new NoteFigure()) {
					public void mouseDrag(java.awt.event.MouseEvent e, int x, int y) {
						// don't track drag events during creation: figure size is
						// calculated and independent of current size
					}
			};
			tool.setUsable(true);
			palette.add(createToolButton(UML_IMAGES + "NOTE", getResourceString("CINote_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$

			// Note-Anchor (acc. to Rose)
			tool = new ConnectionTool(this, new NoteAnchorLineConnection());
			tool.setUsable(true);
			palette.add(createToolButton(UML_IMAGES + "NOTEANCHOR", getResourceString("CINoteAnchor_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$

			ClassDiagramView classDiagram = (ClassDiagramView)frame.getDrawingView();
			if (classDiagram.allowsPackages()) {
				// Package
				tool = new CreationTool(this, new PackageFigure()) {
					public void mouseDrag(java.awt.event.MouseEvent e, int x, int y) {
						// don't track drag events during creation: figure size is
						// calculated and independent of current size
					}
				};
				tool.setUsable(true);
				palette.add(createToolButton(UML_IMAGES + "PACKAGE", getResourceString("CIPakage_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$
			}
			if (classDiagram.allowsClasses()) {
				// Class
				tool = new CreationTool(this, new ClassFigure()) {
					public void mouseDrag(java.awt.event.MouseEvent e, int x, int y) {
						// don't track drag events during creation: figure size is
						// calculated and independent of current size
					}
				};
				tool.setUsable(true);
				palette.add(createToolButton(UML_IMAGES + "CLASS", getResourceString("CIClass_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$

				// Unidirectional Association (acc. to Rose)
				tool = new ConnectionTool(this, new AssociationLineConnection());
				tool.setUsable(true);
				palette.add(createToolButton(UML_IMAGES + "LINE", getResourceString("CIAssociation_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$

				// Unidirectional Association to selected Class itself
				tool = new ClassFigureSelectionTool(this);
				tool.setUsable(true);
				palette.add(createToolButton(UML_IMAGES + "ASSOC_SELF", getResourceString("CIAssociationSelf_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$

				// Generalization (acc. to Rose)
				tool = new ConnectionTool(this, new GeneralizationLineConnection());
				tool.setUsable(true);
				palette.add(createToolButton(UML_IMAGES + "INHERITANCE", getResourceString("CIInheritance_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$
			}

			// Dependency or instantiates (acc. to Rose)
			tool = new ConnectionTool(this, new DependencyLineConnection());
			tool.setUsable(true);
			palette.add(createToolButton(UML_IMAGES + "DEPENDENCY", getResourceString("CIDependency_text"), tool)); //$NON-NLS-2$//$NON-NLS-1$
		}
	}

	palette.validate();
	palette.repaint();
}
/**
 * Creates a new InternalFrame with a DrawingView.
 * @see MDI_DrawApplication.createContents()
 */
private void addInternalFrame(ClassDiagramView drawingView) {
	// make ClassDiagram a subpart of a ScrollPane
	drawingView.setAutoscrolls(true);
	JScrollPane sp = new JScrollPane(drawingView);
	sp.setAutoscrolls(true);
	sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	// create a new JInternalFrame
	DrawingFrame internalFrame = new DrawingFrame();
	internalFrame.setDrawingView(drawingView);
	internalFrame.getContentPane().add(sp);

	// all registered listeners to the new internal frame
	java.util.Enumeration enumeration = mdiListeners.elements();
	while (enumeration.hasMoreElements()) {
		internalFrame.addInternalFrameListener(
			(javax.swing.event.InternalFrameListener)enumeration.nextElement());
	}

	// add Frame to Desktop
	getDtpDrawArea().add(internalFrame);
	try {
		internalFrame.setSelected(true);
	} catch (java.beans.PropertyVetoException e) {
		Tracer.getInstance().runtimeWarning("PropertyVetoEception ignored");//$NON-NLS-1$
	}

	// set the internalFrame's size
//TODO Patch: call getMinumSize() in ClassDiagramView-Constructor -> Resize necessary because of JHotDraw (Bug?) here
drawingView.setSize(drawingView.getDefaultDimension());
	internalFrame.setSize(getDtpDrawArea().getWidth(), getDtpDrawArea().getHeight());
	internalFrame.setVisible(true);
}
/**
 * Add a new listener to the applications internal frames. If a new internal
 * frame is created, all currently registered InternalFrameListeners are added.
 *
 * @param newMDIListener listener to be added
 */
public void addInternalFrameListener(javax.swing.event.InternalFrameListener newMDIListener) {
	mdiListeners.addElement(newMDIListener);
}
/**
 * addViewChangeListener method comment.
 */
public void addViewChangeListener(CH.ifa.draw.framework.ViewChangeListener vsl) {}
/**
 * Close ClassDiagram representing the given Element.
 */
protected void closeClassDiagram(Element diagramElement) {
	toolDone();

	JInternalFrame frame = getInternalFrame(diagramElement);
	if (frame != null) {
		frame.dispose();
	}
}
/**
 * connEtoC1:  (TreProjects.mouse.mouseReleased(java.awt.event.MouseEvent) --> LauncherView.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, new javax.swing.JPopupMenu());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC10:  (MniSaveAs.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.saveFile()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC10(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniSaveFile();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC11:  (MniFileOpen.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.openFile()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC11(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniOpenFile();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC12:  (JMenuItem1.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.newFile()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC12(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniNewFile();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC13:  (MniExit.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.exit()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC13(java.awt.event.ActionEvent arg1) {
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
 * connEtoC14:  (JMenuItem2.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniInterlisImport()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC14(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniInterlisImport();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC15:  (MniPrint.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.print()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC15(java.awt.event.ActionEvent arg1) {
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
 * connEtoC16:  (JMenuItem3.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniInterlisExport()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC16(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniInterlisExport();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC17:  (JMenuItem4.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniModelCheck()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC17(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniModelCheck();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC18:  (MniCascadeWindows.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniCascadeWindows()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC18(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniCascadeWindows();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC19:  (MniTileWindows.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniTileWindows()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC19(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniTileWindows();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (MniSaveAs.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniSaveAs()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniSaveAs();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC21:  (MniGroupImport.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniGroupImport()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC21(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniGroupImport();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC22:  (MniLayoutDiagram.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniLayoutDiagram()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC22(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniLayoutDiagram();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC23:  (PnlDocumentation.simpleEditorPanel.txaEditorKey_keyReleased(java.util.EventObject) --> LauncherView.saveDocumentation()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC23(java.util.EventObject arg1) {
	try {
		// user code begin {1}
		// user code end
		this.saveDocumentation();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC24:  (MncToolbar.item.itemStateChanged(java.awt.event.ItemEvent) --> LauncherView.toggleStandardToolbar()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC24(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.toggleStandardToolbar();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC25:  (MncStatusbar.item.itemStateChanged(java.awt.event.ItemEvent) --> LauncherView.toggleStatusbar()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC25(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.toggleStatusbar();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC26:  (TlbStandard.toolBar.tbbNewAction_actionPerformed(java.util.EventObject) --> LauncherView.mniNewFile()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC26(java.util.EventObject arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniNewFile();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC27:  (TlbStandard.toolBar.tbbOpenAction_actionPerformed(java.util.EventObject) --> LauncherView.mniOpenFile()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC27(java.util.EventObject arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniOpenFile();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC28:  (TlbStandard.toolBar.tbbDeleteAction_actionPerformed(java.util.EventObject) --> LauncherView.mniRemove()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC28(java.util.EventObject arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniRemove();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC29:  (TlbStandard.toolBar.tbbCutAction_actionPerformed(java.util.EventObject) --> LauncherView.mniCut()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC29(java.util.EventObject arg1) {
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
 * connEtoC3:  (TlbStandard.toolBar.tbbPrintAction_actionPerformed(java.util.EventObject) --> LauncherView.mniPrint()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.util.EventObject arg1) {
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
 * connEtoC30:  (TlbStandard.toolBar.tbbCopyAction_actionPerformed(java.util.EventObject) --> LauncherView.mniCopy()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC30(java.util.EventObject arg1) {
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
 * connEtoC31:  (TlbStandard.toolBar.tbbPasteAction_actionPerformed(java.util.EventObject) --> LauncherView.mniPaste()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC31(java.util.EventObject arg1) {
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
 * connEtoC32:  (TlbStandard.toolBar.tbbRedoAction_actionPerformed(java.util.EventObject) --> LauncherView.mniRedo()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC32(java.util.EventObject arg1) {
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
 * connEtoC33:  (TlbStandard.toolBar.tbbUndoAction_actionPerformed(java.util.EventObject) --> LauncherView.mniUndo()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC33(java.util.EventObject arg1) {
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
 * connEtoC34:  (Window.window.windowOpened(java.awt.event.WindowEvent) --> LauncherView.adaptSubPanels()V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC34(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.adaptSubPanels();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC35:  (MniStructure.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniStructure()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC35(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniStructure();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC36:  (JMenuItem5.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniXmlSchemeExport()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC36(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniXmlSchemeExport();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC37:  (MniImportXmiRose.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniXmiRoseImport()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC37(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniXmiRoseImport();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC38:  (MniUndo.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniUndo()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC38(java.awt.event.ActionEvent arg1) {
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
 * connEtoC39:  (MniRedo.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniRedo()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC39(java.awt.event.ActionEvent arg1) {
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
 * connEtoC4:  (TlbStandard.toolBar.tbbSaveAction_actionPerformed(java.util.EventObject) --> LauncherView.mniSaveFile()V)
 * @param arg1 java.util.EventObject
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.util.EventObject arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniSaveFile();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (addClass3.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.addProject()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniHelp();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (MniOptions.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniOptions()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniOptions();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (MniFindReplace.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniFindReplace()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC7(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniFindReplace();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC8:  (MniAbout.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniAbout_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniAboutBox();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC9:  (JMenuItem5.action.actionPerformed(java.awt.event.ActionEvent) --> LauncherView.mniObjectCatalog()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC9(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniObjectCatalog();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Creates and opens a ClassDiagram within an InternalFrame.
 * Children will have the same parent as ClassDiagram itself.
 * The same ClassDiagram may be opened once at most.
 *
 * @param diagramElement (Diagram to be displayed)
 */
public ClassDiagramView createClassDiagram(Element diagramElement) {
	toolDone();

	JInternalFrame frame = getInternalFrame(diagramElement);
	if (frame != null) {
		// refocus found frame
		try {
			frame.setSelected(true);
		} catch(java.beans.PropertyVetoException e) {
			handleException(e);
		}
		return (ClassDiagramView)((DrawingFrame)frame).getDrawingView();
	} else {
		// Diagram not yet shown
		ClassDiagramView drawingView = new ClassDiagramView(this, (Diagram)diagramElement);
		addInternalFrame(drawingView);
		return drawingView;
	}
}
/**
 * @return specific File-Filter.
 * @deprecated
 */
public static GenericFileFilter createInterlisCompilerFilter() {
//TODO move to GenericFileFilter.createIlc()
	return new GenericFileFilter(ResourceManager.getResource(LauncherView.class, "CIIlcFilter"), "ilc");//$NON-NLS-2$ //$NON-NLS-1$
}
/**
 * @return specific File-Filter.
 * @deprecated
 */
public static GenericFileFilter createInterlisModelFilter() {
//TODO move to GenericFileFilter.createIli()
	return new GenericFileFilter(ResourceManager.getResource(LauncherView.class, "CIIliFilter"), "ili");//$NON-NLS-2$ //$NON-NLS-1$
}

/**
 * Creates a tool button with the given image, tool, and text
 */
private ToolButton createToolButton(String iconName, String toolName, Tool tool) {
	try {
		return new ToolButton(this, iconName, toolName, tool);
	} catch(NullPointerException e) {
		Tracer.getInstance().developerError("File <" + iconName + "> could not be found!");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
	}

	return null;
}
/**
 * @return specific File-Filter.
 * @deprecated
 */
public static GenericFileFilter createUmlInterlisEditorFilter() {
	return new GenericFileFilter(ResourceManager.getResource(LauncherView.class, "CIUmlFilter"),"uml");//$NON-NLS-2$ //$NON-NLS-1$
}
/**
 * @return specific File-Filter.
 * @deprecated
 */
public static GenericFileFilter createXmlFilter() {
	return GenericFileFilter.createXmlFilter();
}
/**
 * Deactivate the current internal frame and adapt corresponding tools.
 */
private void deActivateFrame(DrawingFrame frame) {
  if (currentFrame == frame) {
       if (frame != null) {
		frame.validate();
//		frame.unregisterListener();
		frame.getDrawingView().freezeView();
       }
       setCurrentFrame(null);
  }
}
/**
 * Exits the application.
 * @see #saveOnClosing()
 */
public void dispose() {
	if (saveOnClosing()) {
	    disposeApplication();
	}
}
/**
 * Gets the editor's drawing.
 * @see DrawingEditor
 */
public Drawing drawing() {
	if (currentFrame == null) {
		return null;
	} else {
	    return currentFrame.getDrawing();
	}
}
	/**
	 * Sent when the figure selection has changed.
	 * @param view DrawingView
	 */
public void figureSelectionChanged(CH.ifa.draw.framework.DrawingView view) {}
/**
 * Return the Application Name
 */
public static String getApplicationName() {
	return ResourceManager.getResource(LauncherView.class, "CIApplicationName"); //$NON-NLS-1$
}
/**
 * Return the currently selected ClassDiagram.
 * @see LayoutDiagram (Plug-In)
 * @Return current ClassDiagramView; null if none.
 */
public ClassDiagramView getCurrentClassDiagram() {
	if ((currentFrame != null) && (currentFrame.getDrawingView() instanceof ClassDiagramView)) {
		return (ClassDiagramView)currentFrame.getDrawingView();
	} else {
		return null;
	}
}
/**
 * Return the currentFile representing this model.
 */
public java.io.File getCurrentFile() {
	return currentFile;
}
/**
 * Return the DtpDrawArea property value.
 * @return javax.swing.JDesktopPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private CH.ifa.draw.contrib.MDIDesktopPane getDtpDrawArea() {
	if (ivjDtpDrawArea == null) {
		try {
			ivjDtpDrawArea = new CH.ifa.draw.contrib.MDIDesktopPane();
			ivjDtpDrawArea.setName("DtpDrawArea");
			ivjDtpDrawArea.setAutoscrolls(true);
			ivjDtpDrawArea.setBackground(java.awt.Color.lightGray);
			ivjDtpDrawArea.setDoubleBuffered(true);
			ivjDtpDrawArea.setForeground(java.awt.Color.darkGray);
			ivjDtpDrawArea.setPreferredSize(new java.awt.Dimension(50, 50));
			ivjDtpDrawArea.setBounds(0, 0, 160, 120);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjDtpDrawArea;
}
/**
 * Create File Filter for UML-Model's.
 */
private java.io.FileFilter getFileFilter() {
	return new java.io.FileFilter() {
		public boolean accept(java.io.File checkFile) {
			// still display directories for navigation
			if (checkFile.isDirectory()) {
				return true;
			} else {
				return checkFile.getName().endsWith(".uml");//$NON-NLS-1$
			}
		}

		public String getDescription() {
			return getResourceString("CIInterlisFilter"); //$NON-NLS-1$
		}
	};
}
/**
 * Return the JFrameContentPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getFrcContents() {
	if (ivjFrcContents == null) {
		try {
			ivjFrcContents = new javax.swing.JPanel();
			ivjFrcContents.setName("FrcContents");
			ivjFrcContents.setLayout(new java.awt.BorderLayout());
			getFrcContents().add(getPnlMain(), "Center");
			getFrcContents().add(getTlbStandard(), "North");
			getFrcContents().add(getStbStatusbar(), "South");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjFrcContents;
}
/** get the version of the INTERLIS compiler
 *
 */
public static String getIli2cVersion() {
  return ch.interlis.ili2c.Main.getVersion();
}
/**
 * Allow references to Launcher for a common User Interaction.
 * Design Pattern: Singleton
 */
public static LauncherView getInstance() {
	return instance;
}
/**
 * Return internalFrame for given DiagramElement if existing; null otherwise.
 */
private JInternalFrame getInternalFrame(Element diagramElement) {
	JInternalFrame[] frames = getDtpDrawArea().getAllFrames();
	for (int i=0; i<frames.length; i++) {
		if (((ClassDiagramView)((DrawingFrame)frames[i]).getDrawingView()).getDiagram() == diagramElement) {
			return frames[i];
		}
	}
	return null;
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
 * Return the JSeparator10 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator10() {
	if (ivjJSeparator10 == null) {
		try {
			ivjJSeparator10 = new javax.swing.JSeparator();
			ivjJSeparator10.setName("JSeparator10");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator10;
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
 * Return the JSeparator4 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator4() {
	if (ivjJSeparator4 == null) {
		try {
			ivjJSeparator4 = new javax.swing.JSeparator();
			ivjJSeparator4.setName("JSeparator4");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator4;
}
/**
 * Return the JSeparator5 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator5() {
	if (ivjJSeparator5 == null) {
		try {
			ivjJSeparator5 = new javax.swing.JSeparator();
			ivjJSeparator5.setName("JSeparator5");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator5;
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
 * Return the MncStatusbar property value.
 * @return javax.swing.JCheckBoxMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBoxMenuItem getMncStatusbar() {
	if (ivjMncStatusbar == null) {
		try {
			ivjMncStatusbar = new javax.swing.JCheckBoxMenuItem();
			ivjMncStatusbar.setName("MncStatusbar");
			ivjMncStatusbar.setSelected(true);
			ivjMncStatusbar.setText("Statusleiste");
			// user code begin {1}
			ivjMncStatusbar.setText(CommonUserAccess.getMncViewStatusbarText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMncStatusbar;
}
/**
 * Return the MncToolbar property value.
 * @return javax.swing.JCheckBoxMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBoxMenuItem getMncToolbar() {
	if (ivjMncToolbar == null) {
		try {
			ivjMncToolbar = new javax.swing.JCheckBoxMenuItem();
			ivjMncToolbar.setName("MncToolbar");
			ivjMncToolbar.setSelected(true);
			ivjMncToolbar.setText("Standard");
			// user code begin {1}
			ivjMncToolbar.setText(CommonUserAccess.getMncViewSymbollistStandardText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMncToolbar;
}
/**
 * Return the MniAbout property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniAbout() {
	if (ivjMniAbout == null) {
		try {
			ivjMniAbout = new javax.swing.JMenuItem();
			ivjMniAbout.setName("MniAbout");
			ivjMniAbout.setText("Info...");
			// user code begin {1}
			ivjMniAbout.setText(CommonUserAccess.getMniHelpAboutText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniAbout;
}
/**
 * Return the MniCascadeWindows property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniCascadeWindows() {
	if (ivjMniCascadeWindows == null) {
		try {
			ivjMniCascadeWindows = new javax.swing.JMenuItem();
			ivjMniCascadeWindows.setName("MniCascadeWindows");
			ivjMniCascadeWindows.setText("Kaskadieren");
			ivjMniCascadeWindows.setEnabled(true);
			// user code begin {1}
			ivjMniCascadeWindows.setText(CommonUserAccess.getMniWindowCascadeText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniCascadeWindows;
}
/**
 * Return the JMenuItem4 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniCheckModel() {
	if (ivjMniCheckModel == null) {
		try {
			ivjMniCheckModel = new javax.swing.JMenuItem();
			ivjMniCheckModel.setName("MniCheckModel");
			ivjMniCheckModel.setText("Modell prüfen");
			// user code begin {1}
			ivjMniCheckModel.setText(getResourceString("MniCheckModel_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniCheckModel;
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
 * Return the MniCut property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniCut() {
	if (ivjMniCut == null) {
		try {
			ivjMniCut = new javax.swing.JMenuItem();
			ivjMniCut.setName("MniCut");
			ivjMniCut.setText("Ausschneiden");
			ivjMniCut.setEnabled(false);
			// user code begin {1}
			ivjMniCut.setText(CommonUserAccess.getMniEditCutText());
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
 * Return the MniExit property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniExit() {
	if (ivjMniExit == null) {
		try {
			ivjMniExit = new javax.swing.JMenuItem();
			ivjMniExit.setName("MniExit");
			ivjMniExit.setText("Beenden");
			// user code begin {1}
			ivjMniExit.setText(CommonUserAccess.getMniFileExit());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniExit;
}
/**
 * Return the JMenuItem3 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniExportInterlis() {
	if (ivjMniExportInterlis == null) {
		try {
			ivjMniExportInterlis = new javax.swing.JMenuItem();
			ivjMniExportInterlis.setName("MniExportInterlis");
			ivjMniExportInterlis.setText("Exportieren...");
			// user code begin {1}
			ivjMniExportInterlis.setText(CommonUserAccess.getMniFileExportText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniExportInterlis;
}
/**
 * Return the MniFileOpen property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniFileOpen() {
	if (ivjMniFileOpen == null) {
		try {
			ivjMniFileOpen = new javax.swing.JMenuItem();
			ivjMniFileOpen.setName("MniFileOpen");
			ivjMniFileOpen.setText("Öffnen...");
			// user code begin {1}
			ivjMniFileOpen.setText(CommonUserAccess.getMniFileOpenWindowText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniFileOpen;
}
/**
 * Return the MniFindReplace property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniFindReplace() {
	if (ivjMniFindReplace == null) {
		try {
			ivjMniFindReplace = new javax.swing.JMenuItem();
			ivjMniFindReplace.setName("MniFindReplace");
			ivjMniFindReplace.setText("Suchen/Ersetzen...");
			ivjMniFindReplace.setEnabled(true);
			// user code begin {1}
			ivjMniFindReplace.setText(CommonUserAccess.getMniEditFindReplaceText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniFindReplace;
}
/**
 * Return the MniGroupImport property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniGroupImport() {
	if (ivjMniGroupImport == null) {
		try {
			ivjMniGroupImport = new javax.swing.JMenuItem();
			ivjMniGroupImport.setName("MniGroupImport");
			ivjMniGroupImport.setText("Gruppe importieren...");
			// user code begin {1}
			ivjMniGroupImport.setText(getResourceString("MniGroupImport_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniGroupImport;
}
/**
 * Return the MniHelp property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniHelp() {
	if (ivjMniHelp == null) {
		try {
			ivjMniHelp = new javax.swing.JMenuItem();
			ivjMniHelp.setName("MniHelp");
			ivjMniHelp.setText("Hilfe...");
			// user code begin {1}
			ivjMniHelp.setText(CommonUserAccess.getMniHelpText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniHelp;
}
/**
 * Return the JMenuItem2 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniImportInterlis() {
	if (ivjMniImportInterlis == null) {
		try {
			ivjMniImportInterlis = new javax.swing.JMenuItem();
			ivjMniImportInterlis.setName("MniImportInterlis");
			ivjMniImportInterlis.setText("Importieren...");
			// user code begin {1}
			ivjMniImportInterlis.setText(CommonUserAccess.getMniFileImportText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniImportInterlis;
}
/**
 * Return the MniImportXmiRose property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniImportXmiRose() {
	if (ivjMniImportXmiRose == null) {
		try {
			ivjMniImportXmiRose = new javax.swing.JMenuItem();
			ivjMniImportXmiRose.setName("MniImportXmiRose");
			ivjMniImportXmiRose.setToolTipText("Rational Rose Schnittstelle");
			ivjMniImportXmiRose.setText("Importieren...");
			// user code begin {1}
			ivjMniImportXmiRose.setToolTipText(getResourceString("MniImportXmiRose_toolTipText"));
			ivjMniImportXmiRose.setText(getResourceString("MniImportXmiRose_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniImportXmiRose;
}
/**
 * Return the MniLayoutDiagram property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniLayoutDiagram() {
	if (ivjMniLayoutDiagram == null) {
		try {
			ivjMniLayoutDiagram = new javax.swing.JMenuItem();
			ivjMniLayoutDiagram.setName("MniLayoutDiagram");
			ivjMniLayoutDiagram.setText("Diagram anordnen");
			// user code begin {1}
			ivjMniLayoutDiagram.setText(getResourceString("MniLayoutDiagram_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniLayoutDiagram;
}
/**
 * Return the JMenuItem1 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniNewFile() {
	if (ivjMniNewFile == null) {
		try {
			ivjMniNewFile = new javax.swing.JMenuItem();
			ivjMniNewFile.setName("MniNewFile");
			ivjMniNewFile.setText("Neu");
			ivjMniNewFile.setActionCommand("MniNewFile");
			// user code begin {1}
			ivjMniNewFile.setText(CommonUserAccess.getMniFileNewText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniNewFile;
}
/**
 * Return the JMenuItem5 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniObjectCatalog() {
	if (ivjMniObjectCatalog == null) {
		try {
			ivjMniObjectCatalog = new javax.swing.JMenuItem();
			ivjMniObjectCatalog.setName("MniObjectCatalog");
			ivjMniObjectCatalog.setText("Objektkatalog...");
			// user code begin {1}
			ivjMniObjectCatalog.setText(getResourceString("MniObjectCatalog_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniObjectCatalog;
}
/**
 * Return the MniOptions property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOptions() {
	if (ivjMniOptions == null) {
		try {
			ivjMniOptions = new javax.swing.JMenuItem();
			ivjMniOptions.setName("MniOptions");
			ivjMniOptions.setText("Optionen...");
			// user code begin {1}
			ivjMniOptions.setText(CommonUserAccess.getMniExtrasOptionsWindowsText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOptions;
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
			ivjMniPaste.setText("Einfügen");
			ivjMniPaste.setEnabled(false);
			// user code begin {1}
			ivjMniPaste.setText(CommonUserAccess.getMniEditPasteText());
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
 * Return the MniRedo property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRedo() {
	if (ivjMniRedo == null) {
		try {
			ivjMniRedo = new javax.swing.JMenuItem();
			ivjMniRedo.setName("MniRedo");
			ivjMniRedo.setText("Wiederherstellen");
			ivjMniRedo.setEnabled(true);
			// user code begin {1}
			ivjMniRedo.setText(CommonUserAccess.getMniEditRedoText());
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
 * Return the MniSave property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniSave() {
	if (ivjMniSave == null) {
		try {
			ivjMniSave = new javax.swing.JMenuItem();
			ivjMniSave.setName("MniSave");
			ivjMniSave.setText("Speichern");
			ivjMniSave.setEnabled(true);
			// user code begin {1}
			ivjMniSave.setText(CommonUserAccess.getMniFileSaveText());
			ivjMniSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
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
 * Return the MniSaveAs property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniSaveAs() {
	if (ivjMniSaveAs == null) {
		try {
			ivjMniSaveAs = new javax.swing.JMenuItem();
			ivjMniSaveAs.setName("MniSaveAs");
			ivjMniSaveAs.setText("Speichern unter...");
			ivjMniSaveAs.setEnabled(true);
			// user code begin {1}
			ivjMniSaveAs.setText(CommonUserAccess.getMniFileSaveAsText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniSaveAs;
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
 * Return the MniStructure property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniStructure() {
	if (ivjMniStructure == null) {
		try {
			ivjMniStructure = new javax.swing.JMenuItem();
			ivjMniStructure.setName("MniStructure");
			ivjMniStructure.setText("Struktur...");
			// user code begin {1}
			ivjMniStructure.setText(getResourceString("MniStructure_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniStructure;
}
/**
 * Return the MniTileWindows property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniTileWindows() {
	if (ivjMniTileWindows == null) {
		try {
			ivjMniTileWindows = new javax.swing.JMenuItem();
			ivjMniTileWindows.setName("MniTileWindows");
			ivjMniTileWindows.setText("Aufteilen");
			// user code begin {1}
			ivjMniTileWindows.setText(CommonUserAccess.getMniWindowTileText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniTileWindows;
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
			ivjMniUndo.setText("Rückgängig");
			ivjMniUndo.setEnabled(true);
			// user code begin {1}
			ivjMniUndo.setText(CommonUserAccess.getMniEditUndoText());
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
 * Return the JMenuItem5 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniXmlExport() {
	if (ivjMniXmlExport == null) {
		try {
			ivjMniXmlExport = new javax.swing.JMenuItem();
			ivjMniXmlExport.setName("MniXmlExport");
			ivjMniXmlExport.setText("XML-Schema exportieren...");
			ivjMniXmlExport.setActionCommand("MniExportXMLScheme");
			// user code begin {1}
			ivjMniXmlExport.setText(getResourceString("MniXsdExport_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniXmlExport;
}
/**
 * Return the MnuEdit property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuEdit() {
	if (ivjMnuEdit == null) {
		try {
			ivjMnuEdit = new javax.swing.JMenu();
			ivjMnuEdit.setName("MnuEdit");
			ivjMnuEdit.setText("Bearbeiten");
			ivjMnuEdit.add(getMniUndo());
			ivjMnuEdit.add(getMniRedo());
			ivjMnuEdit.add(getJSeparator22());
			ivjMnuEdit.add(getMniCut());
			ivjMnuEdit.add(getMniCopy());
			ivjMnuEdit.add(getMniPaste());
			ivjMnuEdit.add(getJSeparator2());
			ivjMnuEdit.add(getMniSelectAll());
			ivjMnuEdit.add(getJSeparator3());
			ivjMnuEdit.add(getMniFindReplace());
			// user code begin {1}
			ivjMnuEdit.setText(CommonUserAccess.getMnuEditText());
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
 * Return the MnuExtras property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuExtras() {
	if (ivjMnuExtras == null) {
		try {
			ivjMnuExtras = new javax.swing.JMenu();
			ivjMnuExtras.setName("MnuExtras");
			ivjMnuExtras.setText("Extras");
			ivjMnuExtras.add(getJSeparator5());
			ivjMnuExtras.add(getMniOptions());
			// user code begin {1}
			ivjMnuExtras.setText(CommonUserAccess.getMnuExtrasText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuExtras;
}
/**
 * Return the MnuFile property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuFile() {
	if (ivjMnuFile == null) {
		try {
			ivjMnuFile = new javax.swing.JMenu();
			ivjMnuFile.setName("MnuFile");
			ivjMnuFile.setText("Datei");
			ivjMnuFile.add(getMniNewFile());
			ivjMnuFile.add(getMniFileOpen());
			ivjMnuFile.add(getMniSave());
			ivjMnuFile.add(getMniSaveAs());
			ivjMnuFile.add(getJSeparator1());
			ivjMnuFile.add(getMniPrint());
			ivjMnuFile.add(getJSeparator10());
			ivjMnuFile.add(getMniExit());
			// user code begin {1}
			ivjMnuFile.setText(CommonUserAccess.getMnuFileText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuFile;
}
/**
 * Return the MnuFormat property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuFormat() {
	if (ivjMnuFormat == null) {
		try {
			ivjMnuFormat = new javax.swing.JMenu();
			ivjMnuFormat.setName("MnuFormat");
			ivjMnuFormat.setText("Format");
			ivjMnuFormat.add(getMniLayoutDiagram());
			// user code begin {1}
			ivjMnuFormat.setText(CommonUserAccess.getMnuFormatText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuFormat;
}
/**
 * Return the MnuHelp property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuHelp() {
	if (ivjMnuHelp == null) {
		try {
			ivjMnuHelp = new javax.swing.JMenu();
			ivjMnuHelp.setName("MnuHelp");
			ivjMnuHelp.setText("?");
			ivjMnuHelp.add(getMniHelp());
			ivjMnuHelp.add(getJSeparator4());
			ivjMnuHelp.add(getMniAbout());
			// user code begin {1}
			ivjMnuHelp.setText(CommonUserAccess.getMnuHelpText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuHelp;
}
/**
 * Return the JMenu2 property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuInterlisTools() {
	if (ivjMnuInterlisTools == null) {
		try {
			ivjMnuInterlisTools = new javax.swing.JMenu();
			ivjMnuInterlisTools.setName("MnuInterlisTools");
			ivjMnuInterlisTools.setText("INTERLIS");
			ivjMnuInterlisTools.add(getMniImportInterlis());
			ivjMnuInterlisTools.add(getMniGroupImport());
			ivjMnuInterlisTools.add(getMniExportInterlis());
			ivjMnuInterlisTools.add(getMniXmlExport());
			ivjMnuInterlisTools.add(getJSeparator6());
			ivjMnuInterlisTools.add(getMniCheckModel());
			// user code begin {1}
			ivjMnuInterlisTools.setText(getResourceString("MnuInterlis_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuInterlisTools;
}
/**
 * Return the MnuLookAndFeel property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuLookAndFeel() {
	if (ivjMnuLookAndFeel == null) {
		try {
			ivjMnuLookAndFeel = new javax.swing.JMenu();
			ivjMnuLookAndFeel.setName("MnuLookAndFeel");
			ivjMnuLookAndFeel.setText("Look & Feel");
			// user code begin {1}
			ivjMnuLookAndFeel.setText(CommonUserAccess.getMnuViewLookAndFeelText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuLookAndFeel;
}
/**
 * Return the JMenu3 property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuReports() {
	if (ivjMnuReports == null) {
		try {
			ivjMnuReports = new javax.swing.JMenu();
			ivjMnuReports.setName("MnuReports");
			ivjMnuReports.setText("Berichte");
			ivjMnuReports.add(getMniObjectCatalog());
			ivjMnuReports.add(getMniStructure());
			// user code begin {1}
			ivjMnuReports.setText(CommonUserAccess.getMnuReportsText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuReports;
}
/**
 * Return the JMenu4 property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuSymbollists() {
	if (ivjMnuSymbollists == null) {
		try {
			ivjMnuSymbollists = new javax.swing.JMenu();
			ivjMnuSymbollists.setName("MnuSymbollists");
			ivjMnuSymbollists.setText("Symbolleisten");
			ivjMnuSymbollists.add(getMncToolbar());
			// user code begin {1}
			ivjMnuSymbollists.setText(CommonUserAccess.getMnuViewSymbollistsText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuSymbollists;
}
/**
 * Return the JMenu1 property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuTools() {
	if (ivjMnuTools == null) {
		try {
			ivjMnuTools = new javax.swing.JMenu();
			ivjMnuTools.setName("MnuTools");
			ivjMnuTools.setText("Werkzeuge");
			ivjMnuTools.add(getMnuInterlisTools());
			ivjMnuTools.add(getMnuXMI_Rose());
			// user code begin {1}
			ivjMnuTools.setText(CommonUserAccess.getMnuToolsText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuTools;
}
/**
 * Return the MnuView property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuView() {
	if (ivjMnuView == null) {
		try {
			ivjMnuView = new javax.swing.JMenu();
			ivjMnuView.setName("MnuView");
			ivjMnuView.setText("Ansicht");
			ivjMnuView.add(getMnuLookAndFeel());
			ivjMnuView.add(getMnuSymbollists());
			ivjMnuView.add(getMncStatusbar());
			// user code begin {1}
			ivjMnuView.setText(CommonUserAccess.getMnuViewText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuView;
}
/**
 * Return the MnuWindow property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuWindow() {
	if (ivjMnuWindow == null) {
		try {
			ivjMnuWindow = new javax.swing.JMenu();
			ivjMnuWindow.setName("MnuWindow");
			ivjMnuWindow.setText("Fenster");
			ivjMnuWindow.add(getMniCascadeWindows());
			ivjMnuWindow.add(getMniTileWindows());
			// user code begin {1}
			ivjMnuWindow.setText(CommonUserAccess.getMnuWindowText());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuWindow;
}
/**
 * Return the MnuXMI_Rose property value.
 * @return javax.swing.JMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenu getMnuXMI_Rose() {
	if (ivjMnuXMI_Rose == null) {
		try {
			ivjMnuXMI_Rose = new javax.swing.JMenu();
			ivjMnuXMI_Rose.setName("MnuXMI_Rose");
			ivjMnuXMI_Rose.setText("XMI/Rose");
			ivjMnuXMI_Rose.add(getMniImportXmiRose());
			// user code begin {1}
			ivjMnuXMI_Rose.setText(getResourceString("MnuXMI_Rose_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuXMI_Rose;
}
/**
 * Return the root Element of INTERLIS model.
 */
public Model getModel() {
	return model;
}
/**
 * Return the PnlDocumentation property value.
 * @return ch.softenvironment.view.SimpleEditorPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ch.softenvironment.view.SimpleEditorPanel getPnlDocumentation() {
	if (ivjPnlDocumentation == null) {
		try {
			ivjPnlDocumentation = new ch.softenvironment.view.SimpleEditorPanel();
			ivjPnlDocumentation.setName("PnlDocumentation");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlDocumentation;
}
/**
 * Return the PnlEditArea property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlEditArea() {
	if (ivjPnlEditArea == null) {
		try {
			ivjPnlEditArea = new javax.swing.JPanel();
			ivjPnlEditArea.setName("PnlEditArea");
			ivjPnlEditArea.setPreferredSize(new java.awt.Dimension(1024, 1024));
			ivjPnlEditArea.setLayout(new javax.swing.BoxLayout(getPnlEditArea(), javax.swing.BoxLayout.X_AXIS));
			getPnlEditArea().add(getTlbUmlTools(), getTlbUmlTools().getName());
			getPnlEditArea().add(getScpDrawArea(), getScpDrawArea().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlEditArea;
}
/**
 * Return the PnlLog property value.
 * @return ch.ehi.umlEdit.application.LogView
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private LogView getPnlLog() {
	if (ivjPnlLog == null) {
		try {
			ivjPnlLog = new ch.ehi.umleditor.application.LogView();
			ivjPnlLog.setName("PnlLog");
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
 * Return the JPanel1 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlMain() {
	if (ivjPnlMain == null) {
		try {
			ivjPnlMain = new javax.swing.JPanel();
			ivjPnlMain.setName("PnlMain");
			ivjPnlMain.setLayout(new java.awt.BorderLayout());
			getPnlMain().add(getSppMain(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlMain;
}
/**
 * Return the PnlNavigation property value.
 * @return ch.ehi.umlEdit.application.NavigationView
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public NavigationView getPnlNavigation() {
	if (ivjPnlNavigation == null) {
		try {
			ivjPnlNavigation = new ch.ehi.umleditor.application.NavigationView();
			ivjPnlNavigation.setName("PnlNavigation");
			ivjPnlNavigation.setAutoscrolls(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlNavigation;
}
/**
 * Return the ScpDrawArea property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpDrawArea() {
	if (ivjScpDrawArea == null) {
		try {
			ivjScpDrawArea = new javax.swing.JScrollPane();
			ivjScpDrawArea.setName("ScpDrawArea");
			ivjScpDrawArea.setAutoscrolls(true);
			ivjScpDrawArea.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			ivjScpDrawArea.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			ivjScpDrawArea.setBackground(java.awt.Color.lightGray);
			ivjScpDrawArea.setDoubleBuffered(true);
			ivjScpDrawArea.setPreferredSize(new java.awt.Dimension(50, 50));
			ivjScpDrawArea.setMinimumSize(new java.awt.Dimension(10, 10));
			getScpDrawArea().setViewportView(getDtpDrawArea());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpDrawArea;
}
/**
 * Return the Version of this Application.
 */
public static UserSettings getSettings() {
	if (settings == null) {
		settings = new UserSettings(System.getProperty("user.home") + java.io.File.separator + ".umleditor");
	}
	return settings;
}
/**
 * Return the SppControlArea property value.
 * @return javax.swing.JSplitPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSplitPane getSppControl() {
	if (ivjSppControl == null) {
		try {
			ivjSppControl = new javax.swing.JSplitPane(javax.swing.JSplitPane.VERTICAL_SPLIT);
			ivjSppControl.setName("SppControl");
			ivjSppControl.setDividerLocation(310);
			ivjSppControl.setMinimumSize(new java.awt.Dimension(0, 0));
			getSppControl().add(getPnlNavigation(), "top");
			getSppControl().add(getPnlDocumentation(), "bottom");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjSppControl;
}
/**
 * Return the SppDesignArea property value.
 * @return javax.swing.JSplitPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSplitPane getSppDesignArea() {
	if (ivjSppDesignArea == null) {
		try {
			ivjSppDesignArea = new javax.swing.JSplitPane(javax.swing.JSplitPane.HORIZONTAL_SPLIT);
			ivjSppDesignArea.setName("SppDesignArea");
			ivjSppDesignArea.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
			ivjSppDesignArea.setDoubleBuffered(true);
			ivjSppDesignArea.setDividerLocation(215);
			ivjSppDesignArea.setPreferredSize(new java.awt.Dimension(214, 400));
			ivjSppDesignArea.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
			ivjSppDesignArea.setMinimumSize(new java.awt.Dimension(0, 0));
			ivjSppDesignArea.setContinuousLayout(true);
			getSppDesignArea().add(getSppControl(), "left");
			getSppDesignArea().add(getPnlEditArea(), "right");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjSppDesignArea;
}
/**
 * Return the SppMain property value.
 * @return javax.swing.JSplitPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSplitPane getSppMain() {
	if (ivjSppMain == null) {
		try {
			ivjSppMain = new javax.swing.JSplitPane(javax.swing.JSplitPane.VERTICAL_SPLIT);
			ivjSppMain.setName("SppMain");
			ivjSppMain.setDividerLocation(400);
			ivjSppMain.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
			ivjSppMain.setContinuousLayout(true);
			getSppMain().add(getSppDesignArea(), "top");
			getSppMain().add(getPnlLog(), "bottom");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjSppMain;
}
/**
 * Return the StbStatusbar property value.
 * @return ch.softenvironment.view.StatusBar
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ch.softenvironment.view.StatusBar getStbStatusbar() {
	if (ivjStbStatusbar == null) {
		try {
			ivjStbStatusbar = new ch.softenvironment.view.StatusBar();
			ivjStbStatusbar.setName("StbStatusbar");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjStbStatusbar;
}
/**
 * Return the TlbStandard property value.
 * @return ch.softenvironment.view.ToolBar
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ch.softenvironment.view.ToolBar getTlbStandard() {
	if (ivjTlbStandard == null) {
		try {
			ivjTlbStandard = new ch.softenvironment.view.ToolBar();
			ivjTlbStandard.setName("TlbStandard");
			ivjTlbStandard.setTbbOpenEnabled(false);
			ivjTlbStandard.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
			ivjTlbStandard.setTbbPrintEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTlbStandard;
}
/**
 * Return the TlbUmlTools property value.
 * @return javax.swing.JToolBar
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JToolBar getTlbUmlTools() {
	if (ivjTlbUmlTools == null) {
		try {
			ivjTlbUmlTools = new javax.swing.JToolBar();
			ivjTlbUmlTools.setName("TlbUmlTools");
			ivjTlbUmlTools.setMaximumSize(new java.awt.Dimension(25, 2147483647));
			ivjTlbUmlTools.setFloatable(false);
			ivjTlbUmlTools.setPreferredSize(new java.awt.Dimension(25, 150));
			ivjTlbUmlTools.setMinimumSize(new java.awt.Dimension(25, 0));
			ivjTlbUmlTools.setOrientation(javax.swing.SwingConstants.VERTICAL);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTlbUmlTools;
}
/**
 * Dummy Method because of VAJ-Bug.
 *
 */
private JPanel getTreProjects() {
	// There must be a hideen connection "connEtoC1" which cannot be removed properly
	// resp. saveBean() generates references
	// @see inner class mouseReleased()
	Tracer.getInstance().developerWarning("VA-BUG: method actually not necessary");//$NON-NLS-2$//$NON-NLS-1$
	return new JPanel();
}
/**
 * getUndoManager method comment.
 */
public CH.ifa.draw.util.UndoManager getUndoManager() {
	if (undoManager == null) {
		undoManager = new UndoManager();
	}
	return undoManager;
}
/**
 * Return the Version of this Application.
 */
public static String getVersion() {
	// depends on softEnvironment Base Framework Version 2.2.2

        if(version==null){
	  java.util.ResourceBundle resVersion = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/Version");  //$NON-NLS-1$
          // Major version numbers identify significant functional changes.
          // Minor version numbers identify smaller extensions to the functionality.
          // Micro versions are even finer grained versions.
          StringBuffer ret=new StringBuffer(20);
	  ret.append(resVersion.getString("versionMajor"));//$NON-NLS-1$
          ret.append('.');
	  ret.append(resVersion.getString("versionMinor"));//$NON-NLS-1$
          ret.append('.');
	  ret.append(resVersion.getString("versionMicro"));//$NON-NLS-1$
          ret.append('-');
	  ret.append(resVersion.getString("versionDate"));//$NON-NLS-1$
          version=ret.toString();
        }
        return version;
}
/**
 * Return the WindowJMenuBar property value.
 * @return javax.swing.JMenuBar
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuBar getWindowJMenuBar() {
	if (ivjWindowJMenuBar == null) {
		try {
			ivjWindowJMenuBar = new javax.swing.JMenuBar();
			ivjWindowJMenuBar.setName("WindowJMenuBar");
			ivjWindowJMenuBar.add(getMnuFile());
			ivjWindowJMenuBar.add(getMnuEdit());
			ivjWindowJMenuBar.add(getMnuView());
			ivjWindowJMenuBar.add(getMnuFormat());
			ivjWindowJMenuBar.add(getMnuExtras());
			ivjWindowJMenuBar.add(getMnuReports());
			ivjWindowJMenuBar.add(getMnuTools());
			ivjWindowJMenuBar.add(getMnuWindow());
			ivjWindowJMenuBar.add(getMnuHelp());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjWindowJMenuBar;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
public void handleException(java.lang.Throwable exception) {
	log(getResourceString("CERuntimeError"), exception.toString()); //$NON-NLS-1$
	super.handleException(exception);
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
public void handleException(java.lang.Throwable exception, String title, String message) {
	log(getResourceString("CERuntimeError"), title + "->" + message + "[" + exception.toString() + "]");//$NON-NLS-4$//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
	BaseDialog.showError(this, title , message, exception);
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
        if(mainHB!=null){
          getMniHelp().addActionListener(new javax.help.CSH.DisplayHelpFromSource(mainHB));
        }
	// user code end
	getMniAbout().addActionListener(ivjEventHandler);
	getTreProjects().addMouseListener(ivjEventHandler);
	getMniFileOpen().addActionListener(ivjEventHandler);
	getMniNewFile().addActionListener(ivjEventHandler);
	getMniExit().addActionListener(ivjEventHandler);
// removed because of added JavaHelp
//	getMniHelp().addActionListener(ivjEventHandler);
	getMniPrint().addActionListener(ivjEventHandler);
	getMniOptions().addActionListener(ivjEventHandler);
	getMniObjectCatalog().addActionListener(ivjEventHandler);
	getMniImportInterlis().addActionListener(ivjEventHandler);
	getMniExportInterlis().addActionListener(ivjEventHandler);
	getMniCheckModel().addActionListener(ivjEventHandler);
	getMniSave().addActionListener(ivjEventHandler);
	getMniCascadeWindows().addActionListener(ivjEventHandler);
	getMniTileWindows().addActionListener(ivjEventHandler);
	getMniGroupImport().addActionListener(ivjEventHandler);
	getMniLayoutDiagram().addActionListener(ivjEventHandler);
	getPnlDocumentation().addSimpleEditorPanelListener(ivjEventHandler);
	getMncToolbar().addItemListener(ivjEventHandler);
	getMncStatusbar().addItemListener(ivjEventHandler);
	getMniSaveAs().addActionListener(ivjEventHandler);
	this.addWindowListener(ivjEventHandler);
	getMniStructure().addActionListener(ivjEventHandler);
	getTlbStandard().addToolBarListener(ivjEventHandler);
	getMniXmlExport().addActionListener(ivjEventHandler);
	getMniImportXmiRose().addActionListener(ivjEventHandler);
	getMniFindReplace().addActionListener(ivjEventHandler);
	getMniUndo().addActionListener(ivjEventHandler);
	getMniRedo().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
	    instance = this;
		initHelp();
		initializeView();
		// user code end
		setName("Window");
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setJMenuBar(getWindowJMenuBar());
		setSize(783, 573);
		setTitle("UML/INTERLIS-Editor");
		setContentPane(getFrcContents());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
getMniUndo().setEnabled(false);
getMniRedo().setEnabled(false);

	mnuFileHistory = new FileHistoryMenu(this, 10, getSettings().getLastFiles());
	getMnuFile().insert((javax.swing.JMenuItem)mnuFileHistory, 2 /* second */);
	getMnuReports().add(new AbstractAction(getResourceString("MniObjectCataloWoSecNr_text")) { //$NON-NLS-1$
		public void actionPerformed(ActionEvent event) {
			mniObjectCatalogWoChNr();
		}
	});
	getMnuInterlisTools().add(new AbstractAction(getResourceString("MniGmlExport_text")) { //$NON-NLS-1$
		public void actionPerformed(ActionEvent event) {
			mniGmlExport();
		}
	});

	// restore Window Coordinates
	java.awt.Insets insets = instance.getInsets();
	setLocation(getSettings().getWindowX().intValue(), getSettings().getWindowY().intValue());
	setSize(getSettings().getWindowWidth().intValue() + insets.left + insets.right, getSettings().getWindowHeight().intValue() + insets.top + insets.bottom);
	initPlugins();
	// user code end
}

private void initHelp()
{
  // Find the HelpSet file and create the HelpSet object:
  javax.help.HelpSet hs =null;
   try {
      java.net.URL hsURL = javax.help.HelpSet.findHelpSet(null, "ch/ehi/umleditor/help/main.hs");
      hs= new javax.help.HelpSet(null, hsURL);
   } catch (Exception ex) {
      //System.out.println("HelpSet not found");
      handleException(ex,"umleditor","HelpSet not found");
      return;
   }

    // Create a HelpBroker object:
   mainHB = hs.createHelpBroker();

}

/**
 * Initialize the View.
 * @see initialize()
 */
protected void initializeView() {
    addWindowListener(new java.awt.event.WindowAdapter() {
		public void windowClosing(java.awt.event.WindowEvent e) {
			dispose();
		};
	});
    
	// initialize LauncherMenu
	createLookAndFeelMenu(getMnuLookAndFeel());

	// initialize Drawing Area
	mdiListeners = new Vector();
	addInternalFrameListener(this);

	// used by adaptTools()
	new Iconkit(this);
	refreshDocumentation();
}
/**
 * Invoked when an internal frame is activated.
 * @see javax.swing.JInternalFrame#setSelected
 */
public void internalFrameActivated(javax.swing.event.InternalFrameEvent e) {
	activateFrame((DrawingFrame)e.getSource());
}
/**
 * Invoked when an internal frame has been closed.
 * @see javax.swing.JInternalFrame#setClosed
 */
public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
	deActivateFrame((DrawingFrame)e.getSource());
}
/**
 * Invoked when an internal frame is in the process of being closed.
 * The close operation can be overridden at this point.
 * @see javax.swing.JInternalFrame#setDefaultCloseOperation
 */
public void internalFrameClosing(javax.swing.event.InternalFrameEvent e) {
	deActivateFrame((DrawingFrame)e.getSource());
}
/**
 * Invoked when an internal frame is de-activated.
 * @see javax.swing.JInternalFrame#setSelected
 */
public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent e) {
	deActivateFrame((DrawingFrame)e.getSource());
}
/**
 * Invoked when an internal frame is de-iconified.
 * @see javax.swing.JInternalFrame#setIcon
 */
public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent e) {
	activateFrame((DrawingFrame)e.getSource());
}
/**
 * Invoked when an internal frame is iconified.
 * @see javax.swing.JInternalFrame#setIcon
 */
public void internalFrameIconified(javax.swing.event.InternalFrameEvent e) {
	deActivateFrame((DrawingFrame)e.getSource());
}
/**
 * Invoked when a internal frame has been opened.
 * @see javax.swing.JInternalFrame#show
 */
public void internalFrameOpened(javax.swing.event.InternalFrameEvent e) {
	activateFrame((DrawingFrame)e.getSource());
}
/**
 * Forward a log-Message to the LogView.
 */
public void log(String title, String logText) {
	try {
		getPnlLog().appendText(title, logText);
	} catch(Throwable e) {
		Tracer.getInstance().developerError(e.getLocalizedMessage());
	}
}
/**
 * Forward a log-Message to the LogView.
 */
public void log(String id, String title, String logText) {
	try {
		getPnlLog().appendText(id, title, logText);
	} catch(Throwable e) {
		Tracer.getInstance().developerError(e.getLocalizedMessage());
	}
}
/**
 * main entrypoint - starts the part when it is run as an application
 * @param args java.lang.String[] @see Tracer.start(String[])
 */
public static void main(java.lang.String[] args) {
	try {
		Tracer.start(args);

		// ce2004-06-23 don't change default Locale!!! use (existing) system administration tool!
		//Locale.setDefault(new Locale(settings.getLanguage(), settings.getCountry()));
		//Tracer.getInstance().runtimeInfo("Locale might have changed to: " + java.util.Locale.getDefault().toString());
		
ch.ehi.basics.types.NlsString.setDefaultLanguage(getSettings().getLanguage());

		showSplashScreen(new Dimension(450, 400), IMAGE_PATH + "splash.gif");//$NON-NLS-1$

		instance = new LauncherView();
		
		for(int i=0;i<args.length;i++){
			if(args[i].equals("-trace") || args[i].equals("-debug")){
				EhiLogger.getInstance().setTraceFilter(false); // default config is: filter trace messages
			}
		}
		instance.logListener=new LogListener(instance.getPnlLog());
		EhiLogger.getInstance().addListener(instance.logListener);
		instance.setLookAndFeel(getSettings().getLookAndFeel());
	//TODO patch: setModel(..)->openDiagram would be too early here
	instance.setCurrentFile(null);
	instance.setModel(null /*, null*/);

				// restore Coordinates of SubPanels
		instance.getSppMain().setDividerLocation(getSettings().getWindowHeight().intValue() - getSettings().getLogHeight().intValue());
		instance.getSppControl().setDividerLocation(getSettings().getWindowHeight().intValue() - getSettings().getDescriptionHeight().intValue());
		instance.getSppDesignArea().setDividerLocation(getSettings().getDescriptionWidth().intValue());


		instance.show();
		instance.openInitialDiagram();

		instance.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("Exception occurred in main() of javax.swing.JFrame");//$NON-NLS-1$
		exception.printStackTrace(System.out);
		BaseDialog.showError(instance, ResourceManager.getResource(LauncherView.class, "CTStartupError"), "in main()", exception);//$NON-NLS-2$ //$NON-NLS-1$
		System.exit(-1);
	}
}
public LogListener getLogListener()
{
	return logListener;
}
/**
 *This function gets called when a change to a metamodel object occured.
 */
public void metaModelChanged(MetaModelChange event) {
	setModelChanged(true);
/*
	// adapt Window title
	if (event.getSource() instanceof ch.ehi.uml1_4.implementation.UmlModel) {
 		setTitle();
	}
*/
	// Keep documentation up to date
	if (event.getSource() == currentElement) {
 		refreshDocumentation();
	}
}
/**
 * Show AboutBox.
 */
private void mniAboutBox() {
	tool().deactivate();
	new AboutBoxDialog(this);
	tool().activate();
}
/**
 * Show Internal Frames cascaded.
 */
private void mniCascadeWindows() {
	tool().deactivate();
	getDtpDrawArea().cascadeFrames();
	tool().activate();
}
/**
 * Copy-Function.
 */
protected void mniCopy() {
	tool().deactivate();
	nyi(CommonUserAccess.getMniEditCopyText());//$NON-NLS-1$
	tool().activate();
}
/**
 * Cut-Function.
 */
protected void mniCut() {
	tool().deactivate();
	nyi(CommonUserAccess.getMniEditCutText());//$NON-NLS-1$
	tool().activate();
}
/**
 * Open the FindDialog.
 */
private void mniFindReplace() {
	new FindDialog(this, false);
}
/**
 * Interlis-Import.
 */
private void mniGroupImport() {
	tool().deactivate();
	ch.ehi.umleditor.interlis.iliimport.ImportInterlis.readFileset();
	tool().activate();
}
/**
 * Show Help.
 */
private void mniHelp() {
	tool().deactivate();

	String umlEditorHome;
    String classpath = System.getProperty("java.class.path");//$NON-NLS-1$
    int index = classpath.toLowerCase().indexOf("umleditor.jar");//$NON-NLS-1$
    int start = classpath.lastIndexOf(java.io.File.pathSeparator,index) + 1;
    if(index > start) {
		umlEditorHome = classpath.substring(start, index - 1);
    } else {
		umlEditorHome =System.getProperty("user.dir");//$NON-NLS-1$
    }
    ch.ehi.basics.view.BrowserControl.displayURL(umlEditorHome + "/doc/index.html");//$NON-NLS-1$

	tool().activate();
}
/**
 * Interlis-Export.
 */
private void mniInterlisExport() {
	tool().deactivate();
	ch.ehi.umleditor.interlis.iliexport.ExportInterlis.writeFileset();
	tool().activate();
}
/**
 * Import a File into Model.
 */
private void mniInterlisImport() {
	tool().deactivate();
	ch.ehi.umleditor.interlis.iliimport.ImportInterlis.doImport();
	tool().activate();
}
/**
 * Layout current Diagram.
 */
private void mniLayoutDiagram() {
	tool().deactivate();
	ch.ehi.umleditor.format.LayoutDiagram.layoutCurrentDiagram();
	tool().activate();
}
/**
 * Initiate a ModelCheck.
 */
private void mniModelCheck() {
	tool().deactivate();
	ch.ehi.umleditor.interlis.modelcheck.CheckModel.checkAll();
	tool().activate();
}
/**
 * Create a new file.
 */
private void mniNewFile() {
	tool().deactivate();
	try {
		if (saveCurrentChanges()) {
			// create new empty project
			ElementFactory.resetCounter();
			setCurrentFile(null);
			setModel(null /*, null*/);
			log(getResourceString("CIModelNew"), "");//$NON-NLS-2$ //$NON-NLS-1$
			openInitialDiagram();
		}
	} catch(Throwable e) {
		handleException(e);
	}
	tool().activate();
}
/**
 * Build an Object Catalog.
 */
private void mniObjectCatalog() {
	tool().deactivate();
	ch.ehi.umleditor.objectcatalog.ObjectCatalog.writeAllHtml();
	tool().activate();
}
private void mniObjectCatalogWoChNr() {
	tool().deactivate();
	ch.ehi.umleditor.objectcatalog.ObjectCatalog.writeAllHtml(false);
	tool().activate();
}
private void mniGmlExport() {
	tool().deactivate();
	ch.ehi.umleditor.interlis.iliexport.ExportInterlis.writeGML();
	tool().activate();
}
/**
 * Shows a file dialog and opens a drawing.
 */
private void mniOpenFile() {
	tool().deactivate();
	if (saveCurrentChanges()) {
		FileChooser openDialog = new FileChooser(getSettings().getWorkingDirectory());
		openDialog.setDialogTitle(CommonUserAccess.getTitleFileOpen());
		openDialog.addChoosableFileFilter(createUmlInterlisEditorFilter());

		if (openDialog.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			getSettings().setWorkingDirectory(openDialog.getCurrentDirectory().getAbsolutePath());
			setModelChanged(false);
			openFile(openDialog.getSelectedFile().getAbsolutePath());
		}
	}
	tool().activate();
}
/**
 * Show Options Dialog.
 */
private void mniOptions() {
	tool().deactivate();
	new OptionsDialog(this);
	tool().activate();
}
/**
 * Paste-Function.
 */
protected void mniPaste() {
	tool().deactivate();
	nyi("Paste");//$NON-NLS-1$
	tool().activate();
}
/**
 * Open a Print Dialog.
 */
protected void mniPrint() {
	tool().deactivate();
	new PrintDialog(this);
	tool().activate();
}
/**
 * Redo-Function.
 */
protected void mniRedo() {
	tool().deactivate();
	nyi("Redo");//$NON-NLS-1$
	tool().activate();
}
/**
 * Remove whatever the current selection asks for.
 */
protected void mniRemove() {
	tool().deactivate();
	nyi("Löschen der aktuellen Selektion");//$NON-NLS-1$
	tool().activate();
}
/**
 * Show FileSaveDialog to save Model.
 */
private boolean mniSaveAs() {
	tool().deactivate();

	FileChooser saveDialog =  new FileChooser(getSettings().getWorkingDirectory());
	saveDialog.setDialogTitle(CommonUserAccess.getMniFileSaveAsText());
	saveDialog.addChoosableFileFilter(createUmlInterlisEditorFilter());

	if (saveDialog.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
		try {
			getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
			saveFile(saveDialog.getSelectedFile());
		} catch(java.io.IOException e) {
			handleException(e,"filesaveas",e.getMessage());
		} catch(Throwable e) {
			handleException(e);
		}
		tool().activate();
		return true;
	} else {
		// canceled
		tool().activate();
		return false;
	}
}
/**
 * Saves model and drawings into a file.
 */
private boolean mniSaveFile() {
	tool().deactivate();

	if (getCurrentFile() == null) {
		tool().activate();
		return mniSaveAs();
	} else {
		try {
			toolDone();
			saveFile(getCurrentFile());
		} catch(java.io.IOException e) {
			handleException(e,"filesave",e.getMessage());
		} catch(Throwable e) {
			handleException(e);
		}
		tool().activate();
		return true;
	}
}
/**
 * Structure-Report.
 */
protected void mniStructure() {
	tool().deactivate();
	ch.ehi.umleditor.objectcatalog.ObjectCatalog.writeStructureHtml();
	tool().activate();
}
/**
 * Show InternalFrames tiled.
 */
private void mniTile() {
	tool().deactivate();
	getDtpDrawArea().tileFrames();
	tool().activate();
}
/**
 * Show InternalFrames tiled.
 */
private void mniTileWindows() {
	tool().deactivate();
	getDtpDrawArea().tileFrames();
	tool().activate();
}
/**
 * Undo-Function.
 */
protected void mniUndo() {
	tool().deactivate();
	nyi("Undo");//$NON-NLS-1$
	tool().activate();
}
/**
 * Import an XMI Rational Rose File into Model.
 */
private void mniXmiRoseImport() {
	tool().deactivate();
	ch.ehi.umleditor.rose.RoseInterface.importXmi();
	tool().activate();
}
/**
 * XSD-Export.
 */
private void mniXmlSchemeExport() {
	tool().deactivate();
	ch.ehi.umleditor.interlis.iliexport.ExportInterlis.writeXSD();
	tool().activate();
}
/**
 * @see #setModel(Model)
 */
private void openInitialDiagram() {
	if (instance.initialDiagram != null) {
		instance.createClassDiagram(instance.initialDiagram);
	}
	getTlbStandard().setTbbNewEnabled(true);
	getTlbStandard().setTbbOpenEnabled(true);
	getTlbStandard().setTbbPrintEnabled(true);
}
/**
 * The user moved the mouse over the palette entry.
 */
public void paletteUserOver(PaletteButton button, boolean inside) {
    ToolButton toolButton = (ToolButton) button;
    if (inside) {
        showStatus(toolButton.name());
    } else {
        if (selectedToolButton == null) {
            showStatus(null);
        } else {
            showStatus(selectedToolButton.name());
        }
    }
}
/**
 * The user selected a palette entry. The selected button is
 * passed as an argument.
 * @see PaletteListener
 */
public void paletteUserSelected(PaletteButton button) {
	ToolButton toolButton = (ToolButton)button;
	setSelectedTool(toolButton);
}
/**
 * Print the given ClassDiagram.
 */
public void printClassDiagram(ClassDiagramView classDiagram) {
	tool().deactivate();
/*
	// Old fashioned way
	PrintJob printJob = getToolkit().getPrintJob(this, StringUtils.formatMessage(resLauncherView.getString("CIPrintClassDiagram"), ((Diagram)classDiagram.getDiagram()).getName().getValue()), null);//$NON-NLS-2$ //$NON-NLS-1$

	if (printJob != null) {
		Graphics graphics = printJob.getGraphics();
		if (graphics != null) {
			classDiagram.printAll(graphics);
			graphics.dispose(); // flush page
		}
		printJob.end();
	}
*/
  	java.awt.print.PrinterJob printJob = java.awt.print.PrinterJob.getPrinterJob();
    printJob.setJobName(NlsUtils.formatMessage(getResourceString("CIPrintClassDiagram"),((Diagram)classDiagram.getDiagram()).getName().getValue()));

    java.awt.print.PageFormat pf = printJob.pageDialog(printJob.defaultPage());
    printJob.setPrintable(new PrintWrapper(classDiagram),pf);

    if (printJob.printDialog()) {
	    // Print the job if the user didn't cancel printing
              // Ask user for page format (e.g., portrait/landscape)
		try {
  		  printJob.print();
  		} catch(java.awt.print.PrinterException ex) {
            handleException(ex);
		}
	}

	tool().activate();
}
/**
 * Print NavigationTree.
 */
protected void printNavigationTree() {
	tool().deactivate();

	PrintJob printJob = getToolkit().getPrintJob(this, getResourceString("CIPrintNavTree"), null); //$NON-NLS-1$

	if (printJob != null) {
		Graphics graphics = printJob.getGraphics();
		if (graphics != null) {
			getPnlNavigation().printAll(graphics);
			graphics.dispose(); // flush page
		}
		printJob.end();
	}

	tool().activate();
}
/**
 * Show refreshed documentation of the currently selected Element in Navigationtree.
 *
 */
private void refreshDocumentation() {
	if (currentElement == null) {
	    getPnlDocumentation().setEditable(false);
		getPnlDocumentation().setText(null);
	} else {
		if ((getPnlDocumentation().getText() != null) && (!getPnlDocumentation().getText().equals(ElementUtils.mapNlsString(currentElement.getDocumentation())))) {
			getPnlDocumentation().setText(ElementUtils.mapNlsString(currentElement.getDocumentation()));
		}
		getPnlDocumentation().setEditable(true);
	}
}
/**
 * Refresh all internal frames.
 * @deprecated
 */
public void refreshInternalFrames(DrawingView currentView) {
	JInternalFrame[] frames = getDtpDrawArea().getAllFrames();
	for (int i=0; i<frames.length; i++) {
		if (!((DrawingFrame)frames[i]).getDrawingView().equals(currentView)) {
//			frames[i].dispose();
			((DrawingFrame)frames[i]).getDrawingView().checkDamage();
		}
	}
}
/**
 * Refresh the current Model (for e.g. after an Import).
 */
public void refreshModel() {
/*
	// clear current model
	if (ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().containsMetaModelListener(this)) {
		// unregister Listener while building new model
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().removeMetaModelListener(this);
	}
	getDtpDrawArea().removeAll();
	getDtpDrawArea().repaint();
	currentFrame = null;
	adaptTools();
	getPnlLog().clear();

	// register Listener
	MetaModel.getInstance().addMetaModelListener(this);

	log("Modell geladen", "von Datei: " + model.getName());
	this.model = model;
*/
	getPnlNavigation().setModel(getModel());

//	setTitle();
	setModelChanged(true);
}
/**
 * removeViewChangeListener method comment.
 */
public void removeViewChangeListener(CH.ifa.draw.framework.ViewChangeListener vsl) {}
/**
 * Check whether model has changed.
 * @return boolean (whether proceed or not)
 */
private boolean saveCurrentChanges() {
	try {
		toolDone();

		if (hasModelChanged) {
		    Boolean answer = BaseDialog.showConfirmExit((java.awt.Component)this);
			if (answer == Boolean.TRUE) {
				return mniSaveFile();
			} else {
				return !(answer == null);
			}
		} else {
			return true;
		}
	} catch(Throwable e) {
		handleException(e);
		return false;
	}
}
/**
 * Save the documentation of the currentElement
 */
private void saveDocumentation() {
	// update current documentation
	if ((currentElement != null) && getPnlDocumentation().hasContentsChanged()) {
	    currentElement.setDocumentation(new ch.ehi.basics.types.NlsString(currentElement.getDocumentation(), getPnlDocumentation().getText()));
	}
}
/**
 * Save Model into file.
 */
private void saveFile(java.io.File file) throws java.io.IOException {
	PersistenceService service = new PersistenceService();
	// do not save file name in UmlModel
	service.writeFile(file.getAbsolutePath(), getModel());
	setCurrentFile(file); // set title before changed flag is cleared
	setModelChanged(false);
	log(getResourceString("CIModelSaved"), getResourceString("CIInFile") + file.getAbsolutePath()); //$NON-NLS-2$ //$NON-NLS-1$
	mnuFileHistory.addRecent(file.getAbsolutePath());
}
/**
 * Triggered on windowClosing-Event (Alt-F4, X-close-function).
 * @see #dispose()
 */
private boolean saveOnClosing() {
	if (saveCurrentChanges()) {
		// save coordinates
		Dimension dimension = getSize();
		int windowHeight = (int)dimension.getHeight();

		getSettings().setWindowWidth(new Integer((int)dimension.getWidth()));
		getSettings().setWindowHeight(new Integer(windowHeight));
		Point origin = getLocation();
		getSettings().setWindowX(new Integer((int)origin.getX()));
		getSettings().setWindowY(new Integer((int)origin.getY()));
		dimension = getPnlDocumentation().getSize();
		getSettings().setDescriptionWidth(new Integer((int)dimension.getWidth()));
		getSettings().setDescriptionHeight(new Integer(windowHeight - (int)dimension.getHeight()));
		dimension = getPnlLog().getSize();
	//	getSettings().setLogHeight(new Integer((int)dimension.getHeight()));
		getSettings().setLogHeight(new Integer(windowHeight - getSppMain().getDividerLocation()));
		getSettings().setDescriptionHeight(new Integer(windowHeight - getSppControl().getDividerLocation()));
		getSettings().setDescriptionWidth(new Integer(getSppDesignArea().getDividerLocation()));
		getSettings().setLastFiles(mnuFileHistory.getHistory());
		getSettings().save();

		if (MetaModel.getInstance().containsMetaModelListener(this)) {
			// in case Close-Event comes several times
			MetaModel.getInstance().removeMetaModelListener(this);
			Tracer.getInstance().stop();
		}

		return true;
	} else {
		return false;
	}
}
/**
 * Informs that the current selection has changed.
 * @see DrawingEditor
 */
public void selectionChanged(DrawingView view) {
	// Handle main menu()
}
/**
 * Keep activated Diagram in Mind.
 */
private void setCurrentFrame(DrawingFrame drawingFrame) {
	currentFrame = drawingFrame;
	getMniLayoutDiagram().setEnabled(drawingFrame != null);
	adaptTools(drawingFrame);
}
/**
 * Set the focused element to keep changes of its documentation.
 *
 * @param element
 */
public void setDescription(Element element) {
	if (currentElement != element) {
	    // saveDocumentation(); -> done at keyReleased

	    // replace current element
	    currentElement = element;
		refreshDocumentation();
	}
}
/**
 * Overwrites
 */
protected void setLookAndFeel(String style) {
	super.setLookAndFeel(style);

	// keep Settings in Profile
	getSettings().setLookAndFeel(style);
}
/**
 * Set a new Model.
 * @param model UmlModel
 * @param file File where UmlModel is saved in
 */
private void setModel(Model model /*, java.io.File file*/) throws Throwable {
	// clear current model
	if (ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().containsMetaModelListener(this)) {
		// unregister Listener while building new model
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().removeMetaModelListener(this);
	}
	getDtpDrawArea().removeAll();
	getDtpDrawArea().repaint();
	setCurrentFrame(null);
	setDescription(null);
	getPnlLog().clear();

//	setTitle(file);

	// register Listener
	MetaModel.getInstance().addMetaModelListener(this);
	if (model == null) {
		this.model = (Model)ElementFactory.createObject(ch.ehi.uml1_4.implementation.UmlModel.class);
		// ch.ehi.interlis.modeltopicclass.Ili2ModelSet ili2ModelSet = (Ili2ModelSet)ElementMapper.createOwnedElement(Ili2ModelSet.class, this.model);
		INTERLIS2Def interlis2Def = ElementFactory.createINTERLIS2Def(this.model);
		ModelDef modelDef = ElementFactory.createModelDef(interlis2Def);
		TopicDef topicDef = ElementFactory.createTopicDef(modelDef);

		// @see #openInitialDiagram()
		initialDiagram = (Diagram)ElementFactory.createDiagram(topicDef);
                try{
                  new ch.ehi.umleditor.interlis.iliimport.TransferFromIli2cMetamodel().loadPredefinedIli2cModel(this.model);
                }catch(Exception ex){
                  handleException(ex);
                }
	} else {
		this.model = model;
	}

	getPnlNavigation().setModel(this.model);

	setModelChanged(false);
}
/**
 * Keep changes of Model in mind.
 */
private void setModelChanged(boolean changed) {
	hasModelChanged = changed;
	getMniSave().setEnabled(changed);
	getTlbStandard().setTbbSaveEnabled(changed);
}
private void setSelectedTool(ToolButton button) {
	// release current Tool
	if (selectedToolButton != null) {
		tool().deactivate();
		selectedToolButton.reset();
	}

	// set new current Tool
	selectedToolButton = button;
	if (selectedToolButton == null) {
		showStatus(null);
	} else {
		showStatus(button.name());
		tool().activate();
		selectedToolButton.select();
	}
}
/**
 * Set current working UML-File.
 * @param file
 */
private void setCurrentFile(java.io.File file) {
	currentFile = file;

	if (file == null) {
		setTitle(getApplicationName() + " - " + defaultFileName);//$NON-NLS-1$
	} else {
		setTitle(getApplicationName() + " - " + file.getName());//$NON-NLS-1$
	}
        if(model!=null){
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
              new ch.ehi.uml1_4.changepropagation.MetaModelChange(model,"setName"));
        }
}
/**
 * Show the Specification Dialog of the ModelElement.
 * The Dialog will be presented generically according to the User Selection.
 */
public void showSpecification(Element element) {
	if(element instanceof ch.ehi.interlis.associations.Participant){
		element=((ch.ehi.interlis.associations.Participant)element).getAssociation();
	}
	try {
		java.lang.Class types[] = { java.awt.Frame.class, Element.class };
		Object args[] = { this, element };
		java.lang.reflect.Constructor constructor = ElementUtils.getElementDialog(element).getConstructor(types);
		constructor.newInstance(args);
	} catch(Throwable e) {
		// Dialog error
		handleException(e);
	}
}
/*
 * Display a StatusMessage in the StatusBar.
 * @see DrawingEditor
 */
public void showStatus(String string) {
	getStbStatusbar().setStatus(string);
}
/**
 * Show/hide Standard Toolbar.
 */
private void toggleStandardToolbar() {
	if (getMncToolbar().isSelected()) {
		getSettings().setShowToolBar(new Boolean(true));
		getTlbStandard().setVisible(true);
		int deltaHeight = getTlbStandard().getHeight();
		getSppMain().getTopComponent().setBounds(0, 0, getSppMain().getWidth(), getSppMain().getTopComponent().getHeight() - deltaHeight);
	} else {
		int deltaHeight = getTlbStandard().getHeight();
		getSettings().setShowToolBar(new Boolean(false));
		getTlbStandard().setVisible(false);
		getSppMain().getTopComponent().setBounds(0, 0, getSppMain().getWidth(), getSppMain().getTopComponent().getHeight() + deltaHeight);
	}
}
/**
 * Show/hide Statusbar.
 */
private void toggleStatusbar() {
	if (getMncStatusbar().isSelected()) {
		getStbStatusbar().setVisible(true);
		getSettings().setShowStatusBar(new Boolean(true));
		int deltaHeight = getStbStatusbar().getHeight();
		getSppMain().getTopComponent().setBounds(0, 0, getSppMain().getWidth(), getSppMain().getTopComponent().getHeight() - deltaHeight);
	} else {
		int deltaHeight = getStbStatusbar().getHeight();
		getStbStatusbar().setVisible(false);
		getSettings().setShowStatusBar(new Boolean(false));
		getSppMain().getTopComponent().setBounds(0, 0, getSppMain().getWidth(), getSppMain().getTopComponent().getHeight() + deltaHeight);
	}
}
/**
 * Gets the editor's current tool.
 * @see DrawingEditor
 */
public Tool tool() {
	if (selectedToolButton != null) {
		return selectedToolButton.tool();
	} else {
		return null;
	}
}
/**
 * Informs the editor that a tool has done its interaction.
 * This method can be used to switch back to the default tool.
 * @see DrawingEditor
 */
public void toolDone() {
	if (defaultToolButton != null) {
		setSelectedTool(defaultToolButton);
	}
}
/**
 * Gets the editor's current drawing view.
 * @see DrawingEditor
 */
public DrawingView view() {
	if (currentFrame == null) {
		return null;
	} else {
		return currentFrame.getDrawingView();
	}
}
/**
 * views method comment.
 */
public CH.ifa.draw.framework.DrawingView[] views() {
	JInternalFrame allFrames[] = getDtpDrawArea().getAllFrames();
	DrawingView array[] = new DrawingView[allFrames.length];
	for (int i=0; i<allFrames.length; i++) {
		array[i] = ((DrawingFrame)allFrames[i]).getDrawingView();
	}
	return array;
}
	public String getUmlEditorHome()
	{
		String umleditorHome;
		String classpath = System.getProperty("java.class.path");
		int index = classpath.toLowerCase().indexOf("umleditor.jar");
		int start = classpath.lastIndexOf(java.io.File.pathSeparator,index) + 1;
		if(index > start)
		{
			umleditorHome = classpath.substring(start,index - 1);
		}else{
			umleditorHome =System.getProperty("user.dir");
		}
		return umleditorHome;
	}
	private ch.ehi.umleditor.plugin.loader.PluginLoader pluginLoader=new ch.ehi.umleditor.plugin.loader.PluginLoader();
	private void initPlugins()
	{
		String umleditorHome=getUmlEditorHome();
		EhiLogger.logState(umleditorHome);
		if(umleditorHome != null){
			pluginLoader.loadPlugins(umleditorHome+"/plugins");
		}
		
		pluginLoader.startAllPlugins();
		
		Iterator it=pluginLoader.getAllPlugins().iterator();
		for(;it.hasNext();){
			ch.ehi.umleditor.plugin.AbstractPlugin p=(ch.ehi.umleditor.plugin.AbstractPlugin)it.next();
			p.addMenuItems(getWindowJMenuBar());
		}
	}
	/**
	 * @see ch.softenvironment.view.FileHistoryListener#openFile(java.lang.String)
	 */
	public void openFile(String filename) {
		try {
		    if (saveCurrentChanges()) {
				PersistenceService service = new PersistenceService();
				boolean old=MetaModel.setChangePropagation(false);
				Model newModel=service.readFile(filename);
				MetaModel.setChangePropagation(old);
				setCurrentFile(new java.io.File(filename));
				setModel(newModel /*, openDialog.getSelectedFile()*/);
				log(getResourceString("CIModelLoaded"), getResourceString("CIFromFile") + filename); //$NON-NLS-2$ //$NON-NLS-1$
				mnuFileHistory.addRecent(filename);
		    }
		} catch(java.io.FileNotFoundException e) {
			BaseDialog.showWarning((java.awt.Component)this, ResourceManager.getResource(FileHistoryMenu.class, "CTFileMissing"), ResourceManager.getResource(FileHistoryMenu.class, "CWFileMissing"));
			mnuFileHistory.removeRecent(filename);
		} catch(java.io.IOException e) {
			handleException(e,"fileopen",e.getMessage());
		} catch(Throwable e) {
			handleException(e);
		}
	}
}
