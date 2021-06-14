/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tryTrees.Ttree
 */
package tryTrees;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import trees.Btree;

/*
 * Exception performing whole class analysis ignored.
 */
public class Ttree {
	static List<Integer> result = new ArrayList();
	Ttree left;
	Ttree right;
	int data;

	public Ttree(int data) {
		this.data = data;
	}

	public void setLeft(Ttree left) {
		this.left = left;
	}

	public void setRight(Ttree right) {
		this.right = right;
	}

	public Ttree getLeft() {
		return this.left;
	}

	public Ttree getRight() {
		return this.right;
	}

	public int getData() {
		return this.data;
	}

	public void pre(Ttree root) {
		if (root != null) {
			Stack<Ttree> st = new Stack<Ttree>();
			st.push(root);
			while (!st.isEmpty()) {
				Ttree tmp = (Ttree)st.pop();
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
	 public void zigZag(final Ttree root) {
	        if (root == null) {
	            return;
	        }
	        final Stack st1 = new Stack();
	        final Stack st2 = new Stack();
	        st1.push(root);
	        while (!st1.isEmpty() || !st2.isEmpty()) {
	            while (!st1.isEmpty()) {
	                final Ttree tmp = (Ttree) st1.pop();
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

	public void level(Ttree root) {
		if (root != null) {
			LinkedList<Ttree> q = new LinkedList<Ttree>();
			q.add(root);
			while (!q.isEmpty()) {
				Ttree tmp = (Ttree)q.remove();
				System.out.println(tmp.getData());
				if (tmp.getLeft() != null) {
					q.add(tmp.getLeft());
				}
				if (tmp.getRight() == null) continue;
				q.add(tmp.getRight());
			}
		}
	}

	public List<Ttree> postTraverse(Ttree root) {
		System.out.println("Post-Order Traversal");
		ArrayList<Ttree> l = new ArrayList<Ttree>();
		Stack<Ttree> st1 = new Stack<Ttree>();
		Stack<Ttree> st2 = new Stack<Ttree>();
		if (root == null) {
			System.out.println("Root is null");
		}
		st1.push(root);
		while (!st1.isEmpty()) {
			Ttree tmp = (Ttree)st1.pop();
			if (tmp.getLeft() != null) {
				st1.push(tmp.getLeft());
			}
			if (tmp.getRight() != null) {
				st1.push(tmp.getRight());
			}
			st2.push(tmp);
		}
		while (!st2.isEmpty()) {
			Ttree t = (Ttree)st2.pop();
			System.out.println(t.getData());
			l.add(t);
		}
		return l;
	}

	public void r2l(Ttree root) {
		LinkedList<Object> q = new LinkedList<Object>();
		q.add((Object)root);
		q.add(String.valueOf(root.getData()));
		while (!q.isEmpty()) {
			Ttree tmp = (Ttree)q.remove();
			String path = (String)q.remove();
			if (tmp.getLeft() == null && tmp.getRight() == null) {
				System.out.println(path);
			}
			if (tmp.getLeft() != null) {
				q.add((Object)tmp.getLeft());
				q.add(String.valueOf(path) + "-->" + tmp.getLeft().getData());
			}
			if (tmp.getRight() == null) continue;
			q.add((Object)tmp.getRight());
			q.add(String.valueOf(path) + "-->" + tmp.getRight().getData());
		}
	}

	public List<Ttree> inorder(Ttree root) {
		System.out.println("Inorder Traversal");
		Ttree tmp = root;
		Stack<Ttree> q = new Stack<Ttree>();
		ArrayList<Ttree> q1 = new ArrayList<Ttree>();
		do {
			if (tmp != null) {
				q.push(tmp);
				tmp = tmp.getLeft();
				continue;
			}
			if (q.isEmpty()) break;
			tmp = (Ttree)q.pop();
			System.out.println(tmp.getData());
			q1.add(tmp);
			tmp = tmp.getRight();
		} while (true);
		return q1;
	}

	public void width(Ttree root) {
		LinkedList<Ttree> q = new LinkedList<Ttree>();
		q.add(root);
		int lvl = 0;
		int count = 0;
		int maxwidth = 0;
		while (!q.isEmpty()) {
			int sz = q.size();
			if (maxwidth < sz) {
				maxwidth = sz;
			}
			++lvl;
			while (sz > 0) {
				Ttree tmp = (Ttree)q.remove();
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
		System.out.println("Count: " + count + "  Level: " + lvl + "  Width: " + maxwidth);
	}

	public void rootTOLeaf(Ttree root) {
		LinkedList<Object> q = new LinkedList<Object>();
		q.add((Object)root);
		q.add(String.valueOf(root.getData()));
		while (!q.isEmpty()) {
			String rpath;
			Ttree tmp = (Ttree)q.poll();
			String path = (String)q.poll();
			if (tmp.getLeft() == null && tmp.getRight() == null) {
				System.out.println(path);
			}
			if (tmp.getLeft() != null) {
				q.add((Object)tmp.getLeft());
				rpath = String.valueOf(path) + "-->" + tmp.getLeft().getData();
				q.add(rpath);
			}
			if (tmp.getRight() == null) continue;
			q.add((Object)tmp.getRight());
			rpath = String.valueOf(path) + "-->" + tmp.getRight().getData();
			q.add(rpath);
		}
	}

	public boolean isBalancedTree(Ttree root) {
		if (root == null) {
			return true;
		}
		return this.checkHeight(root) != -1;
	}

	private int checkHeight(Ttree root) {
		if (root == null) {
			return 0;
		}
		int lheight = this.checkHeight(root.getLeft());
		if (lheight == -1) {
			return -1;
		}
		int rheight = this.checkHeight(root.getRight());
		if (rheight == -1) {
			return -1;
		}
		int diff = lheight - rheight;
		if (Math.abs(diff) > 1) {
			return -1;
		}
		return Math.max(lheight, rheight) + 1;
	}

	public void lca(Ttree root, Ttree node1, Ttree node2) {
		if (root == node1) {
			System.out.println("--------" + root.getData());
		} else if (node1.equals((Object)node2)) {
			System.out.println("--------" + node1.getData());
		} else if (node1.getLeft() == node2 || node1.getRight() == node2) {
			System.out.println("--------" + node1.getData());
		} else {
			List a = root.inorder(root);
			List b = root.postTraverse(root);
			List<Ttree> sub = a.subList(a.indexOf((Object)node1) + 1, a.indexOf((Object)node2));
			System.out.println("------");
			int max = -1;
			for (Ttree u : sub) {
				int index = b.indexOf((Object)u);
				if (max < index) {
					max = index;
				}
				System.out.println(u.getData());
			}
			System.out.println("lca:" + ((Ttree)b.get(max)).getData());
		}
	}

	public void findLevelWithMaxSum(Ttree root) {
		LinkedList<Ttree> q = new LinkedList<Ttree>();
		q.add(root);
		int lvl = 0;
		int maxSum = 0;
		int maxLevel = 0;
		while (!q.isEmpty()) {
			int sum = 0;
			++lvl;
			for (int sz = q.size(); sz > 0; --sz) {
				Ttree tmp = (Ttree)q.remove();
				sum += tmp.getData();
				if (tmp.getLeft() != null) {
					q.add(tmp.getLeft());
				}
				if (tmp.getRight() == null) continue;
				q.add(tmp.getRight());
			}
			if (sum <= maxSum) continue;
			System.out.println(sum);
			maxSum = sum;
			maxLevel = lvl;
		}
		System.out.println("MaxSum: " + maxSum + "  MaxLevel: " + maxLevel);
	}

	public void boundaryTraversal(Ttree root) {
		Ttree curr = root;
		this.printLeftBoundary(curr);
		System.out.println("******");
		this.printBottomNodes(curr);
		System.out.println("******");
		this.printRightBoundary(curr.getRight());
	}

	public boolean isCousin(Ttree root, Ttree node1, Ttree node2) {
		if (root == null) {
			return false;
		}
		if (node1 == node2) {
			return false;
		}
		return !this.isSibling(root, node1, node2) && this.getLevel(root, node1) == this.getLevel(root, node2);
	}

	private boolean isSibling(Ttree root, Ttree node1, Ttree node2) {
		if (root == null) {
			return false;
		}
		return root.getLeft() == node1 && root.getRight() == node2 || root.getLeft() == node2 && root.getRight() == node1 || this.isSibling(root.getLeft(), node1, node2) || this.isSibling(root.getRight(), node1, node2);
	}

	public int getLevel(Ttree root, Ttree node1) {
		return this.getLevel(root, node1, 1);
	}

	private int getLevel(Ttree root, Ttree node1, int level) {
		if (root == null) {
			return 0;
		}
		if (root == node1) {
			return level;
		}
		int curr = this.getLevel(root.getLeft(), node1, level + 1);
		if (curr != 0) {
			return curr;
		}
		return this.getLevel(root.getRight(), node1, level + 1);
	}

	private void printBottomNodes(Ttree curr) {
		if (curr != null) {
			if (curr.getLeft() == null && curr.getRight() == null) {
				System.out.println(curr.getData());
			}
			this.printBottomNodes(curr.getLeft());
			this.printBottomNodes(curr.getRight());
		}
	}

	private void printRightBoundary(Ttree curr) {
		if (curr != null) {
			if (curr.getRight() != null) {
				System.out.println(curr.getData());
				this.printRightBoundary(curr.getRight());
			} else if (curr.getLeft() != null) {
				System.out.println(curr.getData());
				this.printRightBoundary(curr.getLeft());
			}
		}
	}

	private void printLeftBoundary(Ttree curr) {
		if (curr != null) {
			if (curr.getLeft() != null) {
				System.out.println(curr.getData());
				this.printLeftBoundary(curr.getLeft());
			} else if (curr.getRight() != null) {
				System.out.println(curr.getData());
				this.printLeftBoundary(curr.getRight());
			}
		}
	}

	public void printNodesAtKDistance(Ttree root, int k) {
		if (root != null) {
			if (k == 0) {
				System.out.println(root.getData());
			} else {
				this.printNodesAtKDistance(root.getLeft(), k - 1);
				this.printNodesAtKDistance(root.getRight(), k - 1);
			}
		}
	}

	public void morrisTraversal(Ttree root) {
		Ttree curr = root;
		Ttree pre = null;
		while (curr != null) {
			if (curr.getLeft() == null) {
				System.out.println(curr.getData());
				curr = curr.getRight();
				continue;
			}
			pre = curr.getLeft();
			while (pre.getRight() != null && pre.getRight() != curr) {
				pre = pre.getRight();
			}
			if (pre.getRight() == null) {
				pre.setRight(curr);
				curr = curr.getLeft();
				continue;
			}
			pre.setRight(null);
			System.out.println(curr.getData());
			curr = curr.getRight();
		}
	}

	public static boolean printRootToLeafWithGivenSum(Ttree root, int sum, List<Integer> result) {
		if (root == null) {
			return false;
		}
		if (root.getData() == sum) {
			result.add(root.getData());
			return true;
		}
		if (Ttree.printRootToLeafWithGivenSum((Ttree)root.getLeft(), (int)(sum - root.getData()), result) || Ttree.printRootToLeafWithGivenSum((Ttree)root.getRight(), (int)(sum - root.getData()), result)) {
			result.add(root.getData());
			return true;
		}
		return false;
	}

	public void p(Ttree root) {
		Stack<Ttree> st = new Stack<Ttree>();
		Stack<Integer> st1 = new Stack<Integer>();
		st.add(root);
		while (!st.isEmpty()) {
			Ttree tmp = (Ttree)st.pop();
			if (tmp.getLeft() != null) {
				st.push(tmp.getLeft());
			}
			if (tmp.getRight() != null) {
				st.push(tmp.getRight());
			}
			st1.push(tmp.getData());
		}
		System.out.println(st1);
	}

	public static Map<Integer, List<Integer>> printTreeInVerticalOrder(Ttree root, int i, Map<Integer, List<Integer>> map) {
		if (root != null) {
			if (map.containsKey(i)) {
				List<Integer> l = map.get(i);
				l.add(root.getData());
				map.put(i, l);
			} else {
				ArrayList<Integer> r = new ArrayList<Integer>();
				r.add(root.getData());
				map.put(i, r);
			}
			Ttree.printTreeInVerticalOrder((Ttree)root.getLeft(), (int)(i - 1), map);
			Ttree.printTreeInVerticalOrder((Ttree)root.getRight(), (int)(i + 1), map);
		}
		return map;
	}

	public static Map<Integer, List<Integer>> printTreeInDiagonalOrder(Ttree root, int i, Map<Integer, List<Integer>> map) {
		if (root != null) {
			if (map.containsKey(i)) {
				List<Integer> l = map.get(i);
				l.add(root.getData());
				map.put(i, l);
			} else {
				ArrayList<Integer> r = new ArrayList<Integer>();
				r.add(root.getData());
				map.put(i, r);
			}
			Ttree.printTreeInDiagonalOrder((Ttree)root.getLeft(), (int)(i + 1), map);
			Ttree.printTreeInDiagonalOrder((Ttree)root.getRight(), (int)i, map);
		}
		return map;
	}
}

