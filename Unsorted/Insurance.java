//The date is 09/01/24

import java.util.Scanner;

public class Insurance
{

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Type in the current year >> ");
            int currentYear = sc.nextInt();

            System.out.print("Type in your birth year >> ");
            int birthYear = sc.nextInt();
            int age = currentYear - birthYear;
            int premium = calculatePremium(currentYear, birthYear);

            System.out.println("You are " + age + " years old. " + "\nWhich would bring your premium to $" + premium + ".");
        }
        public static int calculatePremium(int currentYear, int birthYear)
        {
            int age = currentYear - birthYear;
            int decades = age/10;
            return (decades + 15) * 20;
        }
}
