package org.automation.junit5.suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 4/30/2021
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({"org.automation.junit5.tests.allure"})
public class AllureExamples {
}
