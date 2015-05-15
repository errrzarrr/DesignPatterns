public class Whisky implements Bottle {
	public int size;

	@Override
	public void fabricate() {
		System.out.println("A "+ this.getSize() +" mL Bottle of Whisky");
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}
}
