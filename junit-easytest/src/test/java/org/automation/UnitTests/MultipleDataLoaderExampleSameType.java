package org.automation.UnitTests;

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 7/16/16.
 * Does not support xls & CSV in same data loader
 * does not support multiple data loader in same class or method
 * supports only same loader in multiple files, right most is higher priority
 */
public class MultipleDataLoaderExampleSameType extends DataDrivenTest{

    @Test
    @DataLoader(filePaths = {"calculator2.csv","calculator3.csv"})//calculator3 is accepted not 2.
    public void testAdd(@Param(name = "a") Double a, @Param(name = "b")Double b, @Param(name = "expected")Double expected){
        Assert.assertEquals(expected, calculator.add(a,b),0.1);
    }

}
