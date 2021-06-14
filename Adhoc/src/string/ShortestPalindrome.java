/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.ShortestPalindrome
 */
package string;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * Exception performing whole class analysis ignored.
 */
public class ShortestPalindrome {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        String s = "ananb";
        System.out.println(ShortestPalindrome.shortestPal((String)s));
        ShortestPalindrome sp1 = (ShortestPalindrome)Class.forName("string.ShortestPalindrome").newInstance();
        ShortestPalindrome sp = (ShortestPalindrome)ShortestPalindrome.class.getConstructor(new Class[0]).newInstance(new Object[0]);
        System.out.println(ShortestPalindrome.class.getSimpleName());
        sp.chal();
        sp1.chal();
    }

    private static String shortestPal(String s) {
        int i;
        String rev = new StringBuilder(s).reverse().toString();
        String l = String.valueOf(s) + "#" + rev;
        int[] p = new int[l.length()];
        for (i = 1; i < l.length(); ++i) {
            int j = p[i - 1];
            while (j > 0 && l.charAt(i) != l.charAt(j)) {
                j = p[j - 1];
            }
            if (l.charAt(i) != l.charAt(j)) continue;
            p[i] = j + 1;
        }
        for (i = 0; i < p.length; ++i) {
            System.out.println(p[i]);
        }
        return String.valueOf(rev.substring(0, s.length() - p[l.length() - 1])) + s;
    }

    public void chal() {
        System.out.println("chal gaya");
    }
}

