package org.automation.unitTests;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by shantonu on 9/11/16.
 */

public class TestWithSeverity extends TestingCalculator {
    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Severity(value = SeverityLevel.BLOCKER)
    public void testSub(){//fail example
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }
    @Test
    @Severity(value = SeverityLevel.MINOR)
    public void testMul(){
        Assert.assertEquals(250.0, aCalculator.mul(10.0,25.0), 0.01);
    }
    @Test
    @Severity(value = SeverityLevel.TRIVIAL)
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
    @Test
    @Severity(value = SeverityLevel.NORMAL)
    public void testReminder(){
        Assert.assertEquals(1.0, aCalculator.mod(25.0,3.0), 0.01);
    }

}
