package recurTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import tryTrees.Ttree;

public class Rtree {

	Rtree left;
	Rtree right;
	int data;

	public Rtree(int data) {
		this.data=data;
	}

	public void setLeft(Rtree left)
	{
		this.left=left;
	}
	public void setRight(Rtree right)
	{
		this.right=right;
	}

	public Rtree getLeft()

	{
		return left;
	}

	public Rtree getRight()
	{
		return right;
	}

	public int getData()
	{
		return data;
	}
	
	public int p(Rtree root)
	{
		if(root!=null)
		{
		return p(root.getLeft())+1+p(root.getRight());
		}
		else return 0;
	
	}
	public void printTreePathWithGivenSum(Rtree root, int sum,String path)
	{
		if(root!=null)
		{
			sum-=root.getData();
			path+="-->"+root.getData();
			if(sum==0)
			{
				System.out.println(path);
			}
			printTreePathWithGivenSum(root.getLeft(),sum,path);
			printTreePathWithGivenSum(root.getRight(), sum, path);
		}
	}
	public int maxElement(Rtree  root)
	{
		//complexity time: O(n) and space: O(n)
		int max=0;
		if(root!=null)
		{
			int rootVal=root.getData();
			int left=maxElement(root.getLeft());
			int right=maxElement(root.getRight());
			if(left>right)
				max=left;
			else max=right;
			if(rootVal>max)
				max=rootVal;
		}
		return max;
	}


	public boolean searchElement(Rtree root,int data)
	{
		//complexity time: O(n) and space: O(n)
		if(root==null)
			return false;
		else
			return searchElement(root.getLeft(), data)||searchElement(root.getRight(), data)|| root.getData()==data;
	}


	public int findSumOfNodes(Rtree root)
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			return (findSumOfNodes(root.getLeft())+root.getData()+findSumOfNodes(root.getRight()));
		}
	}

	public int findSize(Rtree root)
	{
		//complexity time: O(n) and space: O(n)
		if(root==null)
			return 0;
		else 
			return (findSize(root.getLeft())+1+findSize(root.getRight()));
	}

	public List<Integer> inOrder(Rtree root,List<Integer>list)
	{
		if(list==null)
		{
			list=new ArrayList<Integer>();
		}

		if(root!=null)
		{
			inOrder(root.getLeft(),list);
			list.add(root.getData());
			inOrder(root.getRight(),list);
		}
		return list;
	}

	public List<Integer> PreOrder(Rtree root,List<Integer>list)
	{
		if(list==null)
		{
			list=new ArrayList<Integer>();
		}

		if(root!=null)
		{
			list.add(root.getData());
			PreOrder(root.getLeft(),list);
			PreOrder(root.getRight(),list);
		}
		return list;
	}

	public List<Integer> PostOrder(Rtree root,List<Integer>list)
	{
		if(list==null)
		{
			list=new ArrayList<Integer>();
		}

		if(root!=null)
		{
			PostOrder(root.getLeft(),list);
			PostOrder(root.getRight(),list);
			list.add(root.getData());
		}
		return list;
	}

	public int height(Rtree root)
	{
		if(root!=null)
		{
			return (Math.max(height(root.getLeft()),height(root.getRight()))+1);
		}
		return 0;
	}

	public Rtree deepestNode(Rtree root)
	{
		Queue<Rtree> q= new LinkedList<Rtree>();
		if(root==null)
			return null;
		q.add(root);
		Rtree temp=null;
		while(!q.isEmpty())
		{
			temp=q.remove();
			if(temp.getLeft()!=null)
				q.add(deepestNode(temp.getLeft()));
			if(temp.getRight()!=null)
				q.add(deepestNode(temp.getRight()));
		}
		return temp;
	}

	public boolean pathOfSum(Rtree root, int sum)
	{
		if(root!=null)
		{
			sum-=root.getData();
			if(sum==0)
			{
				return true;
			}
			else 
			{
				return (pathOfSum(root.getLeft(), sum)||pathOfSum(root.getRight(), sum));
				/*if(pathOfSum(root.getLeft(), sum)==0)
					return 0;
				else return (pathOfSum(root.getRight(), sum));*/
			}
		}
		return false;
	}

	public void rootToLeftPathRecursive(Rtree root, int path[],int pathlen)
	{
		if(path==null)
		{
			path=new int[256];
		}
		if(root!=null)
		{
			path[pathlen]=root.getData();
			pathlen++;
			if(root.getLeft()==null && root.getRight()==null)
			{
				printPath(path,pathlen);
			}
			else
			{
				rootToLeftPathRecursive(root.getLeft(), path, pathlen);
				rootToLeftPathRecursive(root.getRight(), path, pathlen);
			}
		}
	}

	private void printPath(int[] path, int pathlen) {
		for(int i=0;i<pathlen;i++)
		{
			System.out.println(path[i]+" ");
		}
		System.out.println("---------------------------------------------");
	}

	public boolean printAllAncestors(Rtree root,Rtree node)
	{
		if(root==null)
			return false;
		if((root.getLeft()==node)||(root.getRight()==node)||(printAllAncestors(root.getLeft(), node))||(printAllAncestors(root.getRight(), node)))
		{
			System.out.println(root.getData());
			return true;
		}
		return false;
	}

	static int preIndex = 0;
	public static Rtree createTreeWithTraversals(int pre[],int inOrder[],int start,int end)
	{
		if(start>end)
			return null;
		Rtree node=new Rtree(pre[preIndex++]);
		System.out.println(preIndex);
		if(start==end)
			return node;
		int inIndex=search(inOrder,start,end,node.getData());
		node.setLeft(createTreeWithTraversals(pre, inOrder, start, inIndex-1));
		node.setRight(createTreeWithTraversals(pre, inOrder,inIndex+1,end));
		return node;
	}

	private static int search(int[] inOrder, int start, int end, int data2) {
		int i;
		for( i=start;i<=end;i++)
		{
			if(inOrder[i]==data2)
				return i;
		}
		return i;
	}

	public Rtree mirrorImage(Rtree root)
	{
		//create mirror tree
		// reverse inorder traversal of tree will be mirror image of tree
		if(root!=null)
		{
			mirrorImage(root.getLeft());
			mirrorImage(root.getRight());
			Rtree temp=root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
		}
		return root;
	}

	public boolean mirrorImageCheck(Rtree root1,Rtree root2)
	{
		// check if two trees are mirror image of each other
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		return  root1.getData()==root2.getData() 
				&& mirrorImageCheck(root1.getLeft(),root2.getRight()) 
				&& mirrorImageCheck(root1.getRight(), root2.getLeft());
	}

	public boolean checkIfGivenTreeIsSubtreeOfAnother(Rtree rootT,Rtree rootS)
	{
		if(rootT==null && rootS==null)
			return true;
		if(rootS==null || rootT==null)
			return false;
		if(areIdentical(rootT,rootS))
			return true;
		return checkIfGivenTreeIsSubtreeOfAnother(rootT.getLeft(), rootS)|| checkIfGivenTreeIsSubtreeOfAnother(rootT.getRight(), rootS);
	}

	private boolean areIdentical(Rtree rootT, Rtree rootS) {

		if(rootS==null && rootT==null)
			return true;
		if(rootS==null || rootT==null)
			return false;
		return rootT.getData()==rootS.getData()
				&& areIdentical(rootT.getLeft(), rootS.getLeft())
				&& areIdentical(rootT.getRight(), rootS.getRight());
	}
}
