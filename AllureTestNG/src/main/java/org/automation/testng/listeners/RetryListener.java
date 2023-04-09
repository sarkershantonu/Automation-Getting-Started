package org.automation.testng.listeners;

import org.automation.testng.ReTry;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {
    public void transform(ITestAnnotation annotation, Class testClass,
                          Constructor testConstructor, Method testMethod) {
        System.out.println("Retry Listener >>>> ");
        annotation.setRetryAnalyzer(ReTry.class);
    }
}
