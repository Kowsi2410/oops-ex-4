/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author kowsi
 */
/**import java.util.Scanner;

// Define the base class Degree
class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

// Define the subclass Undergraduate, inheriting from Degree
class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

// Define the subclass Postgraduate, inheriting from Degree
class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user to determine the degree type
        System.out.println("Enter degree type (U for Undergraduate, P for Postgraduate):");
        String degreeType = scanner.nextLine();
        System.out.println("I got a degree");
        // Create objects of the respective classes based on user input
        Degree studentDegree;
        if (degreeType.equalsIgnoreCase("U")) {
            studentDegree = new Undergraduate();
        } else if (degreeType.equalsIgnoreCase("P")) {
            studentDegree = new Postgraduate();
        } else {
            System.out.println("Invalid input. Please enter 'U' for Undergraduate or 'P' for Postgraduate.");
            return;
        }

        // Call the getDegree method of the appropriate class
        studentDegree.getDegree();

        // Close the scanner
        scanner.close();
    }
}
*/



/**
import java.util.Scanner;

// Printable interface
interface Printable {
    void print();
}

// Rectangle class
class Rectangle implements Printable {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void print() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + (length * breadth));
    }
}

// SportsCar class
class SportsCar implements Printable {
    private final String brandName;
    private final String model;
    private final double price;

    public SportsCar(String brandName, String model, double price) {
        this.brandName = brandName;
        this.model = model;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("SportsCar Details:");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

// Manager class
class Manager implements Printable {
    private final String name;
    private final int age;
    private final int employeeID;
    private final double salary;

    public Manager(String name, int age, int employeeID, double salary) {
        this.name = name;
        this.age = age;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Rectangle object
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Printable rectangle = new Rectangle(length, breadth);

        // Create SportsCar object
        System.out.print("Enter brand name of the sports car: ");
        String brandName = scanner.next();
        System.out.print("Enter model of the sports car: ");
        String model = scanner.next();
        System.out.print("Enter price of the sports car: ");
        double price = scanner.nextDouble();
        Printable sportsCar = new SportsCar(brandName, model, price);

        // Create Manager object
        System.out.print("Enter manager's name: ");
        String managerName = scanner.next();
        System.out.print("Enter manager's age: ");
        int managerAge = scanner.nextInt();
        System.out.print("Enter manager's employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.print("Enter manager's salary: ");
        double managerSalary = scanner.nextDouble();
        Printable manager = new Manager(managerName, managerAge, employeeID, managerSalary);

        // Print details
        rectangle.print();
        System.out.println();
        sportsCar.print();
        System.out.println();
        manager.print();

        scanner.close();
    }
}

*/


import java.util.Scanner;

abstract class Employee {
    String name;
    int age;
    double hourRate;

    public Employee(String name, int age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public abstract double calcSalary(double hours);

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nHourly Rate: $" + hourRate;
    }
}

class Manager extends Employee {
    public Manager(String name, int age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double calcSalary(double hours) {
        return hourRate * hours;
    }
}

class Clerk extends Employee {
    public Clerk(String name, int age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double calcSalary(double hours) {
        return hourRate * hours;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first Manager:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double rate1 = scanner.nextDouble();

        Manager manager1 = new Manager(name1, age1, rate1);

        scanner.nextLine(); // Consume the newline character left in the buffer

        System.out.println("\nEnter details for the second Manager:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double rate2 = scanner.nextDouble();

        Manager manager2 = new Manager(name2, age2, rate2);

        scanner.nextLine(); // Consume the newline character left in the buffer

        System.out.println("\nEnter details for the Clerk:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Age: ");
        int age3 = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double rate3 = scanner.nextDouble();

        Clerk clerk = new Clerk(name3, age3, rate3);

        System.out.println("\nEmployee Details:");
        System.out.println("\nManager 1:");
        System.out.println(manager1);
        System.out.println("Salary: $" + manager1.calcSalary(40)); // Assuming 40 hours worked

        System.out.println("\nManager 2:");
        System.out.println(manager2);
        System.out.println("Salary: $" + manager2.calcSalary(45)); // Assuming 45 hours worked

        System.out.println("\nClerk:");
        System.out.println(clerk);
        System.out.println("Salary: $" + clerk.calcSalary(35)); // Assuming 35 hours worked
    }
}

