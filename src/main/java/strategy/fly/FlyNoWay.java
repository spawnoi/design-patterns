package strategy.fly;

import utils.DuckActions;

public class FlyNoWay implements FlyBehavior {
	
	public String fly() {
		return DuckActions.FLY_NO_FLY;
	};
}
