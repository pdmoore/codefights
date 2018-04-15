package arcade.islandofknowledge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMaximalAdjacentDifferenceTest {

    @Test
    public void AllElementsTheSame_DifferenceIsZero() {
        int[] inputArray = new int[] { 1, 1, 1, 1 };
        assertEquals(0, arrayMaximalAdjacentDifference(inputArray));
    }

    private int arrayMaximalAdjacentDifference(int[] inputArray) {
        return 0;
    }
}
