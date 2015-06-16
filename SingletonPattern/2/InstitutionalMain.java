public class InstitutionalMain {

	public static void main(String[] args) {
		Institutional official = Institutional.getInstance();

		official.getMessage();

		System.out.println("");
		System.out.println("Greetings from our CEO: " +official.getCEOName());

		System.out.println(official.getInstitutionFormalName());
	}
}
