// Java program to illustrate creating an array
// of integers,  puts some values in the array,
// and prints each value to standard output.
import java.util.Scanner;
class arraccess {
    public static void main(String[] args)
    {
	Scanner obj=new Scanner(System.in);
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the elements of the array
        // first to last(fifth) element
          
for (int i = 0; i < arr.length; i++)
            {
arr[i]=obj.nextInt();
    }


        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index "
                               + i + " : " + arr[i]);
    }
}
