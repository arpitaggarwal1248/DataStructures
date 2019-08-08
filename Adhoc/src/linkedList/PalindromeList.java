package linkedList;

public class PalindromeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Llist headnode= new Llist(10);
		Llist hn1= new Llist(20);
		Llist hn2= new Llist(30);
		Llist hn3= new Llist(40);
		Llist hn4= new Llist(60);
		Llist hn5= new Llist(60);
		Llist hn6= new Llist(40);
		Llist hn7= new Llist(30);
		Llist hn8= new Llist(20);
		Llist hn9= new Llist(10);
		headnode.setNext(hn1);
		hn1.setNext(hn2);
		hn2.setNext(hn3);
		hn3.setNext(hn4);
		hn4.setNext(hn5);
		hn5.setNext(hn6);
		hn6.setNext(hn7);
		hn7.setNext(hn8);
		hn8.setNext(hn9);
		
		int size=headnode.listNode(headnode);
		
		Llist fst=headnode;
		Llist slw=headnode;
		
		while(fst.getNext()!=null)
		{
			fst=fst.getNext();
			slw=slw.getNext();
			
			if(fst.getNext()!=null)
			{
				fst=fst.getNext();
			
			}
		}
		Llist midEle=slw;
		

		System.out.println("Middle element"+midEle.getdata());
		headnode=revTillMid(headnode,midEle);
		System.out.println("-------");
		
			if(size%2!=0)
		{
		midEle=midEle.getNext();
		}
		while(midEle!=null)
		{
			System.out.println(headnode.getdata()+"--"+midEle.getdata());
			midEle=midEle.getNext();
			headnode=headnode.getNext();
		}

	}

	private static Llist revTillMid(Llist headnode, Llist midEle) {
		// TODO Auto-generated method stub
		
		Llist curr,prev,next;
		curr=headnode;
		prev=null;
		while(curr!=midEle)
		{
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
		}
		headnode=prev;
		return headnode;
		
	}

}
