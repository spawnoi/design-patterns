package strategy.quack;

import utils.DuckActions;

public class Squeak implements QuackBehavior {
	
	public String quack() {
		return DuckActions.QUACK_SQUEACK;
	}

}
