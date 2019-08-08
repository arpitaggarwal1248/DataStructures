package linkedList;

public class RearranngeLinkedList {
	public static void main(String[] args) {

		//O/P: 1,5,2,4,3

		int a[]={2,3,4,5};
		Llist headnode= new Llist(1);
		Llist [] ll = new Llist[10];
		int i=1;
		for(int u:a )
		{
			ll[i]= new Llist(u);
			headnode=ll[i].sortedInsert(headnode, ll[i]);
			i++;
		}
		//headnode.listNode(headnode);
		
		/*Llist prev,curr,next,pre;
		prev=headnode;
		curr=headnode;
		pre=null;
		while(prev.getNext()!=null)
		{
			next=prev.getNext();
			while(curr.getNext()!=null)
			{
				pre=curr;
				curr=curr.getNext();
			}
			pre.setNext(null);
			prev.setNext(curr);
			curr.setNext(next);
			prev=next;
			curr=next;
		}
		headnode.listNode(headnode);*/
		Llist fast=headnode;
		Llist slow=headnode;
		while(fast.getNext()!=null)
		{
			fast=fast.getNext();
			slow=slow.getNext();
			if(fast.getNext()!=null)
				fast=fast.getNext();
		}
		Llist mid=slow;
		mid=revtillMid(mid);
		while(headnode!=mid.getNext() || mid!=slow)
		{
			if(headnode!=mid.getNext())
			{
			System.out.println(headnode.getdata());
			headnode=headnode.getNext();
			}
			if(mid!=slow)
			{
			System.out.println(mid.getdata());
			mid=mid.getNext();
			}
		}
	}

	private static Llist revtillMid(Llist headnode) {
		// TODO Auto-generated method stub
		
		Llist curr=headnode;
		Llist prev=null;
		while(curr!=null)
		{
			Llist nex=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=nex;
		}
		headnode=prev;
		return headnode;
	}
}
