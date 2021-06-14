/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.Bribe
 */
package ProblemStatements;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class Bribe {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        Bribe.minimumBribes((int[])arr);
    }

    private static void minimumBribes(int[] q) {
        int totalBribes = 0;
        for (int i = 0; i < q.length; ++i) {
            int bribes = q[i] - (i + 1);
            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = java.lang.Math.max((int)0, (int)(q[i] - 2)); j < i; ++j) {
                if (q[j] <= q[i]) continue;
                ++totalBribes;
            }
        }
        System.out.println(totalBribes);
    }
}

