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
private final Point panPoint = new Point();
	
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

	public void mousePressed(MouseEvent event) {
		panPoint.setLocation(event.getPoint());
	}
	
	public void mouseDrag(MouseEvent e, int x, int y) {
		//JViewport  viewport     = (JViewport) frame.getParent().getParent();
		
		ch.ehi.umleditor.umldrawingtools.ClassDiagramView test = (ClassDiagramView) e.getSource();
		//System.out.println("TENGO ESTO "+test.getParent());
		JViewport  viewport     = (JViewport) test.getParent();
        JComponent component    = (JComponent) viewport.getView();
        Point      currentPoint = e.getPoint();
        Point      viewPoint    = viewport.getViewPosition();

        viewPoint.translate(panPoint.x - currentPoint.x, panPoint.y - currentPoint.y);
        component.scrollRectToVisible(new Rectangle(viewPoint, viewport.getSize()));
        panPoint.setLocation(currentPoint);
		
	}
	

}
