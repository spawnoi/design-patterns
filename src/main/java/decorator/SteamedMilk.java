package decorator;

import decorator.utils.ProductsCosts;

/**
 * This is a component decorator
 */
public class SteamedMilk extends CondimentDecorator{
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}
	
	@Override
	public double cost() {
		return ProductsCosts.STEAMED_MILK_COST + beverage.cost();
	}
}
