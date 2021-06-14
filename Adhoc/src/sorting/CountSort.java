package sorting;

public class CountSort {

	public static void main(String[] args) {
        int[] a = new int[]{1, 4, 9, 1, 2, 7, 5, 2};
        int[] c = new int[100];
        int[] output = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            int[] arrn = c;
            int n = a[i];
            arrn[n] = arrn[n] + 1;
        }
        int count = 0;
        for (int k = 0; k < 10; ++k) {
            c[k] = count += c[k];
        }
        for (int l = 0; l < a.length; ++l) {
            output[c[a[l]] - 1] = a[l];
            int[] arrn = c;
            int n = a[l];
            arrn[n] = arrn[n] - 1;
        }
        for (int j = 0; j < a.length; ++j) {
            System.out.println(output[j]);
        }
    }
}
