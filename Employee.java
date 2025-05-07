package Program3;

class Employee extends Person {
    String empId;
    double salary;

    public Employee(String name, String dobStr, String empId, double salary) {
        super(name, dobStr);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayInfo();
        System.out.println("Emp ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee E1 = new Employee("Vaishnavi", "2004-07-04", "emp200", 560000.42);
        E1.displayEmployeeDetails();
    }
}
