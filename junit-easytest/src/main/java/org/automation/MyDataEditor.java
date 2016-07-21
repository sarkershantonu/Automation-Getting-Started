package org.automation;

import java.beans.PropertyEditorSupport;

/**
 * Created by shantonu on 7/16/16.
 */
public class MyDataEditor extends PropertyEditorSupport {

    public void setAsText(String item){
        setValue(new MyDataType(Long.valueOf(item)));
    }
}
