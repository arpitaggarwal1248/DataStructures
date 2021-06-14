package circularList;

public class Clist {

	Clist next;
    int data;

    public Clist(int data) {
        this.data = data;
    }

    public void setNext(Clist next) {
        this.next = next;
    }

    public Clist getNext() {
        return this.next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public int listlen(Clist list1) {
        int count = 0;
        for (Clist curr = list1; curr != null; curr = curr.getNext()) {
            ++count;
            System.out.print(curr.getData());
            if (curr.getNext() == null) continue;
            System.out.print("-->");
        }
        System.out.println();
        return count;
    }

    public int countNodes(Clist head) {
        Clist curr = head;
        int count = 1;
        while (curr.getNext() != head) {
            curr = curr.getNext();
            ++count;
        }
        return count;
    }

    public void swapFirstNLastNode(Clist head) {
        Clist curr = head;
        Clist prev = null;
        while (curr.getNext() != head) {
            prev = curr;
            curr = curr.getNext();
        }
        prev.setNext(head);
        curr.setNext(head.getNext());
        head.setNext(curr);
        head = curr;
        do {
            System.out.println(curr.getData());
        } while ((curr = curr.getNext()) != head);
    }

    public void findMiddleNLastElement(Clist head) {
        Clist slw = head;
        Clist fst = head;
        while (fst.getNext() != head && fst.getNext().getNext() != head) {
            fst = fst.getNext().getNext();
            slw = slw.getNext();
        }
        if (fst.getNext().getNext() == head) {
            fst = fst.getNext();
        }
        System.out.println("Middle: " + slw.getData());
        System.out.println("End: " + fst.getData());
    }
}
