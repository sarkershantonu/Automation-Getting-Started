package org.automation.webtest.core;


import org.automation.webtest.config.AppConstants;
import org.automation.webtest.config.PropertyLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SqlReader {

    public static  String read(final String filePath){
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines.get(0);
    }

    public static void main(String[] args) {
        try {
            PropertyLoader.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(SqlReader.read(AppConstants.SQL_PATH + "department.meal.sql"));
    }
}
