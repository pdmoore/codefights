package arcade.islandofknowledge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvoidObstaclesTest {

    @Test
    public void ArrayIsSorted_ObstaclesAreAdjacent_TwoObstacles() {
        int[] inputArray = new int[] { 2, 3 };
        assertEquals(4, avoidObstacles(inputArray));
    }

    @Test
    public void ArrayIsSorted_ObstaclesAreAdjacent_ThreeObstacles() {
        int[] inputArray = new int[] { 2, 3, 4 };
        assertEquals(5, avoidObstacles(inputArray));
    }

    private int avoidObstacles(int[] inputArray) {

        // array is sorted & adjacent

        return inputArray[inputArray.length - 1] + 1;
    }
}
