import java.util.Scanner;

import javax.swing.plaf.TreeUI;
import javax.xml.namespace.QName;

import java.util.ArrayList;
import java.util.Random;
// public class Main {
//     public static void main(String[] args) {
//         String x = "water";
//         String y = "Kool-Aid"; // Switch variables

//         String temp;
//         temp = x;
//         x = y;
//         y = temp;

//         System.out.println("x: " + x);
//         System.out.println("y: " + y);
//     }

// }

// public class Main {
//     public static void main(String[] args){

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What is your name? ");
//         String name = scanner.nextLine();

//         System.out.println("Hello " + name);

//         System.out.println("Tell me how many siblings you have: ");
//         String siblings = scanner.nextLine();

//         System.out.println("How many cousins do you have? ");
//         String cousins = scanner.nextLine();

//         System.out.println("How old are you?");
//         int age = scanner.nextInt();
//         scanner.nextLine();
//         System.out.println("What is your favorite food?");
//         String food = scanner.nextLine();

//         System.out.println(
//                 "So you have " + siblings + " siblings and you have " + cousins + " cousins and you are " + age
//                         + " years old!");
//         System.out.println("You like "+ food);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // expression = operands & operators
//         // operands = values, variables, numbers, quantity
//         // operators = + - * / %

//         double friends = 10;
//         // friends = friends + 1;
//         // friends = friends * 2;
//         // friends = friends / 2;
//         // friends = friends % 2;
//         // friends--;
//         friends = (double) friends / 3;
//         System.out.println("Friends: " +friends);
//     }
// }
// import javax.swing.JOptionPane;
// // GUI - JOptionPane Class
// public class Main {
//     public static void main(String[] args) {
//         String name = JOptionPane.showInputDialog("Enter your name");
//         JOptionPane.showMessageDialog(null, "Hello, " + name);

//         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//         JOptionPane.showMessageDialog(null, "You are " + age + " years old! Wow");

//         double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//         JOptionPane.showMessageDialog(null, "You are " + height + " feet tall! You're a beast!");
//     }
// }

//? Math - Find the hypotenuse of a triangle
// public class Main {
//     public static void main(String[] args) {
//         double x;
//         double y;
//         double z;

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("What is side x: ");
//         x = scanner.nextDouble();
//         System.out.println("What is side y: ");
//         y = scanner.nextDouble();

//         z = (x * x) + (y * y);
//         System.out.println("The hypotenuse is " + Math.sqrt(z));

//         scanner.close();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Random random = new Random();

//         // int x = random.nextInt(6)+1;
//         // double y = random.nextDouble();
//         boolean z = random.nextBoolean();
//         System.out.println(z);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int age = 13;

//         if (age >= 75) {
//             System.out.println("Ok, boomer!");
//         }
//         else if (age >= 18) {
//             System.out.println("You're legal!");
//         }
//         else if (age >= 13) {
//             System.out.println("You are a teenager!");
//         }
//         else {
//             System.out.println("Still a baby!");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         String day = "Pizza";

//         switch (day) {
//             case "Sunday":
//                 System.out.println("It is Sunday!");
//                 break;
//             case "Monday":
//                 System.out.println("It is Monday!");
//                 break;
//             case "Tuesday":
//                 System.out.println("It is Tuesday!");
//                 break;
//             case "Wednesday":
//                 System.out.println("It is Wednesday!");
//                 break;
//             case "Thursday":
//                 System.out.println("It is Thursday!");
//                 break;
//             case "Friday":
//                 System.out.println("It is Friday!");
//                 break;
//             case "Saturday":
//                 System.out.println("It is Saturday!");
//                 break;
//             default: System.out.println("That is not a day");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         logical operators = used to connect two or more expressions

//         ? && = (AND) both conditions must be true
//         ? || = (OR) either condition must be true
//         ? ! = (NOT) reverses boolean value of condition

//         int temp = 35;

