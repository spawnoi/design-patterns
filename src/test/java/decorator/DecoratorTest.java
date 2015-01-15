package decorator;

import org.junit.Assert;
import org.junit.Test;

import decorator.utils.ProductsCosts;

public class DecoratorTest {

	/**
	 * Simple test. Espresso without condiments (decorators)
	 */
	@Test
	public void espressoTest(){
		Beverage beverage = new Espresso();
		
		printResume(beverage, ProductsCosts.ESPRESSO_COST);

		Assert.assertEquals(ProductsCosts.ESPRESSO_COST, beverage.cost(), 0);
	}
	
	/**
	 * Test applying decorators. Dark Roast coffee with double Mocha and Whip
	 */
	@Test
	public void darkRoastMochaMochaWhip(){
		Beverage beverage = new DarkRoast();
		
		//Applying the condiments (wrapping with decorators) 
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		double expectedCost = ProductsCosts.DARK_ROAST_COST + ProductsCosts.MOCHA_COST + ProductsCosts.MOCHA_COST + ProductsCosts.WHIP_COST;
		
		printResume(beverage, expectedCost);
		
		Assert.assertEquals(expectedCost, beverage.cost(), 0);

	}
	
	/**
	 * Test applying decorators. House Blend coffee with Soy, Mocha and Whip
	 */
	@Test
	public void houseBlendSoyMochaWhip(){
		Beverage beverage = new HouseBlend();
		
		//Applying the condiments (wrapping with decorators) 
		beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		double expectedCost = ProductsCosts.HOUSE_BLEND_COST + ProductsCosts.SOY_COST + ProductsCosts.MOCHA_COST + ProductsCosts.WHIP_COST;
		
		printResume(beverage, expectedCost);
		
		Assert.assertEquals(expectedCost, beverage.cost(), 0);
	}
	
	/**
	 * Prints a simple resume of the expected and real cost of the coffee
	 * @param beverage
	 * @param expectedCost
	 */
	private void printResume(Beverage beverage, double expectedCost){
		System.out.println("*********************************");
		System.out.println("Coffee: " + beverage.getDescription());
		System.out.println("Expected Cost: " + expectedCost);
		System.out.println("Coffee Cost: " + beverage.cost());
		System.out.println("*********************************");

	}
}
