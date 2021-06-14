package Arrays;

public class ArrayManipulation {

	 public static void main(String[] args) {
	        int[][] arr = new int[][]{{1, 2, 100}
	        , {2, 5, 100}
	        , {3, 4, 100}};
	        int[][] arr1 = new int[][]{{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};
	        int[][] arr2 = new int[][]{{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};
	        long sa = ArrayManipulation.arrayManipulation(10, arr);
	        System.out.println(sa);
	    }

	    private static long arrayManipulation(int n, int[][] queries) {
	        long[] temp = new long[n + 1];
	        long[] res = new long[temp.length];
	        int row = queries.length;
	        for (int i = 0; i < row; ++i) {
	            int start = queries[i][0];
	            int end = queries[i][1] + 1;
	            int num = queries[i][2];
	            long[] arrl = temp;
	            int n2 = start - 1;
	            arrl[n2] = arrl[n2] + (long)num;
	            long[] arrl2 = temp;
	            int n3 = end - 1;
	            arrl2[n3] = arrl2[n3] - (long)num;
	        }
	        long max = 0L;
	        for (int i = 0; i < res.length; ++i) {
	            if (i == 0) {
	                res[i] = temp[i];
	                continue;
	            }
	            res[i] = temp[i] + res[i - 1];
	            if (max >= res[i]) continue;
	            max = res[i];
	        }
	        return max;
	    }
}
