package org.automation.reports;

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 8/26/16.
 */

@RunWith(DataDrivenTestRunner.class)
@Report(reportTypes = Report.REPORT_TYPE.METHOD_DURATION,outputLocation = "file:TestReports")// report type default is assertion results & multi format allowed
public class PerformanceExampleReport extends DataDrivenTest {

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
