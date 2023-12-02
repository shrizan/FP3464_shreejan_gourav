public class Tester extends Employee {
    private static final int GAIN_FACTOR_ERROR = 10;
    private int nbBugs;

    public Tester(String name, int birthYear, int nbBugs, int rate) {
        this(name, birthYear, nbBugs, rate, null);
    }

    public Tester(String name, int birthYear, int nbBugs, int rate, Vehicle employeeVehicle) {
        super(name, birthYear, 0, rate, employeeVehicle);
        this.nbBugs = nbBugs;
    }

    @Override
    public String getUserType() {
        return "Tester";
    }

    @Override
    public double annualIncome() {
        return getMonthlyIncome() * 12 + nbBugs * GAIN_FACTOR_ERROR + super.annualIncome();
    }

    @Override
    public String toString() {
        return String.format(
                """
                        %s
                        %s has an Occupation rate: %d%% and corrected %d bugs.
                        His/Her estimated annual income is %.1f
                        """,
                super.toString(),
                getName(),
                getRate(),
                nbBugs,
                annualIncome()
        ).trim();
    }
}
