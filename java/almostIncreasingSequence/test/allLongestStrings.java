import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class allLongestStrings {

    private String[] allLongestStrings(String[] inputArray) {
        return inputArray;
    }

    @Test
    public void singleElement_JustDisplayIt() {
        String[] inputArray = new String[] { "aa" };
        String[] actual = this.allLongestStrings(inputArray);
        assertEquals(inputArray, actual);
    }


}
