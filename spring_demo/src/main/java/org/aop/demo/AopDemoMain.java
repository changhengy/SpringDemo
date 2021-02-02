package org.aop.demo;

public class AopDemoMain {
    public static void main(String[] args) {
        Calculator calculator = (Calculator) CalculatorProxy.getCalculator(new CalculatorImpl());
        int sum = calculator.add(5 , 9);
        System.out.println("sum "  + sum);

    }
}
