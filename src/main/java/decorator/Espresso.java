package decorator;

import decorator.utils.ProductsCosts;


/**
 * 
 * This is a concrete component (a coffee type)
 */
public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return ProductsCosts.ESPRESSO_COST;
	}
}
