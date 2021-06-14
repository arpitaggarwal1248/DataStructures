/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  stack.StackImplementation
 */
package stack;

import java.io.PrintStream;

public class StackImplementation {
    int top = -1;
    int top1 = -1;
    int capacity = 10;
    int capacity1 = 10;
    int[] arr = new int[this.capacity];
    int[] arr1 = new int[this.capacity1];

    public boolean isEmpty() {
        return this.top == -1;
    }

    public int peek() {
        int obj = this.arr[this.top];
        return obj;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack is full");
        } else {
            this.arr[++this.top] = data;
            System.out.println(String.valueOf(data) + " is added");
            if (this.top1 == -1) {
                this.arr1[++this.top1] = data;
            } else if (data <= this.peek()) {
                this.arr1[++this.top1] = data;
            }
        }
    }

    public void pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is full");
        } else {
            int del = this.arr[this.top];
            --this.top;
            System.out.println(String.valueOf(del) + " is deleted");
            if (del == this.arr1[this.top1]) {
                --this.top1;
            }
        }
    }

    public void printStack() {
        for (int tmp = this.top; tmp >= 0; --tmp) {
            System.out.println(this.arr[tmp]);
        }
    }

    public void getMin() {
        if (this.top1 == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Minimum: " + this.arr1[this.top1]);
        }
    }
}

