/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sample;

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

public class Sample{
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

