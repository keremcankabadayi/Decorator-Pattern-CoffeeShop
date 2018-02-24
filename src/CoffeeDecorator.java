
public class CoffeeDecorator implements Beverage {

	protected Beverage tempCoffee;
	
	public CoffeeDecorator(Beverage newCoffee) {
		// TODO Auto-generated constructor stub
		
		this.tempCoffee = newCoffee;
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempCoffee.getDescription();
	}
	
	public double getCost() {
		return tempCoffee.getCost();
	}
	
}
