package calculator;

import com.engeto.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    static private Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void add_twoPositiveNumbers_returnPositiveNumber() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = calculator.add(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void add_twoNegativeNumbers_returnNegativeNumber() {
        int a = -15;
        int b = -20;
        int expectedResult = -35;
        long result = calculator.add(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void add_positiveAndNegativeNumbers_returnNumber() {
        int a = 15;
        int b = -20;
        int expectedResult = -5;
        long result = calculator.add(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void subtract_twoPositiveNumber_returnNumber() {
        int a = 15;
        int b = 20;
        int expectedResult = -5;
        long result = calculator.subtract(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void multiply_twoPositiveNumbers_returnNumber() {
        int a = 15;
        int b = 20;
        int expectedResult = 300;
        long result = calculator.multiply(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void multiply_twoNegativeNumbers_returnPositiveNumber() {
        int a = -15;
        int b = -20;
        int expectedResult = 300;
        long result = calculator.multiply(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void divide_twoInt_returnDouble() {
        int a = 15;
        int b = 20;
        double expectedResult = 0.75;
        double result = calculator.divide(a, b);
        Assertions.assertEquals(expectedResult, result, 0.0005);
    }

    @Test
    public void divide_divideByZero_throwsArithmeticException() {
        int a = 15;
        int b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }

    @Test
    @Disabled
    public void squareRoot_rootOfNegativeNumber_throwsArithmeticException() {
        int a = -15;
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.squareRoot(a));
    }

    @Test
    @Disabled
    public void squareRoot_rootOfPositiveNumber_returnDouble() {
        int a = 15;
        double expectedResult = 3.872983346207417;
        double result = calculator.squareRoot(a);
        Assertions.assertEquals(expectedResult, result, 0.0005);
    }

    @Test
    public void square_squareOfNegativeNumber_returnPositiveDouble() {
        int a = -15;
        double expectedResult = 225;
        double result = calculator.square(a);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void areaOfCircle_radiusOfNegativeNumber_throwsArithmeticException() {
        int a = -15;
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.areaOfCircle(a));
    }

    @Test
    public void areaOfCircle_radiusOfPositiveNumber_returnDouble() {
        int a = 15;
        double expectedResult = 706.8583470577034;
        double result = calculator.areaOfCircle(a);
        Assertions.assertEquals(expectedResult, result, 0.0005);
    }
}
