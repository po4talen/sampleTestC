import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTest {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @Test
    public void testDivTwoPositiveValues(){
        assertEquals("10 / 2 must be 5", 5.0, calc.division(10, 2));
    }

    @Test
    public void testDivTwoValues(){
        String msg = "";
        try {
            calc.division(10,0);
        }catch (Exception e){
            msg = e.getMessage();
        }
        assertEquals("/ by zero", msg);
    }
    @Test
    public void testsubTwoPositiveValues(){
        assertEquals("10 - 2 must be 8", 8, calc.substraction(10, 2));
    }

    @Test
    public void squareRoot(){
        assertEquals("SquareRoot 100  must be 10.0", 10.0, calc.squareRoot(100));
    }

    @Test
    public void testpovTwoValues(){
        assertEquals("pov 2 ^ 6  must be 32.0", 32.0, calc.pov(2, 5));
    }
    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
