public class SumOrSquare {

    public static int sumSquareOrSubtract(int valueA, int valueB) {
        if (valueA > valueB) {
            return valueA + valueB;
        }
        else {
            return valueA * valueB;
        }
    }

    public static int sumSquareOrSubtractBonus(int valueA, int valueB, boolean flag) {
        if (flag) {
            return valueB - valueA;
        }
        else if (valueA > valueB) {
            return valueA + valueB;
        }
        else {
            return valueA * valueB;
        }
    }
}
