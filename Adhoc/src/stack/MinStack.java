/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  stack.MinStack
 */
package stack;

import java.io.PrintStream;
import java.util.Stack;

public class MinStack {
    Stack<Integer> st1 = new Stack();
    Stack<Integer> st2 = new Stack();

    public void addtoStack(int data) {
        this.st1.push(data);
        if (!this.st2.isEmpty()) {
            if ((Integer)this.st2.peek() >= data) {
                this.st2.push(data);
            }
        } else {
            this.st2.push(data);
        }
    }

    public void removeFromStack() {
        int tmp = (Integer)this.st1.pop();
        if (tmp == (Integer)this.st2.peek()) {
            this.st2.pop();
        }
    }

    public void printStacks() {
        System.out.println("--------------------------------------");
        System.out.println(this.st1);
        System.out.println(this.st2);
        System.out.println("--------------------------------------");
    }

    public void getMin() {
        System.out.println("Minimum: " + this.st2.peek());
    }

    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.addtoStack(10);
        min.addtoStack(2);
        min.addtoStack(2);
        min.addtoStack(23);
        min.printStacks();
        min.getMin();
        min.removeFromStack();
        min.removeFromStack();
        min.printStacks();
    }
}

