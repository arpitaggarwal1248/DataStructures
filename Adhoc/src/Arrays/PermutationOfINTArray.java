/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.PermutationOfINTArray
 */
package Arrays;

import java.io.PrintStream;
import java.util.ArrayList;

/*
 * Exception performing whole class analysis ignored.
 */
public class PermutationOfINTArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        String b = "arpit";
        PermutationOfINTArray.perm((String)b, (String)"");
    }

    private static void perm(String a, String sub) {
        int n = a.length();
        if (n == 0) {
            System.out.println(sub);
        } else {
            for (int i = 0; i < a.length(); ++i) {
                PermutationOfINTArray.perm((String)(String.valueOf(a.substring(0, i)) + a.substring(i + 1, n)), (String)(String.valueOf(sub) + a.charAt(i)));
            }
        }
    }

    private static void permute(ArrayList<Integer> a, int k) {
        int n = a.size();
        if (n == k) {
            System.out.println(a);
        } else {
            for (int i = k; i < a.size(); ++i) {
                PermutationOfINTArray.swap(a, (int)k, (int)i);
                PermutationOfINTArray.permute(a, (int)(k + 1));
                PermutationOfINTArray.swap(a, (int)k, (int)i);
            }
        }
    }

    private static void swap(ArrayList<Integer> a, int k, int i) {
        int temp = a.get(k);
        a.set(k, a.get(i));
        a.set(i, temp);
    }
}

