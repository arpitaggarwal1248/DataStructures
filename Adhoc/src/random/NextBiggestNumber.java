package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextBiggestNumber {

	static 	int pos;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2187996;
		int small=100;
		int pos2=0;

		List<Integer> arr= new ArrayList<>();
		while(a>0)
		{
			arr.add(a%10);
			a=a/10;
		}


		Collections.reverse(arr);
		System.out.println(arr);


		int sz=arr.size()-1;

		for(int i=sz;i>1;i--)
		{
			if(small>arr.get(i))
			{
				small=arr.get(i);
				pos2=i;
			}
			if(arr.get(i)>arr.get(i-1))
			{
				pos=i-1;
				break;
			}
		}
		
		System.out.println(pos+"--"+pos2);
		swap(pos,pos2,arr);
		List sub=arr.subList(pos+1, sz+1);
		Collections.sort(sub);
		List<Integer> finalList= new ArrayList<>();
		finalList.addAll(arr.subList(0, pos+1));
		finalList.addAll(sub);
		System.out.println("*****"+finalList);

	}



	private static void swap(int sz, int i, List<Integer> arr) {
		// TODO Auto-generated method stub
		int u=arr.get(i);
		arr.set(i, arr.get(sz));
		arr.set(sz, u);

	}
}
;