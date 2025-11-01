package com.example2;
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
    public void displayAddress() {
        System.out.println("Address: " + city + ", " + state + ", " + country);
    }
}
