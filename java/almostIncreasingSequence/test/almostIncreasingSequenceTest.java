import com.pdm.codefights.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class almostIncreasingSequenceTest {

    // Need to see that more than one test works

    @Test
    public void sequenceOfTwoElementsIsAlwaysIncreasing() {
        int[] sequence = new int[] { 1, 1 };
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);
    }

    @Test
    public void sequenceOfIncreasingElementsIsIncreasing() {
        int[] sequence = new int[] { 1, 2, 3 };
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);
    }

    @Test
    public void sequenceWithJustOneAnamolyIsIncreasing() {
        int[] sequence = new int[] { 1, 2, 99, 3 };
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);
    }
}
