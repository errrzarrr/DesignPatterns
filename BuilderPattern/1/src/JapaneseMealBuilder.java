
public class JapaneseMealBuilder implements MealBuilder {
	private Meal meal;
	
	public JapaneseMealBuilder() {
		meal = new Meal();
	}
	
	@Override
	public void buildMainDish() {
		meal.setMainDish("Rice balls with Seaweed stripes with fish");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Sake");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Coffee Jelly");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}
