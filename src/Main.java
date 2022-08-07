import java.util.Scanner;

import javax.swing.plaf.TreeUI;
import javax.xml.namespace.QName;

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

public class Main {
    public static void main(String[] args) {
        
    }
}