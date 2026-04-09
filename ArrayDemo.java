//Getting started with array seaching sorting and diplaying content of array
//Step 1: Create a class named ArrayDemo and add the main method to it.
//Step 2: Declare an array of integers and initialize it with some values.
public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
    }
}
//Step 3: Display the contents of the array using a loop.
public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        
        System.out.println("Array contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
//Step 4: Sort the array in ascending order and display the sorted array.
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        
        System.out.println("Array contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        Arrays.sort(numbers);
        
        System.out.println("\nSorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
//searching in array 
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        
        System.out.println("Array contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        Arrays.sort(numbers);
        
        System.out.println("\nSorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        int key = 8;
        int index = Arrays.binarySearch(numbers, key);
        
        if (index >= 0) {
            System.out.println("\nElement " + key + " found at index: " + index);
        } else {
            System.out.println("\nElement " + key + " not found in the array.");
        }
    }
}