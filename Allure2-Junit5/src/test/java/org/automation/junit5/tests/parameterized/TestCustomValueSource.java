package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.automation.junit5.support.MyStringArraySource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.fail;

public class TestCustomValueSource extends CalculatorTestBase {
    @ParameterizedTest
    @MyStringArraySource
    public void testStateNamesILived(String names){
        String operator = getOperator(names);
        System.out.println("RESULT >> "+getResult(names));
        switch (operator){
            case "+" :
                Assertions.assertEquals(getResult(names),myCal.add(getA(names,"+"),getB(names,"+"))); break;
            case "/" :
                Assertions.assertEquals(getResult(names),myCal.div(getA(names,"/"),getB(names,"/"))); break;
            case "*" :
                Assertions.assertEquals(getResult(names),myCal.mul(getA(names,"*"),getB(names,"*"))); break;
            case "-" :
                Assertions.assertEquals(getResult(names),myCal.sub(getA(names,"-"),getB(names,"-"))); break;
            case "%" :
                Assertions.assertEquals(getResult(names),myCal.mod(getA(names,"%"),getB(names,"%"))); break;
            default: fail();break;
        }


    }
    private int getA(String name, String operator){
        return Integer.valueOf(name.substring(0,name.indexOf(operator))).intValue();
    }
    private int getB(String name, String operator){
        return Integer.valueOf(name.substring(name.indexOf(operator)+1,name.indexOf("="))).intValue();
    }
    private int getResult(String name){
        return Integer.valueOf(name.substring(name.indexOf("=")+1)).intValue();
    }
    private String getOperator(final String name){
        if(name.indexOf("+")>0){
            return "+";
        } else if (name.indexOf("-")>0) {
            return "-";
        }else if (name.indexOf("*")>0) {
            return "*";
        }else if (name.indexOf("/")>0) {
            return "/";
        }else if (name.indexOf("%")>0) {
            return "%";
        }else
            return "";
    }


}
