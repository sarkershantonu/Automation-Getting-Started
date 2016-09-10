package org.automation.core;

import org.automation.CalculatorWithSteps;
import org.junit.Before;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by shantonu on 9/10/16.
 */
public abstract class TestingCalculator {
    protected CalculatorWithSteps aCalculator = null;

    @Before
    @Step("Initiation in {method}")
    public void init(){
        aCalculator = new CalculatorWithSteps();
    }

}
