package ch.ehi.interlis.modeltopicclass;

import ch.ehi.uml1_4.implementation.AbstractEditorElement;

public class StringPair extends AbstractEditorElement {
    private String key=null;
    private String value=null;
    public StringPair() {
        super();
    }
    public StringPair(String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}
