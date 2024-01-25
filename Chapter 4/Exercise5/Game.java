//The date is 25/01/24

public class Game
{
    Team participant1;
    int gameTime;

    Game(String highSchool, String sport, String teamName, int gameTime)    //Two team objects as parameters
    {
        this.participant1 = new Team(highSchool, sport, teamName);
        this.gameTime = gameTime;
    }

    public int getGameTime()
    {
        return gameTime;
    }

    public Team getParticipant1()
    {
        return participant1;
    }
}