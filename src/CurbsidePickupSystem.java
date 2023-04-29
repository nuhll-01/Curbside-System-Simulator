/* The main class behind the concept of the program.
This class is meant to model a very basic curbside pickup system
The class introduces the main method that I've created - the "search" method. */

public class CurbsidePickupSystem extends CustomerInformation {

    private final Items item = new Items(); // Items Object
    Customer customerEntity = new Customer(); // Customer Object
    orderNumbers customerOrderNumber = new orderNumbers(); // OrderNumber Object

    public CurbsidePickupSystem() {
        super();
    }

    public void search(int orderNumber) {
        // Calling the list of order numbers to allow the search method to iterate through the list.
        customerOrderNumber.setOrderNumber();
        for (int i = 0; i < customerOrderNumber.getSize(); i++) {
            if (orderNumber == customerOrderNumber.getOrder(i)) {
                displayDetails(i);
            }
        }
    }

    public void displayDetails(int index) {
        super.listOfCustomers();
        System.out.println("""
                                
                ORDER SUMMARY:
                --------------""");
        System.out.println("\nOrder Number: " + customerOrderNumber.getOrder(index));
        customerEntity = super.getCustomer(index);
        customerEntity.displayCustomerDetails();
        item.displayDetails(index);
    }

    public void exit() {
        System.exit(0);
    }
}