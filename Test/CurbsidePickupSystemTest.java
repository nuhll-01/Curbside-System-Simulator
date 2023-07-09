import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CurbsidePickupSystemTest {
    @Test
    public void checkNumber() {
        assertEquals(123, 123);
    }

    @Test
    public void incompleteTest() { // This test will fail.
        fail("Not yet completed");
    }


    public int randomInteger() {
        return (int) (Math.random() * 6);
    }

    @Test
    public void testingCondition() {
        int number = 5;
        if (randomInteger() != number) {
            fail("The number is not 5");
        }
        // more testing code
    }
}
