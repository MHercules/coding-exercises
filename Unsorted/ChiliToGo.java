//The date is 11/12/23
/*The Huntington Boys and Girls Club is conducting a fundraiser by selling chili dinners to go. The price 
is $7 for an adult’s meal and $4 for a child’s meal. Write a program that accepts the number of each type 
of meal ordered, and display the total money collected for adults’ meals, children’s meals, and all meals. 
Save the program as ChiliToGo.java*/

import java.util.Scanner;

public class ChiliToGo
{
	public static void main(String[] args)
	{
		final int ADULT_MEAL_PRICE = 7;
        final int KIDDIE_MEAL_PRICE = 4;
        int adultMealsOrdered;
        int kiddieMealsOrdered;
        int totalAdultsMeal;
        int totalKiddieMeal;
        int total;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many Adult meals? ");
        adultMealsOrdered = sc.nextInt();
        System.out.print("How many Kiddie meals? ");
        kiddieMealsOrdered = sc.nextInt();
        
		totalAdultsMeal = adultMealsOrdered*ADULT_MEAL_PRICE;
        totalKiddieMeal = kiddieMealsOrdered*KIDDIE_MEAL_PRICE;
        total = totalAdultsMeal+totalKiddieMeal;

        System.out.println("You ordered " + adultMealsOrdered + " adult meal(s) for a total of $" + totalAdultsMeal);
        System.out.println("You ordered " + kiddieMealsOrdered + " kiddie meal(s) for a total of $" + totalKiddieMeal);
        System.out.println("You ordered " + adultMealsOrdered + " adult meal(s) and " + kiddieMealsOrdered +
                " kiddie meal(s) for a grand total of $" + total);
	}
}
