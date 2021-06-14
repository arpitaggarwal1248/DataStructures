/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.LeftRightSum
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class LeftRightSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 1, 2, 3, 6, 3, 3};
        LeftRightSum.getNumber((int[])arr);
    }

    private static void efficientSolution(int[] arr) {
        int lSum = 0;
        int rSum = 0;
        for (int i = 1; i < arr.length; ++i) {
            rSum += arr[i];
        }
        System.out.println(rSum);
        int j = 1;
        int i = 0;
        while (j < arr.length) {
            System.out.println(String.valueOf(rSum -= arr[j]) + "--" + (lSum += arr[i]));
            if (rSum == lSum) {
                System.out.println("Efficient Solution: " + arr[i + 1]);
            }
            ++j;
            ++i;
        }
    }

    private static void getNumber(int[] arr) {
        int[] temp = new int[arr.length];
        int pre = 0;
        int i = 0;
        for (int u : arr) {
            temp[i] = pre += u;
            ++i;
        }
        int suf = 0;
        int pos = -1;
        for (int j = arr.length - 1; j >= 0; --j) {
            if (temp[j] != (suf += arr[j])) continue;
            pos = j;
            break;
        }
        System.out.println("pos:" + pos);
        System.out.println("Normal Solution: " + arr[pos]);
    }
}

