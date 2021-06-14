/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  rearrangeArray.DivideArrayInPosNeg
 */
package rearrangeArray;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class DivideArrayInPosNeg {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9, -5};
        int[] arr1 = new int[]{12, 34, 45, 90, 9, 8, 3};
        DivideArrayInPosNeg.collateNegPos((int[])arr);
        DivideArrayInPosNeg.collateEvenOdd((int[])arr1);
        for (int u : arr) {
            System.out.println(u);
        }
        System.out.println("***************************");
        for (int u : arr1) {
            System.out.println(u);
        }
    }

    private static void collateEvenOdd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 != 0) continue;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++j;
        }
    }

    public static void collateNegPos(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] >= 0) continue;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++j;
        }
    }
}

