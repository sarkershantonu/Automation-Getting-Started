package org.automation.soapui;

import com.eviware.soapui.tools.SoapUILoadTestRunner;

/**
 * Created by shantonu on 7/12/17.
 */
public class PerformanceTestRunner extends SoapUiRunner implements Runnable {

    private SoapUILoadTestRunner runner;
    private String loadTestName;
    private long thread_count;
    private int limit;



    private PerformanceTestRunner() {
        runner = new SoapUILoadTestRunner();
    }

    public PerformanceTestRunner(String soap_ui_tc_path) {
        this();
        this.path_xml_tc = soap_ui_tc_path;

    }

    public PerformanceTestRunner(String soap_ui_tc_path,
                                 String[] properties) {
        this(soap_ui_tc_path);
        this.prop = properties;
        this.tc_name = "Default Test case name";
        this.suit_name = "Default Test suit name";
    }

    public PerformanceTestRunner(String soap_ui_tc_path,
                                 String[] properties,
                                 String tcName,
                                 String tc_suitName) {
        this(soap_ui_tc_path, properties);
        this.tc_name = tcName;
        this.suit_name = tc_suitName;
    }

    protected void init() {//init for performance tests
        runner.setLoadTest(loadTestName);
        runner.setThreadCount(thread_count);
        runner.setLimit(limit);
        runner.setDomain(domain);
        runner.setEndpoint(end_point_url);
        runner.setPrintReport(true);
        runner.setEnableUI(true);
        runner.setProjectProperties(prop);
        runner.setTestCase(tc_name);
        runner.setTestSuite(suit_name);
        runner.setOutputFolder(output_folder);
        runner.setSettingsFile(settings_file_path);
    }


    public void run() {
        try {
            init();
            if (prop == null) {
                prop = initProperties();//if app property is not added, we will load default properties
            }
            runner.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
