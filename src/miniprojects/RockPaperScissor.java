package miniprojects;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println(" int rock=0" + " int paper=1" + " int scissor=2");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random rnd = new Random();
        int compInput = rnd.nextInt(3);

        if (compInput==userInput){
            System.out.println("Draw");
        } else if (compInput==0 && userInput==1 || compInput==1 && userInput==2 || compInput==2 && userInput==0) {
            System.out.println("Human wins");
        }else {
            System.out.println("Computer wins");
        }
        System.out.println("Computer choice is " + compInput);
        if (compInput == 0) {
            System.out.println("Computer choice is rock");
        } else if (compInput==1) {
            System.out.println("Computer choice is paper");
        }else {
            System.out.println("Computer choice is scissor");
        }
    }
}
