package arcade.exploringthewaters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlternatingSumsTest {

    @Test
    void oneOfEach() {
        int[] input = new int[] {100, 50};
        int[] expected = new int[] {100, 50};
        assertArrayEquals(expected, alternatingSums(input));
    }

    private int[] alternatingSums(int[] input) {
        return input;
    }
}
