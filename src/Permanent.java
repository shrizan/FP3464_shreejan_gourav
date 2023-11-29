public class Permanent extends Contract {
    private int nbChildren;
    private boolean married;
    private int monthlySalary;
    private int bonusPerChildPerMonth;
    private int accumulatedDays;

    public Permanent(int nbChildren, boolean married, int monthlySalary, int bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }
}