//         if (temp > 30) {
//             System.out.println("It is HOT outside!");
//         }
//         else if (temp >= 20 && temp <= 30) {
//             System.out.println("It feels nice outside!");
//         }
//         else {
//             System.out.println("Brrr... Its cold outside!");
//         }
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("You are playing a game. Press q or Q to quit");
//         String response = scanner.next();

//         if (!response.equals("q") && !response.equals("Q")) {
//             System.out.println("You still want to play the game");
//         }
//         else {
//             System.out.println("You quit the game");
//         }
//         scanner.close();
//     }
// }

//? Object Oriented Programming ?//
// public class Main {
//     public static void main(String[] args) {
//         // object - an instance of a class that may contain attributes and methods
//         Car myCar1 = new Car();
//         Car myCar2 = new Car();

//         System.out.println(myCar1.make);
//         System.out.println(myCar1.model);
//         System.out.println();
//         System.out.println(myCar2.make);
//         System.out.println(myCar2.model);
//         //myCar.drive();
//         //myCar.brake();

//         // System.out.println(myCar2.make);
//         // System.out.println(myCar2.model);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//          constructor - special method that is called when an object is instantiated (or created)
//         Human human = new Human("Garrett", 32, 210);
//         Human human2 = new Human("Angelica", 34, 200);
//         System.out.println(human.name);
//         System.out.println(human2.name);
//         human2.drink();
//         human.eat();
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         local = declared inside a method and visible only to that method
//         global = declared outside a method, but within a class, and visible to all parts of a class

//         DiceRoller diceRoller = new DiceRoller();

//     }
// }

// public class Main {
//     public static void main(String[] args) {

//          overloaded constructors = multiple constructors within a class with the same name, but have different parameters.
//          Name + Parameters = Signature

//         Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");

//         System.out.println("Here are the ingredients for your pizza: ");
//         System.out.println(pizza.bread);
//         System.out.println(pizza.sauce);
//         System.out.println(pizza.cheese);
//         System.out.println(pizza.topping);
//     }
// }

// public class Main { // toString method
//     public static void main(String[] args) {

//          toString() = special method that all objects inherit, that returns a string that "textually represents" an object.
//          Can be used both implicitly and explicitly.

//         Car car = new Car();

//         System.out.println(car);
//          System.out.println(car.toString());
//          System.out.println(car.make);
//          System.out.println(car.model);
//          System.out.println(car.color);
//          System.out.println(car.year);

//     }
// }

// public class Main { // Arrays of objects
//     public static void main(String[] args) {

//          int[] numbers = new int[3];
//          char[] characters = new char[4];
//          String[] strings = new String[5];

//          Food[] refrigerator = new Food[3];

//         Food food1 = new Food("pizza");
//         Food food2 = new Food("hamburger");
//         Food food3 = new Food("hotdog");

//         Food[] refrigerator = { food1, food2, food3 };

//          // refrigerator[0] = food1;
//          // refrigerator[1] = food2;
//          // refrigerator[2] = food3;

//         System.out.println(refrigerator[0].name);
//         System.out.println(refrigerator[1].name);
//         System.out.println(refrigerator[2].name);

//     }
// }
//?Inheritance ****************************//
// public class Main {
//     public static void main(String[] args) {

//         Car car = new Car();

//         car.go();

//         Bicycle bike = new Bicycle();

//         bike.stop();

//         System.out.println(car.doors);
//         System.out.println(bike.pedals);

//     }
// }

//? Abstraction *******************

// public class Main {
//     public static void main(String[] args) {

//          abstract = abstract classes cannot be instantiated, but they can have a subclass.
//          Abstract classes are declared without an implementation, can also have abstract methods that do not have a body

//         Vehicle vehicle = new Vehicle(); Cannot instantiate a instance of an abstract class... its too vague.
//         Car car = new Car();

//         car.go();

//     }
// }

//? Encapsulation //*********************
// public class Main {
//     public static void main(String[] args) {

