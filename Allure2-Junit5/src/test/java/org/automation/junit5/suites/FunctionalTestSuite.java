package org.automation.junit5.suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Suite Example
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({"org.automation.junit5.tests"})
public class FunctionalTestSuite {
}
