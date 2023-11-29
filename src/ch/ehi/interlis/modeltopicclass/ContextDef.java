package ch.ehi.interlis.modeltopicclass;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractModelElement;

import java.io.Serializable;

public class ContextDef extends AbstractModelElement implements ModelElement, IliSyntax, Serializable {

    private  NlsString syntax = null;

    @Override
    public void unlinkAll() {
        setSyntax(null);
        super.unlinkAll();
    }

    @Override
    public void enumerateChildren(AbstractVisitor visitor) {
        visitor.visit(getSyntax());
        super.enumerateChildren(visitor);
    }

    @Override
    public NlsString getSyntax() {
        return syntax;
    }

    @Override
    public void setSyntax(NlsString value) {
        if(syntax!=value && (syntax==null || !syntax.equals(value))){
            syntax = value;
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
        }
    }
}
