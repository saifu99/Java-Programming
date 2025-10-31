package basics.arrays;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        //example 1
        int[] marks = {97, 98, 95};
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + marks[i]);
        }

        //OR
//        int marks[] = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;
//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }
//    }
//}

        //example 2
        Scanner sc = new Scanner(System.in);
        System.out.print("\nenter the size: ");
        int Size = sc.nextInt();
        int[] numbers = new int[Size];
        //input
        for (int i=0; i<Size; i++){
            numbers[i] = sc.nextInt();
        }
        //output
        for (int i=0; i<Size; i++){
            System.out.print(" "+numbers[i]);
        }

        //example 3
        System.out.print("\nenter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("enter the value of x that you want to find from the array: ");
        int x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}
