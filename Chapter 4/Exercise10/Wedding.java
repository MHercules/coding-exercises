//The date is 03/02/2024

import java.time.*;

public class Wedding
{
    LocalDate dateOfWedding;
    Couple married;
    String location;

    Wedding(LocalDate dateOfWedding, Couple c1, String location)
    {
        this.dateOfWedding = dateOfWedding;
        married = c1;
        this.location = location;
    }

    public LocalDate getDateOfWedding()
    {
        return dateOfWedding;
    }

    public Couple getMarried()
    {
        return married;
    }

    public String getLocation()
    {
        return location;
    }
}