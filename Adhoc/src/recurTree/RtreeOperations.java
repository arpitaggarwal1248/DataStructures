package recurTree;

import java.util.ArrayList;
import java.util.List;

public class RtreeOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rtree bt1= new Rtree(10);
		Rtree bt2= new Rtree(20);
		Rtree bt3= new Rtree(30);
		Rtree bt4= new Rtree(40);
		Rtree bt5= new Rtree(50);
		Rtree bt6= new Rtree(60);
		Rtree bt7= new Rtree(70);
		Rtree bt8= new Rtree(80);
		Rtree bt9= new Rtree(90);
		Rtree bt10= new Rtree(100);

		bt1.setLeft(bt2);
		bt1.setRight(bt3);
		bt2.setLeft(bt4);
		bt2.setRight(bt5);
		bt3.setLeft(bt6);
		bt3.setRight(bt7);
		bt7.setLeft(bt8);
		bt7.setRight(bt9);
		bt9.setLeft(bt10);
		System.out.println(bt1.p(bt1));
		//System.out.println(bt1.pathOfSum(bt1,40));
	/*	List<Integer> list = new ArrayList<>();
		bt1.p(bt1);
		System.out.println(list);*/
	/*	List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		bt1.inOrder(bt1, list);
		System.out.println(list);
		Rtree at1=bt1.mirrorImage(bt1);
		bt1.inOrder(at1, list1);
		System.out.println(list1);*/
			

	/*	Rtree at2= new Rtree(20);
		Rtree at4= new Rtree(40);
		Rtree at5= new Rtree(50);

		Rtree ct2= new Rtree(20);
		Rtree ct4= new Rtree(40);
		Rtree ct5= new Rtree(50);

		at2.setLeft(at4);
		at2.setRight(at5);
		ct2.setLeft(ct5);
		ct2.setRight(ct4);
		System.out.println(bt1.mirrorImageCheck(at2, ct2));*/

		//System.out.println(bt1.aa(bt1,100));
		//	System.out.println(bt1.aa(bt1));
		//	System.out.println(bt1.pathOfSum(bt1,70));
		//int i=bt1.aa(bt1);
		//System.out.println(i);		
		//	System.out.println(	bt1.aa(bt1));
		//List l=bt1.inOrder(bt1, null);
		//System.out.println(l);
		//bt1.rootToLeftPathRecursive(bt1,null,0);
		//System.out.println(bt1.findSumOfNodes(bt1));;
		/*	boolean flag=bt1.searchElement(bt1, 60);
		System.out.println(flag);*/

		/*	int in[] = new int[]{40,20,50,10,60,30,80,70,100,90};
        int pre[] = new int[]{10,20,40,50,30,60,70,80,90,100};
       Rtree sNode= Rtree.createTreeWithTraversals(pre, in, 0, in.length-1);
    System.out.println("--");
       List<Integer> ino=  sNode.inOrder(sNode, null);
       System.out.println(ino);*/
	}

}
