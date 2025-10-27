package practiceprograms;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double r = sc.nextDouble();

        double Area = 3.14*r*r;
        System.out.println(Area);
    }
}
