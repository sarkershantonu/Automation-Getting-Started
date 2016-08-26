package org.automation.core;

import org.automation.Calculator;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 8/26/16.
 */
@RunWith(DataDrivenTestRunner.class)
@Report(outputLocation = "file:TestReports",
        outputFormats = Report.EXPORT_FORMAT.PDF,
        reportTypes = {Report.REPORT_TYPE.METHOD_DURATION, Report.REPORT_TYPE.DEFAULT})
public abstract class DataDrivenTest_withDefaultAnnotation {
    protected Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }
}
