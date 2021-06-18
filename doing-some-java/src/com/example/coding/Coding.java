package com.example.coding;

import javax.swing.*;
import java.util.Scanner;

public class Coding {
    public static void main (String[] args) {
        double amount = 0b101;
        System.out.println("amount" + amount);
        // process user input with GUI
        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        // process user input in terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");

        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        try {
            checkAge(age);
        } catch(Exception e) {
            System.out.println("You cannot be signed up" + e);
        }

        scanner.nextLine(); // has to be done after scanning next int

        System.out.println("Where do you live?");
        String city = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You live in "+ city);

        new AnonymousClasses();
    }

    static void checkAge(int age) throws AgeException {
        if(age < 18) {
            throw new AgeException("You have to be 18+");
        } else {
            System.out.println("You are now signed up");
        }
    }
}
