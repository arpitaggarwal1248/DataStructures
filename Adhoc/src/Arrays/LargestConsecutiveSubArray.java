/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.LargestConsecutiveSubArray
 */
package Arrays;

import java.io.PrintStream;

public class LargestConsecutiveSubArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 56, 57, 58, 91, 92, 93, 94, 91, 45};
        int count = 1;
        int end = 0;
        int maxLength = 0;
        for (int i = 0; i < a.length - 1; ++i) {
            if (a[i] + 1 == a[i + 1]) {
                if (maxLength >= ++count) continue;
                maxLength = count;
                end = i + 1;
                continue;
            }
            count = 1;
        }
        System.out.println(maxLength);
        while (maxLength > 0) {
            System.out.print(a[end]);
            --end;
            --maxLength;
        }
    }
}

