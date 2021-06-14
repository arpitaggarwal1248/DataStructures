/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.StringPermute
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class StringPermute {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n];
        StringPermute.yo((int[])arr, (int)n);
    }

    private static void yo(int[] arr, int n) {
        if (n == 0) {
            StringPermute.print((int[])arr);
        } else {
            arr[n - 1] = 1;
            StringPermute.yo((int[])arr, (int)(n - 1));
            arr[n - 1] = 2;
            StringPermute.yo((int[])arr, (int)(n - 1));
            arr[n - 1] = 3;
            StringPermute.yo((int[])arr, (int)(n - 1));
        }
    }

    private static void print(int[] arr) {
        for (int n : arr) {
            System.out.print(String.valueOf(n) + " ");
        }
        System.out.println();
    }
}

