package mediumTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MediumTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - average value
    @Test
    public void testAverageThreeValues() {
        int actualResult = calc.averageValue(1, 2, 3);
        assertEquals("Average number must be 2", 2, actualResult);
    }

    //TODO (**)
    //add tests for new method - even or odd
    @Test
    public void testEvenOrOddValue() {
        boolean actualResult = calc.evenOrOdd(3);
        assertEquals("3 must be odd (false)", false, actualResult);
    }

    //TODO (**)
    //add tests for new method - biggest value
    @Test
    public void testBiggestValue() {
        int actualResult = calc.bigger(4, 8);
        assertEquals("Bigger number must be 8", 8, actualResult);
    }

}