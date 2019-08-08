package jav;

import java.lang.reflect.InvocationTargetException;

public class JavaObjects {

	public void print()
	{
		System.out.println("Priting..");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		JavaObjects obj1=JavaObjects.class.getConstructor().newInstance();
		obj1.print();

		JavaObjects obj2=(JavaObjects)Class.forName("jav.JavaObjects").newInstance();
		obj2.print();

		JavaObjects obj3= new JavaObjects();
		obj3.print();
	}

}
