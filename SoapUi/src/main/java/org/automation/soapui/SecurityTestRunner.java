package org.automation.soapui;

import com.eviware.soapui.tools.SoapUISecurityTestRunner;


/**
 * Created by shantonu on 7/12/17.
 */
public class SecurityTestRunner extends SoapUiTCRunner implements Runnable{
    private SoapUISecurityTestRunner runner;
    private String security_test_name;

    private SecurityTestRunner (){
        runner = new SoapUISecurityTestRunner();
    }

    public SecurityTestRunner(String soap_ui_tc_path) {
        this();
        this.path_xml_tc = soap_ui_tc_path;

    }

    public SecurityTestRunner(String soap_ui_tc_path,
                                 String[] properties) {
        this(soap_ui_tc_path);
        this.prop = properties;
        this.tc_name = "Default Test case name";
        this.suit_name = "Default Test suit name";
    }

    public SecurityTestRunner(String soap_ui_tc_path,
                                 String[] properties,
                                 String tcName,
                                 String tc_suitName) {
        this(soap_ui_tc_path, properties);
        this.tc_name = tcName;
        this.suit_name = tc_suitName;
    }
    protected void init() {//init for security  tests
        runner.setSecurityTestName(security_test_name);
        runner.setJUnitReport(true);

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
            if(prop==null){
                prop=initProperties();//if app property is not added, we will load default properties
            }
            runner.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
