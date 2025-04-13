package org.automation.junit5.support;

import java.util.stream.Stream;

public class StringParameters {
    public static Stream<String> emptyStrings(){
        return Stream.of(null,""," ");
    }
}
