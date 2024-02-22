//Same program as the QuartztoGallons one but interactive

import java.util.Scanner;
public class QuartsToGallonsInteractive
{
	public static void main(String[] args)
	{
        final int QUARTZ_IN_GALLON = 4;
        int quartzNeeded;
        int gallonsNeeded;
        int quartzLeft;
		Scanner sc = new Scanner(System.in);

        System.out.print("How many quartz is needed >> ");
        quartzNeeded = sc.nextInt();

        gallonsNeeded = quartzNeeded/QUARTZ_IN_GALLON;
        quartzLeft= quartzNeeded%QUARTZ_IN_GALLON;

        System.out.println("A job that needs " + quartzNeeded + " quartz requires " + gallonsNeeded + " gallons plus "
                + quartzLeft + " quartz");

	}
}
