package factory;

import org.junit.Test;

import factory.utils.PizzaType;

public class FactoryTest {

	@Test
	public void simpleTest(){
		System.out.println("****************");
		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyCheese = nyStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + nyCheese.getName());
		
		System.out.println("****************");
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		Pizza chicagoCheese = chicagoStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + chicagoCheese.getName());
		
	}
}
