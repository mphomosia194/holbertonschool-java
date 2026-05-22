import java.util.UUID;

public class SalaryCalculatorService {

    private static SalaryCalculatorService instance;

    public UUID uuid = UUID.randomUUID();

    private SalaryCalculatorService() {
    }

    public static SalaryCalculatorService getSalaryCalculatorService() {

        if (instance == null) {
            instance = new SalaryCalculatorService();
        }

        return instance;
    }

    public double calculateNetSalary(double grossSalary,
                                     double discountValue,
                                     double salesValue,
                                     double commissionPercentage) {

        return grossSalary
                - discountValue
                + (salesValue * (commissionPercentage / 100));
    }
}
