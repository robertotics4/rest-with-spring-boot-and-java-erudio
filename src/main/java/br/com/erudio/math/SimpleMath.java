package br.com.erudio.math;

public abstract class SimpleMath {
    public static Double sum(Double numberOne, Double numberTwo) {

        return numberOne + numberTwo;
    }

    public static Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public static Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public static Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public static Double squareRoot(Double number) {
        return Math.sqrt(number);
    }

    public static Double average(Double numberOne, Double numberTwo) {
        return sum(numberOne, numberTwo) / 2;
    }
}
