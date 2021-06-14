/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.Mycomparator
 */
package Arrays;

import java.io.PrintStream;
import java.util.Comparator;

public class Mycomparator
implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        String a = String.valueOf(o1.toString()) + o2.toString();
        String b = String.valueOf(o2.toString()) + o1.toString();
        System.out.println(String.valueOf(a) + "---" + b);
        System.out.println(a.compareTo(b));
        if (a.compareTo(b) > 0) {
            return -1;
        }
        return 1;
    }
}

