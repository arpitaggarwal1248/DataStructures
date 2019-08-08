package random;

public class ClosestSquareRoot {
	static int num=15;
	static int mid;
	public static void main(String[] args) {
		int low=1;
		
		int high=num;
		 mid=findSqrt(low,high);
		 int result=0;
		int exp=mid*mid;
		if(exp==num)
			result=mid;
		else if(exp>num)
			result= (mid*mid)-num<((mid-1)*(mid-1)-num)?mid:mid-1;
		else 
			result= num-(mid*mid)<(num-(mid+1)*(mid+1))?mid:mid+1;
		System.out.println(result);
	}

	private static int findSqrt(int low, int high) {
		if(low<=high)
		{
			 mid=(low+high)/2;
			int result=mid*mid;
			if(result==num)
			{
				return mid;
			}
			else if(result<num)
				findSqrt(mid+1, high);
			else if(result>num)
			findSqrt(low, mid-1);
		}
		return mid;
	}
}
