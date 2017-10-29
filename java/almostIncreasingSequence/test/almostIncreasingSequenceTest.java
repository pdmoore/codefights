import com.pdm.codefights.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class almostIncreasingSequenceTest {

    // Need to see that more than one test works

    @Test
    public void sequenceOfTwoElementsIsAlwaysIncreasing() {
        int[] sequence = new int[] { 1, 1 };    // Test 10
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);
    }

    @Test
    public void sequenceOfIncreasingElementsIsIncreasing() {
        int[] sequence = new int[] { 1, 2, 3 };
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);

        sequence = new int[] { 123, -17, -5, 1, 2, 3, 12, 43, 45 }; // Test 16
        actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);
    }

    @Test
    public void sequenceWithJustOneAnomalyIsIncreasing() {
        int[] sequence = new int[] { 1, 3, 2 }; // Test 2
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);

        sequence = new int[] { 1, 2, 3, 4, 3, 6 };  // Test 14
        actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);

        sequence = new int[] { 1, 2, 3, 4, 99, 5, 6 };  // Test 15
        actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);

        sequence = new int[] { 3, 5, 67, 98, 3 };  // Test 17
        actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);
    }

    @Test
    public void sequenceWithMoreThanTwoOfSameValueIsNotIncreasing()
    {
        int[] sequence = new int[] {1, 1, 1, 2, 3}; // Test 6
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(false, actual);

        sequence = new int[] { 1, 2, 5, 5, 5 }; // Test 12
        actual = Main.almostIncreasingSequence(sequence);
        assertEquals(false, actual);
    }

}
