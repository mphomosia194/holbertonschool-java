public class PrintFormattingNumbers {
    public static void main(String[] args) {
        float tax = 0.2456f;
        float value = 7654.321f;
        System.out.printf("Value: $%,.2f%nTax: %.2f%%%n", value, tax);
    }
}
