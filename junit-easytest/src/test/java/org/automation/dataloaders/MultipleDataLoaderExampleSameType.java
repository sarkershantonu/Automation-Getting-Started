package org.automation.dataloaders;

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 * Does not support xls & CSV in same data loader
 * does not support multiple data loader in same class or method
 * supports only same loader in multiple files, right most is higher priority
 */
@RunWith(DataDrivenTestRunner.class)
public class MultipleDataLoaderExampleSameType extends DataDrivenTest{

    @Test
    @DataLoader(filePaths = {"calculator3.csv","calculator2.csv"})//calculator2 is accepted not 2=> why, it honors the last item, top item of the array list of files
    public void testAdd(@Param(name = "a") Double a, @Param(name = "b")Double b, @Param(name = "expected")Double expected){
        Assert.assertEquals(expected, calculator.add(a,b),0.1);
    }

}
