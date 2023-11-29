public class Programmer extends Employee {
    private int nProjects;

    public Programmer(String name, int birthYear, double monthlyIncome, int nProjects) {
        this(name, birthYear, monthlyIncome, 100, nProjects);
    }

    public Programmer(String name, int birthYear, double monthlyIncome, int occupationRate, int nProjects) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.nProjects = nProjects;
    }
}
