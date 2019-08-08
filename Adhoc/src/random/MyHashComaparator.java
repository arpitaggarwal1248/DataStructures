package random;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashComaparator implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		if(o1.getValue()==o2.getValue())
			return o1.getKey().compareTo(o2.getKey());
		else
		return (o2.getValue().compareTo(o1.getValue()));
			
	}



}
