package org.automation.junit5.support;

import org.junit.jupiter.params.provider.ValueSource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ValueSource(strings = {"10+25=35", "30-20=10", "5*10=50"})
public @interface MyStringArraySource {
}
