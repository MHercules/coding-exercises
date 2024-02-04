//The date is 03/02/2024

public class PickTwoCards
{
    public static void main(String[] args)
    {
        final int CARDS_IN_SUIT = 13;
        int myValue;
        int yourValue;
        Card myCard = new Card();
        Card yourCard = new Card();
        myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        yourValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        myCard.setValueOfCard(myValue);
        yourCard.setValueOfCard(yourValue);
        myCard.setSuit('s'); //s for spades, h for hearts, d for diamonds, or c for clubs.
        yourCard.setSuit('d');

        System.out.println("You drew a " + yourCard.getValueOfCard() + " of " + yourCard.getSuit());
        System.out.println("I drew a " + myCard.getValueOfCard() + " of " + myCard.getSuit());
    }
}