package calcoloStipendi;

public class SeniorEngineer extends Employee {
    private static final double BONUS_RATE = 1.20;
    private static final int BONUS_HOURS_THRESHOLD = 45;

    public SeniorEngineer(String name, String surname, double hourlyWage, Employee reportsTo) {
        super(name, surname, hourlyWage, "SeniorEngineer", reportsTo);
    }

    @Override
    public double calculateWage(int hoursWorked) {
        if (hoursWorked <= BONUS_HOURS_THRESHOLD) {
            return super.calculateWage(hoursWorked);
        }
        double standardWage = BONUS_HOURS_THRESHOLD * hourlyWage;
        double bonusHours = hoursWorked - BONUS_HOURS_THRESHOLD;
        double bonusWage = bonusHours * (hourlyWage * BONUS_RATE);
        return standardWage + bonusWage;
    }
}