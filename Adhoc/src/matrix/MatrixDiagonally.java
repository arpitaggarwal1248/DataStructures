package matrix;

/**
 * Explanation for below solution
 * https://www.ideserve.co.in/learn/print-matrix-diagonally
 */
public class MatrixDiagonally {

	static int [][]mat;
	static int n=5;
	static int m=3;

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



	private static void uniqueMatrix(int n) {

		int left=0;
		int right=n-1;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				mat[i][right]=1;
				fillOthers(i,right,n);
				right--;
			}
			else
			{
				mat[i][left]=1;
				fillOthers(i, left, n);
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

	private static void fillOthers(int i, int l, int n) {
		int x=2;
		for(int k=i+1;k<n;k++)
			mat[k][l]=x++;
		for(int k=0;k<i;k++)
			mat[k][l]=x++;
	}

	/** to print matrix in spiral
	 *sr- start of row
	 *sc- start of col
	 *er- end of row
	 *ec- end of col
	 *
	 *1st inner loop  : sc -> ec  and similarly in reverse
	 *2nd inner loop  : sr -> er and similarly in reverse
	 *
	 */
	private static void printSpiral(int rowCount, int colCount) {

		int sr=0,sc=0,er=rowCount-1,ec=colCount-1;
		while(sr<=er && sc<=ec)
		{
			for(int i=sc;i<ec;i++)
				System.out.print(mat[sr][i]+ " ");
			System.out.println();

			for(int i=sr;i<er;i++)
				System.out.print(mat[i][ec]+ " ");
			System.out.println();

			for(int i=ec;i>sc;i--)
				System.out.print(mat[er][i]+ " ");
			System.out.println();

			for(int i=er;i>sr;i--)
				System.out.print(mat[i][sc]+ " ");
			System.out.println();
			sr++;sc++;ec--;er--;
		}
	}

	private static void printZform(int rowCount,int colCount)
	{
		if(rowCount!=colCount)
			return;
		int col=0;
		int row;
		while(col<colCount-1)
		{
			System.out.println(mat[0][col]);
			col++;
		}
		System.out.println("*************8");
		row=0;
		while(col>=0 && row>=0)
		{
			System.out.println(mat[row][col]);
			col--;
			row++;
		}
		System.out.println("***********8");
		col=1;
		while(col<colCount)
		{
			System.out.println(mat[rowCount-1][col]);
			col++;
		}
	}


	private static void printDiagonally(int rowCount, int colCount) {
		int row,col;

		// look for position mat[0][0] and start loop
		for(int i=0;i<rowCount;i++)
		{
			row=i; col=0;
			while(row>=0 && col<colCount)
			{
				System.out.println(mat[row][col]);
				row--;
				col++;
			}
		}
		System.out.println("***************");

		// look for position mat[rowCount-1][1] and start loop
		for(int j=1;j<colCount;j++)
		{
			col=j;
			row=rowCount-1;
			while(row>=0 && col<colCount)
			{
				System.out.println(mat[row][col]);
				row--;
				col++;
			}
		}
	}
}
