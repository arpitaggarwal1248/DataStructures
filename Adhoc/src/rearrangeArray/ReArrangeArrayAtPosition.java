/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  rearrangeArray.ReArrangeArrayAtPosition
 */
package rearrangeArray;

import java.io.PrintStream;

public class ReArrangeArrayAtPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] != -1 && arr[i] != i) {
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                arr[temp] = temp;
                continue;
            }
            ++i;
        }
        for (int u : arr) {
            System.out.println(u);
        }
    }
}

