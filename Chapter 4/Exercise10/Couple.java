//The date is 03/02/2024

public class Couple
{
    Person bride;
    Person groom;

    Couple(Person br, Person gr)
    {
        bride = br;
        groom = gr;
    }

    public Person getBride()
    {
        return bride;
    }

    public Person getGroom()
    {
        return groom;
    }
}