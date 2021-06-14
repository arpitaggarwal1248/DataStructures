/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  trees.Btree
 */
package trees;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Stack;

public class Btree {
    int data;
    Btree left;
    Btree right;

    public Btree(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Btree getLeft() {
        return this.left;
    }

    public void setLeft(Btree left) {
        this.left = left;
    }

    public Btree getRight() {
        return this.right;
    }

    public void setRight(Btree right) {
        this.right = right;
    }

    public void preRecur(Btree root) {
        if (root != null) {
            System.out.println(root.getData());
            this.preRecur(root.getLeft());
            this.preRecur(root.getRight());
        }
    }

    public void postRecur(Btree root) {
        if (root != null) {
            this.postRecur(root.getLeft());
            this.postRecur(root.getRight());
            System.out.println(root.getData());
        }
    }

    public void printNodesAtKLevel(Btree root, int k) {
        if (k == 1) {
            System.out.println(root.getData());
        } else {
            this.printNodesAtKLevel(root.getLeft(), k - 1);
            this.printNodesAtKLevel(root.getRight(), k - 1);
        }
    }

    public boolean printNodesWithSum(Btree root, int sum) {
        if (sum == root.getData()) {
            System.out.println(root.getData());
            return true;
        }
        if (this.printNodesWithSum(root.getLeft(), sum - root.getData()) || this.printNodesWithSum(root.getRight(), sum - root.getData())) {
            System.out.println(root.getData());
            return true;
        }
        return false;
    }

    public void levelWithMaxSum(Btree root) {
        if (root == null) {
            return;
        }
        LinkedList<Btree> q = new LinkedList<Btree>();
        q.add(root);
        int level = 0;
        int maxLevel = 0;
        int max = 0;
        while (!q.isEmpty()) {
            ++level;
            int sum = 0;
            for (int sz = q.size(); sz > 0; --sz) {
                Btree tmp = (Btree)q.remove();
                sum += tmp.getData();
                if (tmp.getLeft() != null) {
                    q.add(tmp.getLeft());
                }
                if (tmp.getRight() == null) continue;
                q.add(tmp.getRight());
            }
            if (sum <= max) continue;
            max = sum;
            maxLevel = level;
        }
        System.out.println(max);
        System.out.println(maxLevel);
    }

    public void dimensions(Btree root) {
        if (root == null) {
            return;
        }
        LinkedList<Btree> q = new LinkedList<Btree>();
        q.add(root);
        int count = 0;
        int level = 0;
        int max = 0;
        while (!q.isEmpty()) {
            ++level;
            int sz = q.size();
            if (max < sz) {
                max = sz;
            }
            while (sz > 0) {
                Btree tmp = (Btree)q.remove();
                ++count;
                if (tmp.getLeft() != null) {
                    q.add(tmp.getLeft());
                }
                if (tmp.getRight() != null) {
                    q.add(tmp.getRight());
                }
                --sz;
            }
        }
        System.out.println("Width:" + max);
        System.out.println("size:" + count);
        System.out.println("level:" + level);
    }

    public void inorderRecur(Btree root) {
        if (root != null) {
            this.postRecur(root.getLeft());
            System.out.println(root.getData());
            this.postRecur(root.getRight());
        }
    }

    public void inorder(Btree root) {
        if (root == null) {
            return;
        }
        Stack<Btree> st = new Stack<Btree>();
        Btree tmp = root;
        do {
            if (tmp != null) {
                st.push(tmp);
                tmp = tmp.getLeft();
                continue;
            }
            if (st.isEmpty()) break;
            tmp = (Btree)st.pop();
            System.out.println(tmp.getData());
            tmp = tmp.getRight();
        } while (true);
    }

    public void post(Btree root) {
        Stack<Btree> st = new Stack<Btree>();
        Stack<Integer> out = new Stack<Integer>();
        if (root == null) {
            return;
        }
        st.push(root);
        while (!st.isEmpty()) {
            Btree tmp = (Btree)st.pop();
            if (tmp.getLeft() != null) {
                st.push(tmp.getLeft());
            }
            if (tmp.getRight() != null) {
                st.push(tmp.getRight());
            }
            out.push(tmp.getData());
        }
        System.out.println(out);
    }

    public void pre(Btree root) {
        Stack<Btree> st = new Stack<Btree>();
        if (root != null) {
            st.push(root);
            while (!st.isEmpty()) {
                Btree tmp = (Btree)st.pop();
                System.out.println(tmp.getData());
                if (tmp.getRight() != null) {
                    st.push(tmp.getRight());
                }
                if (tmp.getLeft() == null) continue;
                st.push(tmp.getLeft());
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void zigZag(final Btree root) {
        if (root == null) {
            return;
        }
        final Stack st1 = new Stack();
        final Stack st2 = new Stack();
        st1.push(root);
        while (!st1.isEmpty() || !st2.isEmpty()) {
            while (!st1.isEmpty()) {
                final Btree tmp = (Btree) st1.pop();
                System.out.println(tmp.getData());
                if (tmp.getRight() != null) {
                    st2.push(tmp.getRight());
                }
                if (tmp.getLeft() != null) {
                    st2.push(tmp.getLeft());
                }
            }
            while (!st2.isEmpty()) {
                final Btree tmp = (Btree) st2.pop();
                System.out.println(tmp.getData());
                if (tmp.getLeft() != null) {
                    st1.push(tmp.getLeft());
                }
                if (tmp.getRight() != null) {
                    st1.push(tmp.getRight());
                }
            }
        }
    }
    

    public void root2LeafNode(Btree root) {
        if (root == null) {
            return;
        }
        LinkedList<Object> q = new LinkedList<Object>();
        q.add((Object)root);
        q.add(String.valueOf(root.getData()));
        while (!q.isEmpty()) {
            Btree temp = (Btree)q.remove();
            String path = (String)q.remove();
            if (temp.getLeft() == null && temp.getRight() == null) {
                System.out.println(path);
            }
            if (temp.getLeft() != null) {
                q.add((Object)temp.getLeft());
                q.add(String.valueOf(path) + "-->" + temp.getLeft().getData());
            }
            if (temp.getRight() == null) continue;
            q.add((Object)temp.getRight());
            q.add(String.valueOf(path) + "-->" + temp.getRight().getData());
        }
    }

    public int getLevel(Btree root, Btree ele) {
        return this.getLevel(root, ele, 0);
    }

    private int getLevel(Btree root, Btree ele, int i) {
        if (root == null) {
            return 0;
        }
        if (root.getData() == ele.getData()) {
            return i;
        }
        int curr = this.getLevel(root.getLeft(), ele, i + 1);
        if (curr != 0) {
            return curr;
        }
        return this.getLevel(root.getRight(), ele, i + 1);
    }

    public int getMaxElement(Btree root) {
        int max = 0;
        if (root != null) {
            max = root.getData();
            int l = this.getMaxElement(root.getLeft());
            int r = this.getMaxElement(root.getRight());
            return Math.max(max, Math.max(l, r));
        }
        return max;
    }

    public int getSum(Btree root) {
        int max = 0;
        if (root != null) {
            max = root.getData() + this.getSum(root.getLeft()) + this.getSum(root.getRight());
            return max;
        }
        return max;
    }

    public int getTreeSize(Btree root) {
        int max = 0;
        if (root != null) {
            max = 1 + this.getTreeSize(root.getLeft()) + this.getTreeSize(root.getRight());
            return max;
        }
        return max;
    }

    public boolean printAncestors(Btree root, Btree ele) {
        if (root == null) {
            return false;
        }
        if (root != null && (root.getLeft() == ele || root.getRight() == ele || this.printAncestors(root.getLeft(), ele) || this.printAncestors(root.getRight(), ele))) {
            System.out.println(root.getData());
            return true;
        }
        return false;
    }

    public boolean searchElement(Btree root, int data) {
        if (root != null) {
            if (root.getData() == data) {
                return true;
            }
            if (this.searchElement(root.getLeft(), data)) {
                return true;
            }
            return this.searchElement(root.getRight(), data);
        }
        return false;
    }
}

