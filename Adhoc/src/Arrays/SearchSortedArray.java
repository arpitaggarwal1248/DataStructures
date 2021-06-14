/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.SearchSortedArray
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class SearchSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(SearchSortedArray.binarySearch((int[])arr, (int)0, (int)arr.length, (int)1));
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {
            return SearchSortedArray.binarySearch((int[])arr, (int)low, (int)(mid - 1), (int)key);
        }
        return SearchSortedArray.binarySearch((int[])arr, (int)(mid + 1), (int)high, (int)key);
    }
}

