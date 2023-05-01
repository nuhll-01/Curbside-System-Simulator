import java.util.ArrayList;

public class CustomerInformation extends Customer {
    FirstName firstName = new FirstName();
    LastName lastName = new LastName();
    private final ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.

    protected void listOfCustomers() {
        customer.add(new Customer(firstName.getRandomName(), lastName.getRandomName(), "5555 S 10th St",
                "WadzWorth53@domain.com", getPhoneNumber()));
        customer.add(new Customer(firstName.getRandomName(), lastName.getRandomName(), "5555 S 63rd St",
                "pickle555@domain.com", getPhoneNumber()));
        customer.add(new Customer(firstName.getRandomName(), lastName.getRandomName(), "5555 s 75th St",
                "Erin53@example.com", getPhoneNumber()));
        customer.add(new Customer(firstName.getRandomName(), lastName.getRandomName(), "5555 s 24th St",
                "Myers71@example.com", getPhoneNumber()));
        customer.add(new Customer(firstName.getRandomName(), lastName.getRandomName(), "5555 s 56th St",
                "Jose53@example", getPhoneNumber()));
    }

    // This method generates a random phone number.
    private String randomPhoneNumber() {
        int digitLength = 10; // Max length of the phone number.
        long generateNumber = (long) (Math.random() * Math.pow(10, digitLength)); // Generates a random number.
        String generatedNumber = String.valueOf(generateNumber); // Converts the long to a string.
        return generatedNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"); // Formats the string.
    }

    public String getPhoneNumber() {
        return randomPhoneNumber();
    }

    public Customer getCustomer(int index) {
        return customer.get(index);
    }
}
