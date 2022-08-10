// Inheritance and Method Override //
// public class Bicycle extends Vehicle {

//     int wheels = 2;
//     int pedals = 2;

//     //Abstraction
//     @Override
//     void go() {
//         System.out.println("The rider is pedaling the bike");
//     }
// }

// Polymorphism //
public class Bicycle extends Vehicle {

    @Override
    public void go() {
        System.out.println("The bike begins moving");
    }

}