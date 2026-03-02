/**
 * Simple DevOps demo application.
 */
package com.example;

public class App {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "Developer";
        System.out.println(getGreeting(name));
        System.out.println(getGreeting("Developer"));
    }

    public static String getGreeting(String name) {
        if (name == null) {
            name = "Developer";
        }
        return "Hello, " + name + "!";
    }
}
