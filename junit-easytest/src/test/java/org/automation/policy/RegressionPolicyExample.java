package org.automation.policy;

import org.easetech.easytest.annotation.*;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Ignore;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 */
@Ignore
@Parallel(threads = 1)
@Display(fields = "expected")
@Report(reportTypes = Report.REPORT_TYPE.DEFAULT,
        outputFormats = Report.EXPORT_FORMAT.XLS,
        outputLocation = "classpath:reports")
public class RegressionPolicyExample {

}
