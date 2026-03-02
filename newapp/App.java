/**
 * Simple DevOps application.
 */
package com.example;

public class App {
    public static void main(String[] args) {
        // dsafdhyt
        System.out.println("=== DevOps Demo ===");
        String name = args.length > 0 ? args[0] : "Developer";
        System.out.println(farewell(name));
        System.out.println(getGreeting(name));
        System.out.println(farewell(name));
    }

    public static String getGreeting(String name) {
        if (name == null) {
            name = "Developer";
        }
        return "Hello, " + name + "!";
    }

    public static String farewell(String name) {
        return "Goodbye, " + name + "!";
    }
    // TODO: add unit tests
}
