/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  stack.SortStack
 */
package stack;

import java.io.PrintStream;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        int[] a = new int[]{23, 12, 6, 34, 14, 56, 14, 90};
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> sec = new Stack<Integer>();
        for (int u : a) {
            st.push(u);
        }
        while (!st.isEmpty()) {
            int tmp = (Integer)st.pop();
            while (!sec.isEmpty() && (Integer)sec.peek() > tmp) {
                st.push((Integer)sec.pop());
            }
            sec.push(tmp);
        }
        while (!sec.isEmpty()) {
            System.out.println(sec.pop());
        }
    }
}

