/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  trees.Btree
 *  trees.TreeOps
 */
package trees;

import java.io.PrintStream;
import trees.Btree;

public class TreeOps {
    public static void main(String[] args) {
        Btree bt1 = new Btree(10);
        Btree bt2 = new Btree(20);
        Btree bt3 = new Btree(30);
        Btree bt4 = new Btree(40);
        Btree bt5 = new Btree(50);
        Btree bt6 = new Btree(60);
        Btree bt7 = new Btree(70);
        Btree bt8 = new Btree(80);
        Btree bt9 = new Btree(90);
        Btree bt10 = new Btree(100);
        bt1.setLeft(bt2);
        bt1.setRight(bt3);
        bt2.setLeft(bt4);
        bt2.setRight(bt5);
        bt3.setLeft(bt6);
        bt3.setRight(bt7);
        bt7.setLeft(bt8);
        bt7.setRight(bt9);
        bt9.setLeft(bt10);
        System.out.println(bt1.searchElement(bt1, 40));
    }
}

