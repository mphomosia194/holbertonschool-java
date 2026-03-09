import java.util.List;

public class ManipulateArrayNumbers {

    // Find the position of a number in the list
    public static int findNumberPosition(List<Integer> numbers, int number) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == number) {
                return i;
            }
        }
        return -1;
    }

    // Add a number if it does not already exist
    public static void addNumber(List<Integer> numbers, int number) {
        if (findNumberPosition(numbers, number) != -1) {
            throw new IllegalArgumentException("Number already in the list");
        }
        numbers.add(number);
    }

    // Remove a number from the list
    public static void removeNumber(List<Integer> numbers, int number) {
        int position = findNumberPosition(numbers, number);

        if (position == -1) {
            throw new IllegalArgumentException("Number not found in the list");
        }

        numbers.remove(position);
    }

    // Replace a number or add if not found
    public static void replaceNumber(List<Integer> numbers, int numberToReplace, int replacementNumber) {
        int position = findNumberPosition(numbers, numberToReplace);

        if (position == -1) {
            numbers.add(replacementNumber);
        } else {
            numbers.set(position, replacementNumber);
        }
    }
}
