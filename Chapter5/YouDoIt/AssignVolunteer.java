//The date is 08/02/2024

import java.util.Scanner;

public class AssignVolunteer2
{
	public static void main(String[] args)
	{
		int clothingCode = 1;
		int otherCode = 2;
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Is the donation clothing or other?\nType '1' for clothing and '2' for other.");
		input = sc.nextInt();
		
		if(input == 1)
		{
			System.out.println("Regina will help you.");
		}
		else
		{
			System.out.println("Marco will help you.");
		}
	}
}