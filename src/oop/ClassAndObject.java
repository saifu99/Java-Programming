package oop;

public class ClassAndObject {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I’m " + name + " and I’m " + age + " years old.");
    }

    public static void main(String[] args) {
        ClassAndObject person = new ClassAndObject();
        person.name = "Saifu";
        person.age = 20;
        person.introduce();
    }
}


