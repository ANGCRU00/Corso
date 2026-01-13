package calcoloStipendi;

public class Employee {
    protected String name;
    protected String surname;
    protected double hourlyWage;
    protected String role;
    protected Employee reportsTo;

    public Employee(String name, String surname, double hourlyWage, String role, Employee reportsTo) {
        this.name = name;
        this.surname = surname;
        this.hourlyWage = hourlyWage;
        this.role = role;
        this.reportsTo = reportsTo;
    }

    public Employee(String name, String surname, double hourlyWage, String role) {
        this(name, surname, hourlyWage, role, null);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public double calculateWage(int hoursWorked) {
        return hoursWorked * hourlyWage;
    }
}