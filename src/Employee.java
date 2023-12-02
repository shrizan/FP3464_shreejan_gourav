import java.time.LocalDate;

abstract public class Employee {
    private final String name;
    private int birthYear;
    private int age;
    private double monthlyIncome;
    private int rate = 100;

    private Vehicle vehicle;
    private Contract contractInfo;

    public Employee(String name, int birthYear, double monthlyIncome, int rate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.rate = rate > 100 ? 100 : (Math.max(rate, 10));
        this.vehicle = vehicle;
        System.out.println("We have a new employee: " + name + ", " + "a " + getUserType().toLowerCase() + ".");
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public int getRate() {
        return rate;
    }

    //make abstract method
    public String getVehicleType() {
        return vehicle == null ? "" : vehicle.getVehicleType();
    }

    //make abstract
    abstract public String getUserType();

    public double annualIncome() {
        double monthly = contractInfo == null ? 0 : contractInfo.employeeMonthlySalary();
        return ((monthly * rate) / 100) * 12;
    }

    public void signContract(Contract p1) {
        this.contractInfo = p1;
    }

    public Contract contractInfo() {
        if (contractInfo != null) System.out.printf("%s is a %s.", getName(), getUserType());
        return contractInfo;
    }

    @Override
    public String toString() {
        return String.format("""
                        Name: %s, a %s
                        Age: %d
                        Employee %s%s
                        """,
                getName(),
                getUserType(),
                getAge(),
                getVehicleType(),
                vehicle.toString()
        ).trim();
    }
}
