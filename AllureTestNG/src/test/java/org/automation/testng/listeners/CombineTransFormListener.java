package org.automation.testng.listeners;

import org.automation.testng.ReTry;
import org.automation.util.annotation.AppId;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CombineTransFormListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation,
                          Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ReTry.class);
        AppId appId = testMethod.getAnnotation(AppId.class);
        if (appId != null) {
            System.out.println("Total Profiles = "+ appId.profileIds().length);
        }
        else {
            annotation.setEnabled(false);
        }

    }

}
