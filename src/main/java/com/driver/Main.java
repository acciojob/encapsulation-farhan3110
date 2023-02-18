package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // Task 4: try setting a value to name, by directly accessing it using obj and also try printing it.
        // This will result in a compilation error because the name member variable is private and cannot be accessed directly.
        // obj.name = "John"; // Compilation error
        // System.out.println(obj.name); // Compilation error

        // Task 6: Now, try setting a value to name in Main function using the setter function and access its value using the getter function.
        obj.setName("John");
        String name = obj.getName();
        System.out.println(name); // Output: John
    }
}