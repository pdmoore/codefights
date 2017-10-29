package com.pdm.codefights;

public class Main {

    // Rename class and remove the Main method

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int nextNumberViolationCount = 0;
        for (int j=0; j < sequence.length - 1; j++) {
            if (sequence[j] >= sequence[j+1]) {
                nextNumberViolationCount++;
            }
        }

        return  (nextNumberViolationCount < 2);
    }
}
