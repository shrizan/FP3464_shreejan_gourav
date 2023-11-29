public class Temporary extends Contract {
    private final int hourlySalary;
    private final int accumulatedHours;

    public Temporary(int hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }
}
