package org.automation.unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by shantonu on 9/10/16.
 */
@Title("Class Title : Testing Calcularor")
public class TestWithTitle extends TestingCalculator{
    @Test
    @Title("Method Title")//: {method} wont work
    public void addition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }
}
