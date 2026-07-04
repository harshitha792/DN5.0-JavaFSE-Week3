package com.cognizant;

public class Address {

    private String street;
    private String city;

    // Setter for street
    public void setStreet(String street) {
        this.street = street;
    }

    // Getter for street
    public String getStreet() {
        return street;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Display method
    public void display() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
    }
}