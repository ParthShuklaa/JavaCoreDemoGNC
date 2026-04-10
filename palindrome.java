/* This program checks if a given string is a palindrome.
 * A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).
Steps to write the above code:
Step 1: Create a class named "Palindrome" and define the main method.   
Step 2: Declare a String variable "original" and assign it the value you want to check (e.g., "level").
Step 3: Declare an empty String variable "reverse" to store the reversed version of the original string.
Step 4: Use a for loop to iterate through the original string in reverse order. Inside the loop, concatenate each character to the "reverse" variable.
Step 5: After the loop, use the .equalsIgnoreCase() method to compare the original string with the reversed string, ignoring case differences. If they are equal, print that the original string is a palindrome; otherwise, print that it is not a palindrome.
 
*/


public class Palindrome {
    public static void main(String[] args) {
        String original = "level"; 
        String reverse = "";
        
        // Loop backwards through the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Use .equals() for content comparison, not ==
        if (original.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

//Step 1:  