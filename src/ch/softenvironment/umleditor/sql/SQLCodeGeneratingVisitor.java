package ch.softenvironment.umleditor.sql;

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
import java.util.Iterator;
import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.*;
import ch.ehi.interlis.constraints.ConstraintExpression;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.util.StringUtils;


/**
 * Visitor scanning a Model-Namespace of UML-Editor's Repository
 * to generate appropriate SQL-Schema-Code.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.2 $ $Date: 2004-01-03 15:49:05 $
 */
public class SQLCodeGeneratingVisitor {
	private java.util.HashMap domains = new java.util.HashMap();
	private java.util.List drops = new java.util.ArrayList();
	private java.util.List tables = new java.util.ArrayList();
	private java.util.List alters = new java.util.ArrayList();
	private java.util.List relations = new java.util.ArrayList();
	private java.util.List indexes = new java.util.ArrayList();
	private java.util.List comments = new java.util.ArrayList();
	private java.util.Map techFields = new java.util.HashMap();
	private boolean createDomains = false;
	private boolean showComment = false;
	
	private static final String SQL_COMMENT = "--";
	private static final String SQL_SEPARATOR = ";";
	private static final String ILI_UNIQUE = "UNIQUE";
	private static final String ILI_SEPARATOR = ";";
	private static final String ILI_ENUMERATION_SEPARATOR = ",";
	
