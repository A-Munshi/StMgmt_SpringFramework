package com.example;
public class Student {
    private int id;
    private String name;
    private Address address; // Dependency
    // Setter Injection Example
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        address.displayAddress();
    }
}