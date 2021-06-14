/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.CoinChange
 */
package ProblemStatements;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] values = new int[]{2, 5, 3};
        int sum = 15;
        System.out.println(CoinChange.getMinCoinsDP((int[])values, (int)sum));
    }

    public static int getMinCoinsDP(int[] values, int sum) {
        int min = 0;
        int[] minCoins = new int[sum + 1];
        minCoins[0] = 0;
        for (int i = 1; i <= sum; ++i) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < values.length; ++j) {
                if (i < values[j]) continue;
                min = Math.min(min, minCoins[i - values[j]]);
            }
            minCoins[i] = min != Integer.MAX_VALUE ? min + 1 : Integer.MAX_VALUE;
        }
        return minCoins[sum];
    }

    public static int getMinCoins(int[] values, int sum) {
        if (sum == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; ++i) {
            if (sum < values[i]) continue;
            min = Math.min(min, CoinChange.getMinCoins((int[])values, (int)(sum - values[i])));
        }
        return min + 1;
    }
}

