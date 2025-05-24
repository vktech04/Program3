package Program3;
import java.time.LocalDate;
import java.time.Period;

class Person {
    String name;
    LocalDate dob;

    public Person(String name, String dobStr) {
        this.name = name;
        this.dob = LocalDate.parse(dobStr);
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person P1 = new Person("Vaishnavi", "2004-07-04");
        P1.displayInformation();
    }
}