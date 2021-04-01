package org.automation.junit5.tests.parameterized;

import org.automation.junit5.tests.parameterized.VariableStream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class StreamArgumentProvider implements ArgumentsProvider, AnnotationConsumer<VariableStream> {

    private String variableName;
    @Override
    public void accept(VariableStream variableStream) {
       variableName = variableStream.value();
    }

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context)  {
        return context.getTestClass()
                .map(this::getField)
                .map(this::getValue)
                .orElseThrow(() -> new IllegalArgumentException("failed to load test arguments"));

    }
    private Field getField(Class<?> klass)  {

        try{ return klass.getDeclaredField(variableName);
        }catch (Exception e){
            return null;
        }
    }
    private Stream<Arguments> getValue(Field filed)  {
        Object val = null;
        try{
            val = filed.get(null);
        }catch (Exception e){

        }
        return val == null? null : (Stream<Arguments>) val;
    }
}
