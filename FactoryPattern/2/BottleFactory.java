public class BottleFactory {
	public Bottle setType(String type) {
		if(type.equalsIgnoreCase("Beer")) {
			return new Beer();
		} else if (type.equalsIgnoreCase("Whisky")) {
			return new Whisky();
		} else if (type.equalsIgnoreCase("Water")) {
			return new Water();
		}
		return null;
	}
}
