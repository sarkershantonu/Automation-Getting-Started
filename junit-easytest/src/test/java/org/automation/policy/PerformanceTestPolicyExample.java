package org.automation.policy;

import org.easetech.easytest.annotation.Display;
import org.easetech.easytest.annotation.Parallel;
import org.easetech.easytest.annotation.Report;
import org.junit.Ignore;

/**
 * Created by shantonu on 8/26/16.
 */

@Ignore
@Parallel(threads = 15)
@Display(fields = "expected")
@Report(reportTypes = Report.REPORT_TYPE.METHOD_DURATION,
        outputFormats = Report.EXPORT_FORMAT.XLS,
        outputLocation = "file:TestReports")
public class PerformanceTestPolicyExample {
}
