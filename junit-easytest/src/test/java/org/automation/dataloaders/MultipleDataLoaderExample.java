package org.automation.dataloaders;

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 8/22/16.
 */
@RunWith(DataDrivenTestRunner.class)
public class MultipleDataLoaderExample extends DataDrivenTest {

    // only the first loader will be working..
    // in here "calculator2.csv"
    @Test
    @DataLoader(filePaths = {"calculator2.csv","calculator3.xml"})
    public void testAdd(@Param(name = "a") Double a, @Param(name = "b")Double b, @Param(name = "expected")Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }
}
