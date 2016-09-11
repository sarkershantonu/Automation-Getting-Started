package org.automation.unitTests.parameter;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Parameter;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithParameter extends TestingCalculator {
    @Parameter
    public double[] inputs;
    @Test
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }

}
