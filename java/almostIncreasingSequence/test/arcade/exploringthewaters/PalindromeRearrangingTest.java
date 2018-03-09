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

    @Test
    public void ManyOfSameLetterButTwoSingleLetters_IsNotAPalindrome() {
        String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        assertFalse(palindromeRearranging(input));
    }

    @Test
    public void ManyDuplcatedLettersWithOneSingleLetter_IsAPalindrome() {
        String input = "abbcabb";
        assertTrue(palindromeRearranging(input));
    }

    @Test
    public void NoSingleLetters_MustBeAPalindrome() {
        String input = "aabb";
        assertTrue(palindromeRearranging(input));
    }

    private boolean palindromeRearranging(String inputString) {
        if (inputString.length() == 1) return true;

        Map<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char key = inputString.charAt(i);
            int countOfThisLetter = 1;
            if (letterCount.containsKey(key)) {
                countOfThisLetter = letterCount.get(key);
                countOfThisLetter++;
            }
            letterCount.put(key, countOfThisLetter);
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
