package org.automation.support.steps;

/**
 * Created by shantonu on 9/17/17.
 */
public class ParamInfo {
    private Object type;
    private Object value;

    public ParamInfo(Object type, Object value) {
        this.type = type;
        this.value = value;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
