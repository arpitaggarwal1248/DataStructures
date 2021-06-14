/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.LongestCommonSubString
 */
package string;

import java.util.ArrayList;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public class LongestCommonSubString {
    public static void main(String[] args) {
        List<String> result = LongestCommonSubString.commonSubstring((String)"CLCL", (String)"LCLC");
        for (String str : result) {
            System.out.println(str);
        }
    }

    private static List<String> commonSubstring(String a, String b) {
        int s1 = a.length();
        int s2 = b.length();
        int[][] mat = new int[s1][s2];
        ArrayList<String> result = null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s1; ++i) {
            for (int j = 0; j < s2; ++j) {
                if (a.charAt(i) != b.charAt(j)) continue;
                mat[i][j] = i == 0 || j == 0 ? 1 : mat[i - 1][j - 1] + 1;
                if (max < mat[i][j]) {
                    max = mat[i][j];
                    result = new ArrayList<String>();
                    result.add(a.substring(i - max + 1, i + 1));
                    continue;
                }
                if (mat[i][j] != max) continue;
                result.add(a.substring(i - max + 1, i + 1));
            }
        }
        return result;
    }
}

