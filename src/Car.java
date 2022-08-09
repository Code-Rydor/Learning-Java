// public class Car {

//     String make = "Dodge";
//     String model = "Ram TRX";
//     int year = 2022;
//     String color = "Black/Green";
//     double price = 90000.00;

//     void drive() {
//         System.out.println("You drive the car");
//     }

//     void brake() {
//         System.out.println("You step on the brakes");
//     }
// }
// public class Car { // override the toString method

//     String make = "Dodge";
//     String model = "Ram TRX";
//     int year = 2022;
//     String color = "Black/Green";

//     public String toString() {

//         // String myString = make + "\n" + model + "\n" + color + "\n" + year + "\n";
//         return make + "\n" + model + "\n" + color + "\n" + year + "\n";
//     }

// }

//? Inheritance //
// public class Car extends Vehicle {

//     int wheels = 4;
//     int doors = 4;

// }

//? Abstraction //
public class Car extends Vehicle {

    @Override
    void go() {
        System.out.println("The driver is driving the car");
    }

}