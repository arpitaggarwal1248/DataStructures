/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.ElementAppearedOnceInArray
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class ElementAppearedOnceInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 5, 4, 8, 4, 5, 8, 9, 4, 8};
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(String.valueOf(arr[i]) + "  ");
        }
        System.out.println();
        System.out.println(ElementAppearedOnceInArray.findRequiredNum((int[])arr, (int)3));
    }

    public static int findRequiredNum(int[] arr, int N) {
        int[] countSetBit = new int[32];
        for (int i = 0; i < arr.length; ++i) {
            for (int k = 0; k < 32; ++k) {
                int kthSetBit = 1 << k;
                if ((arr[i] & kthSetBit) != kthSetBit) continue;
                int[] arrn = countSetBit;
                int n = k;
                arrn[n] = arrn[n] + 1;
            }
        }
        int occurredOnce = 0;
        for (int i = 0; i < 32; ++i) {
            countSetBit[i] = countSetBit[i] % N;
            if (countSetBit[i] != 1) continue;
            occurredOnce |= 1 << i;
        }
        return occurredOnce;
    }
}

