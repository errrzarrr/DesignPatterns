
public class ShapeFactory extends AbstractFactory {

	public Shape getShape(String chosenShape) {
		if (chosenShape == null){
			return null;
		}
		if(chosenShape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		else if("SQUARE".equalsIgnoreCase(chosenShape)){
			return new Square();
		}
		else if (chosenShape.equalsIgnoreCase("HEXAGON")){
			return new Hexagon();
		}
		return null;
		
	}
	
	public Color getColor(String chosenColor) {
		return null;
	}
	
}
