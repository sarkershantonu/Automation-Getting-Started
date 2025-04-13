package org.automation.junit5.support;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class SpatialStringProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of("`"),
                Arguments.of("~"),
                Arguments.of("!"),
                Arguments.of("@"),
                Arguments.of("#"),
                Arguments.of("$"),
                Arguments.of("%"),
                Arguments.of("^"),
                Arguments.of("&"),
                Arguments.of("*"),
                Arguments.of("("),
                Arguments.of(")"),
                Arguments.of("-"),
                Arguments.of("_"),
                Arguments.of("="),
                Arguments.of("+"),
                Arguments.of("["),
                Arguments.of("]"),
                Arguments.of("{"),
                Arguments.of("}"),
                Arguments.of("\\"),
                Arguments.of("|"),
                Arguments.of(";"),
                Arguments.of(":"),
                Arguments.of("'"),
                Arguments.of("\""),
                Arguments.of(","),
                Arguments.of("."),
                Arguments.of("<"),
                Arguments.of(">"),
                Arguments.of("/"),
                Arguments.of("?"),
                Arguments.of("\\n"),
                Arguments.of("\\s"),
                Arguments.of("\\t")
        );
    }

}
