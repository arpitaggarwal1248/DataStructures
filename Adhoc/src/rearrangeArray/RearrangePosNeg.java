/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  rearrangeArray.DivideArrayInPosNeg
 *  rearrangeArray.RearrangePosNeg
 */
package rearrangeArray;

import java.io.PrintStream;
import rearrangeArray.DivideArrayInPosNeg;

public class RearrangePosNeg {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9};
        DivideArrayInPosNeg.collateNegPos((int[])arr);
        int negCount = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] >= 0) continue;
            ++negCount;
        }
        int p1 = 0;
        for (int p2 = negCount; p2 < arr.length && p1 < arr.length && arr[p1] < 0; p1 += 2, ++p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
        }
        for (int v : arr) {
            System.out.println(v);
        }
    }
}

