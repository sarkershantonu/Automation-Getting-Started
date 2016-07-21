package org.automation;

import lombok.Data;

/**
 * Created by shantonu on 7/16/16.
 */
@Data
public class MyDataType {
    public MyDataType(Long id) {
        this.id = id;
    }
    public MyDataType(){}
    private Long id;
}
