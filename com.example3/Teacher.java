package com.example3;

public class Teacher {
    private int id;
    private String name;
    private Address address;
    // Constructor Injection
    public Teacher(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("=== Teacher Details ===");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        address.displayAddress();
        System.out.println();
    }
}
