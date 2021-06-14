/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  string.BalanceParanthesis
 */
package string;

import java.io.PrintStream;
import java.util.Stack;

public class BalanceParanthesis {
    static String a = "{d{[d[((safd))]dfg]gf}}";

    public static void main(String[] args) {
        String result = "balanced";
        Stack<Character> st = new Stack<Character>();
        for (char u : a.toCharArray()) {
            if (Character.isLetter(u)) continue;
            if (u == '{') {
                st.push(Character.valueOf('}'));
                continue;
            }
            if (u == '[') {
                st.push(Character.valueOf(']'));
                continue;
            }
            if (u == '(') {
                st.push(Character.valueOf(')'));
                continue;
            }
            if (st.isEmpty() || ((Character)st.peek()).charValue() != u) {
                result = "not balanced";
                break;
            }
            st.pop();
        }
        if (!st.isEmpty()) {
            result = "not balanced";
        }
        System.out.println(result);
    }
}

