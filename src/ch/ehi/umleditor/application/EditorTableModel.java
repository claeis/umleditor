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
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.interlis.associations.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.interlis.attributes.*;
import ch.ehi.uml1_4.foundation.datatypes.*;
import ch.ehi.uml1_4.implementation.UmlParameter;
import ch.ehi.umleditor.umldrawingtools.*;
import java.util.*;
import ch.softenvironment.util.*;
/**
 * Specific TableModel for UMLEditor-Dialog Tables.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.3 $ $Date: 2004-03-09 12:24:53 $
 */
public class EditorTableModel extends javax.swing.table.DefaultTableModel {
	private static java.util.ResourceBundle resEditorTableModel = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/EditorTableModel");
        // ??? ce 2003-08-21 Warum ein eigenes Attribut elementVector und nicht
        // das bereits vorhandene dataVector?
	private Vector elementVector = new Vector();
/**
 * EditorTableModel constructor comment.
 */
public EditorTableModel() {
	super();
}
/**
 * EditorTableModel default constructor.
 */
public EditorTableModel(Vector data, Vector columnNames) {
	this();

	setDataVector(elementVector, columnNames);
	for (int i=0; i<data.size(); i++) {
		Vector row = new Vector();
		row.add(data.get(i));
		elementVector.add(row);
	}

	// update visually
	fireTableRowsInserted(elementVector.size() - 1, elementVector.size() - 1);
}
/**
 * Add a Row to Table.
 * @param object usually is of type Element
 */
public Vector addRowElement(Object object) {
	Vector row = new Vector();

	if (object instanceof AttributeDef) {
		row = createRow((AttributeDef)object);
	} else if (object instanceof AbstractClassDef) {
		row = createRow((AbstractClassDef)object);
	} else if (object instanceof RoleDef) {
		row = createRow((RoleDef)object);
	} else if (object instanceof Contract) {
		row = createRow((Contract)object);
	} else if (object instanceof Dependency) {
		row = createRow((Dependency)object);
	} else if (object instanceof LineFormTypeDef) {
		row = createRow((LineFormTypeDef)object);
	} else if (object instanceof Translation) {
		row = createRow((Translation)object);
	} else if (object instanceof UmlParameter) {
		row = createRow((UmlParameter)object);
	} else if (object instanceof Vector) {
		// @see INTERLIS2DefDialog#setElement()
		row = createRow((Vector)object);
	} else {
		throw new DeveloperException(this, "addRow(Element)", "unsupported type <" + object.toString() + ">");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
	}

	// keep pointer to instance for deletion at Index==last
	// @see #removeRows()
	row.add(object);

	elementVector.add(row);

	// update visually
	fireTableRowsInserted(elementVector.size() - 1, elementVector.size() - 1);

	return row;
}
/**
 *
 */
private Vector createRow(RoleDef roleDef) {
	Vector row = new Vector(5);
	row.add(roleDef.getDefLangName());
	if (roleDef.getAggregation() == AggregationKind.AGGREGATE) {
		row.add(PresentationRoleFigure.AGGREGATION);
	} else if (roleDef.getAggregation() == AggregationKind.COMPOSITE) {
		row.add(PresentationRoleFigure.COMPOSITE);
	} else {
		row.add(PresentationRoleFigure.ASSOCIATION);
	}
	row.add(MultiplicityConverter.getRange(roleDef.getMultiplicity()));
	if (roleDef.containsParticipant()) {
		row.add(roleDef.getParticipant().getDefLangName());
	} else {
		row.add(null);
	}

	return row;
}
/**
 * Return row of given Object.
 * @param attributeDef Object to display in a row
 * @see #setAttributeRow()
 */
private Vector createRow(AttributeDef attributeDef) {
	Vector row = new Vector(3);

	row.add(attributeDef.getDefLangName());
	row.add(IliBaseTypeKind.getTypeName(attributeDef,true));

	return row;
}
/**
 * Return row of given Object.
 * @param lineFormTypeDef Object to display in a row
 * @see #setLineFormTypeDefRow()
 */
private Vector createRow(LineFormTypeDef lineFormTypeDef) {
	Vector row = new Vector(2);
	row.add(lineFormTypeDef.getDefLangName());

	return row;
}
/**
 * Return row of given Object.
 * @param classDef Object to display in a row
 * @see #setRestrictedClassDefRow()
 */
private Vector createRow(AbstractClassDef classDef) {
	Vector row = new Vector(2);

	row.add(classDef.getDefLangName());

	return row;
}
/**
 * Return row of given Object.
 * @param contract Object to display in a row
 * @see #setContract()
 * @see ModelDefDialog (table Contract)
 */
private Vector createRow(Contract contract) {
	Vector row = new Vector(2);
	row.add(ElementUtils.mapNlsString(contract.getIssuer()));
//	row.add(ElementUtils.mapNlsString(contract.getExplanation()));

	return row;
}
/**
 * Return a TranslationTableRow.
 * @see #setTranslationRow()
 */
private Vector createRow(Translation translation) {
	Vector row = new Vector(3);

	row.add(translation.getLanguage());
	row.add(translation.getBaseLanguage());

	return row;
}
/**
 * @see ModelDefDialog (table Import)
 */
private Vector createRow(Dependency dependency) {
	Vector row = new Vector(2);
	row.add(((ModelElement)dependency.iteratorSupplier().next()).getDefLangName());

	return row;
}
/**
 * @see UmlOperationDialog (table Parameter)
 */
private Vector createRow(UmlParameter parameter) {
	Vector row = new Vector(4);
	row.add(parameter.getDefLangName());
	row.add("NYI");//parameter.getType());
row.add(new Integer(parameter.getKind()));

	return row;
}
/**
 * Return a TranslationTableRow.
 * @see #setTranslationRow()
 */
private Vector createRow(Vector vector) {
	Vector row = new Vector(3);

	row.add(vector.get(0));
	row.add(vector.get(1));

	return row;
}
/**
 * Returns true if the cell at <I>row</I> and <I>column</I>
 * is editable.  Otherwise, the setValueAt() on the cell will not change
 * the value of that cell.
 *
 * Overwrites.
 *
 * @param   row             the row whose value is to be looked up
 * @param   column          the column whose value is to be looked up
 * @return                  true if the cell is editable.
 * @see #setValueAt
 */
public boolean isCellEditable(int row, int column) {
    return false;
}
/**
 * Remove selected Rows from table.
 */
public void removeRows(int selectedRows[]) {
	// remove model and Row in reverse direction (row-offset)
	for (int i=selectedRows.length; i>0; i--) {
		int rowIndex = selectedRows[i-1];
		Vector currentDataRow = (Vector)elementVector.get(rowIndex);
		// remove last non-visible ModelElement
		// @see #create*Row(..)
		Element element = (Element)currentDataRow.get(currentDataRow.size() - 1);
		if (element instanceof LineFormTypeDef) {
			// @see IliBaseTypeLinePanel
			LineForm lineForm = ((LineFormTypeDef)element).getLineForm();
			lineForm.removeLineFormTypeDef((LineFormTypeDef)element);
		} else {
			ElementFactory.removeElement(element);
		}
		elementVector.remove(rowIndex);

		// remove visually
		fireTableRowsDeleted(rowIndex, rowIndex);
	}
}
/**
 * @param iteratorFeature (for e.g. of a ClassDef)
 */
public void setAttributeDef(java.util.Iterator iteratorFeature) {
	// define visible columns
	Vector columns = new Vector(2);
	columns.add(resEditorTableModel.getString("TbcAttributeName_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcAttributeType_text")); //$NON-NLS-1$

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorFeature != null) && (iteratorFeature.hasNext())) {
		Object feature = iteratorFeature.next();
		if (feature instanceof AttributeDef) {
			addRowElement((AttributeDef)feature);
		}
	}
}
/**
 * Set a ModelDef's ImportedElement.
 * @param iteratorClientDependency
 * @columnName TableColumn-Header-value (NLS)
 */
