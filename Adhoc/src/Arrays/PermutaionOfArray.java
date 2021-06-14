/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.PermutaionOfArray
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class PermutaionOfArray {
    public static void main(String[] args) {
        Object[] arr = new Character[]{Character.valueOf('a'), Character.valueOf('b'), Character.valueOf('c')};
        Object[] ar = new Integer[]{1, 2, 3};
        Object[] a = "arpit".split("");
        PermutaionOfArray.perm((Object[])arr, (int)0);
        PermutaionOfArray.perm((Object[])ar, (int)0);
        PermutaionOfArray.perm((Object[])a, (int)0);
    }

    private static <T> void perm(T[] arr, int n) {
        if (arr.length == n) {
            for (T u : arr) {
                System.out.print(u);
            }
            System.out.println();
        } else {
            for (int i = n; i < arr.length; ++i) {
                swap((Object[])arr, (int)n, (int)i);
                perm((Object[])arr, (int)(n + 1));
                swap((Object[])arr, (int)n, (int)i);
            }
        }
    }

    private static <T> void swap(T[] arr, int n, int i) {
        T temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
    }
}

