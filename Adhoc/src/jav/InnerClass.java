package jav;

public class InnerClass  {
	

	public void xyz() {
		System.out.println("Top level Class method is running");
	}
	
	
	private static class MyInnerClass{
		
		private static void innerMethod()
		{
			System.out.println("Inner Class method is running");
			
		}
	}
	
	public static void main(String[] args) {
		
		
		InnerClass m= new InnerClass();
		InnerClass.MyInnerClass.innerMethod();
		m.xyz();
		}
}
