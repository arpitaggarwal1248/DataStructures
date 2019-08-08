package random;

import java.util.List;

public class RepetitiveSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastIndex=0;
		int count=0;
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		StringBuilder sb = new StringBuilder();
		while(lastIndex!=-1)
		{
			lastIndex=str.indexOf(findStr,lastIndex);
			System.out.println(lastIndex);
			if(lastIndex!=-1)
			{
				count++;
				lastIndex=lastIndex+findStr.length();
			}
		}
		System.out.println(count);
	}

}
