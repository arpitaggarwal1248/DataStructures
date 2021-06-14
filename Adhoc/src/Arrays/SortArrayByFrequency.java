/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.SortArrayByFrequency
 *  Arrays.SortArrayByFrequency$1
 */
package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
 * Exception performing whole class analysis.
 */
public class SortArrayByFrequency {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 2, 8, 5, 6, 8, 8, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int u : arr) {
            if (map.containsKey(u)) {
                map.put(u, (Integer)map.get(u) + 1);
                continue;
            }
            map.put(u, 1);
        }
        Comparator<Map.Entry<Integer, Integer>> comparator=(Map.Entry<Integer,Integer> i1,Map.Entry<Integer,Integer> i2)->{
        	return (i1.getValue().equals(i2.getValue()))?i2.getKey().compareTo(i1.getKey()):i2.getValue().compareTo(i1.getValue());
        };
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}

