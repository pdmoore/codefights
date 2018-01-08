package com.pdm.codefights;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Rename class and remove the Main method

    public static void main(String[] args) {
	// write your code here
    }

    public static int matrixElementSum(int[][] matrix) {
        List<Integer> listOfHauntedRoomNumbers = new ArrayList<>();

        int sum = 0;
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < aMatrix.length; j++) {
                if (aMatrix[j] == 0) {
                    listOfHauntedRoomNumbers.add(j);
                } else {
                    if (!listOfHauntedRoomNumbers.contains(j)) {
                        sum += aMatrix[j];
                    }
                }
            }
        }
        return sum;
    }
}
