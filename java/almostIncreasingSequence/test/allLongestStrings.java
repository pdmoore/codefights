import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class allLongestStrings {

    private String[] allLongestStrings(String[] inputArray) {

        Map<Integer, List<String>> stringsByLength = new HashMap<>();
        int lengthiest = 0;
        for (String s :
                inputArray
             ) {
            int length = s.length();
            if (length > lengthiest) lengthiest = length;

            if (stringsByLength.containsKey(length)) {
                stringsByLength.get(length).add(s);
            } else {
                List<String> stringsOfLength = new ArrayList<>();
                stringsOfLength.add(s);
                stringsByLength.put(length, stringsOfLength);
            }
        }
        return stringsByLength.get(lengthiest).toArray(new String[0]);
    }

    @Test
    public void singleElement_JustDisplayIt() {
        String[] inputArray = new String[] { "aa" };        // test 2
        String[] actual = allLongestStrings(inputArray);
        assertArrayEquals(inputArray, actual);
    }

    @Test
    public void multipleStringsWithDifferentLengths() {
        String[] inputArray = new String[] { "aba", "aa", "ad", "vcd", "aba" };  // test 1
        String[] expected   = new String[] { "aba", "vcd", "aba" };
        String[] actual = allLongestStrings(inputArray);
        assertArrayEquals(expected, actual);

        inputArray = new String[] { "abc", "eeee", "abcd", "dcd" };  // test 3
        expected   = new String[] { "eeee", "abcd" };
        actual = allLongestStrings(inputArray);
        assertArrayEquals(expected, actual);

        inputArray = new String[] { "a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa" };  // test 3
        expected   = new String[] { "zzzzzz", "abcdef", "aaaaaa" };
        actual = allLongestStrings(inputArray);
        assertArrayEquals(expected, actual);
    }


}
