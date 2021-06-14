/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  rotationalArray.FIndPivotRotatedArrays
 */
package rotationalArray;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class FIndPivotRotatedArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[]{5, 6, 1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4};
        int[] arr3 = new int[]{1};
        int[] arr4 = new int[]{1, 2};
        int[] arr5 = new int[]{2, 1};
        int[] arr6 = new int[]{5, 6, 7, 1, 2, 3, 4};
        int[] arr7 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr8 = new int[]{2, 3, 4, 5, 6, 7, 8, 1};
        int[] arr9 = new int[]{3, 4, 5, 1, 2};
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr1, (int)0, (int)(arr1.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr2, (int)0, (int)(arr2.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr3, (int)0, (int)(arr3.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr4, (int)0, (int)(arr4.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr5, (int)0, (int)(arr5.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr6, (int)0, (int)(arr6.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr7, (int)0, (int)(arr7.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr8, (int)0, (int)(arr8.length - 1)));
        System.out.println(FIndPivotRotatedArrays.findPivot((int[])arr9, (int)0, (int)(arr9.length - 1)));
    }

    public static int findPivot(int[] arr, int low, int high) {
        if (high < low) {
            return arr.length - 1;
        }
        if (high == low) {
            return arr.length - 1;
        }
        int mid = (low + high) / 2;
        if (low < mid && arr[mid - 1] > arr[mid]) {
            return mid - 1;
        }
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (arr[mid] < arr[high]) {
            return FIndPivotRotatedArrays.findPivot((int[])arr, (int)low, (int)(mid - 1));
        }
        return FIndPivotRotatedArrays.findPivot((int[])arr, (int)(mid + 1), (int)high);
    }
}

