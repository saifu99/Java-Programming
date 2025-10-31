package basics.strings;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        reverseStringBuilder(); //enter method to call
    }

    private static void readAndPrintName() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is: " + name);
    }

    //concatenation
    private static void concatNames() {
        String firstName = "Saifu";
        String lastName = "Saifu";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length()); //remove .length
    }

    private static void countLengthPrintChars() {
        String firstName = "Rahul";
        String lastName = "Mohit";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
    }

    private static void checkStringEqualOrNot() {
        String name1 = "Ajay";
        String name2 = "Ajay";
        if (name1.compareTo(name2) == 0) {
            System.out.println("string is equal");
        } else {
            System.out.println("string not equal");
        }
    }

    private static void extractNameFromSentence() {
        String sentence = "my name is User";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }

    private static void extractSubstring() {
        String sentence = "Irfan";
        String name = sentence.substring(1, 4);
        System.out.println(name);
    }

    //strings are immutable
    private static void demonstrateMutability() {
        StringBuilder sb = new StringBuilder("Saifu");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'X');
        System.out.println(sb);
    }

    private static void insertAndDeleteCharacter() {
        StringBuilder sb = new StringBuilder("userName");
        System.out.println(sb);

        sb.insert(2, 'r');
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);
    }

    private static void addInSuffix(){
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }

    private static void reverseStringBuilder(){
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
