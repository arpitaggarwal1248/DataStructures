/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.RandomList
 *  tryList.Tlist
 */
package tryList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tryList.Tlist;

/*
 * Exception performing whole class analysis ignored.
 */
public class RandomList {
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
        Tlist head = RandomList.mergeSortedLists((Tlist)list1, (Tlist)list2);
        head.listlen(head);
    }

    private static Tlist mergeSortedLists(Tlist list1, Tlist list2) {
        Tlist result = null;
        Tlist head = null;
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        while (list1 != null) {
            if (list2 == null) {
                break;
            }
            if (list1.getData() < list2.getData()) {
                if (result == null) {
                    result = (head = list1);
                }
                else {
                    result.setNext(list1);
                    result = result.getNext();
                }
                list1 = list1.getNext();
            }
            else if (list1.getData() > list2.getData()) {
                if (result == null) {
                    result = (head = list2);
                }
                else {
                    result.setNext(list2);
                    result = result.getNext();
                }
                list2 = list2.getNext();
            }
            else {
                if (list1.getData() != list2.getData()) {
                    continue;
                }
                if (result == null) {
                    result = list1;
                }
                else {
                    result.setNext(list1);
                    result = result.getNext();
                }
                list1 = list1.getNext();
                list2 = list2.getNext();
            }
        }
        while (list1 != null) {
            result.setNext(list1);
            result = result.getNext();
            list1 = list1.getNext();
        }
        while (list2 != null) {
            result.setNext(list2);
            result = result.getNext();
            list2 = list2.getNext();
        }
        return head;
    }
    

    private static Tlist removeDuplicates(Tlist list1) {
        Tlist curr = list1;
        Tlist prev = list1;
        while (curr != null) {
            if (prev.getData() == curr.getData()) {
                curr = curr.getNext();
                continue;
            }
            prev.setNext(curr);
            prev = curr;
        }
        prev.setNext(null);
        return list1;
    }

    private static Tlist getIntersection(Tlist list1, Tlist list2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (list1 != null) {
            if (map.containsKey(list1.getData())) {
                map.put(list1.getData(), (Integer)map.get(list1.getData()) + 1);
            } else {
                map.put(list1.getData(), 1);
            }
            list1 = list1.getNext();
        }
        while (list2 != null) {
            if (map.containsKey(list2.getData())) {
                map.put(list2.getData(), (Integer)map.get(list2.getData()) + 1);
            } else {
                map.put(list2.getData(), 1);
            }
            list2 = list2.getNext();
        }
        Tlist result1 = null;
        Tlist curr1 = null;
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer)entry.getValue() != 1) continue;
            if (result1 == null) {
                curr1 = result1 = new Tlist(((Integer)entry.getKey()).intValue());
                continue;
            }
            curr1.setNext(new Tlist(((Integer)entry.getKey()).intValue()));
            curr1 = curr1.getNext();
        }
        return result1;
    }

    private static Tlist getUnion(Tlist list1, Tlist list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        Tlist result = null;
        Tlist curr = null;
        while (list1 != null) {
            if (set.add(list1.getData())) {
                if (result == null) {
                    curr = result = new Tlist(list1.getData());
                } else {
                    curr.setNext(new Tlist(list1.getData()));
                    curr = curr.getNext();
                }
            }
            list1 = list1.getNext();
        }
        while (list2 != null) {
            if (set.add(list2.getData())) {
                if (result == null) {
                    curr = result = new Tlist(list2.getData());
                } else {
                    curr.setNext(new Tlist(list2.getData()));
                    curr = curr.getNext();
                }
            }
            list2 = list2.getNext();
        }
        return result;
    }
}

