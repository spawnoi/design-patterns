package decorator;

/**
 * This class is the abstract component
 *
 */
public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
