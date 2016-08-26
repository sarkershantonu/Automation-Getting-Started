package org.automation.examples;

import org.automation.core.DataDrivenTest;
import org.automation.core.DataDrivenTest_withDefaultAnnotation;
import org.easetech.easytest.annotation.*;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 */
@Parallel(threads = 5)//this is very fragile
public class ParallelTestExample extends DataDrivenTest_withDefaultAnnotation {

    @Test
    @DataLoader(filePaths = "calculator.xls", loaderType = LoaderType.EXCEL)
    public void testAddFromExcel(@Param(name = "a") Double a, @Param(name = "b")Double b, @Param(name = "expected")Double expected){
        Assert.assertEquals(expected, calculator.add(a,b),0.1);
    }

}
