package arcade.exploringthewaters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeRearrangingTest {

    @Test
    public void SingleCharacterString_IsAPalindrome() {
        String inputString = "z";
        assertTrue(palindromeRearranging(inputString));
    }

    @Test
    public void ThreeLetterStringWithTwoOfSameLetter_IsAPalindrome() {
        String input = "zaa";
        assertTrue(palindromeRearranging(input));
    }

    private boolean palindromeRearranging(String inputString) {
        return true;
    }
}
