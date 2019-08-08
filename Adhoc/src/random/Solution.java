package random;

public class Solution {
	private static int sum=1;
	public static void main(String[] args) {
	
fact(5);	
System.out.println(sum);
		}

	private static void fact(int num) {
		sum*=num;
		if(num>1)
			fact(num-1);
	}

	private static boolean findEle(int[] a, int start, int end,int ele) {
		// TODO Auto-generated method stub
		if(start<end)
		{
		int mid=(start+end)/2;
		if(a[mid]==ele)
			return true;
		else
		{
			if(findEle(a, 0, mid-1,ele))
				return true;
			else
				return findEle(a, mid+1, end,ele);
		}
		}
		return false;
	}
	
	public static int findMissing(int arr[],int low,int high)
	{
		 if (low == high)
	        {
	            return arr[high] - 1;
	        }
		if(low<high)
		{
		int mid=(low+high)/2;
		
		if(arr[mid]!=mid+1)
		{
			high=mid;
		}
		else
		{
			low=mid+1;
		
		}
		return findMissing(arr,low,high);
		
		}
		return 0;
		
	}
	}



