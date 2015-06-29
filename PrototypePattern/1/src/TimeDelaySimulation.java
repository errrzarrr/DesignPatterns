import java.util.Random;

public class TimeDelaySimulation {
	protected static int randomNum;

	private int randInt() {
		int	min = 400,
			max = 3500;
	    Random rand = new Random();

	    randomNum = 0;
	    randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}

	public void randomSleep() throws InterruptedException {
		try {
			Thread.sleep(randInt());
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
