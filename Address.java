package com.example3;

public class Address {
    private String city;
    private String state;
    private String country;
    // Constructor Injection
    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String getFullAddress() {
        return city + ", " + state + ", " + country;
    }
    public void displayAddress() {
        System.out.println("Address: " + getFullAddress());
    }
}