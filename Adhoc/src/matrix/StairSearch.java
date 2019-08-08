package matrix;

public class StairSearch {

	public static void main(String args[])
	{
		int mat[][]={{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		System.out.println(stairSearch(mat, 4, 12));
	}

	private static boolean stairSearch(int[][] mat, int n, int ele) {
		int r=0,c=n-1;
		while(r<n && c>=0)
		{
			int s=mat[r][c];
			if(s>ele)
				c--;
			else if(s<ele)
				r++;
			else return true;
		}
		return false;
	}

}
