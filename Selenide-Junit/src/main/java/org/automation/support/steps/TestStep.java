package org.automation.support.steps;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shantonu on 9/3/17.
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TestStep {
}
