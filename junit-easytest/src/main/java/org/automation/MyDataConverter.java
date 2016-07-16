package org.automation;

import lombok.NonNull;
import org.easetech.easytest.converter.AbstractConverter;

import java.util.Map;

/**
 * Created by shantonu on 7/16/16.
 */
public class MyDataConverter extends AbstractConverter<MyData> {
    @Override

    public MyData convert(@NonNull Map<String, Object> convertFrom) {
        MyData data = new MyData();
        data.setAddress((String) convertFrom.get("address"));
        data.setName((String) convertFrom.get("name"));
        data.setId((Long) convertFrom.get("id"));
        return data;
    }
}
