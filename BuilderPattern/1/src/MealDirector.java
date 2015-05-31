/**
 * 
 * @author Roberto M
 * The "Director" class is the intermediary between the "Client" and the "Builder". 
 * This, in a restaurant context means, the Director is the cashier who receives petitions
 * from clients and passes it to kitchen staff (who are the builders here). 
 * Client(s) and their petitions are in our main().
 */
public class MealDirector {
	
	private MealBuilder mealbuilder = null;
	
	public MealDirector() {}
		
	public void constructMeal(MealBuilder mealbuilder) {
		this.mealbuilder = mealbuilder;
		mealbuilder.buildMainDish();
		mealbuilder.buildDrink();
		mealbuilder.buildDessert();	
	}
	
	public Meal getMeal() {
		return mealbuilder.getMeal();
	}
}