//          encapsulation = attributes of a class will be hidden or private, can be accessed only through methods (getters & setters)
//          You should make attributes private if you dont have a reason to make them public or protected

//         Car car = new Car("Ford", "Mustang", 2021);
//         car.setYear(2000);
//         System.out.println(car.getMake());
//         System.out.println(car.getModel());
//         System.out.println(car.getYear());

//     }
// }

//? Polymorphism // ******************************
// public class Main {
//     public static void main(String[] args) {

//          polymorphism - greek word for poly-"many", morph-"form"
//          The ability of an object to identify as more than one type

//         Car car = new Car();
//         Bicycle bike = new Bicycle();
//         Boat boat = new Boat();

//         Vehicle[] racers = { car, bike, boat };

//         for (Vehicle x : racers) {
//             x.go();
//         }

//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         String name = "";

//         while (name.isBlank()) {
//             System.out.println("Enter your name: ");
//             name = scanner.nextLine();
//         }

//         System.out.println("Hello " + name);

//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         // for (int i = 10; i >= 0; i -= 2) {
//         //     System.out.println(i);
//         // }

//         for (int i = 3; i > 0; i--) {
//             System.out.println(i);
//         }

//         System.out.println("Happy New Year!");

//     }
// }

//? String Methods // ***********************
// public class Main {
//     public static void main(String[] args) {

//         String name = "     Garrett     ";
// boolean result = name.equalsIgnoreCase("GArreTt");
// int result = name.length();
// char result = name.charAt(0); this equals 'G'
// int result = name.indexOf("e"); returns the index of the given string or character
// boolean result = name.isEmpty(); is the name variable empty? returns true or false
// String result = name.toUpperCase(); name.toLowerCase();
//         String result = name.trim();
//         System.out.println(result);

//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         ArrayList<String> food = new ArrayList<String>();

//         food.add("pizza");
//         food.add("hamburger");
//         food.add("hotdog");

//         food.set(0, "sushi");

//         for (int i = 0; i < food.size(); i++) {
//             System.out.println(food.get(i));
//         }

//     }
// }

//? Pass objects as arguments to methods // ***********************
// public class Main {
//     public static void main(String[] args) {

//         Garage garage = new Garage();

//         Car car1 = new Car("Mustang");
//         Car car2 = new Car("Truck");

//         garage.park(car1);
//         garage.park(car2);

//         Cage cage = new Cage();

//         Animal animal1 = new Animal("Dog");
//         Animal animal2 = new Animal("Cat");

//         cage.put_in(animal1);
//         cage.put_in(animal2);
//         garage.park(animal1);


//     }
// }

//? Static keyword //
// public class Main {
//     public static void main(String[] args) {
//         // static = modifier. A single copy of a variable/method is created and shared.
//         // The class "owns" the static member

//         Friend friend1 = new Friend("Tex");
//         Friend friend2 = new Friend("Burke");
//         Friend friend3 = new Friend("Diego");
//         Friend friend4 = new Friend("Kado");

//         Friend.displayFriends();
//     }
// }

//? Super keyword //
// public class Main {
//     public static void main(String[] args) {
//          super = keyword refers to the superclass (parent) of an object
//          very similar to the "this" keyword

//         Hero hero1 = new Hero("Flash", 25, "Speed");
//         Hero hero2 = new Hero("Green Lantern", 37, "Ring harnessing 'will power'");

//         System.out.println(hero1.toString());
//         System.out.println(hero2.toString());
//     }
// }

//? Interface // ******************
// public class Main {
//     public static void main(String[] args) {
//          interface = a template that can be applied to a class.
//          similar to inheritance, but specifies what a class has/must do.
//          classes can apply more than one interface, inheritance is limited to 1 super

//         Rabbit rabbit = new Rabbit();
//         rabbit.flee();

//         Hawk hawk = new Hawk();
//         hawk.hunt();

//         Fish fish = new Fish();
//         fish.flee();
//         fish.hunt();

//     }
// }


public class Main {
    public static void main(String[] args) {
    }
}