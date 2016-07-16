package org.automation.policy;

import org.easetech.easytest.annotation.*;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 */

@Parallel(threads = 1)
@Display(fields = "a")
@Report(reportTypes = Report.REPORT_TYPE.DEFAULT, outputFormats = Report.EXPORT_FORMAT.XLS,outputLocation = "classpath:reports")
@DataLoader(filePaths = "calculator.csv", loaderType = LoaderType.CSV)
//todo checking @TestConfigProvider
public class RegressionPolicy {
}
