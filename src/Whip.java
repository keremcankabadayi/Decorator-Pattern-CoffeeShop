
public class Whip extends CoffeeDecorator {

	public Whip(Beverage newCoffee) {
		super(newCoffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Whip";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 1.00;
	}


}
