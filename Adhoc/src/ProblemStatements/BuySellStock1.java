/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.BuySellStock1
 */
package ProblemStatements;

import java.io.PrintStream;

public class BuySellStock1 {
    public static void main(String[] args) {
        int[] a = new int[]{100, 80, 120, 130, 70, 60, 100, 125};
        int maxSp = 0;
        int maxProfit = 0;
        int bp = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < bp) {
                bp = a[i];
            }
            if (a[i] - bp <= maxProfit) continue;
            maxProfit = a[i] - bp;
            maxSp = a[i];
        }
        System.out.println(maxSp);
        System.out.println(maxProfit);
    }
}

