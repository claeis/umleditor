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
import CH.ifa.draw.figures.*;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.uml1_4.implementation.UmlOperation;
import ch.softenvironment.util.Tracer;

/**
 * Figure for displaying a single UmlOperation within a ClassFigure or AssociationAttributeFigure compartment.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.3 $ $Date: 2004-06-21 11:41:02 $
 */
class OperationFigure extends TextFigure {
	private UmlOperation operation = null;
	private ClassDiagramView classDiagram = null;

	// Formatting constants
	private final char PARAMETER_SEPARATOR = ':';
	private final char PARAMETER_BEGIN = '(';
	private final char PARAMETER_END = ')';
	private final char VISIBILITY_PUBLIC = '+';
	private final char VISIBILITY_PROTECTED = '#';
	private final char VISIBILITY_PRIVATE = '-';
	private final char VISIBILITY_PACKAGE = '~';
	
/**
 * Constructor comment.
 */
public OperationFigure(UmlOperation operation, ClassDiagramView classDiagram) {
	super();
	this.operation = operation;
	this.classDiagram = classDiagram;
}
/**
 * Format the Attribute Representation.
 * @see ClassDef#createAttributeFigure(AttributeDef)
 */
public String getPureOperationName(String name) {
	String realName = name;
	int index = name.indexOf(PARAMETER_BEGIN);
	if (index > 0) {
		realName = name.substring(1 /*skip visibility*/, index);
	} else {
Tracer.getInstance().nyi(this, "getPureOperationName(..)", "skip <visibility return type>");
		realName = name;
	}

	return realName.trim();
}
/**
 * Format the Operation Representation.
 * @see ClassDef#createOperationFigure(..)
 */
public void updateModel() {
	String text = operation.getDefLangName();
/*	if (classDiagram.isShowAttributeMultiplicity()) {
		text = text + BEGIN_MULTIPLICITY + MultiplicityConverter.getRange(attributeDef.getMultiplicity()) + END_MULTIPLICITY;
	}
	if (classDiagram.isShowAttributeTypes() && attributeDef.containsAttrType()) {
		text = text + " " + TYPE_SEPARATOR + " " + IliBaseTypeKind.getTypeName(attributeDef,false);
	}
*/
	char prefix = ' ';
	switch (operation.getVisibility()) {
		case VisibilityKind.PUBLIC :
			prefix = VISIBILITY_PUBLIC;
			break;
		case VisibilityKind.PROTECTED :
			prefix = VISIBILITY_PROTECTED;
			break;
		case VisibilityKind.PRIVATE :
			prefix = VISIBILITY_PRIVATE;
			break;
		case VisibilityKind.PACKAGE :
			prefix = VISIBILITY_PACKAGE;
			break;
	}
	text = prefix + text + PARAMETER_BEGIN + PARAMETER_END;
	super.setText(text);
}
}
