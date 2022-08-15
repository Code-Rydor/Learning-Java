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
                      // toString method normally calls the location of the object, override it to call the characteristics

//     String make = "Dodge";
//     String model = "Ram TRX";
//     int year = 2022;
//     String color = "Black/Green";

//     public String toString() {

//          String myString = make + "\n" + model + "\n" + color + "\n" + year + "\n";
//          return myString;

//              or

//         return make + "\n" + model + "\n" + color + "\n" + year + "\n";
//     }

// }

//? Inheritance //
// public class Car extends Vehicle {

//     int wheels = 4;
//     int doors = 4;

// }

//? Abstraction //
// public class Car extends Vehicle {

//     @Override
//     void go() {
//         System.out.println("The driver is driving the car");
//     }

// }

//? Encapsulation //
// public class Car {
//     private String make;
//     private String model;
//     private int year;

//     Car(String make, String model, int year) {
//         this.setMake(make);
//         this.setModel(model);
//         this.setYear(year);
//     }

//     public String getMake() {
//         return make;
//     }

//     public String getModel() {
//         return model;
//     }

//     public int getYear() {
//         return year;
//     }

//     public void setMake(String make) {
//         this.make = make;
//     }

//     public void setModel(String model) {
//         this.model = model;
//     }

//     public void setYear(int year) {
//         this.year = year;
//     }
// }

// Polymorphism //
// public class Car extends Vehicle {

//     @Override
//     public void go() {
//         System.out.println("The car begins moving");
//     }
// }