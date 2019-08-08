package selenium;

public class ShapeFactory {

/*	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}*/

	 
	   public Shape getShape(String shapeType){
	   
	      if(shapeType == null){
	         return null;
	      }		
	      
	       if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }

}
