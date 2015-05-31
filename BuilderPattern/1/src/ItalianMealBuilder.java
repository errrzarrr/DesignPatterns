
public class ItalianMealBuilder implements MealBuilder{
	private Meal meal;
	
	public ItalianMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildMainDish() {
		meal.setMainDish("Pasta dressed with Exquisite Tomato salsa");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Wine");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Riccotta Cheesecake");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}
