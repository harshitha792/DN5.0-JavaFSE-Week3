package com.cognizant;

public class Employee {

    private int id;
    private String name;
    private Address address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // 👇 Paste it here
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        address.display();
    }

} // <- End of class