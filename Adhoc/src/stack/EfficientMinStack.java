/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  stack.EfficientMinStack
 */
package stack;

import java.io.PrintStream;
import java.util.Stack;

public class EfficientMinStack {
    Stack<Integer> st1 = new Stack();
    int min = Integer.MIN_VALUE;

    public void push(int data) {
        if (this.st1.isEmpty()) {
            this.min = data;
            this.st1.push(data);
        } else if (this.min > data) {
            this.st1.push(2 * data - this.min);
            this.min = data;
        } else {
            this.st1.push(data);
        }
    }

    public void printStacks() {
        System.out.println(this.st1);
    }

    public void getMin() {
        System.out.println(this.min);
    }

    public void pop() {
        int popped;
        if (!this.st1.isEmpty() && (popped = ((Integer)this.st1.pop()).intValue()) < this.min) {
            this.min = 2 * this.min - popped;
        }
    }

    public static void main(String[] args) {
        EfficientMinStack min = new EfficientMinStack();
        min.push(3);
        min.push(5);
        min.getMin();
        min.push(2);
        min.push(1);
        min.printStacks();
        min.getMin();
        min.pop();
        min.getMin();
        min.pop();
        min.getMin();
    }
}

