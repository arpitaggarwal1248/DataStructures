/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.SubArraysWithMax0And1
 */
package Arrays;

import java.io.PrintStream;
import java.util.HashMap;

public class SubArraysWithMax0And1 {
    int maxLen(int[] arr, int n) {
        int i;
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        int sum = 0;
        int max_len = 0;
        int ending_index = -1;
        boolean start_index = false;
        for (i = 0; i < n; ++i) {
            arr[i] = arr[i] == 0 ? -1 : 1;
        }
        for (i = 0; i < n; ++i) {
            if ((sum += arr[i]) == 0) {
                max_len = i + 1;
                ending_index = i;
            }
            if (hM.containsKey(sum + n)) {
                if (max_len >= i - (Integer)hM.get(sum + n)) continue;
                max_len = i - (Integer)hM.get(sum + n);
                ending_index = i;
                continue;
            }
            hM.put(sum + n, i);
        }
        for (i = 0; i < n; ++i) {
            arr[i] = arr[i] == -1 ? 0 : 1;
        }
        int end = ending_index - max_len + 1;
        System.out.println(String.valueOf(end) + " to " + ending_index);
        return max_len;
    }

    public static void main(String[] args) {
        SubArraysWithMax0And1 sub = new SubArraysWithMax0And1();
        int[] arrn = new int[7];
        arrn[0] = 1;
        arrn[3] = 1;
        arrn[5] = 1;
        arrn[6] = 1;
        int[] arr = arrn;
        int n = arr.length;
        sub.maxLen(arr, n);
    }
}

