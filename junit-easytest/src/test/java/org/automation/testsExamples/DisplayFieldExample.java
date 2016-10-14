package org.automation.testsExamples;

import org.automation.core.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Display;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 8/26/16.
 */

@RunWith(DataDrivenTestRunner.class)
@Report(outputLocation = "file:TestReports", reportTypes = Report.REPORT_TYPE.DEFAULT)
public class DisplayFieldExample extends DataDrivenTest{
    @Test
    @DataLoader(filePaths = "calculator2.csv", loaderType = LoaderType.CSV)
    @Display(fields = "expected")//only expected filed will be shown in test meta info not report
    public void testAdd(@Param(name = "a") Double a,
                               @Param(name = "b") Double b,
                               @Param(name = "expected") Double expected) {

        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }
}
