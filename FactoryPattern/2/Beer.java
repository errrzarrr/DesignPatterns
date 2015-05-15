public class Beer implements Bottle {
	public int size;

	@Override
	public void fabricate() {
		System.out.println("A Beer bottle of " +this.getSize()+ " mL");
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
