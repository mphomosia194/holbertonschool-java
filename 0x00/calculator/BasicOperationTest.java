public class BasicOperationTest {

    public static boolean test_addition() {
        return BasicOperation.add(5, 3) == 8;
    }

    public static boolean test_subtraction() {
        return BasicOperation.subtract(5, 3) == 2;
    }

    public static boolean test_multiplication() {
        return BasicOperation.multiply(5, 3) == 15;
    }

    public static boolean test_division() {
        return BasicOperation.divide(9, 3) == 3;
    }
}
