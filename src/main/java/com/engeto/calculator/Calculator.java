package com.engeto.calculator;

import com.engeto.Main;

public class Calculator {

    public long add(long a, long b){
        long result;
        result = a + b;
        System.out.println("The addition is: "+result);
        return result;
    }

    public long subtract(int a, int b){
        long result;
        result = a - b;
        System.out.println("The subtraction is: "+result);
        return result;
    }

    public long multiply(int a, int b){
        long result;
        result = a * b;
        System.out.println("The multiplication is: "+result);
        return result;
    }

    public double divide(double dividend, double divisor)throws ArithmeticException{
        if(divisor==0){
            throw new ArithmeticException ("Cannot divide by 0.");
        }
        double result;
        result = dividend / divisor;
        System.out.println("The division is: "+result);
        return result;
    }

    public double squareRoot(double a) throws ArithmeticException{
        double result;
        if(a<0) throw new ArithmeticException("Cannot square root negative number.");
        result = Math.sqrt(a);
        System.out.println("The square root of your number is: "+result);
        return result;
    }

    public double square(double a){
        double result;
        result = a * a;
        System.out.println("The square of your number is: "+result);
        return result;
    }

    public double areaOfCircle(double radius) throws ArithmeticException{
        double result;
        if(radius<0) throw new ArithmeticException("Cannot compute the circle area of negative number.");
        result = Math.PI * radius * radius;
        System.out.println("The circle area is: "+result);
        return result;
    }

}
