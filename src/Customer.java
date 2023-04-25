
public class Customer extends Person {

    private String address;
    private String email;
    private long number;

    public Customer() {
        super();
    }

    public Customer(String firstName, String lastName, String address, String email, long phoneNumber) {
        super(firstName, lastName);
        this.address = address;
        this.email = email;
        this.number = phoneNumber;
    }

    public String getName() {
        return super.toString();
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return this.number;
    }

    public void displayCustomerDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email Address: " + getEmail());
    }
}
