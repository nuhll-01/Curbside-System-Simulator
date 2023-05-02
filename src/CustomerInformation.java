import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CustomerInformation extends Customer {
    private final FirstName firstName = new FirstName();
    private final LastName lastName = new LastName();
    private final ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.

    protected void listOfCustomers() {
        /* We generate a random first name and store it onto the variable "firstName."
           We do this because we want to use that same first name for the customer email.
           If were to exclude the action storing the value of the generated name onto a variable,
           We would end up with two different instances of random names therefore causing the customer email to be different from the customers name.
         */
        String firstName = this.firstName.generateRandomName();
        customer.add(new Customer(firstName, lastName.getRandomName(), "5555 S 10th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, lastName.getRandomName(), "5555 S 63rd St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, lastName.getRandomName(), "5555 s 75th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, lastName.getRandomName(), "5555 s 24th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, lastName.getRandomName(), "5555 s 56th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
    }

    // This method generates a random phone number.
    private @NotNull String randomPhoneNumber() {
        int digitLength = 10; // Max length of the phone number.
        long generateNumber = (long) (Math.random() * Math.pow(10, digitLength)); // Generates a random number.
        String generatedNumber = String.valueOf(generateNumber); // Converts the long to a string.
        return generatedNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"); // Formats the string.
    }

    public String getEmail(String firstName) {
        return firstName + "@example.com";
    }

    public String getPhoneNumber() {
        return randomPhoneNumber();
    }

    public Customer getCustomer(int index) {
        return customer.get(index);
    }
}
