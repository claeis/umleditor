package ch.ehi.umleditor.umldrawingtools;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CH.ifa.draw.framework.DrawingEditor;
import CH.ifa.draw.standard.AbstractTool;

public class PanningTool extends AbstractTool implements ActionListener{

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

	

}
