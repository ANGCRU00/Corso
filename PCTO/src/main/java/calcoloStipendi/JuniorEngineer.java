package calcoloStipendi;

public class JuniorEngineer extends Employee {
    private static final double BONUS_RATE = 1.10;
    private static final int BONUS_HOURS_THRESHOLD = 40;

    public JuniorEngineer(String name, String surname, double hourlyWage, Employee reportsTo) {
        super(name, surname, hourlyWage, "JuniorEngineer", reportsTo);
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