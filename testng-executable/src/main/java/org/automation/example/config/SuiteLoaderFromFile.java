package org.automation.example.config;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SuiteLoaderFromFile {
    public static String suiteFolder = System.getProperty("suite.folder");

    public static String getFilePaths(String suiteName) throws IOException {
        return new File("./" + suiteFolder + "/" + suiteName).getCanonicalPath();
    }

    public static List<String> getSuites() throws IOException {
        final String suiteConfigFile = System.getProperty("suite.config");
        return Files.readAllLines(Paths.get(new File(suiteConfigFile).toURI()));
    }

    public static List<String> getSuitesWithPath() throws IOException {
        List<String> newNames = new ArrayList<>();
        List<String> old = getSuites();
        for (String s : old) {
            newNames.add(getFilePaths(s));
        }
        return newNames;
    }
}

