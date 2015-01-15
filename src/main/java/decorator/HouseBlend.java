package decorator;

import decorator.utils.ProductsCosts;


/**
 * 
 * This is a concrete component (a coffee type)
 */
public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return ProductsCosts.HOUSE_BLEND_COST;
	}

}
