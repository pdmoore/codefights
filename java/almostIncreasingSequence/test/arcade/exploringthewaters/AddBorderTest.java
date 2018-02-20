package arcade.exploringthewaters;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddBorderTest {

    @Test
    public void BorderAroundSingleCharacter() {
        String[] input = new String[] { "a" };
        String[] expected = new String[] { "***", "*a*", "***" };

        assertArrayEquals(expected, addBorder(input));

    }

    private String[] addBorder(String[] input) {
        String[] result = new String[input.length + 2];
        result[0] = addOuterBorder(input[0].length());
        result[1] = "*" + input[0] + "*";
        result[2] = addOuterBorder(input[0].length());
        return result;
    }

    private String addOuterBorder(int length) {
        char[] result = new char[length + 2];
        Arrays.fill(result, '*');
        return new String(result);
    }
}
