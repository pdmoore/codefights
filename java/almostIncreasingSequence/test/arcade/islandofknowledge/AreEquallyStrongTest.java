package arcade.islandofknowledge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AreEquallyStrongTest {

    @Test
    public void StrongArmsMatch_WeakArmsDoNot() {
        assertFalse(areEquallyStrong(15, 10, 15, 9));
    }

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return false;
    }
}
