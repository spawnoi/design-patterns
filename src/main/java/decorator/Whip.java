package decorator;

import decorator.utils.ProductsCosts;

/**
 * This is a component decorator
 */
public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage; 
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	@Override
	public double cost() {
		return ProductsCosts.WHIP_COST + beverage.cost();
	}

}
