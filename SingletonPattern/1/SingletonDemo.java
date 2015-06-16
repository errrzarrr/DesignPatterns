public class SingletonDemo {
	public static void main(String[] args) {
		Singleton unique = Singleton.getInstance();
		Singleton stillUnique = Singleton.getInstance();		

		unique.action();
		stillUnique.action();
	}
}
