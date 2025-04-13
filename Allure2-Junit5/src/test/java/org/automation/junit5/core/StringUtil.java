package org.automation.junit5.core;

public class StringUtil {
    public static boolean isBlank(final String input){
        return (null==input)||(input.trim().isEmpty());
    }
}
