import com.pdm.codefights.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class matrixElementSumTest {

    @Test
    public void singleHauntedRoom() {
        int matrix[][] = new int[][] { { 0 } };
        int actual = Main.matrixElementSum(matrix);
        assertEquals(0, actual);
    }

    @Test
    public void nothingHauntedSumEverything() {
        int[][] matrix = new int[][] {  // test 3
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        int actual = Main.matrixElementSum(matrix);
        assertEquals(18, actual);
    }


}
