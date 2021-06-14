/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.EvenOddList
 *  tryList.Tlist
 */
package tryList;

import java.io.PrintStream;
import tryList.Tlist;

/*
 * Exception performing whole class analysis ignored.
 */
public class EvenOddList {
    public static void main(String[] args) {
        Tlist hn1 = new Tlist(1);
        Tlist hn2 = new Tlist(2);
        Tlist hn3 = new Tlist(4);
        Tlist hn4 = new Tlist(3);
        Tlist hn5 = new Tlist(6);
        hn1.setNext(hn2);
        hn2.setNext(hn3);
        hn3.setNext(hn4);
        hn4.setNext(hn5);
        System.out.println("Input");
        hn1.listlen(hn1);
        hn1 = EvenOddList.arrangeList((Tlist)hn1);
        System.out.println("Output");
        hn1.listlen(hn1);
    }

    private static Tlist arrangeList(Tlist head) {
        Tlist curr = head;
        Tlist oddCurr = null;
        Tlist evenCurr = null;
        Tlist oddFirst = null;
        Tlist evenFirst = null;
        while (curr != null) {
            if (curr.getData() % 2 == 0) {
                if (evenFirst == null) {
                    evenFirst = curr;
                    evenCurr = curr;
                } else {
                    evenCurr.setNext(curr);
                    evenCurr = curr;
                }
                curr = curr.getNext();
                continue;
            }
            if (curr.getData() % 2 == 0) continue;
            if (oddFirst == null) {
                oddFirst = curr;
                oddCurr = curr;
            } else {
                oddCurr.setNext(curr);
                oddCurr = curr;
            }
            curr = curr.getNext();
        }
        if (oddCurr != null) {
            oddCurr.setNext(null);
        }
        if (evenCurr != null) {
            evenCurr.setNext(oddFirst);
        }
        return evenFirst != null ? evenFirst : oddFirst;
    }
}

