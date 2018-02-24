
public class Milk extends CoffeeDecorator{

	public Milk(Beverage newCoffee) {
		super(newCoffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 1.00;
	}

}
