package org.automation.junit5.suites.releases;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@IncludeTags({"releaseB"})
@SelectPackages("org.automation.junit5.tests.orders")
public class ReleaseBSuite {
}
