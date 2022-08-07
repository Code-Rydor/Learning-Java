// import java.util.Scanner;
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
import javax.swing.JOptionPane;
// GUI - JOptionPane Class
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello, " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old! Wow");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " feet tall! You're a beast!");
    }
}