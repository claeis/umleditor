/*
 * @(#)DragNDropTool.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.contrib;

import CH.ifa.draw.standard.AbstractTool;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Vector;
import CH.ifa.draw.framework.*;
import java.awt.dnd.*;
import java.util.*;
import java.awt.datatransfer.*;
import java.io.IOException;
import java.awt.datatransfer.*;
import java.io.Serializable;
import CH.ifa.draw.contrib.*;
import CH.ifa.draw.standard.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * This is a tool which handles drag and drop between Components in
 * JHotDraw and drags from JHotDraw.  It also indirectly
 * handles management of Drops from extra-JVM sources.
 *
 * There can be only 1 such tool in an application.  A view can be registered
 * with only a single DropSource as far as I know.
 *
 * @todo    For intra JVM transfers we need to pass Point origin as well, and not
 * assume it will be valid which currently will cause a null pointer exception.
 * or worse, will be valid with some local value.
 * The dropSource will prevent simultaneous drops.
 *
 * For a Container to be initialized to support Drag and Drop, it must first
 * have a connection to a heavyweight component.  Or more precisely it must have
 * a peer.  That means new Component() is not capable of being initiated until
 * it has attachment to a top level component i.e. JFrame.add(comp);  If you add
 * a Component to a Container, that Container must be the child of some
 * Container which is added in its heirachy to a topmost Component.  I will
 * refine this description with more appropriate terms as I think of new ways to
 * express this.
 *
 * @author  SourceForge(dnoyeb) aka C.L.Gilbert
 * @version <$CURRENT_VERSION$>
 */
