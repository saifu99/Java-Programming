package basics.arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        readAndFindIn2DArray();
        inputAndPrint2DMatrix();
    }

    private static void readAndFindIn2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        //input
        System.out.println("enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        System.out.print("enter element to search: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location(" + i + ", " + j + ")");
                }
            }
        }
    }


    private static void inputAndPrint2DMatrix() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        //input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //print elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}




