/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  stack.ReverseStack
 */
package stack;

import java.io.PrintStream;
import java.util.Stack;

/*
 * Exception performing whole class analysis ignored.
 */
public class ReverseStack {
    static Stack<Integer> st2 = new Stack();

    public static void main(String[] args) {
        int[] arr;
        Stack<Integer> st = new Stack<Integer>();
        for (int u : arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8}) {
            st.push(u);
            st2.push(u);
        }
        Stack copy = ReverseStack.copyStack(st);
        System.out.println("Original Stack: " + st);
        System.out.println("Copied Stack: " + copy);
        Stack rev = ReverseStack.revStack();
        System.out.println("Reversed Stack: " + rev);
    }

    private static void insertAtBottom(int tmp) {
        if (st2.isEmpty()) {
            System.out.println("Pushed:" + tmp);
            st2.push(tmp);
        } else {
            int tmp2 = (Integer)st2.pop();
            System.out.println("Popped: " + tmp2);
            ReverseStack.insertAtBottom((int)tmp);
            System.out.println("Pushed:" + tmp2);
            st2.push(tmp2);
        }
    }

    private static Stack<Integer> revStack() {
        if (!st2.isEmpty()) {
            int tmp = (Integer)st2.pop();
            System.out.println("Popped: " + tmp);
            ReverseStack.revStack();
            ReverseStack.insertAtBottom((int)tmp);
        }
        return st2;
    }

    private static Stack<Integer> copyStack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int tmp = st.pop();
            System.out.println("Popped: " + tmp);
            ReverseStack.copyStack(st);
            System.out.println("Pushed: " + tmp);
            st.push(tmp);
        }
        return st;
    }
}

