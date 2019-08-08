package matrix;

public class UniqueMatrix {

	static int [][]mat;
	static int n=5;
	public static void main(String[] args) {
		mat= new int [n][n];
		int left=0;
		int right=n-1;

		for (int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				mat[i][right]=1;
				fillOtherNums(i,right);
				right--;
			}
			else
			{
				mat[i][left]=1;
				fillOtherNums(i,left);
				left++;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.println("\n");
		}
	}

	
	private static void fillOtherNums(int i, int l) {
		int x=2;
		for(int k=i+1;k<n;k++)
		{
			mat[k][l]=x++;
		}
		for(int k=0;k<i;k++)
		{
			mat[k][l]=x++;
		}
	}
}
