package org.automation.customtype;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 * todo
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
