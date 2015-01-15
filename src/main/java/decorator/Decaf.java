package decorator;

import decorator.utils.ProductsCosts;


/**
 * 
 * This is a concrete component (a coffee type)
 */
public class Decaf extends Beverage {

	public Decaf(){
		description = "Decaf Coffe";
	}
	
	@Override
	public double cost() {
		return ProductsCosts.DECAF_COST;
	}
}
