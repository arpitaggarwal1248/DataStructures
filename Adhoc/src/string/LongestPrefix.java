/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.LongestPrefix
 */
package string;

import java.io.PrintStream;

public class LongestPrefix {
    public static void main(String[] args) {
        int sz = 100;
        String[] arr = new String[]{"abcd", "aze"};
        String word = arr[0];
        int fin = Integer.MAX_VALUE;
        for (String u : arr) {
            int prev = 0;
            sz = Math.min(word.length(), u.length());
            for (int i = 0; i < sz; ++i) {
                if (word.charAt(i) != u.charAt(i)) continue;
                prev = i;
            }
            if (prev >= fin) continue;
            fin = prev;
        }
        if (fin == 0) {
            System.out.println(word.substring(0, fin));
        } else {
            System.out.println(word.substring(0, fin + 1));
        }
    }
}

