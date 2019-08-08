package random;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*n=arpit
p=par;
Find if anagram of p(par) is SubString of n (arpit)*/
public class AnagramSubString {

	public static void main(String[] args) {
		String s="arpit";
		String p="itp";
		int start=0;
		int end=0;

		Map<Character,Integer> str=new HashMap<Character,Integer>();
		Map<Character,Integer> sub=new HashMap<Character,Integer>();
		for(char x:p.toCharArray())

		{
			if(sub.containsKey(x))
				sub.put(s.charAt(end), sub.get(x)+1);
			else
			{
				sub.put(x, 1);
			}	
		}
		System.out.println(sub);
		while(end<s.length())
		{

			if(str.size()<p.length())
			{

				char u=s.charAt(end);
				if(str.containsKey(u))
					str.put(s.charAt(end), str.get(u)+1);
				else
				{
					str.put(u, 1);
				}
				end++;
			}
			else
			{
				System.out.println("comparing");
				System.out.println(str);
				System.out.println(sub);
				if(str.equals(sub)==true)
				{
					break;
				}
				else
				{
					char v=s.charAt(start);
					int num=str.get(v);
					if(num==1)
						str.remove(s.charAt(start));
					else
						str.put(s.charAt(start), str.get(s.charAt(start))-1);
					start++;
				}
			}

		}
		System.out.println(start);
		System.out.println(end);
	}

}