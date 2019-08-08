package jav;

public class StaticBlock {

	private static void s()
	{
		System.out.println("static method");
	}
	public void concrete()
	{
		System.out.println("concrete");
	}
	static{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		
		StaticBlock st= new StaticBlock();
		st.concrete();
		s();
		
	}
}
