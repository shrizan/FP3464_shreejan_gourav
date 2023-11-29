import java.time.LocalDate;

abstract public class Employee {
    private String name;
    private int birthYear;
    private int age;
    private double monthlyIncome;
    private int rate;

    public Employee(String name, int birthYear, double monthlyIncome) {
        this(name, birthYear, monthlyIncome, 100);
    }

    public Employee(String name, int birthYear, double monthlyIncome, int rate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.rate = rate > 100 ? 100 : (Math.max(rate, 10));
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }
}
