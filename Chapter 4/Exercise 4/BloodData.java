//The date is 22/01/2024

public class BloodData
{
    private String bloodType; // Blood types are O, A, B, AB
    private String rhFactor; // "+" and "-"

    BloodData() //This a default constructor that sets fields to certain values
    {
        bloodType = "O";
        rhFactor = "+";
    }

    BloodData(String bloodType, String rhFactor)    //Overloaded constructor that takes in parameters
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void setBloodType(String bloodType)      //Get and Set methods for the fields
    {
        this.bloodType = bloodType;
    }
    public void setRhFactor(String rhFactor)
    {
        this.rhFactor = rhFactor;
    }

    public String getBloodType()
    {
        return bloodType;
    }
    public String getRhFactor()
    {
        return  rhFactor;
    }
}