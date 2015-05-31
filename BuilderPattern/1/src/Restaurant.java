
public class Restaurant {

	public static void main(String[] args) {
		
		Meal[] meals = new Meal[5];
		
		MealDirector cashier = new MealDirector();
		
		MealBuilder italianMeal = new ItalianMealBuilder();
		cashier.constructMeal(italianMeal);		
		meals[0] = cashier.getMeal();
		System.out.println(meals[0]);
		
		MealBuilder dominicanMeal = new DominicanMealBuilder();
		cashier.constructMeal(dominicanMeal);
		meals[1] = cashier.getMeal();
		System.out.println(meals[1]);
		
		MealBuilder spanishTourist = new SpanishMealBuilder();
		cashier.constructMeal(spanishTourist);
		meals[2] = cashier.getMeal();
		
		MealBuilder japaneseDish = new JapaneseMealBuilder();
		cashier.constructMeal(japaneseDish);
		meals[3] = cashier.getMeal();
		
		System.out.println( meals[2].toString());
		System.out.println( meals[3]);
		
		MealBuilder american = new UsaMealBuilder();
		cashier.constructMeal(american);
		meals[4] = cashier.getMeal();
		System.out.println(meals[4]);
	}
}
