/* Write a java program for demonstrating creation of java classes, objects, constructors,
   delaration and initialization of variable */

import java.util.Scanner;
class Vehicle {
    // Variables (attributes) of the class.
    String make;
    String model;
    int year;
    String color;

    // Constructor to initialize the object.
    Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    Vehicle() {

    }

    // Method to display vehicle details.
    void displayDetails() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
        System.out.println("Vehicle Color: " + color);
    }
}

// Main class
public class vehicle_program {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        // Creating objects of vehicle class.
        Vehicle car1 = new Vehicle("Toyata", "Corolla", 2020, "Red");
        Vehicle car2 = new Vehicle();
        
        System.out.println("Enter car 2 details: ");
        System.out.println("MAKE");
        String mk = inpt.next();
        System.out.println("MODEL");
        String md = inpt.next();
        System.out.println("YEAR");
        int y = inpt.nextInt();
        System.out.println("COLOR");
        String c = inpt.next();

        // Displaying details of car 1 and car 2.
        System.out.println("\nCar 1 Details: ");
        car1.displayDetails();

        System.out.println("\nCar 2 Details: ");
        car2.displayDetails();
} }
