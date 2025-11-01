package com.example3;

public class Student {
    private int id;
    private String name;
    private Address address;
    // Setter Injection
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
        System.out.println("=== Student Details ===");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        address.displayAddress();
        System.out.println();
    }
}