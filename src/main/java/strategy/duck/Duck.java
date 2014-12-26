package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	/**
	 * Executes the specific duck fly strategy
	 */
	public String performFly(){
		return flyBehavior.fly();
	}

	/**
	 * Executes the specific duck quack strategy
	 */
	public String performQuack(){
		return quackBehavior.quack();
	}
	
	/**
	 * Publishes another method (mandatory implementation for all ducks)
	 * @return
	 */
	public abstract String display();
	
	/**
	 * Changes the fly strategy/behavior on runtime
	 * @param flyBehavior
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	/**
	 * Changes the quack strategy/behavior on runtime
	 * @param quackBehavior
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
	
}
