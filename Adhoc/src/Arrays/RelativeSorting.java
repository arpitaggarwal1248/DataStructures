/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.RelativeSorting
 */
package Arrays;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * Exception performing whole class analysis ignored.
 */
public class RelativeSorting {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8, 8};
        int[] a2 = new int[]{2, 1, 8, 3};
        RelativeSorting.intArraySolution((int[])a1, (int[])a2);
        RelativeSorting.hashingSolution((int[])a1, (int[])a2);
    }

    private static void hashingSolution(int[] a1, int[] a2) {
        System.out.println("Hashing solution");
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int u : a1) {
            if (map.containsKey(u)) {
                map.put(u, (Integer)map.get(u) + 1);
                continue;
            }
            map.put(u, 1);
        }
        for (int v : a2) {
            for (int res = ((Integer)map.remove((Object)Integer.valueOf((int)v))).intValue(); res > 0; --res) {
                System.out.println(v);
            }
        }
        Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getKey());
            it.remove();
        }
    }

    private static void intArraySolution(int[] a1, int[] a2) {
        System.out.println("INT array solution");
        int[] temp = new int[10];
        int max = Integer.MIN_VALUE;
        for (int u : a1) {
            int[] arrn = temp;
            int n = u;
            arrn[n] = arrn[n] + 1;
            if (max >= u) continue;
            max = u;
        }
        for (int v : a2) {
            temp[v] = 0;
            for (int res = temp[v]; res > 0; --res) {
                System.out.println(v);
            }
        }
        for (int w = 0; w <= max; ++w) {
            if (temp[w] == 0) continue;
            System.out.println(w);
        }
    }
}

