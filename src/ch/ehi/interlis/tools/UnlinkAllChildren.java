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

// -beg- preserve=no 3CBD9E92024A package "UnlinkAllChildren"
package ch.ehi.interlis.tools;
// -end- 3CBD9E92024A package "UnlinkAllChildren"

// -beg- preserve=no 3CBD9E92024A autoimport "UnlinkAllChildren"
import ch.ehi.interlis.tools.ChildCollector;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.umleditor.umlpresentation.Note;
import ch.ehi.interlis.domainsandconstants.DomainDef;
// -end- 3CBD9E92024A autoimport "UnlinkAllChildren"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3CBD9E92024A import "UnlinkAllChildren"

// -end- 3CBD9E92024A import "UnlinkAllChildren"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.2 $ $Date: 2004-01-03 16:02:00 $
 */
public class UnlinkAllChildren extends ChildCollector {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CBD9E92024A detail_begin "UnlinkAllChildren"

	// -end- 3CBD9E92024A detail_begin "UnlinkAllChildren"

	// -beg- preserve=no 3CBD9EB300A2 head3CBD9E92024A "unlinkThem"
	public void unlinkThem()
	// -end- 3CBD9EB300A2 head3CBD9E92024A "unlinkThem"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CBD9EB300A2 throws3CBD9E92024A "unlinkThem"