public void setClientDependency(java.util.Iterator iteratorClientDependency, String columnName) {
	// define visible columns
	Vector columns = new Vector(1);
	columns.add(columnName);

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorClientDependency != null) && (iteratorClientDependency.hasNext())) {
		addRowElement((Dependency)iteratorClientDependency.next());
	}
}
/**
 * Set a ModelDef's Contract.
 * @param iteratorContract
 */
public void setContract(java.util.Iterator iteratorContract) {
	// define visible columns
	Vector columns = new Vector(1);
	columns.add(resEditorTableModel.getString("TbcContractIssuer_text")); //$NON-NLS-1$
//	columns.add("Explanation");

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorContract != null) && (iteratorContract.hasNext())) {
		addRowElement((Contract)iteratorContract.next());
	}
}
/**
 * 
 * @param iteratorLineFormTypeDef
 */
public void setLineFormTypeDef(java.util.Iterator iteratorLineFormTypeDef) {
	// define visible columns
	Vector columns = new Vector(1);
	columns.add(resEditorTableModel.getString("TbcLineFormTypeDef_text")); //$NON-NLS-1$

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorLineFormTypeDef != null) && (iteratorLineFormTypeDef.hasNext())) {
		addRowElement((LineFormTypeDef)iteratorLineFormTypeDef.next());
	}
}
/**
 * @param iteratorRestrictedTo
 */
