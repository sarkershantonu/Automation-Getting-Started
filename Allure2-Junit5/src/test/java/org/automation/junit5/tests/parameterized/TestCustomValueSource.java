package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.automation.junit5.support.MyStringArraySource;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCustomValueSource extends CalculatorTestBase {
    @ParameterizedTest
    @MyStringArraySource
    public void testStateNamesILived(String names){
        System.out.println(getResult(names));

    }

    private int getA(String name){

    }
    private int getA(String name){
        return Integer.valueOf(name.substring(name.indexOf("="))).intValue();
    }
    private int getResult(String name){
        return Integer.valueOf(name.substring(name.indexOf("=")+1)).intValue();
    }
    private int getOperatorAt(String name){
        Pattern p = Pattern.compile("[+\\-\\*\\/\\%]");
        Matcher matcher = p.matcher(name);
        while (matcher.find()){
            return name.
        }
    }

    private int getOperator(String name){
        int result = name.indexOf("+");;
        do{
            result = name.indexOf("");
        }while (result==-1);

       return result;
    }
}
