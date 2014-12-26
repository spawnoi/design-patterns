package strategy.quack;

import utils.DuckActions;

public class Quack implements QuackBehavior {

	public String quack() {
		return DuckActions.QUACK_QUACK;
	}

}