public void setRestrictedClassDef(java.util.Iterator iteratorRestrictedTo) {
	// define visible columns
	Vector columns = new Vector(1);
	columns.add(resEditorTableModel.getString("TbcRestrictedClassDef_text")); //$NON-NLS-1$

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorRestrictedTo != null) && (iteratorRestrictedTo.hasNext())) {
		addRowElement((AbstractClassDef)iteratorRestrictedTo.next());
	}
}
/**
 * @param iteratorConnection
 */
public void setRoleDef(java.util.Iterator iteratorConnection) {
	// define visible columns
	Vector columns = new Vector(4);
	columns.add(resEditorTableModel.getString("TbcRoleName_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcRoleKind_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcRoleCardinality_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcRoleClass_text")); //$NON-NLS-1$

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorConnection != null) && (iteratorConnection.hasNext())) {
		addRowElement((RoleDef)iteratorConnection.next());
	}
}
/**
 * Shuffle down the selected row (step => 1 row).
 * @param current
 */
public void moveRowDown(int current) {
  // is current last element?
  if(current+1==elementVector.size()){
    // cannot move down
    return;
  }
  Vector currentDataRow = (Vector)elementVector.get(current);
  Element element = (Element)currentDataRow.get(currentDataRow.size() - 1);
  if(element instanceof AssociationEnd){
    Vector nextDataRow = (Vector)elementVector.get(current+1);
    AssociationEnd nextElement = (AssociationEnd)nextDataRow.get(nextDataRow.size() - 1);
    AssociationDef assoc=(AssociationDef)nextElement.getAssociation();
    assoc.swapConnection((AssociationEnd)element,nextElement);
    elementVector.set(current+1,currentDataRow);
    elementVector.set(current,nextDataRow);
    // update visually
    fireTableRowsUpdated(current, current+1);
  }else if(element instanceof Attribute){
    Vector nextDataRow = (Vector)elementVector.get(current+1);
    Attribute nextElement = (Attribute)nextDataRow.get(nextDataRow.size() - 1);
    AbstractClassDef aclass=(AbstractClassDef)nextElement.getOwner();
    aclass.swapFeature((Attribute)element,nextElement);
    elementVector.set(current+1,currentDataRow);
    elementVector.set(current,nextDataRow);
    // update visually
    fireTableRowsUpdated(current, current+1);
  }
}
/**
 * @param iteratorTranslation
 */
public void setTranslation(java.util.Iterator iteratorTranslation) {
	// define visible columns
	Vector columns = new Vector(2);
	columns.add(resEditorTableModel.getString("TbcTranslationLanguage_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcTranslationBaseLanguage_text")); //$NON-NLS-1$

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorTranslation != null) && (iteratorTranslation.hasNext())) {
		addRowElement((Translation)iteratorTranslation.next());
	}
}
/**
 * Special case.
 * @param iteratorTranslation (of a Vector)
 */
public void setTranslationFile(java.util.Iterator iteratorTranslation) {
	// define visible columns
	Vector columns = new Vector(2);
	columns.add(resEditorTableModel.getString("TbcTranslationFileLanguage_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcTranslationFileName_text")); //$NON-NLS-1$

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorTranslation != null) && (iteratorTranslation.hasNext())) {
		this.addRowElement(/* (Vector) */ iteratorTranslation.next());
	}
}
/**
 * @param selectedRows
 */
