import java.lang.CloneNotSupportedException;

public interface DataBaseSimulationInterface extends Cloneable {
	TimeDelaySimulation tD = new TimeDelaySimulation();

	public String[][] getUsersTable();

	public String[][] getClientsTable();

	public String[][] getProductsTable();

	public void copyTables(String dbName) throws InterruptedException;

	public int timeTaken();

	public Object clone() throws CloneNotSupportedException;
}
