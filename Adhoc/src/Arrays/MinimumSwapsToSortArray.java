/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.MinimumSwapsToSortArray
 */
package Arrays;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class MinimumSwapsToSortArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7};
        int u = MinimumSwapsToSortArray.minimumSwaps((int[])arr);
        System.out.println(u);
    }

    private static int minimumSwaps(int[] arr) {
        boolean[] visited = new boolean[arr.length + 1];
        int swaps = 0;
        for (int i = 0; i < arr.length; ++i) {
            int cycle = 0;
            int j = arr[i];
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j - 1];
                ++cycle;
            }
            if (cycle <= 0) continue;
            swaps += cycle - 1;
        }
        return swaps;
    }
}

