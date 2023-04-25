// Test Message by ToastyyX //
import java.util.Scanner;

public class CurbsidePickupDriver {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        Customer customer = new Customer("Luis", "Ramirez", "5555 S 10th St",
                "WadzWorth53@domain.com", 5553322244L);

        Customer customer2 = new Customer("Bob", "Pickle", "5555 S 63rd St",
                "pickle555@domain.com", 5551112233L);

        CurbsidePickupSystem curbsidePickupSystem = new CurbsidePickupSystem();
        curbsidePickupSystem.addCustomer(customer);
        curbsidePickupSystem.addCustomer(customer2);

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