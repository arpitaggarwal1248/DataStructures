/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryList.ArbitaryList
 */
package tryList;

public class ArbitaryList {
    ArbitaryList next;
    ArbitaryList random;
    int data;

    public ArbitaryList(int data) {
        this.data = data;
    }

    public ArbitaryList getNext() {
        return this.next;
    }

    public void setNext(ArbitaryList next) {
        this.next = next;
    }

    public ArbitaryList getRandom() {
        return this.random;
    }

    public void setRandom(ArbitaryList random) {
        this.random = random;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

