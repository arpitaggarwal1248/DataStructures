/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.MaximumProductSubArray
 */
package Arrays;

import java.io.PrintStream;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arrn = new int[7];
        arrn[0] = 1;
        arrn[1] = -2;
        arrn[2] = -3;
        arrn[4] = 7;
        arrn[5] = -8;
        arrn[6] = -2;
        int[] arr = arrn;
        int min = arr[0];
        int max = arr[0];
        int maxi = 0;
        int end = -1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > 0) {
                max *= arr[i];
                min = Math.min(min * arr[i], 1);
            } else if (arr[i] < 0) {
                int temp = max;
                max = Math.max(min * arr[i], 1);
                min = temp * arr[i];
            } else if (arr[i] == 0) {
                min = 1;
                max = 1;
            }
            if (maxi >= max) continue;
            maxi = max;
            end = i;
        }
        System.out.println(maxi);
        System.out.println(end);
        while (end != -1 && arr[end] != 0) {
            System.out.println(arr[end]);
            --end;
        }
    }
}

