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
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import ch.softenvironment.util.Tracer;
/**
 * TemplateFrame defining minimal functionality.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public abstract class BaseFrame extends javax.swing.JFrame {
	// Relative Offset to Child Window
	private static java.util.ResourceBundle resBaseFrame = setResourceBundle();
	public final static int X_CHILD_OFFSET = 20;
	public final static int Y_CHILD_OFFSET = 15;
	protected static final String JAR_FILENAME = "Startup.jar";
/**
 * BaseFrame constructor comment.
 */
public BaseFrame() {
	super();
}
/**
 * BaseFrame constructor comment.
 * @param title java.lang.String
 */
public BaseFrame(String title) {
	super(title);
}
/**
 * Adapt the dependendencies in relation to a mouseEvent.
 *
 * For e.g. Adapt PopupMenuItems after a selection of a SearchTable-Row.
 * Overwrite this method.
 * @see genericPopupDisplay(..)
 */
protected void adaptSelection(MouseEvent event, JPopupMenu popupMenu) throws Throwable {
}
/**
 * Set the Listener for windowClosed-Events.
 */
protected final void addDefaultClosedListener() {
	/* Add a windowListener for the windowClosedEvent */
	addWindowListener(new java.awt.event.WindowAdapter() {
		public void windowClosed(java.awt.event.WindowEvent e) {
			System.exit(0);
		};
		//  public void windowClosing(java.awt.event.WindowEvent e) {
		//      System.exit(0);
		//  };
	});
}
/**
 * Set the Listener for windowClosing-Events.
 */
protected final void addDefaultClosingListener() {
	/* Add a windowListener for the windowClosedEvent */
	addWindowListener(new java.awt.event.WindowAdapter() {
		public void windowClosing(java.awt.event.WindowEvent e) {
			System.exit(0);
		};
	});
}
/**
 * Ask user whether the remove action shall be proceeded or not.
 * @see BaseDialog#checkDeletion()
 */
protected final boolean checkDeletion() {
	return checkDeletion(resBaseFrame.getString("CTDeletion"), resBaseFrame.getString("CQAcceptDeletion")); //$NON-NLS-2$ //$NON-NLS-1$
}
/**
 * Ask user whether the remove action shall be proceeded or not.
 * @param title String (of Deletion Message Box)
 * @param question String (of Deletion question)
 * @see BaseDialog#checkDeletion()
 */
protected final boolean checkDeletion(String title, String question) {
	try {
		QueryDialog dialog = new QueryDialog(this, title, question);
		dialog.dispose();
		return dialog.isYes();
	} catch(Throwable e) {
		handleException(e);
		return false;
	}
}
/**
 * Extend the given menu generically with plattform dependent Look&Feel styles.
 * @see #setLookAndFeel(String)
 */
protected final void createLookAndFeelMenu(JMenu lookAndFeelMenu) {
	UIManager.LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();
	JMenuItem menuItem = null;

	ButtonGroup buttons = new ButtonGroup();
	for (int i = 0; i < lafs.length; i++) {
		// create generic MenuItem-Button
		menuItem = new JRadioButtonMenuItem(lafs[i].getName());
		buttons.add(menuItem);
		final String lnfClassName = lafs[i].getClassName();
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setLookAndFeel(lnfClassName);
			}
		});
		lookAndFeelMenu.add(menuItem);
	}
}
/**
 * Call this method within #dispose() of Applications extending this Frame.
 * @see LauncherView#dispose()
 */
protected void disposeApplication() {
	Tracer.getInstance().stop();
	super.dispose();
	System.exit(0);
}
/**
 * Converts the stack trace into a string.
 */
public static String exceptionToString(Throwable exception) {
    java.io.StringWriter stringWriter = new java.io.StringWriter();
    java.io.PrintWriter writer = new java.io.PrintWriter(stringWriter);
   	exception.printStackTrace(writer);
    return stringWriter.toString();
}
/**
 * Critical Error. Application must be shut down.
 * @param title Dialogtitle
 */
