/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  ProblemStatements.DutchFlag
 */
package ProblemStatements;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class DutchFlag {
    public static void main(String[] args) {
        int[] out;
        int[] arrn = new int[12];
        arrn[1] = 1;
        arrn[2] = 1;
        arrn[4] = 1;
        arrn[5] = 2;
        arrn[6] = 1;
        arrn[7] = 2;
        arrn[11] = 1;
        int[] arr = arrn;
        for (int j : out = DutchFlag.sortArray((int[])arr)) {
            System.out.print(String.valueOf(j) + ",");
        }
    }
    
    
    private static int[] bruteForce(int [] arr)
    {
   
    	for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
    	}
    	return arr;
    }

    private static int[] sortArray(int[] a) {
        int low = 0;
        int i = 0;
        int hi = a.length - 1;
        while (i <= hi) {
            int tmp;
            if (a[i] == 0) {
                tmp = a[low];
                a[low] = a[i];
                a[i] = tmp;
                ++low;
                ++i;
                continue;
            }
            if (a[i] == 1) {
                ++i;
                continue;
            }
            if (a[i] != 2) continue;
            tmp = a[i];
            a[i] = a[hi];
            a[hi] = tmp;
            --hi;
        }
        return a;
    }
}

