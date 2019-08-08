package jav;

public class EqualsAndEqual {
	
	
	public static void main(String[] args) {
		
		String a="arpit";
		String b="arpit";
		String c= new String("arpit");
		String d= new String("arpit").intern();
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
		System.out.println(a==d);
		System.out.println(a.equals(d));
	}

	

}
