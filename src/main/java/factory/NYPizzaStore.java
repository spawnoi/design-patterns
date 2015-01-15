package factory;

import factory.utils.PizzaType;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		if (type.equals(PizzaType.CHEESE)) {
			return new NYStyleCheesePizza();
		} else if (type.equals(PizzaType.VEGGIE)) {
			return new NYStyleVeggiePizza();
		} else if (type.equals(PizzaType.CLAM)) {
			return new NYStyleClamPizza();
		} else if (type.equals(PizzaType.PEPPERONI)) {
			return new NYStylePepperoniPizza();
		} else
			return null;

	}
}
