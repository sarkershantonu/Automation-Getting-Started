package org.automation.junit5.core;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.lang.reflect.Field;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class VariableArgumentProvider implements ArgumentsProvider, AnnotationConsumer<VariableStream> {

    private String variableName;
    @Override
    public void accept(VariableStream variableStream) {
       variableName = variableStream.value();
    }

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        Stream<Arguments> field_load = context.getTestClass().map(this::getField).map(this::getValue).orElseThrow(() -> new IllegalArgumentException("field load"));
        return field_load;
    }
    private Field getField(Class<?> klass) throws NoSuchFieldException {
        return klass.getDeclaredField(variableName);
    }
    private Stream<Arguments> getValue(Field filed) throws IllegalAccessException {
        return (Stream<Arguments>) filed.get(null);
    }
}
