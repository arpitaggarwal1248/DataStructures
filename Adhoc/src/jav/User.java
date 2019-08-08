package jav;

public class User {

	public   User(int Id) {
		ID=Id;
	}
	
	private int ID;
	
	public void setId(int Id)
	
	{
		ID=Id;
	}
	
	public int getId()
	{
		return ID;
	}
	


	public static void main(String[] args) {
	final	 User user= new User(23);
		user.getId();
		user.setId(45);
	/*	user.setId(45);
		System.out.println(user.getId());*/
		
		//Not allowed
		//user=new User(12);
	}
}