public class DragNDropTool extends AbstractTool implements DropTargetListener,
													DragGestureListener,
													DragSourceListener {
	protected Tool            fChild = null;
	protected DragSource      dragSource = null;
	private   ArrayList       fDropTargets = null;
	private   ArrayList       fDragGestureRecognizers=null;
	/**
	 * origin must be made to go in the Transferable somehow.
	 */
	private   Point           origin = null;
	public static DataFlavor VECTORFlavor = new DataFlavor( Vector.class , "Vector");
	public static DataFlavor ASCIIFlavor = new DataFlavor("text/plain; charset=ascii", "ASCII text");

	public DragNDropTool(DrawingEditor editor) {
		super(editor);
//		dragSource = new DragSource();
		dragSource = DragSource.getDefaultDragSource();
//		System.out.println("Visible Image support = " + dragSource.isDragImageSupported());
		fDropTargets = new ArrayList();
		fDragGestureRecognizers = new ArrayList();
	}

	/**
	 * Sent when a new view is created
	 */
	public void viewCreated(DrawingView view) {
		super.viewCreated(view);
		if(Component.class.isInstance( view )/* && DNDInterface.class.isInstance( views[x] )*/) {
			Component c = (Component) view;
			try {
					DropTarget dt = new DropTarget(c ,DnDConstants.ACTION_COPY_OR_MOVE ,this);
					fDropTargets.add( dt );
					//System.out.println("View " + view.getID() + " Initialized to DND.");
			}
			catch (java.lang.NullPointerException npe) {
				System.err.println("View Failed to initialize to DND.");
				System.err.println("Container likely did not have peer before the DropTarget was added");
				System.err.println(npe);
			}
		}
		if(isActive()) {
			createDragGestureRecognizer(view, this);
		}
	}
	/**
	 * Send when an existing view is about to be destroyed.
	 */
	public void viewDestroying(DrawingView view) {
		if(Component.class.isInstance( view )/* && DNDInterface.class.isInstance( views[x] )*/) {
			Component c = (Component) view;
			DropTarget dt = c.getDropTarget();
			if(dt != null ) {
				dt.setComponent( null );
				dt.removeDropTargetListener( this );
			}
			destroyDragGestreRecognizer(view,this);
		}
		super.viewDestroying(view);
	}

	/**
	 * Turn on drag by adding a DragGestureRegognizer to all Views which are
	 * based on Components.
	 */
	public void activate() {
		if(isActive()) {
			return;
		}
		super.activate();
		DrawingView[] dv = editor().views();
		for(int x=0;x < dv.length;x++) {
			createDragGestureRecognizer(dv[x],this);
		}
	}
	/**
	 * Called when the tool is deactivated.  This will deinitialize all the
	 * windows which were set up to use drag and drop.  This must be done or
	 * the windows will continue to communicate their status to this tool which
	 * could be taxing on the functionality of other tools.
	 */
	public void deactivate() {
		if(!isActive()) {
			return;
		}

		DrawingView [] dv = editor().views();
		for(int x=0;x < dv.length;x++) {
			destroyDragGestreRecognizer(dv[x],this);
		}
		super.deactivate();
	}

	/**
	 * Sets the type of cursor based on what is under the coordinates in the
	 * active view.
	 */
	public static void setCursor(int x, int y, DrawingView view) {
		if (view != null) { // patched Peter Hirzel
			Handle handle = view.findHandle(x, y);
			Figure figure = view.drawing().findFigure(x, y);

			if (handle != null) {
				if( LocatorHandle.class.isInstance( handle ) ) {
					LocatorHandle lh = (LocatorHandle) handle;
					Locator loc = lh.getLocator();
					if(RelativeLocator.class.isInstance(  loc )) {
						RelativeLocator rl = (RelativeLocator) loc;
						if( rl.equals( RelativeLocator.north() ) ) {
							view.setCursor( new Cursor( Cursor.N_RESIZE_CURSOR) );
						}
						else if(rl.equals( RelativeLocator.northEast() ) ){
							view.setCursor( new Cursor( Cursor.NE_RESIZE_CURSOR) );
						}
						else if(rl.equals( RelativeLocator.east() ) ){
							view.setCursor( new Cursor( Cursor.E_RESIZE_CURSOR) );
						}
						else if(rl.equals( RelativeLocator.southEast() ) ){
							view.setCursor( new Cursor( Cursor.SE_RESIZE_CURSOR) );
						}
						else if(rl.equals( RelativeLocator.south() ) ){
							view.setCursor( new Cursor( Cursor.S_RESIZE_CURSOR) );
						}
						else if(rl.equals( RelativeLocator.southWest() ) ){
							view.setCursor( new Cursor( Cursor.SW_RESIZE_CURSOR) );
						}
						else if(rl.equals( RelativeLocator.west() ) ){
							view.setCursor( new Cursor( Cursor.W_RESIZE_CURSOR) );
						}
						else if(rl.equals( RelativeLocator.northWest() ) ){
							view.setCursor( new Cursor( Cursor.NW_RESIZE_CURSOR) );
						}
					}
				}
			}
			else if (figure != null) {
				view.setCursor(new Cursor( Cursor.MOVE_CURSOR ) );
			}
			else {
				view.setCursor(Cursor.getDefaultCursor());
			}
		}
	}
	/**
	 * Handles mouse moves (if the mouse button is up).
	 * Switches the cursors depending on whats under them.
	 */
	public void mouseMove(MouseEvent evt, int x, int y) {
		setCursor(evt.getX(),evt.getY(),view());
	}
	/**
	 * Handles mouse up events. The events are forwarded to the
	 * current tracker.
	 */
	public void mouseUp(MouseEvent e, int x, int y) {
		view().unfreezeView(); //this should probably go after child mouse up
		if (fChild != null) // JDK1.1 doesn't guarantee mouseDown, mouseDrag, mouseUp
			fChild.mouseUp(e, x, y);
		fChild = null;
	}
	/**
	 * Handles mouse down events and starts the corresponding tracker.
	 */
	public void mouseDown(MouseEvent e, int x, int y)
	{
		// on MS-Windows NT: AWT generates additional mouse down events
		// when the left button is down && right button is clicked.
		// To avoid dead locks we ignore such events
		if (fChild != null) {
			return;
		}


		view().freezeView();

		Handle handle = view().findHandle(e.getX(), e.getY());
		if (handle != null) {
			fChild = createHandleTracker(handle);
		}
		else {
			Figure figure = drawing().findFigure(e.getX(), e.getY());
			if (figure != null) {
				//fChild = createDragTracker(view(), figure);
				if (e.isShiftDown()) {
				   view().toggleSelection(figure);
				} else if( !view().selection().contains(figure)) {
					view().clearSelection();
					view().addToSelection(figure);
				}
			}
			else {
				if (!e.isShiftDown()) {
					view().clearSelection();
				}
				fChild = createAreaTracker();
			}
		}
		if(fChild != null)
			fChild.mouseDown(e, x, y);
	}

	/**
	 * Handles mouse drag events. The events are forwarded to the
	 * current tracker.
	 */
	public void mouseDrag(MouseEvent e, int x, int y) {
		if (fChild != null) // JDK1.1 doesn't guarantee mouseDown, mouseDrag, mouseUp
			fChild.mouseDrag(e, x, y);
	}

	/**
	 * Factory method to create an area tracker. It is used to select an
	 * area.
	 */
	protected Tool createAreaTracker() {
		return new SelectAreaTracker(editor());
	}
	/**
	 * Factory method to create a Drag tracker. It is used to drag a figure.
	 */
/*	protected Tool createDragTracker(DrawingView view, Figure f) {
		return new DragTracker(view, f);
	}*/
	/**
	 * Factory method to create a Handle tracker. It is used to track a handle.
	 */
	protected Tool createHandleTracker(Handle handle) {
		return new HandleTracker(editor(), handle);
	}

	/**
	 * Used to create the gesture recognizer which in effect turns on draggability.
	 */
	private void createDragGestureRecognizer(DrawingView dv, DragGestureListener dgl) {
		if(Component.class.isInstance( dv ) ) {
			Component c = (Component) dv;
			DragGestureRecognizer dgr =
						dragSource.createDefaultDragGestureRecognizer(
							c,
							DnDConstants.ACTION_COPY_OR_MOVE,
							this);
			fDragGestureRecognizers.add( dgr );
		}
	}
	/**
	 * Used to destroy the gesture listener which ineffect turns off dragability.
	 */
	private void destroyDragGestreRecognizer(DrawingView dv, DragGestureListener dgl) {
		Iterator i = fDragGestureRecognizers.iterator();
		while(i.hasNext()) {
			DragGestureRecognizer dgr = (DragGestureRecognizer)i.next();
			if ( dgr.getComponent() == dv ) {
				dgr.removeDragGestureListener( this );
				dgr.setComponent( null );
				i.remove();
				break;
			}
		}
	}





//DragGestureListener Interface
	/**
	 * This function is called when the drag action is detected.  If it agrees
	 * with the attempt to drag it calls startDrag(), if not it does nothing.
	 */
	public void dragGestureRecognized(DragGestureEvent dge) {
		Component c = dge.getComponent();
		Vector selectedElements;
		java.awt.image.BufferedImage bi;
//        int sx=50;
//        int sy=50;
		if (fChild != null)
			return;

		if(DrawingView.class.isInstance( c ) ) {
			boolean found = false;
			DrawingView dv = (DrawingView) c;
			selectedElements = dv.selectionZOrdered();
			Iterator itr = selectedElements.iterator();

			if( itr.hasNext() == false )
				return;

			Point p = dge.getDragOrigin();
			while ( itr.hasNext() ) {
/*                Figure figgy = (Figure) itr.next();
				if( figgy.containsPoint( p.x, p.y ) ) {*/
				if( ((Figure) itr.next()).containsPoint( p.x, p.y ) ) {
/*                    Rectangle r = figgy.displayBox();
					sx = r.width;
					sy = r.height;*/
					found = true;
					break;
				}
			}
			if( found == true ) {
				fChild = null;
				origin = p;
				MyTransferable trans = new MyTransferable( selectedElements );

				/* SAVE FOR FUTURE DRAG IMAGE SUPPORT */
				/* drag image support that I need to test on some supporting platform.
				windows is not supporting this on NT so far. Ill test 98 and 2K next

				boolean support = dragSource.isDragImageSupported();
				bi = new BufferedImage(sx,sy,BufferedImage.TYPE_INT_RGB);
				Graphics2D g = bi.createGraphics();
				Iterator itr2 = selectedElements.iterator();
				while ( itr2.hasNext() ) {
					Figure fig = (Figure) itr2.next();
					fig = (Figure)fig.clone();
					Rectangle rold = fig.displayBox();
					fig.moveBy(-rold.x,-rold.y);
					fig.draw(g);
				}
				g.setBackground(Color.red);
				dge.getDragSource().startDrag(
								dge,
								DragSource.DefaultMoveDrop,
								bi,
								new Point(0,0),
								trans,
								this);
				*/
				dge.getDragSource().startDrag(
								dge,
								DragSource.DefaultMoveDrop,
								trans,
								this);
			}
		}
	}
//End DragGestureListener Interface





//Begin DropTargetListener Interface
	/**
	 * Called when a drag operation has encountered the DropTarget.
	 */
	public void dragEnter(DropTargetDragEvent dtde) {
//        System.out.println("DropTargetDragEvent-dragEnter");
		supportDropTargetDragEvent(dtde);
	}
	/**
	 * The drag operation has departed the DropTarget without dropping.
	 */
	public void dragExit(DropTargetEvent dte) {
	}
	/**
	 * Called when a drag operation is ongoing on the DropTarget.
	 */
	 public void dragOver(DropTargetDragEvent dtde) {
		supportDropTargetDragEvent(dtde);
	 }
	/**
	 * The drag operation has terminated with a drop on this DropTarget.
	 */
	public void drop(DropTargetDropEvent dtde) {
		Transferable trans;
		Vector figures;
		DrawingView lView;
//        System.out.println("DropTargetDropEvent-drop");

		if( dtde.isDataFlavorSupported( VECTORFlavor ) == true ) {
			if( (dtde.getDropAction() & DnDConstants.ACTION_COPY_OR_MOVE) != 0 ) {
				if(dtde.isLocalTransfer() == false ) {
					System.err.println("Intra-JVM Transfers not implemented for figures yet.");
					return;
				}
				dtde.acceptDrop( dtde.getDropAction()  );

				figures = (Vector) ProcessReceivedData(VECTORFlavor, dtde.getTransferable());
				if( figures != null ) {
					lView = (DrawingView) dtde.getDropTargetContext().getComponent();
					lView.clearSelection();
					Iterator itr = figures.iterator();
					Point newP = dtde.getLocation();

					int dx = newP.x - origin.x;  /* distance the mouse has moved */
					int dy = newP.y - origin.y;  /* distance the mouse has moved */
					while ( itr.hasNext() ) {
						Figure f = (Figure) itr.next();
						f.moveBy( dx, dy );
						lView.add( f );
						if(dtde.getDropAction() == DnDConstants.ACTION_MOVE )
							lView.addToSelection( f );
					}
					lView.checkDamage();
					dtde.getDropTargetContext().dropComplete(true);
				}
				else
					dtde.getDropTargetContext().dropComplete(false);
			}
			else
				dtde.rejectDrop();
		}
		else if(dtde.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			System.out.println("String flavor dropped.");
			dtde.acceptDrop(dtde.getDropAction());
			Object o = ProcessReceivedData(DataFlavor.stringFlavor, dtde.getTransferable());
			if( o != null ) {
				System.out.println("Received string flavored data.");
				dtde.getDropTargetContext().dropComplete(true);
			}
			else
				dtde.getDropTargetContext().dropComplete(false);
		}
		else if (dtde.isDataFlavorSupported(ASCIIFlavor) == true) {
			System.out.println("ASCII Flavor dropped.");
			dtde.acceptDrop(DnDConstants.ACTION_COPY);
			Object o = ProcessReceivedData(ASCIIFlavor, dtde.getTransferable());
			if( o!= null ) {
				System.out.println("Received ASCII Flavored data.");
				dtde.getDropTargetContext().dropComplete(true);
				System.out.println(o);
			}
			else
				dtde.getDropTargetContext().dropComplete(false);
		}
		else if(dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor)){
			System.out.println("Java File List Flavor dropped.");
			int acts = dtde.getDropAction();
			dtde.acceptDrop(DnDConstants.ACTION_COPY);
			java.io.File [] fList = (java.io.File[]) ProcessReceivedData(DataFlavor.javaFileListFlavor, dtde.getTransferable());
			if(fList != null) {
				System.out.println("Got list of files.");
				for(int x=0; x< fList.length; x++ ) {
					System.out.println(fList[x].getAbsolutePath());
				}
				dtde.getDropTargetContext().dropComplete(true);
			}
			else
				dtde.getDropTargetContext().dropComplete(false);
		}
	}

	/**
	 * Called if the user has modified the current drop gesture.
	 */
	public void dropActionChanged(DropTargetDragEvent dtde) {
//        System.out.println("DropTargetDragEvent-dropActionChanged");
		supportDropTargetDragEvent(dtde);
	}
