package org.example.sec6.vipCustomer;

public class Main {
    public static void main(String[] args) {
        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());

        VIPCustomer person2 = new VIPCustomer("Bob", 266876.98);
        System.out.println(person2.getName());

        VIPCustomer person3 = new VIPCustomer("Zisis", 187, "Zisis@gmail.com");
        System.out.println(person3.getName());
    }
}
