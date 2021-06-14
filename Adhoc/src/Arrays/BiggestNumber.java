/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  Arrays.BiggestNumber
 *  Arrays.BiggestNumber$1
 */
package Arrays;

import Arrays.BiggestNumber;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Exception performing whole class analysis.
 */
public class BiggestNumber {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 30, 34, 5, 9};
        List<Integer> a = Arrays.asList(arr);
        String num = new BiggestNumber().largestNumber(a);
        System.out.println(num);
    }

    public String largestNumber(List<Integer> a) {
    	Comparator<Integer> list=(Integer i1,Integer i2)-> {
    		String a2=i1.toString()+i2.toString();
			String b=i2.toString()+i1.toString();
			return b.compareTo(a2);
    	};
        Collections.sort(a, list);
        		StringBuilder sb = new StringBuilder();
        for (int r : a) {
            sb.append(r);
        }
        return sb.toString().replaceAll("0", "").length() == 0 ? "0" : sb.toString();
    }
}

