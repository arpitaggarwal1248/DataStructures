package heap;

public class MaxHeap {

	int[] heap;
    int currSize;

    public MaxHeap(int sz) {
        this.heap = new int[sz];
        this.currSize = 0;
        this.heap[0] = Integer.MAX_VALUE;
    }

    public int getParent(int pos) {
        return pos / 2;
    }

    public int getLeft(int pos) {
        return 2 * pos;
    }

    public int getRight(int pos) {
        return 2 * pos + 1;
    }

    public void insert(int ele) {
        this.heap[++this.currSize] = ele;
        int current = this.currSize;
        while (this.heap[current] > this.heap[this.getParent(current)]) {
            this.swap(current, this.getParent(current));
            current = this.getParent(current);
        }
    }

    private void swap(int fpos, int spos) {
        int tmp = this.heap[fpos];
        this.heap[fpos] = this.heap[spos];
        this.heap[spos] = tmp;
    }

    public boolean isLeaf(int pos) {
        return pos >= this.currSize / 2 && pos <= this.currSize;
    }

    public void heapify(int pos) {
        if (this.isLeaf(pos)) {
            return;
        }
        if (this.heap[pos] < this.heap[this.getLeft(pos)] || this.heap[pos] < this.heap[this.getRight(pos)]) {
            if (this.heap[this.getLeft(pos)] < this.heap[this.getRight(pos)]) {
                this.swap(pos, this.getRight(pos));
                this.heapify(this.getRight(pos));
            } else {
                this.swap(pos, this.getLeft(pos));
                this.heapify(this.getLeft(pos));
            }
        }
    }

    public void print() {
        for (int i = 1; i <= this.currSize / 2; ++i) {
            System.out.print(" PARENT : " + this.heap[i] + " LEFT CHILD : " + this.heap[2 * i] + " RIGHT CHILD :" + this.heap[2 * i + 1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.print();
    }
}
