package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution1 {
	public static void main(String[] args) {

		mergeSortedArray();
	}

	private static void mergeSortedArray() {
		int[] a = new int[]{12, 55, 78, 90};
		int[] b = new int[]{23, 45, 73, 99};

		int i=a.length-1;
		int j=b.length-1;

		while(i>=0 && j>=0)
		{
			if(b[j]>a[i])
			{
				j--;
			}
			else if(b[j]<a[i])
			{
				int temp=b[j];
				b[j]=a[i];
				int k=i-1;
				while(k>=0 && a[k]>temp)
				{
					a[k+1]=a[k];
				}
				a[k]=temp;
			}
		}
		System.out.println(Arrays.stream(a).boxed().collect(Collectors.toList()));
		System.out.println(Arrays.stream(b).boxed().collect(Collectors.toList()));
	}

	private static void subArrayWithGivenSum() {

		int arr[] = {10, -5, -2, -20, 10};

		int sum=-27;
		int curr=0;
		int start=0;
		int end=-1;
		Map<Integer,Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			curr+=arr[i];
			if(curr==sum)
			{start=0;
			end=i;
			break;
			} 
			if(map.containsKey(curr-sum))
			{
				start=map.get(curr-sum)+1;
				end=i;
				break;
			}
			map.put(curr, i);
			System.out.println(map);
		}
		System.out.println(end);
		System.out.println(start);

	}

	private static void collateArrays() {
		int[] arr = new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9, -5};
		int low=0;
		int mid=0;
		int high=arr.length-1;

		while(mid<arr.length)
		{
			if(arr[mid]<0)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			else
				mid++;
		}
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
	}

	private static void missingNumberInSortedArray() {
		int[] arr = new int[]{1,2, 3, 4,5, 6,7};

		int low=0,high=arr.length-1;
		while(low<high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==mid+1)
				low=mid+1;
			else
				high=mid;
		}
		System.out.println(arr[low]-1);
	}


	private static void rainwater() {
		int[] tower = new int[]{1, 5, 2, 3, 1, 7, 2};
		int right[]=new int[tower.length];
		int max=-1;
		for(int i=tower.length-1;i>=0;i--)
		{
			if(tower[i]>max)
			{
				max=tower[i];
			}
			right[i]=max;
		}
		int left=0;
		int stagnantWater=0;
		for(int i=0;i<tower.length;i++)
		{
			stagnantWater+=Math.max( Math.min(left, right[i])-tower[i],0);
			left=tower[i]>left?tower[i]:left;
		}
		System.out.println(stagnantWater);


	}

	private static void leftRightSum(int[] arr) {

		int rSum=0;
		for(int i=1;i<arr.length;i++)
			rSum+=arr[i];
		int lsum=0;
		int j=1;
		for(int i=0;i<arr.length-1;i++,j++)
		{
			lsum+=arr[i];
			rSum-=arr[j];
			if(lsum==rSum)
			{
				System.out.println("mil gaya");
				System.out.println(i);
				System.out.println(j);
				break;

			}
		}
	}

	private static void revArrayInGroup(int[] arr, int n, int k) {
		for(int i=0;i<n;i+=k)
		{
			int left=i;
			int right=i+k-1>n-1?n-1:i+k-1;
			while(left<right)
			{
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
				right--;
				System.out.println("Fas gaya");
			}
		}
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
	}
	private static void revArray(int[] arr, int n, int k) {
		if (k < 1) {
			return;
		}
		for (int i = 0; i < n; i += k) {
			int left = i;
			for (int right = i + k - 1 > n - 1 ? n - 1 : i + k - 1; left < right; --right, ++left) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}
		}
	}

	public  static <T> void  permute(T[] arr, int n)
	{
		if(arr.length==n)
		{
			for(T t:arr)
			{
				System.out.print(t);
			}
			System.out.println();
		}
		else
		{
			for(int i=n;i<arr.length;i++)
			{
				swap(arr,n,i);
				permute(arr, n+1);
				swap(arr,n,i);
			}
		}
	}

	private static <T> void swap(T[] arr, int n, int i) {
		T tmp=arr[i];
		arr[i]=arr[n];
		arr[n]=tmp;
	}

	private static void moveZeroToEnd() {
		int[] arrn = new int[8];
		arrn[0] = 1;
		arrn[1] = 2;
		arrn[3] = 4;
		arrn[4] = 3;
		arrn[6] = 5;
		int[] arr = arrn;

		int low=0; int mid=0;
		while(mid<arr.length)
		{
			if(arr[mid]!=0)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			else
				mid++;
		}
		System.out.println(	        Arrays.stream(arr).boxed().collect(Collectors.toList()));

	}

	private static void nextGreatestElement() {
		int[] arr = new int[]{4, 5, 2, 25};

		Stack<Integer> st=new Stack<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(!st.isEmpty() && arr[i]>st.peek())
				st.pop();
			if(st.isEmpty())
				System.out.println(-1);
			else
				System.out.println(st.peek());
			st.push(arr[i]);

		}

	}

	private static int findNumInArray(int[] arr, int low, int high, int pivot, int ele) {
		if(low>=high)
			return -1;
		if(arr[pivot]==ele)
			return pivot;
		int mid=(low+high)/2;
		int num=		binarySearch(arr, low, mid-1, ele);
		if(num!=-1)
			return num;
		else return binarySearch(arr, mid+1, high, ele);

	}

	private static int binarySearch(int[] arr, int low, int high, int ele) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == ele) {
				return mid;
			}
			if (ele > arr[mid]) {
				return binarySearch((int[])arr, (int)(mid + 1), (int)high, (int)ele);
			}
			return binarySearch((int[])arr, (int)low, (int)(mid - 1), (int)ele);
		}
		return -1;
	}

	private static int findPivot(int[] arr,int low,int high) {
		if(low>=high)
			return arr.length-1;
		int mid=(low+high)/2;
		if(low<mid && arr[mid-1]>arr[mid])
			return mid-1;
		if(mid<high && arr[mid]>arr[mid+1])
			return mid;
		int num = -1;
		if(mid<high)
			num=	findPivot(arr, low, mid-1);
		if(num!=-1)
			return num;
		else
			return findPivot(arr, mid+1, high);
	}

	private static int[] rotationalArray() {

		int[] a = new int[]{1, 2,3,4,5};
		int out[]=new int[a.length];
		int n=a.length;
		int k=3;
		for(int i=0;i<a.length;i++)
		{
			int pos=(i+(k%n))%n;
			out[pos]=a[i];
		}
		System.out.println(Arrays.stream(out).boxed().collect(Collectors.toList()));
		return out;
		//
	}

	private static void consecutiveArray() {
		int[] a = new int[]{1, 56, 57, 58, 91, 92, 93, 94, 91, 45};

		int curr=1;
		int max=-1;
		int end=-1;

		for(int i=1;i<a.length;i++)
		{
			if(a[i]-1==a[i-1])
			{
				curr++;
				if(curr>max)
				{
					max=curr;
					end=i;
				}
			}
			else 
				curr=1;

		}
		System.out.println(max);
		System.out.println(end);
		while(max>0)
		{
			System.out.println(a[end]);
			end--;
			max--;
		}
	}

	private static void kadane() {
		int[] arr = new int[]{-120, -202, -293, -60, -261, -67, 10, 82, -334, -393, -428, -182, -138, -167, -465, -347, -39, -51, -61, -491, -216, -36, -281, -361, -271, -368, -122, -114, -53, -488, -327, -182, -221, -381, -431, -161, -59, -494, -406, -298, -268, -425, -88, -320, -371, -5, 36, 89, -194, -140, -278, -65, -38, -144, -407, -235, -426, -219, 62, -299, 1, -454, -247, -146, 24, 2, -59, -389, -77, -19, -311, 18, -442, -186, -334, 41, -84, 21, -100, 65, -491, 94, -346, -412, -371, 89, -56, -365, -249, -454, -226, -473, 91, -412, -30, -248, -36, -95, -395, -74, -432, 47, -259, -474, -409, -429, -215, -102, -63, 80, 65, 63, -452, -462, -449, 87, -319, -156, -82, 30, -102, 68, -472, -463, -212, -267, -302, -471, -245, -165, 43, -288, -379, -243, 35, -288, 62, 23, -444, -91, -24, -110, -28, -305, -81, -169, -348, -184, 79, -262, 13, -459, -345, 70, -24, -343, -308, -123, -310, -239, 83, -127, -482, -179, -11, -60, 35, -107, -389, -427, -210, -238, -184, 90, -211, -250, -147, -272, 43, -99, 87, -267, -270, -432, -272, -26, -327, -409, -353, -475, -210, -14, -145, -164, -300, -327, -138, -408, -421, -26, -375, -263, 7, -201, -22, -402, -241, 67, -334, -452, -367, -284, -95, -122, -444, -456, -152, 25, 21, 61, -320, -87, 98, 16, -124, -299, -415, -273, -200, -146, -437, -457, 75, 84, -233, -54, -292, -319, -99, -28, -97, -435, -479, -255, -234, -447, -157, 82, -450, 86, -478, -58, 9, -500, -87, 29, -286, -378, -466, 88, -366, -425, -38, -134, -184, 32, -13, -263, -371, -246, 33, -41, -192, -14, -311, -478, -374, -186, -353, -334, -265, -169, -418, 63, 77, 77, -197, -211, -276, -190, -68, -184, -185, -235, -31, -465, -297, -277, -456, -181, -219, -329, 40, -341, -476, 28, -313, -78, -165, -310, -496, -450, -318, -483, -22, -84, 83, -185, -140, -62, -114, -141, -189, -395, -63, -359, 26, -318, 86, -449, -419, -2, 81, -326, -339, -56, -123, 10, -463, 41, -458, -409, -314, -125, -495, -256, -388, 75, 40, -37, -449, -485, -487, -376, -262, 57, -321, -364, -246, -330, -36, -473, -482, -94, -63, -414, -159, -200, -13, -405, -268, -455, -293, -298, -416, -222, -207, -473, -377, -167, 56, -488, -447, -206, -215, -176, 76, -304, -163, -28, -210, -18, -484, 45, 10, 79, -441, -197, -16, -145, -422, -124, 79, -464, -60, -214, -457, -400, -36, 47, 8, -151, -489, -327, 85, -297, -395, -258, -31, -56, -500, -61, -18, -474, -426, -162, -79, 25, -361, -88, -241, -225, -367, -440, -200, 38, -248, -429, -284, -23, 19, -220, -105, -81, -269, -488, -204, -28, -138, 39, -389, 40, -263, -297, -400, -158, -310, -270, -107, -336, -164, 36, 11, -192, -359, -136, -230, -410, -66, 67, -396, -146, -158, -264, -13, -15, -425, 58, -25, -241, 85, -82, -49, -150, -37, -493, -284, -107, 93, -183, -60, -261, -310, -380};
		int start=-1;
		int curr=0;
		int maxSum=-1;
		int end=-1;

		for(int i=0;i<arr.length;i++)

		{
			curr+=arr[i];
			if(curr>maxSum)
			{
				maxSum=curr;
				end=i;
			}
			if(curr<0)
				curr=0;

		}
		System.out.println(maxSum);
		System.out.println(end);
		while(maxSum>0)
		{
			System.out.println(arr[end]);
			maxSum-=arr[end];
			end--;
		}

	}

	private static void biggestNumber() {
		Integer[] arr = new Integer[]{3, 30, 34, 5, 9};

		List<Integer> num=		Arrays.stream(arr).collect(Collectors.toList());
		Collections.sort(num,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String a=o1.toString()+o2.toString();
				String b=o2.toString()+o1.toString();
				return b.compareTo(a);
			}
		});
		System.out.println(num);

	}

	private static void dutchFlag() {
		int[] arrn = new int[12];
		arrn[1] = 1;
		arrn[2] = 1;
		arrn[4] = 1;
		arrn[5] = 0;
		arrn[6] = 1;
		arrn[7] = 0;
		arrn[11] = 1;

		int mid=0,low=0,high=arrn.length-1;

		while(mid<=high)
		{
			if(arrn[mid]==1)
			{
				int temp=arrn[high];
				arrn[high]=arrn[mid];
				arrn[mid]=temp;
				high--;
			}
			else mid++;
		}
		System.out.println(Arrays.stream(arrn).boxed().collect(Collectors.toList()));

	}

}

