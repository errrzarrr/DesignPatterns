
public class UsaMealBuilder implements MealBuilder {

	private Meal meal;
	
	public UsaMealBuilder() {
		meal = new Meal();
	}
	
	@Override
	public void buildMainDish() {
		meal.setMainDish("5B's: BBQ Big Bold Beef");
		
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Sugary Soda Drink");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Apple Pie");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
