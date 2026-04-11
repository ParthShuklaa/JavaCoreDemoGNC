/* Collections in Java 
1)Arraylist : It is a resizable array implementation of the List interface. It allows us to store and manipulate a dynamic collection of objects. We can add, remove, and access elements in an ArrayList using various methods provided by the List interface.
2)LinkedList : It is a doubly-linked list implementation of the List interface. It allows us to store and manipulate a dynamic collection of objects, similar to ArrayList. However, LinkedList provides better performance for certain operations, such as inserting or removing elements in the middle of the list, compared to ArrayList.
3)HashSet : It is a collection that implements the Set interface and uses a hash table
for storage. It does not allow duplicate elements and does not maintain any order of the elements. HashSet provides constant-time performance for basic operations like add, remove, and contains.
4)TreeSet : It is a collection that implements the Set interface and uses a red-black
tree for storage. It does not allow duplicate elements and maintains the elements in sorted order. TreeSet provides logarithmic time performance for basic operations like add, remove, and contains.
5)HashMap : It is a collection that implements the Map interface and uses a hash table for storage. It stores key-value pairs and allows us to retrieve values based on their corresponding keys. HashMap provides constant-time performance for basic operations like put, get, and remove.
6)TreeMap : It is a collection that implements the Map interface and uses a red-black

*/

//limitation of array in java

// 1) Fixed size: Arrays have a fixed size, which means we cannot change their size after creation. This can lead to wasted memory if we allocate more space than needed or insufficient space if we allocate less.
// 2) Homogeneous data type: Arrays can only store elements of the same data type (primitive or reference types). This can be limiting when we want to store different types of data in the same collection.
// 3) Lack of built-in methods: Arrays do not have built-in methods for common operations like adding, removing, or searching for elements. We have to implement these operations manually, which can be time-consuming and error-prone.
// 4) Inefficient for certain operations: Arrays can be inefficient for certain operations, such as inserting or deleting elements in the middle of the array, as it requires shifting elements to maintain the order. This can lead to performance issues, especially for large arrays.
// 5) No support for dynamic resizing: Arrays do not support dynamic resizing, which means we cannot easily add or remove elements without creating a new array and copying the existing elements. This can lead to performance overhead and increased complexity in managing the array.    

class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Fixed size array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Trying to add an element beyond the fixed size will throw an ArrayIndexOutOfBoundsException
        // numbers[5] = 6; // This will cause an error

        // To store different types of data, we would need to use an array of Objects, 
        // which can lead to type safety issues
        Object[] mixedArray = new Object[5];
        mixedArray[0] = "Hello";
        mixedArray[1] = 123;
        mixedArray[2] = 45.67;
        mixedArray[3] = true;
        mixedArray[4] = 'A';

        // Lack of built-in methods for common operations means we have to implement them manually
        // For example, to search for an element in the array, we would need to write a loop to check each element
    }
}
class CollectionsDemo {
    public static void main(String[] args) {
        // We can use ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap here to demonstrate their usage and limitations.
    //Array list demo
        ArrayList<String> arrayList = new ArrayList<>();//creating an ArrayList of Strings
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println("ArrayList: " + arrayList);
        //checking the sixe of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
        //removing an element from the ArrayList
        arrayList.remove("Hello");
        System.out.println("ArrayList after removal: " + arrayList);
        //checking if an element is present in the ArrayList
        System.out.println("Is 'World' present in the ArrayList? " + arrayList.contains("World"));
        //Here the size of the ArrayList can grow dynamically as we add elements to it,
        //  unlike an array which has a fixed size. 
        // We can also store different types of data in an ArrayList by using a generic type parameter, such as ArrayList<Object>, which allows us to store any type of object in the list. Additionally, ArrayList provides built-in methods for common operations like adding, removing, and searching for elements, which makes it easier to work with compared to arrays.
    
    
    }
}
//Step1: Creating the object of collection class and adding elements to it
//Step2: Demonstrating the various methods of collection class to manipulate the data 
//Step 3: Demonstrating the limitations of collection class, such as performance overhead, memory usage, and 
// type safety issues.    
