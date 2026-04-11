/*
We Need Wrapper class in java to perform following operations:
1) To convert primitive data types to objects and vice versa (autoboxing and unboxing).
EX: int to Integer, double to Double, etc.
2) To use collections that can only store objects, such as ArrayList and HashMap.
3) To provide utility methods for converting between different data types, such as parsing strings to numbers
*/
// Wrapper class for int
class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Using the IntegerWrapper class to wrap an int value
        IntegerWrapper wrappedInt = new IntegerWrapper(42);
        System.out.println("Wrapped integer value: " + wrappedInt.getValue());

        // Autoboxing: converting a primitive int to an Integer object
        Integer autoBoxedInt = 100; // This is autoboxing
        System.out.println("Autoboxed integer value: " + autoBoxedInt);

        // Unboxing: converting an Integer object back to a primitive int
        int unboxedInt = autoBoxedInt; // This is unboxing
        System.out.println("Unboxed integer value: " + unboxedInt);

        // difference in implementing == and equals() method in wrapper class and primitive data type
        Integer a = 100; // Autoboxing
        Integer b = 100; // Autoboxing
        System.out.println("Using == operator: " + (a == b)); 
        // This will print false because a and b are different objects in memory
        System.out.println("Using equals() method: " + a.equals(b)); 
        // This will print true because the equals() method compares the values of a and b, which are the same (100)
        
    }
}


/* STACK AND HEAP MEMORY IN JAVA
1) Stack Memory: Stack memory is used for storing primitive data types and references to objects.
2) Heap Memory: Heap memory is used for storing objects and their associated data. When we create an object using the new keyword, it is allocated on the heap memory. The stack memory holds references to these objects, while the actual data of the objects resides in the heap memory.
3) When we create an instance of the IntegerWrapper class, the object is allocated on the
heap memory, and the reference to that object is stored in the stack memory. 
The primitive int value is stored directly in the stack memory as part of the IntegerWrapper object.

GOLDEN RULE FOR IMPLEMENTING aUTOBOXING AND UNBOXING
1) Autoboxing and unboxing can only be applied to primitive data types and their corresponding wrapper classes.
2) Autoboxing and unboxing can lead to performance overhead if used excessively, as it involves creating and destroying objects on the heap memory. Therefore, it is recommended to use autoboxing and unboxing judiciously in performance-critical code.
3) When using collections that require objects, such as ArrayList, it is important to be    aware of autoboxing and unboxing, as it can lead to unintended consequences if not handled properly. For example, if we add a primitive int to an ArrayList<Integer>, it will be autoboxed to an Integer object, and if we retrieve it later, it will be unboxed back to a primitive int. This can lead to issues if we are not careful with the types of data we are working with.
4) It is important to note that autoboxing and unboxing can lead to NullPointerExceptions if we try to unbox a null reference. For example, if we have an Integer object that is null and we try to unbox it to a primitive int, it will throw a NullPointerException. Therefore, it is important to check for null values before performing unboxing operations to avoid such exceptions.
5) Autoboxing and unboxing can also lead to unexpected behavior when comparing wrapper objects using    the == operator. 
The == operator checks for reference equality, which means it checks if two references point to the same object in memory.
 When we autobox a primitive value, it creates a new wrapper object on the heap memory. 
 Therefore, if we compare two wrapper objects using the == operator, it may return false even if they have the same value,
  because they are different objects in memory. To compare the values of wrapper objects, it is recommended to use the equals() 
  method instead of the == operator.
*/