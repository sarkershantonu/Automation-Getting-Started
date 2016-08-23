package org.automation.UnitTests;

import org.automation.core.DataDrivenTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 8/6/16.
 * No use of easy test
 */
public class SimpleTests extends DataDrivenTest{

    @Test
    public void testAddition(){
        Assert.assertEquals(25.5,calculator.add(10.5,15.0),0.01);
    }
}
