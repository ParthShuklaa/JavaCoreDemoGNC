/*
In java Abstraction can be done in two ways 
1. Abstract Class
here We will define a class with abstract methods and concrete methods
    Step 1: Creating a class using abstract keyword
    Step 2: Define abstract methods (methods without a body) and concrete methods (methods with a body) in the abstract class.
    Step 3: Create a subclass that extends the abstract class and provides implementations for the abstract methods.
    Step 4: Create an object of the subclass and call the methods to demonstrate abstraction.
    Step 5: Run the program to see how abstraction works in Java.

2. Interface

*/

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Bird extends Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Tweet!");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // statement before = is object of the class and 
        // after = is constructor of the class
        Bird bird = new Bird();

        dog.makeSound(); // Output: Woof! coming from child  class method
        dog.sleep();     // Output: Zzz... coming from parent clasds method


        bird.makeSound(); // Output: Tweet!
        bird.sleep();     // Output: Zzz...
    }
}
/*
Observations :
1)Abstraction allows us to hide the implementation details and show only the functionality to the user.
2)In the above example, the Animal class is an abstract class that defines an abstract method makeSound() and a concrete method sleep().
3) The Dog and Bird classes extend the Animal class and provide their own implementations of the makeSound() method. 
When we create objects of the Dog and Bird classes and call their methods, we can see how abstraction works in Java.

Developer use case based on abstraction using abstract classes( is a relationship) :
scenario 1: We are developing a software for a zoo management system. 
We can create an abstract class called "Animal" that defines common properties and 
behaviors of all animals, such as eat(), sleep(), and makeSound(). 
Then, we can create specific classes like "Lion", "Elephant", and "Monkey" 
that extend the Animal class and provide their own implementations of the makeSound() method. 
This way, we can manage different types of animals in the zoo while keeping the common functionalities abstracted in the Animal class.
*/