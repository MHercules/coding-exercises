//The date is 05/01/24
/*To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 
10 times the student’s grade point average. In other words, a student with a 3.2 grade point average receives a 
$32 credit. Create a class that prompts a student for a name and grade point average and then passes the values 
to a method that displays a descriptive message. The message uses the student’s name, echoes the grade point 
average, and computes and displays the credit. Save the application as BookstoreCredit.java*/

import java.util.Scanner;

public class BookstoreCredit
{
	public static void main(String[] args)
	{
		String name;
		double gradeAvg;
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name >> ");
		name = sc.nextLine();
		System.out.print("What is your grade average(if decimal, enter with a comma e.g 5,25) >> ");
		gradeAvg = sc.nextDouble();
		displayCredit(name, gradeAvg);
		
	}
	public static void displayCredit(String nme, double avg)
	{
		double credits = avg*10;
		System.out.println("Congratulations " + nme +", you have been awarded with book credits worth 10 times your grade average.\n" 
							+ "Your grade average was " + avg + ", which brings your bookstore credit to $" + credits);
	}
}
