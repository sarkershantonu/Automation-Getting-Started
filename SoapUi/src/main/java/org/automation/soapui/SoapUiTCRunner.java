package org.automation.soapui;

import com.eviware.soapui.tools.AbstractSoapUITestRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 7/12/17.
 */
public abstract class SoapUiTCRunner {
    protected String suit_name;
    protected String tc_name;
    protected String path_xml_tc;
    protected String[] prop;
    protected String domain;
    protected String host;
    protected String end_point_url;
    protected String output_folder;
    protected String settings_file_path;
    protected String[] initProperties() throws IOException {
        Properties p = new Properties();
        String[] props = new String[30];

        int i=0;
        p.load(new FileInputStream(new File("./testcases/app.properties")));
        for (String k : p.stringPropertyNames()) {
            props[i++]=k+"="+p.getProperty(k);
        }
        return props;
    }
    protected String[] initProperties(String pathOfApplicationProperty) throws IOException {
        Properties p = new Properties();
        String[] props = new String[30];

        int i=0;
        p.load(new FileInputStream(new File(pathOfApplicationProperty)));
        for (String k : p.stringPropertyNames()) {
            props[i++]=k+"="+p.getProperty(k);
        }
        return props;
    }
}
