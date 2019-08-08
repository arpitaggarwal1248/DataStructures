package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashLearn {
	

	public static void main(String[] args) {
		String a="rachel joe joe phoeby monica chandler ross rachel rachel monica phoeby chandler joe ross ross joe chandler monica rachel rachel";
		String arr[]=a.split(" ");
		Map<String, Integer> map= new HashMap<>();
		TreeMap<String, Integer> map1= new TreeMap<>();
		//add in map 
		for(String u:arr)
		{
			if(map.containsKey(u))
				map.put(u, map.get(u)+1);
			else
				map.put(u, 1);
		}
		
		//print map
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		//sort map on basis of value 
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet()); 
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if(o1.getValue().equals(o2.getValue()))
					return o1.getKey().compareTo(o2.getKey());
				else
					return o2.getValue().compareTo(o1.getValue());
				
			}
		});
		System.out.println("(((((((((((((((");
		Collections.sort(list, new MyHashComaparator());
		for(Map.Entry<String, Integer> entry:list){
			System.out.println(entry.getKey()+" ==== "+entry.getValue());
		}
		 
		
	}

}
