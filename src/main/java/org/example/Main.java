package org.example;

import org.example.sec6.ComplexNumber;

public class Main {
    public static void main(String[] args) {

        // code for testng Car class
        /*
         Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Model is "+ porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is "+ porsche.getModel());
        */


        // code for testing simpleCalculator class
        /*
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        System.out.println("***********************************************");
        */

        //Code for testing  Person Class
        /*
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        System.out.println("**********************************************************");
        */

        //code for testing BankAccountClass
        /*
        BankAccount negarsAccount = new BankAccount();// ("12345", 0, "Negar Madadi",
        // "negar.myeah@gmail.com", "070587413");
        System.out.println(negarsAccount.getAccountNumber());
        System.out.println(negarsAccount.getBalance());

        negarsAccount.withraw(100);

        negarsAccount.deposit(50);
        negarsAccount.withraw(100);

        negarsAccount.deposit(51);
        negarsAccount.withraw(100);

        BankAccount timsAccount = new BankAccount("Tim","tim@gmail.com","1245");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withraw(100.55);
        System.out.println("***********************************************"  );
        */


        //code for testing VIPCustomer class
        /*
         VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());

        VIPCustomer person2 = new VIPCustomer("Bob", 266876.98);
        System.out.println(person1.getName());

        VIPCustomer person3 = new VIPCustomer("Zisis", 187, "Zisis@gmail.com");
        System.out.println(person1.getName());
          System.out.println("**********************************************************");
        */


        //code for testing WallArea class
        /*  Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
          System.out.println("**********************************************************");
        */


        //code for testing Point class
        /*
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
          System.out.println("**********************************************************");
        */


        //code for testing carpetCostCalculator package
      /*
      Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new org.example.sec6.carpetCostCalculator.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        */


        //COde for ComplexNumber class
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}





































