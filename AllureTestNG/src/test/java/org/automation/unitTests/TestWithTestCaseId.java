package org.automation.unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithTestCaseId  extends TestingCalculator{
    @Test
    @TestCaseId(value = "ID#001")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @TestCaseId(value = "ID#002")
    public void testSub(){//fail example
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }
    @Test
    @TestCaseId(value = "ID#003")
    public void testMul(){
        Assert.assertEquals(250.0, aCalculator.mul(10.0,25.0), 0.01);
    }
    @Test
    @TestCaseId(value = "ID#004")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
    @Test
    @TestCaseId(value = "ID#005")
    public void testReminder(){
        Assert.assertEquals(1.0, aCalculator.mod(25.0,3.0), 0.01);
    }

}
