package org.automation.support.steps;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shantonu on 9/5/17.
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
//when an user will use any steps , they will declear as field
public @interface UseSteps {
    Class<? extends StepBase> classes();
}
