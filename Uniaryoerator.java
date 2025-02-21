// Java Program to show the use of
// Unary Operators
import java.io.*;

// Driver Class
class Uniaryoerator {
      // main function
    public static void main(String[] args)
    {
        // Interger declared
        int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Value of a before use a++: " + (a));
        System.out.println("Postincrement : " + (a++));
         System.out.println("Value of a after use a++: " + (a));
         System.out.println("Value of a after use ++a: " + (a));

        System.out.println("Preincrement : " + (++a));
System.out.println("Value of a after use ++a: " + (a));
 System.out.println("Value of b before use b--: " + (b));
        System.out.println("Postdecrement : " + (b--));
System.out.println("Value of b after use b--: " + (b));
        System.out.println("Predecrement : " + (--b));
System.out.println("Value of b before use --b: " + (b));
    }
}