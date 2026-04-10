//Need to create demo based on classes and object 
//Step 1: Create a class named "Car" with attributes like "make", "model", and "year". Include a method to display the car's details. Then, create an object of the Car class in the main method and call the display method to show the car's information.
//Step 2: Create a class named "BankAccount" with attributes like "accountNumber", "accountHolderName", and "balance". Include methods to deposit money, withdraw money, and display the account details. Then, create an object of the BankAccount class in the main method, perform some transactions, and display the account details.
//Step 3: Create a class named "Student" with attributes like "name", "age", and "grade". Include a method to calculate the student's grade based on their score. Then, create an object of the Student class in the main method, set the attributes, and call the method to calculate and display the student's grade.
class Car {
    String make;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
//Step4: Define main fucntion to create object of Car class and call display method
public class ClassesandObjectdemo {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object of the Car class
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        myCar.displayDetails(); // Calling the method to display car details
    }
}