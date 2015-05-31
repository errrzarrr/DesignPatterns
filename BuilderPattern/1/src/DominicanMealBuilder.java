
public class DominicanMealBuilder implements MealBuilder {
	private Meal meal;
	
	public DominicanMealBuilder() {
		meal = new Meal();
	}
		
	@Override
	public void buildMainDish() {
		meal.setMainDish("Chicken Breast with Tostones");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Ron");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Dulce de leche");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}