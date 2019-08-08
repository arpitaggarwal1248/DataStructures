package jav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClassA {

	static ClassA obj;

	// public static ClassC c= new ClassC();

	/*
	 * public ClassA() { System.out.println("Class A Constructor"); }
	 * 
	 * public void abc() { System.out.println("Class A method is running"); } public
	 * void test() { System.out.println("test of Class A is running"); }
	 * 
	 * static int count=0;
	 * 
	 * public static void main(String[] args) {
	 * 
	 * //int x=0;
	 * 
	 * for (int x =0; x < 10; x = x + 1) { System.out.println("x is now"+ x); }
	 * System.out.println("--------------"+x);
	 * 
	 * 
	 * }
	 */

	public void print()
	{
		System.out.println("running");
	}

	public static void main(String[] args) {
		int arr[]= {2 ,3 ,4 ,2 ,3 ,6 ,8 ,4 ,5};
		long arr1[]= {1 ,3 ,9 ,9 ,27 ,81};
		List<Integer> list1=Collections.nCopies(100000, 1237);
		List<Long> list2=list1.stream().mapToLong(Integer::intValue).boxed().collect(Collectors.toList());
		System.out.println(activityNotifications(arr,5));
	}

	static int activityNotifications(int[] expenditure, int d) {
		LinkedList<Integer> q=new LinkedList<Integer>();
		int notification=0;
		int start=0;
		List<Integer> medianList=getMedianList(expenditure,d);
		int ptr=0;
		for(int i=0+d;i<expenditure.length;i++)
		{

				if(expenditure[i]>=medianList.get(ptr))
					notification++;
				ptr++;
		}
		return notification;
	}

	private static List<Integer> getMedianList(int[] expenditure,int d) {
		List<Integer> list=new ArrayList<Integer>();
		LinkedList<Integer> q=new LinkedList<Integer>();
		int start=0;
		for(int i=0;i<expenditure.length;i++)
		{
			if(q.size()==d)
			{

				Collections.sort(q);
				int num=0;
				if(d%2==0)
				{
					num=q.get(d/2)+q.get(d/2+1)/2;
				}
				else
				{
					num=q.get(d/2);
				}
				list.add(2*num);
				q.removeFirstOccurrence(expenditure[start]);
				start++;
			}
			q.add(expenditure[i]);
		}
		return list;
	}

}
