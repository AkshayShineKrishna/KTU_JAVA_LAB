
import java.util.Scanner;

class EmployeeDetails {
    int employeeNumber;
    String employeeName, employeeJob;
    double salary;
    
    // Method to set employee details
    void setDetails(int employeeNumber, String employeeName, String employeeJob, double salary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeJob = employeeJob;
        this.salary = salary;
    }
    
    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Job: " + employeeJob);
        System.out.println("Salary: " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Getting employee details from user
        System.out.print("Enter Employee Number: ");
        int employeeNumber = scanner.nextInt();
        
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.next();
        employeeName += scanner.nextLine();
        
        System.out.print("Enter Employee Job: ");
        String employeeJob = scanner.next();
        employeeJob += scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        
        // Creating an instance of EmployeeDetails with user input
        EmployeeDetails employee = new EmployeeDetails();
        employee.setDetails(employeeNumber, employeeName, employeeJob, salary);
        
        // Displaying employee details
        System.out.println("\nEmployee Details:");
        employee.displayDetails();
        
        // Closing the Scanner object
        scanner.close();
    }
}
