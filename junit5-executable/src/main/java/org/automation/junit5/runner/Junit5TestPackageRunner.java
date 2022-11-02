package org.automation.junit5.runner;

import org.junit.platform.engine.discovery.ClassNameFilter;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;


public class Junit5TestPackageRunner extends Junit5Runner implements Runnable {
    private final String packageName;

    public Junit5TestPackageRunner(String packageName) {
        this.packageName = packageName;
    }
    public void run(){
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors( DiscoverySelectors.selectPackage(packageName))
                .filters(ClassNameFilter.includeClassNamePatterns("*Test*")
        ).build();
        Launcher launcher = LauncherFactory.create();
        TestPlan plan = launcher.discover(request);
        launcher.registerTestExecutionListeners();
        launcher.execute(request);
    }
}
