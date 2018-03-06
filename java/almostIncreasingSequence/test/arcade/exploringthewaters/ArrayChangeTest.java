package arcade.exploringthewaters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayChangeTest {

    @Test
    public void SequenceIsAlreadyIncreasing_ZeroMoves() {
        int[] inputArray = new int[] { 1, 2, 3 };
        assertEquals(0, arrayChange(inputArray));
    }

    @Test
    public void SequenceOneElementNeedsToIncreaseByOne_OneMove() {
        int[] inputArray = new int[] { 1, 1 };
        assertEquals(1, arrayChange(inputArray));
    }

    private int arrayChange(int[] inputArray) {
        int moves = 0;
        int previousValue = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= inputArray[i - 1]) {
                moves += inputArray[i] - inputArray[i - 1] + 1;
            }
        }

        return moves;
    }
}
