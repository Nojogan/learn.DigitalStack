import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);

        assertEquals(result, 7);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.substract(3, 4);

        assertEquals(result, -1);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 4);

        assertEquals(result, 12);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(8, 4);

        assertEquals(result, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(3, 0);
    }
}
