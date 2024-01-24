//The date is 24/01/2024

import java.util.Scanner;

public class TestTeam
{
    public static void main(String[] args)
    {
        Team team1 = new Team("", "", "");  //Empty quotation marks signifies null values, basically placeholders.
        Team team2 = new Team("John Hopkins", "Basketball", "Hopkins Panthers");
        Team team3 = new Team("Sherry High", "Golf", "Old Brown");

        setTeamData(team1); //Using object as argument to set variable value to own values
        display(team1);
        //display(team2);
        //display(team3);
    }

    public static void setTeamData(Team t)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the name of the school: ");
        t.highSchool = sc.nextLine();

        System.out.println("Type in the name of the sport: ");
        t.sport = sc.nextLine();

        System.out.println("Type in the name of the team: ");
        t.teamName = sc.nextLine();
    }

    public static void display(Team t)
    {
        System.out.println("The name of the high-school is:" + t.getHighSchool() + ".\nThey mostly play " + t.getSport()
                            + ".\nThe name of their team is: " + t.getTeamName() + "\n" + Team.MOTTO);
    }
}