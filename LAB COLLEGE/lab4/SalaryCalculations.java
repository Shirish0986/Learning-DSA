import java.util.Scanner;

public class SalaryCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee type (FullTime/PartTime): ");
        String type = scanner.nextLine();

        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.println("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter base salary: ");
        double baseSalary = scanner.nextDouble();

        Employee employee = null;

        if (type.equalsIgnoreCase("FullTime")) {
            System.out.println("Enter bonus: ");
            double bonus = scanner.nextDouble();
            employee = new FullTimeEmployee(name, id, baseSalary, bonus);
        } else if (type.equalsIgnoreCase("PartTime")) {
            System.out.println("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.println("Enter hours worked: ");
            int hoursWorked = scanner.nextInt();
            employee = new PartTimeEmployee(name, id, baseSalary, hourlyRate, hoursWorked);
        } else {
            System.out.println("Invalid employee type.");
            System.exit(0);
        }

        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee ID: " + employee.id);
        System.out.println("Final Salary: " + employee.calculateSalary());
        
        scanner.close();
    }
}


abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double baseSalary, double hourlyRate, int hoursWorked) {
        super(name, id, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
