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