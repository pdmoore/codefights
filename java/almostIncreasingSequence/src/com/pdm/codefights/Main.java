package com.pdm.codefights;

public class Main {

    // Rename class and remove the Main method

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int adjacentViolationCount = 0;               // RENAME TO ADJACENT VIOLATION
        for (int j=0; j < sequence.length - 1; j++) {
            if (sequence[j] >= sequence[j+1]) {
                adjacentViolationCount++;
            }
        }

        int nonAdjacentViolationCount = 0;
        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] >= sequence[i+2]) {
                nonAdjacentViolationCount++;
            }
        }

        return (adjacentViolationCount < 2) &&
               (adjacentViolationCount + nonAdjacentViolationCount <= 2);
    }
}
