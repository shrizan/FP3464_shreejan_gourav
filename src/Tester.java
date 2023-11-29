public class Tester extends Employee {
    private int nbBugs;

    public Tester(String name, int birthYear, double monthlyIncome, int nbBugs) {
        this(name, birthYear, monthlyIncome, 100, nbBugs);
    }

    public Tester(String name, int birthYear, double monthlyIncome, int occupationRate, int nbBugs) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.nbBugs = nbBugs;
    }
}
