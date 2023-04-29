import java.util.ArrayList;

public class orderNumbers {

    private final ArrayList<Integer> orderNumber = new ArrayList<>(); // ArrayList of order numbers.

    protected void setOrderNumber() {
        orderNumber.add(956487);
        orderNumber.add(412835);
        orderNumber.add(507898);
        orderNumber.add(345511);
        orderNumber.add(658901);
    }

    public int getSize() {
        return orderNumber.size();
    }

    public int getOrder(int index) {
        return orderNumber.get(index);
    }

}
