package org.automation.junit5.tests.parameterized;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.time.LocalDate;

/**
 * Created by shantonu on 4/3/2021
 */
public class DateConverterWithSlash implements ArgumentConverter {
    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        if(!(source instanceof String)){
            throw new IllegalArgumentException("Date value is not string "+source );
        }
        try
        {
            String[] dateTimeParts = ((String) source).split("/");
            int month = Integer.parseInt(dateTimeParts[0]);
            int date = Integer.parseInt(dateTimeParts[0]);
            int year = Integer.parseInt(dateTimeParts[0]);

            return LocalDate.of(year,date,month);

        }catch (Exception e){
            throw new IllegalArgumentException("Failed to convert",e);
        }
    }
}
