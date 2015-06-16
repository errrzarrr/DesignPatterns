public class Institutional {
	private static Institutional instance = null;
	private static String CEOName = "Roberto";
	private static final String institutionFormalName = "RM Global Software company";

	private Institutional() {}

	public static Institutional getInstance() {
		if (instance == null) {
			instance = new Institutional();
		}
		return instance;
	}

	public void getMessage() {
		System.out.println("OFFICIAL: This is the official institutional message.");
	}

	public String getCEOName() {
		return CEOName;
	}

	public String getInstitutionFormalName() {
		return institutionFormalName;
	}
}
