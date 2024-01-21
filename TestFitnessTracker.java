//The date is 21/01/2024
//This is the main class of the FitnessTracker class

import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        FitnessTracker exercise1 = new FitnessTracker();

        System.out.println("The exercise performed is: " + exercise1.getTypeOfActivity());
        System.out.println("The number of minutes exercised: " + exercise1.getNumberOfMinutes());
        System.out.println("The date was: " + exercise1.getDateNow());

        System.out.print("\nType in name of the exercise >> " );
        String ex = sc.nextLine();

        System.out.print("Type in minutes exercised >> " );
        int min = sc.nextInt();
        sc.nextLine();

        System.out.println("Type in the date(yy, mm, dd) >> " );
        LocalDate ld = LocalDate.of(sc.nextInt(),sc.nextInt(), sc.nextInt() );


        FitnessTracker exercise2 = new FitnessTracker(ex, min, ld);
        System.out.println("\nThe exercise performed is: " + exercise2.getTypeOfActivity());
        System.out.println("The number of minutes exercised: " + exercise2.getNumberOfMinutes());
        System.out.println("The date was: " + exercise2.getDateNow());
    }
}