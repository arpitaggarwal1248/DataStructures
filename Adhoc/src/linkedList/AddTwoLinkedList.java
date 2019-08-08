package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddTwoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={2,5,9};
		int b[]= {1,4,7};
		Llist [] ll1 = new Llist[10];
		Llist [] ll2 = new Llist[10];
		int i=1;
		Llist headnode1=new Llist(a[0]);
		for(int u:a )
		{
			ll1[i]= new Llist(u);
			ll1[i].sortedInsert(headnode1, ll1[i]);
			i++;
		}

		Llist headnode2=new Llist(b[0]);
		i=1;
		for(int u:b )
		{
			ll2[i]= new Llist(u);
			ll2[i].sortedInsert(headnode2, ll2[i]);
			i++;
		}

		List<Integer> al1=new ArrayList<>();
		List<Integer> al2=new ArrayList<>();
		List<Integer> al3=new ArrayList<>();
		Llist curr=headnode1;
		while(curr!=null)

		{
			al1.add(curr.getdata());
			curr=curr.getNext();
		}

		curr=headnode2;
		while(curr!=null)
		{
			al2.add(curr.getdata());
			curr=curr.getNext();
		}
		System.out.println(al1);
		System.out.println(al2);
		Collections.reverse(al1);
		Collections.reverse(al2);
		

		int cfwd=0;
		int sum=0;
		int n=0;
		int num=0;
		while(n<al1.size()){
			sum=al1.get(n)+al2.get(n)+cfwd;
			if(sum>=10)
			{
				num=sum%10;
				cfwd=sum/10;
			}
			else
			{
				num=sum;
				cfwd=0;
			}
			al3.add(num);
			n++;
		}
	
		Collections.reverse(al3);
		System.out.println(al3);
	
	}

}
