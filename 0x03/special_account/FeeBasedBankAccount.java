import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {

    private int transactionCount;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        balance -= 0.10;
        transactionCount++;
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        balance -= 0.10;
        transactionCount++;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}
