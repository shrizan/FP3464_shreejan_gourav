public class Tester extends Employee {
    private static final int GAIN_FACTOR_ERROR = 10;
    private int nbBugs;

    public Tester(String name, int birthYear, int nbBugs, int rate) {
        this(name, birthYear, nbBugs, rate, null);
    }

    public Tester(String name, int birthYear, int nbBugs, int rate, Vehicle employeeVehicle) {
        super(name, birthYear, 0, rate, employeeVehicle);
    }

    @Override
    public double annualIncome() {
        return getMonthlyIncome() * 12 + nbBugs * GAIN_FACTOR_ERROR;
    }
}
