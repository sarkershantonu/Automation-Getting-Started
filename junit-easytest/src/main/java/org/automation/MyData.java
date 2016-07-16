package org.automation;

import lombok.Data;

/**
 * Created by shantonu on 7/16/16.
 */
@Data
public class MyData {

    private String name;
    private String address;
    private Long id;

    public MyData(String name, String address, Long id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }
}
