package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralMatrix {

	
	static int [][]mat;
	static int n=4;

	/*
	 * public static void main(String[] args) {
	 * 
	 * printMatrix(4,3); }
	 */
	private static void printMatrix(int n,int m) {
		mat=createMatrix(n,m);
		int sr=0,sc=0,er=n-1,ec=m-1;
	
		while(sr<=er && sc<=ec )
		{
			for(int i=sc;i<ec;i++)
			{
				System.out.print(mat[sr][i]);
			}
			System.out.println();
			for(int j=sr;j<er;j++)
			{
				System.out.print(mat[j][ec]);
			}
			System.out.println();
			for(int k=ec;k>sc;k--)
				System.out.print(mat[er][k]);
			System.out.println();
			for(int l=er;l>sr;l--)
			{
				System.out.print(mat[l][sc]);
			}
			System.out.println();
			sr++;sc++;er--;ec--;
		}
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
	
	public static void main(String[] args) {
		int b[]= {12,23,34};
		String a[]= {"arpit","aggarwal"};
		List<Integer> st	=	Arrays.stream(b).boxed().collect(Collectors.toList());
		List<String> st1	=	Arrays.stream(a).collect(Collectors.toList());
		System.out.println(st);
		System.out.println(st1);
		System.out.println((int)'z');
		
		String reg="AAaprit&*&(03484";
		System.out.println(reg.replaceAll("[^A-Za-z0-9]", ""));
		System.out.println(reg.replaceAll("[^0-9]", ""));
		System.out.println(reg.replaceAll("[^A-Za-z]", ""));
		System.out.println(reg.replaceAll("[A-Za-z0-9]", ""));
	}
}
