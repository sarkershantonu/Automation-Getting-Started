package org.automation;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

/**
 * Created by shantonu on 7/6/17.
 * todo, complete a test example
 */
public class SoapUiHelper {

    private String[] prop;//need init
    private void runWithSoapUI(String soap_ui_tc_path) throws Exception {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile(soap_ui_tc_path);
        runner.setProjectProperties(prop);

        runner.setTestSuite("");//define suit
        runner.setTestCase("");//define test cases
        runner.setPrintReport(true);
        runner.setJUnitReport(true);
        runner.run();
    }
}
