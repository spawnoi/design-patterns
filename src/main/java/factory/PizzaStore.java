package factory;

public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	/**
	 * The specific stores must implement this method.
	 * @param type
	 * @return
	 */
	public abstract Pizza createPizza(String type);
}
