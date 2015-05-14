import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) {
			
		ShapeFactory shapeFactory= new ShapeFactory();
				
		Shape ball = shapeFactory.setShape("CIRCLE");
		Shape triangle = shapeFactory.setShape("TRIANGLE");
		Shape poliformic = shapeFactory.setShape("SQUARE");
		Shape userShape = shapeFactory.setShape("");
		
		ball.draw();
		triangle.draw();
	
		System.out.print("poliformic: ");
		poliformic.draw();
				
		poliformic = shapeFactory.setShape("CIRCLE");	
		System.out.print("poliformic: ");
		poliformic.draw();
				
		do {
			System.out.print("\nEnter a shape [Circle, Square or Triangle]  to draw, [X] to quit: ");
			
			@SuppressWarnings("resource")
			Scanner userInputScanner = new Scanner(System.in);
			GLOBAL.userInput = (String) userInputScanner.nextLine();
			
			userShape = shapeFactory.setShape(GLOBAL.userInput);
			
			try {
				userShape.draw();				
			} catch(NullPointerException e) {
				break;
			}				
			
		} while (GLOBAL.userInput != "X");
		
		System.out.println("Quiting...");
	}
}
