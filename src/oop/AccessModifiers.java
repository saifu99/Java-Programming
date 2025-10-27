package oop;

class Person {
    public String name = "Saifu";       // accessible everywhere
    protected int age = 20;             // same package + subclasses
    private String password = "secret"; // only within this class

    public void showDetails() {
        System.out.println(name + ", " + age + ", " + password);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Person p = new Person();
        p.showDetails(); // allowed
        System.out.println(p.name); // allowed
        // System.out.println(p.password); // ❌ not allowed
    }
}
