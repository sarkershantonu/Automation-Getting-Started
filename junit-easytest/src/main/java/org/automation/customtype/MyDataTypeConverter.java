package org.automation.customtype;

import org.easetech.easytest.converter.AbstractConverter;

import java.util.Map;

/**
 * Created by shantonu on 8/27/16.
 * it does simple thing... takes a map(check mapping) and convert into my object.
 */
public class MyDataTypeConverter extends AbstractConverter<MyDataType> {
    public MyDataType convert(Map<String, Object> from) {
        return new MyDataType(
                (Long) from.get("MyDataTypeId"),
                (String) from.get("MyDataTypeName"),
                (String) from.get("MyDataTypeMobile"));
    }
}
