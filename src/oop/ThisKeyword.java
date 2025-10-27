package oop;

public class ThisKeyword {
    String name;
    int age;

    ThisKeyword(String name, int age) {
        this.name = name; // 'this' refers to the current object
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        ThisKeyword person = new ThisKeyword("Saifu", 20);
        person.show();
    }
}
