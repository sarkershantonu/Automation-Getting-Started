package org.automation.reports;


import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shantonu on 8/23/16.
 */
@RunWith(DataDrivenTestRunner.class)
@Report(outputLocation = "classpath:TestReports")
public class ClassPathExampleReport extends DataDrivenTest{

    @Test
    @DataLoader(filePaths = "calculator.xls")
    public void testAddFromExcel(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }
    @Test
    @DataLoader(filePaths = "calculator2.xls")
    public void testAdd(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {

        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }
}
