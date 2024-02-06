//The date is 06/02/2024

public class FiveDice
{
    public static void main(String[] args)
    {
        Die computer1 = new Die(); //Declaring ten objects seems very inefficient
        Die computer2 = new Die();
        Die computer3 = new Die();
        Die computer4 = new Die();
        Die computer5 = new Die();

        Die player1 = new Die();
        Die player2 = new Die();
        Die player3 = new Die();
        Die player4 = new Die();
        Die player5 = new Die();



        System.out.println("Rules for determining a winner:\nAny higher kind beats a smaller kind.");
        System.out.println("> Five of a kind\n> Four of a kind\n> Three of a kind\n> A pair");
        System.out.println("Each contestant will roll the dice 5 times.");
        System.out.println("Computer:" + "[" + computer1.getDIE_VALUE() + "],[" + computer2.getDIE_VALUE() + "],[" + computer3.getDIE_VALUE() +
                            "],[" + computer4.getDIE_VALUE() + "],[" + computer5.getDIE_VALUE() + "]");
        System.out.println("Player:" + "[" + player1.getDIE_VALUE() + "],[" + player2.getDIE_VALUE() + "],[" + player3.getDIE_VALUE() +
                "],[" + player4.getDIE_VALUE() + "],[" + player5.getDIE_VALUE() + "]");
    }
}