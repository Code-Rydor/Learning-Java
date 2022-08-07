import java.util.Scanner;
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

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Tell me how many siblings you have: ");
        String siblings = scanner.nextLine();

        System.out.println("How many cousins do you have? ");
        String cousins = scanner.nextLine();

        System.out.println(
                "So you have " + siblings + " siblings and you have " + cousins + " cousins! Thats a big family!");
    }
}