package org.calculator;

import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by shantonu on 3/5/16.
 */
public class Calculator {

    @Step("Adding two numbers")
    public double add(double a, double b){
        return a+b;
    }

    @Step("Substracting two numbers")
    public double sub(double a, double b){
        return a-b;
    }
    @Step("Multiplying two numbers")
    public double mul(double a, double b){
        return a*b;
    }
    @Step("Dividing two numbers")
    public double div(double a, double b){
        return a/b;
    }
}
