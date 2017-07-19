package org.automation.soapui;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

/**
 * Created by shantonu on 7/8/17.
 */
public class FunctionalTestRunner extends SoapUiRunner implements Runnable{
    private SoapUITestCaseRunner runner;


    private FunctionalTestRunner(){
        runner = new SoapUITestCaseRunner();
    }

    public FunctionalTestRunner(String soap_ui_tc_path) {
        this();
        this.path_xml_tc = soap_ui_tc_path;

    }
    public FunctionalTestRunner(String soap_ui_tc_path,
                                String[] properties) {
        this(soap_ui_tc_path);
        this.prop=properties;
        this.tc_name = "Default Test case name";
        this.suit_name="Default Test suit name";
    }
    public FunctionalTestRunner(String soap_ui_tc_path,
                                String[] properties,
                                String tcName,
                                String tc_suitName){
        this(soap_ui_tc_path,properties);
        this.tc_name = tcName;
        this.suit_name=tc_suitName;
    }


    protected void init(){//init for functional tests

        //common
        runner.setDomain(domain);
        runner.setHost(host);
        runner.setEndpoint(end_point_url);
        runner.setSettingsFile(settings_file_path);
        runner.setProjectProperties(prop);
        runner.setTestCase(tc_name);
        runner.setTestSuite(suit_name);
        runner.setOutputFolder(output_folder);

        runner.setIgnoreErrors(false);
        runner.setExportAll(true);
        runner.setJUnitReport(true);
        runner.setPrintReport(true);
        runner.setEnableUI(true);


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
