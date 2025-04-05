package org.automation.unitTests;

import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;

/*** Created by shantonu on 9/11/16.
 */
@Stories({@Story("Class Story : An user should be able to calculate with two numbers"),
        @Story("Class Story : An user should be able to add & divide")})
public class TestWithStories extends TestingCalculator {
    @Test
    @Story(value = "Method Story : An user should be able to add two numbers")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Story("Method Story : An user should be able to divide two numbers ")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
