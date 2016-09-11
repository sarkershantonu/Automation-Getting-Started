package org.automation.unitTests;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Issue;
import ru.yandex.qatools.allure.annotations.Issues;

/**
 * Created by shantonu on 9/11/16.
 */
@Issues(value = {@Issue(value = "001"), @Issue(value = "002")})
@Issue(value = "CLASS-1")
public class TestWithIsseu extends TestingCalculator {
    @Test
    @Issue(value = "METHOD 1")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Issue(value = "METHOD 2")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
