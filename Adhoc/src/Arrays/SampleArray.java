/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.SampleArray
 */
package Arrays;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Exception performing whole class analysis ignored.
 */
public class SampleArray {
    static int[] tower = new int[]{1, 5, 2, 3, 1, 7, 2};

    public static void main(String[] args) {
        int[] arrn = new int[12];
        arrn[1] = 1;
        arrn[2] = 1;
        arrn[4] = 1;
        arrn[5] = 2;
        arrn[6] = 1;
        arrn[7] = 2;
        arrn[11] = 1;
        int[] arr = arrn;
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            int tmp;
            if (arr[mid] == 0) {
                tmp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = tmp;
                ++low;
                ++mid;
                continue;
            }
            if (arr[mid] == 1) {
                ++mid;
                continue;
            }
            if (arr[mid] != 2) continue;
            tmp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = tmp;
            --high;
        }
        for (int u : arr) {
            System.out.println(u);
        }
    }

    private static void rotateArray(int[] arr, int k) {
        int D = SampleArray.gcd((int)arr.length, (int)k);
        int pos = -1;
        int n = arr.length;
        for (int i = 0; i < D; ++i) {
            int j = i;
            int temp = arr[i];
            while ((pos = (j + k) % n) != i) {
                arr[j] = arr[pos];
                j = pos;
            }
            arr[j] = temp;
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return SampleArray.gcd((int)b, (int)(a % b));
    }

    private static int findPivot(int[] arr, int low, int high) {
        if (high <= low) {
            return arr.length - 1;
        }
        int mid = (low + high) / 2;
        if (low < mid && arr[mid - 1] > arr[mid]) {
            return mid - 1;
        }
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (low < mid) {
            return SampleArray.findPivot((int[])arr, (int)(mid + 1), (int)high);
        }
        return SampleArray.findPivot((int[])arr, (int)low, (int)(mid - 1));
    }

    private static void max0and1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxlen = -1;
        int end = -1;
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] == 0 ? -1 : 1;
        }
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; ++i) {
            if ((sum += arr[i]) == 0) {
                maxlen = i + 1;
                end = i;
            }
            if (map.containsKey(sum + n)) {
                if (maxlen >= i - (Integer)map.get(sum + n)) continue;
                maxlen = i - (Integer)map.get(sum + n);
                end = i;
                continue;
            }
            map.put(sum + n, i);
        }
        System.out.println(end - maxlen + 1);
        System.out.println(end);
    }

    private static void maxProduct(int[] arr) {
        int min = 1;
        int max = 1;
        int biggie = -1;
        int end = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                min = 1;
                max = 1;
            } else if (arr[i] > 0) {
                max *= arr[i];
                min = Math.min(arr[i] * min, 1);
            } else if (arr[i] < 0) {
                int temp = max;
                max = Math.max(min * arr[i], 1);
                min = temp * arr[i];
            }
            if (max <= biggie) continue;
            biggie = max;
            end = i;
        }
        System.out.println(biggie);
        System.out.println(end);
        while (end != -1 && arr[end] != 0) {
            System.out.println(arr[end]);
            biggie /= arr[end];
            --end;
        }
    }

    private static void reverseInGroup(int[] arr, int k) {
        if (k < 1) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            for (int right = i + k - 1 > n - 1 ? n - 1 : i + k - 1; left < right; ++left, --right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            System.out.println("chala");
        }
    }

    private static void permute(ArrayList<Integer> a, int k) {
        int n = a.size();
        if (n == k) {
            System.out.println(a);
        } else {
            for (int i = k; i < n; ++i) {
                SampleArray.swap(a, (int)k, (int)i);
                SampleArray.permute(a, (int)(k + 1));
                SampleArray.swap(a, (int)k, (int)i);
            }
        }
    }

    private static void swap(ArrayList<Integer> a, int k, int i) {
        int temp = a.get(k);
        a.set(k, a.get(i));
        a.set(i, temp);
    }

    private static void permute(String a, String sub) {
        int n = a.length();
        if (n == 0) {
            System.out.println(sub);
        } else {
            for (int i = 0; i < n; ++i) {
                SampleArray.permute((String)(String.valueOf(a.substring(0, i)) + a.substring(i + 1)), (String)(String.valueOf(sub) + a.charAt(i)));
            }
        }
    }
}

