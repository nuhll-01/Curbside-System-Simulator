import java.util.ArrayList;

public class CustomerInformation extends Customer {
    private final ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.

    protected void listOfCustomers() {
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
}
