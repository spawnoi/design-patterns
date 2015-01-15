package strategy.quack;

import strategy.utils.DuckActions;

public class Squeak implements QuackBehavior {
	
	public String quack() {
		return DuckActions.QUACK_SQUEACK;
	}

}