public final void fatalError(JFrame frame, String title, String message, Throwable exception) {
	new ErrorDialog(frame, title, message + "\n" + resBaseFrame.getString("CEFatalError"), exception);
	System.exit(-1);
}
/**
 * Display a popup menu.
 * Ex. SearchTable to JPopupMenu
 * 1) Connect MouseReleased-Event (for Windows) and MousePressed-Event (for Unix) from Panel (for e.g. JScrollPane, JTablePane, etc) to this method.
 * 2) Connect JPopupMenu's this-property visually to the MouseReleased-Event's Parameter popupMenu.
 * 3) Overwrite #adaptSelection(MouseEvent, JPopupMenu)
 */
protected final void genericPopupDisplay(java.awt.event.MouseEvent event, javax.swing.JPopupMenu popupMenu) {
	try {
	 	adaptSelection(event, popupMenu);
 	 
		if (event.isPopupTrigger() && (popupMenu != null)) {
  	      popupMenu.show(event.getComponent(), event.getX(), event.getY());
		}
   	} catch(Throwable e) {
	   	handleException(e);
   	}
}
/**
 * Calculate the screen size
 * @return Dimension
 */

protected final static Dimension getScreenSize() {
	return(Toolkit.getDefaultToolkit().getScreenSize());
}
/**
 * Return the User-Directory (for e.g. where this Java-Program is located)
 * without a Path-Separator at the end.
 */
public static String getStartupPath(String jarFileName) {
	String home = null;

    String classpath = System.getProperty("java.class.path");//$NON-NLS-1$
    int index = classpath.toLowerCase().indexOf(jarFileName.toLowerCase());//$NON-NLS-1$
Tracer.getInstance().debug(BaseFrame.class, "getStartupPath(jarfile)", "index of jarfile = " + index);
    int start = classpath.lastIndexOf(java.io.File.pathSeparator,index) + 1;
    if (index > start) {
		home = classpath.substring(start, index - 1);
Tracer.getInstance().debug(BaseFrame.class, "getStartupPath(jarfile)", "home[JAR] = " + home);
    } else {

		home = System.getProperty("user.dir");//$NON-NLS-1$
Tracer.getInstance().debug(BaseFrame.class, "getStartupPath(jarfile)", "home[user.dir] = " + home);
	}

    return home;
}
/**
 * Top-level Handler.
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	showException(this, exception);
}
/**
 * Intitalize View.
 * Call this method in a View's standard initalize method to setup your stuff.
 * @see #initialize() // user code begin {1}..user code end
 */
protected abstract void initializeView() throws Throwable;
/**
 * Developer utility.
 * Inform user of <Not Yet Implemented> Feature.
 * @param title Dialogtitle
 */
public final void nyi(String title) {
	new WarningDialog(this, title, resBaseFrame.getString("CWNotYetImplemented")); //$NON-NLS-1$
}
/**
 * Set this Frame at center of screen.
 */
public final void setCenterLocation() {
    setCenterLocation(this);
}
/**
 * Set the given Window at center of screen.
 */
public final static void setCenterLocation(Window window) {
    Dimension screenSize = getScreenSize();
    Dimension frameSize = window.getSize();

    if (frameSize.height > screenSize.height) {
        frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
        frameSize.width = screenSize.width;
    }

    window.setLocation(
        new Point(
            (screenSize.width - frameSize.width) / 2,
            (screenSize.height - frameSize.height) / 2));
}
/**
 * Switch to a new Look&Feel during runtime
 * @see #createLookAndFeelMenu(JMenu)
 */
protected void setLookAndFeel(String style) {
	try {
		// javax.swing.UIManager.getSystemLookAndFeelClassName();
		//	UIManager.getCrossPlatformLookAndFeelClassName();		//metal (Java Standard)
		//	"com.sun.java.swing.plaf.motif.MotifLookAndFeel";		//Unix
		//  "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";	//Windows only
		//	"com.sun.java.swing.plaf.mac.MacLookAndFeel"; 			//Mac only
		//	"com.sun.java.swing.plaf.multi.MultiLookAndFeel";
		if ((style == null) || (style.length() == 0)) {
			UIManager.getSystemLookAndFeelClassName();
		} else {
			UIManager.setLookAndFeel(style);
		}
		SwingUtilities.updateComponentTreeUI(this);
	} catch (Throwable e) {
		new WarningDialog(this, resBaseFrame.getString("CTlookAndFeel"), NlsUtils.formatMessage(resBaseFrame.getString("CWManagerNotAvailable"), style) + "\n" + resBaseFrame.getString("CWSuppressManager")); //$NON-NLS-4$//$NON-NLS-3$ //$NON-NLS-2$ //$NON-NLS-1$
	}
}
/**
 * Set this Frame relative to parent.
 */