	private static final String MY_DEFAULT = "MY_Default";		// non-typed
	private static final String MY_OBJECT_ID = "MY_ObjectID";
	private static final String MY_TIMESTAMP = "MY_Timestamp";
	private static final String MY_DATETIME = "MY_DateTime";
	private static final String MY_USER_ID = "MY_UserID";
	private static final String MY_BOOLEAN = "My_Boolean";
	private static final String ILI_ALIGNMENT = "ILI_Alignment";
	private static final String ILI_ENUM = "ILI_Enumeration";
	private static final String ILI_COORD = "ILI_Coordinate";
	private static final String ILI_BASKET = "ILI_Basket";
	private static final String ILI_POLYLINE = "ILI_Polyline";
	private static final String ILI_SURFACE = "ILI_Surface";
	private static final String ILI_AREA = "ILI_Area";
	private static final String ILI_DOMAINDEF = "ILI_DomainDef";
	
/**
 * Generate SQL Data Definition Language for the given INTERLIS element.
 * (Actually #accept() should be implemented in Namespace.)
 * 
 * @param element (assumed to contain a Set of ClassDef's)
 * @param out (write Stream)
 */
public void accept(Namespace element,
    				java.io.PrintStream out,
    				boolean dropTables,
   					boolean createTables,
    				boolean showComment,
    				boolean createDomains,
    				java.util.HashMap techFields) {

	this.createDomains = createDomains;
	this.techFields = techFields;
	this.showComment = showComment;


	Iterator iterator = element.iteratorOwnedElement();
	while (iterator.hasNext()) {
        Object object = iterator.next();
        if (object instanceof ClassDef) {
            visitClassDef((ClassDef)object);
        } else if (object instanceof AssociationDef) {
			visitAssociationDef((AssociationDef)object);
        }
	}

	if (dropTables) {
		// write DROPed Tables
		iterator = drops.iterator();
		while (iterator.hasNext()) {
			out.println((String)iterator.next());
		}
	}
	if (createDomains) {
	    // writeDomains
//NYI: check TechFields
		domains.put(MY_OBJECT_ID, "CREATE DOMAIN " + MY_OBJECT_ID + " AS NUMERIC(9) NOT NULL" + SQL_SEPARATOR);
		domains.put(MY_TIMESTAMP, "CREATE DOMAIN " + MY_TIMESTAMP + " AS TIMESTAMP NOT NULL" + SQL_SEPARATOR);
		domains.put(MY_DATETIME, "CREATE DOMAIN " + MY_DATETIME + " AS DATETIME" + SQL_SEPARATOR);
		domains.put(MY_USER_ID, "CREATE DOMAIN " + MY_USER_ID + " AS VARCHAR(40) NOT NULL" + SQL_SEPARATOR);
	    out.println();
	    iterator = domains.keySet().iterator();
		while (iterator.hasNext()) {
			out.println((String)domains.get(iterator.next()));
		}
	}
	if (createTables) {
	    // write Tables
	    out.println();
	    iterator = tables.iterator();
		while (iterator.hasNext()) {
			out.println((String)iterator.next());
		}
	    // write Alters
	    out.println();
	    iterator = alters.iterator();
		while (iterator.hasNext()) {
			out.println((String)iterator.next());
		}
 		// write Relations
 		out.println();
 		iterator = relations.iterator();
		while (iterator.hasNext()) {
			out.println((String)iterator.next());
		}
    	// write Indexes
    	out.println();
    	iterator = indexes.iterator();
		while (iterator.hasNext()) {
			out.println((String)iterator.next());
		}
    	// write Comments
    	out.println();
    	iterator = comments.iterator();
		while (iterator.hasNext()) {
			out.println((String)iterator.next());
		}
	}
}
	/**
	 * Create SQL Relationships representing AssociationDef's by ALTERing ForeignKeys.
	 * Make sure Tables are created yet, so the DBMS may Alter the Foreign Keys.
	 * @param printStream
	 */
	private void visitAssociationDef(AssociationDef associationDef) {
		Iterator roles = associationDef.iteratorConnection();
		while (roles.hasNext()) {
					RoleDef role = (RoleDef)roles.next();
/*
					@see TransferFromUmlMetamodel#visitRoleDef(..)
    switch(role.getAggregation()){
      case AggregationKind.NONE:
        out.write("-- ");
        break;
      case AggregationKind.AGGREGATE:
        out.write("-<> ");
        break;
      case AggregationKind.COMPOSITE:
        out.write("-<#> ");
        break;
    }

    if(role.getMultiplicity()!=null){
      MultiplicityRange card=(MultiplicityRange)(role.getMultiplicity().iteratorRange().next());
      out.write(visitCardinality(card)+" ");
    }

    if(role.containsParticipant()){
	  Classifier classDef = (Classifier)role.getParticipant();
      out.write(classRef(role.getAssociation(),classDef));
    
				
		// 1) create index on Foreign Key
		CREATE INDEX FKSEBUCOLEID ON SEBUCOntact
		(
			   SEBUCOLEID ASC
		);

		// 2) add Foreign Key
		ALTER TABLE Auto
			   ADD FOREIGN KEY (AHV_Nr, name)
									 REFERENCES Fahrer
									 ON DELETE SET NULL/RESRICT
									 ON UPDATE CASCADE;

					}
		
*/
		}
	}
	/**
	 * Create SQL Table-Attributes.
	 * @param printStream
	 */
	private String visitAttribute(AttributeDef attributeDef) {
		String domain = null;
		if (attributeDef.containsAttrType()) {
			// page specific type
			AttrType attrType = attributeDef.getAttrType();
			if (attrType instanceof DomainAttribute) {
				// @see AttributeDefDialog#setElement(Element)
				if (((DomainAttribute)attrType).containsDirect()) {
					ch.ehi.interlis.domainsandconstants.Type type = ((DomainAttribute)attrType).getDirect();
					if (type instanceof BooleanType) {
						domains.put(MY_BOOLEAN, "CREATE DOMAIN " + MY_BOOLEAN + " AS CHAR(1) NOT NULL" + SQL_SEPARATOR + " " + SQL_COMMENT + "'T'true; 'F'alse");
						domain = MY_BOOLEAN;
					} else if ((type instanceof VertAlignment) || (type instanceof HorizAlignment)) {
						domains.put(ILI_ALIGNMENT, "CREATE DOMAIN " + ILI_ALIGNMENT + " AS CHAR(1) NOT NULL" + SQL_SEPARATOR + " " + SQL_COMMENT + "'H'orizontal; 'V'ertical");
						domain = ILI_ALIGNMENT;
					} else if (type instanceof Text) {
						domain = "VARCHAR(" + ((Text)type).getMaxLength() + ")";		
					} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration) {
						domains.put(ILI_ENUM, "CREATE DOMAIN " + ILI_ENUM + " AS VARCHAR(15)" + SQL_SEPARATOR);
						domain = ILI_ENUM;
					} else if (type instanceof NumericalType) {
						if (type instanceof NumericType) {
							if (((NumericType)type).isRangeDefined()) {
								// accuracy given
								// Minimal Value as Decimal: ((NumericType)type).getMinDec();
								IliDim dim = ((NumericType)type).getMaxDec();
								domain = "NUMERIC(" + (int)dim.getValue() + "," + (int)dim.getAccuracy() + ")";
							} else {
								// no range defined
								domain = "NUMERIC";	
							}
						} else {
							// StructuredUnitType
							if (((StructuredUnitType)type).getMinStruc() != null) {
								// minimal value expected
// ((StructuredUnitType)type).getMinStruc();
							}
							if (((StructuredUnitType)type).getMaxStruc() != null) {
								// maximal value expected
// ((StructuredUnitType)type).getMaxStruc();
							}
domain = "NUMERIC";	
						}	
					} else if (type instanceof CoordinateType) {
						domains.put(ILI_COORD, "CREATE DOMAIN " + ILI_COORD + " AS VARCHAR(15)" + SQL_SEPARATOR);
						domain = ILI_COORD;
					} else if (type instanceof BasketType) {
						domains.put(ILI_BASKET, "CREATE DOMAIN " + ILI_BASKET + " AS VARCHAR(15)" + SQL_SEPARATOR);
						domain = ILI_BASKET;	
					} else if (type instanceof IliPolyline) {
						domains.put(ILI_POLYLINE, "CREATE DOMAIN " + ILI_POLYLINE + " AS VARCHAR(15)" + SQL_SEPARATOR);
						domain = ILI_POLYLINE;		
					} else if (type instanceof IndividualSurface) {
						domains.put(ILI_SURFACE, "CREATE DOMAIN " + ILI_SURFACE + " AS VARCHAR(15)" + SQL_SEPARATOR);
						domain = ILI_SURFACE;		
					} else if (type instanceof Tesselation) {
						domains.put(ILI_AREA, "CREATE DOMAIN " + ILI_AREA + " AS VARCHAR(15)" + SQL_SEPARATOR);
						domain = ILI_AREA;		
					}
				} else if (((DomainAttribute)attrType).containsDomainDef()) {
//					ch.ehi.interlis.domainsandconstants.DomainDef domainDef = ((DomainAttribute)attrType).getDomainDef();
					domains.put(ILI_DOMAINDEF, "CREATE DOMAIN " + ILI_DOMAINDEF + " AS VARCHAR(15)" + SQL_SEPARATOR);
					domain = ILI_DOMAINDEF;	
				}
			} 
		}
		if (domain == null) {
			domains.put(MY_DEFAULT, "CREATE DOMAIN " + MY_DEFAULT + " AS VARCHAR(20)");
			return attributeDef.getDefLangName() + " " + MY_DEFAULT;
		} else {
			return attributeDef.getDefLangName() + " " + domain;
		}
	}
