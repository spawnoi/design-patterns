package strategy.quack;

import strategy.utils.DuckActions;

public class MuteQuack implements QuackBehavior {
	
	public String quack() {
		return DuckActions.QUACK_MUTE;
	}

}
