/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.NextGreatestElementInArray
 */
package Arrays;

import java.io.PrintStream;
import java.util.Stack;

/*
 * Exception performing whole class analysis ignored.
 */
public class NextGreatestElementInArray {
	public static void main(String[] args) {
		int[] arr = new int[]{4, 5, 2, 25};
		NextGreatestElementInArray.printNGE((int[])arr, (int)arr.length);
	}

	/*
	 * Unable to fully structure code
	 * Enabled aggressive block sorting
	 * Lifted jumps to return sites
	 */
	static void printNGE(int[] arr, int n) {
		Stack<Integer>   s = new Stack<Integer>();
		int arr1[] = new int[n];
		for (int i = n - 1; i >= 0; i--)  
		{
			while (!s.isEmpty() && s.peek() <= arr[i])  
				s.pop(); 
			if (s.empty())  
				arr1[i] = -1;          
			else
				arr1[i] = s.peek();          

			s.push(arr[i]);
		}
		for (int i = 0; i < n; i++)  
			System.out.println(arr[i] + " ---> " + arr1[i]);  
	}
}

