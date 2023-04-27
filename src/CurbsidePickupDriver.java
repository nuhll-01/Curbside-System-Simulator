import java.util.Scanner;

public class CurbsidePickupDriver {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        CurbsidePickupSystem curbsidePickupSystem = new CurbsidePickupSystem();

        int userInput;
        System.out.println("Welcome to the Toasty Hardware shop!");
        System.out.println("----------------------------------");

        do {
            System.out.print("Menu - Search Order --> 1 | Exit  --> 2 |: ");
            userInput = stdIn.nextInt();
            if (userInput == 1) {
                System.out.print("\nSearch Order Number: ");
                curbsidePickupSystem.search(stdIn.nextInt());
            } else if (userInput == 2) {
                curbsidePickupSystem.exit();
            } else {
                System.out.println("\nInvalid Command.");
                System.out.println();
            }
        } while (userInput < 1 || userInput > 2);
    }
}