//End DropTargetListener Interface




//Begin DragSourceListener Interface
	/**
	 * This method is invoked to signify that the Drag and Drop operation is complete.
	 */
	public void dragDropEnd(DragSourceDropEvent dsde) {
		DrawingView view = (DrawingView) dsde.getDragSourceContext().getComponent();
		Vector figures;

//        System.out.println("DragSourceDropEvent-dragDropEnd");
		if( dsde.getDropSuccess() == true ) {
			if( dsde.getDropAction() == DnDConstants.ACTION_MOVE ) {
//                System.out.println("DragSourceDropEvent-ACTION_MOVE");
				figures = (Vector) ProcessReceivedData(VECTORFlavor, dsde.getDragSourceContext().getTransferable());
				if( figures != null ) {
					Iterator itr = figures.iterator();
					while ( itr.hasNext() )
						view.remove( (Figure) itr.next() );
					view.clearSelection();
					view.checkDamage();
				}
			}
			else if( dsde.getDropAction() == DnDConstants.ACTION_COPY ) {
//                System.out.println("DragSourceDropEvent-ACTION_COPY");
			}
		}
	}
	/**
	 * Called as the hotspot enters a platform dependent drop site.
	 */
	public void dragEnter(DragSourceDragEvent dsde) {
	}
	/**
	 * Called as the hotspot exits a platform dependent drop site.
	 */
	public void dragExit(DragSourceEvent dse) {
	}
	/**
	 * Called as the hotspot moves over a platform dependent drop site.
	 */
	public void dragOver(DragSourceDragEvent dsde) {
	}
	/**
	 * Called when the user has modified the drop gesture.
	 */
	public void dropActionChanged(DragSourceDragEvent dsde) {
	}
