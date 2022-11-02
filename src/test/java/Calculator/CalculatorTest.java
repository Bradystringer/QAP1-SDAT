package Calculator;

import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculatorTest = new Calculator();
    @Test
    public void assertAddEquals(){
        Assertions.assertNotEquals(4, calculatorTest.add(6,2));
    }

    @Test
    public void assertMultiplyEquals(){
        Assertions.assertNotEquals(4, calculatorTest.multiply(4, 3));
    }

    @Test
    public void assertDivideEquals(){
        Assertions.assertEquals(4, calculatorTest.divide(12,3));
    }

    @Test
    public void assertSubtractEquals(){
        Assertions.assertNotEquals(4, calculatorTest.subtract(13,6));
    }
}
