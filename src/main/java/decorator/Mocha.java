package decorator;

import decorator.utils.ProductsCosts;

/**
 * This is a component decorator
 */
public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	@Override
	public double cost() {
		return ProductsCosts.MOCHA_COST + beverage.cost();
	}
}
