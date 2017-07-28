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
import ch.ehi.interlis.attributes.*;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.softenvironment.util.*;
import java.util.*;
/**
 * Presentation Utility for a set of INTERLIS Types.
 * Enumeration-utility.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.4 $ $Date: 2007-01-14 08:17:16 $
 */
public abstract class IliBaseTypeKind {
// Names of Interlis types to display
private static java.util.ResourceBundle resIliBaseTypeKind = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/IliBaseTypeKind");   //$NON-NLS-1$
protected final static String NULL_TYPE = resIliBaseTypeKind.getString("CINullType");  //$NON-NLS-1$
protected final static String BOOLEAN = resIliBaseTypeKind.getString("CIBoolean");  //$NON-NLS-1$
protected final static String ALIGNMENT = resIliBaseTypeKind.getString("CIAlignment");  //$NON-NLS-1$
protected final static String TEXT = resIliBaseTypeKind.getString("CIText");  //$NON-NLS-1$
protected final static String ENUM = resIliBaseTypeKind.getString("CIEnum");  //$NON-NLS-1$
protected final static String NUMERIC = resIliBaseTypeKind.getString("CINumeric");  //$NON-NLS-1$
protected final static String COORD = resIliBaseTypeKind.getString("CICoord");  //$NON-NLS-1$
protected final static String BASKET = resIliBaseTypeKind.getString("CiBasket");  //$NON-NLS-1$
protected final static String POLYLINE = resIliBaseTypeKind.getString("CIPolyline");  //$NON-NLS-1$
protected final static String SURFACE = resIliBaseTypeKind.getString("CISurface");  //$NON-NLS-1$
protected final static String AREA = resIliBaseTypeKind.getString("CIArea");  //$NON-NLS-1$
protected final static String OID_TYPE = resIliBaseTypeKind.getString("CIOidType");  //$NON-NLS-1$
protected final static String CLASS_TYPE = resIliBaseTypeKind.getString("CIClassType");  //$NON-NLS-1$
protected final static String DOMAINDEF = resIliBaseTypeKind.getString("CIDomainDef");  //$NON-NLS-1$
protected final static String UNKNOWN = resIliBaseTypeKind.getString("CIUnknown");  //$NON-NLS-1$
protected final static String DATE = resIliBaseTypeKind.getString("CIDate");  //$NON-NLS-1$
protected final static String DATETIME = resIliBaseTypeKind.getString("CIDateTime");  //$NON-NLS-1$
protected final static String TIME = resIliBaseTypeKind.getString("CITime");  //$NON-NLS-1$
protected final static String REFERENCE = resIliBaseTypeKind.getString("CIReference");  //$NON-NLS-1$
protected final static String STRUCTURE = resIliBaseTypeKind.getString("CIStructure");  //$NON-NLS-1$
/**
 * Return a set of displayable TypeNames.
 * @see AttributeDefDialog
 */
public static Vector getAttributeDefTypes() {
								Vector attributeDefTypes = getStandardTypes();
								attributeDefTypes.add(DOMAINDEF);
								attributeDefTypes.add(REFERENCE);
								attributeDefTypes.add(STRUCTURE);

								return attributeDefTypes;
}
/**
 * InterlisType constructor comment.
 * @see DomainDefDialog
 */
public static Vector getDomainDefTypes() {
								//kind=> alles gross: AttrType (COORD1..3, NUMERIC, TEXT, Enum, HAlignment, VAlignment.Boolean, Basket ,Polyline ,Surface, Area
								return getStandardTypes();
}
/**
 * InterlisType constructor comment.
 */
public static String getNullType() {
								return NULL_TYPE;
}
/**
 * Return a set of displayable TypeNames.
 */
private static Vector getStandardTypes() {
								Vector standardTypes = new Vector(14);

								standardTypes.add(NULL_TYPE);
								standardTypes.add(BOOLEAN);
								standardTypes.add(ALIGNMENT);
								standardTypes.add(TEXT);
								standardTypes.add(ENUM);

								standardTypes.add(NUMERIC);
								standardTypes.add(DATE);
								standardTypes.add(DATETIME);
								standardTypes.add(TIME);
								standardTypes.add(COORD);
								standardTypes.add(POLYLINE);
								standardTypes.add(SURFACE);

								standardTypes.add(AREA);
								standardTypes.add(OID_TYPE);
								standardTypes.add(CLASS_TYPE);
								standardTypes.add(UNKNOWN);

								return standardTypes;
}
/**
 * InterlisType constructor comment.
 */
public static String getTypeName(Object object,boolean tagDomainDef) {
								if ((object != null) && (object instanceof AttributeDef) && ((AttributeDef)object).containsAttrType()) {
																if (((AttributeDef)object).getAttrType() instanceof DomainAttribute) {
																								DomainAttribute domainAttribute = (DomainAttribute)((AttributeDef)object).getAttrType();
																								if (domainAttribute.containsDirect()) {
																																ch.ehi.interlis.domainsandconstants.Type type = domainAttribute.getDirect();
																																if (type instanceof BooleanType) {
																																								return BOOLEAN;
																																} else if ((type instanceof VertAlignment) || (type instanceof HorizAlignment)) {
																																								return ALIGNMENT;
																																} else if (type instanceof Text) {
																																								return TEXT;
																																} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration) {
																																								return ENUM;
																																} else if (type instanceof NumericalType) {
																																								return NUMERIC;
																																} else if (type instanceof DateType) {
																																								return DATE;
																																} else if (type instanceof DateTimeType) {
																																								return DATETIME;
																																} else if (type instanceof TimeType) {
																																								return TIME;
																																} else if (type instanceof CoordinateType) {
																																								return COORD;
																																} else if (type instanceof ClassType) {
																																								return CLASS_TYPE;
																																} else if (type instanceof StructAttrType) {
																																								StructAttrType structAttrType=(StructAttrType)type;
																																								if(structAttrType.containsParticipant()) {
																																																return structAttrType.getParticipant().getDefLangName();
																																								}
																																								return "ANYSTRUCTURE";
																																} else if (type instanceof RefAttrType) {
																																								RefAttrType refAttrType=(RefAttrType)type;
																																								if(refAttrType.containsParticipant()) {
																																																return refAttrType.getParticipant().getDefLangName();
																																								}
																																								return "ANYCLASS";
																																} else if (type instanceof OidType) {
																																								return OID_TYPE;
																																} else if (type instanceof ch.ehi.interlis.domainsandconstants.UnknownType) {
																																								return UNKNOWN;
																																} else if (type instanceof LineType) {
																																								if (type instanceof IliPolyline) {
																																																return POLYLINE;
																																								} else if (type instanceof IndividualSurface) {
																																																return SURFACE;
																																								} else if (type instanceof Tesselation) {
																																																return AREA;
																																								} else {
																																																// should not happen
																																																return resIliBaseTypeKind.getString("CEUndefinedLinetype"); //$NON-NLS-1$
																																								}
																																}
																								} else if (domainAttribute.containsDomainDef()) {
																																return domainAttribute.getDomainDef().getDefLangName() + (tagDomainDef ? resIliBaseTypeKind.getString("CIDomainDefSuffix") : ""); //$NON-NLS-1$
																								} else {
																																Tracer.getInstance().runtimeWarning("DomainAttribute contains neiter directType nor DomainDef");//$NON-NLS-2$//$NON-NLS-1$
																								}
																}
								}

								return resIliBaseTypeKind.getString("CINoType"); //$NON-NLS-1$
}
}
