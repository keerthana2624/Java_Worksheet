// Base class Employee
class Employee {
    private double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void details() {
        System.out.println("Base Salary: $" + baseSalary);
    }
}

// Subclass Manager inherits from Employee
class Manager extends Employee {
    private double bonus;
    private String department;

    public Manager(double baseSalary, double bonus, String department) {
        super(baseSalary);
        this.bonus = bonus;
        this.department = department;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Department: " + department);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(50000);
        System.out.println("Employee Details:");
        employee.details();
        System.out.println();

        Manager manager = new Manager(80000, 10000, "Finance");
        System.out.println("Manager Details:");
        manager.details();
    }
}

