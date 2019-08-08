package matrix;

public class ZigzagMatrix {
	
	static int arr[][]={{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}};
	
	public static void main(String[] args) {
		int row=arr.length;
		int col=arr[0].length;
		printZigZag(arr,row,col);
		//printMyWay(arr,row,col);
	}

	private static void printMyWay(int[][] arr2, int row, int col) {
		int flag=1,count=0;
		for(int i=0;i<row;i++)
		{
			count++;
			if(flag==1)
			{
				count++;
				for(int j=0;j<col;j++)
					System.out.println(arr[i][j]);
			}
			else
			{
				count++;
				for(int j=col-1;j>=0;j--)
					System.out.println(arr[i][j]);
			}
			flag=Math.abs(flag-1);
		}
		System.out.println("count: "+count);
		
	}

	private static void printZigZag(int[][] arr2, int row, int col) {
		int even=0;
		int odd=1;
		int count=0;
		while(even<row)
		{
			count++;
			for (int i = 0; i < col; i++) 
            { 
                System.out.print(arr[even][i] + " ");  
                count++;
            } 
			even=even+2;
			if(odd<row)
			{
				for(int j=col-1;j>=0;j--)
					System.out.println(arr[odd][j]);
				count++;
			}
			odd+=2;
		}
		System.out.println("count: "+count);
		
	}

}
