package org.automation.reports;

/**
 * Created by shantonu on 12/12/16.
 */

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataDrivenTestRunner.class)
@Report
public class DefaultReportExample extends DataDrivenTest{
    @Test
    @DataLoader(filePaths = "calculator2.xls")
    public void testAdd(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }

}
