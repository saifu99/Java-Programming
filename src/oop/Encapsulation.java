package oop;

class Account {
    private double balance; // private = hidden data

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}

