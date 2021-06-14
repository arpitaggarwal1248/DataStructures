/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.CaeserCipher
 */
package string;

import java.io.PrintStream;

public class CaeserCipher {
    public static void main(String[] args) {
        String a = "ATTACKATONCE";
        int num = 4;
        char[] u = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        char[] arrc = u;
        int n = arrc.length;
        for (int i = 0; i < n; ++i) {
            int c;
            int x = c = arrc[i];
            sb.append((char)(x += 4));
        }
        System.out.println(sb);
    }
}

