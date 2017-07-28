package ch.ehi.umleditor.application;

//         private TreeDragSource ds;
//         private TreeDropTarget dt;
//    ds = new TreeDragSource(getTreNavigation(), java.awt.dnd.DnDConstants.ACTION_MOVE);
//    dt = new TreeDropTarget(getTreNavigation());

public class AutoScrollingJTree extends javax.swing.JTree implements java.awt.dnd.Autoscroll {
private int margin = 12;
public AutoScrollingJTree() {
        super();
}
// Ok, we've been told to scroll because the mouse cursor is in our
// scroll zone.
public void autoscroll(java.awt.Point p) {
        // Figure out which row we're on.
        int realrow = getClosestRowForLocation(p.x, p.y);
        java.awt.Rectangle outer = getBounds();
        // Now decide if the row is at the top of the screen or at the
        // bottom. We do this to make the previous row (or the next
        // row) visible as appropriate. If we're at the absolute top or
        // bottom, just return the first or last row respectively.
        realrow = (p.y + outer.y <= margin ?
                   realrow-1 <= 0 ? 0 : realrow - 1 :
                   realrow+1 >= getRowCount() - 1 ? getRowCount() - 1 : realrow + 1);
        scrollRowToVisible(realrow);
}
// Calculate the insets for the *JTREE*, not the viewport
// the tree is in. This makes it a bit messy.
public java.awt.Insets getAutoscrollInsets() {
        java.awt.Rectangle outer = getBounds();
        java.awt.Rectangle inner = getParent().getBounds();
        return new java.awt.Insets(
                inner.y - outer.y + margin, inner.x - outer.x + margin,
                outer.height - inner.height - inner.y + outer.y + margin,
                outer.width - inner.width - inner.x + outer.x + margin);
}
// Use this method if you want to see the boundaries of the
// autoscroll active region. Toss it out, otherwise.
/*
   public void paintComponent(java.awt.Graphics g) {
   super.paintComponent(g);
   java.awt.Rectangle outer = getBounds();
   java.awt.Rectangle inner = getParent().getBounds();
   g.setColor(java.awt.Color.red);
   g.drawRect(-outer.x + 12, -outer.y + 12,
   inner.width - 24, inner.height - 24);
   }
 */
}
