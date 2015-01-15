package decorator;

import decorator.utils.ProductsCosts;

/**
 * This is a component decorator
 */
public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return ProductsCosts.SOY_COST + beverage.cost();
	}
}
