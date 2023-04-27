import java.util.ArrayList;

public class CurbsidePickupSystem extends Customer {

    private final ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.
    private final ArrayList<Integer> orderNumber = new ArrayList<>(); // ArrayList of order numbers.
    private final Items item = new Items();
    Customer customerEntity = new Customer();

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

    public void displayDetails(int index) {
        listOfCustomers();
        System.out.println("""
                                
                ORDER SUMMARY:
                --------------""");
        System.out.println("\nOrder Number: " + orderNumber.get(index));
        customerEntity = getCustomer(index);
        customerEntity.displayCustomerDetails();
        item.displayDetails(index);
    }

    private void listOfCustomers() {
        customer.add(new Customer("Luis", "Ramirez", "5555 S 10th St",
                "WadzWorth53@domain.com", 5553322244L));
        customer.add(new Customer("Bob", "Pickle", "5555 S 63rd St",
                "pickle555@domain.com", 5551112233L));
        customer.add(new Customer("Erin", "Nut", "5555 s 75th St",
                "Erin53@example.com", 5553337575L));
    }

    public Customer getCustomer(int index) {
        return customer.get(index);
    }

    public void exit() {
        System.exit(0);
    }
}