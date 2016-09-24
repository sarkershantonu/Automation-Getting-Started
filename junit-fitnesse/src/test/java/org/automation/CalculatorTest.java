package org.automation;


public class CalculatorTest {

    private Calculator calculator;
    private double result;



    //@Before
    public void init(){
        calculator = new Calculator();
    }


   // @Test
    //@Issue("#157")
   // @Issues({"#156","#155"})
    public void testAdd() throws Throwable {

        Assert.assertEquals(5.0,calculator.add(3.0, 2.0),0.01);
    }


}
