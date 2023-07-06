import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

public class CustomerInformation extends Customer {
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

    /*
    We generate a random first name and store it onto the variable "firstName."
    We do this because we want to use that same first name for the customer email.
    If were to exclude the action of storing the value of the generated name onto a variable,
    We would end up with two different instances of random names therefore causing the customer email to be different from the customers name.
    */

    private final Random random = new Random();
    private final ArrayList<Customer> customer = new ArrayList<>(); // ArrayList of customers.

    public CustomerInformation() {
        super();
    }

    protected void listOfCustomers() {
        customer.add(new Customer(generateFName(), generateLName(), generateAddress(),
                getEmail(generateFName().toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(generateFName(), generateLName(), generateAddress(),
                getEmail(generateFName().toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(generateFName(), generateLName(), generateAddress(),
                getEmail(generateFName().toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(generateFName(), generateLName(), generateAddress(),
                getEmail(generateFName().toLowerCase()), getPhoneNumber()));
        customer.add(new Customer(generateFName(), generateLName(), generateAddress(),
                getEmail(generateFName().toLowerCase()), getPhoneNumber()));
    }

    // Generates a random number.
    private @NotNull String generateNumber() {
        int digitLength = 10; // Max length of the phone number.
        long generateNumber = (long) (Math.random() * Math.pow(10, digitLength)); // Generates a random number.
        String generatedNumber = String.valueOf(generateNumber); // Converts the long to a string.
        return generatedNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"); // Formats the string.
    }

    private @NotNull String generateFName() {
        int index = (int) (Math.random() * FIRST_NAMES.length);
        return FIRST_NAMES[index];
    }

    public @NotNull String generateAddress() {
        return houseNumber() + " " + cardinalDirection() + " " + streetNumber() + "St " + zipCode();
    }

    private @NotNull String generateLName() {
        int index = (int) (Math.random() * LAST_NAMES.length);
        return LAST_NAMES[index];
    }

    public @NotNull String getPhoneNumber() {
        return generateNumber();
    }

    public String getEmail(String firstName) {
        return firstName + "@example.com";
    }

    public @NotNull String houseNumber() {
        int fourDigitNumber = random.nextInt(0, 10000);
        return String.valueOf(fourDigitNumber);
    }

    public @NotNull String cardinalDirection() {
        String[] cardinalDirection = {"N", "S", "E", "W"};
        int index = (int) (Math.random() * cardinalDirection.length);
        return cardinalDirection[index];
    }

    public @NotNull String streetNumber() {
        int streetNumb = random.nextInt(0, 100); // Generates a random number between 0 and 100.
        return String.valueOf(streetNumb);
    }

    public @NotNull String zipCode() {
        int zipCode = random.nextInt(0, 10000); // Generates a random number between 0 and 10000.
        return String.valueOf(zipCode);
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
