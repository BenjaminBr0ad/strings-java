package com.benjaminbroad;

public class Main {

    public static void main(String[] args) {
        // Primitive Data Types:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String is actually not a primitive data type, but a class instead.
        // Although, it behaves similarly to the other primitive data types.
        String myString = "Hello, world!";
        System.out.println(myString);

        // Can add strings to existing strings.
        myString = myString + "  And hello, indeed!";
        System.out.println(myString);

        // Numbers written as strings, are, like other programming languages, treated as strings.
        // Adding two "number" strings together results in string concatenation, not mathematical addition.
        String numberString = "100";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        // Example of Java type coercion.
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }
}
