public class Person {

    private final String firstName;
    private final String lastName;

    // Standard-Default Constructor
    public Person() {
        this(null, null);
    }

    // Specifying Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Possible backup methods

    // public String getFirstName() { return this.firstName; }

    // public String getLastName() { return this.lastName; }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }




}
