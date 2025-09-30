import java.util.Scanner;

public class EmployeeInfo {
    String name;
    int id;
    double salary;

    EmployeeInfo(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        EmployeeInfo emp = new EmployeeInfo(name, id, salary);
        emp.display();

        if (args.length == 2) {
            double increment = Double.parseDouble(args[0]);
            double bonus = Double.parseDouble(args[1]);
            emp.salary += increment + bonus;
            System.out.println("Updated Salary after Batch Update: " + emp.salary);
        }
    }
}
