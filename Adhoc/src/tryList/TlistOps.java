/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.Tlist
 *  tryList.TlistOps
 */
package tryList;

import tryList.Tlist;

public class TlistOps {
    public static void main(String[] args) {
        Tlist headnode = new Tlist(10);
        Tlist hn1 = new Tlist(20);
        Tlist hn2 = new Tlist(30);
        Tlist hn3 = new Tlist(40);
        Tlist hn4 = new Tlist(50);
        Tlist hn5 = new Tlist(60);
        Tlist hn6 = new Tlist(70);
        Tlist hn7 = new Tlist(80);
        Tlist hn8 = new Tlist(90);
        Tlist hn9 = new Tlist(100);
        Tlist hn10 = new Tlist(110);
        headnode.setNext(hn1);
        hn1.setNext(hn2);
        hn2.setNext(hn3);
        hn3.setNext(hn4);
        hn4.setNext(hn5);
        hn5.setNext(hn6);
        hn6.setNext(hn7);
        hn7.setNext(hn8);
        hn8.setNext(hn9);
        hn9.setNext(hn10);
        headnode = headnode.kblocks(headnode, 3);
        headnode.listlen(headnode);
    }
}

