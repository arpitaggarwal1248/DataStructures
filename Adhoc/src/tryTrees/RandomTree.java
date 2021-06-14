/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryTrees.RandomTree
 *  tryTrees.Ttree
 */
package tryTrees;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tryTrees.Ttree;

/*
 * Exception performing whole class analysis ignored.
 */
public class RandomTree {
    static List<Integer> list = new ArrayList();
    static Map<Integer, List<Integer>> map = new HashMap();

    public static void main(String[] args) {
        Ttree root = new Ttree(10);
        Ttree bt2 = new Ttree(20);
        Ttree bt3 = new Ttree(30);
        Ttree bt4 = new Ttree(40);
        Ttree bt5 = new Ttree(50);
        Ttree bt6 = new Ttree(60);
        Ttree bt7 = new Ttree(70);
        Ttree bt8 = new Ttree(80);
        Ttree bt9 = new Ttree(90);
        Ttree bt10 = new Ttree(100);
        root.setLeft(bt2);
        root.setRight(bt3);
        bt2.setLeft(bt4);
        bt2.setRight(bt5);
        bt3.setLeft(bt6);
        bt3.setRight(bt7);
        bt7.setLeft(bt8);
        bt7.setRight(bt9);
        bt9.setLeft(bt10);
        System.out.println(RandomTree.maxEle((Ttree)root));
    }

    private static int maxEle(Ttree root) {
        if (root == null) {
            return 0;
        }
        return RandomTree.maxEle((Ttree)root.getLeft()) + 1 + RandomTree.maxEle((Ttree)root.getRight());
    }

    private static int getLevel(Ttree root, Ttree node) {
        return RandomTree.getLevel((Ttree)root, (Ttree)node, (int)0);
    }

    private static int getLevel(Ttree root, Ttree node, int i) {
        if (root == null) {
            return 0;
        }
        if (root == node) {
            return i;
        }
        int curr = RandomTree.getLevel((Ttree)root.getLeft(), (Ttree)node, (int)(i + 1));
        if (curr != 0) {
            return curr;
        }
        return RandomTree.getLevel((Ttree)root.getRight(), (Ttree)node, (int)(i + 1));
    }

    public static boolean isCousin(Ttree root, Ttree node1, Ttree node2) {
        if (root == null) {
            return false;
        }
        if (node1 == node2) {
            return false;
        }
        return !RandomTree.isSibling((Ttree)root, (Ttree)node1, (Ttree)node2) && RandomTree.getLevel((Ttree)root, (Ttree)node1) == RandomTree.getLevel((Ttree)root, (Ttree)node2);
    }

    private static boolean isSibling(Ttree root, Ttree node1, Ttree node2) {
        if (root == null) {
            return false;
        }
        return RandomTree.isSibling((Ttree)root.getLeft(), (Ttree)node1, (Ttree)node2) || RandomTree.isSibling((Ttree)root.getRight(), (Ttree)node1, (Ttree)node2) || root.getLeft() == node2 && root.getRight() == node1 || root.getRight() == node1 && root.getLeft() == node1;
    }
}

