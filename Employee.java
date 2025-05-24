package Program3;
public class Employee extends Person {
    String empId;
    double salary;

    public Employee(String name, String dobStr, String empId, double salary) {
        super(name, dobStr);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayInformation();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Vaishnavi", "2004-07-04", "emp237", 55000.95);
        emp.displayEmployeeDetails();
    }
}