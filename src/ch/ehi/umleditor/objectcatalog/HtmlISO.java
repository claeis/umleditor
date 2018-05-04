package ch.ehi.umleditor.objectcatalog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.associations.AssociationAsIliAttrKind;
import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.uml1_4.foundation.core.Artifact;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Attribute;
import ch.ehi.uml1_4.foundation.core.Class;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.umleditor.application.IliBaseTypeKind;

public class HtmlISO {
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(HtmlISO.class);

	// used in STRUCTURE pass to suppress links to element definitions
	private boolean linkElements;

	private ch.ehi.basics.io.IndentPrintWriter clsFile = null;
	private java.io.Writer out = null;
	// hashmap<object, string>
	// indexMap is setup in CONTENTS pass
	private HashMap indexMap = new HashMap();

	// SortedMap <Werte, numeration>
	private SortedMap sortedMap = new TreeMap();

	// for the numbering of TopicDef, ModelDef and Interlis2Def
	int numeration = 0;

	// is required for decimal places: Package, Class, classDef
	int iddP;

	// used in pass STRUCTURE, changed in walkTreeRecursive()
	double level = 0.0;

	// variable for the pass
	// compare afterwards in the doValue if pass == <one of the constants> 
	// and set the order in which the HTML is written down
	int pass;

	// ??? Sringwert for the spaces, or Abs end in the structure
	String b = " ";

	double textIdent = 0.5;

	private static final int CONTENTS = 1;
	private static final int BODY = 3;
	private static final int INDEX = 4;
	
	public void doObjectCatalog(Namespace apackage, java.io.Writer out) throws java.io.IOException {
		// please fill in/modify the following section
				// -beg- preserve=yes 3CEE8A0A0302 body3CEE891B03C7 "doObjectCatalog"
				this.out = out;
				linkElements = true;
				// java.util.ArrayList todo=new java.util.ArrayList(); // collection of
				// packages not yet visited
				// add given package to todo-list; so it is processed as a first element
				// todo.add(apackage);

				out.write("<!DOCTYPE html>");
				newline();
				out.write("<HTML>");
				newline();
				out.write("<HEAD>");
				newline();
				out.write("<TITLE>" + formatText("CTobjcatTitle", encodeString(apackage.getDefLangName())) + "</TITLE>");
				newline();
				// css damit man den Link nicht sieht und dass der Rahmen unten
				// angezeigt wird
				out.write("<STYLE TYPE='text/css'>A {text-decoration: none }"
						+ "TD{border: solid gray; border-width: 1px}</STYLE>");
				out.write("</HEAD>");
				newline();
				out.write("<body link=\"#000000\"" + " vlink=\"#000000\"" + " alink=\"#000000\">");
				newline();

				pass = CONTENTS;
				walkTree(apackage);

				pass = BODY;
				// clsFile=new ch.interlis.ili2c.generator.IndentPrintWriter(new
				// java.io.BufferedWriter(new java.io.FileWriter("c:/tmp/ce.txt")));
				walkTree(apackage);
				// clsFile.close();
				// clsFile=null;

				pass = INDEX;
				walkTree(apackage);

				out.write("</BODY>");
				newline();
				out.write("</HTML>");
				newline();
				return;
				// -end- 3CEE8A0A0302 body3CEE891B03C7 "doObjectCatalog"
	}
	
	// -beg- preserve=no 3CEE8B46037F head3CEE891B03C7 "visitPackage"
		public void visitPackage(Namespace apackage)
				// -end- 3CEE8B46037F head3CEE891B03C7 "visitPackage"
				// declare any checked exceptions
				// please fill in/modify the following section
				// -beg- preserve=yes 3CEE8B46037F throws3CEE891B03C7 "visitPackage"
				throws java.io.IOException
		// -end- 3CEE8B46037F throws3CEE891B03C7 "visitPackage"
		{
			// please fill in/modify the following section
			// -beg- preserve=yes 3CEE8B46037F body3CEE891B03C7 "visitPackage"
			// wird für section Number benötigt
			numeration = numeration + 1;

			// Wert es aktuellen Objekts
			String defLangName = encodeString(apackage.getDefLangName());

			// aName - wird f�r die Angabe vom Link innerhalb der HTML - Datei
			// ben�tigt
			// bsp: <a name="aName....">
			String aName = numeration + "_" + defLangName;

			// ??concated value f�r die Angabe der Werte+serialNumber, bzw. index
			// vom Value
			String value;
			if (suppressChNr) {
				value = defLangName;
			} else {
				value = numeration + " " + defLangName;
			}

			// damit nur einmal die indexMap gef�llt wird!
			if (pass == CONTENTS) {
				int sectionNumbers[] = new int[1];
				sectionNumbers[0] = numeration;
				indexMap.put((ModelElement) apackage, sectionNumbers);
			}

			String concatedValue = "";
			String aNameStructure = "";
			if (linkElements) {
				int numerationId[] = (int[]) indexMap.get((ModelElement) apackage);

				// concatedValue: numerationId+deflangName
				if (suppressChNr) {
					concatedValue = defLangName;
				} else {
					concatedValue = Integer.toString(numerationId[0]) + " " + defLangName;
				}

				// concatedValue für den Link innerhalb der HTML-Datei
				aNameStructure = Integer.toString(numerationId[0]) + "_" + defLangName;
			} else {
				concatedValue = defLangName;
			}

			if (pass == CONTENTS) {
				out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#" + aName + "\">"
						+ value + "</a></p>");
				newline();
			}

			if (pass == BODY) {
				out.write("<H1><a name=\"" + aName + "\">" + value + "</a></H1>");
				newline();

				if (apackage instanceof UmlModel) {
					UmlModel model = (UmlModel) apackage;
					String author = encodeDescription(model.getAuthor());
					String version = encodeString(model.getVersion());
					out.write("<table border=\"0\">");
					out.write("<tr>");
					newline();
					out.write("<td><i>" + rsrc.getString("CTauthor") + "</i></td>");
					newline();
					out.write(
							"<td><font face=\"Arial\" size=\"3\">" + author + "</font></td>");
					newline();
					out.write("</tr>");
					newline();

					out.write("<tr>");
					newline();
					out.write("<td><i>" + rsrc.getString("CTversion") + "</i></td>");
					newline();
					out.write("<td><font face=\"Arial\" size=\"3\">" + version
							+ "</font></td>");
					newline();
					out.write("</tr>");
					newline();
					out.write("</table>");
				}
				String documentation = encodeDescription(mapNlsString(apackage.getDocumentation()));
				out.write(documentation);
				newline();
			}

			// list of packages
			java.util.Iterator classi = apackage.iteratorOwnedElement();
			java.util.ArrayList elev = new java.util.ArrayList();
			while (classi.hasNext()) {
				Object obj = classi.next();
				if (obj instanceof Package || obj instanceof Artifact) {
					if (!((ch.ehi.uml1_4.foundation.core.ModelElement) obj).getDefLangName().startsWith("<")) {
						elev.add(obj);
					}
				}
			}
			java.util.Collections.sort(elev, new CompareByName());
			classi = elev.iterator();
			boolean hasHeader = false;
			iddP = 1;
			while (classi.hasNext()) {
				Object obj = classi.next();
				if (!hasHeader) {
					String aNamePackage = numeration + "." + iddP + "_Packages";

					int packageSectionNo[] = new int[2];
					packageSectionNo[0] = numeration;
					packageSectionNo[1] = iddP;
					indexMap.put("Pakete", packageSectionNo);

					if (pass == BODY) {
						if (suppressChNr) {
							out.write("<H2><a name=\"" + aNamePackage + "\">" + rsrc.getString("CTpackages") + "</a></H2>");
							newline();
						} else {
							out.write("<H2><a name=\"" + aNamePackage + "\">" + numeration + "." + iddP + " "
									+ rsrc.getString("CTpackages") + "</a></H2>");
							newline();
						}
						out.write("<UL>");
						newline();
					}

					if (pass == CONTENTS) {
						if (suppressChNr) {
							out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#"
									+ aNamePackage + "\">" + rsrc.getString("CTpackages") + "</a></p>");
							newline();
						} else {
							out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#"
									+ aNamePackage + "\">" + numeration + "." + iddP + " " + rsrc.getString("CTpackages")
									+ "</a></p>");
							newline();
						}
						// out.write("<UL>");newline();
					}
					hasHeader = true;

