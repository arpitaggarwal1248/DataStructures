package linkedList;

public class SwapByPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Llist headnode= new Llist(10);
		Llist hn1= new Llist(2);
		Llist hn2= new Llist(40);
		Llist hn3= new Llist(90);
		Llist hn4= new Llist(69);
		Llist hn5= new Llist(30);
		Llist hn6= new Llist(70);
		Llist hn7= new Llist(8);
		Llist hn8= new Llist(15);
		headnode.setNext(hn1);
		hn1.setNext(hn2);
		hn2.setNext(hn3);
		hn3.setNext(hn4);
		hn4.setNext(hn5);
		hn5.setNext(hn6);
		hn6.setNext(hn7);
		hn7.setNext(hn8);
		
		int sz=headnode.listNode(headnode);
		System.out.println("---------------");
Llist curr,next,prev;
boolean flag=true;

		while(sz>0)
		{
			curr=headnode;
			prev=null;
			next=headnode.getNext();
			while(curr!=null && curr.getNext()!=null)
			{
				if(curr.getdata()>next.getdata())
				{
					swap(prev,curr,next);
					if(flag)
					{
						headnode=curr;
					}
				}
				prev=curr;
				curr=curr.getNext();
				if(curr!=null)
				next=curr.getNext();
				flag=false;
			}
			
			sz--;
		}
		headnode.listNode(headnode);
	}

	private static void swap(Llist prev, Llist curr, Llist next) {
		// TODO Auto-generated method stub
		
		curr.setNext(next.getNext());
		next.setNext(curr);
		if(prev!=null)
			prev.setNext(next);
	}


}
