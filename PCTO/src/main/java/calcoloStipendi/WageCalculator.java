package calcoloStipendi;

public class WageCalculator {
    public static void main(String[] args) {
       
        String[] names = {"Carl", "Eva", "John", "Frank", "Mark", "Mark", "Lars", "Julia", "Vince", "Maria"};
        String[] surnames = {"Logan", "Stanton", "Smith", "Black", "White", "Smith", "Ulrich", "Heil", "Ridge", "Spinoza"};
        double[] hourlyWages = {50.0, 45.0, 40.0, 40.0, 40.0, 20.0, 35.0, 35.0, 35.0, 35.0};
        int[] hoursWorkedArray = {45, 55, 45, 30, 60, 45, 35, 55, 60, 55};
        
        Manager carl = new Manager(names[0], surnames[0], hourlyWages[0]);
        Manager eva = new Manager(names[1], surnames[1], hourlyWages[1]);
        SeniorEngineer john = new SeniorEngineer(names[2], surnames[2], hourlyWages[2], carl);
        SeniorEngineer frank = new SeniorEngineer(names[3], surnames[3], hourlyWages[3], carl);
        SeniorEngineer markW = new SeniorEngineer(names[4], surnames[4], hourlyWages[4], eva);
        JuniorEngineer markS = new JuniorEngineer(names[5], surnames[5], hourlyWages[5], eva);
        JuniorEngineer lars = new JuniorEngineer(names[6], surnames[6], hourlyWages[6], markS);
        JuniorEngineer julia = new JuniorEngineer(names[7], surnames[7], hourlyWages[7], frank);
        JuniorEngineer vince = new JuniorEngineer(names[8], surnames[8], hourlyWages[8], markW);
        JuniorEngineer maria = new JuniorEngineer(names[9], surnames[9], hourlyWages[9], markW);
        
        Employee[] employees = {carl, eva, john, frank, markW, markS, lars, julia, vince, maria};

       
        for (int i = 0; i < employees.length; i++) {
            int hours = hoursWorkedArray[i];
            double weeklyWage = employees[i].calculateWage(hours);
            
            String reportString = "";
            if (employees[i].getReportsTo() != null) {
                reportString = " ( assigned to " + employees[i].getReportsTo().getName() + " " + employees[i].getReportsTo().getSurname() + ")";
            }
            
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + reportString + " " + weeklyWage);
        }
    }
}