/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.AllCombinationsOfElementsInArray
 */
package Arrays;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Exception performing whole class analysis ignored.
 */
public class AllCombinationsOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] data = new int[arr.length];
        List list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        ArrayList data1 = new ArrayList();
        int r = 3;
        int n = arr.length;
        AllCombinationsOfElementsInArray.combinationUtil(list, data1, (int)0, (int)(n - 1), (int)0, (int)r);
    }

    private static void combinationUtil(List<Integer> list, List<Integer> data, int start, int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; ++j) {
                System.out.print(data.get(j) + " ");
            }
            System.out.println("");
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= r - index; ++i) {
            data.add(index, list.get(i));
            AllCombinationsOfElementsInArray.combinationUtil(list, data, (int)(i + 1), (int)end, (int)(index + 1), (int)r);
        }
    }

    static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; ++j) {
                System.out.print(String.valueOf(data[j]) + " ");
            }
            System.out.println("");
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= r - index; ++i) {
            data[index] = arr[i];
            AllCombinationsOfElementsInArray.combinationUtil((int[])arr, (int[])data, (int)(i + 1), (int)end, (int)(index + 1), (int)r);
        }
    }
}

