// Driver class for the curbside pickup program.

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurbsidePickupDriver {
    public static void main(String[] args) {
        // Down below is the utilization object for the primary CurbsidePickupSystem class
        // Which essentially runs the main task of simulating a simple but "real life" curbside pickup system.
        CurbsidePickupSystem curbsidePickupSystem = new CurbsidePickupSystem(); // CurbsidePickupSystem Object
        Scanner stdIn = new Scanner(System.in);

        int userInput, orderNumber;
        boolean tryAgain = true;
        System.out.println("Welcome to the Toasty Hardware shop!");
        System.out.println("------------------------------------");

        while (tryAgain) {
            try {
                do {
                    System.out.print("Menu - Search Order --> 1 | Exit  --> 2 |: ");
                    userInput = stdIn.nextInt();
                    if (userInput == 1) {
                        System.out.print("Search Order Number: ");
                        orderNumber = stdIn.nextInt();
                        for (int i = 0; i < 1; i++) {
                            System.out.println("\nSearching...");
                            Thread.sleep(1000);
                            System.out.println("Retrieving Order...");
                            Thread.sleep(1000);
                        }
                        curbsidePickupSystem.search(orderNumber);
                    } else if (userInput == 2) {
                        curbsidePickupSystem.exit();
                    } else {
                        System.out.println("Invalid Command." + "\n");
                    }
                } while (userInput < 1 || userInput > 2);
                tryAgain = false;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid Input." + "\n");
                stdIn.next(); // consume the invalid input
            } catch (InterruptedException interruptedException) {
                throw new RuntimeException(interruptedException);
            }
        }
    }
}