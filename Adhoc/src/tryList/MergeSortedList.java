/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.MergeSortedList
 *  tryList.Tlist
 */
package tryList;

import tryList.Tlist;

/*
 * Exception performing whole class analysis ignored.
 */
public class MergeSortedList {
    public static void main(String[] args) {
        Tlist list1 = new Tlist(15);
        Tlist hn1 = new Tlist(19);
        Tlist hn2 = new Tlist(24);
        Tlist hn3 = new Tlist(44);
        Tlist hn4 = new Tlist(110);
        Tlist list2 = new Tlist(8);
        Tlist hn6 = new Tlist(14);
        Tlist hn7 = new Tlist(25);
        Tlist hn8 = new Tlist(29);
        Tlist hn9 = new Tlist(110);
        Tlist hn10 = new Tlist(120);
        list1.setNext(hn1);
        hn1.setNext(hn2);
        hn2.setNext(hn3);
        hn3.setNext(hn4);
        list2.setNext(hn6);
        hn6.setNext(hn7);
        hn7.setNext(hn8);
        hn8.setNext(hn9);
        hn9.setNext(hn10);
        list1.listlen(list1);
        list2.listlen(list2);
        Tlist head = MergeSortedList.mergeSortedListsRecursion((Tlist)list1, (Tlist)list2);
        head.listlen(head);
    }

    private static Tlist mergeSortedListsRecursion(Tlist list1, Tlist list2) {
        Tlist dummy;
        Tlist curr = dummy = new Tlist(0);
        if (list1 == null && list2 == null) {
            return null;
        }
        do {
            if (list1 != null) {
                continue;
            }
            curr.setNext(list2);
        } while (true);
    }
}

