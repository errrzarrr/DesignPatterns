import java.lang.CloneNotSupportedException;

/*	Represents an object which takes considerable amount of time to instantiate,
*	as a query to a database or operations through the net.
*/


public class DataBaseSimulation implements DataBaseSimulationInterface {

	public String[][] getUsersTable() {
		String[][] s = {
						{"User_ID",	"UserName"},
						{"01",		"EclipseMars"}, 
						{"02",		"EclipseLuna"},
						{"03",		"JuanMataUnited"},
					};
		return s;
	}

	public String[][] getClientsTable() {
		String[][] s = {
						{"Client_ID", "ClientName"},
						{"001", "La Masia"}, 
						{"002", "FC Barca"},
						{"003", "Tiki-Taka FC School"},
						{"004", "Dominicana Academy"},
					};
		return s;
	}

	public String[][] getProductsTable() {
		String[][] s = {
						{"Product_ID",	"ProductName"},
						{"001",			"Football"},
						{"002",			"Team Jersey"},
						{"003",			"Sweat pants"},
						{"004",			"Team Short Pants"},
						{"005",			"Goalkeeper Gloves"},
					};
		return s;
	}

	public void copyTables(String dbName) throws InterruptedException {
		switch(dbName) {
			case "USERS_TABLE":
				tD.randomSleep();
				break;
			case "CLIENTS_TABLE":
				tD.randomSleep();
				break;
			case "PRODUCTS_TABLE":
				tD.randomSleep();
				break;
			case "SALES_TABLE":
				tD.randomSleep();
				break;
		}
	}

	public int timeTaken(){
		return TimeDelaySimulation.randomNum;
	}

	public Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch (CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return clone;
	}
}
