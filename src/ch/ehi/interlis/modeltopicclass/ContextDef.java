package ch.ehi.interlis.modeltopicclass;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractModelElement;

import java.io.Serializable;

public class ContextDef extends AbstractModelElement implements ModelElement, IliSyntax, Serializable {

    private  NlsString syntax = null;

    @Override
    public NlsString getSyntax() {
        return syntax;
    }

    @Override
    public void setSyntax(NlsString syntax) {
        this.syntax = syntax;
    }
}
