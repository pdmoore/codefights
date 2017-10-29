package com.pdm.codefights;

public class Main {

    // Rename class and remove the Main method

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int sameNumberViolationCount = 0;
        for (int i=0; i < sequence.length - 1; i++) {
            if (sequence[i] == sequence[i+1]) {
                sameNumberViolationCount++;
            }
        }

        int nextNumberViolationCount = 0;
        for (int j=0; j < sequence.length - 1; j++) {
            if (sequence[j] > sequence[j+1]) {
                nextNumberViolationCount++;
            }
        }

        return (sameNumberViolationCount < 2) && (nextNumberViolationCount < 2);
    }
}
