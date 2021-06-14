/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryTrees.SerialiseNDeserialiseBT
 *  tryTrees.Ttree
 */
package tryTrees;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import tryTrees.Ttree;

/*
 * Exception performing whole class analysis ignored.
 */
public class SerialiseNDeserialiseBT {
    static int index = 0;

    public static void main(String[] args) {
        Ttree bt1 = new Ttree(7);
        Ttree bt2 = new Ttree(2);
        Ttree bt3 = new Ttree(1);
        Ttree bt4 = new Ttree(5);
        Ttree bt5 = new Ttree(13);
        Ttree bt6 = new Ttree(8);
        bt1.setLeft(bt2);
        bt2.setLeft(bt3);
        bt1.setRight(bt3);
        bt1.setRight(bt4);
        bt4.setLeft(bt5);
        bt4.setRight(bt6);
        ArrayList array = new ArrayList();
        bt1.pre(bt1);
        SerialiseNDeserialiseBT.serialise((Ttree)bt1, array);
        System.out.println("Serialized array\n" + array);
        Ttree nNode = SerialiseNDeserialiseBT.deSerialise(array);
        nNode.pre(nNode);
    }

    private static Ttree deSerialise(List<Integer> array) {
        if (index == array.size() || array.get(index) == -1) {
            ++index;
            return null;
        }
        Ttree root = new Ttree(array.get(index).intValue());
        ++index;
        root.setLeft(SerialiseNDeserialiseBT.deSerialise(array));
        root.setRight(SerialiseNDeserialiseBT.deSerialise(array));
        return root;
    }

    private static void serialise(Ttree root, List<Integer> array) {
        if (root == null) {
            array.add(-1);
        } else {
            array.add(root.getData());
            SerialiseNDeserialiseBT.serialise((Ttree)root.getLeft(), array);
            SerialiseNDeserialiseBT.serialise((Ttree)root.getRight(), array);
        }
    }
}

