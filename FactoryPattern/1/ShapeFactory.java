public class ShapeFactory {
	
	public Shape setShape(String shapeType)  {
		
		if (shapeType == null) {
			return null	;
		} else if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();	
		}		
		return null;
	}
}
