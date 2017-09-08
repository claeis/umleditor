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
import java.awt.*;
import CH.ifa.draw.figures.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;

/**
 * A PackageFigure is a graphical representation for an UML-Package in an UML
 * Class Diagram. A Figure separates the graphical representation from the data
 * model. A Package has a package name. Packages may be dependent of other
 * Packages.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.3 $ $Date: 2007-01-30 18:44:35 $
 */
public class PackageFigure extends NodeFigure {
	
	private static final long serialVersionUID = 8752419447084366759L;
	// Composites
	private TextFigure packageNameFigure;
	private TextFigure packagePathFigure;

	/**
	 * Create a new instance of PackageFigure with a RectangleFigure as
	 * presentation figure.
	 */
	public PackageFigure() {
		// this(new RectangleFigure(new Point(0,0), new Point(200, 150)));
		this(new RectangleFigure());
	}

	/**
	 * Create a new instance of ClassFigure with a given presentation figure
	 *
	 * @param newPresentationFigure
	 *            presentation figure
	 */
	private PackageFigure(Figure newPresentationFigure) {
		super(newPresentationFigure);
	}

	/**
	 * Overwrites. Represent this Figure with an UML-Package Symbol.
	 */
	public void draw(Graphics g) {
		// show a package
		g.setColor((Color) getAttribute(JHotDrawConstants.FILL_COLOR));
		g.fillPolygon(getPolygon());
		g.setColor((Color) getAttribute(JHotDrawConstants.FRAME_COLOR));
		g.drawPolygon(getPolygon());
		packageNameFigure.draw(g);
		packagePathFigure.draw(g);
	}

	/**
	 * Return default handles on all four edges for this figure.
	 * 
	 * @see DiamondFigure.polygon()
	 */
	private java.awt.Polygon getPolygon() {
		Rectangle r = displayBox();
		Polygon p = new Polygon();

		// rose relations 13:32=x:width
		int widthUpperRectangle = 13 * r.width / 32;
		// rose relations 6:26=y:height
		int heightUpperRectangle = 6 * r.height / 26;

		// offset of current position
		int dx = r.x;
		int dy = r.y;

		// draw middle line
		p.addPoint(0 + dx, heightUpperRectangle + dy);
		p.addPoint(r.width + dx - 1, heightUpperRectangle + dy);
		// draw right Edge of taller Rectangle
		p.addPoint(r.width + dx - 1, r.height + dy - 1);
		// draw bottom edge
		p.addPoint(0 + dx, r.height + dy - 1);
		// draw left edge
		p.addPoint(0 + dx, 0 + dy);
		// draw short upper edge
		p.addPoint(widthUpperRectangle + dx, 0 + dy);
		// draw right edge of upper rectangle
		p.addPoint(widthUpperRectangle + dx, heightUpperRectangle + dy);

		return p;
	}

	/**
	 * Hook method called to initizialize a ClassFigure. It is called from the
	 * constructors and the clone() method.
	 */
	protected void initialize() {
		// start with an empty Composite
		removeAll();

		// create a TextFigure responsible for the Package-Name
		packageNameFigure = new TextFigure() {
			public void setText(String newText) {
				if (updateName(newText)) {
					super.setText(newText);
				}
				update();
			}
		};
		packageNameFigure.setFont(getFont());

		// create a figure responsible for the Package-Path
		packagePathFigure = new TextFigure() {
			public void setText(String newText) {
				super.setText(newText);
				// TODO NYI updateName(newText);
				update();
			}
		};
		packagePathFigure.setFont(getFont());
		packagePathFigure.setReadOnly(true);

		// add the TextFigure's to the Composite
		SeparatorFigure separator = new SeparatorFigure();
		separator.setLineVisible(false);
		GraphicalCompositeFigure nameFigure = new GraphicalCompositeFigure(separator);
		nameFigure.add(packageNameFigure);
		nameFigure.add(packagePathFigure);
		nameFigure.getLayouter().setInsets(new Insets(15, 4, 0, 0));
		add(nameFigure);

		super.initialize();
	}

	/**
	 * ModelElement changed from outside. Therefore a refresh of the View is
	 * needed.
	 */
	public void updateView() {
		if (getModelElement() != null) {
			if (!getModelElement().containsNamespace()) {
				// case removed => parent detached this node before sending
				// MetaModelChanged-Event
				removeVisually();
			} else {
				// node might have changed
				super.updateView();
				packageNameFigure.setText(getModelElement().getDefLangName());
				// TODO packagePathFigure.setText("(from..)");
			}
		}
	}
}
