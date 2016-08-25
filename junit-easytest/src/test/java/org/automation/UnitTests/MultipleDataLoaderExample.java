package org.automation.UnitTests;

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 8/22/16.
 */
public class MultipleDataLoaderExample extends DataDrivenTest {
    @Test
    @DataLoader(filePaths = {"calculator2.csv","calculator3.xml"})
    public void testAdd(@Param(name = "a") Double a, @Param(name = "b")Double b, @Param(name = "expected")Double expected){
        Assert.assertEquals(expected, calculator.add(a,b),0.1);
    }

}
