import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOrSquareTest {

    @Test
    void sumSquareOrSubtract_whenValueAIsBigger_thenReturnSum() {
        //GIVEN
        int valueA = 99;
        int valueB = 15;

        //WHEN

        int actual = SumOrSquare.sumSquareOrSubtract(valueA, valueB);

        //THEN
        assertEquals(114, actual);
    }

    @Test
    void sumSquareOrSubtract_whenValueBIsBigger_thenReturnProduct() {
        //GIVEN
        int valueA = 10;
        int valueB = 15;

        //WHEN

        int actual = SumOrSquare.sumSquareOrSubtract(valueA, valueB);

        //THEN
        assertEquals(150, actual);
    }

    @Test
    void sumSquareOrSubtract_whenValueAIsTheSameAsValueB_thenReturnProduct() {
        //GIVEN
        int valueA = 10;
        int valueB = 10;

        //WHEN

        int actual = SumOrSquare.sumSquareOrSubtract(valueA, valueB);

        //THEN
        assertEquals(100, actual);
    }



    @Test
    void sumSquareOrSubtractBonus_whenFlagIsTrue_thenReturnSubtraction() {
        //GIVEN
        int valueA = 10;
        int valueB = 10;
        boolean flag = true;

        //WHEN

        int actual = SumOrSquare.sumSquareOrSubtractBonus(valueA, valueB, flag);

        //THEN
        assertEquals(0, actual);
    }

    @Test
    void sumSquareOrSubtractBonus_whenFlagIsFalseAndValueAIsBigger_thenReturnSum() {
        //GIVEN
        int valueA = 99;
        int valueB = 15;
        boolean flag = false;

        //WHEN

        int actual = SumOrSquare.sumSquareOrSubtractBonus(valueA, valueB, flag);

        //THEN
        assertEquals(114, actual);
    }

    @Test
    void sumSquareOrSubtractBonus_whenFlagIsFalseAndValueBIsBigger_thenReturnProduct() {
        //GIVEN
        int valueA = 10;
        int valueB = 15;
        boolean flag = false;

        //WHEN

        int actual = SumOrSquare.sumSquareOrSubtractBonus(valueA, valueB, flag);

        //THEN
        assertEquals(150, actual);
    }

    @Test
    void sumSquareOrSubtractBonus_whenFlagIsFalseAndValueAIsTheSameAsValueB_thenReturnProduct() {
        //GIVEN
        int valueA = 10;
        int valueB = 10;
        boolean flag = false;

        //WHEN

        int actual = SumOrSquare.sumSquareOrSubtractBonus(valueA, valueB, flag);

        //THEN
        assertEquals(100, actual);
    }
}
