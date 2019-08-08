package random;

public class Anagram {

	public static void main(String[] args) {

		String a="arpit";
		String sub="";
		perm(a,sub);
	}

	private static void permute(String a, String sub) {
		// TODO Auto-generated method stub
		int n=a.length();
		if(n==0)
			System.out.println(sub);
		else
		{
			for(int i=0;i<n;i++)
			{
				permute(a.substring(0, i)+a.substring(i+1,n), sub+a.charAt(i));
			}

		}

	}
	
	public static void perm(String s,String sub)
	{
		int n=s.length();
		if(n==0)
			System.out.println(sub);
		else
		{
			for(int i=0;i<n;i++)
			{
				perm(s.substring(0, i)+s.substring(i+1,n),sub+s.charAt(i));
			}
		}
	}
}
