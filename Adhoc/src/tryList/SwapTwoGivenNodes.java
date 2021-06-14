/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.SwapTwoGivenNodes
 *  tryList.Tlist
 */
package tryList;

import java.io.PrintStream;
import tryList.Tlist;

/*
 * Exception performing whole class analysis ignored.
 */
public class SwapTwoGivenNodes {
    public static void main(String[] args) {
        Tlist head = new Tlist(10);
        Tlist hn2 = new Tlist(15);
        Tlist hn3 = new Tlist(12);
        Tlist hn4 = new Tlist(13);
        Tlist hn5 = new Tlist(20);
        Tlist hn6 = new Tlist(14);
        head.setNext(hn2);
        hn2.setNext(hn3);
        hn3.setNext(hn4);
        hn4.setNext(hn5);
        hn5.setNext(hn6);
        head.listlen(head);
        System.out.println("********************************");
        head = SwapTwoGivenNodes.swapNodes((Tlist)head, (int)10, (int)20);
        head.listlen(head);
    }

    private static void swap(Tlist head, int x, int y) {
        Tlist currY;
        Tlist currX;
        if (x == y) {
            return;
        }
        Tlist prevX = null;
        for (currX = head; currX != null && currX.getData() != x; currX = currX.getNext()) {
            prevX = currX;
        }
        Tlist prevY = null;
        for (currY = head; currY != null && currY.getData() != y; currY = currY.getNext()) {
            prevY = currY;
        }
        if (currX == null || currY == null) {
            return;
        }
        if (prevX != null) {
            prevX.setNext(currY);
        } else {
            head = currY;
        }
        if (prevY != null) {
            prevY.setNext(currX);
        } else {
            head = currX;
        }
        Tlist temp = currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(temp);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Tlist swapNodes(Tlist head, final int x, final int y) {
        Tlist prevX = null;
        Tlist prevY = null;
        Tlist currX = head;
        Tlist currY = head;
        if (x == y) {
            return head;
        }
        while (currX != null) {
            if (currX.getData() == x) {
                break;
            }
            prevX = currX;
            currX = currX.getNext();
        }
        while (currY != null && currY.getData() != y) {
            prevY = currY;
            currY = currY.getNext();
        }
        if (currX == null || currY == null) {
            return head;
        }
        if (prevX != null) {
            prevX.setNext(currY);
        }
        else {
            head = currY;
        }
        if (prevY != null) {
            prevY.setNext(currX);
        }
        else {
            head = currX;
        }
        final Tlist tmp = currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(tmp);
        return head;
    }
}