/**
 * Create SQL Tables.
 * @param printStream
 */
private void visitClassDef(ClassDef classDef) {
    drops.add("DROP TABLE " + classDef.getDefLangName() + SQL_SEPARATOR);

    String sql = "CREATE TABLE " + classDef.getDefLangName() + " (\n";
//NYI dynamic TechFields acc. to Dialog

	// 1) add Object-Identity
    sql = sql + "\tT_Id " + MY_OBJECT_ID + " NOT NULL PRIMARY KEY,\n";
//	alters.add("ALTER TABLE " + classDef.getDefLangName() + "\n\tADD PRIMARY KEY (T_Id)" + SQL_SEPARATOR);

    // 2) add additional attributes to be added as Foreign Keys
    //	  -> check Associations containing this class
    //       -> check other end for UNIQUE constraints -> for Primary Key
    //       -> check Cardinality (and evtl. Navigability)
    //          -> add additional attribute (Primary Key of other end)
//NYI
    // 3) add FK's for in case of inheritance
//NYI
	// 4) add local attributes
	Iterator attributes = classDef.iteratorFeature();
    while (attributes.hasNext()) {
    	AttributeDef attributeDef = (AttributeDef) attributes.next();
        // 4.1) name and type
        sql = sql + "\t" + visitAttribute(attributeDef);

        // 4.2) Cardinality
        if (attributeDef.getMultiplicity() != null) {
	        if (MultiplicityConverter.isMandatory(attributeDef.getMultiplicity())) {
 	           sql = sql + " NOT NULL";
            }
        }

        sql = sql + ",\n";

        // 4.3) Comment on Attribute
        if (showComment && (!StringUtils.isNullOrEmpty(attributeDef.getDocumentation().getValue()))) {
			comments.add("COMMENT ON COLUMN " + classDef.getDefLangName() + "." + attributeDef.getDefLangName() + " IS \"" + attributeDef.getDocumentation().getValue() + "\"" + SQL_SEPARATOR);
		}
	}
            
//NYI
    // 5) add technical fields
	sql = sql + "\tT_CreateDate " + MY_DATETIME + " NOT NULL,\n";
    sql = sql + "\tT_LastChange " + MY_TIMESTAMP + " NOT NULL,\n";
    sql = sql + "\tT_User " + MY_USER_ID + " NOT NULL\n)" + SQL_SEPARATOR;
           
    tables.add(sql);

    // 6) add UNIQUE Constraints
    java.util.Iterator iterator = classDef.iteratorConstraint();
	while (iterator.hasNext()) {
		visitConstraint((ch.ehi.uml1_4.foundation.core.Constraint)iterator.next(), classDef);
	}
}
/**
 * Create SQL Constraints such as UNIQUE INDEXes.
 * The very first UNIQUE-Constraint is assumed to be the PRIMARY KEY.
 * @param out
 * @param iterator
 */
private void visitConstraint(
    ch.ehi.uml1_4.foundation.core.Constraint constraint, ClassDef classDef) {

    String iliSyntax = ElementUtils.mapNlsString(
            			((ConstraintExpression) constraint.getBody()).getSyntax());
    int index = -1;
    int counter = 0;
    while ((index = (iliSyntax.indexOf(ILI_UNIQUE, index + 1))) >= 0) {
        int eofUnique = iliSyntax.indexOf(ILI_SEPARATOR, index + 1);
        // attributes is either 1 or several comma separated attributes	 (as in SQL)
        String attributes = iliSyntax.substring(index + ILI_UNIQUE.length(), eofUnique).trim();

        String sql = "CREATE UNIQUE INDEX UI"
   	            			+ counter++
			                + " ON "
                			+ classDef.getDefLangName()
                			+ " (\n";
        int indexComma = -1;
        while ((indexComma = (attributes.indexOf(ILI_ENUMERATION_SEPARATOR))) >= 0) {
            sql = sql + "\t" + attributes.substring(0, indexComma).trim() + " ASC,\n";
            attributes = attributes.substring(indexComma + 1, attributes.length());
        }
        sql = sql + "\t" + attributes.trim() + " ASC\n)" + SQL_SEPARATOR;
        indexes.add(sql);
    }
}
}
