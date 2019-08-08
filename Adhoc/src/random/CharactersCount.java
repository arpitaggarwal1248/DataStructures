package random;

public class CharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int[128];
		String a ="aabcbcbcdddda";
		for(int i=0;i<a.length();i++)	
		{
			arr[a.charAt(i)]++;
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]!=0)
				
				System.out.print((char)j+":"+arr[j]+" ");
		}
	}

}