	// -end- 3CBD9EB300A2 throws3CBD9E92024A "unlinkThem"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CBD9EB300A2 body3CBD9E92024A "unlinkThem"
		// unlink each child from rest of model
		// ch.softenvironment.util.Tracer.getInstance().debug(this,
		// "unlinkThem()", "{{{start");
		java.util.List childv = getChildren();
		java.util.Iterator it = childv.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof ch.ehi.uml1_4.foundation.core.Element) {
				// boolean old=false;
				// if(obj instanceof
				// ch.ehi.interlis.modeltopicclass.ClassDef)old=ch.ehi.uml1_4.changepropagation.MetaModel.setEventLogging(true);
				((ch.ehi.uml1_4.foundation.core.Element) obj).unlinkAll();
				// if(obj instanceof
				// ch.ehi.interlis.modeltopicclass.ClassDef)ch.ehi.uml1_4.changepropagation.MetaModel.setEventLogging(old);
			} else if (obj instanceof ch.ehi.uml1_4.implementation.AbstractEditorElement) {
				((ch.ehi.uml1_4.implementation.AbstractEditorElement) obj).unlinkAll();
			}
		}
		// ch.softenvironment.util.Tracer.getInstance().debug(this,
		// "unlinkThem()", "}}}end");
		return;
		// -end- 3CBD9EB300A2 body3CBD9E92024A "unlinkThem"
	}

	/**
	 * add IliImport and Translation as well to list of children
	 */
	// -beg- preserve=no 3CC66E0502DE head3CBD9E92024A "visitModelDef"
	public void visitModelDef(ModelDef modeldef)
	// -end- 3CC66E0502DE head3CBD9E92024A "visitModelDef"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC66E0502DE throws3CBD9E92024A "visitModelDef"

	// -end- 3CC66E0502DE throws3CBD9E92024A "visitModelDef"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC66E0502DE body3CBD9E92024A "visitModelDef"
		defaultVisit(modeldef);
		java.util.Iterator it = null;
		// add IliImport, Translation
		it = modeldef.iteratorClientDependency();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.modeltopicclass.IliImport
					|| child instanceof ch.ehi.interlis.modeltopicclass.Translation) {
				visit(child);
			}
		}
		return;
		// -end- 3CC66E0502DE body3CBD9E92024A "visitModelDef"
	}

	/**
	 * add TopicDepends, TopicExtends, PatternUse to list of children
	 */
	// -beg- preserve=no 3CC66EAD034E head3CBD9E92024A "visitTopicDef"
	public void visitTopicDef(TopicDef topicdef)
	// -end- 3CC66EAD034E head3CBD9E92024A "visitTopicDef"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC66EAD034E throws3CBD9E92024A "visitTopicDef"

	// -end- 3CC66EAD034E throws3CBD9E92024A "visitTopicDef"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC66EAD034E body3CBD9E92024A "visitTopicDef"
		defaultVisit(topicdef);
		java.util.Iterator it = null;
		// add TopicDepends
		it = topicdef.iteratorClientDependency();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.modeltopicclass.TopicDepends) {
				visit(child);
			}
		}
		// add TopicExtendsExtends
		it = topicdef.iteratorGeneralization();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.modeltopicclass.TopicExtends) {
				visit(child);
			}
		}
		return;
		// -end- 3CC66EAD034E body3CBD9E92024A "visitTopicDef"
	}

	/**
	 * add ClassExtends and ConstarintDef to list of children
	 */
	// -beg- preserve=no 3CC66FC50093 head3CBD9E92024A "visitAbstractClassDef"
	public void visitAbstractClassDef(AbstractClassDef classdef)
	// -end- 3CC66FC50093 head3CBD9E92024A "visitAbstractClassDef"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC66FC50093 throws3CBD9E92024A "visitAbstractClassDef"

	// -end- 3CC66FC50093 throws3CBD9E92024A "visitAbstractClassDef"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC66FC50093 body3CBD9E92024A
		// "visitAbstractClassDef"
		defaultVisit(classdef);
		java.util.Iterator it = null;
		// add ClassExtends
		it = classdef.iteratorGeneralization();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.modeltopicclass.ClassExtends) {
				visit(child);
			}
		}
		it = classdef.iteratorSpecialization();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.modeltopicclass.ClassExtends) {
				visit(child);
			}
		}
		// add ConstraintDef
		it = classdef.iteratorConstraint();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.constraints.ConstraintDef) {
				visit(child);
			}
		}
		// add Presentations of RoleDef, but not RoleDefs
		it = classdef.iteratorAssociation();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.associations.RoleDef) {
				java.util.Iterator pri = ((ch.ehi.interlis.associations.RoleDef) child).iteratorPresentation();
				while (pri.hasNext()) {
					visit(pri.next());
				}
			}
		}
		return;
		// -end- 3CC66FC50093 body3CBD9E92024A "visitAbstractClassDef"
	}

	// -beg- preserve=no 3CC67E4702CF head3CBD9E92024A "defaultVisit"
	public void defaultVisit(java.lang.Object object)
	// -end- 3CC67E4702CF head3CBD9E92024A "defaultVisit"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC67E4702CF throws3CBD9E92024A "defaultVisit"

	// -end- 3CC67E4702CF throws3CBD9E92024A "defaultVisit"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC67E4702CF body3CBD9E92024A "defaultVisit"
		super.defaultVisit(object);
		java.util.Iterator it = null;
		// add presentation
		if (object instanceof ch.ehi.uml1_4.foundation.core.ModelElement) {
			it = ((ch.ehi.uml1_4.foundation.core.ModelElement) object).iteratorPresentation();
			while (it.hasNext()) {
				Object child = it.next();
				visit(child);
			}
		}
		if (object instanceof ch.ehi.uml1_4.foundation.core.PresentationElement) {
			ch.ehi.uml1_4.foundation.core.PresentationElement node = (ch.ehi.uml1_4.foundation.core.PresentationElement) object;
			java.util.Iterator edgei = node.iteratorPresentationEdge();
			while (edgei.hasNext()) {
				Object child = edgei.next();
				visit(child);
			}
		}
		return;
		// -end- 3CC67E4702CF body3CBD9E92024A "defaultVisit"
	}

	// -beg- preserve=no 3D4FDCA3003A head3CBD9E92024A "visitNote"
	public void visitNote(Note note)
	// -end- 3D4FDCA3003A head3CBD9E92024A "visitNote"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FDCA3003A throws3CBD9E92024A "visitNote"

	// -end- 3D4FDCA3003A throws3CBD9E92024A "visitNote"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D4FDCA3003A body3CBD9E92024A "visitNote"
		defaultVisit(note);
		java.util.Iterator it = null;
		// add NoteEdge
		it = note.iteratorPresentationEdge();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.umleditor.umlpresentation.NoteEdge) {
				visit(child);
			}
		}
		return;
		// -end- 3D4FDCA3003A body3CBD9E92024A "visitNote"
	}

	/**
	 * add DomainExtends to list of children
	 */
	// -beg- preserve=no 3D58C34402F9 head3CBD9E92024A "visitDomainDef"
	public void visitDomainDef(DomainDef classdef)
	// -end- 3D58C34402F9 head3CBD9E92024A "visitDomainDef"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D58C34402F9 throws3CBD9E92024A "visitDomainDef"

	// -end- 3D58C34402F9 throws3CBD9E92024A "visitDomainDef"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D58C34402F9 body3CBD9E92024A "visitDomainDef"
		defaultVisit(classdef);
		java.util.Iterator it = null;
		// add DomainExtends
		it = classdef.iteratorGeneralization();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.domainsandconstants.DomainExtends) {
				visit(child);
			}
		}
		it = classdef.iteratorSpecialization();
		while (it.hasNext()) {
			Object child = it.next();
			if (child instanceof ch.ehi.interlis.domainsandconstants.DomainExtends) {
				visit(child);
			}
		}
		// -end- 3D58C34402F9 body3CBD9E92024A "visitDomainDef"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CBD9E92024A detail_end "UnlinkAllChildren"

	// -end- 3CBD9E92024A detail_end "UnlinkAllChildren"

}
