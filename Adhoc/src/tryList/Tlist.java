/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.Tlist
 */
package tryList;

import java.io.PrintStream;

public class Tlist {
    Tlist next;
    int data;

    public Tlist(int data) {
        this.data = data;
    }

    public void setNext(Tlist next) {
        this.next = next;
    }

    public Tlist getNext() {
        return this.next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public Tlist insert(Tlist node, Tlist head) {
        if (head == null) {
            head = node;
            return head;
        }
        Tlist curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(node);
        return head;
    }

    public Tlist insertAtBegin(Tlist node, Tlist head) {
        node.setNext(head);
        head = node;
        return head;
    }

    public int listlen(Tlist head) {
        int count = 0;
        for (Tlist curr = head; curr != null; curr = curr.getNext()) {
            ++count;
            System.out.print(curr.getData());
            if (curr.getNext() == null) continue;
            System.out.print("-->");
        }
        System.out.println();
        return count;
    }

    public Tlist insertAtPos(Tlist node, Tlist head, int pos) {
        Tlist curr = head;
        Tlist prev = null;
        if (pos > head.listlen(head) - 1) {
            System.out.println("Invalid pos");
            return head;
        }
        for (int count = 0; pos != count; ++count) {
            prev = curr;
            curr = curr.getNext();
        }
        if (prev != null) {
            prev.setNext(node);
        }
        node.setNext(curr);
        if (pos == 0) {
            head = node;
        }
        return head;
    }

    public Tlist sortedInsert(Tlist node, Tlist head) {
        Tlist curr;
        if (head == null) {
            head = node;
            return head;
        }
        if (node.getData() < head.getData()) {
            node.setNext(head);
            head = node;
            return head;
        }
        Tlist prev = null;
        for (curr = head; curr != null && curr.getData() < node.getData(); curr = curr.getNext()) {
            prev = curr;
        }
        if (curr != null && curr.getData() == node.getData()) {
            System.out.println("Node already present");
            return head;
        }
        if (prev != null) {
            prev.setNext(node);
        }
        node.setNext(curr);
        return head;
    }

    public Tlist revList(Tlist head) {
        Tlist prev = null;
        Tlist curr = head;
        while (curr != null) {
            Tlist next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public void lastNthNode(Tlist head, int num) {
        Tlist fst = head;
        Tlist slw = head;
        while (num > 0) {
            --num;
            fst = fst.getNext();
        }
        while (fst != null) {
            fst = fst.getNext();
            slw = slw.getNext();
        }
        System.out.println(slw.getData());
    }

    public void palindrome(Tlist head) {
        Tlist fst = head;
        Tlist slw = head;
        int u = head.listlen(head);
        while (fst.getNext() != null) {
            fst = fst.getNext();
            slw = slw.getNext();
            if (fst.getNext() == null) continue;
            fst = fst.getNext();
        }
        System.out.println("mid:" + slw.getData());
        Tlist mid = slw;
        head = this.revTillMid(head, mid);
        System.out.println("rev List");
        head.listlen(head);
        System.out.println("---");
        if (u % 2 != 0) {
            slw = slw.getNext();
        }
        Tlist nhead = slw;
        while (head != null) {
            System.out.println(String.valueOf(head.getData()) + "--" + nhead.getData());
            if (head.getData() != nhead.getData()) break;
            head = head.getNext();
            nhead = nhead.getNext();
        }
        if (head == null) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }

    public Tlist kblocks(Tlist head, int n) {
        Tlist prev = null;
        Tlist curr = head;
        Tlist next = null;
        for (int count = 0; curr != null && count < n; ++count) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        if (next != null) {
            head.setNext(this.kblocks(next, n));
        }
        head = prev;
        return head;
    }

    private Tlist revTillMid(Tlist head, Tlist mid) {
        Tlist curr = head;
        Tlist prev = null;
        while (curr != mid) {
            Tlist next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public boolean isCircularList(Tlist head) {
        boolean loop = false;
        Tlist slw = head;
        Tlist fst = head;
        while (fst != null) {
            fst = fst.getNext();
            slw = slw.getNext();
            if (fst != null) {
                fst = fst.getNext();
            }
            if (fst != slw) continue;
            loop = true;
            Tlist junc = this.findLoop(head, fst);
            System.out.println(junc.getData());
            break;
        }
        return loop;
    }

    private Tlist findLoop(Tlist head, Tlist fst) {
        Tlist slw;
        for (slw = head; fst != slw; fst = fst.getNext(), slw = slw.getNext()) {
        }
        return slw;
    }
}

