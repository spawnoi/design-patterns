package strategy;

import org.junit.Assert;
import org.junit.Test;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;
import strategy.utils.DuckActions;

public class StrategyTest {

	@Test
	public void mallardDuckTest() {
		// Creating the Mallard Duck (Quack / FlyWithWings)
		Duck mallard = new MallardDuck();
		Assert.assertEquals("Mallard duck must Quack", DuckActions.QUACK_QUACK,
				mallard.performQuack());
		Assert.assertEquals("Mallard duck must FlyWithWings",
				DuckActions.FLY_WINGS, mallard.performFly());

	}

	@Test
	public void modelDuckTest() {
		// Creating the Model Duck (Quack / FlyNoWay)
		Duck model = new ModelDuck();
		Assert.assertEquals("Model duck must Quack", DuckActions.QUACK_QUACK,
				model.performQuack());
		Assert.assertEquals("Model duck must FlyNoWay",
				DuckActions.FLY_NO_FLY, model.performFly());
	}

	@Test
	public void strategyOnRuntimeTest() {
		Duck mallard = new MallardDuck();
		
		Assert.assertEquals("Mallard duck must Quack", DuckActions.QUACK_QUACK,
				mallard.performQuack());
		Assert.assertEquals("Mallard duck must FlyWithWings",
				DuckActions.FLY_WINGS, mallard.performFly());
		
		//Now, we change the strategies (behaviors) of the Mallard duck
		
		//Now, this duck can't fly
		mallard.setFlyBehavior(new FlyNoWay());
		//and also can't quack
		mallard.setQuackBehavior(new MuteQuack());
		
		Assert.assertEquals("Mallard duck now can't Quack", DuckActions.QUACK_MUTE,
				mallard.performQuack());
		Assert.assertEquals("Mallard duck now can't FlyNoWay",
				DuckActions.FLY_NO_FLY, mallard.performFly());
		
	}

}
