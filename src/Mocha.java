
public class Mocha extends CoffeeDecorator {

	public Mocha(Beverage newCoffee) {
		super(newCoffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Mocha";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + .50;
	}


}
