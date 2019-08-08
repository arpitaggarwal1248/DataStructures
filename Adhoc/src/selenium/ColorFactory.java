package selenium;

public class ColorFactory {

	   Color getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      
	      return null;
	   }
}
