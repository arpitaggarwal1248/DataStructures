/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.MoveZeroAtEnd
 */
package Arrays;

import java.io.PrintStream;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] arrn = new int[8];
        arrn[0] = 1;
        arrn[1] = 2;
        arrn[3] = 4;
        arrn[4] = 3;
        arrn[6] = 5;
        int[] arr = arrn;
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                ++count;
                ++i;
                continue;
            }
            ++i;
        }
        while (count < arr.length) {
            arr[count] = 0;
            ++count;
        }
        for (int u : arr) {
            System.out.println(u);
        }
    }
}

