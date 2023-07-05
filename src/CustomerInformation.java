import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public class CustomerInformation extends Customer {
    private final ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.

    /* We generate a random first name and store it onto the variable "firstName."
       We do this because we want to use that same first name for the customer email.
       If were to exclude the action of storing the value of the generated name onto a variable,
       We would end up with two different instances of random names therefore causing the customer email to be different from the customers name.
    */
    protected void listOfCustomers() {
        String firstName = generateFName();
        customer.add(new Customer(firstName, generateLName(), "5555 S 10th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, generateLName(), "5555 S 63rd St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, generateLName(), "5555 s 75th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, generateLName(), "5555 s 24th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(firstName, generateLName(), "5555 s 56th St",
                getEmail(firstName.toLowerCase()), getPhoneNumber()));
    }

    // Generates a random number.
    private @NotNull String randomPhoneNumber() {
        int digitLength = 10; // Max length of the phone number.
        long generateNumber = (long) (Math.random() * Math.pow(10, digitLength)); // Generates a random number.
        String generatedNumber = String.valueOf(generateNumber); // Converts the long to a string.
        return generatedNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"); // Formats the string.
    }

    public @NotNull String getPhoneNumber() {
        return randomPhoneNumber();
    }

    private final String[] FIRST_NAMES = {
            "Amelia",
            "Benjamin",
            "Chloe",
            "David",
            "Eleanor",
            "Felix",
            "Grace",
            "Henry",
            "Isla",
            "Jack",
            "Keira",
            "LeMi",
            "Noah",
            "Olivia",
            "Pepe",
            "Quinn",
            "Ruby",
            "Samuel",
            "Tessa"
    };

    private final String[] LAST_NAMES = {
            "Parker",
            "Garcia",
            "Patel",
            "Kim",
            "Singh",
            "Lopez",
            "Martin",
            "Bailey",
            "Nguyen",
            "Perez",
            "Robinson",
            "Torres",
            "Carter",
            "Gonzalez",
            "Phillips",
            "Wright",
            "Ramirez",
            "Stewart",
            "Davis",
    };

    private @NotNull String generateFName() {
        int index = (int) (Math.random() * FIRST_NAMES.length);
        return FIRST_NAMES[index];
    }

    private @NotNull String generateLName() {
        int index = (int) (Math.random() * LAST_NAMES.length);
        return LAST_NAMES[index];
    }


    public String getEmail(String firstName) {
        return firstName + "@example.com";
    }

    public Customer getCustomer(int index) {
        return customer.get(index);
    }


    private String[] getAllFirstNames() {
        return FIRST_NAMES;
    }

    private String[] getAllLastNames() {
        return LAST_NAMES;
    }
}
