package org.automation.support.steps;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by shantonu on 9/6/17.
 */
public class ReflectionUtils {

    public static Object createInstance(final Class<? extends StepBase> aClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return aClass.getConstructor().newInstance();
    }
}
