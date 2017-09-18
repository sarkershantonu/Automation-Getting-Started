package org.automation.support.steps;

/**
 * Created by shantonu on 9/17/17.
 */
public class ParamInfo {
    private Class type;
    private Object value;

    @Override
    public String toString() {
        return "ParamInfo{" +
                "type=" + type.getName() +
                ", value=" + value.toString() +
                '}';
    }
}
