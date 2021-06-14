/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  stack.StackImplementation
 *  stack.StackOprs
 */
package stack;

import java.io.PrintStream;
import stack.StackImplementation;

public class StackOprs {
    public static void main(String[] args) {
        StackImplementation st = new StackImplementation();
        st.getMin();
        System.out.println("Is stack full: " + st.isFull());
        st.push(10);
        st.push(20);
        st.push(20);
        st.push(50);
        System.out.println("Is stack Empty: " + st.isEmpty());
        st.printStack();
        st.pop();
        st.pop();
        st.getMin();
    }
}

