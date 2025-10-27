package oop;

public class StaticKeyword {
    static String schoolName = "ABC Public School"; // shared by all
    String studentName;

    StaticKeyword(String studentName) {
        this.studentName = studentName;
    }

    void show() {
        System.out.println(studentName + " studies at " + schoolName);
    }

    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword("Saifu");
        StaticKeyword s2 = new StaticKeyword("Aisha");
        s1.show();
        s2.show();
    }
}

