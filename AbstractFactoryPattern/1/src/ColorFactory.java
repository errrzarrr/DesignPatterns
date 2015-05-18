	
public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String chosenShape) {
		return null;
	}

	@Override
	Color getColor(String chosenColor) {
		
		switch(chosenColor.toUpperCase()){
			case "BLUE":{
				return new Blue();
			}
			case "RED":{
				return new Red();
			}
			case "GREEN": return new Green();
			default: return null;
		}
	}
	
}
