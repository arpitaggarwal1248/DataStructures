/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.LongestPositiveSubArrayWithMaxSum
 */
package Arrays;

import java.io.PrintStream;
import java.util.ArrayList;

/*
 * Exception performing whole class analysis ignored.
 */
public class LongestPositiveSubArrayWithMaxSum {
    public static ArrayList<Integer> getLongestSubArray(int[] arr) {
        long maxSum = 0L;
        long newSum = 0L;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int u : arr) {
            if (u >= 0) {
                newSum += (long)u;
                newArray.add(u);
            } else {
                newSum = 0L;
                newArray = new ArrayList();
            }
            if (newSum <= maxSum && (newSum != maxSum || newArray.size() <= maxArray.size())) continue;
            maxSum = newSum;
            maxArray = newArray;
        }
        return maxArray;
    }

    private static void memoryEfficientSolution(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int end = -1;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] >= 0) {
                if ((curr += arr[i]) <= max && (curr != max || ++count <= maxCount)) continue;
                max = curr;
                end = i;
                maxCount = count;
                continue;
            }
            count = 0;
            curr = 0;
        }
        System.out.println("Memory Efficient Solution:");
        while (maxCount > 0) {
            System.out.println(arr[end]);
            --maxCount;
            --end;
        }
    }

    public static void main(String[] args) {
        int[] arrn = new int[14];
        arrn[0] = 34;
        arrn[1] = 55;
        arrn[2] = 6;
        arrn[3] = 90;
        arrn[6] = -65;
        arrn[7] = -4;
        arrn[8] = -90;
        arrn[9] = 5;
        arrn[10] = 57;
        arrn[11] = 3;
        arrn[12] = 87;
        arrn[13] = 33;
        int[] arr = arrn;
        ArrayList ar = LongestPositiveSubArrayWithMaxSum.getLongestSubArray((int[])arr);
        System.out.println("Normal Solution: " + ar);
        LongestPositiveSubArrayWithMaxSum.memoryEfficientSolution((int[])arr);
    }
}

