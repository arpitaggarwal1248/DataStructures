package linkedList;

public class Tlist {
	Tlist next;
	int data;

	public Tlist(int data) {
		this.data=data;
	}

	public void setData(int data)
	{
		this.data=data;
	}

	public int getData()
	{
		return data;
	}

	public void setNext(Tlist node)
	{
		this.next=node;
	}

	public Tlist getNext()
	{
		return next;
	}

	public int listNode(Tlist head)
	{
		int count=0;
		Tlist curr=head;
		while(curr!=null)
		{
			System.out.print(curr.getData()+"-->");
			curr=curr.getNext();
			count++;
		}
		System.out.println();
		return count;
	}
	

	public Tlist sortedInsert(Tlist head,Tlist node)
	{
		if(head==null)
			return node;
		if(head.getData()>node.getData())
		{
			node.setNext(head);
			return node;
		}
		Tlist prev = null,curr=head;
		while(curr!=null && curr.getData()<node.getData())
		{
			prev=curr;
			curr=curr.getNext();
		}
		if(prev!=null)
			prev.setNext(node);
		node.setNext(curr);
		return head;
	}

	public Tlist insert(Tlist head,Tlist node)
	{
		if(head==null)
			return node;
		else
		{
			Tlist curr=head;
			while(curr.getNext()!=null)
				curr=curr.getNext();
			curr.setNext(node);
		}
		return head;
	}
	

	public Tlist findMiddleElement(Tlist head)
	{
		Tlist fst=head,slw=head;
		while(fst.getNext()!=null)
		{
			fst=fst.getNext();
			slw=slw.getNext();
			if(fst.getNext()!=null)
				fst=fst.getNext();
		}
		System.out.println("Middle Element: "+slw.getData());
		return slw;
	}

	public void palindrome(Tlist head)
	{
		int sz=listNode(head);
		Tlist breakPoint=findMiddleElement(head);

		Tlist breakHead=revTillMid(head,breakPoint);
		breakHead.listNode(breakHead);
		if(sz%2!=0)
			breakPoint=breakPoint.getNext();
		breakPoint.listNode(breakPoint);
	}

	public Tlist findElement(Tlist head, int num)
	{
		if(head.getData()==num)
			return head;
		Tlist curr=head;
		while(curr!=null)
		{
			if(	curr.getData()==num)
			{
				System.out.println("element found :"+	curr.getData());
				return curr;
			}
			else
				curr=curr.getNext();
		}

		return curr;
	}


	private Tlist revTillMid(Tlist head, Tlist breakPoint) {
		Tlist curr=head;
		Tlist prev=null;
		while(curr!=breakPoint)
		{Tlist nex=curr.getNext();
		curr.setNext(prev);
		prev=curr;
		curr=nex;

		}
		head=prev;
		return head;
	}

	public void lastNthNode(Tlist head, int n)
	{
		Tlist fst=head,slw=head;
		while(n>0)
		{
			fst=fst.getNext();
			n--;
		}
		while(fst!=null)
		{
			fst=fst.getNext();
			slw=slw.getNext();
		}
		System.out.println("lst nth node: "+slw.getData());
	}

	public Tlist revLinkedList(Tlist head)
	{
		Tlist curr=head,prev=null,next;
		while(curr!=null)
		{
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
		}
		head=prev;
		return		head;
	}
	
}
