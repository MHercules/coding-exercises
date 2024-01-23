//The date is 23/01/2024

public class Team
{
    String highSchool;
    String sport;
    String teamName;

    public static final String MOTTO = "Sportsmanship!";

    Team(String highSchool, String sport, String teamName)  //Constructor that takes parameters from each field
    {
        this.highSchool = highSchool;
        this.sport = sport;
        this.teamName = teamName;
    }
    public String getHighSchool()
    {
        return highSchool;
    }

    public String getSport()
    {
        return sport;
    }

    public String getTeamName()
    {
        return teamName;
    }
}