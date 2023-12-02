public class Temporary extends Contract {
    private final double hourlySalary;
    private final int accumulatedHours;

    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getAccumulatedHours() {
        return accumulatedHours;
    }

    @Override
    public String toString() {
        return String.format(
                """
            he is a temporary employee with %.1f
            hourly salary and he has worked for %d hours
            """,
                hourlySalary,
                accumulatedHours
        );
    }

    @Override
    public double employeeMonthlySalary() {
        return getHourlySalary()*getAccumulatedHours();
    }
}
