package org.automation.UnitTests;

import org.automation.Calculator;
import org.automation.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 7/16/16.
 */
public class MultipleDataLoader extends DataDrivenTest{

    @Test
    @DataLoader(filePaths = {"calculator2.csv","calculator3.csv"})//calculator3 is accepted not 2.
    public void testAdd(@Param(name = "a") Double a, @Param(name = "b")Double b, @Param(name = "expected")Double expected){
        Assert.assertEquals(expected, calculator.add(a,b),0.1);
    }

}
