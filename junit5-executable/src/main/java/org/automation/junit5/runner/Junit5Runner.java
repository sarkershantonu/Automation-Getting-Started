package org.automation.junit5.runner;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import java.util.List;

public class Junit5Runner implements Runnable {
    private static final Logger logging = LoggerFactory.getLogger(Junit5Runner.class);
    private final List<Class<?>> testClasses;

    public Junit5Runner(List<Class<?>> testClasses) {
        this.testClasses = testClasses;
    }


    public void run() {
        logging.debug("Starting the executor");
    /*  JunitCore
      TestExecutionResult result ;
      TestReporter
      EngineDiscoveryListener
      ExecutionRequest testRequest = new ExecutionRequest();


      JupiterTestEngine engine = new JupiterTestEngine();
      engine.execute(testRequest);
*/
    }

    public void singleClassRunner(Class<?> kLass) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(selectClass(kLass)).build();
        Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(request);
        launcher.registerTestExecutionListeners();
    }

    public void multiClassRunner(List<Class<?>> kLasses){

        for(Class<?> aClass : kLasses){
            singleClassRunner(aClass);
        }
    }
}
