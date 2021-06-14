package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arpit
 *
 *Trick: check if number is greater than sum, if greater sub start
 *check if num==sum
 *else sum+arr[i]
 */
public class SubArrayWithGivenSum {



	public static void main(String[] args) {
		int       arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 

		int sum=23;
		
		int[] arr1 = {10, 2, -2, -20, 10}; 
        int sum1 = -10; 

		subArrayWithGivenSum(arr, sum);
		subArrayWithGivenSumNegativeNumbers(arr1,sum1);
	}

	private static void subArrayWithGivenSumNegativeNumbers(int[] arr, int sum) {
		
		
		// this can handle array with negative and positive values both
		
		int curr=0;
		int start = 0; 
        int end = -1; 
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i=0;i<arr.length;i++)
        {
        	curr+=arr[i];
        	if(curr==sum)
        	{
        		System.out.println("mil gaya");
        		System.out.println(start);
        		System.out.println(i);
        		break;
        	}
        	if(map.containsKey(curr-sum))
        	{
        		start=map.get(curr-sum)+1;
        		end=i;
        		System.out.println(start);
        		System.out.println(end);
        		break;
        	}
        	else
        	map.put(curr, i);
        	
        }
		
	}

	private static void subArrayWithGivenSum(int[] arr, int sum) {
		int curr=arr[0];
		int start=0;
		for(int i=1;i<arr.length;i++)
		{
			while(curr>sum && start<arr.length-1)
			{
				curr-=arr[start];
				start++;
			}
			if(curr==sum)
			{
				System.out.println("mil gaya");
				System.out.println(start);
				System.out.println(i-1);
				break;
			}
			if(i<arr.length)
				curr+=arr[i];

		}
		if(curr!=sum)
			System.out.println("not found");
	}

}

