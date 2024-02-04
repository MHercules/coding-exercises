//The date is 03/02/2024

public class Card
{
    char suit; //s for spades, h for hearts, d for diamonds, or c for clubs.
    int valueOfCard; //1 to 13

    public char getSuit()
    {
        return suit;
    }

    public void setSuit(char suit)
    {
        this.suit = suit;
    }

    public int getValueOfCard()
    {
        return valueOfCard;
    }

    public void setValueOfCard(int valueOfCard)
    {
        this.valueOfCard = valueOfCard;
    }
}