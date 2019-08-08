package selenium1;

public class HomeFactory {

	 public HomePage getHomePage(String platform){
		   
	      if(platform == null){
	         return null;
	      }		
	      
	       if(platform.equalsIgnoreCase("Android")){
	         return new HomePageAndroid();
	         
	      }else if(platform.equalsIgnoreCase("ios")){
	         return new HomePageIOS();
	      }
	      
	      return null;
	   }
	 
}
