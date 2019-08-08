package random;

public class Solution1 {
	//
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int d=3;
		int n=arr.length;
		int ele=5;
		int out[]=	rotate(arr,n,d);
		printArray(out);
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		rotateOptimize(arr,n,d);
		printArray(out);
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		int pos=findPivot(arr,0,arr.length-1);
		if(pos==arr.length-1)
		{
			System.out.println("Array is sorted");
		}
		System.out.println(pos);
		if(arr[pos]==ele)
			System.out.println("Found at pos: "+ pos);
		if(arr[0]<=ele)
		{
			System.out.println("Found at pos: "+ search(arr,0,pos-1,ele));
		}
		else
		System.out.println("Found at pos: "+search(arr,pos+1,arr.length-1,ele));
	}



	private static int search(int[] arr, int low, int high, int ele) {
			if (high < low)
				return -1;
			int mid=(low+high)/2;
			if(ele==arr[mid])
				return mid;
			else if (arr[mid]<ele)
				return search(arr, mid+1, high, ele);
			else
				return search(arr, low, mid-1, ele);
		}



		static int findPivot(int arr[], int low, int high)
		{
			// base cases
			if (high < low)  
				return -1;
			if (high == low) 
				return low;

			/* low + (high - low)/2; */
			int mid = (low + high)/2;   
			if (mid < high && arr[mid] > arr[mid + 1])
				return mid;
			if (mid > low && arr[mid] < arr[mid - 1])
				return (mid-1);
			if (arr[low] >= arr[mid])
				return findPivot(arr, low, mid-1);
			return findPivot(arr, mid + 1, high);
		}



		private static void findElement(int[] arr, int ele) {

		}



		private static void rotateOptimize(int[] arr, int n, int d) {
			int j,k,temp;
			for(int i=0;i<gcd(d,n);i++)
			{
				j=i;
				temp=arr[i];

				while(true)
				{
					k=(j+d)%n;
					if(k==i)
						break;
					arr[j]=arr[k];
					j=k;
				}
				arr[j]=temp;
			}

		}



		private static int gcd(int a, int b) {
			if(b==0)
				return a;
			else
				return gcd(b, a%b);
		}



		private static void printArray(int[] out) {
			for(int i=0;i<out.length;i++)
				System.out.println(out[i]);
		}



		private static int[] rotate(int[] arr, int n, int k) {

			int out[] =new int[n];
			for(int i=0;i<n;i++)
			{
				int pos=(i+(n-(k%n)))%n;
				out[pos]=arr[i];
			}
			return out;
		}
	}

