package arcade.islandofknowledge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsIPV4AddressTest {

    @Test
    public void ValidAddress() {
        assertTrue(isIPv4Address("172.16.254.1"));
    }

    private boolean isIPv4Address(String inputString) {
        return true;
    }
}
