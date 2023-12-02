public class Permanent extends Contract {
    private int nbChildren;
    private boolean married;
    private double monthlySalary;
    private int bonusPerChildPerMonth;
    private int accumulatedDays;

    public Permanent(int nbChildren, boolean married, double monthlySalary, int bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    public String toString() {
        return String.format("""
                he is %s and he/she has %d children.
                He/She has worked for %d days and upon contract his/her monthly
                salary is %.1f.
                """, married, nbChildren, accumulatedDays, monthlySalary);
    }

    public int getNbChildren() {
        return nbChildren;
    }

    public boolean isMarried() {
        return married;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    @Override
    public double employeeMonthlySalary() {
        return  (monthlySalary + (isMarried() ? nbChildren * bonusPerChildPerMonth : 0)) * accumulatedDays();
    }

    private double accumulatedDays() {
        return (double) getAccumulatedDays() / 20;
    }
}
