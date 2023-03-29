package com.engeto;

import com.engeto.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Simple calculator===");

        Calculator calculator = new Calculator();

        calculator.add(59,45);
        calculator.subtract(19,9);
        calculator.multiply(6,5);
        calculator.divide(15,5);
        calculator.squareRoot(64);
        calculator.square(5);
        calculator.areaOfCircle(12);
    }
}