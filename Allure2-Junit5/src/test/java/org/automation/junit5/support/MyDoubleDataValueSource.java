package org.automation.junit5.support;

import org.junit.jupiter.params.provider.ValueSource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ValueSource(doubles = {10.25d,24.85d,35.10d})
public @interface MyDoubleDataValueSource {
}
