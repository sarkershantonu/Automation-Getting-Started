package org.automation.UnitTests;

import org.automation.Calculator;
import org.automation.MyDataConverter;
import org.easetech.easytest.annotation.Converters;
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
@Converters(MyDataConverter.class)
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
    public void testAdd(){
        Assert.assertEquals(25.0, calculator.add(10.5,14.5),0.1);
    }
}
