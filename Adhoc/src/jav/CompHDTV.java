package jav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CompHDTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		HDTV hd = new HDTV(40, "Samsung");
		HDTV hd1= new HDTV(50, "Sony");
		HDTV hd2= new HDTV(42, "Panasonic");
		
		List<HDTV> arr = new ArrayList<>();
		arr.add(hd);
		arr.add(hd1);
		arr.add(hd2);
		
		Iterator<HDTV> it= arr.iterator();
		while(it.hasNext())
		{
			HDTV count= it.next();
			System.out.println(count.getBrand()+"--"+count.getSize());
		}
		
		
	}

}
