package arcade.exploringthewaters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

    @Test
    public void FourLetterStringWithNoSameLetters_IsNotAPalindrome() {
        String input = "abca";
        assertFalse(palindromeRearranging(input));
    }

    private boolean palindromeRearranging(String inputString) {
        if (inputString.length() == 1) return true;

        Map<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (letterCount.containsKey(inputString.charAt(i))) {
                int countOfThisLetter = letterCount.get(inputString.charAt(i));
                countOfThisLetter++;
                letterCount.put(inputString.charAt(i), countOfThisLetter);
            } else {
                letterCount.put(inputString.charAt(i), 1);
            }
        }

        int numbereOfSingleCharacters = 0;
        for (Character letter :
                letterCount.keySet()) {
            if (letterCount.get(letter) == 1) {
                numbereOfSingleCharacters++;
            }
        }
        return (numbereOfSingleCharacters <= 1);
    }
}
