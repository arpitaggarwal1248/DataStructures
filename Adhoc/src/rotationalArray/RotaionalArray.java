/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  rotationalArray.RotaionalArray
 */
package rotationalArray;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * Exception performing whole class analysis ignored.
 */
public class RotaionalArray {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int len = n;
        int round = k;
        int[] output = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            int newLocation = (i + (n - k % n)) % n;
            output[newLocation] = a[i];
        }
        return output;
    }

    public static void leftRotate(int[] arr, int k, int n) {
        int D = RotaionalArray.gcd((int)k, (int)n);
        for (int i = 0; i < D; ++i) {
            int pos;
            int temp = arr[i];
            int j = i;
            while ((pos = (j + k) % n) != i) {
                arr[j] = arr[pos];
                j = pos;
            }
            arr[j] = temp;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return RotaionalArray.gcd((int)b, (int)(a % b));
    }

    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; ++a_i) {
            a[a_i] = in.nextInt();
        }
        int[] output = new int[n];
        output = RotaionalArray.arrayLeftRotation((int[])a, (int)n, (int)k);
        for (i = 0; i < n; ++i) {
            System.out.print(String.valueOf(output[i]) + " ");
        }
        System.out.println("_------------------------");
        RotaionalArray.leftRotate((int[])a, (int)k, (int)n);
        for (i = 0; i < n; ++i) {
            System.out.println(a[i]);
        }
    }
}

