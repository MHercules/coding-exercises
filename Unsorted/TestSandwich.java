//The date is 17/01/24
//This is related to the Sandwich class, an exercise program

import java.util.Scanner;

public class TestSandwich
{
	public static void main(String[] args)
	{
		Sandwich yourOwn = new Sandwich();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your main ingredient: ");
		yourOwn.setMainIngredient(sc.nextLine());
		
		System.out.println("Enter your bread type: ");
		yourOwn.setBreadType(sc.nextLine());
		
		yourOwn.setPrice(5.99);
		yourOwn.getPrice();
		
		System.out.println("You wanted a " + yourOwn.getMainIngredient() + " sandwich with " + yourOwn.getBreadType() + " bread");
		System.out.println("The price would be " + yourOwn.getPrice());
	}
}
