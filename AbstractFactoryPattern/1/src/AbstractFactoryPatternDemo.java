
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		
		Shape morph;
		Shape circle1 = shapeFactory.getShape("Circle");		
		circle1.draw();
		
		Shape hex = shapeFactory.getShape("HEXAGON");
		hex.draw();
		
		morph = shapeFactory.getShape("Square");
		morph.draw();
		
		morph = shapeFactory.getShape("Circle");
		morph.draw();
		
		Color red = colorFactory.getColor("RED");
		red.fill();
	}
}
