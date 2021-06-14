/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  stack.StackPractice
 */
package stack;

import java.io.PrintStream;
import java.util.Stack;

/*
 * Exception performing whole class analysis ignored.
 */
public class StackPractice {
    int min = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Stack<Integer> st = new Stack<Integer>();
        Stack sec = new Stack();
        for (int u : a) {
            st.push(u);
        }
        System.out.println(st);
        StackPractice.revStack(st);
        System.out.println(st);
    }

    private static void revStack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            StackPractice.revStack(st);
            StackPractice.insertAtBottom((int)temp, st);
        }
    }

    private static void insertAtBottom(int temp, Stack<Integer> st) {
        if (st.isEmpty()) {
            st.push(temp);
        } else {
            int temp2 = st.pop();
            StackPractice.insertAtBottom((int)temp, st);
            st.push(temp2);
        }
    }
}

