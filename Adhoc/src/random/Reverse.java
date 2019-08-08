package random;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="((pqr)ab)";
		System.out.println(a);
		StringBuilder sb = new StringBuilder();
		boolean flag=false;
		Stack<Character> st = new Stack();
		for(char u: a.toCharArray())
		{
			if(Character.isLetter(u))
			{
				if(!flag)
				{
					st.push('*');
				}
				st.push(u);
				flag=true;
			}
			else
			{
				flag=false;
			}
		}
		System.out.println(st);
		flag=false;
		for(char q:a.toCharArray())
		{
			if(!Character.isLetter(q))
			{
				sb.append(q);
				flag=false;
			}
			else
			{

				while( !st.isEmpty() && flag==false)
				{

					char m=st.pop();
					if(m!='*')
						sb.append(m);
					else
					{
						flag=true;
						break;
					}
				}

			}
		}
		System.out.println(sb);
	}

}
