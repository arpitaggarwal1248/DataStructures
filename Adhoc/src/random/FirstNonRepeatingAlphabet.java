package random;

/**
 * Time Complexity O(n)
 * Space Complexity O(n)
 *
 */
public class FirstNonRepeatingAlphabet {
	
	

	public static void main(String[] args) {
		String a="ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
		int[]index= new int[256];
		for(int i=0;i<256;i++)
		{
			index[i]=-1;
		}
		for(int i=0;i<a.length();i++)
		{
			if(index[a.charAt(i)]==-1)
			{
				index[a.charAt(i)]=i;
			}
			else
			{
				index[a.charAt(i)]=-2;
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<256;i++)
		{
			if(index[i]>0 && min>index[i])
				min=index[i];
		}
		System.out.println(min);
		System.out.println(a.charAt(min));
	}
}

