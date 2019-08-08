package matrix;

public class TryMatrix {

	static int [][]mat;
	static int n=4;
	static int m=4;

	static int arr[][]={{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}};

	private static int[][] createMatrix(int n,int m) {
		int x=1;
		mat=new int [n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]=x++;
				System.out.print(mat[i][j]);
				System.out.print("  ");
			}
			System.out.print("\n");
		}

		return mat;
	}

	public static void main(String[] args) {
		mat=new int[5][5];
		//	printSpiral(n,m);
		//uniqueMatrix(5);
		createMatrix(4, 4);
		printDiagonally(4, 4);
	}


	private static void printDiagonally(int n, int m) {

		for(int i=0;i<n;i++)
		{
			int r=i;
			int c=0;
			while(r>=0 && c<m)
			{
				System.out.println(mat[r][c]);
				r--;c++;
			}
		}

		for(int i=1;i<m;i++)
		{
			int r=n-1;
			int c=i;
			while(r>=0 && c<m)
			{
				System.out.println(mat[r][c]);
				r--;c++;
			}
		}
	}

	private static boolean stairSearch(int[][] arr, int ele) {
		int row=arr.length;
		int col=arr[0].length;
		int r=0,c=col-1;
		while(r<row && c>=0)
		{
			int s=arr[r][c];
			if(s<ele)
			{
				r++;
			}
			else if(s>ele)
			{
				c--;
			}
			else return true;
		}
		return false;
	}



}
