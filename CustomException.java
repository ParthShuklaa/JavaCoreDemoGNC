/*
Steps for implementing customer exception in java
Step 1: Define a custom exception class that extends the Exception class or any of its subclasses.
Step 2: Provide a constructor in the custom exception class to initialize the exception message.
Step 3: Throw the custom exception in the appropriate places in your code where you want to signal an error condition.
Step 4: Catch the custom exception using a try-catch block and handle it accordingly.

*/

class CustomException extends Exception {
    public CustomException(String message) { // Constructor to initialize the exception message
        super(message); //super keyword is used to call the constructor of the parent class 
        // (Exception class) and pass the message to it
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw a CustomException
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
            System.out.println("Exception class: " + e.getClass().getName());
            System.out.println("Stack trace:");
            e.printStackTrace();
            System.out.println("Cause of the exception: " + e.getCause());
            System.out.println("Localized message: " + e.getLocalizedMessage());
            System.out.println("String representation: " + e.toString());
            //Here we are using various methods of the Exception class to get more information about the exception that was caught.
            //here getMessage() method is used to retrieve the message that was passed when the exception was thrown.
            //below are other methods of exception class that can be claled with e ie the object of the exception class
            //1)toString() : returns a string representation of the exception, including the class
            // name and the message.
            //2)printStackTrace() : prints the stack trace of the exception to the console, which can be useful for debugging.
            //3)getCause() : returns the cause of the exception, which is another throwable that caused this exception to be thrown. This can be useful for chaining exceptions together and understanding the root cause of an error.
            //4)getLocalizedMessage() : returns a localized message for the exception, which can be useful for providing error messages in different languages or formats based on the user's locale.
            //5)getStackTrace() : returns an array of StackTraceElement objects that represent the stack trace of the exception. This can be useful for analyzing the sequence of method calls that led to the exception being thrown.
            //6)fillInStackTrace() : fills in the execution stack trace for the exception. This method is typically called when an exception is created to capture the current stack trace, which can be useful for debugging and understanding the context in which the exception occurred.
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be at least 18 to register.");
        } else {
            System.out.println("Age is valid. Registration successful.");
        }
    }
}

/*
In this example, we have defined a custom exception called CustomException that extends the Exception class. The validateAge method checks if the provided age is less than 18 and throws a CustomException with a specific message if the condition is met. In the main method, we call validateAge with an age of 15, which triggers the exception. We catch the exception and print various details about it using different methods of the Exception class.
Scenario:
1) We are developing a software for an online registration system.
In this system, we want to ensure that users are at least 18 years old to register.
We can create a custom exception called "InvalidAgeException" that extends the Exception class.
In the registration process, we can check the user's age and throw an InvalidAgeException if the age is less than 18. This way, we can provide a clear and specific error message to the user when they try to register with an invalid age, and we can handle this exception appropriately in our code to ensure a smooth user experience. 
2) We are developing a software for a banking application.
In this application, we want to ensure that users cannot withdraw more money than they have in their account. We can create a custom exception called "InsufficientFundsException" that extends the Exception class. In the withdrawal process, we can check the user's account balance and throw an InsufficientFundsException if they try to withdraw more money than they have. This way, we can provide a clear and specific error message to the user when they attempt to withdraw more than their available balance, and we can handle this exception appropriately in our code to maintain the integrity of the banking application.
3) We are developing a software for a file processing application.
In this application, we want to ensure that users cannot access files that do not exist. We can create a custom exception called "FileNotFoundException" that extends the Exception class. In the file access process, we can check if the file exists and throw a FileNotFoundException if it does not. This way, we can provide a clear and specific error message to the user when they try to access a non-existent file, and we can handle this exception appropriately in our code to prevent crashes and improve the user experience.    
