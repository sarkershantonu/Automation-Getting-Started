package org.automation.unitTests;


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
 *
 */
@RunWith(Parameterized.class)
public class TestParameter extends TestingCalculator{

	@Parameter(value=0)
	public int expected;
	
	@Parameter(value=1)
	public int first;
	
	@Parameter(value=2)
	public int second;

	
	
	@Parameters(name = "Test : {index} : add({1}+{2})= Expecting {0}")//name will be shared among all tests
	public static Collection addNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 2, 1 }, { 5, 2, 3 }, { 9, 8, 1 }, { 200, 50, 150 } });
	}
	@Test
	public void testAddWithParameters() {

		System.out.println("TestParameter >>> "+first + " & " + second + " Expected = " + expected);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expected, aCalculator.add(first, second),0.01);
	}
	
}
