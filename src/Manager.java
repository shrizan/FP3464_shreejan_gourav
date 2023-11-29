public class Manager extends Employee {
    private int nTravelDays;
    private int nbClients;

    public Manager(String name, int birthYear, double monthlyIncome, int nTravelDays, int nbClients) {
        this(name, birthYear, monthlyIncome, 100, nTravelDays, nbClients);
    }

    public Manager(String name, int birthYear, double monthlyIncome, int occupationRate, int nTravelDays, int nbClients) {
        super(name, birthYear, monthlyIncome, occupationRate);
        this.nTravelDays = nTravelDays;
        this.nbClients = nbClients;
    }
}
