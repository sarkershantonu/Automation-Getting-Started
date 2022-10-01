package org.automation.example.config;

import java.io.File;
import java.io.IOException;

public class SuiteFileLoader {
    public static String suiteFolder = System.getProperty("suite.folder");
    public static String getFilePaths(String suiteName) throws IOException {
        return new File("./"+suiteFolder+"/"+suiteName).getCanonicalPath();
    }

}
