/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  rotationalArray.FIndPivotRotatedArrays
 *  rotationalArray.SearchElementInRotatedArray
 */
package rotationalArray;

import java.io.PrintStream;
import rotationalArray.FIndPivotRotatedArrays;

/*
 * Exception performing whole class analysis ignored.
 */
public class SearchElementInRotatedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 1, 2, 3, 4};
        int pivot = FIndPivotRotatedArrays.findPivot((int[])arr, (int)0, (int)(arr.length - 1));
        System.out.println(SearchElementInRotatedArray.findElement((int[])arr, (int)0, (int)arr.length, (int)pivot, (int)5));
    }

    private static int findElement(int[] arr, int low, int high, int pivot, int element) {
        if (arr[pivot] == element) {
            return pivot;
        }
        if (arr[pivot] < element) {
            return -1;
        }
        int pos = SearchElementInRotatedArray.binarySearch((int[])arr, (int)low, (int)(pivot - 1), (int)element);
        if (pos != -1) {
            return pos;
        }
        return SearchElementInRotatedArray.binarySearch((int[])arr, (int)(pivot + 1), (int)high, (int)element);
    }

    private static int binarySearch(int[] arr, int low, int high, int ele) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == ele) {
                return mid;
            }
            if (ele > arr[mid]) {
                return SearchElementInRotatedArray.binarySearch((int[])arr, (int)(mid + 1), (int)high, (int)ele);
            }
            return SearchElementInRotatedArray.binarySearch((int[])arr, (int)low, (int)(mid - 1), (int)ele);
        }
        return -1;
    }
}

