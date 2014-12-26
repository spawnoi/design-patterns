package strategy.quack;

import utils.DuckActions;

public class MuteQuack implements QuackBehavior {
	
	public String quack() {
		return DuckActions.QUACK_MUTE;
	}

}
