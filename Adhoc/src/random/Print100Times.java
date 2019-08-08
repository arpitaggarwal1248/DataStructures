package random;

public class Print100Times {

	public static void main(String[] args) {
		print(5);

	}

	public static void print(int i) {
		if(i>0)
		{
			System.out.println("Arpit");
			print(--i);
		}
	}

}
