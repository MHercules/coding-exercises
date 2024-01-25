//The date is 25/01/24

import java.util.Scanner;

public class TestGame
{
    public static void main(String[] args)
    {
        Game game1 = new Game("", "", "", 7);

        setTeamData(game1);
        display(game1);
    }

    public static void setTeamData(Game g1)
    {
        Scanner sc = new Scanner(System.in);
        Team t = g1.getParticipant1();

        System.out.println("Type in the name of the school: ");
        t.highSchool = sc.nextLine();

        System.out.println("Type in the name of the sport: ");
        t.sport = sc.nextLine();

        System.out.println("Type in the name of the team: ");
        t.teamName = sc.nextLine();
    }

    public static void display(Game g1)
    {
        Team t = g1.getParticipant1();

        System.out.println(t.getHighSchool() + "'s " + t.getSport() + " team, " + t.getTeamName() + ", will be playing at " + g1.getGameTime());
    }
}