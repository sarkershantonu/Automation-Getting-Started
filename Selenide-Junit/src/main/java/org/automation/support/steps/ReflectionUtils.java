package org.automation.support.steps;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by shantonu on 9/6/17.
 */
public class ReflectionUtils {

    public static Object createInstance(final Class<? extends StepBase> aClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return aClass.getConstructor().newInstance();
    }


    public static Object getField(final Object instance, final String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = instance.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(instance);
    }

    //todo
    public static Object[] getParametersFromMethod(final Object instance, final String methodName) throws NoSuchMethodException {
        Method method ;
        for(Method m :instance.getClass().getMethods()){
            if(m.getName().endsWith(methodName)){
                method = m;



            }else
                return null;
        }
        return new Object[3];
    }

}
