import java.time.LocalDate;

abstract public class Employee {
    private final String name;
    private int birthYear;
    private int age;
    private double monthlyIncome;
    private int rate=100;

    private Vehicle vehicle;

    public Employee(String name, int birthYear, double monthlyIncome, int rate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.rate = rate > 100 ? 100 : (Math.max(rate, 10));
        this.vehicle = vehicle;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public abstract double annualIncome();

    public void signContract(Contract p1) {
    }

    public Contract contractInfo() {
        return null;
    }
}
