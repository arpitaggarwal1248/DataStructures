/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryTrees.ConstructBinaryTreeWithOtherTraversals
 *  tryTrees.Ttree
 */
package tryTrees;

import java.util.List;
import tryTrees.Ttree;

/*
 * Exception performing whole class analysis ignored.
 */
public class ConstructBinaryTreeWithOtherTraversals {
    static int[] inOrder = new int[]{4, 2, 5, 1, 3, 6};
    static int[] preOrder = new int[]{1, 2, 4, 5, 3, 6};
    static int[] postOrder = new int[]{4, 5, 2, 6, 3, 1};

    public static void main(String[] args) {
        Ttree root = ConstructBinaryTreeWithOtherTraversals.createTreeInPostOrder((int)0, (int)(inOrder.length - 1), (int)0, (int)(preOrder.length - 1));
        root.pre(root);
        root.postTraverse(root);
        root.inorder(root);
    }

    private static Ttree createTreeInPreOrder(int lowIn, int highIn, int lowPre, int highPre) {
        if (lowIn > highIn || lowPre > highPre) {
            return null;
        }
        Ttree root = new Ttree(preOrder[lowPre]);
        int mid = ConstructBinaryTreeWithOtherTraversals.search((int)root.getData(), (int)lowIn, (int)highIn);
        int sizeOfLeftTree = mid - lowIn;
        int sizeOfRightTree = highIn - mid;
        root.setRight(ConstructBinaryTreeWithOtherTraversals.createTreeInPreOrder((int)(mid + 1), (int)highIn, (int)(lowPre + sizeOfLeftTree + 1), (int)(lowPre + sizeOfLeftTree + sizeOfRightTree)));
        root.setLeft(ConstructBinaryTreeWithOtherTraversals.createTreeInPreOrder((int)lowIn, (int)(mid - 1), (int)(lowPre + 1), (int)(lowPre + sizeOfLeftTree)));
        return root;
    }

    private static Ttree createTreeInPostOrder(int lowIn, int highIn, int lowPost, int highPost) {
        if (lowIn > highIn || lowPost > highPost) {
            return null;
        }
        Ttree root = new Ttree(postOrder[highPost]);
        int mid = ConstructBinaryTreeWithOtherTraversals.search((int)root.getData(), (int)lowIn, (int)highIn);
        int sizeOfLeftTree = mid - lowIn;
        int sizeOfRightTree = highIn - mid;
        root.setRight(ConstructBinaryTreeWithOtherTraversals.createTreeInPostOrder((int)(mid + 1), (int)highIn, (int)(highPost - sizeOfRightTree), (int)(highPost - 1)));
        root.setLeft(ConstructBinaryTreeWithOtherTraversals.createTreeInPostOrder((int)lowIn, (int)(mid - 1), (int)(highPost - sizeOfRightTree - sizeOfLeftTree), (int)(highPost - sizeOfRightTree - 1)));
        return root;
    }

    private static int search(int data, int lowIn, int highIn) {
        for (int i = 0; i < inOrder.length; ++i) {
            if (inOrder[i] != data) continue;
            return i;
        }
        return -1;
    }
}

