package org.automation.junit5.runner;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import java.util.Arrays;
import java.util.List;

public class Junit5TestClassRunner extends Junit5Runner implements Runnable {

    private final List<Class<?>> classes;


    public Junit5TestClassRunner(Class<?>... testClasses) {
        this.classes = Arrays.asList(testClasses);
    }

    public void run() {
        logger.info("Starting the runner");
        if(classes.size()==1){
            singleClassRunner(classes.get(0));
        }
        else {
            multiClassRunner();
        }

    }

    public void singleClassRunner(Class<?> kLass) {
        logger.debug("Running Single Class : "+kLass.getCanonicalName());
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(selectClass(kLass)).build();
        Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(request);
        launcher.registerTestExecutionListeners(getDefaultListener());
        launcher.execute(request);
    }

    public void multiClassRunner(){
        logger.info("Running Multiple Classes");
        for(Class<?> aClass : classes){
            singleClassRunner(aClass);
        }
    }

}
