public class Manager extends Employee {
    private static final int GAIN_FACTOR_CLIENT=500;
    private static final int GAIN_FACTOR_TRAVEL=100;
    private int nbClients;
    private int nTravelDays;

    public Manager(String name, int birthYear,int nbClients,int  nTravelDays){
        this(name,birthYear,nbClients,nTravelDays,null);
    }
    public Manager(String name, int birthYear,int nbClients,int  nTravelDays,Vehicle vehicle){
        this(name,birthYear,nbClients,nTravelDays,0,null);
    }
    public Manager(String name, int birthYear,int nbClients,int  nTravelDays,int rate){
        this(name,birthYear,nbClients,nTravelDays,rate,null);
    }
    public Manager(String name, int birthYear,int nbClients,int  nTravelDays,int rate,Vehicle vehicle){
        super(name,birthYear,0,rate,vehicle);
        this.nbClients = nbClients;
        this.nTravelDays = nTravelDays;
    }

    @Override
    public double annualIncome() {
        return getMonthlyIncome()*12 + GAIN_FACTOR_CLIENT*nbClients+GAIN_FACTOR_TRAVEL*nTravelDays;
    }
}
