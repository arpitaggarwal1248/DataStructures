/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.MultiplicationArray
 */
package Arrays;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public class MultiplicationArray {
    public static void main(String[] args) {
        int[] arrn = new int[6];
        arrn[0] = 1;
        arrn[1] = 2;
        arrn[3] = 4;
        arrn[4] = 5;
        arrn[5] = 6;
        int[] a = arrn;
        int[] b = new int[]{1, 2, 1, 4, 5, 6};
        int[] c = new int[3];
        int l = a.length;
        List<Integer> outputA = MultiplicationArray.getMultiplicationArray((int[])a);
        System.out.println(outputA.isEmpty() ? outputA : Collections.nCopies(l, 0));
        List<Integer> outputB = MultiplicationArray.getMultiplicationArray((int[])b);
        System.out.println(outputB.isEmpty() ? outputB : Collections.nCopies(l, 0));
        List<Integer> outputC = MultiplicationArray.getMultiplicationArray((int[])c);
        System.out.println(outputC.isEmpty() ? outputC : Collections.nCopies(l, 0));
    }

    private static List<Integer> getMultiplicationArray(int[] a) {
        ArrayList<Integer> out = new ArrayList<>(a.length);
        int product = 1;
        boolean isContainsZero = false;
        if (a.length < 2 || a == null) {
            return out;
        }
        int l = a.length;
        for (int i = 0; i < l; ++i) {
            if (a[i] != 0) {
                product *= a[i];
                continue;
            }
            if (a[i] == 0 && isContainsZero) {
                return out;
            }
            isContainsZero = true;
        }
        for (int j = 0; j < l; ++j) {
            if (!isContainsZero) {
                out.add(product / a[j]);
                continue;
            }
            if (a[j] == 0) {
                out.add(product);
                continue;
            }
            out.add(0);
        }
        return out;
    }
}

