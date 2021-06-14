package rearrangeArray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReArrangeSortedArray {
	
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
		
		rearrarnge(arr);
	}

	private static void rearrarnge(int[] arr) {
		int minIndex=0;
		int maxIndex=arr.length-1;
		
		int maxNumber=arr[arr.length-1]+1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				arr[i]+=(arr[minIndex]%maxNumber)*maxNumber;
				minIndex++;
			}
			else
			{
				arr[i]+=(arr[maxIndex]%maxNumber)*maxNumber;
				maxIndex--;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]/maxNumber;
		}
		
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
	}

}
