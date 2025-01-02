package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - divide by zero case
    @Test
    public void testdivideByZero(){
        int actualResult = calc.divideByZero(10, 0);
        assertEquals("Divided by Zero", -100, actualResult);
    }

    @Test
    public void testSumOfAnyQtyOfParameters(){
        int actualResult = calc.sumOfValues(4,6,10);
        assertEquals("Sum must be 20", 20, actualResult);
    }


    //TODO (**)
    //add tests for new method - addition with multiple parameters


}