package simpleTests;

import application.Calculator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)

    @Test
    public void testSubstractionTwoValues() {
        int actualResult = calc.substract(20, 5);
        assertEquals("20 - 5 must be 15", 15, actualResult);
    }

    @Test
    public void testMultipleTwoValues() {
        int actualResult = calc.multiply(5, 5);
        assertEquals("5 * 5 must be 25", 25, actualResult);
    }

    @Test
    public void testDivideTwoValues() {
        int actualResult = calc.divide(30, 5);
        assertEquals("30 / 5 must be 6", 6, actualResult);
    }

    @Test
    public void testValueSquareRoot() {
        double actualResult = calc.square(144);
        assertEquals("Square root of 144 must be 12", Double.valueOf(12), actualResult);
    }

    @Test
    public void testValuePow() {
        double actualResult = calc.pow(3, 2);
        assertEquals("3 pow 2 must be 9", Double.valueOf(9), actualResult);
    }

}
