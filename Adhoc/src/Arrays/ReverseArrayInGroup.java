/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.ReverseArrayInGroup
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class ReverseArrayInGroup {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8,9,10};
        int revSize = 15;
        int n = arr.length;
        ReverseArrayInGroup.revArray((int[])arr, (int)n, (int)(revSize % n));
        for (int u : arr) {
            System.out.println(u);
        }
    }

    private static void revArray(int[] arr, int n, int k) {
        if (k < 1) {
            return;
        }
        for (int i = 0; i < n; i += k) {
            int left = i;
            for (int right = i + k - 1 > n - 1 ? n - 1 : i + k - 1; left < right; --right, ++left) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
    }
}

