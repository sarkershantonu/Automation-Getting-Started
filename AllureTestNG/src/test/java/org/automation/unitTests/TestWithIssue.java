package org.automation.unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Issue;
import ru.yandex.qatools.allure.annotations.Issues;
import ru.yandex.qatools.allure.annotations.TestCaseId;

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
@Issue(value = "ISSUE/CLASS-1")
public class TestWithIssue extends TestingCalculator {
    @Test
    @Issue(value = "ISSUE/METHOD-1")
    @Issues(value = {@Issue(value = "M001"), @Issue(value = "M002")})
    @TestCaseId("TM-0025")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Issue(value = "ISSUE/METHOD-2")
    @Issues(value = {@Issue(value = "M003"), @Issue(value = "M004")})
    @TestCaseId("TM-0027")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
