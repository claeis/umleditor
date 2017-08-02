package ch.ehi.umleditor.application;

import ch.ehi.interlis.modeltopicclass.AbstractClassDef;

public class ParticipantsPanelItem {
	private AbstractClassDef target = null;
	private AbstractClassDef[] restrictions = null;

	public ParticipantsPanelItem(ParticipantsPanelItem src) {
		target = src.target;
		restrictions = (AbstractClassDef[]) src.restrictions.clone();
	}

	public ParticipantsPanelItem(AbstractClassDef target, java.util.Iterator restrictionsIterator) {
		this.target = target;
		java.util.ArrayList rv = new java.util.ArrayList();
		while (restrictionsIterator.hasNext()) {
			rv.add(restrictionsIterator.next());
		}
		restrictions = (AbstractClassDef[]) rv.toArray(new AbstractClassDef[0]);
	}

	public ParticipantsPanelItem(AbstractClassDef target) {
		this.target = target;
		restrictions = new AbstractClassDef[0];
	}

	public AbstractClassDef[] getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(AbstractClassDef[] restrictions) {
		this.restrictions = restrictions;
	}

	public AbstractClassDef getTarget() {
		return target;
	}

	public void setTarget(AbstractClassDef target) {
		this.target = target;
	}

}
