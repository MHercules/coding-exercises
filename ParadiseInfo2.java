//The date is 19/12/23

import javax.swing.*;

public class ParadiseInfo2
{
	
	public static void main(String[] args)
	{
		double discount;
		double price;
		double savings;
		
		price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a cutoff price for discount."));
		discount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter discount rate as a whole number."));
		
		displayInfo();
		savings = computeDiscountInfo(price, discount);
		showSpecials(price, discount, savings);
	}
	
	public static void displayInfo()
	{
		JOptionPane.showMessageDialog(null, "Paradise spa wants to pamper you.");
		JOptionPane.showMessageDialog(null, "We will make you look good.");
	}
	
	public static double computeDiscountInfo(double price, double discountRate)
	{
		double savings;
		savings = price * discountRate/100;
		return savings;
	}
	
	public static void showSpecials(double price, double discount, double savings)
    {
        JOptionPane.showMessageDialog(null, "Special this week on any service over " + price);
        JOptionPane.showMessageDialog(null, "Discount of " + discount + "%");
        JOptionPane.showMessageDialog(null, "That's a savings of at least $" + savings);
    }
	
}