
public class Customer extends Person {

    private String customerAddress;
    private String customerEmail;
    private long customerPhoneNumber;

    public Customer() {
        super();
    }

    public Customer(String name, String address, String email, long phoneNumber) {
        super(name);
        this.customerAddress = address;
        this.customerEmail = email;
        this.customerPhoneNumber = phoneNumber;
    }

    public String getName() {
        return super.toString();
    }

    public String getAddress() {
        return this.customerAddress;
    }

    public String getEmail() {
        return this.customerEmail;
    }

    public long getPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void displayCustomerDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email Address: " + getEmail());
    }
}
