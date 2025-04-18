package org.automation;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

public class Calculator {
    @Step
    public int sub(int a, int b) {
        return a - b;
    }
    @Step
    public int mod(int a, int b) {
        return a % b;
    }
    @Step
    public int div(int a, int b) {
        return a / b;
    }
    @Step
    public int mul(int a, int b) {
        return a * b;
    }
    @Step
    public int add(int a, int b) {
        return a + b;
    }
    @Step
    public int add(int[] a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }
    @Step("adding Integers ")
    public Integer add(Integer... numbers) {
        Integer result = new Integer(0);
        for (Integer i : numbers) {
            result += i;
        }
        return result;
    }
    @Step
    public <T extends Number> T add(T... t) {
        Double sum = new Double(0.0);
        for (T i : t) {
            sum += i.doubleValue();
        }
        return (T) sum;
    }
    @Step
    @Attachment
    public String add(String... strings){
        if(null==strings || strings.length<=0)
        {
            return "empty_input";
        }
        else
        {
            StringBuffer sb = new StringBuffer();
            for (String a:strings){
                sb.append(a);
            }
            return sb.toString();
        }
    }
    @Step
    public double sub(double a, double b) {
        return a - b;
    }
    @Step
    public double mod(double a, double b) {
        return a % b;
    }
    @Step
    public double div(double a, double b) {
        return a % b;
    }
    @Step
    public double mul(double a, double b) {
        return a * b;
    }

}
