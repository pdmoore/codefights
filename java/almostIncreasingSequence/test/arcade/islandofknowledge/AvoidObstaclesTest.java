package arcade.islandofknowledge;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvoidObstaclesTest {

    @Test
    public void ArrayIsSorted_ObstaclesAreAdjacent_LowEndOfRange_TwoObstacles() {
        int[] inputArray = new int[] { 2, 3 };
        assertEquals(4, avoidObstacles(inputArray));
    }

    @Test
    public void ArrayIsSorted_ObstaclesAreAdjacent_LowEndOfRange_ThreeObstacles() {
        int[] inputArray = new int[] { 2, 3, 4 };
        assertEquals(5, avoidObstacles(inputArray));
    }

    @Test
    @Disabled
    public void ArrayIsSorted_ObstaclesAreAdjacent_HighEndOfRange_TwoObstacles() {
        int[] inputArray = new int[] { 9, 10 };
        assertEquals(4, avoidObstacles(inputArray));
    }

    private int avoidObstacles(int[] inputArray) {

        // array is sorted & adjacent
        List<Integer> obstacles = Arrays.stream(inputArray).boxed().collect(Collectors.toList());

        int jumpLength = 2;
        while (jumpLength <= 10) {
            if (!anyObstacles(obstacles, jumpLength)) return jumpLength;
            jumpLength++;
        }
        return jumpLength;
    }

    private boolean anyObstacles(List<Integer> obstacles, int jumpLength) {
        while (jumpLength <= 10) {
            if (obstacles.contains(jumpLength)) return true;
            jumpLength += jumpLength;
        }
        return false;
    }
}
