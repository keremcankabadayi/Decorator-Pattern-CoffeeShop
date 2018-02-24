
public class Soya extends CoffeeDecorator {

	public Soya(Beverage newCoffee) {
		super(newCoffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Soya";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + .70;
	}


}
