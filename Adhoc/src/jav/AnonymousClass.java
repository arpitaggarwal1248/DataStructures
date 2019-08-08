package jav;

/**
 * 
 *
 */
public class AnonymousClass {

	public static void main(String[] args) {
		IAnonymousInterface anm=new IAnonymousInterface() {
			@Override
			public void age() {
				System.out.println(x);
				System.out.println("this is running");
			}
		};
		anm.age();

	}


}
