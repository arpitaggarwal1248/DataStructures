package random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Add one to a given number without using any Operator like +,-,*
 *
 */
public class AddOneToNumber {

	public static void main(String[] args) {

		int a=11;
		System.out.println(Integer.toBinaryString(a));
		int num=Integer.parseInt((Integer.toBinaryString(a)));
		List<Integer> b= new ArrayList<>();
		while(num>0)
		{
			b.add(num%10);
			num=num/10;
		}
		//Collections.reverse(b);
		System.out.println(b);
		for(int i=0;i<b.size();i++)
		{
			if(b.get(i)!=0)
			{
				b.set(i, 0);
			}
			else
			{
				b.set(i, 1);
				break;
			}
		}
		Collections.reverse(b);
		
		System.out.println(b);
	}
}
