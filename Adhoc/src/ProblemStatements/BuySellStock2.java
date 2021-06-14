/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.BuySellStock2
 */
package ProblemStatements;

import java.io.PrintStream;

public class BuySellStock2 {
    public static void main(String[] args) {
        int[] a = new int[]{100, 80, 120, 130, 70, 60, 100, 125};
        int profit = 0;
        for (int i = 1; i < a.length; ++i) {
            if (a[i] - a[i - 1] <= 0) continue;
            profit = profit + a[i] - a[i - 1];
        }
        System.out.println(profit);
    }
}

