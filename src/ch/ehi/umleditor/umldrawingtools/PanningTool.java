package ch.ehi.umleditor.umldrawingtools;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JViewport;

import CH.ifa.draw.framework.DrawingEditor;
import CH.ifa.draw.standard.AbstractTool;

public class PanningTool extends AbstractTool implements ActionListener{
	 /**
     * Panning pivot point
     */
    private int initialX = 0;
    private int initialY = 0;
	
	public PanningTool(DrawingEditor newDrawingEditor) {
		super(newDrawingEditor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	public void activate() {
		super.activate();
		if (isUsable()) {
			view().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}
	}

	public void mouseDown(MouseEvent event, int x, int y) {
		
		initialX = event.getX();
		initialY = event.getY();
		
	}
	
	public void mouseDrag(MouseEvent e, int x, int y) {	
		ch.ehi.umleditor.umldrawingtools.ClassDiagramView test = (ClassDiagramView) e.getSource();
		
		JViewport  viewport     = (JViewport) test.getParent();
        JComponent component    = (JComponent) viewport.getView();
        Point      viewPoint    = viewport.getViewPosition();
        
        int deltaX = x - initialX;
        int deltaY = y - initialY;
        viewPoint.setLocation(viewPoint.x - deltaX, viewPoint.y - deltaY);
        component.scrollRectToVisible(new Rectangle(viewPoint, viewport.getSize()));
		
	}
	

}
