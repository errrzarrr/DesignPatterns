
public class Meal {
		private String mainDish;
		private String drink;
		private String dessert;
		
		public String getMainDish(){
			return mainDish;
		}
		public String getDrink(){
			return drink;
		}
		public String getDessert(){
			return dessert;
		}
		
		public void setMainDish(String mainDish) {
			this.mainDish = mainDish;
		}
		public void setDrink(String drink) {
			this.drink = drink;
		}
		public void setDessert(String dessert) {
			this.dessert = dessert;
		}
		
		@Override
		public String toString() {
			return "You ordered " + this.getMainDish() + " as main dish \n" 
					+ this.getDrink() + " for drinking \n"
					+ "and later for dessert an exquisite " + this.getDessert() + "\n\n";
		}		
}
