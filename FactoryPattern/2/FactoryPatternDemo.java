public class FactoryPatternDemo {
	public static void main(String[] args) {
		BottleFactory bottleFactory = new BottleFactory();

		Bottle jackDaniels = bottleFactory.setType("Whisky");
		jackDaniels.setSize(750);
		jackDaniels.fabricate();

		Bottle Presidente = bottleFactory.setType("Beer");
		Presidente.setSize(300);
		Presidente.fabricate();

		Bottle h2oDrop = bottleFactory.setType("water");
		h2oDrop.setSize(1000);
		h2oDrop.fabricate();
	}
}
