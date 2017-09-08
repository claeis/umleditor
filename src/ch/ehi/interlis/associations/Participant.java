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

// -beg- preserve=no 448933B703CF package "Participant"
package ch.ehi.interlis.associations;
// -end- 448933B703CF package "Participant"

// -beg- preserve=no 448933B703CF autoimport "Participant"
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 448933B703CF autoimport "Participant"
import ch.ehi.basics.types.NlsString;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448933B703CF import "Participant"

// -end- 448933B703CF import "Participant"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.2 $ $Date: 2007-03-24 20:18:27 $
 */
public class Participant extends AbstractModelElement {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448933B703CF detail_begin "Participant"

	// -end- 448933B703CF detail_begin "Participant"

	/**
	 *
	 */
	private static final long serialVersionUID = 3562951267695748062L;

	// -beg- preserve=no 448D37E501EC head448933B703CF "unlinkAll"
	public void unlinkAll()
	// -end- 448D37E501EC head448933B703CF "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D37E501EC throws448933B703CF "unlinkAll"

	// -end- 448D37E501EC throws448933B703CF "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D37E501EC body448933B703CF "unlinkAll"

		detachAssociation();
		detachParticipant();
		clearRestriction();
		super.unlinkAll();
		// -end- 448D37E501EC body448933B703CF "unlinkAll"
	}

	// -beg- preserve=no 448D37E50200 head448933B703CF "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 448D37E50200 head448933B703CF "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D37E50200 throws448933B703CF "enumerateChildren"

	// -end- 448D37E50200 throws448933B703CF "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D37E50200 body448933B703CF "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 448D37E50200 body448933B703CF "enumerateChildren"
	}

	// -beg- preserve=no 4489342E01A0 code448933B703CF "association"
	private RoleDef association;
	// -end- 4489342E01A0 code448933B703CF "association"

	/**
	 * attaches a Association.
	 *
	 * @see #detachAssociation
	 * @see #getAssociation
	 * @see #containsAssociation
	 */
	// -beg- preserve=no 4489342E01A0 attach_head448933B703CF
	// "Participant::attachAssociation"
	public void attachAssociation(RoleDef association1)
	// -end- 4489342E01A0 attach_head448933B703CF
	// "Participant::attachAssociation"
	{
		// -beg- preserve=no 4489342E01A0 attach_body448933B703CF
		// "Participant::attachAssociation"
		if (association != null) {
			throw new java.lang.IllegalStateException("already a association attached");
		}
		if (association1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as association");
		}
		association = association1;
		association1._linkXorParticipant(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAssociation"));
		return;
		// -end- 4489342E01A0 attach_body448933B703CF
		// "Participant::attachAssociation"
	}

	/**
	 * disconnect the currently attached Association.
	 * 
	 * @see #attachAssociation
	 */
	// -beg- preserve=no 4489342E01A0 detach_head448933B703CF
	// "Participant::detachAssociation"
	public RoleDef detachAssociation()
	// -end- 4489342E01A0 detach_head448933B703CF
	// "Participant::detachAssociation"
	{
		// -beg- preserve=no 4489342E01A0 detach_body448933B703CF
		// "Participant::detachAssociation"
		RoleDef ret = null;
		if (association != null) {
			association._unlinkXorParticipant(this);
			ret = association;
			association = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAssociation"));
		return ret;
		// -end- 4489342E01A0 detach_body448933B703CF
		// "Participant::detachAssociation"
	}

	/**
	 * get the currently attached Association.
	 * 
	 * @see #attachAssociation
	 */
	// -beg- preserve=no 4489342E01A0 get_head448933B703CF
	// "Participant::getAssociation"
	public RoleDef getAssociation()
	// -end- 4489342E01A0 get_head448933B703CF "Participant::getAssociation"
	{
		// -beg- preserve=no 4489342E01A0 get_body448933B703CF
		// "Participant::getAssociation"
		if (association == null) {
			throw new java.lang.IllegalStateException("no association attached");
		}
		return association;
		// -end- 4489342E01A0 get_body448933B703CF "Participant::getAssociation"
	}

	/**
	 * tests if there is a Association attached.
	 * 
	 * @see #attachAssociation
	 */
	// -beg- preserve=no 4489342E01A0 test_head448933B703CF
	// "Participant::containsAssociation"
	public boolean containsAssociation()
	// -end- 4489342E01A0 test_head448933B703CF
	// "Participant::containsAssociation"
	{
		// -beg- preserve=no 4489342E01A0 test_body448933B703CF
		// "Participant::containsAssociation"
		return association != null;
		// -end- 4489342E01A0 test_body448933B703CF
		// "Participant::containsAssociation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 4489342E01A0 _link_body448933B703CF
	// "Participant::_linkAssociation"
	public void _linkAssociation(RoleDef association1) {
		association = association1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociation"));
		return;
	}
	// -end- 4489342E01A0 _link_body448933B703CF "Participant::_linkAssociation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 4489342E01A0 _unlink_body448933B703CF
	// "Participant::_unlinkAssociation"
	public void _unlinkAssociation(RoleDef association1) {
		association = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociation"));
		return;
	}
	// -end- 4489342E01A0 _unlink_body448933B703CF
	// "Participant::_unlinkAssociation"

	// -beg- preserve=no 44893509032B code448933B703CF "participant"
	private AbstractClassDef participant;
	// -end- 44893509032B code448933B703CF "participant"

	/**
	 * attaches a Participant.
	 *
	 * @see #detachParticipant
	 * @see #getParticipant
	 * @see #containsParticipant
	 */
	// -beg- preserve=no 44893509032B attach_head448933B703CF
	// "Participant::attachParticipant"
	public void attachParticipant(AbstractClassDef participant1)
	// -end- 44893509032B attach_head448933B703CF
	// "Participant::attachParticipant"
	{
		// -beg- preserve=no 44893509032B attach_body448933B703CF
		// "Participant::attachParticipant"
		if (participant != null) {
			throw new java.lang.IllegalStateException("already a participant attached");
		}
		if (participant1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as participant");
		}
		participant = participant1;
		participant1._linkXorAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachParticipant"));
		return;
		// -end- 44893509032B attach_body448933B703CF
		// "Participant::attachParticipant"
	}

	/**
	 * disconnect the currently attached Participant.
	 * 
	 * @see #attachParticipant
	 */
	// -beg- preserve=no 44893509032B detach_head448933B703CF
	// "Participant::detachParticipant"
	public AbstractClassDef detachParticipant()
	// -end- 44893509032B detach_head448933B703CF
	// "Participant::detachParticipant"
	{
		// -beg- preserve=no 44893509032B detach_body448933B703CF
		// "Participant::detachParticipant"
		AbstractClassDef ret = null;
		if (participant != null) {
			participant._unlinkXorAssociation(this);
			ret = participant;
			participant = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachParticipant"));
		return ret;
		// -end- 44893509032B detach_body448933B703CF
		// "Participant::detachParticipant"
	}

	/**
	 * get the currently attached Participant.
	 * 
	 * @see #attachParticipant
	 */
	// -beg- preserve=no 44893509032B get_head448933B703CF
	// "Participant::getParticipant"
	public AbstractClassDef getParticipant()
	// -end- 44893509032B get_head448933B703CF "Participant::getParticipant"
	{
		// -beg- preserve=no 44893509032B get_body448933B703CF
		// "Participant::getParticipant"
		if (participant == null) {
			throw new java.lang.IllegalStateException("no participant attached");
		}
		return participant;
		// -end- 44893509032B get_body448933B703CF "Participant::getParticipant"
	}

	/**
	 * tests if there is a Participant attached.
	 * 
	 * @see #attachParticipant
	 */
	// -beg- preserve=no 44893509032B test_head448933B703CF
	// "Participant::containsParticipant"
	public boolean containsParticipant()
	// -end- 44893509032B test_head448933B703CF
	// "Participant::containsParticipant"
	{
		// -beg- preserve=no 44893509032B test_body448933B703CF
		// "Participant::containsParticipant"
		return participant != null;
		// -end- 44893509032B test_body448933B703CF
		// "Participant::containsParticipant"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 44893509032B _link_body448933B703CF
	// "Participant::_linkParticipant"
	public void _linkParticipant(AbstractClassDef participant1) {
		participant = participant1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkParticipant"));
		return;
	}
	// -end- 44893509032B _link_body448933B703CF "Participant::_linkParticipant"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 44893509032B _unlink_body448933B703CF
	// "Participant::_unlinkParticipant"
	public void _unlinkParticipant(AbstractClassDef participant1) {
		participant = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkParticipant"));
		return;
	}
	// -end- 44893509032B _unlink_body448933B703CF
	// "Participant::_unlinkParticipant"

	// -beg- preserve=no 4489358A00CE code448933B703CF "restriction"
	private java.util.Set restriction = new java.util.HashSet();
	// -end- 4489358A00CE code448933B703CF "restriction"

	/**
	 * add a Restriction.
	 *
	 * @see #removeRestriction
	 * @see #containsRestriction
	 * @see #iteratorRestriction
	 * @see #clearRestriction
	 * @see #sizeRestriction
	 */
	// -beg- preserve=no 4489358A00CE add_head448933B703CF
	// "Participant::addRestriction"
	public void addRestriction(AbstractClassDef restriction1)
	// -end- 4489358A00CE add_head448933B703CF "Participant::addRestriction"
	{
		// -beg- preserve=no 4489358A00CE add_body448933B703CF
		// "Participant::addRestriction"
		restriction.add(restriction1);
		restriction1._linkXorRestrictedAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addRestriction"));
		return;
		// -end- 4489358A00CE add_body448933B703CF "Participant::addRestriction"
	}

	/**
	 * disconnect a Restriction.
	 * 
	 * @see #addRestriction
	 */
	// -beg- preserve=no 4489358A00CE remove_head448933B703CF
	// "Participant::removeRestriction"
	public AbstractClassDef removeRestriction(AbstractClassDef restriction1)
	// -end- 4489358A00CE remove_head448933B703CF
	// "Participant::removeRestriction"
	{
		// -beg- preserve=no 4489358A00CE remove_body448933B703CF
		// "Participant::removeRestriction"
		AbstractClassDef ret = null;
		if (restriction1 == null || !restriction.contains(restriction1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = restriction1;
		restriction.remove(restriction1);
		restriction1._unlinkXorRestrictedAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeRestriction"));
		return ret;
		// -end- 4489358A00CE remove_body448933B703CF
		// "Participant::removeRestriction"
	}

	/**
	 * tests if a given Restriction is connected.
	 * 
	 * @see #addRestriction
	 */
	// -beg- preserve=no 4489358A00CE test_head448933B703CF
	// "Participant::containsRestriction"
	public boolean containsRestriction(AbstractClassDef restriction1)
	// -end- 4489358A00CE test_head448933B703CF
	// "Participant::containsRestriction"
	{
		// -beg- preserve=no 4489358A00CE test_body448933B703CF
		// "Participant::containsRestriction"
		return restriction.contains(restriction1);
		// -end- 4489358A00CE test_body448933B703CF
		// "Participant::containsRestriction"
	}

	/**
	 * used to enumerate all connected Restrictions.
	 * 
	 * @see #addRestriction
	 */
	// -beg- preserve=no 4489358A00CE get_all_head448933B703CF
	// "Participant::iteratorRestriction"
	public java.util.Iterator iteratorRestriction()
	// -end- 4489358A00CE get_all_head448933B703CF
	// "Participant::iteratorRestriction"
	{
		// -beg- preserve=no 4489358A00CE get_all_body448933B703CF
		// "Participant::iteratorRestriction"
		return restriction.iterator();
		// -end- 4489358A00CE get_all_body448933B703CF
		// "Participant::iteratorRestriction"
	}

	/**
	 * disconnect all Restrictions.
	 * 
	 * @see #addRestriction
	 */
	// -beg- preserve=no 4489358A00CE remove_all_head448933B703CF
	// "Participant::clearRestriction"
	public void clearRestriction()
	// -end- 4489358A00CE remove_all_head448933B703CF
	// "Participant::clearRestriction"
	{
		// -beg- preserve=no 4489358A00CE remove_all_body448933B703CF
		// "Participant::clearRestriction"
		if (sizeRestriction() > 0) {
			for (java.util.Iterator p = restriction.iterator(); p.hasNext();) {
				((AbstractClassDef) p.next())._unlinkXorRestrictedAssociation(this);
			}
			restriction.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearRestriction"));
		}
		// -end- 4489358A00CE remove_all_body448933B703CF
		// "Participant::clearRestriction"
	}

	/**
	 * returns the number of Restrictions.
	 * 
	 * @see #addRestriction
	 */
	// -beg- preserve=no 4489358A00CE size_head448933B703CF
	// "Participant::sizeRestriction"
	public int sizeRestriction()
	// -end- 4489358A00CE size_head448933B703CF "Participant::sizeRestriction"
	{
		// -beg- preserve=no 4489358A00CE size_body448933B703CF
		// "Participant::sizeRestriction"
		return restriction.size();
		// -end- 4489358A00CE size_body448933B703CF
		// "Participant::sizeRestriction"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 4489358A00CE _link_body448933B703CF
	// "Participant::_linkRestriction"
	public void _linkRestriction(AbstractClassDef restriction1) {
		restriction.add(restriction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkRestriction"));
		return;
	}
	// -end- 4489358A00CE _link_body448933B703CF "Participant::_linkRestriction"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 4489358A00CE _unlink_body448933B703CF
	// "Participant::_unlinkRestriction"
	public void _unlinkRestriction(AbstractClassDef restriction1) {
		restriction.remove(restriction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkRestriction"));
		return;
	}
	// -end- 4489358A00CE _unlink_body448933B703CF
	// "Participant::_unlinkRestriction"

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}
	public NlsString getMetaName() {
		return super.getMetaName();
	}

	public void setMetaName(NlsString value) {
		super.setMetaName(value);
	}
	public NlsString getMetaMsg() {
		return super.getMetaMsg();
	}

	public void setMetaMsg(NlsString value) {
		super.setMetaMsg(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448933B703CF detail_end "Participant"

	// -end- 448933B703CF detail_end "Participant"

}
