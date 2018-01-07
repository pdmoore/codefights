package arcade.smoothsailing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortByHeightTest {

    @Test
    public void testAllTrees() {
        int[] input    = new int[] {-1, -1, -1, -1};
        int[] expected = new int[] {-1, -1, -1, -1};
        assertArrayEquals(expected, sortByHeight(input));
    }

    @Test
    public void testNoTrees_SortAscending() {
        int[] input    = new int[] {4, 2, 9, 11, 2, 16};
        int[] expected = new int[] {2, 2, 4, 9, 11, 16};
        assertArrayEquals(expected, sortByHeight(input));
    }

    @Test
    public void testSomeTreesRemainInPlace_RemainingNumbersSortBetweenTrees() {
        int[] input    = new int[] {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] expected = new int[] {-1, 150, 160, 170, -1, -1, 180, 190};
        assertArrayEquals(expected, sortByHeight(input));
    }

    private int[] sortByHeight(int[] input) {
        int[] justHeights = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] != -1) justHeights[i] = input[i];
        }

        Arrays.sort(justHeights);
        int nextHeight = 0;
        while ((nextHeight < justHeights.length) && (justHeights[nextHeight] == 0) ) {
            nextHeight++;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] != -1) input[i] = justHeights[nextHeight++];
        }

        return input;
    }

}
