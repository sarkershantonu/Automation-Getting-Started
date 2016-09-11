package org.automation;

import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by shantonu on 3/5/16.
 */
public class CalculatorWithSteps {

//@Steps**********************
//{N} where N is a zero-based positive integer that will be replaced by the Nth method argument
//{method} will be replaced by the annotated method name

    @Step("Adding two numbers")
    public double add(double a, double b){
        return a+b;
    }

    @Step("Substracting {method} two numbers {0},{1}")
    public double sub(double a, double b){
        return a-b;
    }
    @Step("Multiplying two numbers : {0}x{1}")
    public double mul(double a, double b){
        return a*b;
    }
    @Step("Dividing two numbers : {0}/{1}")
    public double div(double a, double b){
        return a/b;
    }
    @Step("Reminder of : {0}%{1}")
    public double mod(double a, double b){
        return a%b;
    }
}
