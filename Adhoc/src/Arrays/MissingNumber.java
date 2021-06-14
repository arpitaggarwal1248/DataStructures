/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.MissingNumber
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] array1 = new int[]{9, 7, 8, 5, 4, 6, 2, 3, 1};
        int[] array2 = new int[]{1, 2, 4, 6, 3, 7, 8};
        int mu = MissingNumber.missingNumberInSingleArraysEfficientSolution((int[])array2, (int)(array2.length - 1));
        System.out.println(mu);
    }

    private static int missingNumberInSingleArraysEfficientSolution(int[] arr, int size) {
        int a = 0;
        int b = size - 1;
        int mid = 0;
        while (b - a > 1) {
            mid = (a + b) / 2;
            if (arr[mid] - mid != arr[a] - a) {
                b = mid;
                continue;
            }
            if (arr[mid] - mid == arr[b] - b) continue;
            a = mid;
        }
        return arr[mid] + 1;
    }

    private static void missingNumberInSingleArray(int[] array2) {
        int n = array2.length;
        int result = 0;
        for (int u : array2) {
            result += u;
        }
        int nSum = (n + 1) * (n + 2) / 2;
        System.out.println(nSum - result);
    }

    private static void missingNumberInDuplicateArray(int[] array1, int[] array2) {
        int result = 0;
        for (int u : array1) {
            result += u;
        }
        for (int v : array2) {
            result -= v;
        }
        System.out.println(result);
    }

    private static void missingNumberInDuplicateArrayWithoutArthematicOperation(int[] array1, int[] array2) {
        int result = array1[0];
        for (int i = 1; i < array1.length; ++i) {
            result ^= array1[i];
        }
        for (int v : array2) {
            result ^= v;
        }
        System.out.println(result);
    }
}

