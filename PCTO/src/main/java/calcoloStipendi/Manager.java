package calcoloStipendi;

public class Manager extends Employee {
    private static final double BONUS_RATE = 1.30;
    private static final int BONUS_HOURS_THRESHOLD = 50;

    public Manager(String name, String surname, double hourlyWage, Employee reportsTo) {
        super(name, surname, hourlyWage, "Manager", reportsTo);
    }

    public Manager(String name, String surname, double hourlyWage) {
        super(name, surname, hourlyWage, "Manager", null);
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