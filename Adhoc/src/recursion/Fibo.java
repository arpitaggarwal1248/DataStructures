package recursion;

public class Fibo {
	
/*	public static int  num(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return n*num(n-1);
		}
	}*/
	
	public static void  MyFibo(int n, int m,int k)
	{
		if(k>0)
		{
			//System.out.println(n);
			System.out.println(n);
			MyFibo(m, n+m, k-1);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(num(4));
		/* int n1=0;
		 int n2=1;
		 int n3;
		 System.out.println(n1);
		 System.out.println(n2);
		 int count=10;
		 while(count>0)
		 {
			 count--;
			 n3=n1+n2;
			 System.out.println(n3);
			 n1=n2;
			 n2=n3;
		 }*/
		MyFibo(0, 1, 10);
	}

}
