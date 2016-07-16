package org.automation.UnitTests;

import org.automation.Calculator;
import org.automation.MyData;
import org.automation.MyDataConverter;
import org.easetech.easytest.annotation.Converters;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.converter.ConverterManager;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 */
@RunWith(DataDrivenTestRunner.class)

public class CustomObjectConverterTest {
    private Calculator calculator;

    @BeforeClass
    public static void initClass(){
        ConverterManager.registerConverter(MyDataConverter.class);
    }

    @Before
    public void init(){
        calculator = new Calculator();
    }
    @Test
    @DataLoader(filePaths = "mydata.csv")
    @Converters(MyDataConverter.class)
    public void testParam(MyData data){

        System.out.println(data.toString());
    }
}
