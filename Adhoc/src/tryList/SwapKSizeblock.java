/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.SwapKSizeblock
 *  tryList.Tlist
 */
package tryList;

import java.io.PrintStream;
import tryList.Tlist;

/*
 * Exception performing whole class analysis ignored.
 */
public class SwapKSizeblock {
    public static void main(String[] args) {
        Tlist hn1 = new Tlist(1);
        Tlist hn2 = new Tlist(2);
        Tlist hn3 = new Tlist(3);
        Tlist hn4 = new Tlist(4);
        Tlist hn5 = new Tlist(5);
        Tlist hn6 = new Tlist(6);
        Tlist hn7 = new Tlist(7);
        Tlist hn8 = new Tlist(8);
        Tlist hn9 = new Tlist(9);
        Tlist hn10 = new Tlist(10);
        hn1.setNext(hn2);
        hn2.setNext(hn3);
        hn3.setNext(hn4);
        hn4.setNext(hn5);
        hn5.setNext(hn6);
        hn6.setNext(hn7);
        hn7.setNext(hn8);
        hn8.setNext(hn9);
        hn9.setNext(hn10);
        hn1.listlen(hn1);
        System.out.println("-----------");
        Tlist head = SwapKSizeblock.noderev((Tlist)hn1, (int)3);
        head.listlen(head);
    }

    private static Tlist noderev(Tlist head, int i) {
        Tlist curr = head;
        Tlist prev = null;
        Tlist next = null;
        for (int count = 0; count < i && curr != null; ++count) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        if (next != null) {
            head.setNext(SwapKSizeblock.noderev((Tlist)next, (int)i));
        }
        return prev;
    }
}

