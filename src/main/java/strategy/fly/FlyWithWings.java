package strategy.fly;

import strategy.utils.DuckActions;

public class FlyWithWings implements FlyBehavior {

	public String fly() {
		return DuckActions.FLY_WINGS;
	}

}
