package strings;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Strings str = new Strings();
        str.String11();
    }

    private void String1() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is: " + name);
    }

    //concatenation
    private void String2() {
        String firtName = "Saif";
        String lastName = "Ullah";
        String fullName = firtName + " " + lastName;
        System.out.println(fullName.length());    //remove .length
    }

    private void String3() {
        String firtName = "Saif";
        String lastName = "Ullah";
        String fullName = firtName + " " + lastName;
        System.out.println(fullName.length());

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }

    private void String4() {
        String name1 = "Saifu";
        String name2 = "Saif";
        if (name1.compareTo(name2) == 0) {
            System.out.println("string is equal");
        } else {
            System.out.println("string not equal");
        }
    }

    private void String5() {
        String sentence = "my name is Saifu";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }

    private void String6() {
        String sentence = "Saifu";
        String name = sentence.substring(1, 4);
        System.out.println(name);
    }

    //strings are immutable
    private void StringBuilder() {
        StringBuilder sb = new StringBuilder("Saifu");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

//        sb.setCharAt(0, 'X');
//        System.out.println(sb);
    }

    private void String7() {
        StringBuilder sb = new StringBuilder("Saifu");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'X');
        System.out.println(sb);
    }

    private void String8() {
        StringBuilder sb = new StringBuilder("Saifu");
        System.out.println(sb);

        sb.insert(2, 'r');
        System.out.println(sb);
    }

    private void String9() {
        StringBuilder sb = new StringBuilder("Saifu");
        System.out.println(sb);

        sb.insert(2, 'r');
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);
    }

    private void String10(){
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }

    private void String11(){
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
