package org.automation.unitTests;


import org.automation.TestingCalculator;
import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by shantonu on 9/10/16.
 */
@Title("Class Title : Testing Calcularor")
public class TestWithTitle extends TestingCalculator{

    @Title("Method Title: {method}")
    public void addition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }

}
