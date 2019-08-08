package jav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort3 {

	public static void main(String args[]){  
		  
		ArrayList<JavaComp> al=new ArrayList<JavaComp>();  
		al.add(new JavaComp(101,"Vijay",23));  
		al.add(new JavaComp(106,"Ajay",21));  
		al.add(new JavaComp(109,"Jai",22));  
		al.add(new JavaComp(108,"Jain",22));  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			JavaComp st=(JavaComp)itr.next();  
		System.out.println(st.rollno+""+st.name+""+st.age);  
		  }  
		}  
}
