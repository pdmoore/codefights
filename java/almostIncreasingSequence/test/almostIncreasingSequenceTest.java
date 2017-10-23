import com.pdm.codefights.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class almostIncreasingSequenceTest {

    @Test
    public void sequenceOfTwoElementsIsAlwaysIncreasing() {
        int[] sequence = new int[] { 1, 1 };
        boolean actual = Main.almostIncreasingSequence(sequence);
        assertEquals(true, actual);
    }
}
