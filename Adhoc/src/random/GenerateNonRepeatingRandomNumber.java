package random;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateNonRepeatingRandomNumber {

	public static void main(String[] args) {
		int max=10;
		int arr[]= new int[max+1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		while(max>0)
		{
			int n=ThreadLocalRandom.current().nextInt(0, max+1);
			int temp=arr[n];
			System.out.println(temp);
			arr[n]=arr[max];
			arr[max]=temp;
			max--;
		}
	}
		
}
