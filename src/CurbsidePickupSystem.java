import java.util.ArrayList;

public class CurbsidePickupSystem extends Customer {
    public final ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.
    private final ArrayList<Integer> orderNumber = new ArrayList<>(); // ArrayList of order numbers.
    private final Items item = new Items();

    public CurbsidePickupSystem() {
        super();
    }

    // Search for an order number
    public void search(int number) {
        orderNumbers();
        for (int i = 0; i < orderNumber.size(); i++) {
            if (number == orderNumber.get(i)) {
                displayDetails(i);
            }
        }
    }

    public void orderNumbers() {
        orderNumber.add(9564);
        orderNumber.add(4128);
        orderNumber.add(5078);
        orderNumber.add(3455);
        orderNumber.add(6589);
    }

    public void addCustomer(Customer customer) {
        this.customer.add(customer);
    }

    public void displayDetails(int index) {
        System.out.println("""
                                
                ORDER SUMMARY:
                --------------""");
        System.out.println("\nOrder Number: " + orderNumber.get(index));
        ArrayList<Customer> customers = this.customer;
        Customer customer = customers.get(index); // Utilization of a "for-each" loop.
        customer.displayCustomerDetails();
        item.displayDetails(index);
    }

    public void exit() {
        System.exit(0);
    }
}
