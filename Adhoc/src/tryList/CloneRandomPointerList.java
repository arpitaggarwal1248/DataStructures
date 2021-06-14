/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.ArbitaryList
 *  tryList.CloneRandomPointerList
 */
package tryList;

import java.io.PrintStream;
import tryList.ArbitaryList;

/*
 * Exception performing whole class analysis ignored.
 */
public class CloneRandomPointerList {
    public static void main(String[] args) {
        ArbitaryList head = new ArbitaryList(1);
        ArbitaryList head2 = new ArbitaryList(2);
        ArbitaryList head3 = new ArbitaryList(3);
        ArbitaryList head4 = new ArbitaryList(4);
        ArbitaryList head5 = new ArbitaryList(5);
        head.setNext(head2);
        head2.setNext(head3);
        head3.setNext(head4);
        head4.setNext(head5);
        head.setRandom(head3);
        head2.setRandom(head4);
        head3.setRandom(head5);
        head4.setRandom(null);
        head5.setRandom(head2);
        CloneRandomPointerList.addNodeInLinkedList((ArbitaryList)head);
        ArbitaryList curr = head;
        while (curr != null) {
            if (curr.getRandom() != null) {
                curr.next.setRandom(curr.getRandom().getNext());
            }
            curr = curr.getNext().getNext();
        }
        ArbitaryList cloneHead = head.getNext();
        cloneHead = CloneRandomPointerList.splitLinkedList((ArbitaryList)head, (ArbitaryList)cloneHead);
        CloneRandomPointerList.printList((ArbitaryList)cloneHead);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        CloneRandomPointerList.printList((ArbitaryList)head);
    }

    private static ArbitaryList splitLinkedList(ArbitaryList head, ArbitaryList cloneHead) {
        ArbitaryList curr = cloneHead;
        for (ArbitaryList curr1 = head; curr != null && curr1 != null; curr1 = curr1.getNext(), curr = curr.getNext()) {
            curr1.setNext(curr1.getNext() != null ? curr1.getNext().getNext() : curr.getNext());
            curr.setNext(curr.getNext() != null ? curr.getNext().getNext() : curr.getNext());
        }
        return cloneHead;
    }

    private static void addNodeInLinkedList(ArbitaryList head) {
        ArbitaryList curr = head;
        ArbitaryList next = null;
        while (curr != null) {
            next = curr.getNext();
            ArbitaryList node = new ArbitaryList(curr.getData());
            curr.setNext(node);
            node.setNext(next);
            curr = next;
        }
    }

    private static void printList(ArbitaryList head) {
        for (ArbitaryList curr = head; curr != null; curr = curr.getNext()) {
            System.out.print("Data: " + curr.getData() + "-- Random Pointer: ");
            System.out.println(curr.getRandom() != null ? curr.getRandom().getData() : -1);
        }
    }
}

