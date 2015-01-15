package factory;

import factory.utils.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		if (type.equals(PizzaType.CHEESE)) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals(PizzaType.VEGGIE)) {
			return new ChicagoStyleVeggiePizza();
		} else if (type.equals(PizzaType.CLAM)) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals(PizzaType.PEPPERONI)) {
			return new ChicagoStylePepperoniPizza();
		} else
			return null;

	}
}