package org.automation.junit5.runner;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import java.util.Arrays;
import java.util.List;

public class Junit5TestClassRunner extends Junit5Runner implements Runnable {
    private static final Logger logging = LoggerFactory.getLogger(Junit5TestClassRunner.class);
    private final List<Class<?>> classes;


    public Junit5TestClassRunner(Class<?>... testClasses) {
        this.classes = Arrays.asList(testClasses);
    }

    public void run() {
        logging.debug("Starting the executor");
        if(classes.size()==1){
            singleClassRunner(classes.get(0));
        }
        else {
            multiClassRunner();
        }

    }

    public void singleClassRunner(Class<?> kLass) {
        logging.debug("Running Single Class : "+kLass.getCanonicalName());
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(selectClass(kLass)).build();
        Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(request);
        launcher.registerTestExecutionListeners(getDefaultListener());
        launcher.execute(request);
    }

    public void multiClassRunner(){
        logging.info("Running Multiple Classes");
        for(Class<?> aClass : classes){
            singleClassRunner(aClass);
        }
    }

}
