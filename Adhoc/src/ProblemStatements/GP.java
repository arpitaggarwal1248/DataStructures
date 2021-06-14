/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.GP
 */
package ProblemStatements;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Exception performing whole class analysis ignored.
 */
public class GP {
    public static void main(String[] args) {
        long[] arr = new long[]{1L, 3L, 9L, 9L, 27L, 81L};
        List list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(GP.countTriplets(list, (long)3L));
    }

    static long countTriplets(List<Long> arr, long r) {
        long ans = 0L;
        HashMap right = new HashMap();
        HashMap left = new HashMap();
        for (long u : arr) {
            GP.mapPut(right, (long)u);
        }
        for (long num : arr) {
            GP.mapRemove(right, (long)num);
            if (num % r == 0L) {
                long num1 = left.get(num / r) != null ? (Integer)left.get(num / r) : 0;
                long num2 = right.get(num * r) != null ? (Integer)right.get(num * r) : 0;
                ans += num1 * num2;
            }
            GP.mapPut(left, (long)num);
        }
        return ans;
    }

    private static void mapPut(Map<Long, Integer> map, long u) {
        if (map.containsKey(u)) {
            map.put(u, map.get(u) + 1);
        } else {
            map.put(u, 1);
        }
    }

    private static void mapRemove(Map<Long, Integer> map, long u) {
        if (map.containsKey(u)) {
            map.put(u, map.get(u) - 1);
        } else {
            map.remove(u);
        }
    }
}

