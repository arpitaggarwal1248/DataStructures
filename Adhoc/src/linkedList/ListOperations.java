package linkedList;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tlist headnode= new Tlist(1);
		Tlist hn1= new Tlist(22);
		Tlist hn2= new Tlist(13);
		Tlist hn3= new Tlist(45);
		Tlist hn4= new Tlist(25);
		Tlist hn5= new Tlist(61);
		Tlist hn6= new Tlist(17);
		Tlist hn7= new Tlist(8);
		Tlist hn8= new Tlist(29);
		Tlist hn9= new Tlist(19);
		headnode=headnode.sortedInsert(headnode, hn1);
		headnode=headnode.sortedInsert(headnode, hn2);
		headnode=headnode.sortedInsert(headnode, hn3);
		headnode=headnode.sortedInsert(headnode, hn4);
		headnode=headnode.sortedInsert(headnode, hn5);
		headnode=headnode.sortedInsert(headnode, hn6);
		headnode=headnode.sortedInsert(headnode, hn7);
		headnode=headnode.sortedInsert(headnode, hn8);
		headnode=headnode.sortedInsert(headnode, hn9);
		headnode.listNode(headnode);
		headnode.listNode(headnode);
		/*
		 * headnode= revList(headnode,2); headnode.listNode(headnode);
		 */
		/*
		 * headnode.setNext(hn1); hn1.setNext(hn2); hn2.setNext(hn3); hn3.setNext(hn4);
		 * hn4.setNext(hn5); hn5.setNext(hn6); hn6.setNext(hn7); hn7.setNext(hn8);
		 * hn8.setNext(hn9);
		 */
		/*
		 * headnode=headnode.revLinkedList(headnode); headnode.listNode(headnode);
		 */
		//	headnode.listNode(headnode);
		//headnode.palindrome(headnode);


		/*	int a[]={10,20,5,40,30,90,50};
		Tlist headnode= new Tlist(10);
		Tlist [] ll = new Tlist[10];
		int i=1;
		for(int u:a )
		{
			ll[i]= new Tlist(u);
			headnode=ll[i].insert(headnode, ll[i]);
			i++;
		}
		//Tlist headnode=ll[1];
		headnode.listLength(headnode);
		System.out.println("----------------");
		headnode=headnode.revList(headnode);
		headnode.listLength(headnode);*/







	}

	private static Tlist revList(Tlist headnode,int n) {
		int count=0;
		if(headnode!=null)
		{
			Tlist prev=null,curr=headnode;
			Tlist next = null;
			while(n> count && curr!=null)
			{
				 next=curr.getNext();
				curr.setNext(prev);
				prev=curr;
				curr=next;
				count++;
			}
			
			if(next!=null)
			{
				headnode.setNext(revList(next, n));
			}
			return prev;
		}
		return headnode;
	}

}
