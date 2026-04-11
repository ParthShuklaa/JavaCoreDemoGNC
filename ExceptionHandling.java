/*
Steps for handling exception in java
Step 1: Identify the code that may throw an exception and wrap it in a try block.
Step 2: Catch the exception using a catch block that follows the try block.
Step 3: Handle the exception in the catch block, such as printing an error message or taking corrective action.
Step 4: Optionally, use a finally block to execute code regardless of whether an exception was thrown or not.
*/


class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Catching the specific exception only 
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
            //We can catch multiple exceptions by using multiple catch blocks

        } catch (Exception e) { // Catching any other exceptions that may occur as 
        // it is parent class of all exception
        //Exception calss is the parent class of all exceptions, so it can catch any exception that is not caught by the previous catch blocks.
        //Types of Exception classes in java
        //2)Exception class hierarchy in java
            // INdexOutOfBoundsException : in array if we try to access an index that is out of bounds
            //NullPointerException : when we try to call a method or access a field of a null object
            //FileNotFoundException : when we try to access a file that does not exist
            //IOException : when an I/O operation fails or is interrupted
            //SQLException : when an error occurs while executing an SQL statement
            //NumberFormatException : when we try to convert a string to a number but the string is not a valid number
            //Note: ALL above are child class of Exception class

            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            System.out.println("This block will always execute.");
        }
    }
}

/*
Note: At a time we can handle more than 1 exception
Scenario :
1) We are developing a software for a banking application. 
In this application, we can have various operations such as withdrawing money, depositing money, 
and transferring money between accounts. Each of these operations can potentially throw different 
types of exceptions,
such as InsufficientFundsException, AccountNotFoundException, and InvalidAmountException.

Real world ex of finally with try catch block
2) We are developing a software for a file processing application.
In this application, we can have various operations such as reading a file,
 writing to a file, and closing a file.
Each of these operations can potentially throw different types of exceptions,
such as FileNotFoundException, IOException, and SecurityException.
In this scenario, we can use a finally block to ensure that the file is always closed,
regardless of whether an exception was thrown or not. This way, we can prevent resource leaks
and ensure that the application runs smoothly.

*/