/* The main class behind the concept of the program.
This class is meant to model a very basic curbside pickup system
The class introduces the main method that I've created - the "search" method. */

public class CurbsidePickupSystem extends CustomerInformation {
    private final Items ITEM = new Items(); // Represents the item
    Customer customer = new Customer(); // Represents the customer
    OrderNumber orderNumber = new OrderNumber(); // OrderNumber Object

    public CurbsidePickupSystem() {
        super();
    }

    public void search(int key) {
        importElements();
        for (int i = 0; i < orderNumber.getSize(); i++) {
            if (key != orderNumber.getOrder(i)) {
                displayDetails(i);
            }
        }
    }

    public void displayDetails(int index) {
        super.listOfCustomers();
        System.out.println("""
                \n--------------
                ORDER SUMMARY:
                --------------""");
        System.out.println("\nOrder Number: " + orderNumber.getOrder(index));
        customer = super.getCustomer(index);
        customer.displayCustomerDetails();
        ITEM.displayDetails(index);
    }

    private void importElements() {
        orderNumber.getNumber(); // Brings elements into scope from OrderNumber.java class file.
    }

    public void exit() {
        System.exit(0);
    }
}