package random;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,34,15,12,54,23,34,1};
		
		int b[]= new int[500];
		System.out.println(b[0]);
		for(int i=0;i<a.length;i++)
		{
			if(b[a[i]]!=-1)
			{
				b[a[i]]=-1;
			}
			else
			{
				System.out.println(a[i]+" is duplicate number");
			}
		}
	}

}
