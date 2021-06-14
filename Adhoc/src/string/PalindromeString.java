/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.PalindromeString
 */
package string;

import java.io.PrintStream;

public class PalindromeString {
    public int isPalindrome(String a) {
        int i = 0;
        int j = a.length() - 1;
        System.out.println(j);
        while (i < j) {
            if (!Character.isLetterOrDigit(a.charAt(i))) {
                ++i;
                continue;
            }
            if (!Character.isLetter(a.charAt(j))) {
                --j;
                continue;
            }
            if (a.charAt(i) == a.charAt(j)) {
                ++i;
                --j;
                continue;
            }
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        PalindromeString p = new PalindromeString();
        int u = p.isPalindrome("A man, a plan, a canal: Panama".toLowerCase());
        System.out.println(u);
    }
}

