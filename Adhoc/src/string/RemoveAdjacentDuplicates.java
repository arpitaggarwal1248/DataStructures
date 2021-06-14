/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.RemoveAdjacentDuplicates
 */
package string;

import java.io.PrintStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(RemoveAdjacentDuplicates.removeAdjacentDuplicate((String)"mississipie"));
        System.out.println(RemoveAdjacentDuplicates.removeAdjacentDuplicate((String)"acaaabbbacdddd"));
        System.out.println(RemoveAdjacentDuplicates.removeAdjacentDuplicate((String)"geeksforgeek"));
        System.out.println("*******************************************");
        System.out.println(RemoveAdjacentDuplicates.removeDuplicate((String)"geeksforgeek"));
        System.out.println(RemoveAdjacentDuplicates.removeDuplicate((String)"geeks for geeks"));
    }

    private static String removeDuplicate(String a) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[256];
        for (char u : a.toCharArray()) {
            if (arr[u] != 0) continue;
            int[] arrn = arr;
            char c = u;
            arrn[c] = arrn[c] + 1;
            sb.append(u);
        }
        return sb.toString();
    }

    private static String removeAdjacentDuplicate(String a) {
        char[] arr = a.toCharArray();
        int len = a.length();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] == arr[i + 1]) {
                flag = true;
                continue;
            }
            if (!flag) {
                sb.append(arr[i]);
            }
            flag = false;
        }
        if (!flag) {
            sb.append(arr[arr.length - 1]);
        }
        if (len == sb.toString().length()) {
            return sb.toString();
        }
        return RemoveAdjacentDuplicates.removeAdjacentDuplicate((String)sb.toString());
    }
}

