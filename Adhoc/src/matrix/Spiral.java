package matrix;

public class Spiral {

	static int [][]mat;
	static int n=4;

	public static void main(String[] args) {

		printMatrix(5,4);
	}
	private static void printMatrix(int n, int m) {
		mat=createMatrix(n,m);
		int si=0,sj=0;
		int ei=n-1;
		int ej=m-1;

		/*		while(si<ei && sj<ej)
		{
			for(int i=si;i<ej;i++)
				System.out.print(mat[si][i]);
			System.out.println();
			for(int j=sj;j<ei;j++)
				System.out.print(mat[j][ej]);
			System.out.println();
			for(int k=ej;k>si;k--)
				System.out.print(mat[ei][k]);
			System.out.println();
			for(int l=ei;l>sj;l--)
				System.out.print(mat[l][sj]);
			System.out.println();
			si++;sj++;
			ei--;ej--;
		}
		 */
		/*	while(si<ei && sj<ej)
		{
			for(int i=si;i<ej;i++)
			{
				System.out.print(mat[si][i]);
			}
			System.out.println();
			for(int j=sj;j<ei;j++)
				System.out.print(mat[j][ej]);
			System.out.println();
			for(int k=ej;k>si;k--)
				System.out.print(mat[ei][k]);
			System.out.println();
			for(int l=ei;l>sj;l--)
				System.out.print(mat[l][sj]);
			System.out.println();
			si++;sj++;
			ei--;ej--;*/

	

}
private static int[][] createMatrix(int n,int m) {
	// TODO Auto-generated method stub
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
}
