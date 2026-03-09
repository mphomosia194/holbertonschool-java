public class PositiveInteger {

    private int value;

    // Constructor with int
    public PositiveInteger(int value) {
        validate(value);
        this.value = value;
    }

    // Constructor with String
    public PositiveInteger(String value) {
        try {
            int num = Integer.parseInt(value);
            validate(num);
            this.value = num;
        } catch (Exception e) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
    }

    // Getter
    public int getValue() {
        return value;
    }

    // Setter
    public void setValue(int value) {
        validate(value);
        this.value = value;
    }
    public void setValor(int value) {
    validate(value);
    this.value = value;
}

    // Validation method
    private void validate(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }
    }

    // Prime check method
    public boolean isPrime() {

        if (value <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
