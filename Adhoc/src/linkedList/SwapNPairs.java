package linkedList;

public class SwapNPairs {

	public static void main(String[] args) {
		int a[]={2,3,4,5,6};
		Llist headnode= new Llist(1);
		Llist [] ll = new Llist[10];
		int i=1;
		for(int u:a )
		{
			ll[i]= new Llist(u);
			headnode=ll[i].sortedInsert(headnode, ll[i]);
			i++;
		}
		headnode.listNode(headnode);

		System.out.println("---------");
		Llist backup= headnode.getNext();
		Llist tmp= headnode.getNext();
		Llist prev=headnode;
		while(headnode!=null && headnode.getNext()!=null)
		{
			prev.setNext(headnode.getNext());
			headnode.setNext(tmp.getNext());
			tmp.setNext(headnode);
			if(headnode.getNext()!=null)
			{
				prev=headnode;
				headnode=headnode.getNext();
				tmp=headnode.getNext();
			}
		}
		headnode=backup;
		headnode.listNode(headnode);
	/*	int n=2;
		Llist midele=headnode;
		Llist fnode=headnode;
		Llist pre= null;


		while(n>1 && midele.getNext()!=null)
		{
			midele=midele.getNext();
			n--;
		}


		headnode=revTillEle(pre,fnode, midele,flag);
		headnode.listNode(headnode);
		midele=fnode.getNext();

		pre=fnode;
		fnode=fnode.getNext();
		
		n=2;
		while(n>1 && midele.getNext()!=null)
		{
			midele=midele.getNext();
			n--;
		}
		System.out.println("mid"+midele.getdata());
		System.out.println("fnode"+fnode.getdata());
		System.out.println("Pre"+pre.getdata());
		revTillEle(pre, fnode, midele, false);
		headnode.listNode(headnode);*/

	}

	private static Llist revTillEle(Llist pre,Llist headnode, Llist Ele, boolean flag) {
		// TODO Auto-generated method stub

		Llist curr,prev,next,fnode;
		fnode=headnode;
		curr=headnode;
		prev=pre;
		do	
		{
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;
		}while(prev!=Ele);

		if(flag==true)
			headnode=prev;
		flag=false;
		System.out.println("--fnode"+fnode.getdata());
		System.out.println("--curr"+prev.getdata());
		fnode.setNext(next);
		return headnode;
	}

}