//End DragSourceListener Interface



	/**
	 * Tests wether the Drag event is of a type that we support handling
	 */
	protected static void supportDropTargetDragEvent(DropTargetDragEvent dtde) {
		if( dtde.isDataFlavorSupported( VECTORFlavor ) == true ) {
			if( dtde.getDropAction() == DnDConstants.ACTION_COPY ) {
				dtde.acceptDrag( DnDConstants.ACTION_COPY  );
			}
			else if( dtde.getDropAction() == DnDConstants.ACTION_MOVE ) {
				dtde.acceptDrag( DnDConstants.ACTION_MOVE  );
			}
		}
		else if( dtde.isDataFlavorSupported( ASCIIFlavor ) == true ) {
			dtde.acceptDrag(dtde.getDropAction());
		}
		else if( dtde.isDataFlavorSupported(DataFlavor.stringFlavor) == true){
			dtde.acceptDrag(dtde.getDropAction());
		}
		else if( dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor) == true) {
			dtde.acceptDrag(dtde.getDropAction());
		}
		else
			dtde.rejectDrag();
	}
	/**
	 * Will return null if the data can not be processed
	 */
	protected static Object ProcessReceivedData(DataFlavor flavor, Transferable transferable) {
		if( transferable == null ) {
			return null;
		}
		try {
/*            if(flavor.equals(DataFlavor.plainTextFlavor)) {
				//As of 1.3 use stringFlavor.getReaderForText
				java.io.Reader reader = DataFlavor.stringFlavor.getReaderForText( transferable );
				return reader;
			} else*/ if(flavor.equals(DataFlavor.stringFlavor)) {
				String str = (String) transferable.getTransferData(DataFlavor.stringFlavor);
				return str;
			}
			else if(flavor.equals(DataFlavor.javaFileListFlavor)) {
				java.util.List aList = (java.util.List)transferable.getTransferData(DataFlavor.javaFileListFlavor);
				java.io.File fList [] = new java.io.File[aList.size()];
				aList.toArray(fList);
				return aList;
			} else if(flavor.equals(ASCIIFlavor)) {
				String txt = null;
				/* this may be too much work for locally received data */
				InputStream is = (InputStream)transferable.getTransferData(ASCIIFlavor);
				int length = is.available();
				byte[] bytes = new byte[length];
				int n = is.read(bytes);
				if(n >0 ) {
					/* seems to be a 0 tacked on the end of Windows strings.  I
					 * havent checked other platforms.  This does not happen
					 * with windows socket io.  strange?
					 */
					//for (int i = 0; i < length; i++) {
					//    if (bytes[i] == 0) {
					//        length = i;
					//        break;
					//    }
					//}
					txt = new String(bytes, 0, n);
				}
				return txt;
			} else if(flavor.equals(VECTORFlavor)) {
				/**
				 * I don't think this will work for remote transfer?
				 * Maybe it will pass the vector, but the contents?
				 */
				Vector v = (Vector) transferable.getTransferData(VECTORFlavor);
				return v;
			}
			else
				return null;
		}
		catch(java.io.IOException ioe) {
			System.err.println(ioe);
			return null;
		}
		catch(UnsupportedFlavorException ufe) {
			System.err.println(ufe);
			return null;
		}
		catch(ClassCastException cce) {
			System.err.println(cce);
			return null;
		}
	}
	protected Object ProcessRemotelyReceivedData(DataFlavor flavor, Transferable transferable) {
		return null;
	}


	/**
	 * These transferable objects are used to package your data when you want
	 * to initiate a transfer.  They are not used when you only want to receive
	 * data.  Formating the data is the responsibility of the sender primarily.
	 * Untested.  Used for dragging ASCII text out of JHotDraw
	 */
