package arcade.islandofknowledge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsIPV4AddressTest {

    @Test
    public void ValidAddress() {
        assertTrue(isIPv4Address("172.16.254.1"));
    }

    @Test
    public void InvalidAddress_ElementExceedsMaximum() {
        assertFalse(isIPv4Address("172.316.254.1"), "Elements should be in range 0..255");
    }

    private boolean isIPv4Address(String inputString) {
        String[] elements = inputString.split("\\.");
        for (String element : elements) {
            if (Integer.parseInt(element) > 255) return false;
        }
        return true;
    }
}
