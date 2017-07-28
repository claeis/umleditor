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
import ch.ehi.interlis.attributes.*;
import CH.ifa.draw.figures.*;
import ch.ehi.umleditor.application.*;

/**
 * Figure for displaying a single Attribute within a ClassFigure or AssociationAttributeFigure compartment.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2004-03-05 17:26:42 $
 */
class AttributeFigure extends TextFigure {
private AttributeDef attributeDef = null;
private ClassDiagramView classDiagram = null;

// Formatting constants
protected final char BEGIN_MULTIPLICITY = '[';
protected final char END_MULTIPLICITY = ']';
protected final char TYPE_SEPARATOR = ':';
/**
 * AttributeFigure constructor comment.
 */
public AttributeFigure(AttributeDef attributeDef, ClassDiagramView classDiagram) {
								super();
								this.attributeDef = attributeDef;
								this.classDiagram = classDiagram;
}
/**
 * Format the Attribute Representation.
 * @see ClassDef#createAttributeFigure(AttributeDef)
 */
public String getPureAttributeName(String name) {
								String realName = name;
								int index = name.indexOf(BEGIN_MULTIPLICITY);
								if (index > 0) {
																realName = name.substring(0, index);
								} else {
																index = name.indexOf(TYPE_SEPARATOR);
																if (index > 0) {
																								realName = name.substring(0, index);
																}
								}

								return realName.trim();
}
/**
 * Format the Attribute Representation.
 * @see ClassDef#createAttributeFigure(AttributeDef)
 */
public void updateModel() {
								String text = attributeDef.getDefLangName();
								if (classDiagram.isShowAttributeMultiplicity()) {
																text = text + BEGIN_MULTIPLICITY + MultiplicityConverter.getRange(attributeDef.getMultiplicity()) + END_MULTIPLICITY;
								}
								if (classDiagram.isShowAttributeTypes() && attributeDef.containsAttrType()) {
																text = text + " " + TYPE_SEPARATOR + " " + IliBaseTypeKind.getTypeName(attributeDef,false);
								}
								super.setText(text);
}
}
