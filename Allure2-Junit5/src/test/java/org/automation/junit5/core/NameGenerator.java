package org.automation.junit5.core;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

/***
 * Example of Display Name Generator
 */
public class NameGenerator implements DisplayNameGenerator {
    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return null;
    }
}