public final void setRelativeLocation(java.awt.Window parent) {
	if (parent != null) {
		setLocation(new Point(parent.getX() + X_CHILD_OFFSET,
								parent.getY() + Y_CHILD_OFFSET));
	}
}
/**
 * Allow reset in case Locale can be determined after UserLogin.
 */
protected static java.util.ResourceBundle setResourceBundle() {
	resBaseFrame = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/BaseFrame");
	return resBaseFrame;
}
/**
 * Set Look & Feel at startup of Application.
 * @see #setLookAndFeel(String)
 */
public final static void setSystemLookAndFeel() throws Throwable {
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
/**
 * Display Window.
 */
public void setVisible(boolean visible) {
//	setSize(getFrameSize());
	
	// setModal @see Dialog.show()
	
	super.setVisible(true);
}
/**
 * Top-level Handler.
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
public final static void showException(Window owner, java.lang.Throwable exception) {
	// update log
	Tracer.getInstance().runtimeWarning(owner, "handleException(..) -> stackTrace follows...", exception.toString());//$NON-NLS-1$
	exception.printStackTrace(System.out);

	// inform user
	String title = null; //$NON-NLS-1$
	String message = resBaseFrame.getString("CWTopLevelHandler"); //$NON-NLS-1$
	if (exception instanceof NumberFormatException) {
		
		if ((exception.getMessage().length() == 0) || exception.getMessage().equals("empty String") || (exception.getMessage().equals("-"))) {//$NON-NLS-2$//$NON-NLS-1$
Tracer.getInstance().hack(BaseFrame.class, "showException(..)", "exception message might change -> use another recognition");//$NON-NLS-2$//$NON-NLS-1$
			Tracer.getInstance().runtimeWarning(BaseFrame.class, "showException(.)", "Exception ignored: " + exception.toString());
			return;
		}

		title = resBaseFrame.getString("CTInputError"); //$NON-NLS-1$
		message = resBaseFrame.getString("CENumberFormat") + "\n  => " + exception.getLocalizedMessage();//$NON-NLS-2$ //$NON-NLS-1$
	} else if (exception instanceof DeveloperException) {
		title = ((DeveloperException)exception).getTitle();
		message = exception.getMessage();
	} else if (exception instanceof java.sql.SQLException) {
		title = resBaseFrame.getString("CTSQLError");
		java.sql.SQLException sqlEx = (java.sql.SQLException)exception;
		message = sqlEx.getLocalizedMessage() + " (" + resBaseFrame.getString("CESQLState") + sqlEx.getSQLState() + ")";
		if (sqlEx.getNextException() != null) {
			message = message + "\n" + sqlEx.getNextException();
		}
//		message = message + "\n" + resBaseFrame.getString("CESQLReasons");
	}
	
	if ((owner == null) || (owner instanceof Frame)) {
		new ErrorDialog((Frame)owner, title , message, exception);
	} else if (owner instanceof Dialog) {
		new ErrorDialog((Dialog)owner, title , message, exception);
	} else {
Tracer.getInstance().nyi(BaseFrame.class, "showException()");//$NON-NLS-1$
	}
}
/**
 * Show a SplashScreen.
 * Typically used at Application startup.
 */
protected final static void showSplashScreen(Dimension preferredWindowSize, String image) {
	try {
		Window window = new SplashScreen(preferredWindowSize, image);
		
		/* Create the splash screen */
		window.pack();

		/* Center splash screen */
		setCenterLocation(window);
		window.setVisible(true);

		Thread.sleep(5000);

		window.dispose();
	} catch (Throwable e) {
		Tracer.getInstance().runtimeWarning(BaseFrame.class, "showSplashScreen(<image=" + image + " +>)", e.toString());//$NON-NLS-2$//$NON-NLS-1$
	}
}
/**
 * Critical Error. Application must be shut down.
 * @param title Dialogtitle
 */
public final void transactionError(JFrame frame, Throwable exception) {
	fatalError(frame, resBaseFrame.getString("CTTransactionError"), resBaseFrame.getString("CETransactionError"), exception);
}
}
