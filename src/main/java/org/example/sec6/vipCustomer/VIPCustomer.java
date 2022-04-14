package org.example.sec6.vipCustomer;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String address;


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }

    public VIPCustomer() {
        this("Sahar", 67787.98, "Istanbul");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Stockholm");
    }

    public VIPCustomer(String name, double creditLimit, String address) {
        this.name = name;
        creditLimit = creditLimit;
        this.address = address;
    }
}


