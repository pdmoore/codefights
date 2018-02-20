package arcade.exploringthewaters;

import org.junit.jupiter.api.Test;

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
        result[0] = "***";
        result[1] = "*" + input[0] + "*";
        result[2] = "***";
        return result;
    }
}
