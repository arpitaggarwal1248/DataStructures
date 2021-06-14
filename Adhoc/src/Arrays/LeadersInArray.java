/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.LeadersInArray
 */
package Arrays;

import java.io.PrintStream;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int max = -1;
        for (int i = arr.length - 1; i >= 0; --i) {
            if (arr[i] <= max) continue;
            System.out.println(arr[i]);
            max = arr[i];
        }
    }
}

