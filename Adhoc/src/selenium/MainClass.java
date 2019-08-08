package selenium;

public class MainClass {

	public static void main(String[] args) {
		
		//AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape=new ShapeFactory().getShape("Square");
		shape.draw();
	}
}

