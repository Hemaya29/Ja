package com.DAY1.HW.H8;

public class WelcomeMessage {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a name:");
        } else {
            System.out.println("Welcome " + args[0]);
        }
    }
}
