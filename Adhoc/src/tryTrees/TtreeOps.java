/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryTrees.Ttree
 *  tryTrees.TtreeOps
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
public class TtreeOps {
    static List<Integer> list = new ArrayList();
    static Map<Integer, List<Integer>> map = new HashMap();

    public static void main(String[] args) {
        Ttree bt1 = new Ttree(10);
        Ttree bt2 = new Ttree(20);
        Ttree bt3 = new Ttree(30);
        Ttree bt4 = new Ttree(40);
        Ttree bt5 = new Ttree(50);
        Ttree bt6 = new Ttree(60);
        Ttree bt7 = new Ttree(70);
        Ttree bt8 = new Ttree(80);
        Ttree bt9 = new Ttree(90);
        Ttree bt10 = new Ttree(100);
        bt1.setLeft(bt2);
        bt1.setRight(bt3);
        bt2.setLeft(bt4);
        bt2.setRight(bt5);
        bt3.setLeft(bt6);
        bt3.setRight(bt7);
        bt7.setLeft(bt8);
        bt7.setRight(bt9);
        bt9.setLeft(bt10);
        bt1.inorder(bt1);
        System.out.println("*********************************");
    }

    private static Ttree createBSTwithSortedArray(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int u = (start + end) / 2;
        Ttree t = new Ttree(array[u]);
        t.setLeft(TtreeOps.createBSTwithSortedArray((int[])array, (int)start, (int)(u - 1)));
        t.setRight(TtreeOps.createBSTwithSortedArray((int[])array, (int)(u + 1), (int)end));
        return t;
    }

    private static Ttree bst(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Ttree root = new Ttree(array[mid]);
        root.setLeft(TtreeOps.bst((int[])array, (int)start, (int)(mid - 1)));
        root.setRight(TtreeOps.bst((int[])array, (int)(mid + 1), (int)end));
        return root;
    }
}

