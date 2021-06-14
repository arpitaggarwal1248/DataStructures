/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.MinimumPlatforms
 */
package ProblemStatements;

import java.io.PrintStream;
import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr = new int[]{900, 940, 950, 1100, 1500, 1800};
        int[] dep = new int[]{910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int platform = 1;
        int max = 0;
        int i = 1;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                if (max < ++platform) {
                    max = platform;
                }
                ++i;
                continue;
            }
            --platform;
            ++j;
        }
        System.out.println("Maximum platforms required: " + max);
    }
}

