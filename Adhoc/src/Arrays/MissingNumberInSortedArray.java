/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.MissingNumberInSortedArray
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class MissingNumberInSortedArray {
    public static void main(String[] args) {
        int[] array2 = new int[]{1, 2, 3, 4,5, 6, 7, 8};
        System.out.println("Normal Solution: " + MissingNumberInSortedArray.normalSolution((int[])array2));
        System.out.println("Efficient Solution: " + MissingNumberInSortedArray.efficientSolution((int[])array2));
    }

    private static int normalSolution(int[] arr) {
        int n = arr.length + 1;
        int sum = 0;
        for (int u : arr) {
            sum += u;
        }
        int mSum = n * (n + 1) / 2;
        return mSum - sum;
    }

    public static int efficientSolution(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] - mid == 1) {
                l = mid + 1;
                continue;
            }
            r = mid;
        }
        return arr[l] - 1;
    }

}

