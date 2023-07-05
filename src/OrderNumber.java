import java.util.ArrayList;

public class OrderNumber {
    private final ArrayList<Integer> ORDER_NUMBER = new ArrayList<>(); // ArrayList of order numbers.

    public OrderNumber() {
        super();
    }

    protected void getNumber() { // Adds order numbers to the ArrayList.
        ORDER_NUMBER.add(956487);
        ORDER_NUMBER.add(412835);
        ORDER_NUMBER.add(507898);
        ORDER_NUMBER.add(345511);
        ORDER_NUMBER.add(658901);
        ORDER_NUMBER.add(123456);
    }

    public int getSize() {
        return ORDER_NUMBER.size();
    }

    public int getOrder(int index) {
        return ORDER_NUMBER.get(index);
    }
}
