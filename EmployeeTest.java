class Employee {
    private double basicSalary;

    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}

class FullTime extends Employee {
    private double bonus;

    public FullTime(double basicSalary, double bonus) {
        super(basicSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBasicSalary() + bonus;
    }
}

class PartTime extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTime(double basicSalary, int hoursWorked, double hourlyRate) {
        super(basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBasicSalary() + (hoursWorked * hourlyRate);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        FullTime fullTimeEmployee = new FullTime(50000, 5000);
        System.out.println("Full-time employee salary: $" + fullTimeEmployee.calculateSalary());

        PartTime partTimeEmployee = new PartTime(20000, 20, 25);
        System.out.println("Part-time employee salary: $" + partTimeEmployee.calculateSalary());
    }
}
