package org.automation.testsExamples;

import org.automation.core.DataDrivenTest_withDefaultAnnotation;
import org.easetech.easytest.annotation.*;
import org.easetech.easytest.loader.LoaderType;
import org.junit.Assert;
import org.junit.Test;

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