					// iddP für Package wird erhöht
					iddP++;
				}
				String defLangModelElement = encodeString(
						((ch.ehi.uml1_4.foundation.core.ModelElement) obj).getDefLangName());
				if (pass == BODY) {
					int objNumerationId[] = (int[]) indexMap.get(obj);
					out.write("<LI><a href=\"#" + objNumerationId[0] + "_" + defLangModelElement + "\">"
							+ defLangModelElement + "</a></LI>");
					newline();
				}
			}
			if (hasHeader) {
				if (pass == BODY) {
					out.write("</UL>");
					newline();
				}
			}

			
			// list of classes
			elev.clear();
			classi = apackage.iteratorOwnedElement();
			while (classi.hasNext()) {
				Object obj = classi.next();
				if (obj instanceof Class && !(obj instanceof AssociationDef
						&& (((AssociationDef) obj).isStructureAttribute() || ((AssociationDef) obj).isReferenceAttribute()))
						&& !(obj instanceof AssociationDef && ((AssociationDef) obj).sizeConnection() == 2
								&& ((AssociationDef) obj).sizeFeature() == 0)) {
					elev.add(obj);
				} else if (isEnumDomainDef(obj)) {
					elev.add(obj);
				}
			}
			java.util.Collections.sort(elev, new CompareByName());
			classi = elev.iterator();
			hasHeader = false;
			while (classi.hasNext() && !(classi instanceof AssociationDef)) {
				Object obj = classi.next();
				if (!hasHeader) {
					if (pass == BODY) {
						if (suppressChNr) {
							out.write("<H2><a name=\"" + numeration + "." + iddP + "\">" + rsrc.getString("CTclasses")
									+ "</a></H2>");
							newline();
						} else {
							out.write("<H2><a name=\"" + numeration + "." + iddP + "\">" + numeration + "." + iddP + " "
									+ rsrc.getString("CTclasses") + "</a></H2>");
							newline();
						}
						out.write("<UL>");
						newline();
					}

					if (pass == CONTENTS) {
						int classesSectionNo[] = new int[2];
						classesSectionNo[0] = numeration;
						classesSectionNo[1] = iddP;
						indexMap.put("Klassen", classesSectionNo);
						if (suppressChNr) {
							out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#"
									+ numeration + "." + iddP + "\">" + rsrc.getString("CTclasses") + "</a></p>");
							newline();
						} else {
							out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#"
									+ numeration + "." + iddP + "\">" + numeration + "." + iddP + " "
									+ rsrc.getString("CTclasses") + "</a></p>");
							newline();
						}
					}

					hasHeader = true;

					// der Wert f�r die Kommastellen wird hier erh�ht
					iddP++;
				}
				String defLangClass = encodeString(((Classifier) obj).getDefLangName());
				if (pass == BODY) {
					int objNumerationId[] = (int[]) indexMap.get(obj);
					out.write("<LI><a href=\"#" + objNumerationId[0] + "." + objNumerationId[1] + "_" + defLangClass + "\">"
							+ defLangClass + "</a></LI>");
					newline();
				}
			}
			if (hasHeader) {
				if (pass == BODY) {
					out.write("</UL>");
					newline();
				}
			}
			
			// list of association
				elev.clear();
				classi = apackage.iteratorOwnedElement();
				while (classi.hasNext()) {
					Object obj = classi.next();
					if (obj instanceof AssociationDef) {
						elev.add(obj);				
					}
				}
				java.util.Collections.sort(elev, new CompareByName());
				classi = elev.iterator();
				hasHeader = false;
				while (classi.hasNext()) {
					Object obj = classi.next();
					if (!hasHeader && obj instanceof AssociationDef) {
						if (pass == BODY) {
							if (suppressChNr) {
								out.write("<H2><a name=\"" + numeration +"."+iddP+ "\">" + rsrc.getString("CTassociations") + "</a></H2>");
								System.out.println("la num:"+numeration+" lasec:"+iddP);
								newline();
							} else {
								out.write("<H2><a name=\"" + numeration +"."+iddP+ "\">" + numeration + "." + iddP + " "
										+ rsrc.getString("CTassociations") + "</a></H2>");
								newline();
							}
							out.write("<UL>");
							newline();
						}

						if (pass == CONTENTS) {
						    int associationSectionNo[] = new int[2];
							associationSectionNo[0] = numeration;
							associationSectionNo[1] = iddP;
							indexMap.put("Associations", associationSectionNo);
							if (suppressChNr) {
								out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#"
										+ numeration + "." +iddP+ "\">" + rsrc.getString("CTassociations") + "</a></p>");
								newline();
							} else {
								out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#"
										+ numeration +"."+iddP+ "\">" + numeration + "." + iddP + " " + rsrc.getString("CTassociations")
										+ "</a></p>");
								newline();
							}
						}
						hasHeader = true;

						// iddP für Package wird erhöht
						iddP++;
					}
					String defLangAssociation = encodeString(
							((AssociationDef) obj).getDefLangName());
					if (pass == BODY) {
						int objNumerationId[] = (int[]) indexMap.get(obj);
						out.write("<LI><a href=\"#" + objNumerationId[0] + "." + objNumerationId[1] + "_" + defLangAssociation + "\">"
								+ defLangAssociation + "</a></LI>");
						newline();
					}
				}
				if (hasHeader) {
					if (pass == BODY) {
						out.write("</UL>");
						newline();
					}
				}

			return;
			// -end- 3CEE8B46037F body3CEE891B03C7 "visitPackage"
		}


		public void visitAssociationDef(AssociationDef adef) throws java.io.IOException {
		
		String associationDefName = encodeString(adef.getDefLangName());
		
		if (pass == CONTENTS) {
			int sectionNumbers[] = new int[2];
			sectionNumbers[0] = numeration;
			sectionNumbers[1] = iddP;
			indexMap.put((ModelElement) adef, sectionNumbers);
		}
		
		String value = "";
		String aName = "";
		if (linkElements) {
			int numerationId[] = (int[]) indexMap.get((ModelElement) adef);
			String numeration = Integer.toString(numerationId[0]) + "." + Integer.toString(numerationId[1]);
			// for the link within the HTML file
				aName = numeration + "_" + associationDefName;
			// concat value that will be written later
			if (suppressChNr) {
				value = associationDefName;
			} else {
				value = numeration + " " + associationDefName;
			}
		} else {
			value = associationDefName;
		}
		
		if (pass == BODY) {
			out.write("<H2><a name=\"" + aName + "\">" + value + "</a></H2>");
			newline();
			if (clsFile != null) {
				clsFile.println(adef.getDefLangName());
				}	
		}
		
		if (pass == CONTENTS) {
			out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#" + aName + "\">"
					+ value + "</a></P>");
			newline();
		}
	
		// Here the values for the decimal places are also increased 
		// this brings you to a new level or new entry
		iddP++;
		
		if (pass == BODY) {
			
			out.write(encodeDescription(mapNlsString(adef.getDocumentation())));
			newline();
			if (adef.iteratorFeature().hasNext() || adef.iteratorAssociation().hasNext()
					|| (adef instanceof Association && ((Association) adef).iteratorConnection().hasNext())) {
				out.write(
						"<TABLE border=\"1\" frame=void roles=rows cellspacing=\"0\" cellpadding=\"7\" height=\"1\">");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				
				out.write("<TR><TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabName") + "</font></TD>");
				newline();
				out.write("<TD width=\"80\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabCode") + "</font></TD>");
				newline();
				out.write("<TD widht=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabDescription") + "</font></TD>");
				newline();
				out.write("<TD width=\"81\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabTypeRel") + "</font></TD>");
				newline();
				out.write("<TD width=\"80\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\" >"
						+ rsrc.getString("CTtabMultiplicity") + "</font></TD>");
				newline();
				out.write("<TD width=\"81\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabOrder") + "</font></TD>");
				newline();
				out.write("<TD width=\"81\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabNav") + "</font></TD></TR>");
				
				newline();
				boolean createSeperator = true;
				java.util.ArrayList elev = new java.util.ArrayList();
				if (adef instanceof Association) {
					// enumerate roles
					java.util.Iterator rolei = ((Association) adef).iteratorConnection();
					while (rolei.hasNext()) {
						Object obj = rolei.next();
						if (obj instanceof AssociationEnd) {
							elev.add(obj);
						}
					}
					java.util.Collections.sort(elev, new CompareByName());
					rolei = elev.iterator();
					while (rolei.hasNext()) {
						Object obj = rolei.next();
						visitRole((AssociationEnd) obj, createSeperator);
						createSeperator = false;
					}
				}
				// enumerate attributes
				elev.clear();
				createSeperator = true;
				java.util.Iterator attri = adef.iteratorFeature();
				while (attri.hasNext()) {
					Object obj = attri.next();
					if (obj instanceof Attribute) {
						elev.add(obj);
					}
				}
				// do not sort list of attributes
				// java.util.Collections.sort(elev,new CompareByName());
				attri = elev.iterator();
				while (attri.hasNext()) {
					Object obj = attri.next();
					visitAttribute((Attribute) obj, createSeperator);
					createSeperator = false;
				}
				// enumerate roles
				elev.clear();
				createSeperator = true;
				java.util.Iterator rolei = adef.iteratorAssociation();
				while (rolei.hasNext()) {
					Object obj = rolei.next();
					// enumerate opposite ends
					Association assoc = ((AssociationEnd) obj).getAssociation();
					java.util.Iterator opprolei = assoc.iteratorConnection();
					while (opprolei.hasNext()) {
						AssociationEnd opprole = (AssociationEnd) opprolei.next();
						// role associated with other class?
						if (opprole != obj) {
							if (assoc instanceof AssociationDef && ((AssociationDef) assoc).isStructureAttribute()
									&& ((RoleDef) opprole)
											.getIliAttributeKind() == AssociationAsIliAttrKind.STRUCTURE) {
								continue;
							}
							elev.add(opprole);
						}
					}
				}
				java.util.Collections.sort(elev, new CompareByName());
				rolei = elev.iterator();
				while (rolei.hasNext()) {
					Object obj = rolei.next();
					visitRole((RoleDef) obj, createSeperator);
					createSeperator = false;
				}
				out.write("</TABLE>");
				newline();
			}
		}
		return;
		// -end- 3CEE8B57008A body3CEE891B03C7 "visitClass"
		}	
		// -beg- preserve=no 3CEE8B57008A head3CEE891B03C7 "visitClass"
		public void visitClass(Class aclass)
				// -end- 3CEE8B57008A head3CEE891B03C7 "visitClass"
				// declare any checked exceptions
				// please fill in/modify the following section
				// -beg- preserve=yes 3CEE8B57008A throws3CEE891B03C7 "visitClass"
				throws java.io.IOException

		// -end- 3CEE8B57008A throws3CEE891B03C7 "visitClass"
		{
			// please fill in/modify the following section
			// -beg- preserve=yes 3CEE8B57008A body3CEE891B03C7 "visitClass"
			if (aclass instanceof AssociationDef && (((AssociationDef) aclass).isStructureAttribute()
					|| ((AssociationDef) aclass).isReferenceAttribute())) {
				return;
			}
			if (aclass instanceof Association && ((Association) aclass).sizeConnection() == 2
					&& aclass.sizeFeature() == 0) {
				return;
			}
			String classDefName = encodeString(aclass.getDefLangName());
			
			if (pass == CONTENTS) {
				int sectionNumbers[] = new int[2];
				sectionNumbers[0] = numeration;
				sectionNumbers[1] = iddP;
				indexMap.put((ModelElement) aclass, sectionNumbers);
			}

			String value = "";
			String aName = "";
			if (linkElements) {
				int numerationId[] = (int[]) indexMap.get((ModelElement) aclass);
				String numeration = Integer.toString(numerationId[0]) + "." + Integer.toString(numerationId[1]);
				// for the link within the HTML file
					aName = numeration + "_" + classDefName;
				// concat value that will be written later
				if (suppressChNr) {
					value = classDefName;
				} else {
					value = numeration + " " + classDefName;
				}
			} else {
				value = classDefName;
			}

			if (pass == BODY) {
				out.write("<H2><a name=\"" + aName + "\">" + value + "</a></H2>");
				newline();
				if (clsFile != null) {
					clsFile.println(aclass.getDefLangName());
					}	
			}

			if (pass == CONTENTS) {
				out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#" + aName + "\">"
						+ value + "</a></P>");
				newline();
			}

			// Here the values for the decimal places are also increased 
			// this brings you to a new level or new entry
			iddP++;

			if (pass == BODY) {
				NlsString classDispName = aclass.getMetaAttrb();
				if(classDispName != null) {
					String metaDispName = classDispName.getValue();
					if(metaDispName != null) {
						out.write("<i>"+metaDispName+"</i>");
						newline();
					}
					else {
						System.out.println("Cosas nulas");
					}
				}else {
					newline();
				}
				
				out.write(encodeDescription(mapNlsString(aclass.getDocumentation())));
				newline();
				if (aclass.iteratorFeature().hasNext() || aclass.iteratorAssociation().hasNext()
						|| (aclass instanceof Association && ((Association) aclass).iteratorConnection().hasNext())) {
					out.write(
							"<TABLE border=\"1\" roles=rows cellspacing=\"0\" cellpadding=\"5\" height=\"1\">");
					newline();
					out.write("<COL>");
					newline();
					out.write("<COL>");
					newline();
					out.write("<COL>");
					newline();
					out.write("<COL>");
					newline();
					out.write("<COL>");
					newline();
					
					out.write("<TR><TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabName") + "</font></TD>");
					newline();
					out.write("<TD width=\"125\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabMetaAttrb") + "</font></TD>");
					newline();
					out.write("<TD width=\"125\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabCode") + "</font></TD>");
					newline();
					out.write("<TD widht=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabDescription") + "</font></TD>");
					newline();
					out.write("<TD width=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabType") + "</font></TD>");
					newline();
					out.write("<TD width=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabUnitMed") + "</font></TD>");
					newline();
					out.write("<TD width=\"80\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabMultiplicity") + "</font></TD>");
					newline();
					out.write("<TD width=\"80\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" size=\"3\" color=\"#ffffff\">"
							+ rsrc.getString("CTtabDomain") + "</font></TD></TR>");
					newline();
					boolean createSeperator = true;
					java.util.ArrayList elev = new java.util.ArrayList();
					if (aclass instanceof Association) {
						// enumerate roles
						java.util.Iterator rolei = ((Association) aclass).iteratorConnection();
						while (rolei.hasNext()) {
							Object obj = rolei.next();
							if (obj instanceof AssociationEnd) {
								elev.add(obj);
							}
						}
						java.util.Collections.sort(elev, new CompareByName());
						rolei = elev.iterator();
						while (rolei.hasNext()) {
							Object obj = rolei.next();
							visitRole((AssociationEnd) obj, createSeperator);
							createSeperator = false;
						}
					}
					// enumerate attributes
					elev.clear();
					createSeperator = true;
					java.util.Iterator attri = aclass.iteratorFeature();
					while (attri.hasNext()) {
						Object obj = attri.next();
						if (obj instanceof Attribute) {
							elev.add(obj);
						}
					}
					// do not sort list of attributes
					// java.util.Collections.sort(elev,new CompareByName());
					attri = elev.iterator();
					while (attri.hasNext()) {
						Object obj = attri.next();
						visitAttribute((Attribute) obj, createSeperator);
						createSeperator = false;
					}
					// enumerate roles
					elev.clear();
					createSeperator = true;
					java.util.Iterator rolei = aclass.iteratorAssociation();
					while (rolei.hasNext()) {
						Object obj = rolei.next();
						// enumerate opposite ends
						Association assoc = ((AssociationEnd) obj).getAssociation();
						java.util.Iterator opprolei = assoc.iteratorConnection();
						while (opprolei.hasNext()) {
							AssociationEnd opprole = (AssociationEnd) opprolei.next();
							// role associated with other class?
							if (opprole != obj) {
								if (assoc instanceof AssociationDef && ((AssociationDef) assoc).isStructureAttribute()
										&& ((RoleDef) opprole)
												.getIliAttributeKind() == AssociationAsIliAttrKind.STRUCTURE) {
									continue;
								}
								elev.add(opprole);
							}
						}
					}
					java.util.Collections.sort(elev, new CompareByName());
					/*rolei = elev.iterator();
					while (rolei.hasNext()) {
						Object obj = rolei.next();
						visitRole((RoleDef) obj, createSeperator);
						createSeperator = false;
					}*/
					out.write("</TABLE>");
					newline();
				}
			}
			return;
			// -end- 3CEE8B57008A body3CEE891B03C7 "visitClass"
		}

		// -beg- preserve=no 3CEE8B8A003D head3CEE891B03C7 "visitAttribute"
		public void visitAttribute(Attribute attr, boolean createSeperator)
				// -end- 3CEE8B8A003D head3CEE891B03C7 "visitAttribute"
				// declare any checked exceptions
				// please fill in/modify the following section
				// -beg- preserve=yes 3CEE8B8A003D throws3CEE891B03C7
				// "visitAttribute"
				throws java.io.IOException

		// -end- 3CEE8B8A003D throws3CEE891B03C7 "visitAttribute"
		{
			// please fill in/modify the following section
			// -beg- preserve=yes 3CEE8B8A003D body3CEE891B03C7 "visitAttribute"
			String typeLabel = getAttrType(attr);
			String typeUnit = getUnit(attr);
			if (pass == BODY) {
				String style = "";
				if (createSeperator) {
					style = " STYLE=\"border-top: solid gray; border-top-width: 2px\"";
				}
				if (clsFile != null) {
					clsFile.indent();
					clsFile.println(attr.getDefLangName());
				}
				NlsString dispName = attr.getMetaAttrb();
				
				if(dispName != null){
					String metaDispName = dispName.getValue();
					
					if(metaDispName != null) {
						if(typeLabel.equals("String") 
								|| typeLabel.equals("Numeric")
								|| typeLabel.equals("Boolean")
								|| typeLabel.equals("Text orientation")
								|| typeLabel.equals("Enumeration")
								|| typeLabel.equals("Coordinate")
								|| typeLabel.equals("Surface")
								|| typeLabel.equals("Area tessellation")
								|| typeLabel.equals("Polyline")
								|| typeLabel.equals("Integer")
								) {
							out.write("<TR><TD " + style + ">" + encodeString(attr.getDefLangName())
							+ "</TD><TD " + style + ">" + encodeString(metaDispName)//mine
							+ "</TD><TD " + style + ">" + encodeString(" ")//mine
							+ "</TD><TD " + style + ">" + encodeDescription(mapNlsString(attr.getDocumentation()))
							+ "</TD><TD " + style + ">" + encodeString(typeLabel)
							+ "</TD><TD " + style + ">" + encodeString(typeUnit)//unitMed
							+ "</TD><TD " + style + ">" + mapMultiplicity(attr.getMultiplicity()) 
							+ "</TD><TD " + style + ">" + encodeString(" ")//domain(ISO)
							+ "</TD></TR>");
							newline();
						
						} 
													
					}
					else {
						if(typeLabel.equals(rsrc.getString("CTtypeTEXT")) 
								|| typeLabel.equals(rsrc.getString("CTtypeNUMERIC"))
								|| typeLabel.equals(rsrc.getString("CTtypeBOOLEAN"))
								|| typeLabel.equals(rsrc.getString("CTtypeHALIGNMENT"))
								|| typeLabel.equals(rsrc.getString("CTtypeVALIGNMENT"))
								|| typeLabel.equals(rsrc.getString("CTtypeENUM"))
								|| typeLabel.equals(rsrc.getString("CTtypeCOORD"))
								|| typeLabel.equals(rsrc.getString("CTtypeSURFACE"))
								|| typeLabel.equals(rsrc.getString("CTtypeAREA"))
								|| typeLabel.equals(rsrc.getString("CTtypePOLYLINE"))
								|| typeLabel.equals("Integer")
								|| typeLabel.equals("XMLDate") 
								|| typeLabel.equals("XMLDateTime") 
								|| typeLabel.equals("GM_Surface2D")
								) {
									out.write("<TR><TD " + style + ">" + encodeString(attr.getDefLangName())
									+ "</TD><TD " + style + ">" + encodeString(" ")//disp
									+ "</TD><TD " + style + ">" + encodeString(" ")//code
									+ "</TD><TD " + style + ">" + encodeDescription(mapNlsString(attr.getDocumentation())));
									if(typeLabel.equals("XMLDate")) {
										out.write( "</TD><TD " + style + ">" + encodeString("Date"));
									} else if(typeLabel.equals("XMLDateTime")) {
										out.write( "</TD><TD " + style + ">" + encodeString("Date Time"));
									} else {
										out.write( "</TD><TD " + style + ">" + encodeString(typeLabel));
									}
									out.write("</TD><TD " + style + ">" + encodeString(typeUnit)//unitMed
									+ "</TD><TD " + style + ">" + mapMultiplicity(attr.getMultiplicity())
									+ "</TD><TD " + style + ">" + encodeString(" ")//domain(ISO)
									+ "</TD></TR>");
									newline();
						} else {
							out.write("<TR><TD " + style + ">" + encodeString(attr.getDefLangName())
							+ "</TD><TD " + style + ">" + encodeString(" ")//disp
							+ "</TD><TD " + style + ">" + encodeString(" ")//code
							+ "</TD><TD " + style + ">" + encodeDescription(mapNlsString(attr.getDocumentation()))
							+ "</TD><TD " + style + ">" + encodeString("Domain")//code
							+ "</TD><TD " + style + ">" + encodeString(typeUnit)//unitMed
							+ "</TD><TD " + style + ">" + mapMultiplicity(attr.getMultiplicity())
							+ "</TD><TD " + style + ">" + encodeString(typeLabel)
							+ "</TD></TR>");
							newline();
						}
					}
					
				}
				else { //DispName null
					if(typeLabel.equals(rsrc.getString("CTtypeTEXT")) 
							|| typeLabel.equals(rsrc.getString("CTtypeNUMERIC"))
							|| typeLabel.equals(rsrc.getString("CTtypeBOOLEAN"))
							|| typeLabel.equals(rsrc.getString("CTtypeHALIGNMENT"))
							|| typeLabel.equals(rsrc.getString("CTtypeVALIGNMENT"))
							|| typeLabel.equals(rsrc.getString("CTtypeENUM"))
							|| typeLabel.equals(rsrc.getString("CTtypeCOORD"))
							|| typeLabel.equals(rsrc.getString("CTtypeSURFACE"))
							|| typeLabel.equals(rsrc.getString("CTtypeAREA"))
							|| typeLabel.equals(rsrc.getString("CTtypePOLYLINE"))
							|| typeLabel.equals("Integer")
							|| typeLabel.equals("XMLDate")
							|| typeLabel.equals("XMLDateTime") 
							|| typeLabel.equals("GM_Surface2D")
							) {
						out.write("<TR><TD " + style + ">" + encodeString(attr.getDefLangName())
						+ "</TD><TD " + style + ">" + encodeString(" ")//disp
						+ "</TD><TD " + style + ">" + encodeString(" ")//code
						+ "</TD><TD " + style + ">" + encodeDescription(mapNlsString(attr.getDocumentation())));
						if(typeLabel.equals("XMLDate")) {
							out.write( "</TD><TD " + style + ">" + encodeString("Date"));
						} else if(typeLabel.equals("XMLDateTime")) {
							out.write( "</TD><TD " + style + ">" + encodeString("Date Time"));
						} else {
							out.write( "</TD><TD " + style + ">" + encodeString(typeLabel));
						}
						out.write("</TD><TD " + style + ">" + encodeString(typeUnit)//unitMed
						+ "</TD><TD " + style + ">" + mapMultiplicity(attr.getMultiplicity())
						+ "</TD><TD " + style + ">" + encodeString(" ")//domain(ISO)
						+ "</TD></TR>");
						newline();
					} else {
						out.write("<TR><TD " + style + ">" + encodeString(attr.getDefLangName())
						+ "</TD><TD " + style + ">" + encodeString(" ")//disp
						+ "</TD><TD " + style + ">" + encodeString(" ")//code
						+ "</TD><TD " + style + ">" + encodeDescription(mapNlsString(attr.getDocumentation()))
						+ "</TD><TD " + style + ">" + encodeString("Domain")//code
						+ "</TD><TD " + style + ">" + encodeString(typeUnit)//unitMed
						+ "</TD><TD " + style + ">" + mapMultiplicity(attr.getMultiplicity())
						+ "</TD><TD " + style + ">" + encodeString(typeLabel)
						+ "</TD></TR>");
						newline();
					}
					
				}
				ch.ehi.interlis.domainsandconstants.Type type = null;
				ch.ehi.interlis.attributes.DomainAttribute attrType = (ch.ehi.interlis.attributes.DomainAttribute) ((AttributeDef) attr)
						.getAttrType();
				if (attrType.containsDirect()) {
					type = attrType.getDirect();
				}
				if (type != null && type instanceof Enumeration) {
					if (pass == BODY) {
						if (clsFile != null)
							clsFile.indent();
						Iterator elei = getEnumEleIterator((Enumeration) type);
						while (elei.hasNext()) {
							ch.ehi.interlis.domainsandconstants.basetypes.EnumElement ele = (ch.ehi.interlis.domainsandconstants.basetypes.EnumElement) elei
									.next();
							String eleName = getEnumEleName(ele);

							if (clsFile != null)
								clsFile.println(eleName);
							out.write("<TR><TD " + style + ">" 
									+ "</TD><TD " + style + ">"
									+ "</TD><TD " + style + ">"
									+ "</TD><TD " + style + ">"	+ encodeString(eleName) 
									+ "</TD><TD " + style + ">"	+ encodeDescription(mapNlsString(ele.getDocumentation())) + "</TD></TR>");
							newline();
						}
						if (clsFile != null)
							clsFile.unindent();
					}
				}
				if (clsFile != null)
					clsFile.unindent();

			}
			return;
			// -end- 3CEE8B8A003D body3CEE891B03C7 "visitAttribute"
		}

		// -beg- preserve=no 3CEE8BA20395 head3CEE891B03C7 "visitRole"
		public void visitRole(AssociationEnd role, boolean createSeperator)
				// -end- 3CEE8BA20395 head3CEE891B03C7 "visitRole"
				// declare any checked exceptions
				// please fill in/modify the following section
				// -beg- preserve=yes 3CEE8BA20395 throws3CEE891B03C7 "visitRole"
				throws java.io.IOException

		// -end- 3CEE8BA20395 throws3CEE891B03C7 "visitRole"
		{
			// please fill in/modify the following section
			// -beg- preserve=yes 3CEE8BA20395 body3CEE891B03C7 "visitRole"
			String type = role.getParticipant().getDefLangName();
			String kind = "";
			if (role instanceof RoleDef) {
				int t = ((RoleDef) role).getAggregation();
				if(t == 2) {
					kind = "Aggregation";
				} else if(t == 3) {
					kind = "Composition";
				} else {
					kind = "Association";
				}
				
			}
			if (pass == BODY) {
				String style = "";
				if (createSeperator) {
					style = " STYLE=\"border-top: solid gray; border-top-width: 2px\"";
				}
				out.write("<TR><TD" + style + ">" + encodeString(role.getDefLangName())
						+ "</TD><TD" + style + ">" + encodeString(" ")
						+ "</TD><TD" + style + ">" + encodeDescription(mapNlsString(role.getDocumentation()))
						+ "</TD><TD" + style + ">" + encodeString(kind)
						+ "</TD><TD" + style + ">" + mapMultiplicity(role.getMultiplicity())
						+ "</TD><TD" + style + ">" + encodeString(type)
						+ "</TD><TD" + style + ">" + encodeString(" ")
						+ "</TD></TR>");
				newline();
				if (clsFile != null) {
					clsFile.indent();
					clsFile.println(role.getDefLangName());
					clsFile.unindent();
				}
			}
			return;
			// -end- 3CEE8BA20395 body3CEE891B03C7 "visitRole"
		}

		public static String getUnit(Attribute attr) {
			String ret = "";
			if ((attr instanceof AttributeDef) && ((AttributeDef) attr).containsAttrType()) {
				ch.ehi.interlis.domainsandconstants.Type type = null;
				ch.ehi.interlis.attributes.DomainAttribute attrType = (ch.ehi.interlis.attributes.DomainAttribute) ((AttributeDef) attr)
						.getAttrType();
				if (attrType.containsDirect()) {
					type = attrType.getDirect();
				}
				if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericType) {
					ch.ehi.interlis.domainsandconstants.basetypes.NumericType num = (ch.ehi.interlis.domainsandconstants.basetypes.NumericType) type;
					if (num.containsUnitDef()) {
						ret = num.getUnitDef().getDefLangName(); //tipo de medida
						return ret;
					}
				}
				
			}
			return " ";
		}

		// declare/define something only in the code
		// please fill in/modify the following section
		// -beg- preserve=yes 3CEE891B03C7 detail_end "HtmlWriter"
		public static String getAttrType(Attribute attr) {
			String ret = "";
			if ((attr instanceof AttributeDef) && ((AttributeDef) attr).containsAttrType()) {
				ch.ehi.interlis.domainsandconstants.Type type = null;
				ch.ehi.interlis.attributes.DomainAttribute attrType = (ch.ehi.interlis.attributes.DomainAttribute) ((AttributeDef) attr)
						.getAttrType();
				if (attrType.containsDomainDef()) {
					type = attrType.getDomainDef().getType();
					ret = attrType.getDomainDef().getDefLangName();
					return ret;
				} else if (attrType.containsDirect()) {
					type = attrType.getDirect();
				}
				if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.Text) {
					ret = rsrc.getString("CTtypeTEXT");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericType) {
					ch.ehi.interlis.domainsandconstants.basetypes.NumericType num = (ch.ehi.interlis.domainsandconstants.basetypes.NumericType) type;
						ret = rsrc.getString("CTtypeNUMERIC");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericalType) {
					ret = rsrc.getString("CTtypeNUMERIC");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.BooleanType) {
					ret = rsrc.getString("CTtypeBOOLEAN");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.HorizAlignment) {
					ret = rsrc.getString("CTtypeHALIGNMENT");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.VertAlignment) {
					ret = rsrc.getString("CTtypeVALIGNMENT");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration) {
					if (attrType.containsDomainDef()) {
						ret = attrType.getDomainDef().getDefLangName();
					} else {
						ret = rsrc.getString("CTtypeENUM");
					}
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType) {
					ret = rsrc.getString("CTtypeCOORD");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.linetypes.IndividualSurface) {
					ret = rsrc.getString("CTtypeSURFACE");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.linetypes.Tesselation) {
					ret = rsrc.getString("CTtypeAREA");
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline) {
					ret = rsrc.getString("CTtypePOLYLINE");
				} else if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType) {
					ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType fool = (ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType) type;
					ret = fool.getParticipant().getName().getValue(); //Dominio de tipo Structure
				}
			}
			return ret;
		}

		static private String nl = null;

		private void newline() throws java.io.IOException {
			if (nl == null)
				nl = System.getProperty("line.separator");
			out.write(nl);
		}

		public static String mapNlsString(ch.ehi.basics.types.NlsString str) {
			if (str == null)
				return "";
			String ret = str.getValue();
			return ret != null ? ret : "";
		}

		public static String mapMultiplicity(ch.ehi.uml1_4.foundation.datatypes.Multiplicity m) {
			if (m == null) {
				return "";
			}
			StringBuffer ret = new StringBuffer();
			java.util.Iterator rangei = m.iteratorRange();
			String sep = "";
			while (rangei.hasNext()) {
				ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange range = (ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange) rangei
						.next();
				long lower = range.getLower();
				ret.append(sep);
				ret.append(lower);
				long upper = range.getUpper();
				if (lower != upper) {
					ret.append("..");
					if (upper == ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange.UNBOUND) {
						ret.append("n");
					} else {
						ret.append(upper);
					}
					sep = ";";
				}
			}
			return ret.toString();
		}

		public static String encodeDescription(String doc) {
			if (doc == null || doc.length() == 0)
				return "";
			StringBuffer ret = new StringBuffer();
			String beg = "<P>";
			String end = "</P>";
			// for each line
			int last = 0;
			int next = doc.indexOf("\n", last);
			while (next > -1) {
				String line = doc.substring(last, next);
				ret.append(beg + encodeString(line) + end);
				last = next + 1;
				next = doc.indexOf("\n", last);
			}
			String line = doc.substring(last);
			ret.append(beg + encodeString(line) + end);
			return ret.toString();
		}

		public static String encodeString(String s) {
			StringBuffer str = new StringBuffer();

			int len = (s != null) ? s.length() : 0;
			for (int i = 0; i < len; i++) {
				char ch = s.charAt(i);
				switch (ch) {
				case '<': {
					str.append("&lt;");
					break;
				}
				case '>': {
					str.append("&gt;");
					break;
				}
				case '&': {
					str.append("&amp;");
					break;
				}
				case '"': {
					str.append("&quot;");
					break;
				}
				case 'ä': {
					str.append("&auml;");
					break;
				}
				case 'ö': {
					str.append("&ouml;");
					break;
				}
				case 'ü': {
					str.append("&uuml;");
					break;
				}
				case '\r':
				case '\n': {
					// if (canonical) {
					// str.append("&#");
					// str.append(Integer.toString(ch));
					// str.append(';');
					// break;
					// }
					// else, default append char
				}
				default: {
					str.append(ch);
				}
				}
			}

			return str.toString();
		}

		private String formatText(String resourceName, String param0) {
			return ch.ehi.basics.i18n.MessageFormat.format(rsrc, resourceName, param0);
		}

		/**
		 * Go over the whole structure. The individual headings of the HTML file
		 * are also written here
		 * @param apackage
		 * Package <the current object> to be gone through
		 * @throws IOException
		 *  throws ev. Exception in the writer
		 */
		private void walkTree(Namespace apackage) throws java.io.IOException {
			if (pass == CONTENTS || pass == BODY) {
				out.write("<font face=\"Arial\">");
				newline();

				if (pass == CONTENTS) {
					out.write("<H1>" + rsrc.getString("CTContents") + "</H1>");
					newline();
				}

				java.util.ArrayList todo = new java.util.ArrayList();
				todo.add(apackage);
				while (!todo.isEmpty()) {
					Namespace current = (Namespace) todo.get(0);
					if (!current.getDefLangName().startsWith("<")) {
						if (current instanceof Class && !(current instanceof AssociationDef)) {
							visitClass((Class) current);
						}
						else if(current instanceof Class && current instanceof AssociationDef) {
							visitAssociationDef((AssociationDef) current);
						}
						else if (isEnumDomainDef(current)) {
							visitEnumDomainDef((DomainDef) current);
						} else {
							visitPackage(current);
						}
						// add child packages to end of todo list; so we walk the
						// tree by level
						java.util.Iterator childi = current.iteratorOwnedElement();
						java.util.ArrayList classv = new java.util.ArrayList();
						java.util.ArrayList assov = new java.util.ArrayList();
						java.util.ArrayList packv = new java.util.ArrayList();
						while (childi.hasNext()) {
							Object obj = childi.next();
							if (obj instanceof Package || obj instanceof Artifact) {
								packv.add(obj);
							} else if ((obj instanceof Class) && !(obj instanceof AssociationDef)) {
								classv.add(obj);
							} else if ((obj instanceof Class) && (obj instanceof AssociationDef)) {
								assov.add(obj);
							} else if (isEnumDomainDef(obj)) {
								classv.add(obj);
							}
						}
						// add associations sorted
						java.util.Collections.sort(assov, new CompareByName());
						todo.addAll(1, assov);
						// add classes sorted
						java.util.Collections.sort(classv, new CompareByName());
						todo.addAll(1, classv);
						// add packages sorted
						java.util.Collections.sort(packv, new CompareByName());
						todo.addAll(packv);
					}
					// remove current from todo-list
					todo.remove(0);

				}
				resetCounters();
				out.write("</font>");
				newline();
			}

			if (pass == INDEX) {
				//
				// print model elements sorted by name
				//
				out.write("<font face=\"Arial\">");
				newline();
				out.write("<H1>" + rsrc.getString("CTIndex") + "</H1>");
				newline();

				// list<ModelElement>
				// indexMap is setup in CONTENTS pass
				List sortedModelElements = new ArrayList();
				for (Iterator idxIt = indexMap.keySet().iterator(); idxIt.hasNext();) {
					Object obj = idxIt.next();
					if (obj instanceof ModelElement) {
						sortedModelElements.add(obj);
					}
				}

				// Sortierung aller Werte der Objekte - Strings!!
				Collections.sort(sortedModelElements, new CompareByNameAndIdx());

				out.write("<font face=\"Arial\" size=\"3\">");
				newline();
				out.write("<p>");
				newline();

				for (char i = 'A'; i <= 'Z'; i++) {
					Iterator itSortedNames = sortedModelElements.iterator();
					boolean writtenChar = false;
					while (itSortedNames.hasNext()) {
						String name = null;
						name = ((ModelElement) itSortedNames.next()).getDefLangName();

						if (name != null && name.length() > 0 && Character.toUpperCase(name.charAt(0)) == i) {
							if (writtenChar == false) {
								out.write("  <a href=\"#" + name + "\"><u>" + i + "&nbsp;</u></a>");
								newline();
								writtenChar = true;
							}
						}
					}

					if (writtenChar == false) {
						out.write("  " + i + "&nbsp;");
						newline();
					}

				}
				out.write("</p>");
				out.write("</font>");
				newline();
				out.write("<br>");
				newline();

				String lastName = null;
				boolean check = false;
				for (int a = 0; a < sortedModelElements.size(); a++) {
					// value: Object, bzw. String auf der list, dass dann in HTML
					// geschrieben wird sp�ter
					ModelElement modelElement = (ModelElement) sortedModelElements.get(a);
					String name = modelElement.getDefLangName();
					if (name == null)
						name = "";

					int sectionNumbers[] = (int[]) indexMap.get(modelElement);
					int sectionNumbersLength = sectionNumbers.length;
					// conctated serialNumber
					String sectionNumber = null;
					if (sectionNumbersLength == 2) {
						sectionNumber = Integer.toString(sectionNumbers[0]) + "." + Integer.toString(sectionNumbers[1]);
					}

					else if (sectionNumbersLength == 1) {
						sectionNumber = Integer.toString(sectionNumbers[0]);
					}
					if (name.equals(lastName)) {
						out.write(",&nbsp;<a href=\"#" + sectionNumber + "_" + encodeString(name) + "\" name=\"" + name
								+ "\">" + sectionNumber + "</a>");
						newline();
					} else {
						if (check != false) {
							out.write("</p>");
						}
						out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\">");
						out.write("<a href=\"#" + sectionNumber + "_" + encodeString(name) + "\" name=\"" + name + "\">"
								+ encodeString(name) + " " + sectionNumber + "</a>");
						newline();
						check = true;

					}
					lastName = name;
				}

				out.write("</font>");
				newline();
			}

			// Counters werden zu ihrem Ursprungswert zur�ckgesetzt
			resetCounters();
		}

		class CompareByNameAndIdx implements java.util.Comparator {
			public int compare(Object o1, Object o2) {
				if (!(o1 instanceof ModelElement)) {
					// ch.softenvironment.util.Tracer.getInstance().debug(o1.toString());
				}
				if (!(o2 instanceof ModelElement)) {
					// ch.softenvironment.util.Tracer.getInstance().debug(o2.toString());
				}
				ModelElement e1 = (ModelElement) o1;
				ModelElement e2 = (ModelElement) o2;
				String name1 = e1.getDefLangName();
				if (name1 == null)
					name1 = "";
				String name2 = e2.getDefLangName();
				if (name2 == null)
					name2 = "";
				int compareName = name1.compareTo(name2);
				if (compareName == 0) {
					int[] ae1 = (int[]) indexMap.get(e1);
					int[] ae2 = (int[]) indexMap.get(e2);
					int compareFirstIndex = new Integer(ae1[0]).compareTo(new Integer(ae2[0]));
					return compareFirstIndex;
				}

				return compareName;
			}
		}

		class CompareByName implements java.util.Comparator {
			public int compare(Object o1, Object o2) {
				if (!(o1 instanceof ModelElement)) {
					// ch.softenvironment.util.Tracer.getInstance().debug(o1.toString());
				}
				if (!(o2 instanceof ModelElement)) {
					// ch.softenvironment.util.Tracer.getInstance().debug(o2.toString());
				}
				ModelElement e1 = (ModelElement) o1;
				ModelElement e2 = (ModelElement) o2;
				String name1 = e1.getDefLangName();
				if (name1 == null)
					name1 = "";
				String name2 = e2.getDefLangName();
				if (name2 == null)
					name2 = "";
				int compareName = name1.compareTo(name2);
				return compareName;
			}
		}

		/**
		 * die INT - Werte, die f�r die ID's der Element gebraucht werden
		 * (Nummerierung der Element), werden wieder auf ihren Ursprungswert
		 * zur�ckgesetzt.
		 */
		private void resetCounters() {
			numeration = 0;
			iddP = 1;
		}

		private void walkTreeRecursiv(Namespace aPackage) throws java.io.IOException {
			if (aPackage.getDefLangName().startsWith("<")) {
				return;
			}
			visitPackage(aPackage);
			Iterator childi = aPackage.iteratorOwnedElement();
			java.util.ArrayList elev = new java.util.ArrayList();
			while (childi.hasNext()) {
				Object obj = childi.next();
				if (obj instanceof Package || obj instanceof Artifact || obj instanceof Class || isEnumDomainDef(obj)) {
					elev.add(obj);
				}
			}
			java.util.Collections.sort(elev, new CompareByName());
			childi = elev.iterator();
			while (childi.hasNext()) {
				Object obj = childi.next();
				if (obj instanceof Package || obj instanceof Artifact) {
					level = level + 0.5;
					walkTreeRecursiv((Namespace) obj);
					level = level - 0.5;
				} else if (obj instanceof Class && (obj instanceof AssociationDef)) {
					level = level + 0.5;
					visitAssociationDef((AssociationDef) obj);
					level = level - 0.5;
				} else if (obj instanceof Class && !(obj instanceof AssociationDef)) {
					level = level + 0.5;
					visitClass((Class) obj);
					level = level - 0.5;
				} else if (isEnumDomainDef(obj)) {
					level = level + 0.5;
					visitEnumDomainDef((DomainDef) obj);
					level = level - 0.5;
				}
			}
		}

		private boolean isEnumDomainDef(Object obj) {
			if (!(obj instanceof DomainDef)) {
				return false;
			}
			DomainDef def = (DomainDef) obj;
			return (def.getType() instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration);
		}

		private void visitEnumDomainDef(DomainDef domdef) throws java.io.IOException {
			String domDefName = encodeString(domdef.getDefLangName());
			String domDoc = encodeString((domdef.getDocumentation() != null)?domdef.getDocumentation().getValue(): " ");
			ch.ehi.interlis.domainsandconstants.basetypes.Enumeration def = (ch.ehi.interlis.domainsandconstants.basetypes.Enumeration) domdef
					.getType();

			if (pass == CONTENTS) {
				int sectionNumbers[] = new int[2];
				sectionNumbers[0] = numeration;
				sectionNumbers[1] = iddP;
				indexMap.put((ModelElement) domdef, sectionNumbers);
			}

			String value = "";
			String aName = "";
			if (linkElements) {
				int numerationId[] = (int[]) indexMap.get((ModelElement) domdef);
				String numeration = Integer.toString(numerationId[0]) + "." + Integer.toString(numerationId[1]);
				// f�r den Link innerhalb der HTML-Datei
				aName = numeration + "_" + domDefName;
				// concatedValue, dass geschrieben wird sp�ter
				if (suppressChNr) {
					value = domDefName;
				} else {
					value = numeration + " " + domDefName;
				}
			} else {
				value = domDefName;
			}

			if (pass == BODY) {
				out.write("<H2><a name=\"" + aName + "\">" + value + "</a></H2>");
				newline();
			}

			if (pass == CONTENTS) {
				out.write("<p style=\"text-indent: 0; line-height: 15%; margin-left: 0\"><a href=\"#" + aName + "\">"
						+ value + "</a></P>");
				newline();
				if (clsFile != null)
					clsFile.println(domdef.getDefLangName());
			}

			// Hier wird der Werte f�r die Kommastellen auch erh�ht
			// damit kommt man in eine neue Ebene, bzw. neuer Einzug
			iddP++;

			if (pass == BODY) {
				out.write(encodeDescription(mapNlsString(domdef.getDocumentation())));
				newline();
				out.write("<TABLE border=\"1\" frame=void cellspacing=\"0\" cellpadding=\"5\" height=\"1\">");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<COL>");
				newline();
				out.write("<TR><TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabDomain") + "</font></TD>");
				newline();
				out.write("<TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabEtiq") + "</font></TD>");
				newline();
				out.write("<TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabCode") + "</font></TD>");
				newline();
				out.write("<TD widht=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabDescription") + "</font></TD>");
				newline();
				out.write("<TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabEtiq") + "</font></TD>");
				newline();
				out.write("<TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabCode") + "</font></TD>");
				newline();
				out.write("<TD widht=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabDescription") + "</font></TD>");
				newline();
				out.write("<TD widht=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabEtiq") + "</font></TD>");
				newline();
				out.write("<TD width=\"85\" bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabCode") + "</font></TD>");
				newline();
				out.write("<TD widht=\"80\"bgcolor=\"#4954b5\" align=\"left\"><font face=\"Arial\" color=\"#ffffff\">"
						+ rsrc.getString("CTtabDescription") + "</font></TD></TR>");
				newline();
				boolean createSeperator = true;
				Iterator elei = getEnumEleIterator(def);
				if (clsFile != null)
					clsFile.indent();
				out.write("<TR><TD ROWSPAN=\""+ 0 + "\"> "+ encodeString(domDefName)+"</TD>");
				while (elei.hasNext()) {
					ch.ehi.interlis.domainsandconstants.basetypes.EnumElement ele = (ch.ehi.interlis.domainsandconstants.basetypes.EnumElement) elei
							.next();
					if (pass == BODY) {
						String style = "";
						/*
						 * if(createSeperator){
						 * style=" STYLE=\"border-top: solid black; border-top-width: 2px\""
						 * ; }
						 */
					
						String eleName = getEnumEleName(ele);
						String[] etiqueta = eleName.split("\\.");
						
						if(etiqueta.length == 1) {
							String ePrincipal = (etiqueta[0] != null)?etiqueta[0]:" ";
							out.write(
							 "<TD" + style + ">" + encodeString(ePrincipal)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeDescription(mapNlsString(ele.getDocumentation()))
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(" ") 
							+ "</TD><TD" + style + ">" + encodeString(" ")//eTerciaria)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD></TR>");
							newline();
						} else if(etiqueta.length == 2) {
							String ePrincipal = (etiqueta[0] != null)?etiqueta[0]:" ";
							String eSecundaria = (etiqueta[1] != null)?etiqueta[1]:" ";
							out.write(
							"<TD" + style + ">" + encodeString(ePrincipal)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeDescription(mapNlsString(ele.getEnumeration().getParent().getDocumentation()))
							+ "</TD><TD" + style + ">" + encodeString(eSecundaria)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeDescription(mapNlsString(ele.getDocumentation())) 
							+ "</TD><TD" + style + ">" + encodeString(" ")//eTerciaria)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD></TR>");
							newline();
						} else if(etiqueta.length == 3) {
							String ePrincipal = (etiqueta[0] != null)?etiqueta[0]:" ";
							String eSecundaria = (etiqueta[1] != null)?etiqueta[1]:" ";
							String eTerciaria = (etiqueta[2] != null)?etiqueta[2]:" ";
							out.write(
							"<TD" + style + ">" + encodeString(ePrincipal)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeDescription(mapNlsString(ele.getEnumeration().getParent().getEnumeration().getParent().getDocumentation()))
							+ "</TD><TD" + style + ">" + encodeString(eSecundaria)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(eTerciaria)//eTerciaria)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeDescription(mapNlsString(ele.getDocumentation()))
							+ "</TD></TR>");
							newline();
						}
							else {
							String ePrincipal = (etiqueta[0] != null)?etiqueta[0]:" ";
							String eSecundaria = (etiqueta[1] != null)?etiqueta[1]:" ";
							String eTerciaria = (etiqueta[2] != null)?etiqueta[2]:" ";
							out.write("<TR><TD" + style + ">" + encodeString(domDefName)
							+ "</TD><TD" + style + ">" + encodeString(ePrincipal)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(domDoc)
							+ "</TD><TD" + style + ">" + encodeString(eSecundaria)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeDescription(mapNlsString(ele.getDocumentation())) //Documentacion del padre	
							+ "</TD><TD" + style + ">" + encodeString(mapNlsString(ele.getMetaAttrb()))//eTerciaria)
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD><TD" + style + ">" + encodeString(" ")
							+ "</TD></TR>");
							newline();
						}
												
						if (clsFile != null)
							clsFile.println(eleName);
						}

				}
				if (clsFile != null)
					clsFile.unindent();
				out.write("</TABLE>");
				newline();
			}
			return;

		}

		private String getEnumEleName(EnumElement ele) {
			StringBuffer ret = new StringBuffer(ele.getDefLangName());
			Enumeration parent = ele.getEnumeration();
			while (parent.containsParent()) {
				EnumElement parentEle = parent.getParent();
				ret.insert(0, ".");
				ret.insert(0, parentEle.getDefLangName());
				parent = parentEle.getEnumeration();
			}
			return ret.toString();
		}

		private void getEnumEleSubEles(java.util.List accu, Enumeration def) {
			Iterator elei = def.iteratorEnumElement();
			while (elei.hasNext()) {
				EnumElement ele = (EnumElement) elei.next();
				if (ele.containsChild()) {
					getEnumEleSubEles(accu, ele.getChild());
				} else {
					accu.add(ele);
				}
			}
		}

		private Iterator getEnumEleIterator(Enumeration def) {
			java.util.List accu = new java.util.ArrayList();
			getEnumEleSubEles(accu, def);
			return accu.iterator();
		}

		// suppress chapter numbers
		private boolean suppressChNr = false;

		public void setChapterNumbering(boolean suppress) {
			suppressChNr = suppress;
		}
		// -end- 3CEE891B03C7 detail_end "HtmlWriter"
}
