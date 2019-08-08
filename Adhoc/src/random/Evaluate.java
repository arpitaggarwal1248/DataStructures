package random;

public class Evaluate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	
		int arr[]= new int[]{0,1,2,3,4,5,6,7,8,9};
		int n=6;
		n=arr[arr[n]/2];
		System.out.println(arr[n]/2);*/
		String a="Albany";
		char arr[]=a.toLowerCase().toCharArray();
		int count[]= new int[128];
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		for(int i=0;i<a.length();i++)
		{
			int u=count[a.charAt(i)];
			if(u==1)
			{
				System.out.println(a.charAt(i)+" :It is first non repeating element");
				break;
			}
		}
	}

}
