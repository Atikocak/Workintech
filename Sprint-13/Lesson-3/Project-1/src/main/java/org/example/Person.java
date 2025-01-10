package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private String profession;
    private double height;
    private double weight;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String profession, double height, double weight) {
        this("John", "Doe", 30);
        this.profession = profession;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
