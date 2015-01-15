package decorator;

import decorator.utils.ProductsCosts;


/**
 * 
 * This is a concrete component (a coffee type)
 */
public class DarkRoast extends Beverage {

	public DarkRoast(){
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return ProductsCosts.DARK_ROAST_COST;
	}
}
