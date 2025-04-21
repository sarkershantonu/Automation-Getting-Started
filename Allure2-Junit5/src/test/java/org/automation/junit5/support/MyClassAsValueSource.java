package org.automation.junit5.support;

import org.automation.junit5.support.data.ClassA;
import org.automation.junit5.support.data.ClassB;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ValueSource(classes = {ClassA.class, ClassB.class})
public @interface MyClassAsValueSource {
}
