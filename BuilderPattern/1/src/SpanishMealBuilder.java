
public class SpanishMealBuilder implements MealBuilder {

	private Meal meal;
	
	public SpanishMealBuilder() {
		meal = new Meal();
	}

	@Override
	public void buildMainDish() {
		meal.setMainDish("Paella Valenciana");
		
	}

	@Override
	public void buildDrink() {
		meal.setDrink("Sidra Asturiana");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Turrón de Yema de Huevo");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}

}
