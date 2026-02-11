public class EvenNumbers {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 100; i += 2) {
            if (i != 98)
                output.append(i).append(", ");
            else
                output.append(i);
        }
        System.out.println(output);
    }
}
