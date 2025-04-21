package org.automation.junit5.support;

import org.junit.jupiter.params.provider.ValueSource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ValueSource(longs = {10l,24l,34l})
public @interface  MyLongDataValueSource {
}
