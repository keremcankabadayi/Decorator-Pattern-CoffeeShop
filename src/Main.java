
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage basicCoffee = new Soya(new Mocha(new Whip(new Decaf())));
		
		System.out.println("Ingredients: " + basicCoffee.getDescription());
		System.out.println("Total Cost: $" + basicCoffee.getCost());
	}

}
