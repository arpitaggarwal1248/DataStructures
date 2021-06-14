/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.AllPermutations
 */
package string;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

/*
 * Exception performing whole class analysis ignored.
 */
public class AllPermutations {
    static int count = 0;
    static Set<String> s = new HashSet();

    public static void main(String[] args) {
        String a = "arpit";
        AllPermutations.permute((String)a, (String)"");
        System.out.println(count);
        System.out.println(s.size());
    }

    private static void permute(String a, String sub) {
        int n = a.length();
        if (n == 0) {
            ++count;
            s.add(sub);
            System.out.println(sub);
        } else {
            for (int i = 0; i < n; ++i) {
                AllPermutations.permute((String)(String.valueOf(a.substring(0, i)) + a.substring(i + 1, n)), (String)(String.valueOf(a.charAt(i)) + sub));
            }
        }
    }
}

