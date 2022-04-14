package org.example.sec6.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 22, 4, 1, 20, "Long silky");

        dog.eat();
      // dog.walk();
       dog.run();


    }

}
