package org.automation.policy;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Display;
import org.easetech.easytest.annotation.Parallel;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Ignore;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/19/16.
 */

@Ignore
@Parallel(threads = 2)
@Report(reportTypes = {Report.REPORT_TYPE.DEFAULT, Report.REPORT_TYPE.METHOD_DURATION},
        outputFormats = Report.EXPORT_FORMAT.PDF,outputLocation = "file:reports")
@DataLoader(filePaths = "mydata.csv", loaderType = LoaderType.CSV)// i preffer data loder should be with method
@Display(fields = "id")
public class LocalTestPolicy {
}
