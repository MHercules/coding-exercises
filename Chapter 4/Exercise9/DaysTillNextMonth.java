//The date is 31/01/2024

import java.util.Scanner;
import java.time.*;

public class DaysTillNextMonth
{
    public static void main(String[] args)
    {
        daysTillNextMonth();
    }

    public static void tillNextMonth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = sc.nextInt();

        System.out.print("Enter a month:");
        int month = sc.nextInt();

        System.out.print("Enter a day:");
        int day = sc.nextInt();

        LocalDate dateEntered = LocalDate.of(year, month, day);
        System.out.println("The date you entered was:" + dateEntered);
        
        int daysInMonth = dateEntered.lengthOfMonth();
        int dayOfMonthEntered = dateEntered.getDayOfMonth();
        int daysLeft = daysInMonth - dayOfMonthEntered;

        System.out.println("There are " + daysLeft + " days left until " + dateEntered.plusMonths(1).getMonth() + " starts.");
    }
}