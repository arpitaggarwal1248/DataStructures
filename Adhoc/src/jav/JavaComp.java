package jav;

public class JavaComp implements Comparable{

	int rollno;  
	String name;  
	int age;  
	JavaComp(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		JavaComp st=(JavaComp)o;  
		System.out.println(age+"--"+st.age);
		/*	if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  */
		
		if(age==st.age)  
		{
			if(rollno>st.rollno)
				return 1;
			else
				return -1;
		} 
			else if(age>st.age)  
			return 1;  
			else  
			return -1;

	}
}
