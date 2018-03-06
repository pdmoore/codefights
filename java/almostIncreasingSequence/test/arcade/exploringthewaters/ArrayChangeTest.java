package arcade.exploringthewaters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayChangeTest {

    @Test
    public void SequenceIsAlreadyIncreasing_ZeroMoves() {
        int[] inputArray = new int[] { 1, 2, 3 };
        Assertions.assertEquals(0, arrayChange(inputArray));

    }

    private int arrayChange(int[] inputArray) {
        return 0;
    }
}
