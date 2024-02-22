//The date is 21/01/2024

import java.time.LocalDate;

public class FitnessTracker
{
    private String typeOfActivity;
    private int numberOfMinutes;
    private LocalDate dateNow;

    FitnessTracker()
    {
        typeOfActivity = "running";
        numberOfMinutes = 0;
        dateNow = LocalDate.of(LocalDate.now().getYear(), 1, 1);
    }

    FitnessTracker(String typeOfActivity, int numberOfMinutes, LocalDate dateNow)
    {
        this.typeOfActivity = typeOfActivity;
        this.numberOfMinutes = numberOfMinutes;
        this.dateNow = dateNow;
    }

    public String getTypeOfActivity()
    {
        return typeOfActivity;
    }

    public int getNumberOfMinutes()
    {
        return numberOfMinutes;
    }

    public LocalDate getDateNow()
    {
        return dateNow;
    }
}
