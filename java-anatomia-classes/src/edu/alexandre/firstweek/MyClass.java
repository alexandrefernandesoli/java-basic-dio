package edu.alexandre.firstweek;

public class MyClass {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        String fullName = getFullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String getFullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
