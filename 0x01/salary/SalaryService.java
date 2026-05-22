import java.util.UUID;

public class SalaryService {

    private SalaryCalculatorService calculator =
            SalaryCalculatorService.getSalaryCalculatorService();

    public double calculate(double grossSalary,
                            double discountValue,
                            double salesValue,
                            double commissionPercentage) {

        return calculator.calculateNetSalary(
                grossSalary,
                discountValue,
                salesValue,
                commissionPercentage
        );
    }

    public UUID getUuid() {

        return calculator.uuid;
    }
}
