//The date is 17/01/24

public class Sandwich
{
	String mainIngredient;
	String breadType;
	double price;
	
	public void setMainIngredient(String mainI)
	{
		mainIngredient = mainI;
	}
	public void setBreadType(String breadT)
	{
		breadType = breadT;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getMainIngredient()
	{
		return mainIngredient;
	}
	public String getBreadType()
	{
		return breadType;
	}
	public double getPrice()
	{
		return price;
	}
}