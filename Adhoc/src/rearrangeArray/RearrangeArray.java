/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  rearrangeArray.RearrangeArray
 */
package rearrangeArray;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class RearrangeArray {
    public static void main(String[] args) {
        int[] a = new int[]{3, 6, 12, 1, 5, 8};
        RearrangeArray.arrangeArray((int[])a);
        for (int k : a) {
            System.out.println(k);
        }
    }

    private static void arrangeArray(int[] arr) {
        int even = 0;
        int odd = 1;
        int i = 0;
        while (i < arr.length) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                RearrangeArray.swap((int[])arr, (int)odd, (int)i);
                odd += 2;
                continue;
            }
            if (i % 2 != 0 && arr[i] % 2 == 0) {
                RearrangeArray.swap((int[])arr, (int)even, (int)i);
                even += 2;
                continue;
            }
            ++i;
        }
    }

    private static void swap(int[] arr, int num, int i) {
        int temp = arr[i];
        arr[i] = arr[num];
        arr[num] = temp;
    }
}

