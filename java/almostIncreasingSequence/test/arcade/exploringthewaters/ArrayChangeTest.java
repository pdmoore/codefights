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

    @Test
    public void SequenceHasNegativeValueElementThatNeedsToIncrease() {
        int[] inputArray = new int[] { 0, -2 };
        assertEquals(3, arrayChange(inputArray));
    }

    @Test
    public void SequenceHasTwoElementsThatIncrease() {
        int[] inputArray = new int[] { 1, 1, 1 };
        assertEquals(3, arrayChange(inputArray));
    }

    @Test
    public void SequenceHasTwoElementsThatIncrease_OneIsNegativeToStartWith() {
        int[] inputArray = new int[] { -1000, 0, -2, 0 };
        assertEquals(5, arrayChange(inputArray));
    }

    @Test
    public void SequenceHasTwoElementsThatIncrease_LargeDifferenceForFinalElement() {
        int[] inputArray = new int[] { 2, 1, 10, 1 };
        assertEquals(12, arrayChange(inputArray));
    }

    @Test
    public void SequenceHasManyElementsThatIncrease() {
        int[] inputArray = new int[] { 2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15 };
        assertEquals(13, arrayChange(inputArray));
    }

    private int arrayChange(int[] inputArray) {
        int moves = 0;
        int previousValue = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] <= inputArray[i - 1]) {
                moves += Math.abs(inputArray[i] - inputArray[i - 1]) + 1;
                inputArray[i] = inputArray[i - 1] + 1;
            }
        }

        return moves;
    }
}
