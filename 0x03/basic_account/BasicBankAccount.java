import exceptions.InvalidOperationException;

public class BasicBankAccount {

    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }
        balance += value;
    }

    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }

        if (value > balance) {
            throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
        }

        balance -= value;
    }

    public double calculateMonthlyFee() {
        double tenPercent = balance * 0.10;
        return Math.min(10.00, tenPercent);
    }

    public double calculateMonthlyInterest() {
        if (balance < 0) {
            return 0;
        }

        return balance * (annualInterestRate / 100) / 12;
    }

    public void applyMonthlyUpdate() {
        double fee = calculateMonthlyFee();
        double interest = calculateMonthlyInterest();
        balance = balance - fee + interest;
    }
}
