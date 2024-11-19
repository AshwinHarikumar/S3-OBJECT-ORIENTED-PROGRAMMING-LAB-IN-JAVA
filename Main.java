// Importing necessary package
import java.util.*;

// Base class Employee
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

// Derived class Officer extending Employee
class Officer extends Employee {
    String specialization;

    // Constructor for Officer
    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to print details of the Officer
    void printDetails() {
        System.out.println("Officer Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary(); // Call the printSalary method from Employee class
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an IT Officer
        Officer Officer = new Officer("John Doe", 35, "1284567890", "123 Street, City", 76000.00, "IT");
        Officer.printDetails();

        // Creating an HR Officer
        Officer Manager= new Officer("Jane Smith", 40, "4564567890", "456 Avenue, City", 90000.00, "HR");
        Manager.printDetails(); 
    }
}
