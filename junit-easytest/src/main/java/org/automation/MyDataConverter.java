package org.automation;

import lombok.NonNull;
import org.easetech.easytest.converter.AbstractConverter;

import java.util.Map;

/**
 * Created by shantonu on 7/16/16.
 */
public class MyDataConverter extends AbstractConverter<MyDataType> {
    @Override

    public MyDataType convert(@NonNull Map<String, Object> convertFrom) {
        MyDataType data = new MyDataType();
        data.setId((Long) convertFrom.get("id"));
        return data;
    }
}
