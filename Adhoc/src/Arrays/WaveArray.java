/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.WaveArray
 */
package Arrays;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public class WaveArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{20, 10, 8, 6, 4, 2};
        List<Integer> a = Arrays.asList(arr);
        List out = WaveArray.getWaveArray(a);
        System.out.println(out);
    }

    private static List<Integer> getWaveArray(List<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n; i += 2) {
            int tmp;
            if (i - 1 >= 0 && a.get(i - 1) > a.get(i)) {
                tmp = a.get(i);
                a.set(i, a.get(i - 1));
                a.set(i - 1, tmp);
            }
            if (i + 1 >= n || a.get(i + 1) <= a.get(i)) continue;
            tmp = a.get(i);
            a.set(i, a.get(i + 1));
            a.set(i + 1, tmp);
        }
        return a;
    }
}

