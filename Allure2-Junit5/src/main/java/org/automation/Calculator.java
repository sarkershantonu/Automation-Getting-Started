package org.automation;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int[] a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    public Integer add(Integer... numbers) {
        Integer result = new Integer(0);
        for (Integer i : numbers) {
            result += i;
        }
        return result;
    }

    public <T extends Number> T add(T... t) {
        Double sum = new Double(0.0);
        for (T i : t) {
            sum += i.doubleValue();
        }
        return (T) sum;
    }
}
