package random;

public class DuplicateAlphabets {

	public static void main(String[] args) {
		
		String a="arpitarpa";
	/*	boolean[] b= new boolean[256]; 
		for(int i=0;i<a.length();i++)
		{
			int u=a.charAt(i);
			if(b[u])
			{
				System.out.println(a.charAt(i)+" is duplicate");
			}
			else
			{
				b[u]=true;
			}
		}*/
		int arr[]= new int[128];
		for(int i=0;i<a.length();i++)
		{
			arr[a.charAt(i)]++;
		}
		for(int j=0;j<128;j++)
		{
		/*	if(arr[j]!=0)
			{
				System.out.println((char)j+" is unique");
			}*/
			if(arr[j]>1)
			{
				System.out.println((char)j+" is duplicate");
			}
		}
	}
}
