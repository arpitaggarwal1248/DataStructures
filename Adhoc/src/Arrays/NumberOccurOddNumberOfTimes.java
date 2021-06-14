/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.NumberOccurOddNumberOfTimes
 */
package Arrays;

import java.io.PrintStream;

public class NumberOccurOddNumberOfTimes {
    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 4, 3, 1, 4, 5, 1, 4, 2, 5};
        int result = input[0];
        for (int i = 1; i < input.length; ++i) {
            result ^= input[i];
        }
        System.out.println(result);
    }
}

