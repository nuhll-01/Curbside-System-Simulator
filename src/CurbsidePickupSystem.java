import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
The main class behind the concept of the program.
This class is meant to model a very basic curbside pickup system
The class introduces the main method that I've created - the "search" method.
*/

public class CurbsidePickupSystem extends CustomerInformation {
    private final Items ITEM = new Items(); // Represents the item
    Customer customer = new Customer(); // Represents the customer
    OrderNumber orderNumber = new OrderNumber(); // OrderNumber Object

    public CurbsidePickupSystem() {
        super();
    }

    private void importElements() {
        orderNumber.insertNumber(); // Brings elements into scope from OrderNumber.java class file.
    }

    public void search(int key) { // Search method that searches for the order number.
        importElements();
        for (int i = 0; i < orderNumber.getSize(); i++) { // Iterates through the ArrayList to find the order number.
            if (key == orderNumber.numberAt(i)) {
                System.out.println("\nOrder Found!");
                display(i);
                break;
            }

            /*
             Breaks out of the loop once the order number is found.
             This fixes a bug in which upon finding the order number,
             following the execution of 'display', the loop iterates again
             with our original input but increments 'i', therefore, rendering
             the first condition of the 'if-statement', 'True' and executing that body of code.
             The bug displays unnecessary information. Fixed on 7/06/2023.
             */
        }
    }

    public void display(int index) { // Displays the order summary.
        listOfCustomers(); // Brings elements into scope from CustomerInformation.java class file.
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);
        System.out.println("\n============================ Receipt =============================");
        System.out.println("\nDate: " + formattedDate);
        System.out.println("Order Number: " + orderNumber.numberAt(index));
        customer = super.getCustomer(index);
        customer.displayCustomerDetails();
        ITEM.displayDetails(index);
        System.out.println("\n================================================================");
    }

    public boolean checkLength(int input) {
        String inputNumber = String.valueOf(input); // Converts the input to a String.
        String inputLength = Integer.toString(inputNumber.length()); // Converts the length of the input to a String.
        int inputLengthInt = Integer.parseInt(inputLength); // Converts the length of the input to an Integer.
        return inputLengthInt != 6;
    }

    public void exit() {
        System.exit(0);
    }
}