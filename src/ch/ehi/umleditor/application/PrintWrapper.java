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
import java.awt.*;
import java.awt.geom.*;
import ch.softenvironment.util.*;
import ch.ehi.basics.logging.EhiLogger;

/**
 * Print Utility for PrintJob's of UmlEditor.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2005-02-21 15:54:37 $
 */
public class PrintWrapper implements java.awt.print.Printable {
private ch.ehi.umleditor.umldrawingtools.ClassDiagramView diagramView = null;
/**
 * PrintWrapper constructor comment.
 */
public PrintWrapper(ch.ehi.umleditor.umldrawingtools.ClassDiagramView diagramView) {
								super();

								this.diagramView = diagramView;
}
/**
 * Prints the page at the specified index into the specified
 * {@link Graphics} context in the specified
 * format.  A <code>PrinterJob</code> calls the
 * <code>Printable</code> interface to request that a page be
 * rendered into the context specified by
 * <code>graphics</code>.  The format of the page to be drawn is
 * specified by <code>pageFormat</code>.  The zero based index
 * of the requested page is specified by <code>pageIndex</code>.
 * If the requested page does not exist then this method returns
 * NO_SUCH_PAGE; otherwise PAGE_EXISTS is returned.
 * The <code>Graphics</code> class or subclass implements the
 * {@link PrinterGraphics} interface to provide additional
 * information.  If the <code>Printable</code> object
 * aborts the print job then it throws a {@link PrinterException}.
 * @param graphics the context into which the page is drawn
 * @param pageFormat the size and orientation of the page being drawn
 * @param pageIndex the zero based index of the page to be drawn
 * @return PAGE_EXISTS if the page is rendered successfully
 *         or NO_SUCH_PAGE if <code>pageIndex</code> specifies a
 *	       non-existent page.
 * @exception java.awt.print.PrinterException
 *         thrown when the print job is terminated.
 */
public int print(java.awt.Graphics graphics, java.awt.print.PageFormat pageFormat, int pageIndex) throws java.awt.print.PrinterException {
								// pageIndex 0 corresponds to page number 1
								if (pageIndex >= 1) {
																return java.awt.print.Printable.NO_SUCH_PAGE;
								}


								if(false) {
																/* We'll assume that Jav2D is available.
																 */
																Graphics2D g2d = (Graphics2D) graphics;
																double x0 = (int)pageFormat.getImageableX();
																double y0 = (int)pageFormat.getImageableY();
																System.out.println(x0);
																System.out.println(y0);
																/* Move the origin from the corner of the Paper to the corner
																 * of the imageable area.
																 */
																g2d.translate(x0+1.0,y0+1.0);
																g2d.scale(0.5,0.5);
																g2d.clipRect(0,0,(int)pageFormat.getImageableWidth(),(int)pageFormat.getImageableHeight());
																/* Set the text color.
																 */
																g2d.setPaint(Color.black);
																Rectangle2D printArea = new Rectangle2D.Double(0.0, 0.0,
																																																															pageFormat.getImageableWidth(),
																																																															pageFormat.getImageableHeight());
																g2d.draw(printArea);
																printArea = new Rectangle2D.Double(0.0, 0.0,
																																																			pageFormat.getImageableWidth()+10,
																																																			pageFormat.getImageableHeight()+10);
																g2d.draw(printArea);
																return java.awt.print.Printable.PAGE_EXISTS;
								}
								java.awt.print.PrinterGraphics gp = (java.awt.print.PrinterGraphics)graphics;
								EhiLogger.traceState("<" + gp.getPrinterJob().getJobName() + "> is being printed");
								EhiLogger.traceState("pageOrienation <" + Integer.toString(pageFormat.getOrientation()) + ">");

								// set outer drawing limits
								double x0 = pageFormat.getImageableX()+1.0;
								double y0 = pageFormat.getImageableY()+1.0;
								double w0 = pageFormat.getImageableWidth()-1.0;
								double h0 = pageFormat.getImageableHeight()-1.0;
								//System.out.println("w,h: "+Double.toString(w0)+", "+Double.toString(h0));
								Graphics2D g2 = (Graphics2D)graphics;
								//Rectangle2D printArea = new Rectangle2D.Double(x0, y0,
								//							(int)pageFormat.getImageableWidth(),
								//							(int)pageFormat.getImageableHeight());
								// g2.draw(printArea);  hier wurde der schwarze Rand gezeichnet!!!!
								g2.translate(x0, y0); // move drawings to PrintArea-Offset(top/left)

								// fit to page
								Dimension dimDiagram = diagramView.getMinimumDimension();
								double scaleX = 1.0;
								double scaleY = 1.0;
								double diag_w=dimDiagram.getWidth();
								double diag_h=dimDiagram.getHeight();
								//double diag_w=50.0;
								//double diag_h=50.0;

								if (diag_w > w0) {
																scaleX = w0 / diag_w;
								}
								if (diag_h > h0) {
																scaleY = h0 / diag_h;
								}
								//System.out.println("scale: "+Double.toString(scaleX)+", "+Double.toString(scaleY));
								if(scaleX<1.0) {
																if(scaleX<=scaleY) {
																								g2.scale(scaleX, scaleX);
																}else{
																								// scaleY<scaleX<1.0
																								g2.scale(scaleY, scaleY);
																}
								}else if(scaleY<1.0) {
																g2.scale(scaleY, scaleY);
								}

								g2.clipRect(0,0,(int)diag_w,(int)diag_h);

								diagramView.printAll(g2);
								//Rectangle2D printArea = new Rectangle2D.Double(0.0, 0.0,
								//		diag_w,
								//		diag_h);
								//g2.draw(printArea);
								//printArea = new Rectangle2D.Double(0.0, 0.0,
								//		diag_w+10.0,
								//		diag_h+10.0);
								//g2.draw(printArea);


								return java.awt.print.Printable.PAGE_EXISTS;
}
}
