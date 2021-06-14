/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.MergeSortedArrays
 */
package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int[] a = new int[]{12, 55, 78, 90};
		int[] b = new int[]{23, 45, 78, 99};
		int i=a.length-1;
		int j=b.length-1;
		while(i>=0 && j>=0)
		{
			if(a[i]<=b[j])
			{
				j--;
			}
			else {
				int temp=b[j];
				b[j]=a[i];
				int k=i-1;
				if(temp==a[k])
					a[i]=temp;
				else
				{
					while(k>=0 && a[k]>temp)
					{
						a[k+1]=a[k];
						k--;
					}
					if(k<0)
						a[0]=temp;
					else
						a[k+1]=temp;
				}
			}
		}
		System.out.println(Arrays.stream(a).boxed().collect(Collectors.toList()));
		System.out.println(Arrays.stream(b).boxed().collect(Collectors.toList()));
	}

	private static void mergeArraysWithoutUsingSpace(int[] a, int[] b) {
		int i=a.length-1;
		int j=b.length-1;
		while(i>=0 && j>=0)
		{
			if(a[i]==b[j])
			{
				j--;
			}
			else if(a[i]<b[j])
			{
				j--;
			}
			else {
				int temp=b[j];
				b[j]=a[i];
				int k=i-1;
				if(temp==a[k])
					a[i]=temp;
				else
				{
					while(k>=0 && a[k]>temp)
					{
						a[k+1]=a[k];
						k--;
					}
					if(k<0)
						a[0]=temp;
					else
						a[k+1]=temp;
				}
			}
		}
		System.out.println(Arrays.stream(a).boxed().collect(Collectors.toList()));
		System.out.println(Arrays.stream(b).boxed().collect(Collectors.toList()));
	}

	private static void mergeArrays(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length - 1 && j < b.length) {
			if (a[i] == b[j]) {
				c[k] = a[i];
				++i;
				++j;
				++k;
			}
			if (a[i] > b[j]) {
				c[k] = b[j];
				++k;
				++j;
			}
			if (a[i] >= b[j]) continue;
			c[k] = a[i];
			++i;
			++k;
		}
		while (i < a.length) {
			c[k] = a[i];
			++i;
			++k;
		}
		while (j < b.length) {
			c[k] = b[j];
			++j;
			++k;
		}
		for (int u : c) {
			if (u == 0) continue;
			System.out.println(u);
		}
	}
}