protected void showDependencySpecification(int selectedRows[]) {
	for (int i=0; i<selectedRows.length; i++) {
		int currentRowIndex = selectedRows[i];
		Vector currentDataRow = (Vector)elementVector.get(currentRowIndex);
		Element element = (Element)currentDataRow.get(currentDataRow.size() - 1);
		LauncherView.getInstance().showSpecification((Element)((Dependency)element).iteratorSupplier().next());

		updateRow(currentRowIndex, currentDataRow, element);
	}
}
/**
 * Display a Specification Dialog for the
 * currently selected rows.
 * @param iteratorFeature (for e.g. of a ClassDef)
 */
protected void showSpecification(int selectedRows[]) {
	for (int i=0; i<selectedRows.length; i++) {
		int currentRowIndex = selectedRows[i];
		Vector currentDataRow = (Vector)elementVector.get(currentRowIndex);
		Element element = (Element)currentDataRow.get(currentDataRow.size() - 1);
		LauncherView.getInstance().showSpecification(element);

		updateRow(currentRowIndex, currentDataRow, element);
	}
}
/**
 * Refresh values in cells of a certain Row.
 * Value might have changed by Dialog.
 * @param currentDataRow
 */
private void updateRow(int rowIndex, Vector currentDataRow, Object object) {
	if (object instanceof AttributeDef) {
		currentDataRow.set(0, ((AttributeDef)object).getDefLangName());
		currentDataRow.set(1, IliBaseTypeKind.getTypeName(object,true));
	} else if (object instanceof ClassDef) {
		currentDataRow.set(0, ((ClassDef)object).getDefLangName());
	} else if (object instanceof RoleDef) {
		RoleDef roleDef = (RoleDef)object;
		currentDataRow.set(0, roleDef.getDefLangName());
		if (roleDef.getAggregation() == AggregationKind.AGGREGATE) {
			currentDataRow.set(1, PresentationRoleFigure.AGGREGATION);
		} else if (roleDef.getAggregation() == AggregationKind.COMPOSITE) {
			currentDataRow.set(1, PresentationRoleFigure.COMPOSITE);
		} else {
			currentDataRow.set(1, PresentationRoleFigure.ASSOCIATION);
		}
		currentDataRow.set(2, MultiplicityConverter.getRange(roleDef.getMultiplicity()));
		if (roleDef.containsParticipant()) {
			currentDataRow.set(3, (roleDef.getParticipant().getDefLangName()));
		} else {
			currentDataRow.set(3, null);
		}
	} else if (object instanceof Contract) {
		currentDataRow.set(0, ElementUtils.mapNlsString(((Contract)object).getIssuer()));
//		currentDataRow.set(1, ElementUtils.mapNlsString(((Contract)object).getExplanation()));
	} else if (object instanceof ModelDef) {
		currentDataRow.set(0, ((ModelDef)object).getDefLangName());
	} else if (object instanceof Dependency) {
		currentDataRow.set(0, ((ModelElement)((Dependency)object).iteratorSupplier().next()).getDefLangName());
	} else if (object instanceof LineFormTypeDef) {
		currentDataRow.set(0, ((LineFormTypeDef)object).getDefLangName());
	} else if (object instanceof Translation) {
		currentDataRow.set(0, ((Translation)object).getLanguage());
		currentDataRow.set(1, ((Translation)object).getBaseLanguage());
	} else if (object instanceof UmlParameter) {
		currentDataRow.set(0, ((UmlParameter)object).getDefLangName());
//		currentDataRow.set(1, ((UmlParameter)object).get());
		currentDataRow.set(2, new Integer(((UmlParameter)object).getKind()));	
	} else {
		throw new DeveloperException(this, "updateRow()", "type <" + object.toString() + "> not updated");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
	}

	fireTableRowsUpdated(rowIndex, rowIndex);
}
/**
 * Define the column structure for a set of UmlParameter's.
 * @param iteratorParamater (for e.g. of an UmlOperation)
 */
public void setUmlParameter(java.util.Iterator iteratorParameter) {
	// define visible columns
	Vector columns = new Vector(3);
	columns.add(resEditorTableModel.getString("TbcAttributeName_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcAttributeType_text")); //$NON-NLS-1$
	columns.add(resEditorTableModel.getString("TbcRoleKind_text")); //$NON-NLS-1$

	setDataVector(elementVector, columns);

	// build data Rows
	while ((iteratorParameter != null) && (iteratorParameter.hasNext())) {
		Object feature = iteratorParameter.next();
		if (feature instanceof UmlParameter) {
			addRowElement((UmlParameter)feature);
		}
	}
}
}
