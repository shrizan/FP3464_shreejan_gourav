public class Programmer extends Employee {
    private final static int GAIN_FACTOR_PROJECTS = 200;
    private int nProjects;

    public Programmer(String name, int birthYear, int nbProjects) {
        this(name, birthYear, nbProjects, 100);
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        this(name, birthYear, nbProjects, 100, vehicle);
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        this(name, birthYear, nbProjects, rate, null);
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate, Vehicle vehicle) {
        super(name, birthYear, 0, rate, vehicle);
        this.nProjects = nbProjects;
        System.out.println("We have a new employee: " + name + ", " + "a programmer.");
    }

    @Override
    public String getUserType() {
        return "Programmer";
    }

    @Override
    public double annualIncome() {
        return getMonthlyIncome() * 12 + GAIN_FACTOR_PROJECTS * nProjects + super.annualIncome();
    }

    @Override
    public String toString() {
        return String.format("""
                        %s
                        %s has an Occupation rate: %d%% and completed %d projects.
                        His/Her estimated annual income is %.1f
                        """,
                super.toString(),
                getName(),
                getRate(),
                nProjects,
                annualIncome()
        ).trim();
    }
}
