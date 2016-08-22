package org.automation.UnitTests;

import org.automation.MyDataType;

import org.easetech.easytest.annotation.Converters;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.converter.ConverterManager;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 */
@RunWith(DataDrivenTestRunner.class)
public class CustomObjectConverterTest {

    @BeforeClass
    public static void initClass(){

    }

    @Test
    @DataLoader(filePaths = "mydata.csv")
    public void testParam(MyDataType data){

        System.out.println(data.toString());
    }
}
