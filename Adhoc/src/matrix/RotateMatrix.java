package matrix;


/**
 * to rotate matrix in left direction 	:: 	reverse -> transpose
 *					   right direction	:: 	transpose -> reverse
 */
public class RotateMatrix {

	static int arr[][]={{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}};

	
	public static void main(String[] args) {
		int n=arr.length;
		int m=arr[0].length;
		printMatrix(arr,n,m);
		transpose(arr,n,m);
		printMatrix(arr,n,m);
		reverseMatrix(arr,n,m);
		printMatrix(arr,n,m);
	}
	private static void transpose(int[][] arr2,int n,int m) {
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<m;j++)
			{
				swap(arr,i,j);
			}
		}
	}
	

	private static void swap(int[][] arr2, int i, int j) {
		int tmp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=tmp;
	}
	private static void reverseMatrix(int arr[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			int j=0,k=m;
			while(j<k)
			{
				int a = arr[i][j];
				arr[i][j]= arr[i][k-1];
				arr[i][k-1]=a;
				k--;
				j++;
			}
		}
	}

	private static void printMatrix(int arr[][],int n,int m)
	{

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print( arr[i][j]);	
				if(j!=arr.length-1)
					System.out.print(",");
			}
			System.out.println();
		}
		System.out.println("*************************");

	}

}

