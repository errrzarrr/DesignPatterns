public class Main  {

	public static void printUsersTable(String[][] usersTable) {
		for(int i = 0; i < usersTable.length; i++) {
			System.out.println();
			for(int j = 0; j < usersTable[0].length; j++) {
				System.out.print(usersTable[i][j] + "\t|\t");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) 
			throws InterruptedException, 
			CloneNotSupportedException {

		DataBaseSimulation db = new DataBaseSimulation();
		String[][] usersTable;

		System.out.println("Copying database:" + "\n");

		System.out.print("\t"+"Copying USERS_TABLE table... ");
		db.copyTables("USERS_TABLE");
		System.out.println("Table copy created! (took " + db.timeTaken() + " mSecs)" + "\n");

		System.out.print("\t"+"Copying CLIENTS_TABLE table... ");
		db.copyTables("CLIENTS_TABLE");
		System.out.println("Table copy created! (took " + db.timeTaken() + " mSecs)" + "\n");

		System.out.print("\t"+"Copying PRODUCTS_TABLE table... ");
		db.copyTables("PRODUCTS_TABLE");
		System.out.println("Table copy created! (took " + db.timeTaken() + " mSecs)" + "\n");

		usersTable = db.getUsersTable();
		printUsersTable(usersTable);

		System.out.println("\n" + "A local database clone: ");
		DataBaseSimulation dbCopy = (DataBaseSimulation) db.clone();
		String[][] usersTableCopy = dbCopy.getUsersTable();
		printUsersTable(usersTableCopy);



	}
}
