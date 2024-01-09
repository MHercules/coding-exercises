//The date is 09/01/24

import java.util.Scanner;

public class JobPricing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the name of the job >> ");
        String nameOfJob = sc.nextLine();

        System.out.println("Type in the cost of materials >> ");
        int costOfMaterials = sc.nextInt();

        System.out.println("Type in the number of hours worked >> ");
        int hoursWorked = sc.nextInt();

        System.out.println("Type in the number of hours traveled >> ");
        int hoursTraveled = sc.nextInt();

        System.out.println("The name of the job is " + nameOfJob);
        int jobEstimate = estimateOfJob(costOfMaterials, hoursWorked, hoursTraveled);
        System.out.println("The estimated cost of the job would be R" + jobEstimate);
    }
    
	public static int estimateOfJob(int costOfMaterials, int hoursWorked, int hoursTraveled)
    {
        return costOfMaterials + (hoursWorked * 35) + (hoursTraveled * 12);
    }
}