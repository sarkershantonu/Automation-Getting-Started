package org.automation.unitTests.parameter;


import org.automation.core.TestingCalculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * The difference in this case with single @Parameter using is, no constructor needed but those fields need to be public
 * @author shantonu
 *=> Allure @Parameter does not works, we can not see in tests about parameters
 *
 * because it is not initiated. it works when it is initiated either in method or in constructors. (see constructor parametrized tests)
 *
 *
 */
@RunWith(Parameterized.class)
public class TestWithParameters extends TestingCalculator{

	@Parameter("Expected")
	@Parameter(value=0)
	public int expected;

	@ru.yandex.qatools.allure.annotations.Parameter("First")
	@Parameter(value=1)
	public int first;
	@ru.yandex.qatools.allure.annotations.Parameter("Second")
	@Parameter(value=2)
	public int second;

	
	
	@Parameters(name = "Test : {index} : add({1}+{2})= Expecting {0}")//name will be shared among all tests
	public static Collection addNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 2, 1 }, { 5, 2, 3 }, { 9, 8, 1 }, { 200, 50, 150 } });
	}
	@Test
	public void testAddWithParameters() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expected, aCalculator.add(first, second),0.01);
	}
	
}
