package org.automation.unitTests;

import io.qameta.allure.Issue;
import io.qameta.allure.Issues;
import io.qameta.allure.TmsLink;
import org.automation.core.TestCalculatorBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shantonu on 9/11/16.
 * Notes :
 * This issue tracker links can be managed by allure.properties
 * allure.issues.tracker.pattern=
 * All isseues & isseue are same location pointers /issues/$s
 * This example will show you
 * 1. All @issues are value with numbers for class level, M$ for method level
 * 2. All @issue are value with prefix class/method
 *
 */
@Issues(value = {@Issue(value = "001"), @Issue(value = "002")})
public class TestWithIssue extends TestCalculatorBase {
    @Test
    @Issue(value = "ISSUE/METHOD-1")

    @TmsLink("TM-0025")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Issue(value = "ISSUE/METHOD-2")
    @TmsLink("TM-0027")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
