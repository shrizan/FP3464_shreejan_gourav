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

    public String getMake() {
        return vehicle == null ? "" : vehicle.getMake();
    }

    public String getPlate() {
        return vehicle == null ? "" : vehicle.getPlate();
    }

    public String getColor() {
        return vehicle == null ? "" : vehicle.getColor();
    }

    public String getCategory() {
        return vehicle == null ? "" : vehicle.getCategory().toString();
    }

    public String getVehicleType() {
        return vehicle == null ? "" : vehicle instanceof Car ? "has a car" : vehicle instanceof Motorcycle ? "has a motorcycle" : "";
    }

    public String getGear() {
        return vehicle != null ? vehicle instanceof Car ? "- gear type: " + ((Car) vehicle).getGear().toString() : "" : "";
    }

    public String getCarType() {
        return vehicle == null ? "" : vehicle instanceof Car ? "- type: " + ((Car) vehicle).getType().toString() : "";
    }

    public String hasSideCar() {
        return vehicle == null ? "" : vehicle instanceof Motorcycle ? (((Motorcycle) vehicle).isSidecar() ? "- with sidecar" : "- without sidecar") : "";
    }

    public String getUserType() {
        return (this instanceof Manager ? "Manager" : (this instanceof Programmer ? "Programmer" : "Tester"));
    }

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
        String baseToString = String.format("""
                        Name: %s, a %s
                        Age: %d
                        Employee %s
                            - make: %s
                            - plate: %s
                            - color: %s
                            - category: %s
                        """,
                getName(),
                getUserType(),
                getAge(),
                getVehicleType(),
                getMake(),
                getPlate(),
                getColor(),
                getCategory()
        );
        baseToString = baseToString.trim();
        if (!getGear().isEmpty()) {
            baseToString += "\n\t" + getGear();
        }
        if (!getCarType().isEmpty()) {
            baseToString += "\n\t" + getCarType();
        }
        if (!hasSideCar().isEmpty()) {
            baseToString += "\n\t" + hasSideCar();
        }
        return baseToString;
    }
}
