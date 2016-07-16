package org.automation;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * Created by shantonu on 7/16/16.
 */
public class MyDataEditor extends PropertyEditorSupport {

    public void setAsText(Long id, String name, String address){
        setValue(new MyData(name, address,id));
    }
}
