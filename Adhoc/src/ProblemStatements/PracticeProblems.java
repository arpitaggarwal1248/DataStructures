/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.PracticeProblems
 */
package ProblemStatements;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class PracticeProblems {
    public static void main(String[] args) {
        String a = "Select ttid from RefundResponse where ttid IN :ttid";
        String sub = a.substring(0, a.indexOf(":"));
        System.out.println(String.valueOf(sub) + " (" + "refdata" + " )");
    }

    private static void dutchFlag(int[] arr) {
        int low = 0;
        int i = 0;
        int hi = arr.length - 1;
        while (i <= hi) {
            if (arr[i] == 0) {
                PracticeProblems.swap((int[])arr, (int)i, (int)low);
                ++i;
                ++low;
                continue;
            }
            if (arr[i] == 1) {
                ++i;
                continue;
            }
            if (arr[i] != 2) continue;
            PracticeProblems.swap((int[])arr, (int)i, (int)hi);
            --hi;
        }
        for (int u : arr) {
            System.out.println(u);
        }
    }

    private static void swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

    private static void waterLevel(int[] tower) {
        int[] rTower = new int[tower.length];
        int max = -1;
        for (int i = tower.length - 1; i >= 0; --i) {
            if (tower[i] > max) {
                max = tower[i];
            }
            rTower[i] = max;
        }
        int maxLeft = 0;
        int waterLevel = 0;
        for (int j = 0; j < tower.length; ++j) {
            waterLevel += Math.max(Math.min(maxLeft, rTower[j]) - tower[j], 0);
            if (maxLeft >= tower[j]) continue;
            maxLeft = tower[j];
        }
        System.out.println(waterLevel);
    }
}

