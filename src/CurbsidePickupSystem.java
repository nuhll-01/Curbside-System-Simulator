import java.util.ArrayList;

public class CurbsidePickupSystem extends Customer {
    private ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.
    private ArrayList<Integer> orderNumber = new ArrayList<>(); // ArrayList of order numbers.
    private Items item = new Items();

    public CurbsidePickupSystem() {
        super();
    }

    public void search(int x) {
        getOrder();
        ArrayList<Customer> customers = this.customer;
        for (int i = 0; i < orderNumber.size(); i++) {
            if (orderNumber.get(i) == x) {
                displayDetails(i);
            }
        }
    }

    public void getOrder() {
        orderNumber.add(9564);
        orderNumber.add(4128);
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
