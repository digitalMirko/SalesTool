
public class Main {

	public static void main(String[] args) {

		SalesData data = new SalesData();
		// calls simply method down below
		
		displayGreeting();
		// calls data.display for SalesData file content
		data.display();		
	}
	
	
	// simple method 
	private static void displayGreeting() {
		System.out.println("Hello there to all the happy sales people");
		System.out.println("This app shows people sales data");
	}
}
