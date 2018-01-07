package arcade.smoothsailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLuckyTest {

    @Test
    public void simple_Equals() {
        int input = 11;
        assertTrue(isLucky(input));
    }

    @Test
    public void simple_NotEquals() {
        int input = 10;
        assertFalse(isLucky(input));
    }

    @Test
    public void longer_Equals() {
        int input = 1230;
        assertTrue(isLucky(input));
    }

    private boolean isLucky(int input) {
        String inputAsString = "" + input;
        String firstHalf = inputAsString.substring(0, inputAsString.length() / 2);
        String secondHalf = inputAsString.substring((inputAsString.length() / 2));

        return sumOfDigits(firstHalf) == sumOfDigits(secondHalf);
    }

    private int sumOfDigits(String digits) {
        int sum = 0;
        for (int i = 0; i < digits.length(); i ++) {
            sum += Integer.parseInt("" + digits.charAt(i));
        }
        return sum;
    }
}