/*	public class ASCIIText implements Transferable
	{
		String s = new String("This is ASCII text");
		byte[] bytes;

		public DataFlavor[] getTransferDataFlavors() {
			return new DataFlavor[] { ASCIIFlavor };
		}

		public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
			return dataFlavor.equals(ASCIIFlavor);
		}

		public Object getTransferData(DataFlavor dataFlavor)
			throws UnsupportedFlavorException, IOException  {
			if (!isDataFlavorSupported(dataFlavor))
						throw new UnsupportedFlavorException(dataFlavor);

			bytes = new byte[s.length() + 1];
			for (int i = 0; i < s.length(); i++)
				bytes = s.getBytes();
			bytes[s.length()] = 0;
			return new ByteArrayInputStream(bytes);
		}
	}*/

	/**
	 * Class used to transfer the
	 */
	class MyTransferable implements Transferable , Serializable {
		Object o;
		public MyTransferable(Object o) {
			this.o = o;
		}
		public DataFlavor[] getTransferDataFlavors() {
			return new DataFlavor [] { VECTORFlavor };
		}
		public boolean isDataFlavorSupported(DataFlavor flavor) {
			if ( flavor.equals( VECTORFlavor ) == true )
				return true;
			return false;
		}
		public Object getTransferData(DataFlavor flavor) throws
									UnsupportedFlavorException, IOException {
			if( isDataFlavorSupported(flavor) == false)
				throw new UnsupportedFlavorException( flavor );
			return o;
		}
	}






}
