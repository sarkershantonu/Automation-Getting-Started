package org.automation;

import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/15/16.
 */
@RunWith(DataDrivenTestRunner.class)
@Report(outputLocation = "file:Reports", outputFormats = Report.EXPORT_FORMAT.PDF, reportTypes = {Report.REPORT_TYPE.METHOD_DURATION, Report.REPORT_TYPE.DEFAULT})
public abstract class DataDrivenTest {
    protected Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }
}
