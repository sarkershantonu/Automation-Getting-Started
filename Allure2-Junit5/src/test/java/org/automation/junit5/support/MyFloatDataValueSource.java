package org.automation.junit5.support;

import org.junit.jupiter.params.provider.ValueSource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ValueSource(floats = {10.25f,24.85f,35.10f})
public @interface MyFloatDataValueSource {
}
