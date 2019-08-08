package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortAltList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input List:   10->40->53->30->67->12->89->NULL
		//Output List:  10->12->30->43->53->67->89->NULL

		Llist headnode= new Llist(10);
		Llist hn1= new Llist(40);
		Llist hn2= new Llist(53);
		Llist hn3= new Llist(30);
		Llist hn4= new Llist(67);
		Llist hn5= new Llist(12);
		Llist hn6= new Llist(89);
		headnode.setNext(hn1);
		hn1.setNext(hn2);
		hn2.setNext(hn3);
		hn3.setNext(hn4);
		hn4.setNext(hn5);
		hn5.setNext(hn6);

		int size=headnode.listNode(headnode);
		
		List<Integer> al1= new LinkedList();
		List<Integer> al2= new LinkedList();
		Llist curr=headnode;
		while(curr!=null)
		{al1.add(curr.getdata());
			curr=curr.getNext();
			if(curr!=null)
				curr=curr.getNext();
			
		}
		curr=headnode.getNext();
		while(curr!=null)
		{
			al2.add(curr.getdata());
			curr=curr.getNext();
			if(curr!=null)
				curr=curr.getNext();
		}
		System.out.println(al1);
		Collections.reverse(al2);
		System.out.println(al2);
		
	}
}