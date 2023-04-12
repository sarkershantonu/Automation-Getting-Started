package org.automation.testng.listeners;

import org.automation.testng.annotation.AppId;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AppSelectorListener implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

        AppId appId = testMethod.getAnnotation(AppId.class);
        if (appId != null) {
            System.out.println("Total Profiles = "+ appId.profileIds().length);
        }
        else if(appId.profileIds().length==0){
            System.out.println("No profile selected");
        }
        else if(appId.profileIds()[0]=="256"){
            System.out.println("Running app 256");
        }
    }
}
