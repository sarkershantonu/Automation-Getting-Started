package org.automation.testsExamples;

import org.automation.core.DataDrivenTest_withDefaultAnnotation;
import org.easetech.easytest.annotation.TestProperties;
import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;

/**
 * Created by shantonu on 8/26/16.
 */

public class TestPropertiesExample extends DataDrivenTest_withDefaultAnnotation {

    @TestProperties(value = {"test.properties"})
    private Properties myProps;

    @Test
    public void testAddition() {
        Assert.assertEquals("Easy Test Demos", myProps.getProperty("test.title"));
    }
}
