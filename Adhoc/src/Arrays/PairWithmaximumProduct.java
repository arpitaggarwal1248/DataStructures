/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.PairWithmaximumProduct
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class PairWithmaximumProduct {
    public static void main(String[] args) {
        int[] arrn = new int[7];
        arrn[0] = -1;
        arrn[1] = -3;
        arrn[2] = -4;
        arrn[3] = 2;
        arrn[5] = -4;
        arrn[6] = -5;
        int[] arr = arrn;
        int[] arrn2 = new int[6];
        arrn2[0] = 1;
        arrn2[1] = 4;
        arrn2[2] = 3;
        arrn2[3] = 6;
        arrn2[4] = 7;
        int[] arr1 = arrn2;
        int[] arrn3 = new int[7];
        arrn3[0] = 1;
        arrn3[1] = 4;
        arrn3[2] = 3;
        arrn3[3] = 6;
        arrn3[4] = 7;
        arrn3[6] = 7;
        int[] arr2 = arrn3;
        int[] arrn4 = new int[8];
        arrn4[0] = -50;
        arrn4[1] = -1;
        arrn4[2] = -3;
        arrn4[3] = -4;
        arrn4[4] = 2;
        arrn4[6] = -4;
        arrn4[7] = -5;
        int[] arr3 = arrn4;
        PairWithmaximumProduct.findPairWithMaxProduct((int[])arr);
        PairWithmaximumProduct.findPairWithMaxProduct((int[])arr1);
        PairWithmaximumProduct.findPairWithMaxProduct((int[])arr2);
        PairWithmaximumProduct.findPairWithMaxProduct((int[])arr3);
    }

    private static void findPairWithMaxProduct(int[] arr) {
        int min1 = 1;
        int min2 = 1;
        int max1 = 1;
        int max2 = 1;
        for (int u : arr) {
            if (u > 0) {
                if (max1 <= u) {
                    max2 = max1;
                    max1 = u;
                    continue;
                }
                if (max2 >= u) continue;
                max2 = u;
                continue;
            }
            if (min1 > u) {
                min2 = min1;
                min1 = u;
                continue;
            }
            if (min2 <= u) continue;
            min2 = u;
        }
        if (min1 * min2 < max2 * max1) {
            System.out.println(String.valueOf(max1) + "::" + max2);
        } else {
            System.out.println(String.valueOf(min1) + "::" + min2);
        }
    }
}

