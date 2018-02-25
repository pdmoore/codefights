package arcade.exploringthewaters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AreSimilarTest {

    @Test
    public void ArraysWithSameContent_AreSimilar() {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 1, 2, 3 };

        assertTrue(areSimilar(a, b));
    }

    @Test
    public void ArraysWithDifferentContent_AreNotSimilar() {
        int[] a = new int[] { 1, 2, 2 };
        int[] b = new int[] { 2, 1, 1 };

        assertFalse(areSimilar(a, b));
    }

    @Test
    public void ArraysWithSingleSwap_AreSimilar() {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 2, 1, 3 };

        assertTrue(areSimilar(a, b));
    }

    @Test
    public void LongerArrayWithSingleSwap_AreSimilar() {
        int[] a = new int[] { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
        int[] b = new int[] { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };

        assertTrue(areSimilar(a, b));
    }


    // if a[i] != b[i]
    // try swap a[i] with a[i+1]
    //   check if that is exactly similar with b, if it is, then similar is true
    //   if it is not
    //   try swap a[i] with a[i+2], etc
    private boolean areSimilar(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                for (int j = i + 1; j < a.length; j++) {
                    int[] a_withSwap = Arrays.copyOfRange(a, 0, a.length);
                    int temp = a_withSwap[i];
                    a_withSwap[i] = a_withSwap[j];
                    a_withSwap[j] = temp;
                    if (Arrays.equals(a_withSwap, b)) return true;
                }
                return false;
            }
        }
        return true;
    }
}
