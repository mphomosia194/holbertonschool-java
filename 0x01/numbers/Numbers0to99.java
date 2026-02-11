public class Numbers0to99 {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (i != 99)
                output.append(i).append(", ");
            else
                output.append(i);
        }
        System.out.print(output);
    }
}
