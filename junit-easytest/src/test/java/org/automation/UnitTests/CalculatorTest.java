package org.automation.UnitTests;

import org.automation.Calculator;
import org.automation.DataDrivenTest;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Parallel;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.easetech.easytest.annotation.Display;
import org.easetech.easytest.annotation.Duration;
import org.easetech.easytest.annotation.Repeat;

/**
 * Created by shantonu on 7/15/16.
 */


public class CalculatorTest extends DataDrivenTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(25.0, calculator.add(10.5, 14.5), 0.1);
    }

    @Test
    @DataLoader(filePaths = "calculator.csv", loaderType = LoaderType.CSV)
    @Duration(forClass = CalculatorTest.class, timeInMillis = 100)//duration condition does not work
    public void testAddFromCSV(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }

    @Test
    @DataLoader(filePaths = "calculator.xls", loaderType = LoaderType.EXCEL)
    @Repeat(times = 5)
    public void testAddFromExcel(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);

    }

    @Test
    @DataLoader(filePaths = "calculator.xml", loaderType = LoaderType.XML)
    @Repeat(times = 5)
    public void testAddFromXML(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);

    }

}
