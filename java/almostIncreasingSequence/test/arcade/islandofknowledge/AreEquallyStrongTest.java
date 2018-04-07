package arcade.islandofknowledge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AreEquallyStrongTest {

    @Test
    public void BothArmsAreSame() {
        assertTrue(areEquallyStrong(10, 15, 10, 15));
    }

    @Test
    public void StrongArmsMatch_WeakArmsDoNot() {
        assertFalse(areEquallyStrong(15, 10, 15, 9));
    }



    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return yourLeft + yourRight == friendsLeft + friendsRight;
    }
}
