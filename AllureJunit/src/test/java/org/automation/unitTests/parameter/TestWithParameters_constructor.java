package org.automation.unitTests.parameter;

import io.qameta.allure.Param;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


/**
 * Each method in this class will run based on how many data given, no matter tests are using the data or not, the test() method will run based on items in collection. 
 * @author shantonu
 *Allure parameters are all about environment parameters
 */
@RunWith(Parameterized.class)
public class TestWithParameters_constructor extends TestingCalculator{

	private int expected;

	private int first;

	private int second;

	public TestWithParameters_constructor(@Param int expecte, @Param int f, @Param int s) {
		this.expected = expecte;
		this.first = f;
		this.second = s;
	}

	@Parameterized.Parameters(name = "Test : {index} : add({1}+{2})= Expecting {0}")
	public static Collection addNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 2, 1 }, { 5, 2, 3 }, { 9, 8, 1 }, { 200, 50, 150 } });
	}
	@Test
	public void testAddWithParameters() {
		Assert.assertEquals(expected, aCalculator.add(first, second),0.01);
	}

}
