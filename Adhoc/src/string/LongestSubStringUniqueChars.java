/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.LongestSubStringUniqueChars
 */
package string;

import java.io.PrintStream;
import java.util.LinkedHashSet;

public class LongestSubStringUniqueChars {
    public static void main(String[] args) {
        String a = "abcdabdefgcabd";
        LinkedHashSet<Character> s = new LinkedHashSet<Character>();
        LinkedHashSet ans = new LinkedHashSet();
        int maxlength = 0;
        boolean start = false;
        boolean winStart = false;
        int curr = 0;
        for (char u : a.toCharArray()) {
            if (!s.contains(Character.valueOf(u))) {
                ++curr;
                s.add(Character.valueOf(u));
            } else {
                curr = 0;
                s = new LinkedHashSet();
                s.add(Character.valueOf(u));
                ++curr;
            }
            if (curr <= maxlength) continue;
            maxlength = curr;
            ans = s;
        }
        System.out.println(maxlength);
        System.out.println(ans);
    }
}

