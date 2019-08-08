package linkedList;

public class Llist {

	Llist next;
	int data;

	public Llist(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}

	public int getdata()
	{
		return data;
	}

	public void setdata(int data){
		this.data=data;
	}

	public Llist getNext()
	{
		return next;
	}
	public void setNext(Llist next)
	{
		this.next=next;
	}

	public Llist sortedInsert(Llist headnode, Llist newNode)
	{
		if(headnode==null)
		{
			headnode=newNode;

		}
		if(headnode.getdata()>newNode.getdata())
		{
			newNode.setNext(headnode);
			headnode=newNode;
			return headnode;
		}
		Llist curr = headnode;
		Llist prev=null;
		while(curr!=null && newNode.getdata()>curr.getdata())
		{
			prev=curr;
			curr=curr.getNext();
		}
		if(prev!=null)
		prev.setNext(newNode);
		newNode.setNext(curr);
		return headnode;
	}

	public int listNode(Llist headnode)
	{
		Llist curr= headnode;
		int count=0;
		while(curr!=null)
		{
			System.out.println(curr.getdata());
			curr=curr.getNext();
			count++;
		}
		return count;
	}

	public Llist revLinkedList(Llist headnode)
	{
		Llist prev=null;
		Llist curr=headnode;
		Llist next;
		while(curr!=null)
		{
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
		}
		headnode=prev;
		return headnode;
	}

	public int lastNthNode(Llist headnode, int n)
	{
		Llist fst=headnode;
		Llist slw=headnode;
		while(n>0)
		{
			fst=fst.getNext();
			
			n--;
		}
		while(fst!=null)
		{
			slw=slw.getNext();
			fst=fst.getNext();
		}
		return slw.getdata();
	}

	public void palindrome(Llist headnode)
	{
		int u=headnode.listNode(headnode);
		Llist fst=headnode;
		Llist slw=headnode;
		while(fst.getNext()!=null)
		{
			fst=fst.getNext();
			slw=slw.getNext();
			if(fst.getNext()!=null)
				fst=fst.getNext();
		}
		Llist mid=slw;
		System.out.println(mid.getNext().getdata());
		Llist nhead=revTillMid(headnode,mid);
		
		if(u%2!=0)
			mid=mid.getNext();
		while(mid!=null)
		{
			System.out.println(mid.getdata()+"--"+nhead.getdata());
			mid=mid.getNext();
			nhead=nhead.getNext();
		}
	}

	private Llist revTillMid(Llist headnode, Llist mid) {
		// TODO Auto-generated method stub
		Llist curr=headnode;
		Llist prev=null;
		while(curr!=mid)
		{
			Llist next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
		}
		headnode=prev;
		return headnode;
	}



}

